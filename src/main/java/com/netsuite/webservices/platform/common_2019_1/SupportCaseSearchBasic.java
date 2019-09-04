/**
 * SupportCaseSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class SupportCaseSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assigned;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField awaitingReply;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField caseNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField closedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField company;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField email;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField escalateTo;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField helpDesk;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField inboundEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField issue;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField lastMessage;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastReopenedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField locked;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField message;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField messageAuthor;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField messageDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField messageType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField module;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField number;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField origin;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priority;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField product;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField profile;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField serialNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField stage;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField title;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public SupportCaseSearchBasic() {
    }

    public SupportCaseSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assigned,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField awaitingReply,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField caseNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField closedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField company,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField contact,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField email,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField escalateTo,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField helpDesk,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField inboundEmail,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField issue,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField lastMessage,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastReopenedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField locked,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField message,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField messageAuthor,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField messageDate,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField messageType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField module,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField number,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField origin,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priority,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField product,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField profile,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField serialNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField stage,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField title,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.assigned = assigned;
        this.awaitingReply = awaitingReply;
        this.caseNumber = caseNumber;
        this.category = category;
        this.closedDate = closedDate;
        this.company = company;
        this.contact = contact;
        this.createdDate = createdDate;
        this.email = email;
        this.escalateTo = escalateTo;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.helpDesk = helpDesk;
        this.inboundEmail = inboundEmail;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.issue = issue;
        this.item = item;
        this.lastMessage = lastMessage;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReopenedDate = lastReopenedDate;
        this.locked = locked;
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.messageDate = messageDate;
        this.messageType = messageType;
        this.module = module;
        this.number = number;
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
     * Gets the assigned value for this SupportCaseSearchBasic.
     * 
     * @return assigned
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this SupportCaseSearchBasic.
     * 
     * @param assigned
     */
    public void setAssigned(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the awaitingReply value for this SupportCaseSearchBasic.
     * 
     * @return awaitingReply
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAwaitingReply() {
        return awaitingReply;
    }


    /**
     * Sets the awaitingReply value for this SupportCaseSearchBasic.
     * 
     * @param awaitingReply
     */
    public void setAwaitingReply(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField awaitingReply) {
        this.awaitingReply = awaitingReply;
    }


    /**
     * Gets the caseNumber value for this SupportCaseSearchBasic.
     * 
     * @return caseNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this SupportCaseSearchBasic.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the category value for this SupportCaseSearchBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SupportCaseSearchBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the closedDate value for this SupportCaseSearchBasic.
     * 
     * @return closedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this SupportCaseSearchBasic.
     * 
     * @param closedDate
     */
    public void setClosedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the company value for this SupportCaseSearchBasic.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCompany() {
        return company;
    }


    /**
     * Sets the company value for this SupportCaseSearchBasic.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.SearchStringField company) {
        this.company = company;
    }


    /**
     * Gets the contact value for this SupportCaseSearchBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this SupportCaseSearchBasic.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.SearchStringField contact) {
        this.contact = contact;
    }


    /**
     * Gets the createdDate value for this SupportCaseSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SupportCaseSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the email value for this SupportCaseSearchBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SupportCaseSearchBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the escalateTo value for this SupportCaseSearchBasic.
     * 
     * @return escalateTo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEscalateTo() {
        return escalateTo;
    }


    /**
     * Sets the escalateTo value for this SupportCaseSearchBasic.
     * 
     * @param escalateTo
     */
    public void setEscalateTo(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField escalateTo) {
        this.escalateTo = escalateTo;
    }


    /**
     * Gets the externalId value for this SupportCaseSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SupportCaseSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this SupportCaseSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this SupportCaseSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the helpDesk value for this SupportCaseSearchBasic.
     * 
     * @return helpDesk
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getHelpDesk() {
        return helpDesk;
    }


    /**
     * Sets the helpDesk value for this SupportCaseSearchBasic.
     * 
     * @param helpDesk
     */
    public void setHelpDesk(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField helpDesk) {
        this.helpDesk = helpDesk;
    }


    /**
     * Gets the inboundEmail value for this SupportCaseSearchBasic.
     * 
     * @return inboundEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getInboundEmail() {
        return inboundEmail;
    }


    /**
     * Sets the inboundEmail value for this SupportCaseSearchBasic.
     * 
     * @param inboundEmail
     */
    public void setInboundEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField inboundEmail) {
        this.inboundEmail = inboundEmail;
    }


    /**
     * Gets the internalId value for this SupportCaseSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SupportCaseSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this SupportCaseSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this SupportCaseSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this SupportCaseSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SupportCaseSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the issue value for this SupportCaseSearchBasic.
     * 
     * @return issue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this SupportCaseSearchBasic.
     * 
     * @param issue
     */
    public void setIssue(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField issue) {
        this.issue = issue;
    }


    /**
     * Gets the item value for this SupportCaseSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this SupportCaseSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lastMessage value for this SupportCaseSearchBasic.
     * 
     * @return lastMessage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getLastMessage() {
        return lastMessage;
    }


    /**
     * Sets the lastMessage value for this SupportCaseSearchBasic.
     * 
     * @param lastMessage
     */
    public void setLastMessage(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField lastMessage) {
        this.lastMessage = lastMessage;
    }


    /**
     * Gets the lastModifiedDate value for this SupportCaseSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SupportCaseSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastReopenedDate value for this SupportCaseSearchBasic.
     * 
     * @return lastReopenedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastReopenedDate() {
        return lastReopenedDate;
    }


    /**
     * Sets the lastReopenedDate value for this SupportCaseSearchBasic.
     * 
     * @param lastReopenedDate
     */
    public void setLastReopenedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastReopenedDate) {
        this.lastReopenedDate = lastReopenedDate;
    }


    /**
     * Gets the locked value for this SupportCaseSearchBasic.
     * 
     * @return locked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this SupportCaseSearchBasic.
     * 
     * @param locked
     */
    public void setLocked(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField locked) {
        this.locked = locked;
    }


    /**
     * Gets the message value for this SupportCaseSearchBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SupportCaseSearchBasic.
     * 
     * @param message
     */
    public void setMessage(com.netsuite.webservices.platform.core_2019_1.SearchStringField message) {
        this.message = message;
    }


    /**
     * Gets the messageAuthor value for this SupportCaseSearchBasic.
     * 
     * @return messageAuthor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getMessageAuthor() {
        return messageAuthor;
    }


    /**
     * Sets the messageAuthor value for this SupportCaseSearchBasic.
     * 
     * @param messageAuthor
     */
    public void setMessageAuthor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField messageAuthor) {
        this.messageAuthor = messageAuthor;
    }


    /**
     * Gets the messageDate value for this SupportCaseSearchBasic.
     * 
     * @return messageDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getMessageDate() {
        return messageDate;
    }


    /**
     * Sets the messageDate value for this SupportCaseSearchBasic.
     * 
     * @param messageDate
     */
    public void setMessageDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField messageDate) {
        this.messageDate = messageDate;
    }


    /**
     * Gets the messageType value for this SupportCaseSearchBasic.
     * 
     * @return messageType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this SupportCaseSearchBasic.
     * 
     * @param messageType
     */
    public void setMessageType(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the module value for this SupportCaseSearchBasic.
     * 
     * @return module
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getModule() {
        return module;
    }


    /**
     * Sets the module value for this SupportCaseSearchBasic.
     * 
     * @param module
     */
    public void setModule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField module) {
        this.module = module;
    }


    /**
     * Gets the number value for this SupportCaseSearchBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this SupportCaseSearchBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the origin value for this SupportCaseSearchBasic.
     * 
     * @return origin
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this SupportCaseSearchBasic.
     * 
     * @param origin
     */
    public void setOrigin(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField origin) {
        this.origin = origin;
    }


    /**
     * Gets the priority value for this SupportCaseSearchBasic.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this SupportCaseSearchBasic.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priority) {
        this.priority = priority;
    }


    /**
     * Gets the product value for this SupportCaseSearchBasic.
     * 
     * @return product
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SupportCaseSearchBasic.
     * 
     * @param product
     */
    public void setProduct(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField product) {
        this.product = product;
    }


    /**
     * Gets the profile value for this SupportCaseSearchBasic.
     * 
     * @return profile
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this SupportCaseSearchBasic.
     * 
     * @param profile
     */
    public void setProfile(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField profile) {
        this.profile = profile;
    }


    /**
     * Gets the serialNumber value for this SupportCaseSearchBasic.
     * 
     * @return serialNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this SupportCaseSearchBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the stage value for this SupportCaseSearchBasic.
     * 
     * @return stage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this SupportCaseSearchBasic.
     * 
     * @param stage
     */
    public void setStage(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField stage) {
        this.stage = stage;
    }


    /**
     * Gets the startDate value for this SupportCaseSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SupportCaseSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this SupportCaseSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SupportCaseSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the subsidiary value for this SupportCaseSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this SupportCaseSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the title value for this SupportCaseSearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this SupportCaseSearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the customFieldList value for this SupportCaseSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SupportCaseSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseSearchBasic)) return false;
        SupportCaseSearchBasic other = (SupportCaseSearchBasic) obj;
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
              this.assigned.equals(other.getAssigned()))) &&
            ((this.awaitingReply==null && other.getAwaitingReply()==null) || 
             (this.awaitingReply!=null &&
              this.awaitingReply.equals(other.getAwaitingReply()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.escalateTo==null && other.getEscalateTo()==null) || 
             (this.escalateTo!=null &&
              this.escalateTo.equals(other.getEscalateTo()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.helpDesk==null && other.getHelpDesk()==null) || 
             (this.helpDesk!=null &&
              this.helpDesk.equals(other.getHelpDesk()))) &&
            ((this.inboundEmail==null && other.getInboundEmail()==null) || 
             (this.inboundEmail!=null &&
              this.inboundEmail.equals(other.getInboundEmail()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lastMessage==null && other.getLastMessage()==null) || 
             (this.lastMessage!=null &&
              this.lastMessage.equals(other.getLastMessage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastReopenedDate==null && other.getLastReopenedDate()==null) || 
             (this.lastReopenedDate!=null &&
              this.lastReopenedDate.equals(other.getLastReopenedDate()))) &&
            ((this.locked==null && other.getLocked()==null) || 
             (this.locked!=null &&
              this.locked.equals(other.getLocked()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.messageAuthor==null && other.getMessageAuthor()==null) || 
             (this.messageAuthor!=null &&
              this.messageAuthor.equals(other.getMessageAuthor()))) &&
            ((this.messageDate==null && other.getMessageDate()==null) || 
             (this.messageDate!=null &&
              this.messageDate.equals(other.getMessageDate()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              this.stage.equals(other.getStage()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
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
            _hashCode += getAssigned().hashCode();
        }
        if (getAwaitingReply() != null) {
            _hashCode += getAwaitingReply().hashCode();
        }
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEscalateTo() != null) {
            _hashCode += getEscalateTo().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getHelpDesk() != null) {
            _hashCode += getHelpDesk().hashCode();
        }
        if (getInboundEmail() != null) {
            _hashCode += getInboundEmail().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLastMessage() != null) {
            _hashCode += getLastMessage().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastReopenedDate() != null) {
            _hashCode += getLastReopenedDate().hashCode();
        }
        if (getLocked() != null) {
            _hashCode += getLocked().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMessageAuthor() != null) {
            _hashCode += getMessageAuthor().hashCode();
        }
        if (getMessageDate() != null) {
            _hashCode += getMessageDate().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getStage() != null) {
            _hashCode += getStage().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportCaseSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awaitingReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "awaitingReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "escalateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpDesk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "helpDesk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inboundEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReopenedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastReopenedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "messageAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "messageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
