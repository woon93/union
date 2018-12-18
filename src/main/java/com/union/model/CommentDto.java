package com.union.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString()
public class CommentDto extends CommentDtoKey {
    private String commentUserId;

    private String commentContent;

    private String commentStatus;

    private Date insertTime;

    private Date updateTime;

    private Integer updateCnt;

    public String getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId == null ? null : commentUserId.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
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