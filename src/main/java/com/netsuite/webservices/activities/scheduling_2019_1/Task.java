/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2019_1;

public class Task  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef company;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef contact;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef supportCase;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef transaction;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef milestone;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String title;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef assigned;

    private java.lang.Boolean sendEmail;

    private java.lang.Boolean timedEvent;

    private com.netsuite.webservices.platform.core_2019_1.Duration estimatedTime;

    private com.netsuite.webservices.platform.core_2019_1.Duration estimatedTimeOverride;

    private com.netsuite.webservices.platform.core_2019_1.Duration actualTime;

    private com.netsuite.webservices.platform.core_2019_1.Duration timeRemaining;

    private java.lang.Double percentTimeComplete;

    private java.lang.Double percentComplete;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.util.Calendar dueDate;

    private java.util.Calendar completedDate;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.TaskPriority priority;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.TaskStatus status;

    private java.lang.String message;

    private java.lang.Boolean accessLevel;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.TaskReminderType reminderType;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.TaskReminderMinutes reminderMinutes;

    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef owner;

    private com.netsuite.webservices.activities.scheduling_2019_1.TaskContactList contactList;

    private com.netsuite.webservices.activities.scheduling_2019_1.TaskTimeItemList timeItemList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Task() {
    }

    public Task(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef company,
           com.netsuite.webservices.platform.core_2019_1.RecordRef contact,
           com.netsuite.webservices.platform.core_2019_1.RecordRef supportCase,
           com.netsuite.webservices.platform.core_2019_1.RecordRef transaction,
           com.netsuite.webservices.platform.core_2019_1.RecordRef milestone,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String title,
           com.netsuite.webservices.platform.core_2019_1.RecordRef assigned,
           java.lang.Boolean sendEmail,
           java.lang.Boolean timedEvent,
           com.netsuite.webservices.platform.core_2019_1.Duration estimatedTime,
           com.netsuite.webservices.platform.core_2019_1.Duration estimatedTimeOverride,
           com.netsuite.webservices.platform.core_2019_1.Duration actualTime,
           com.netsuite.webservices.platform.core_2019_1.Duration timeRemaining,
           java.lang.Double percentTimeComplete,
           java.lang.Double percentComplete,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.util.Calendar dueDate,
           java.util.Calendar completedDate,
           com.netsuite.webservices.activities.scheduling_2019_1.types.TaskPriority priority,
           com.netsuite.webservices.activities.scheduling_2019_1.types.TaskStatus status,
           java.lang.String message,
           java.lang.Boolean accessLevel,
           com.netsuite.webservices.activities.scheduling_2019_1.types.TaskReminderType reminderType,
           com.netsuite.webservices.activities.scheduling_2019_1.types.TaskReminderMinutes reminderMinutes,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef owner,
           com.netsuite.webservices.activities.scheduling_2019_1.TaskContactList contactList,
           com.netsuite.webservices.activities.scheduling_2019_1.TaskTimeItemList timeItemList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.company = company;
        this.contact = contact;
        this.supportCase = supportCase;
        this.transaction = transaction;
        this.milestone = milestone;
        this.customForm = customForm;
        this.title = title;
        this.assigned = assigned;
        this.sendEmail = sendEmail;
        this.timedEvent = timedEvent;
        this.estimatedTime = estimatedTime;
        this.estimatedTimeOverride = estimatedTimeOverride;
        this.actualTime = actualTime;
        this.timeRemaining = timeRemaining;
        this.percentTimeComplete = percentTimeComplete;
        this.percentComplete = percentComplete;
        this.parent = parent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dueDate = dueDate;
        this.completedDate = completedDate;
        this.priority = priority;
        this.status = status;
        this.message = message;
        this.accessLevel = accessLevel;
        this.reminderType = reminderType;
        this.reminderMinutes = reminderMinutes;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.owner = owner;
        this.contactList = contactList;
        this.timeItemList = timeItemList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the company value for this Task.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCompany() {
        return company;
    }


    /**
     * Sets the company value for this Task.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.RecordRef company) {
        this.company = company;
    }


    /**
     * Gets the contact value for this Task.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this Task.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.RecordRef contact) {
        this.contact = contact;
    }


    /**
     * Gets the supportCase value for this Task.
     * 
     * @return supportCase
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSupportCase() {
        return supportCase;
    }


    /**
     * Sets the supportCase value for this Task.
     * 
     * @param supportCase
     */
    public void setSupportCase(com.netsuite.webservices.platform.core_2019_1.RecordRef supportCase) {
        this.supportCase = supportCase;
    }


    /**
     * Gets the transaction value for this Task.
     * 
     * @return transaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this Task.
     * 
     * @param transaction
     */
    public void setTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef transaction) {
        this.transaction = transaction;
    }


    /**
     * Gets the milestone value for this Task.
     * 
     * @return milestone
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getMilestone() {
        return milestone;
    }


    /**
     * Sets the milestone value for this Task.
     * 
     * @param milestone
     */
    public void setMilestone(com.netsuite.webservices.platform.core_2019_1.RecordRef milestone) {
        this.milestone = milestone;
    }


    /**
     * Gets the customForm value for this Task.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Task.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the title value for this Task.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Task.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the assigned value for this Task.
     * 
     * @return assigned
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this Task.
     * 
     * @param assigned
     */
    public void setAssigned(com.netsuite.webservices.platform.core_2019_1.RecordRef assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the sendEmail value for this Task.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this Task.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the timedEvent value for this Task.
     * 
     * @return timedEvent
     */
    public java.lang.Boolean getTimedEvent() {
        return timedEvent;
    }


    /**
     * Sets the timedEvent value for this Task.
     * 
     * @param timedEvent
     */
    public void setTimedEvent(java.lang.Boolean timedEvent) {
        this.timedEvent = timedEvent;
    }


    /**
     * Gets the estimatedTime value for this Task.
     * 
     * @return estimatedTime
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getEstimatedTime() {
        return estimatedTime;
    }


    /**
     * Sets the estimatedTime value for this Task.
     * 
     * @param estimatedTime
     */
    public void setEstimatedTime(com.netsuite.webservices.platform.core_2019_1.Duration estimatedTime) {
        this.estimatedTime = estimatedTime;
    }


    /**
     * Gets the estimatedTimeOverride value for this Task.
     * 
     * @return estimatedTimeOverride
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }


    /**
     * Sets the estimatedTimeOverride value for this Task.
     * 
     * @param estimatedTimeOverride
     */
    public void setEstimatedTimeOverride(com.netsuite.webservices.platform.core_2019_1.Duration estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }


    /**
     * Gets the actualTime value for this Task.
     * 
     * @return actualTime
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getActualTime() {
        return actualTime;
    }


    /**
     * Sets the actualTime value for this Task.
     * 
     * @param actualTime
     */
    public void setActualTime(com.netsuite.webservices.platform.core_2019_1.Duration actualTime) {
        this.actualTime = actualTime;
    }


    /**
     * Gets the timeRemaining value for this Task.
     * 
     * @return timeRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getTimeRemaining() {
        return timeRemaining;
    }


    /**
     * Sets the timeRemaining value for this Task.
     * 
     * @param timeRemaining
     */
    public void setTimeRemaining(com.netsuite.webservices.platform.core_2019_1.Duration timeRemaining) {
        this.timeRemaining = timeRemaining;
    }


    /**
     * Gets the percentTimeComplete value for this Task.
     * 
     * @return percentTimeComplete
     */
    public java.lang.Double getPercentTimeComplete() {
        return percentTimeComplete;
    }


    /**
     * Sets the percentTimeComplete value for this Task.
     * 
     * @param percentTimeComplete
     */
    public void setPercentTimeComplete(java.lang.Double percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }


    /**
     * Gets the percentComplete value for this Task.
     * 
     * @return percentComplete
     */
    public java.lang.Double getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this Task.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(java.lang.Double percentComplete) {
        this.percentComplete = percentComplete;
    }


    /**
     * Gets the parent value for this Task.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Task.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the startDate value for this Task.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Task.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Task.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Task.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the dueDate value for this Task.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Task.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the completedDate value for this Task.
     * 
     * @return completedDate
     */
    public java.util.Calendar getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this Task.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the priority value for this Task.
     * 
     * @return priority
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.TaskPriority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Task.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.activities.scheduling_2019_1.types.TaskPriority priority) {
        this.priority = priority;
    }


    /**
     * Gets the status value for this Task.
     * 
     * @return status
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.TaskStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Task.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.activities.scheduling_2019_1.types.TaskStatus status) {
        this.status = status;
    }


    /**
     * Gets the message value for this Task.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Task.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the accessLevel value for this Task.
     * 
     * @return accessLevel
     */
    public java.lang.Boolean getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this Task.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(java.lang.Boolean accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the reminderType value for this Task.
     * 
     * @return reminderType
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.TaskReminderType getReminderType() {
        return reminderType;
    }


    /**
     * Sets the reminderType value for this Task.
     * 
     * @param reminderType
     */
    public void setReminderType(com.netsuite.webservices.activities.scheduling_2019_1.types.TaskReminderType reminderType) {
        this.reminderType = reminderType;
    }


    /**
     * Gets the reminderMinutes value for this Task.
     * 
     * @return reminderMinutes
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.TaskReminderMinutes getReminderMinutes() {
        return reminderMinutes;
    }


    /**
     * Sets the reminderMinutes value for this Task.
     * 
     * @param reminderMinutes
     */
    public void setReminderMinutes(com.netsuite.webservices.activities.scheduling_2019_1.types.TaskReminderMinutes reminderMinutes) {
        this.reminderMinutes = reminderMinutes;
    }


    /**
     * Gets the createdDate value for this Task.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Task.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this Task.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Task.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the owner value for this Task.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Task.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the contactList value for this Task.
     * 
     * @return contactList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.TaskContactList getContactList() {
        return contactList;
    }


    /**
     * Sets the contactList value for this Task.
     * 
     * @param contactList
     */
    public void setContactList(com.netsuite.webservices.activities.scheduling_2019_1.TaskContactList contactList) {
        this.contactList = contactList;
    }


    /**
     * Gets the timeItemList value for this Task.
     * 
     * @return timeItemList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.TaskTimeItemList getTimeItemList() {
        return timeItemList;
    }


    /**
     * Sets the timeItemList value for this Task.
     * 
     * @param timeItemList
     */
    public void setTimeItemList(com.netsuite.webservices.activities.scheduling_2019_1.TaskTimeItemList timeItemList) {
        this.timeItemList = timeItemList;
    }


    /**
     * Gets the customFieldList value for this Task.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Task.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Task.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Task.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Task.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Task.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.supportCase==null && other.getSupportCase()==null) || 
             (this.supportCase!=null &&
              this.supportCase.equals(other.getSupportCase()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction()))) &&
            ((this.milestone==null && other.getMilestone()==null) || 
             (this.milestone!=null &&
              this.milestone.equals(other.getMilestone()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.timedEvent==null && other.getTimedEvent()==null) || 
             (this.timedEvent!=null &&
              this.timedEvent.equals(other.getTimedEvent()))) &&
            ((this.estimatedTime==null && other.getEstimatedTime()==null) || 
             (this.estimatedTime!=null &&
              this.estimatedTime.equals(other.getEstimatedTime()))) &&
            ((this.estimatedTimeOverride==null && other.getEstimatedTimeOverride()==null) || 
             (this.estimatedTimeOverride!=null &&
              this.estimatedTimeOverride.equals(other.getEstimatedTimeOverride()))) &&
            ((this.actualTime==null && other.getActualTime()==null) || 
             (this.actualTime!=null &&
              this.actualTime.equals(other.getActualTime()))) &&
            ((this.timeRemaining==null && other.getTimeRemaining()==null) || 
             (this.timeRemaining!=null &&
              this.timeRemaining.equals(other.getTimeRemaining()))) &&
            ((this.percentTimeComplete==null && other.getPercentTimeComplete()==null) || 
             (this.percentTimeComplete!=null &&
              this.percentTimeComplete.equals(other.getPercentTimeComplete()))) &&
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              this.percentComplete.equals(other.getPercentComplete()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel()))) &&
            ((this.reminderType==null && other.getReminderType()==null) || 
             (this.reminderType!=null &&
              this.reminderType.equals(other.getReminderType()))) &&
            ((this.reminderMinutes==null && other.getReminderMinutes()==null) || 
             (this.reminderMinutes!=null &&
              this.reminderMinutes.equals(other.getReminderMinutes()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.contactList==null && other.getContactList()==null) || 
             (this.contactList!=null &&
              this.contactList.equals(other.getContactList()))) &&
            ((this.timeItemList==null && other.getTimeItemList()==null) || 
             (this.timeItemList!=null &&
              this.timeItemList.equals(other.getTimeItemList()))) &&
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
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getSupportCase() != null) {
            _hashCode += getSupportCase().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        if (getMilestone() != null) {
            _hashCode += getMilestone().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        if (getTimedEvent() != null) {
            _hashCode += getTimedEvent().hashCode();
        }
        if (getEstimatedTime() != null) {
            _hashCode += getEstimatedTime().hashCode();
        }
        if (getEstimatedTimeOverride() != null) {
            _hashCode += getEstimatedTimeOverride().hashCode();
        }
        if (getActualTime() != null) {
            _hashCode += getActualTime().hashCode();
        }
        if (getTimeRemaining() != null) {
            _hashCode += getTimeRemaining().hashCode();
        }
        if (getPercentTimeComplete() != null) {
            _hashCode += getPercentTimeComplete().hashCode();
        }
        if (getPercentComplete() != null) {
            _hashCode += getPercentComplete().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        if (getReminderType() != null) {
            _hashCode += getReminderType().hashCode();
        }
        if (getReminderMinutes() != null) {
            _hashCode += getReminderMinutes().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getContactList() != null) {
            _hashCode += getContactList().hashCode();
        }
        if (getTimeItemList() != null) {
            _hashCode += getTimeItemList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Task.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "Task"));
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
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportCase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "supportCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "milestone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timedEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "timedEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "completedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "TaskPriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "TaskStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "reminderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "TaskReminderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "reminderMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "TaskReminderMinutes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "contactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "TaskContactList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "timeItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "TaskTimeItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "customFieldList"));
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
