package com.union.model;

public class CommentDtoKey {
    private String commentId;

    private Integer commentSeq;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public Integer getCommentSeq() {
        return commentSeq;
    }

    public void setCommentSeq(Integer commentSeq) {
        this.commentSeq = commentSeq;
    }
}