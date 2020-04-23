package com.cdkglobal.interview.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class CommentEntity {
    @JsonProperty("CommentBody")
    private String commentBody;
    @JsonProperty("CommentDate")
    private Date commentDate;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("Id")
    private String id;


    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
