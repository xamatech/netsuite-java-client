/**
 * SupportCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class SupportCase  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String escalationMessage;

    private java.util.Calendar lastReopenedDate;

    private java.util.Calendar endDate;

    private java.lang.String incomingMessage;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef insertSolution;

    private java.lang.String outgoingMessage;

    private java.lang.String searchSolution;

    private java.lang.Boolean emailForm;

    private java.lang.String newSolutionFromMsg;

    private java.lang.Boolean internalOnly;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String title;

    private java.lang.String caseNumber;

    private java.util.Calendar startDate;

    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastMessageDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef company;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef profile;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef contact;

    private java.lang.String email;

    private java.lang.String phone;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef product;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef module;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef serialNumber;

    private java.lang.String inboundEmail;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef issue;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef status;

    private java.lang.Boolean isInactive;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef priority;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef origin;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef category;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef assigned;

    private java.lang.Boolean helpDesk;

    private com.netsuite.webservices.lists.support_2019_1.EmailEmployeesList emailEmployeesList;

    private com.netsuite.webservices.lists.support_2019_1.SupportCaseEscalateToList escalateToList;

    private com.netsuite.webservices.lists.support_2019_1.SupportCaseTimeItemList timeItemList;

    private com.netsuite.webservices.lists.support_2019_1.SupportCaseSolutionsList solutionsList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public SupportCase() {
    }

    public SupportCase(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String escalationMessage,
           java.util.Calendar lastReopenedDate,
           java.util.Calendar endDate,
           java.lang.String incomingMessage,
           com.netsuite.webservices.platform.core_2019_1.RecordRef insertSolution,
           java.lang.String outgoingMessage,
           java.lang.String searchSolution,
           java.lang.Boolean emailForm,
           java.lang.String newSolutionFromMsg,
           java.lang.Boolean internalOnly,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String title,
           java.lang.String caseNumber,
           java.util.Calendar startDate,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastMessageDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef company,
           com.netsuite.webservices.platform.core_2019_1.RecordRef profile,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef contact,
           java.lang.String email,
           java.lang.String phone,
           com.netsuite.webservices.platform.core_2019_1.RecordRef product,
           com.netsuite.webservices.platform.core_2019_1.RecordRef module,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           com.netsuite.webservices.platform.core_2019_1.RecordRef serialNumber,
           java.lang.String inboundEmail,
           com.netsuite.webservices.platform.core_2019_1.RecordRef issue,
           com.netsuite.webservices.platform.core_2019_1.RecordRef status,
           java.lang.Boolean isInactive,
           com.netsuite.webservices.platform.core_2019_1.RecordRef priority,
           com.netsuite.webservices.platform.core_2019_1.RecordRef origin,
           com.netsuite.webservices.platform.core_2019_1.RecordRef category,
           com.netsuite.webservices.platform.core_2019_1.RecordRef assigned,
           java.lang.Boolean helpDesk,
           com.netsuite.webservices.lists.support_2019_1.EmailEmployeesList emailEmployeesList,
           com.netsuite.webservices.lists.support_2019_1.SupportCaseEscalateToList escalateToList,
           com.netsuite.webservices.lists.support_2019_1.SupportCaseTimeItemList timeItemList,
           com.netsuite.webservices.lists.support_2019_1.SupportCaseSolutionsList solutionsList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.escalationMessage = escalationMessage;
        this.lastReopenedDate = lastReopenedDate;
        this.endDate = endDate;
        this.incomingMessage = incomingMessage;
        this.insertSolution = insertSolution;
        this.outgoingMessage = outgoingMessage;
        this.searchSolution = searchSolution;
        this.emailForm = emailForm;
        this.newSolutionFromMsg = newSolutionFromMsg;
        this.internalOnly = internalOnly;
        this.customForm = customForm;
        this.title = title;
        this.caseNumber = caseNumber;
        this.startDate = startDate;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.lastMessageDate = lastMessageDate;
        this.company = company;
        this.profile = profile;
        this.subsidiary = subsidiary;
        this.contact = contact;
        this.email = email;
        this.phone = phone;
        this.product = product;
        this.module = module;
        this.item = item;
        this.serialNumber = serialNumber;
        this.inboundEmail = inboundEmail;
        this.issue = issue;
        this.status = status;
        this.isInactive = isInactive;
        this.priority = priority;
        this.origin = origin;
        this.category = category;
        this.assigned = assigned;
        this.helpDesk = helpDesk;
        this.emailEmployeesList = emailEmployeesList;
        this.escalateToList = escalateToList;
        this.timeItemList = timeItemList;
        this.solutionsList = solutionsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the escalationMessage value for this SupportCase.
     * 
     * @return escalationMessage
     */
    public java.lang.String getEscalationMessage() {
        return escalationMessage;
    }


    /**
     * Sets the escalationMessage value for this SupportCase.
     * 
     * @param escalationMessage
     */
    public void setEscalationMessage(java.lang.String escalationMessage) {
        this.escalationMessage = escalationMessage;
    }


    /**
     * Gets the lastReopenedDate value for this SupportCase.
     * 
     * @return lastReopenedDate
     */
    public java.util.Calendar getLastReopenedDate() {
        return lastReopenedDate;
    }


    /**
     * Sets the lastReopenedDate value for this SupportCase.
     * 
     * @param lastReopenedDate
     */
    public void setLastReopenedDate(java.util.Calendar lastReopenedDate) {
        this.lastReopenedDate = lastReopenedDate;
    }


    /**
     * Gets the endDate value for this SupportCase.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SupportCase.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the incomingMessage value for this SupportCase.
     * 
     * @return incomingMessage
     */
    public java.lang.String getIncomingMessage() {
        return incomingMessage;
    }


    /**
     * Sets the incomingMessage value for this SupportCase.
     * 
     * @param incomingMessage
     */
    public void setIncomingMessage(java.lang.String incomingMessage) {
        this.incomingMessage = incomingMessage;
    }


    /**
     * Gets the insertSolution value for this SupportCase.
     * 
     * @return insertSolution
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInsertSolution() {
        return insertSolution;
    }


    /**
     * Sets the insertSolution value for this SupportCase.
     * 
     * @param insertSolution
     */
    public void setInsertSolution(com.netsuite.webservices.platform.core_2019_1.RecordRef insertSolution) {
        this.insertSolution = insertSolution;
    }


    /**
     * Gets the outgoingMessage value for this SupportCase.
     * 
     * @return outgoingMessage
     */
    public java.lang.String getOutgoingMessage() {
        return outgoingMessage;
    }


    /**
     * Sets the outgoingMessage value for this SupportCase.
     * 
     * @param outgoingMessage
     */
    public void setOutgoingMessage(java.lang.String outgoingMessage) {
        this.outgoingMessage = outgoingMessage;
    }


    /**
     * Gets the searchSolution value for this SupportCase.
     * 
     * @return searchSolution
     */
    public java.lang.String getSearchSolution() {
        return searchSolution;
    }


    /**
     * Sets the searchSolution value for this SupportCase.
     * 
     * @param searchSolution
     */
    public void setSearchSolution(java.lang.String searchSolution) {
        this.searchSolution = searchSolution;
    }


    /**
     * Gets the emailForm value for this SupportCase.
     * 
     * @return emailForm
     */
    public java.lang.Boolean getEmailForm() {
        return emailForm;
    }


    /**
     * Sets the emailForm value for this SupportCase.
     * 
     * @param emailForm
     */
    public void setEmailForm(java.lang.Boolean emailForm) {
        this.emailForm = emailForm;
    }


    /**
     * Gets the newSolutionFromMsg value for this SupportCase.
     * 
     * @return newSolutionFromMsg
     */
    public java.lang.String getNewSolutionFromMsg() {
        return newSolutionFromMsg;
    }


    /**
     * Sets the newSolutionFromMsg value for this SupportCase.
     * 
     * @param newSolutionFromMsg
     */
    public void setNewSolutionFromMsg(java.lang.String newSolutionFromMsg) {
        this.newSolutionFromMsg = newSolutionFromMsg;
    }


    /**
     * Gets the internalOnly value for this SupportCase.
     * 
     * @return internalOnly
     */
    public java.lang.Boolean getInternalOnly() {
        return internalOnly;
    }


    /**
     * Sets the internalOnly value for this SupportCase.
     * 
     * @param internalOnly
     */
    public void setInternalOnly(java.lang.Boolean internalOnly) {
        this.internalOnly = internalOnly;
    }


    /**
     * Gets the customForm value for this SupportCase.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this SupportCase.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the title value for this SupportCase.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this SupportCase.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the caseNumber value for this SupportCase.
     * 
     * @return caseNumber
     */
    public java.lang.String getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this SupportCase.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(java.lang.String caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the startDate value for this SupportCase.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SupportCase.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the createdDate value for this SupportCase.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SupportCase.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this SupportCase.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SupportCase.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastMessageDate value for this SupportCase.
     * 
     * @return lastMessageDate
     */
    public java.util.Calendar getLastMessageDate() {
        return lastMessageDate;
    }


    /**
     * Sets the lastMessageDate value for this SupportCase.
     * 
     * @param lastMessageDate
     */
    public void setLastMessageDate(java.util.Calendar lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }


    /**
     * Gets the company value for this SupportCase.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCompany() {
        return company;
    }


    /**
     * Sets the company value for this SupportCase.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.RecordRef company) {
        this.company = company;
    }


    /**
     * Gets the profile value for this SupportCase.
     * 
     * @return profile
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this SupportCase.
     * 
     * @param profile
     */
    public void setProfile(com.netsuite.webservices.platform.core_2019_1.RecordRef profile) {
        this.profile = profile;
    }


    /**
     * Gets the subsidiary value for this SupportCase.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this SupportCase.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the contact value for this SupportCase.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this SupportCase.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.RecordRef contact) {
        this.contact = contact;
    }


    /**
     * Gets the email value for this SupportCase.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SupportCase.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the phone value for this SupportCase.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this SupportCase.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the product value for this SupportCase.
     * 
     * @return product
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SupportCase.
     * 
     * @param product
     */
    public void setProduct(com.netsuite.webservices.platform.core_2019_1.RecordRef product) {
        this.product = product;
    }


    /**
     * Gets the module value for this SupportCase.
     * 
     * @return module
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getModule() {
        return module;
    }


    /**
     * Sets the module value for this SupportCase.
     * 
     * @param module
     */
    public void setModule(com.netsuite.webservices.platform.core_2019_1.RecordRef module) {
        this.module = module;
    }


    /**
     * Gets the item value for this SupportCase.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this SupportCase.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the serialNumber value for this SupportCase.
     * 
     * @return serialNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this SupportCase.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(com.netsuite.webservices.platform.core_2019_1.RecordRef serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the inboundEmail value for this SupportCase.
     * 
     * @return inboundEmail
     */
    public java.lang.String getInboundEmail() {
        return inboundEmail;
    }


    /**
     * Sets the inboundEmail value for this SupportCase.
     * 
     * @param inboundEmail
     */
    public void setInboundEmail(java.lang.String inboundEmail) {
        this.inboundEmail = inboundEmail;
    }


    /**
     * Gets the issue value for this SupportCase.
     * 
     * @return issue
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this SupportCase.
     * 
     * @param issue
     */
    public void setIssue(com.netsuite.webservices.platform.core_2019_1.RecordRef issue) {
        this.issue = issue;
    }


    /**
     * Gets the status value for this SupportCase.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SupportCase.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef status) {
        this.status = status;
    }


    /**
     * Gets the isInactive value for this SupportCase.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SupportCase.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the priority value for this SupportCase.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this SupportCase.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.RecordRef priority) {
        this.priority = priority;
    }


    /**
     * Gets the origin value for this SupportCase.
     * 
     * @return origin
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this SupportCase.
     * 
     * @param origin
     */
    public void setOrigin(com.netsuite.webservices.platform.core_2019_1.RecordRef origin) {
        this.origin = origin;
    }


    /**
     * Gets the category value for this SupportCase.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SupportCase.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the assigned value for this SupportCase.
     * 
     * @return assigned
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this SupportCase.
     * 
     * @param assigned
     */
    public void setAssigned(com.netsuite.webservices.platform.core_2019_1.RecordRef assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the helpDesk value for this SupportCase.
     * 
     * @return helpDesk
     */
    public java.lang.Boolean getHelpDesk() {
        return helpDesk;
    }


    /**
     * Sets the helpDesk value for this SupportCase.
     * 
     * @param helpDesk
     */
    public void setHelpDesk(java.lang.Boolean helpDesk) {
        this.helpDesk = helpDesk;
    }


    /**
     * Gets the emailEmployeesList value for this SupportCase.
     * 
     * @return emailEmployeesList
     */
    public com.netsuite.webservices.lists.support_2019_1.EmailEmployeesList getEmailEmployeesList() {
        return emailEmployeesList;
    }


    /**
     * Sets the emailEmployeesList value for this SupportCase.
     * 
     * @param emailEmployeesList
     */
    public void setEmailEmployeesList(com.netsuite.webservices.lists.support_2019_1.EmailEmployeesList emailEmployeesList) {
        this.emailEmployeesList = emailEmployeesList;
    }


    /**
     * Gets the escalateToList value for this SupportCase.
     * 
     * @return escalateToList
     */
    public com.netsuite.webservices.lists.support_2019_1.SupportCaseEscalateToList getEscalateToList() {
        return escalateToList;
    }


    /**
     * Sets the escalateToList value for this SupportCase.
     * 
     * @param escalateToList
     */
    public void setEscalateToList(com.netsuite.webservices.lists.support_2019_1.SupportCaseEscalateToList escalateToList) {
        this.escalateToList = escalateToList;
    }


    /**
     * Gets the timeItemList value for this SupportCase.
     * 
     * @return timeItemList
     */
    public com.netsuite.webservices.lists.support_2019_1.SupportCaseTimeItemList getTimeItemList() {
        return timeItemList;
    }


    /**
     * Sets the timeItemList value for this SupportCase.
     * 
     * @param timeItemList
     */
    public void setTimeItemList(com.netsuite.webservices.lists.support_2019_1.SupportCaseTimeItemList timeItemList) {
        this.timeItemList = timeItemList;
    }


    /**
     * Gets the solutionsList value for this SupportCase.
     * 
     * @return solutionsList
     */
    public com.netsuite.webservices.lists.support_2019_1.SupportCaseSolutionsList getSolutionsList() {
        return solutionsList;
    }


    /**
     * Sets the solutionsList value for this SupportCase.
     * 
     * @param solutionsList
     */
    public void setSolutionsList(com.netsuite.webservices.lists.support_2019_1.SupportCaseSolutionsList solutionsList) {
        this.solutionsList = solutionsList;
    }


    /**
     * Gets the customFieldList value for this SupportCase.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SupportCase.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this SupportCase.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SupportCase.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this SupportCase.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SupportCase.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCase)) return false;
        SupportCase other = (SupportCase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.escalationMessage==null && other.getEscalationMessage()==null) || 
             (this.escalationMessage!=null &&
              this.escalationMessage.equals(other.getEscalationMessage()))) &&
            ((this.lastReopenedDate==null && other.getLastReopenedDate()==null) || 
             (this.lastReopenedDate!=null &&
              this.lastReopenedDate.equals(other.getLastReopenedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.incomingMessage==null && other.getIncomingMessage()==null) || 
             (this.incomingMessage!=null &&
              this.incomingMessage.equals(other.getIncomingMessage()))) &&
            ((this.insertSolution==null && other.getInsertSolution()==null) || 
             (this.insertSolution!=null &&
              this.insertSolution.equals(other.getInsertSolution()))) &&
            ((this.outgoingMessage==null && other.getOutgoingMessage()==null) || 
             (this.outgoingMessage!=null &&
              this.outgoingMessage.equals(other.getOutgoingMessage()))) &&
            ((this.searchSolution==null && other.getSearchSolution()==null) || 
             (this.searchSolution!=null &&
              this.searchSolution.equals(other.getSearchSolution()))) &&
            ((this.emailForm==null && other.getEmailForm()==null) || 
             (this.emailForm!=null &&
              this.emailForm.equals(other.getEmailForm()))) &&
            ((this.newSolutionFromMsg==null && other.getNewSolutionFromMsg()==null) || 
             (this.newSolutionFromMsg!=null &&
              this.newSolutionFromMsg.equals(other.getNewSolutionFromMsg()))) &&
            ((this.internalOnly==null && other.getInternalOnly()==null) || 
             (this.internalOnly!=null &&
              this.internalOnly.equals(other.getInternalOnly()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastMessageDate==null && other.getLastMessageDate()==null) || 
             (this.lastMessageDate!=null &&
              this.lastMessageDate.equals(other.getLastMessageDate()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.inboundEmail==null && other.getInboundEmail()==null) || 
             (this.inboundEmail!=null &&
              this.inboundEmail.equals(other.getInboundEmail()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.helpDesk==null && other.getHelpDesk()==null) || 
             (this.helpDesk!=null &&
              this.helpDesk.equals(other.getHelpDesk()))) &&
            ((this.emailEmployeesList==null && other.getEmailEmployeesList()==null) || 
             (this.emailEmployeesList!=null &&
              this.emailEmployeesList.equals(other.getEmailEmployeesList()))) &&
            ((this.escalateToList==null && other.getEscalateToList()==null) || 
             (this.escalateToList!=null &&
              this.escalateToList.equals(other.getEscalateToList()))) &&
            ((this.timeItemList==null && other.getTimeItemList()==null) || 
             (this.timeItemList!=null &&
              this.timeItemList.equals(other.getTimeItemList()))) &&
            ((this.solutionsList==null && other.getSolutionsList()==null) || 
             (this.solutionsList!=null &&
              this.solutionsList.equals(other.getSolutionsList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getEscalationMessage() != null) {
            _hashCode += getEscalationMessage().hashCode();
        }
        if (getLastReopenedDate() != null) {
            _hashCode += getLastReopenedDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getIncomingMessage() != null) {
            _hashCode += getIncomingMessage().hashCode();
        }
        if (getInsertSolution() != null) {
            _hashCode += getInsertSolution().hashCode();
        }
        if (getOutgoingMessage() != null) {
            _hashCode += getOutgoingMessage().hashCode();
        }
        if (getSearchSolution() != null) {
            _hashCode += getSearchSolution().hashCode();
        }
        if (getEmailForm() != null) {
            _hashCode += getEmailForm().hashCode();
        }
        if (getNewSolutionFromMsg() != null) {
            _hashCode += getNewSolutionFromMsg().hashCode();
        }
        if (getInternalOnly() != null) {
            _hashCode += getInternalOnly().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastMessageDate() != null) {
            _hashCode += getLastMessageDate().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getInboundEmail() != null) {
            _hashCode += getInboundEmail().hashCode();
        }
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getHelpDesk() != null) {
            _hashCode += getHelpDesk().hashCode();
        }
        if (getEmailEmployeesList() != null) {
            _hashCode += getEmailEmployeesList().hashCode();
        }
        if (getEscalateToList() != null) {
            _hashCode += getEscalateToList().hashCode();
        }
        if (getTimeItemList() != null) {
            _hashCode += getTimeItemList().hashCode();
        }
        if (getSolutionsList() != null) {
            _hashCode += getSolutionsList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportCase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "SupportCase"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "escalationMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReopenedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "lastReopenedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomingMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "incomingMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertSolution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "insertSolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "outgoingMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchSolution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "searchSolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "emailForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSolutionFromMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "newSolutionFromMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "internalOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastMessageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "lastMessageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "inboundEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpDesk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "helpDesk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEmployeesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "emailEmployeesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "EmailEmployeesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalateToList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "escalateToList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "SupportCaseEscalateToList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "timeItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "SupportCaseTimeItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solutionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "solutionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "SupportCaseSolutionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
