/**
 * ProjectTaskSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ProjectTaskSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assignee;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField company;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField constraintType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBaseBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBaseVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costVariancePercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDateBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField endDateVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkVariancePercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField finishByDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField id;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isMilestone;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSummaryTask;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField nonBillableTask;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField owner;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField percentWorkComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField predecessor;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField predecessors;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField priority;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField remainingWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDateBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField startDateVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField successor;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField title;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public ProjectTaskSearchBasic() {
    }

    public ProjectTaskSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualWork,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assignee,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField company,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField constraintType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField contact,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBase,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBaseBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBaseVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costVariancePercent,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDateBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField endDateVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWork,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkVariancePercent,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField finishByDate,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField id,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isMilestone,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSummaryTask,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField nonBillableTask,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField owner,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField percentWorkComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField predecessor,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField predecessors,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField priority,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField remainingWork,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDateBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField startDateVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField successor,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField title,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.actualWork = actualWork;
        this.assignee = assignee;
        this.company = company;
        this.constraintType = constraintType;
        this.contact = contact;
        this.cost = cost;
        this.costBase = costBase;
        this.costBaseBaseline = costBaseBaseline;
        this.costBaseline = costBaseline;
        this.costBaseVariance = costBaseVariance;
        this.costVariance = costVariance;
        this.costVariancePercent = costVariancePercent;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.endDateBaseline = endDateBaseline;
        this.endDateVariance = endDateVariance;
        this.estimatedWork = estimatedWork;
        this.estimatedWorkBaseline = estimatedWorkBaseline;
        this.estimatedWorkVariance = estimatedWorkVariance;
        this.estimatedWorkVariancePercent = estimatedWorkVariancePercent;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.finishByDate = finishByDate;
        this.id = id;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isMilestone = isMilestone;
        this.isSummaryTask = isSummaryTask;
        this.lastModifiedDate = lastModifiedDate;
        this.nonBillableTask = nonBillableTask;
        this.owner = owner;
        this.parent = parent;
        this.percentWorkComplete = percentWorkComplete;
        this.predecessor = predecessor;
        this.predecessors = predecessors;
        this.priority = priority;
        this.remainingWork = remainingWork;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.startDateVariance = startDateVariance;
        this.status = status;
        this.successor = successor;
        this.title = title;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the actualWork value for this ProjectTaskSearchBasic.
     * 
     * @return actualWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ProjectTaskSearchBasic.
     * 
     * @param actualWork
     */
    public void setActualWork(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualWork) {
        this.actualWork = actualWork;
    }


    /**
     * Gets the assignee value for this ProjectTaskSearchBasic.
     * 
     * @return assignee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAssignee() {
        return assignee;
    }


    /**
     * Sets the assignee value for this ProjectTaskSearchBasic.
     * 
     * @param assignee
     */
    public void setAssignee(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assignee) {
        this.assignee = assignee;
    }


    /**
     * Gets the company value for this ProjectTaskSearchBasic.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ProjectTaskSearchBasic.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField company) {
        this.company = company;
    }


    /**
     * Gets the constraintType value for this ProjectTaskSearchBasic.
     * 
     * @return constraintType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getConstraintType() {
        return constraintType;
    }


    /**
     * Sets the constraintType value for this ProjectTaskSearchBasic.
     * 
     * @param constraintType
     */
    public void setConstraintType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField constraintType) {
        this.constraintType = constraintType;
    }


    /**
     * Gets the contact value for this ProjectTaskSearchBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ProjectTaskSearchBasic.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField contact) {
        this.contact = contact;
    }


    /**
     * Gets the cost value for this ProjectTaskSearchBasic.
     * 
     * @return cost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ProjectTaskSearchBasic.
     * 
     * @param cost
     */
    public void setCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost) {
        this.cost = cost;
    }


    /**
     * Gets the costBase value for this ProjectTaskSearchBasic.
     * 
     * @return costBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostBase() {
        return costBase;
    }


    /**
     * Sets the costBase value for this ProjectTaskSearchBasic.
     * 
     * @param costBase
     */
    public void setCostBase(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBase) {
        this.costBase = costBase;
    }


    /**
     * Gets the costBaseBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return costBaseBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostBaseBaseline() {
        return costBaseBaseline;
    }


    /**
     * Sets the costBaseBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param costBaseBaseline
     */
    public void setCostBaseBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBaseBaseline) {
        this.costBaseBaseline = costBaseBaseline;
    }


    /**
     * Gets the costBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return costBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostBaseline() {
        return costBaseline;
    }


    /**
     * Sets the costBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param costBaseline
     */
    public void setCostBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBaseline) {
        this.costBaseline = costBaseline;
    }


    /**
     * Gets the costBaseVariance value for this ProjectTaskSearchBasic.
     * 
     * @return costBaseVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostBaseVariance() {
        return costBaseVariance;
    }


    /**
     * Sets the costBaseVariance value for this ProjectTaskSearchBasic.
     * 
     * @param costBaseVariance
     */
    public void setCostBaseVariance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBaseVariance) {
        this.costBaseVariance = costBaseVariance;
    }


    /**
     * Gets the costVariance value for this ProjectTaskSearchBasic.
     * 
     * @return costVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostVariance() {
        return costVariance;
    }


    /**
     * Sets the costVariance value for this ProjectTaskSearchBasic.
     * 
     * @param costVariance
     */
    public void setCostVariance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costVariance) {
        this.costVariance = costVariance;
    }


    /**
     * Gets the costVariancePercent value for this ProjectTaskSearchBasic.
     * 
     * @return costVariancePercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostVariancePercent() {
        return costVariancePercent;
    }


    /**
     * Sets the costVariancePercent value for this ProjectTaskSearchBasic.
     * 
     * @param costVariancePercent
     */
    public void setCostVariancePercent(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costVariancePercent) {
        this.costVariancePercent = costVariancePercent;
    }


    /**
     * Gets the createdDate value for this ProjectTaskSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProjectTaskSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the endDate value for this ProjectTaskSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTaskSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the endDateBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return endDateBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDateBaseline() {
        return endDateBaseline;
    }


    /**
     * Sets the endDateBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param endDateBaseline
     */
    public void setEndDateBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDateBaseline) {
        this.endDateBaseline = endDateBaseline;
    }


    /**
     * Gets the endDateVariance value for this ProjectTaskSearchBasic.
     * 
     * @return endDateVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEndDateVariance() {
        return endDateVariance;
    }


    /**
     * Sets the endDateVariance value for this ProjectTaskSearchBasic.
     * 
     * @param endDateVariance
     */
    public void setEndDateVariance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField endDateVariance) {
        this.endDateVariance = endDateVariance;
    }


    /**
     * Gets the estimatedWork value for this ProjectTaskSearchBasic.
     * 
     * @return estimatedWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTaskSearchBasic.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWork) {
        this.estimatedWork = estimatedWork;
    }


    /**
     * Gets the estimatedWorkBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return estimatedWorkBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }


    /**
     * Sets the estimatedWorkBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param estimatedWorkBaseline
     */
    public void setEstimatedWorkBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }


    /**
     * Gets the estimatedWorkVariance value for this ProjectTaskSearchBasic.
     * 
     * @return estimatedWorkVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedWorkVariance() {
        return estimatedWorkVariance;
    }


    /**
     * Sets the estimatedWorkVariance value for this ProjectTaskSearchBasic.
     * 
     * @param estimatedWorkVariance
     */
    public void setEstimatedWorkVariance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkVariance) {
        this.estimatedWorkVariance = estimatedWorkVariance;
    }


    /**
     * Gets the estimatedWorkVariancePercent value for this ProjectTaskSearchBasic.
     * 
     * @return estimatedWorkVariancePercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedWorkVariancePercent() {
        return estimatedWorkVariancePercent;
    }


    /**
     * Sets the estimatedWorkVariancePercent value for this ProjectTaskSearchBasic.
     * 
     * @param estimatedWorkVariancePercent
     */
    public void setEstimatedWorkVariancePercent(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkVariancePercent) {
        this.estimatedWorkVariancePercent = estimatedWorkVariancePercent;
    }


    /**
     * Gets the externalId value for this ProjectTaskSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ProjectTaskSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ProjectTaskSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ProjectTaskSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the finishByDate value for this ProjectTaskSearchBasic.
     * 
     * @return finishByDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getFinishByDate() {
        return finishByDate;
    }


    /**
     * Sets the finishByDate value for this ProjectTaskSearchBasic.
     * 
     * @param finishByDate
     */
    public void setFinishByDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField finishByDate) {
        this.finishByDate = finishByDate;
    }


    /**
     * Gets the id value for this ProjectTaskSearchBasic.
     * 
     * @return id
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getId() {
        return id;
    }


    /**
     * Sets the id value for this ProjectTaskSearchBasic.
     * 
     * @param id
     */
    public void setId(com.netsuite.webservices.platform.core_2019_1.SearchLongField id) {
        this.id = id;
    }


    /**
     * Gets the internalId value for this ProjectTaskSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ProjectTaskSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ProjectTaskSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ProjectTaskSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isMilestone value for this ProjectTaskSearchBasic.
     * 
     * @return isMilestone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsMilestone() {
        return isMilestone;
    }


    /**
     * Sets the isMilestone value for this ProjectTaskSearchBasic.
     * 
     * @param isMilestone
     */
    public void setIsMilestone(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isMilestone) {
        this.isMilestone = isMilestone;
    }


    /**
     * Gets the isSummaryTask value for this ProjectTaskSearchBasic.
     * 
     * @return isSummaryTask
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsSummaryTask() {
        return isSummaryTask;
    }


    /**
     * Sets the isSummaryTask value for this ProjectTaskSearchBasic.
     * 
     * @param isSummaryTask
     */
    public void setIsSummaryTask(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSummaryTask) {
        this.isSummaryTask = isSummaryTask;
    }


    /**
     * Gets the lastModifiedDate value for this ProjectTaskSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ProjectTaskSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the nonBillableTask value for this ProjectTaskSearchBasic.
     * 
     * @return nonBillableTask
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getNonBillableTask() {
        return nonBillableTask;
    }


    /**
     * Sets the nonBillableTask value for this ProjectTaskSearchBasic.
     * 
     * @param nonBillableTask
     */
    public void setNonBillableTask(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField nonBillableTask) {
        this.nonBillableTask = nonBillableTask;
    }


    /**
     * Gets the owner value for this ProjectTaskSearchBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ProjectTaskSearchBasic.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField owner) {
        this.owner = owner;
    }


    /**
     * Gets the parent value for this ProjectTaskSearchBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ProjectTaskSearchBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the percentWorkComplete value for this ProjectTaskSearchBasic.
     * 
     * @return percentWorkComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPercentWorkComplete() {
        return percentWorkComplete;
    }


    /**
     * Sets the percentWorkComplete value for this ProjectTaskSearchBasic.
     * 
     * @param percentWorkComplete
     */
    public void setPercentWorkComplete(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField percentWorkComplete) {
        this.percentWorkComplete = percentWorkComplete;
    }


    /**
     * Gets the predecessor value for this ProjectTaskSearchBasic.
     * 
     * @return predecessor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPredecessor() {
        return predecessor;
    }


    /**
     * Sets the predecessor value for this ProjectTaskSearchBasic.
     * 
     * @param predecessor
     */
    public void setPredecessor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField predecessor) {
        this.predecessor = predecessor;
    }


    /**
     * Gets the predecessors value for this ProjectTaskSearchBasic.
     * 
     * @return predecessors
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPredecessors() {
        return predecessors;
    }


    /**
     * Sets the predecessors value for this ProjectTaskSearchBasic.
     * 
     * @param predecessors
     */
    public void setPredecessors(com.netsuite.webservices.platform.core_2019_1.SearchStringField predecessors) {
        this.predecessors = predecessors;
    }


    /**
     * Gets the priority value for this ProjectTaskSearchBasic.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ProjectTaskSearchBasic.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField priority) {
        this.priority = priority;
    }


    /**
     * Gets the remainingWork value for this ProjectTaskSearchBasic.
     * 
     * @return remainingWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRemainingWork() {
        return remainingWork;
    }


    /**
     * Sets the remainingWork value for this ProjectTaskSearchBasic.
     * 
     * @param remainingWork
     */
    public void setRemainingWork(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField remainingWork) {
        this.remainingWork = remainingWork;
    }


    /**
     * Gets the startDate value for this ProjectTaskSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTaskSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startDateBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return startDateBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }


    /**
     * Gets the startDateVariance value for this ProjectTaskSearchBasic.
     * 
     * @return startDateVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getStartDateVariance() {
        return startDateVariance;
    }


    /**
     * Sets the startDateVariance value for this ProjectTaskSearchBasic.
     * 
     * @param startDateVariance
     */
    public void setStartDateVariance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField startDateVariance) {
        this.startDateVariance = startDateVariance;
    }


    /**
     * Gets the status value for this ProjectTaskSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProjectTaskSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the successor value for this ProjectTaskSearchBasic.
     * 
     * @return successor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSuccessor() {
        return successor;
    }


    /**
     * Sets the successor value for this ProjectTaskSearchBasic.
     * 
     * @param successor
     */
    public void setSuccessor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField successor) {
        this.successor = successor;
    }


    /**
     * Gets the title value for this ProjectTaskSearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProjectTaskSearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the customFieldList value for this ProjectTaskSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ProjectTaskSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskSearchBasic)) return false;
        ProjectTaskSearchBasic other = (ProjectTaskSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualWork==null && other.getActualWork()==null) || 
             (this.actualWork!=null &&
              this.actualWork.equals(other.getActualWork()))) &&
            ((this.assignee==null && other.getAssignee()==null) || 
             (this.assignee!=null &&
              this.assignee.equals(other.getAssignee()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.constraintType==null && other.getConstraintType()==null) || 
             (this.constraintType!=null &&
              this.constraintType.equals(other.getConstraintType()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.costBase==null && other.getCostBase()==null) || 
             (this.costBase!=null &&
              this.costBase.equals(other.getCostBase()))) &&
            ((this.costBaseBaseline==null && other.getCostBaseBaseline()==null) || 
             (this.costBaseBaseline!=null &&
              this.costBaseBaseline.equals(other.getCostBaseBaseline()))) &&
            ((this.costBaseline==null && other.getCostBaseline()==null) || 
             (this.costBaseline!=null &&
              this.costBaseline.equals(other.getCostBaseline()))) &&
            ((this.costBaseVariance==null && other.getCostBaseVariance()==null) || 
             (this.costBaseVariance!=null &&
              this.costBaseVariance.equals(other.getCostBaseVariance()))) &&
            ((this.costVariance==null && other.getCostVariance()==null) || 
             (this.costVariance!=null &&
              this.costVariance.equals(other.getCostVariance()))) &&
            ((this.costVariancePercent==null && other.getCostVariancePercent()==null) || 
             (this.costVariancePercent!=null &&
              this.costVariancePercent.equals(other.getCostVariancePercent()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.endDateBaseline==null && other.getEndDateBaseline()==null) || 
             (this.endDateBaseline!=null &&
              this.endDateBaseline.equals(other.getEndDateBaseline()))) &&
            ((this.endDateVariance==null && other.getEndDateVariance()==null) || 
             (this.endDateVariance!=null &&
              this.endDateVariance.equals(other.getEndDateVariance()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              this.estimatedWork.equals(other.getEstimatedWork()))) &&
            ((this.estimatedWorkBaseline==null && other.getEstimatedWorkBaseline()==null) || 
             (this.estimatedWorkBaseline!=null &&
              this.estimatedWorkBaseline.equals(other.getEstimatedWorkBaseline()))) &&
            ((this.estimatedWorkVariance==null && other.getEstimatedWorkVariance()==null) || 
             (this.estimatedWorkVariance!=null &&
              this.estimatedWorkVariance.equals(other.getEstimatedWorkVariance()))) &&
            ((this.estimatedWorkVariancePercent==null && other.getEstimatedWorkVariancePercent()==null) || 
             (this.estimatedWorkVariancePercent!=null &&
              this.estimatedWorkVariancePercent.equals(other.getEstimatedWorkVariancePercent()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.finishByDate==null && other.getFinishByDate()==null) || 
             (this.finishByDate!=null &&
              this.finishByDate.equals(other.getFinishByDate()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isMilestone==null && other.getIsMilestone()==null) || 
             (this.isMilestone!=null &&
              this.isMilestone.equals(other.getIsMilestone()))) &&
            ((this.isSummaryTask==null && other.getIsSummaryTask()==null) || 
             (this.isSummaryTask!=null &&
              this.isSummaryTask.equals(other.getIsSummaryTask()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.nonBillableTask==null && other.getNonBillableTask()==null) || 
             (this.nonBillableTask!=null &&
              this.nonBillableTask.equals(other.getNonBillableTask()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.percentWorkComplete==null && other.getPercentWorkComplete()==null) || 
             (this.percentWorkComplete!=null &&
              this.percentWorkComplete.equals(other.getPercentWorkComplete()))) &&
            ((this.predecessor==null && other.getPredecessor()==null) || 
             (this.predecessor!=null &&
              this.predecessor.equals(other.getPredecessor()))) &&
            ((this.predecessors==null && other.getPredecessors()==null) || 
             (this.predecessors!=null &&
              this.predecessors.equals(other.getPredecessors()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.remainingWork==null && other.getRemainingWork()==null) || 
             (this.remainingWork!=null &&
              this.remainingWork.equals(other.getRemainingWork()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              this.startDateBaseline.equals(other.getStartDateBaseline()))) &&
            ((this.startDateVariance==null && other.getStartDateVariance()==null) || 
             (this.startDateVariance!=null &&
              this.startDateVariance.equals(other.getStartDateVariance()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.successor==null && other.getSuccessor()==null) || 
             (this.successor!=null &&
              this.successor.equals(other.getSuccessor()))) &&
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
        if (getActualWork() != null) {
            _hashCode += getActualWork().hashCode();
        }
        if (getAssignee() != null) {
            _hashCode += getAssignee().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getConstraintType() != null) {
            _hashCode += getConstraintType().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCostBase() != null) {
            _hashCode += getCostBase().hashCode();
        }
        if (getCostBaseBaseline() != null) {
            _hashCode += getCostBaseBaseline().hashCode();
        }
        if (getCostBaseline() != null) {
            _hashCode += getCostBaseline().hashCode();
        }
        if (getCostBaseVariance() != null) {
            _hashCode += getCostBaseVariance().hashCode();
        }
        if (getCostVariance() != null) {
            _hashCode += getCostVariance().hashCode();
        }
        if (getCostVariancePercent() != null) {
            _hashCode += getCostVariancePercent().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEndDateBaseline() != null) {
            _hashCode += getEndDateBaseline().hashCode();
        }
        if (getEndDateVariance() != null) {
            _hashCode += getEndDateVariance().hashCode();
        }
        if (getEstimatedWork() != null) {
            _hashCode += getEstimatedWork().hashCode();
        }
        if (getEstimatedWorkBaseline() != null) {
            _hashCode += getEstimatedWorkBaseline().hashCode();
        }
        if (getEstimatedWorkVariance() != null) {
            _hashCode += getEstimatedWorkVariance().hashCode();
        }
        if (getEstimatedWorkVariancePercent() != null) {
            _hashCode += getEstimatedWorkVariancePercent().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFinishByDate() != null) {
            _hashCode += getFinishByDate().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsMilestone() != null) {
            _hashCode += getIsMilestone().hashCode();
        }
        if (getIsSummaryTask() != null) {
            _hashCode += getIsSummaryTask().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getNonBillableTask() != null) {
            _hashCode += getNonBillableTask().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPercentWorkComplete() != null) {
            _hashCode += getPercentWorkComplete().hashCode();
        }
        if (getPredecessor() != null) {
            _hashCode += getPredecessor().hashCode();
        }
        if (getPredecessors() != null) {
            _hashCode += getPredecessors().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRemainingWork() != null) {
            _hashCode += getRemainingWork().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartDateBaseline() != null) {
            _hashCode += getStartDateBaseline().hashCode();
        }
        if (getStartDateVariance() != null) {
            _hashCode += getStartDateVariance().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSuccessor() != null) {
            _hashCode += getSuccessor().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProjectTaskSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assignee"));
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
        elemField.setFieldName("constraintType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "constraintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBaseBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBaseVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costVariancePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costVariancePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("endDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDateVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWorkVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkVariancePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWorkVariancePercent"));
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
        elemField.setFieldName("finishByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "finishByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("isMilestone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isMilestone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSummaryTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSummaryTask"));
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
        elemField.setFieldName("nonBillableTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nonBillableTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentWorkComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "percentWorkComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "predecessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "predecessors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDateVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("successor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "successor"));
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
