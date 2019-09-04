/**
 * SupportCaseSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class SupportCaseSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assigned;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] awaitingReply;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] company;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] customerStage;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] escalatee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] helpDesk;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] inboundEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] issue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] issueNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastMessageDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastReopenedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] locked;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] module;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] origin;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priority;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] product;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] profile;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] stage;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] status;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public SupportCaseSearchRowBasic() {
    }

    public SupportCaseSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assigned,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] awaitingReply,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] company,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] contact,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] customerStage,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] escalatee,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] helpDesk,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] inboundEmail,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] issue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] issueNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastMessageDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastReopenedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] locked,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] module,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] origin,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priority,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] product,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] profile,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] stage,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] status,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.assigned = assigned;
        this.awaitingReply = awaitingReply;
        this.caseNumber = caseNumber;
        this.category = category;
        this.company = company;
        this.contact = contact;
        this.createdDate = createdDate;
        this.customerStage = customerStage;
        this.email = email;
        this.endDate = endDate;
        this.escalatee = escalatee;
        this.externalId = externalId;
        this.helpDesk = helpDesk;
        this.inboundEmail = inboundEmail;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.issue = issue;
        this.issueNumber = issueNumber;
        this.item = item;
        this.lastMessageDate = lastMessageDate;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReopenedDate = lastReopenedDate;
        this.locked = locked;
        this.module = module;
        this.origin = origin;
        this.priority = priority;
        this.product = product;
        this.profile = profile;
        this.serialNumber = serialNumber;
        this.stage = stage;
        this.startDate = startDate;
        this.status = status;
        this.subsidiary = subsidiary;
        this.title = title;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the assigned value for this SupportCaseSearchRowBasic.
     * 
     * @return assigned
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this SupportCaseSearchRowBasic.
     * 
     * @param assigned
     */
    public void setAssigned(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assigned) {
        this.assigned = assigned;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAssigned(int i) {
        return this.assigned[i];
    }

    public void setAssigned(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.assigned[i] = _value;
    }


    /**
     * Gets the awaitingReply value for this SupportCaseSearchRowBasic.
     * 
     * @return awaitingReply
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAwaitingReply() {
        return awaitingReply;
    }


    /**
     * Sets the awaitingReply value for this SupportCaseSearchRowBasic.
     * 
     * @param awaitingReply
     */
    public void setAwaitingReply(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] awaitingReply) {
        this.awaitingReply = awaitingReply;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAwaitingReply(int i) {
        return this.awaitingReply[i];
    }

    public void setAwaitingReply(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.awaitingReply[i] = _value;
    }


    /**
     * Gets the caseNumber value for this SupportCaseSearchRowBasic.
     * 
     * @return caseNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this SupportCaseSearchRowBasic.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseNumber) {
        this.caseNumber = caseNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCaseNumber(int i) {
        return this.caseNumber[i];
    }

    public void setCaseNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.caseNumber[i] = _value;
    }


    /**
     * Gets the category value for this SupportCaseSearchRowBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SupportCaseSearchRowBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category) {
        this.category = category;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the company value for this SupportCaseSearchRowBasic.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCompany() {
        return company;
    }


    /**
     * Sets the company value for this SupportCaseSearchRowBasic.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] company) {
        this.company = company;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCompany(int i) {
        return this.company[i];
    }

    public void setCompany(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.company[i] = _value;
    }


    /**
     * Gets the contact value for this SupportCaseSearchRowBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this SupportCaseSearchRowBasic.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] contact) {
        this.contact = contact;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getContact(int i) {
        return this.contact[i];
    }

    public void setContact(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.contact[i] = _value;
    }


    /**
     * Gets the createdDate value for this SupportCaseSearchRowBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SupportCaseSearchRowBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }


    /**
     * Gets the customerStage value for this SupportCaseSearchRowBasic.
     * 
     * @return customerStage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCustomerStage() {
        return customerStage;
    }


    /**
     * Sets the customerStage value for this SupportCaseSearchRowBasic.
     * 
     * @param customerStage
     */
    public void setCustomerStage(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] customerStage) {
        this.customerStage = customerStage;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCustomerStage(int i) {
        return this.customerStage[i];
    }

    public void setCustomerStage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.customerStage[i] = _value;
    }


    /**
     * Gets the email value for this SupportCaseSearchRowBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SupportCaseSearchRowBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email) {
        this.email = email;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the endDate value for this SupportCaseSearchRowBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SupportCaseSearchRowBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }


    /**
     * Gets the escalatee value for this SupportCaseSearchRowBasic.
     * 
     * @return escalatee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEscalatee() {
        return escalatee;
    }


    /**
     * Sets the escalatee value for this SupportCaseSearchRowBasic.
     * 
     * @param escalatee
     */
    public void setEscalatee(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] escalatee) {
        this.escalatee = escalatee;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEscalatee(int i) {
        return this.escalatee[i];
    }

    public void setEscalatee(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.escalatee[i] = _value;
    }


    /**
     * Gets the externalId value for this SupportCaseSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SupportCaseSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the helpDesk value for this SupportCaseSearchRowBasic.
     * 
     * @return helpDesk
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getHelpDesk() {
        return helpDesk;
    }


    /**
     * Sets the helpDesk value for this SupportCaseSearchRowBasic.
     * 
     * @param helpDesk
     */
    public void setHelpDesk(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] helpDesk) {
        this.helpDesk = helpDesk;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getHelpDesk(int i) {
        return this.helpDesk[i];
    }

    public void setHelpDesk(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.helpDesk[i] = _value;
    }


    /**
     * Gets the inboundEmail value for this SupportCaseSearchRowBasic.
     * 
     * @return inboundEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getInboundEmail() {
        return inboundEmail;
    }


    /**
     * Sets the inboundEmail value for this SupportCaseSearchRowBasic.
     * 
     * @param inboundEmail
     */
    public void setInboundEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] inboundEmail) {
        this.inboundEmail = inboundEmail;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getInboundEmail(int i) {
        return this.inboundEmail[i];
    }

    public void setInboundEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.inboundEmail[i] = _value;
    }


    /**
     * Gets the internalId value for this SupportCaseSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SupportCaseSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the isInactive value for this SupportCaseSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SupportCaseSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the issue value for this SupportCaseSearchRowBasic.
     * 
     * @return issue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this SupportCaseSearchRowBasic.
     * 
     * @param issue
     */
    public void setIssue(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] issue) {
        this.issue = issue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getIssue(int i) {
        return this.issue[i];
    }

    public void setIssue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.issue[i] = _value;
    }


    /**
     * Gets the issueNumber value for this SupportCaseSearchRowBasic.
     * 
     * @return issueNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this SupportCaseSearchRowBasic.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] issueNumber) {
        this.issueNumber = issueNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getIssueNumber(int i) {
        return this.issueNumber[i];
    }

    public void setIssueNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.issueNumber[i] = _value;
    }


    /**
     * Gets the item value for this SupportCaseSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this SupportCaseSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item) {
        this.item = item;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the lastMessageDate value for this SupportCaseSearchRowBasic.
     * 
     * @return lastMessageDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastMessageDate() {
        return lastMessageDate;
    }


    /**
     * Sets the lastMessageDate value for this SupportCaseSearchRowBasic.
     * 
     * @param lastMessageDate
     */
    public void setLastMessageDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastMessageDate(int i) {
        return this.lastMessageDate[i];
    }

    public void setLastMessageDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastMessageDate[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this SupportCaseSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SupportCaseSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the lastReopenedDate value for this SupportCaseSearchRowBasic.
     * 
     * @return lastReopenedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastReopenedDate() {
        return lastReopenedDate;
    }


    /**
     * Sets the lastReopenedDate value for this SupportCaseSearchRowBasic.
     * 
     * @param lastReopenedDate
     */
    public void setLastReopenedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastReopenedDate) {
        this.lastReopenedDate = lastReopenedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastReopenedDate(int i) {
        return this.lastReopenedDate[i];
    }

    public void setLastReopenedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastReopenedDate[i] = _value;
    }


    /**
     * Gets the locked value for this SupportCaseSearchRowBasic.
     * 
     * @return locked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this SupportCaseSearchRowBasic.
     * 
     * @param locked
     */
    public void setLocked(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] locked) {
        this.locked = locked;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getLocked(int i) {
        return this.locked[i];
    }

    public void setLocked(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.locked[i] = _value;
    }


    /**
     * Gets the module value for this SupportCaseSearchRowBasic.
     * 
     * @return module
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getModule() {
        return module;
    }


    /**
     * Sets the module value for this SupportCaseSearchRowBasic.
     * 
     * @param module
     */
    public void setModule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] module) {
        this.module = module;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getModule(int i) {
        return this.module[i];
    }

    public void setModule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.module[i] = _value;
    }


    /**
     * Gets the origin value for this SupportCaseSearchRowBasic.
     * 
     * @return origin
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this SupportCaseSearchRowBasic.
     * 
     * @param origin
     */
    public void setOrigin(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] origin) {
        this.origin = origin;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOrigin(int i) {
        return this.origin[i];
    }

    public void setOrigin(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.origin[i] = _value;
    }


    /**
     * Gets the priority value for this SupportCaseSearchRowBasic.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this SupportCaseSearchRowBasic.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priority) {
        this.priority = priority;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPriority(int i) {
        return this.priority[i];
    }

    public void setPriority(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.priority[i] = _value;
    }


    /**
     * Gets the product value for this SupportCaseSearchRowBasic.
     * 
     * @return product
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SupportCaseSearchRowBasic.
     * 
     * @param product
     */
    public void setProduct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] product) {
        this.product = product;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.product[i] = _value;
    }


    /**
     * Gets the profile value for this SupportCaseSearchRowBasic.
     * 
     * @return profile
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this SupportCaseSearchRowBasic.
     * 
     * @param profile
     */
    public void setProfile(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] profile) {
        this.profile = profile;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getProfile(int i) {
        return this.profile[i];
    }

    public void setProfile(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.profile[i] = _value;
    }


    /**
     * Gets the serialNumber value for this SupportCaseSearchRowBasic.
     * 
     * @return serialNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this SupportCaseSearchRowBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumber) {
        this.serialNumber = serialNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSerialNumber(int i) {
        return this.serialNumber[i];
    }

    public void setSerialNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.serialNumber[i] = _value;
    }


    /**
     * Gets the stage value for this SupportCaseSearchRowBasic.
     * 
     * @return stage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this SupportCaseSearchRowBasic.
     * 
     * @param stage
     */
    public void setStage(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] stage) {
        this.stage = stage;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getStage(int i) {
        return this.stage[i];
    }

    public void setStage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.stage[i] = _value;
    }


    /**
     * Gets the startDate value for this SupportCaseSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SupportCaseSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the status value for this SupportCaseSearchRowBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SupportCaseSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] status) {
        this.status = status;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the subsidiary value for this SupportCaseSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this SupportCaseSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the title value for this SupportCaseSearchRowBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this SupportCaseSearchRowBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title) {
        this.title = title;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.title[i] = _value;
    }


    /**
     * Gets the customFieldList value for this SupportCaseSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SupportCaseSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseSearchRowBasic)) return false;
        SupportCaseSearchRowBasic other = (SupportCaseSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              java.util.Arrays.equals(this.assigned, other.getAssigned()))) &&
            ((this.awaitingReply==null && other.getAwaitingReply()==null) || 
             (this.awaitingReply!=null &&
              java.util.Arrays.equals(this.awaitingReply, other.getAwaitingReply()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              java.util.Arrays.equals(this.caseNumber, other.getCaseNumber()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              java.util.Arrays.equals(this.company, other.getCompany()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.customerStage==null && other.getCustomerStage()==null) || 
             (this.customerStage!=null &&
              java.util.Arrays.equals(this.customerStage, other.getCustomerStage()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.escalatee==null && other.getEscalatee()==null) || 
             (this.escalatee!=null &&
              java.util.Arrays.equals(this.escalatee, other.getEscalatee()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.helpDesk==null && other.getHelpDesk()==null) || 
             (this.helpDesk!=null &&
              java.util.Arrays.equals(this.helpDesk, other.getHelpDesk()))) &&
            ((this.inboundEmail==null && other.getInboundEmail()==null) || 
             (this.inboundEmail!=null &&
              java.util.Arrays.equals(this.inboundEmail, other.getInboundEmail()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              java.util.Arrays.equals(this.issue, other.getIssue()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              java.util.Arrays.equals(this.issueNumber, other.getIssueNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastMessageDate==null && other.getLastMessageDate()==null) || 
             (this.lastMessageDate!=null &&
              java.util.Arrays.equals(this.lastMessageDate, other.getLastMessageDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.lastReopenedDate==null && other.getLastReopenedDate()==null) || 
             (this.lastReopenedDate!=null &&
              java.util.Arrays.equals(this.lastReopenedDate, other.getLastReopenedDate()))) &&
            ((this.locked==null && other.getLocked()==null) || 
             (this.locked!=null &&
              java.util.Arrays.equals(this.locked, other.getLocked()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              java.util.Arrays.equals(this.module, other.getModule()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              java.util.Arrays.equals(this.origin, other.getOrigin()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              java.util.Arrays.equals(this.profile, other.getProfile()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              java.util.Arrays.equals(this.serialNumber, other.getSerialNumber()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              java.util.Arrays.equals(this.stage, other.getStage()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAssigned() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigned());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigned(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAwaitingReply() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAwaitingReply());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAwaitingReply(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompany() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompany());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompany(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerStage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerStage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerStage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEscalatee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEscalatee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEscalatee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHelpDesk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHelpDesk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHelpDesk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInboundEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInboundEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInboundEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssueNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastMessageDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastMessageDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastMessageDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastReopenedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastReopenedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastReopenedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrigin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrigin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrigin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportCaseSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awaitingReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "awaitingReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerStage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customerStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalatee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "escalatee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpDesk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "helpDesk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inboundEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastMessageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastMessageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReopenedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastReopenedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
