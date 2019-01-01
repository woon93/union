package com.union.service;

import com.union.dao.CommentDtoMapper;
import com.union.dao.PostDtoMapper;
import com.union.model.*;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service(value = "postService")
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDtoMapper postDtoMapper;
    @Autowired
    private CommentDtoMapper commentDtoMapper;
    @Autowired
    private ArticleService articleService;

    @Override
    /*
     * 新增帖子
     * 发帖时，新帖内容记录在贴表(跟帖的场合写在另一个方法
     */
    public int creatPost(String userId, String title, String preview, String content) throws Exception {
        //  插入用Example
        PostDto postDto = new PostDto();
        // 贴子ID
        String postId = this.getUptoDateId();
        postDto.setPostId(postId);
        // 楼层
        postDto.setPostSeq(0);
        // 发表者
        postDto.setPostUserId(userId);
        // 评论ID
        postDto.setPostCommentId(null);
        // 标题
        postDto.setPostTitle(title);
        // 内容预览
        postDto.setPostContent(Utils.subString(preview, 200, "left"));
        // 状态
        postDto.setPostStatus("0");
        // 创建时间
        postDto.setInsertTime(new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse("20181231 20:10:50"));
        // 更新时间
        postDto.setUpdateTime(new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse("20181231 20:10:50"));
        // 更新回数
        postDto.setUpdateCnt(0);
        // 帖子标签
        postDto.setPostTag(null);

        // 往文章表里插入数据
        ArticleDto newArticle = new ArticleDto();
        // 文章ID
        newArticle.setArticleId(postId);
        // 文章内容
        newArticle.setArticleContent(content);
        // 创建时间
        newArticle.setInsertTime(new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse("20181231 20:10:50"));
        // 更新回数
        newArticle.setUpdateCnt(0);
        // 更新时间
        newArticle.setUpdateTime(new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse("20181231 20:10:50"));
        int number = articleService.createArticle(newArticle);

        // 文章表插入成功后再插入帖子表
        if(number > 0){
            return postDtoMapper.insertSelective(postDto);
        }
        return 0;
    }

    /*
     * 新增回复（作为新的楼层
     */
    public int addReplytoPost(UserDto userDto, String postId, String content) throws Exception {
        //  插入用Example
        PostDtoExample postDtoExample = new PostDtoExample();
        PostDtoExample.Criteria criteria = postDtoExample.createCriteria();
        PostDto postDto = new PostDto();
        // 贴子ID
        postDto.setPostId(postId);
        // 楼层
        int currentSeq = this.getPostSeq(postId);
        postDto.setPostSeq(currentSeq);
        // 发表者
        postDto.setPostUserId(userDto.getUserId());
        // 评论ID
        postDto.setPostCommentId(postId + Utils.leftPadding(String.valueOf(currentSeq), 4, "0"));
        // 标题
        postDto.setPostTitle(null);
        // 内容
        postDto.setPostContent(content);
        // 状态
        postDto.setPostStatus("0");
        // 创建时间
        postDto.setInsertTime(new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse("20181230 20:10:50"));
        // 更新时间
        postDto.setUpdateTime(new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse("20181230 20:10:50"));
        // 更新回数
        postDto.setUpdateCnt(0);
        // 帖子标签
        postDto.setPostTag(null);

        return postDtoMapper.insertSelective(postDto);
    }

    /*
     * 新增回复（作为新的楼层
     */
    public int addReplytoComment(UserDto userDto, String postCommentId, String content) throws Exception {
        //  插入用Example
        CommentDtoExample commentDtoExample = new CommentDtoExample();
        CommentDtoExample.Criteria criteria = commentDtoExample.createCriteria();
        CommentDto commentDto = new CommentDto();
        // 评论ID
        commentDto.setCommentId(postCommentId);
        // 评论编号
        int currentSeq = this.getCommentSeq(postCommentId);
        commentDto.setCommentSeq(currentSeq);
        // 评论者
        commentDto.setCommentUserId(userDto.getUserId());
        // 内容
        commentDto.setCommentContent(content);
        // 状态
        commentDto.setCommentStatus("0");
        // 创建时间
        commentDto.setInsertTime(new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse("20181230 20:10:50"));
        // 更新时间
        commentDto.setUpdateTime(new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse("20181230 20:10:50"));
        // 更新回数
        commentDto.setUpdateCnt(0);
        // 帖子ID
        commentDto.setPostId(postCommentId.substring(0, 5));
        // 我觉得这两个可以不要
        // 帖子标题
        commentDto.setPostName(null);
        // 评论者名
        commentDto.setPostName(null);

        return commentDtoMapper.insertSelective(commentDto);
    }

    /*
     *
     *  指定【用户】的帖子
     *  按【逆序】取帖子。
     *  要过滤，只要楼层等于【0】的。（楼层大于等于【1】的都属于跟帖）
     */
    public List<PostDto> getPostList(@NonNull UserDto userDto) {
        //  Mybatis Example Initial
        PostDtoExample postDtoExample = new PostDtoExample();
        PostDtoExample.Criteria criteria = postDtoExample.createCriteria();
        // 【KEY】
        criteria.andPostUserIdEqualTo(userDto.getUserId());
        criteria.andPostSeqEqualTo(0);
        // 【SORT】
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("INSERT_TIME DESC");
        postDtoExample.setOrderByClause(sortKey.toString());
        //  excute Mapper
        List<PostDto> PostDtoList = postDtoMapper.selectByExample(postDtoExample);
        if (PostDtoList == null) {
            PostDtoList = new ArrayList<>();
        }
        return PostDtoList;
    }

    /*
     * 按时间【逆序】取帖子。
     * 要过滤，只要楼层等于【0】的。（楼层大于等于【1】的都属于跟帖）
     */
    public List<PostDto> getCurrentPostList() {
        //  Mybatis Example Initial
        PostDtoExample postDtoExample = new PostDtoExample();
        PostDtoExample.Criteria criteria = postDtoExample.createCriteria();
        // 【KEY】
        criteria.andPostSeqEqualTo(0);
        // 【SORT】
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("INSERT_TIME DESC");
        postDtoExample.setOrderByClause(sortKey.toString());
        //  excute Mapper
        List<PostDto> PostDtoList = postDtoMapper.selectByExample(postDtoExample);
        if (PostDtoList == null) {
            PostDtoList = new ArrayList<>();
        }
        return PostDtoList;
    }

    /*
     * 按【postId】删除帖子
     */
    @Override
    public int deletePostByPostId(@NonNull PostDto targetPostDto, @NonNull UserDto controllerUser) {
        // 验证controllerUser的权限 TODO
        if (StringUtils.equals("管理员的ID是多少？", controllerUser.getUserIdentity())) {
            PostDtoExample deletePost = new PostDtoExample();
            PostDtoExample.Criteria criteria = deletePost.createCriteria();
            // 用postId作为检索条件
            criteria.andPostIdEqualTo(targetPostDto.getPostId());
            return postDtoMapper.deleteByExample(deletePost);
        }
        return 0;
    }

    /*
     * 按【userId】删除帖子
     */
    @Override
    public int deletePostByUserId(@NonNull PostDto targetPostDto, @NonNull UserDto controllerUser) {
        // 验证controllerUser的权限 TODO
        if (StringUtils.equals("管理员的ID是多少？", controllerUser.getUserIdentity())) {
            // 先检索这个用户有发过哪些帖子
            UserDto paramDto = new UserDto();
            paramDto.setUserId(targetPostDto.getPostUserId());
            List<PostDto> getPostList = this.getPostList(paramDto);
            // 用stream流，把检索到的Bean List 里的postId拿出来，做成delete方法的List<String>型参数
            List<String> postIdList = getPostList.stream().map(p -> p.getPostId()).collect(Collectors.toList());
            PostDtoExample deletePost = new PostDtoExample();
            PostDtoExample.Criteria criteria = deletePost.createCriteria();
            // 用mybatis封装的【and*In】方法进行批量删除
            criteria.andPostIdIn(postIdList);
            return postDtoMapper.deleteByExample(deletePost);
        }
        return 0;
    }

    /*
     * 按【insertTime】(时间为闭区间)删除帖子
     */
    @Override
    public int deletePostByTime(@NonNull UserDto controllerUser, @NonNull Date fromTime, @NonNull Date toTime) {
        // 验证controllerUser的权限 TODO
        if (StringUtils.equals("管理员的ID是多少？", controllerUser.getUserIdentity())) {
            PostDtoExample deletePost = new PostDtoExample();
            PostDtoExample.Criteria criteria = deletePost.createCriteria();
            // 用mybatis封装的【and*TimeBetween】方法进行批量删除
            criteria.andInsertTimeBetween(fromTime, toTime);
            return postDtoMapper.deleteByExample(deletePost);
        }
        return 0;
    }

    /*
     * 最新postId获取
     */
    private String getUptoDateId() {
        // id初始化
        int newPostId = 0;
        // 查询用参数
        PostDtoExample postExample = new PostDtoExample();
        PostDtoExample.Criteria criteria = postExample.createCriteria();
        // 排序
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("POST_ID DESC");
        postExample.setOrderByClause(sortKey.toString());
        // 查询执行
        List<PostDto> PostDtoList = postDtoMapper.selectByExample(postExample);
        if (PostDtoList != null && PostDtoList.size() != 0) {
            newPostId = Integer.parseInt(PostDtoList.get(0).getPostId()) + 1;
        } else {
            newPostId = 1;
        }
        // 返回6位的postID
        return Utils.leftPadding(String.valueOf(newPostId), 6, "0");
    }

    /*
     * 最新postSeq获取
     */
    private int getPostSeq(String postId) {
        //
        int seq = 0;
        // 查询用参数
        PostDtoExample postExample = new PostDtoExample();
        PostDtoExample.Criteria criteria = postExample.createCriteria();
        // 贴ID
        criteria.andPostIdEqualTo(postId);
        // 排序
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("POST_SEQ DESC");
        postExample.setOrderByClause(sortKey.toString());
        // 查询执行
        List<PostDto> PostDtoList = postDtoMapper.selectByExample(postExample);
        if (PostDtoList != null && PostDtoList.size() != 0) {
            seq = (PostDtoList.get(0).getPostSeq()) + 1;
        } else {
            seq = 1;
        }
        return seq;
    }

    /*
     * 最新commentSeq获取
     */
    private int getCommentSeq(String commentId) {
        //
        int seq = 0;
        // 查询用参数
        CommentDtoExample commentExample = new CommentDtoExample();
        CommentDtoExample.Criteria criteria = commentExample.createCriteria();
        // 贴ID
        criteria.andCommentIdEqualTo(commentId);
        // 排序
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("COMMENT_SEQ DESC");
        commentExample.setOrderByClause(sortKey.toString());
        // 查询执行
        List<CommentDto> cmmentDtoList = commentDtoMapper.selectByExample(commentExample);
        if (cmmentDtoList != null && cmmentDtoList.size() != 0) {
            seq = (cmmentDtoList.get(0).getCommentSeq()) + 1;
        } else {
            seq = 1;
        }
        return seq;
    }

    /*
     * 左侧补零
     * @param str 对象字符串
     * @param strLength 目标长度
     */
//    private String leftPaddingZero(String str,int strLength) {
//        int strLen =str.length();
//        if (strLen <strLength) {
//            while (strLen< strLength) {
//                StringBuffer sb = new StringBuffer();
//                sb.append("0").append(str); // 左补0
////              sb.append(str).append("0"); // 右补0
//                str= sb.toString();
//                strLen= str.length();
//            }
//        }
//        return str;
//    }


}
