/**
 * ProjectTask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2019_1;

public class ProjectTask  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef eventId;

    private java.lang.Double percentTimeComplete;

    private java.lang.String title;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef company;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef contact;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef order;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef owner;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef priority;

    private java.lang.Double estimatedWork;

    private java.lang.Double estimatedWorkBaseline;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskConstraintType constraintType;

    private java.util.Calendar startDate;

    private java.util.Calendar startDateBaseline;

    private java.util.Calendar endDate;

    private java.util.Calendar finishByDate;

    private java.util.Calendar endDateBaseline;

    private java.lang.Double actualWork;

    private java.lang.Double remainingWork;

    private java.lang.String message;

    private java.lang.Boolean isMilestone;

    private java.lang.String isOnCriticalPath;

    private java.lang.Double slackMinutes;

    private java.util.Calendar lateEnd;

    private java.util.Calendar lateStart;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskStatus status;

    private java.lang.Boolean nonBillableTask;

    private com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskAssigneeList assigneeList;

    private com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessorList predecessorList;

    private com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskTimeItemList timeItemList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public ProjectTask() {
    }

    public ProjectTask(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef eventId,
           java.lang.Double percentTimeComplete,
           java.lang.String title,
           com.netsuite.webservices.platform.core_2019_1.RecordRef company,
           com.netsuite.webservices.platform.core_2019_1.RecordRef contact,
           com.netsuite.webservices.platform.core_2019_1.RecordRef order,
           com.netsuite.webservices.platform.core_2019_1.RecordRef owner,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           com.netsuite.webservices.platform.core_2019_1.RecordRef priority,
           java.lang.Double estimatedWork,
           java.lang.Double estimatedWorkBaseline,
           com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskConstraintType constraintType,
           java.util.Calendar startDate,
           java.util.Calendar startDateBaseline,
           java.util.Calendar endDate,
           java.util.Calendar finishByDate,
           java.util.Calendar endDateBaseline,
           java.lang.Double actualWork,
           java.lang.Double remainingWork,
           java.lang.String message,
           java.lang.Boolean isMilestone,
           java.lang.String isOnCriticalPath,
           java.lang.Double slackMinutes,
           java.util.Calendar lateEnd,
           java.util.Calendar lateStart,
           com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskStatus status,
           java.lang.Boolean nonBillableTask,
           com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskAssigneeList assigneeList,
           com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessorList predecessorList,
           com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskTimeItemList timeItemList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.eventId = eventId;
        this.percentTimeComplete = percentTimeComplete;
        this.title = title;
        this.company = company;
        this.contact = contact;
        this.order = order;
        this.owner = owner;
        this.parent = parent;
        this.priority = priority;
        this.estimatedWork = estimatedWork;
        this.estimatedWorkBaseline = estimatedWorkBaseline;
        this.constraintType = constraintType;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.endDate = endDate;
        this.finishByDate = finishByDate;
        this.endDateBaseline = endDateBaseline;
        this.actualWork = actualWork;
        this.remainingWork = remainingWork;
        this.message = message;
        this.isMilestone = isMilestone;
        this.isOnCriticalPath = isOnCriticalPath;
        this.slackMinutes = slackMinutes;
        this.lateEnd = lateEnd;
        this.lateStart = lateStart;
        this.status = status;
        this.nonBillableTask = nonBillableTask;
        this.assigneeList = assigneeList;
        this.predecessorList = predecessorList;
        this.timeItemList = timeItemList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this ProjectTask.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this ProjectTask.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the eventId value for this ProjectTask.
     * 
     * @return eventId
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this ProjectTask.
     * 
     * @param eventId
     */
    public void setEventId(com.netsuite.webservices.platform.core_2019_1.RecordRef eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the percentTimeComplete value for this ProjectTask.
     * 
     * @return percentTimeComplete
     */
    public java.lang.Double getPercentTimeComplete() {
        return percentTimeComplete;
    }


    /**
     * Sets the percentTimeComplete value for this ProjectTask.
     * 
     * @param percentTimeComplete
     */
    public void setPercentTimeComplete(java.lang.Double percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }


    /**
     * Gets the title value for this ProjectTask.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProjectTask.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the company value for this ProjectTask.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ProjectTask.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.RecordRef company) {
        this.company = company;
    }


    /**
     * Gets the contact value for this ProjectTask.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ProjectTask.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.RecordRef contact) {
        this.contact = contact;
    }


    /**
     * Gets the order value for this ProjectTask.
     * 
     * @return order
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOrder() {
        return order;
    }


    /**
     * Sets the order value for this ProjectTask.
     * 
     * @param order
     */
    public void setOrder(com.netsuite.webservices.platform.core_2019_1.RecordRef order) {
        this.order = order;
    }


    /**
     * Gets the owner value for this ProjectTask.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ProjectTask.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the parent value for this ProjectTask.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ProjectTask.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the priority value for this ProjectTask.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ProjectTask.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.RecordRef priority) {
        this.priority = priority;
    }


    /**
     * Gets the estimatedWork value for this ProjectTask.
     * 
     * @return estimatedWork
     */
    public java.lang.Double getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTask.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(java.lang.Double estimatedWork) {
        this.estimatedWork = estimatedWork;
    }


    /**
     * Gets the estimatedWorkBaseline value for this ProjectTask.
     * 
     * @return estimatedWorkBaseline
     */
    public java.lang.Double getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }


    /**
     * Sets the estimatedWorkBaseline value for this ProjectTask.
     * 
     * @param estimatedWorkBaseline
     */
    public void setEstimatedWorkBaseline(java.lang.Double estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }


    /**
     * Gets the constraintType value for this ProjectTask.
     * 
     * @return constraintType
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskConstraintType getConstraintType() {
        return constraintType;
    }


    /**
     * Sets the constraintType value for this ProjectTask.
     * 
     * @param constraintType
     */
    public void setConstraintType(com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskConstraintType constraintType) {
        this.constraintType = constraintType;
    }


    /**
     * Gets the startDate value for this ProjectTask.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTask.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startDateBaseline value for this ProjectTask.
     * 
     * @return startDateBaseline
     */
    public java.util.Calendar getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this ProjectTask.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(java.util.Calendar startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }


    /**
     * Gets the endDate value for this ProjectTask.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTask.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the finishByDate value for this ProjectTask.
     * 
     * @return finishByDate
     */
    public java.util.Calendar getFinishByDate() {
        return finishByDate;
    }


    /**
     * Sets the finishByDate value for this ProjectTask.
     * 
     * @param finishByDate
     */
    public void setFinishByDate(java.util.Calendar finishByDate) {
        this.finishByDate = finishByDate;
    }


    /**
     * Gets the endDateBaseline value for this ProjectTask.
     * 
     * @return endDateBaseline
     */
    public java.util.Calendar getEndDateBaseline() {
        return endDateBaseline;
    }


    /**
     * Sets the endDateBaseline value for this ProjectTask.
     * 
     * @param endDateBaseline
     */
    public void setEndDateBaseline(java.util.Calendar endDateBaseline) {
        this.endDateBaseline = endDateBaseline;
    }


    /**
     * Gets the actualWork value for this ProjectTask.
     * 
     * @return actualWork
     */
    public java.lang.Double getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ProjectTask.
     * 
     * @param actualWork
     */
    public void setActualWork(java.lang.Double actualWork) {
        this.actualWork = actualWork;
    }


    /**
     * Gets the remainingWork value for this ProjectTask.
     * 
     * @return remainingWork
     */
    public java.lang.Double getRemainingWork() {
        return remainingWork;
    }


    /**
     * Sets the remainingWork value for this ProjectTask.
     * 
     * @param remainingWork
     */
    public void setRemainingWork(java.lang.Double remainingWork) {
        this.remainingWork = remainingWork;
    }


    /**
     * Gets the message value for this ProjectTask.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ProjectTask.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the isMilestone value for this ProjectTask.
     * 
     * @return isMilestone
     */
    public java.lang.Boolean getIsMilestone() {
        return isMilestone;
    }


    /**
     * Sets the isMilestone value for this ProjectTask.
     * 
     * @param isMilestone
     */
    public void setIsMilestone(java.lang.Boolean isMilestone) {
        this.isMilestone = isMilestone;
    }


    /**
     * Gets the isOnCriticalPath value for this ProjectTask.
     * 
     * @return isOnCriticalPath
     */
    public java.lang.String getIsOnCriticalPath() {
        return isOnCriticalPath;
    }


    /**
     * Sets the isOnCriticalPath value for this ProjectTask.
     * 
     * @param isOnCriticalPath
     */
    public void setIsOnCriticalPath(java.lang.String isOnCriticalPath) {
        this.isOnCriticalPath = isOnCriticalPath;
    }


    /**
     * Gets the slackMinutes value for this ProjectTask.
     * 
     * @return slackMinutes
     */
    public java.lang.Double getSlackMinutes() {
        return slackMinutes;
    }


    /**
     * Sets the slackMinutes value for this ProjectTask.
     * 
     * @param slackMinutes
     */
    public void setSlackMinutes(java.lang.Double slackMinutes) {
        this.slackMinutes = slackMinutes;
    }


    /**
     * Gets the lateEnd value for this ProjectTask.
     * 
     * @return lateEnd
     */
    public java.util.Calendar getLateEnd() {
        return lateEnd;
    }


    /**
     * Sets the lateEnd value for this ProjectTask.
     * 
     * @param lateEnd
     */
    public void setLateEnd(java.util.Calendar lateEnd) {
        this.lateEnd = lateEnd;
    }


    /**
     * Gets the lateStart value for this ProjectTask.
     * 
     * @return lateStart
     */
    public java.util.Calendar getLateStart() {
        return lateStart;
    }


    /**
     * Sets the lateStart value for this ProjectTask.
     * 
     * @param lateStart
     */
    public void setLateStart(java.util.Calendar lateStart) {
        this.lateStart = lateStart;
    }


    /**
     * Gets the status value for this ProjectTask.
     * 
     * @return status
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProjectTask.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskStatus status) {
        this.status = status;
    }


    /**
     * Gets the nonBillableTask value for this ProjectTask.
     * 
     * @return nonBillableTask
     */
    public java.lang.Boolean getNonBillableTask() {
        return nonBillableTask;
    }


    /**
     * Sets the nonBillableTask value for this ProjectTask.
     * 
     * @param nonBillableTask
     */
    public void setNonBillableTask(java.lang.Boolean nonBillableTask) {
        this.nonBillableTask = nonBillableTask;
    }


    /**
     * Gets the assigneeList value for this ProjectTask.
     * 
     * @return assigneeList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskAssigneeList getAssigneeList() {
        return assigneeList;
    }


    /**
     * Sets the assigneeList value for this ProjectTask.
     * 
     * @param assigneeList
     */
    public void setAssigneeList(com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskAssigneeList assigneeList) {
        this.assigneeList = assigneeList;
    }


    /**
     * Gets the predecessorList value for this ProjectTask.
     * 
     * @return predecessorList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessorList getPredecessorList() {
        return predecessorList;
    }


    /**
     * Sets the predecessorList value for this ProjectTask.
     * 
     * @param predecessorList
     */
    public void setPredecessorList(com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessorList predecessorList) {
        this.predecessorList = predecessorList;
    }


    /**
     * Gets the timeItemList value for this ProjectTask.
     * 
     * @return timeItemList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskTimeItemList getTimeItemList() {
        return timeItemList;
    }


    /**
     * Sets the timeItemList value for this ProjectTask.
     * 
     * @param timeItemList
     */
    public void setTimeItemList(com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskTimeItemList timeItemList) {
        this.timeItemList = timeItemList;
    }


    /**
     * Gets the customFieldList value for this ProjectTask.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ProjectTask.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this ProjectTask.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ProjectTask.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ProjectTask.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ProjectTask.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTask)) return false;
        ProjectTask other = (ProjectTask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            ((this.percentTimeComplete==null && other.getPercentTimeComplete()==null) || 
             (this.percentTimeComplete!=null &&
              this.percentTimeComplete.equals(other.getPercentTimeComplete()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              this.estimatedWork.equals(other.getEstimatedWork()))) &&
            ((this.estimatedWorkBaseline==null && other.getEstimatedWorkBaseline()==null) || 
             (this.estimatedWorkBaseline!=null &&
              this.estimatedWorkBaseline.equals(other.getEstimatedWorkBaseline()))) &&
            ((this.constraintType==null && other.getConstraintType()==null) || 
             (this.constraintType!=null &&
              this.constraintType.equals(other.getConstraintType()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              this.startDateBaseline.equals(other.getStartDateBaseline()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.finishByDate==null && other.getFinishByDate()==null) || 
             (this.finishByDate!=null &&
              this.finishByDate.equals(other.getFinishByDate()))) &&
            ((this.endDateBaseline==null && other.getEndDateBaseline()==null) || 
             (this.endDateBaseline!=null &&
              this.endDateBaseline.equals(other.getEndDateBaseline()))) &&
            ((this.actualWork==null && other.getActualWork()==null) || 
             (this.actualWork!=null &&
              this.actualWork.equals(other.getActualWork()))) &&
            ((this.remainingWork==null && other.getRemainingWork()==null) || 
             (this.remainingWork!=null &&
              this.remainingWork.equals(other.getRemainingWork()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.isMilestone==null && other.getIsMilestone()==null) || 
             (this.isMilestone!=null &&
              this.isMilestone.equals(other.getIsMilestone()))) &&
            ((this.isOnCriticalPath==null && other.getIsOnCriticalPath()==null) || 
             (this.isOnCriticalPath!=null &&
              this.isOnCriticalPath.equals(other.getIsOnCriticalPath()))) &&
            ((this.slackMinutes==null && other.getSlackMinutes()==null) || 
             (this.slackMinutes!=null &&
              this.slackMinutes.equals(other.getSlackMinutes()))) &&
            ((this.lateEnd==null && other.getLateEnd()==null) || 
             (this.lateEnd!=null &&
              this.lateEnd.equals(other.getLateEnd()))) &&
            ((this.lateStart==null && other.getLateStart()==null) || 
             (this.lateStart!=null &&
              this.lateStart.equals(other.getLateStart()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.nonBillableTask==null && other.getNonBillableTask()==null) || 
             (this.nonBillableTask!=null &&
              this.nonBillableTask.equals(other.getNonBillableTask()))) &&
            ((this.assigneeList==null && other.getAssigneeList()==null) || 
             (this.assigneeList!=null &&
              this.assigneeList.equals(other.getAssigneeList()))) &&
            ((this.predecessorList==null && other.getPredecessorList()==null) || 
             (this.predecessorList!=null &&
              this.predecessorList.equals(other.getPredecessorList()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        if (getPercentTimeComplete() != null) {
            _hashCode += getPercentTimeComplete().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getEstimatedWork() != null) {
            _hashCode += getEstimatedWork().hashCode();
        }
        if (getEstimatedWorkBaseline() != null) {
            _hashCode += getEstimatedWorkBaseline().hashCode();
        }
        if (getConstraintType() != null) {
            _hashCode += getConstraintType().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartDateBaseline() != null) {
            _hashCode += getStartDateBaseline().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getFinishByDate() != null) {
            _hashCode += getFinishByDate().hashCode();
        }
        if (getEndDateBaseline() != null) {
            _hashCode += getEndDateBaseline().hashCode();
        }
        if (getActualWork() != null) {
            _hashCode += getActualWork().hashCode();
        }
        if (getRemainingWork() != null) {
            _hashCode += getRemainingWork().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getIsMilestone() != null) {
            _hashCode += getIsMilestone().hashCode();
        }
        if (getIsOnCriticalPath() != null) {
            _hashCode += getIsOnCriticalPath().hashCode();
        }
        if (getSlackMinutes() != null) {
            _hashCode += getSlackMinutes().hashCode();
        }
        if (getLateEnd() != null) {
            _hashCode += getLateEnd().hashCode();
        }
        if (getLateStart() != null) {
            _hashCode += getLateStart().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getNonBillableTask() != null) {
            _hashCode += getNonBillableTask().hashCode();
        }
        if (getAssigneeList() != null) {
            _hashCode += getAssigneeList().hashCode();
        }
        if (getPredecessorList() != null) {
            _hashCode += getPredecessorList().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProjectTask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTask"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constraintType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "constraintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskConstraintType"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "startDateBaseline"));
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
        elemField.setFieldName("finishByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "finishByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "endDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("isMilestone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "isMilestone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnCriticalPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "isOnCriticalPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slackMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "slackMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "lateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "lateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonBillableTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "nonBillableTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigneeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "assigneeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskAssigneeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessorList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "predecessorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskPredecessorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "timeItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskTimeItemList"));
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
