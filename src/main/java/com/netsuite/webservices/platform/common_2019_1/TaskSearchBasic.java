/**
 * TaskSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TaskSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assigned;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField company;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField completedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTimeOverride;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isJobSummaryTask;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isJobTask;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPrivate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField milestone;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField owner;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField percentComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField percentTimeComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField priority;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField timeRemaining;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField title;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public TaskSearchBasic() {
    }

    public TaskSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualTime,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assigned,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField company,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField completedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField contact,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTime,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTimeOverride,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isJobSummaryTask,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isJobTask,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPrivate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField milestone,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField owner,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField percentComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField percentTimeComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField priority,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField timeRemaining,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField title,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.actualTime = actualTime;
        this.assigned = assigned;
        this.company = company;
        this.completedDate = completedDate;
        this.contact = contact;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.estimatedTime = estimatedTime;
        this.estimatedTimeOverride = estimatedTimeOverride;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isJobSummaryTask = isJobSummaryTask;
        this.isJobTask = isJobTask;
        this.isPrivate = isPrivate;
        this.lastModifiedDate = lastModifiedDate;
        this.milestone = milestone;
        this.owner = owner;
        this.percentComplete = percentComplete;
        this.percentTimeComplete = percentTimeComplete;
        this.priority = priority;
        this.startDate = startDate;
        this.status = status;
        this.timeRemaining = timeRemaining;
        this.title = title;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the actualTime value for this TaskSearchBasic.
     * 
     * @return actualTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getActualTime() {
        return actualTime;
    }


    /**
     * Sets the actualTime value for this TaskSearchBasic.
     * 
     * @param actualTime
     */
    public void setActualTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualTime) {
        this.actualTime = actualTime;
    }


    /**
     * Gets the assigned value for this TaskSearchBasic.
     * 
     * @return assigned
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this TaskSearchBasic.
     * 
     * @param assigned
     */
    public void setAssigned(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the company value for this TaskSearchBasic.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCompany() {
        return company;
    }


    /**
     * Sets the company value for this TaskSearchBasic.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField company) {
        this.company = company;
    }


    /**
     * Gets the completedDate value for this TaskSearchBasic.
     * 
     * @return completedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this TaskSearchBasic.
     * 
     * @param completedDate
     */
    public void setCompletedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the contact value for this TaskSearchBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this TaskSearchBasic.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField contact) {
        this.contact = contact;
    }


    /**
     * Gets the createdDate value for this TaskSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TaskSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the endDate value for this TaskSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TaskSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the estimatedTime value for this TaskSearchBasic.
     * 
     * @return estimatedTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedTime() {
        return estimatedTime;
    }


    /**
     * Sets the estimatedTime value for this TaskSearchBasic.
     * 
     * @param estimatedTime
     */
    public void setEstimatedTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTime) {
        this.estimatedTime = estimatedTime;
    }


    /**
     * Gets the estimatedTimeOverride value for this TaskSearchBasic.
     * 
     * @return estimatedTimeOverride
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }


    /**
     * Sets the estimatedTimeOverride value for this TaskSearchBasic.
     * 
     * @param estimatedTimeOverride
     */
    public void setEstimatedTimeOverride(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }


    /**
     * Gets the externalId value for this TaskSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TaskSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TaskSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TaskSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this TaskSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TaskSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TaskSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TaskSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isJobSummaryTask value for this TaskSearchBasic.
     * 
     * @return isJobSummaryTask
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsJobSummaryTask() {
        return isJobSummaryTask;
    }


    /**
     * Sets the isJobSummaryTask value for this TaskSearchBasic.
     * 
     * @param isJobSummaryTask
     */
    public void setIsJobSummaryTask(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isJobSummaryTask) {
        this.isJobSummaryTask = isJobSummaryTask;
    }


    /**
     * Gets the isJobTask value for this TaskSearchBasic.
     * 
     * @return isJobTask
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsJobTask() {
        return isJobTask;
    }


    /**
     * Sets the isJobTask value for this TaskSearchBasic.
     * 
     * @param isJobTask
     */
    public void setIsJobTask(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isJobTask) {
        this.isJobTask = isJobTask;
    }


    /**
     * Gets the isPrivate value for this TaskSearchBasic.
     * 
     * @return isPrivate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsPrivate() {
        return isPrivate;
    }


    /**
     * Sets the isPrivate value for this TaskSearchBasic.
     * 
     * @param isPrivate
     */
    public void setIsPrivate(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPrivate) {
        this.isPrivate = isPrivate;
    }


    /**
     * Gets the lastModifiedDate value for this TaskSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this TaskSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the milestone value for this TaskSearchBasic.
     * 
     * @return milestone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getMilestone() {
        return milestone;
    }


    /**
     * Sets the milestone value for this TaskSearchBasic.
     * 
     * @param milestone
     */
    public void setMilestone(com.netsuite.webservices.platform.core_2019_1.SearchLongField milestone) {
        this.milestone = milestone;
    }


    /**
     * Gets the owner value for this TaskSearchBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this TaskSearchBasic.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField owner) {
        this.owner = owner;
    }


    /**
     * Gets the percentComplete value for this TaskSearchBasic.
     * 
     * @return percentComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this TaskSearchBasic.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(com.netsuite.webservices.platform.core_2019_1.SearchLongField percentComplete) {
        this.percentComplete = percentComplete;
    }


    /**
     * Gets the percentTimeComplete value for this TaskSearchBasic.
     * 
     * @return percentTimeComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPercentTimeComplete() {
        return percentTimeComplete;
    }


    /**
     * Sets the percentTimeComplete value for this TaskSearchBasic.
     * 
     * @param percentTimeComplete
     */
    public void setPercentTimeComplete(com.netsuite.webservices.platform.core_2019_1.SearchLongField percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }


    /**
     * Gets the priority value for this TaskSearchBasic.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this TaskSearchBasic.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField priority) {
        this.priority = priority;
    }


    /**
     * Gets the startDate value for this TaskSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TaskSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this TaskSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TaskSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the timeRemaining value for this TaskSearchBasic.
     * 
     * @return timeRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTimeRemaining() {
        return timeRemaining;
    }


    /**
     * Sets the timeRemaining value for this TaskSearchBasic.
     * 
     * @param timeRemaining
     */
    public void setTimeRemaining(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField timeRemaining) {
        this.timeRemaining = timeRemaining;
    }


    /**
     * Gets the title value for this TaskSearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TaskSearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the customFieldList value for this TaskSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TaskSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskSearchBasic)) return false;
        TaskSearchBasic other = (TaskSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualTime==null && other.getActualTime()==null) || 
             (this.actualTime!=null &&
              this.actualTime.equals(other.getActualTime()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.estimatedTime==null && other.getEstimatedTime()==null) || 
             (this.estimatedTime!=null &&
              this.estimatedTime.equals(other.getEstimatedTime()))) &&
            ((this.estimatedTimeOverride==null && other.getEstimatedTimeOverride()==null) || 
             (this.estimatedTimeOverride!=null &&
              this.estimatedTimeOverride.equals(other.getEstimatedTimeOverride()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isJobSummaryTask==null && other.getIsJobSummaryTask()==null) || 
             (this.isJobSummaryTask!=null &&
              this.isJobSummaryTask.equals(other.getIsJobSummaryTask()))) &&
            ((this.isJobTask==null && other.getIsJobTask()==null) || 
             (this.isJobTask!=null &&
              this.isJobTask.equals(other.getIsJobTask()))) &&
            ((this.isPrivate==null && other.getIsPrivate()==null) || 
             (this.isPrivate!=null &&
              this.isPrivate.equals(other.getIsPrivate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.milestone==null && other.getMilestone()==null) || 
             (this.milestone!=null &&
              this.milestone.equals(other.getMilestone()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              this.percentComplete.equals(other.getPercentComplete()))) &&
            ((this.percentTimeComplete==null && other.getPercentTimeComplete()==null) || 
             (this.percentTimeComplete!=null &&
              this.percentTimeComplete.equals(other.getPercentTimeComplete()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.timeRemaining==null && other.getTimeRemaining()==null) || 
             (this.timeRemaining!=null &&
              this.timeRemaining.equals(other.getTimeRemaining()))) &&
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
        if (getActualTime() != null) {
            _hashCode += getActualTime().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEstimatedTime() != null) {
            _hashCode += getEstimatedTime().hashCode();
        }
        if (getEstimatedTimeOverride() != null) {
            _hashCode += getEstimatedTimeOverride().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsJobSummaryTask() != null) {
            _hashCode += getIsJobSummaryTask().hashCode();
        }
        if (getIsJobTask() != null) {
            _hashCode += getIsJobTask().hashCode();
        }
        if (getIsPrivate() != null) {
            _hashCode += getIsPrivate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getMilestone() != null) {
            _hashCode += getMilestone().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getPercentComplete() != null) {
            _hashCode += getPercentComplete().hashCode();
        }
        if (getPercentTimeComplete() != null) {
            _hashCode += getPercentTimeComplete().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTimeRemaining() != null) {
            _hashCode += getTimeRemaining().hashCode();
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
        new org.apache.axis.description.TypeDesc(TaskSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaskSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "completedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("isJobSummaryTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isJobSummaryTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isJobTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isJobTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPrivate"));
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
        elemField.setFieldName("milestone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "milestone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priority"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
