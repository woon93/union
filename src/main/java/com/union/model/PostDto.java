package com.union.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString()
public class PostDto extends PostDtoKey {
    private String postUserId;

    private String postTitle;

    private String postContent;

    private String postStatus;

    private Date insertTime;

    private Date updateTime;

    private Integer updateCnt;

    public String getPostUserId() {
        return postUserId;
    }

    public void setPostUserId(String postUserId) {
        this.postUserId = postUserId == null ? null : postUserId.trim();
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus == null ? null : postStatus.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateCnt() {
        return updateCnt;
    }

    public void setUpdateCnt(Integer updateCnt) {
        this.updateCnt = updateCnt;
    }
}