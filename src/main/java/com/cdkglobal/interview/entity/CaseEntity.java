package com.cdkglobal.interview.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Date;


public class CaseEntity {
    @JsonProperty("CaseNumber")
    private String caseNumber;
    @JsonProperty("Subject")
    private String subject;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("CreatedDate")
    private Date createdDate;
    @JsonProperty("LastModifiedDate")
    private Date lastModifiedDate;
    @JsonProperty("Owner")
    private OwnerEntity owner;
    @JsonProperty("Contact")
    private ContactEntity contact;
    @JsonProperty("Priority")
    private String priority;
    @JsonProperty("Product")
    private String product;
    @JsonProperty("ProductGroup")
    private String productGroup;
    @JsonProperty("Impact")
    private String impact;
    @JsonProperty("Severity")
    private String severity;
    @JsonProperty("VIP")
    private String VIP;
    @JsonProperty("Comments")
    private List<CommentEntity> comments;

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public OwnerEntity getOwner() {
        return owner;
    }

    public void setOwner(OwnerEntity owner) {
        this.owner = owner;
    }

    public ContactEntity getContact() {
        return contact;
    }

    public void setContact(ContactEntity contact) {
        this.contact = contact;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }
}
