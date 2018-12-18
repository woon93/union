package com.union.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString()
public class PostDtoKey {
    private String postId;

    private Integer postSeq;

    private String postCommentId;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public Integer getPostSeq() {
        return postSeq;
    }

    public void setPostSeq(Integer postSeq) {
        this.postSeq = postSeq;
    }

    public String getPostCommentId() {
        return postCommentId;
    }

    public void setPostCommentId(String postCommentId) {
        this.postCommentId = postCommentId == null ? null : postCommentId.trim();
    }
}