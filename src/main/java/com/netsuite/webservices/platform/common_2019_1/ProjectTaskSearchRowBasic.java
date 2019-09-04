/**
 * ProjectTaskSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ProjectTaskSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] company;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] constraintType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBaseBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBaseVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costVariancePercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDateBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] endDateVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkVariancePercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] finishByDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isMilestone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSummaryTask;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] nonBillableTask;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] percentWorkComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] predecessor;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] predecessorLagDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] predecessors;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] predecessorType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] priority;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] remainingWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDateBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] startDateVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] successor;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] successorType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public ProjectTaskSearchRowBasic() {
    }

    public ProjectTaskSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualWork,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] company,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] constraintType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] contact,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBase,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBaseBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBaseVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costVariancePercent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDateBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] endDateVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWork,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkVariancePercent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] finishByDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isMilestone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSummaryTask,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] nonBillableTask,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] percentWorkComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] predecessor,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] predecessorLagDays,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] predecessors,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] predecessorType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] priority,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] remainingWork,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDateBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] startDateVariance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] successor,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] successorType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.actualWork = actualWork;
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
        this.finishByDate = finishByDate;
        this.id = id;
        this.internalId = internalId;
        this.isMilestone = isMilestone;
        this.isSummaryTask = isSummaryTask;
        this.lastModifiedDate = lastModifiedDate;
        this.message = message;
        this.nonBillableTask = nonBillableTask;
        this.owner = owner;
        this.parent = parent;
        this.percentWorkComplete = percentWorkComplete;
        this.predecessor = predecessor;
        this.predecessorLagDays = predecessorLagDays;
        this.predecessors = predecessors;
        this.predecessorType = predecessorType;
        this.priority = priority;
        this.remainingWork = remainingWork;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.startDateVariance = startDateVariance;
        this.status = status;
        this.successor = successor;
        this.successorType = successorType;
        this.title = title;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the actualWork value for this ProjectTaskSearchRowBasic.
     * 
     * @return actualWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ProjectTaskSearchRowBasic.
     * 
     * @param actualWork
     */
    public void setActualWork(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualWork) {
        this.actualWork = actualWork;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getActualWork(int i) {
        return this.actualWork[i];
    }

    public void setActualWork(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.actualWork[i] = _value;
    }


    /**
     * Gets the company value for this ProjectTaskSearchRowBasic.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ProjectTaskSearchRowBasic.
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
     * Gets the constraintType value for this ProjectTaskSearchRowBasic.
     * 
     * @return constraintType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getConstraintType() {
        return constraintType;
    }


    /**
     * Sets the constraintType value for this ProjectTaskSearchRowBasic.
     * 
     * @param constraintType
     */
    public void setConstraintType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] constraintType) {
        this.constraintType = constraintType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getConstraintType(int i) {
        return this.constraintType[i];
    }

    public void setConstraintType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.constraintType[i] = _value;
    }


    /**
     * Gets the contact value for this ProjectTaskSearchRowBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ProjectTaskSearchRowBasic.
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
     * Gets the cost value for this ProjectTaskSearchRowBasic.
     * 
     * @return cost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ProjectTaskSearchRowBasic.
     * 
     * @param cost
     */
    public void setCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost) {
        this.cost = cost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCost(int i) {
        return this.cost[i];
    }

    public void setCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.cost[i] = _value;
    }


    /**
     * Gets the costBase value for this ProjectTaskSearchRowBasic.
     * 
     * @return costBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostBase() {
        return costBase;
    }


    /**
     * Sets the costBase value for this ProjectTaskSearchRowBasic.
     * 
     * @param costBase
     */
    public void setCostBase(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBase) {
        this.costBase = costBase;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostBase(int i) {
        return this.costBase[i];
    }

    public void setCostBase(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costBase[i] = _value;
    }


    /**
     * Gets the costBaseBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return costBaseBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostBaseBaseline() {
        return costBaseBaseline;
    }


    /**
     * Sets the costBaseBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @param costBaseBaseline
     */
    public void setCostBaseBaseline(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBaseBaseline) {
        this.costBaseBaseline = costBaseBaseline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostBaseBaseline(int i) {
        return this.costBaseBaseline[i];
    }

    public void setCostBaseBaseline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costBaseBaseline[i] = _value;
    }


    /**
     * Gets the costBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return costBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostBaseline() {
        return costBaseline;
    }


    /**
     * Sets the costBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @param costBaseline
     */
    public void setCostBaseline(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBaseline) {
        this.costBaseline = costBaseline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostBaseline(int i) {
        return this.costBaseline[i];
    }

    public void setCostBaseline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costBaseline[i] = _value;
    }


    /**
     * Gets the costBaseVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return costBaseVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostBaseVariance() {
        return costBaseVariance;
    }


    /**
     * Sets the costBaseVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param costBaseVariance
     */
    public void setCostBaseVariance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBaseVariance) {
        this.costBaseVariance = costBaseVariance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostBaseVariance(int i) {
        return this.costBaseVariance[i];
    }

    public void setCostBaseVariance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costBaseVariance[i] = _value;
    }


    /**
     * Gets the costVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return costVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostVariance() {
        return costVariance;
    }


    /**
     * Sets the costVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param costVariance
     */
    public void setCostVariance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costVariance) {
        this.costVariance = costVariance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostVariance(int i) {
        return this.costVariance[i];
    }

    public void setCostVariance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costVariance[i] = _value;
    }


    /**
     * Gets the costVariancePercent value for this ProjectTaskSearchRowBasic.
     * 
     * @return costVariancePercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostVariancePercent() {
        return costVariancePercent;
    }


    /**
     * Sets the costVariancePercent value for this ProjectTaskSearchRowBasic.
     * 
     * @param costVariancePercent
     */
    public void setCostVariancePercent(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costVariancePercent) {
        this.costVariancePercent = costVariancePercent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostVariancePercent(int i) {
        return this.costVariancePercent[i];
    }

    public void setCostVariancePercent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costVariancePercent[i] = _value;
    }


    /**
     * Gets the createdDate value for this ProjectTaskSearchRowBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProjectTaskSearchRowBasic.
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
     * Gets the endDate value for this ProjectTaskSearchRowBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTaskSearchRowBasic.
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
     * Gets the endDateBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return endDateBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDateBaseline() {
        return endDateBaseline;
    }


    /**
     * Sets the endDateBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @param endDateBaseline
     */
    public void setEndDateBaseline(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDateBaseline) {
        this.endDateBaseline = endDateBaseline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEndDateBaseline(int i) {
        return this.endDateBaseline[i];
    }

    public void setEndDateBaseline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.endDateBaseline[i] = _value;
    }


    /**
     * Gets the endDateVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return endDateVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEndDateVariance() {
        return endDateVariance;
    }


    /**
     * Sets the endDateVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param endDateVariance
     */
    public void setEndDateVariance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] endDateVariance) {
        this.endDateVariance = endDateVariance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEndDateVariance(int i) {
        return this.endDateVariance[i];
    }

    public void setEndDateVariance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.endDateVariance[i] = _value;
    }


    /**
     * Gets the estimatedWork value for this ProjectTaskSearchRowBasic.
     * 
     * @return estimatedWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTaskSearchRowBasic.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstimatedWork(int i) {
        return this.estimatedWork[i];
    }

    public void setEstimatedWork(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estimatedWork[i] = _value;
    }


    /**
     * Gets the estimatedWorkBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return estimatedWorkBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }


    /**
     * Sets the estimatedWorkBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @param estimatedWorkBaseline
     */
    public void setEstimatedWorkBaseline(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstimatedWorkBaseline(int i) {
        return this.estimatedWorkBaseline[i];
    }

    public void setEstimatedWorkBaseline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estimatedWorkBaseline[i] = _value;
    }


    /**
     * Gets the estimatedWorkVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return estimatedWorkVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstimatedWorkVariance() {
        return estimatedWorkVariance;
    }


    /**
     * Sets the estimatedWorkVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param estimatedWorkVariance
     */
    public void setEstimatedWorkVariance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkVariance) {
        this.estimatedWorkVariance = estimatedWorkVariance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstimatedWorkVariance(int i) {
        return this.estimatedWorkVariance[i];
    }

    public void setEstimatedWorkVariance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estimatedWorkVariance[i] = _value;
    }


    /**
     * Gets the estimatedWorkVariancePercent value for this ProjectTaskSearchRowBasic.
     * 
     * @return estimatedWorkVariancePercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstimatedWorkVariancePercent() {
        return estimatedWorkVariancePercent;
    }


    /**
     * Sets the estimatedWorkVariancePercent value for this ProjectTaskSearchRowBasic.
     * 
     * @param estimatedWorkVariancePercent
     */
    public void setEstimatedWorkVariancePercent(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkVariancePercent) {
        this.estimatedWorkVariancePercent = estimatedWorkVariancePercent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstimatedWorkVariancePercent(int i) {
        return this.estimatedWorkVariancePercent[i];
    }

    public void setEstimatedWorkVariancePercent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estimatedWorkVariancePercent[i] = _value;
    }


    /**
     * Gets the externalId value for this ProjectTaskSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ProjectTaskSearchRowBasic.
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
     * Gets the finishByDate value for this ProjectTaskSearchRowBasic.
     * 
     * @return finishByDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getFinishByDate() {
        return finishByDate;
    }


    /**
     * Sets the finishByDate value for this ProjectTaskSearchRowBasic.
     * 
     * @param finishByDate
     */
    public void setFinishByDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] finishByDate) {
        this.finishByDate = finishByDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getFinishByDate(int i) {
        return this.finishByDate[i];
    }

    public void setFinishByDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.finishByDate[i] = _value;
    }


    /**
     * Gets the id value for this ProjectTaskSearchRowBasic.
     * 
     * @return id
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getId() {
        return id;
    }


    /**
     * Sets the id value for this ProjectTaskSearchRowBasic.
     * 
     * @param id
     */
    public void setId(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id) {
        this.id = id;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.id[i] = _value;
    }


    /**
     * Gets the internalId value for this ProjectTaskSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ProjectTaskSearchRowBasic.
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
     * Gets the isMilestone value for this ProjectTaskSearchRowBasic.
     * 
     * @return isMilestone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsMilestone() {
        return isMilestone;
    }


    /**
     * Sets the isMilestone value for this ProjectTaskSearchRowBasic.
     * 
     * @param isMilestone
     */
    public void setIsMilestone(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isMilestone) {
        this.isMilestone = isMilestone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsMilestone(int i) {
        return this.isMilestone[i];
    }

    public void setIsMilestone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isMilestone[i] = _value;
    }


    /**
     * Gets the isSummaryTask value for this ProjectTaskSearchRowBasic.
     * 
     * @return isSummaryTask
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsSummaryTask() {
        return isSummaryTask;
    }


    /**
     * Sets the isSummaryTask value for this ProjectTaskSearchRowBasic.
     * 
     * @param isSummaryTask
     */
    public void setIsSummaryTask(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSummaryTask) {
        this.isSummaryTask = isSummaryTask;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsSummaryTask(int i) {
        return this.isSummaryTask[i];
    }

    public void setIsSummaryTask(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isSummaryTask[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this ProjectTaskSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ProjectTaskSearchRowBasic.
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
     * Gets the message value for this ProjectTaskSearchRowBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ProjectTaskSearchRowBasic.
     * 
     * @param message
     */
    public void setMessage(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message) {
        this.message = message;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.message[i] = _value;
    }


    /**
     * Gets the nonBillableTask value for this ProjectTaskSearchRowBasic.
     * 
     * @return nonBillableTask
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getNonBillableTask() {
        return nonBillableTask;
    }


    /**
     * Sets the nonBillableTask value for this ProjectTaskSearchRowBasic.
     * 
     * @param nonBillableTask
     */
    public void setNonBillableTask(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] nonBillableTask) {
        this.nonBillableTask = nonBillableTask;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getNonBillableTask(int i) {
        return this.nonBillableTask[i];
    }

    public void setNonBillableTask(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.nonBillableTask[i] = _value;
    }


    /**
     * Gets the owner value for this ProjectTaskSearchRowBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ProjectTaskSearchRowBasic.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }


    /**
     * Gets the parent value for this ProjectTaskSearchRowBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ProjectTaskSearchRowBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }


    /**
     * Gets the percentWorkComplete value for this ProjectTaskSearchRowBasic.
     * 
     * @return percentWorkComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPercentWorkComplete() {
        return percentWorkComplete;
    }


    /**
     * Sets the percentWorkComplete value for this ProjectTaskSearchRowBasic.
     * 
     * @param percentWorkComplete
     */
    public void setPercentWorkComplete(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] percentWorkComplete) {
        this.percentWorkComplete = percentWorkComplete;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPercentWorkComplete(int i) {
        return this.percentWorkComplete[i];
    }

    public void setPercentWorkComplete(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.percentWorkComplete[i] = _value;
    }


    /**
     * Gets the predecessor value for this ProjectTaskSearchRowBasic.
     * 
     * @return predecessor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPredecessor() {
        return predecessor;
    }


    /**
     * Sets the predecessor value for this ProjectTaskSearchRowBasic.
     * 
     * @param predecessor
     */
    public void setPredecessor(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] predecessor) {
        this.predecessor = predecessor;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPredecessor(int i) {
        return this.predecessor[i];
    }

    public void setPredecessor(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.predecessor[i] = _value;
    }


    /**
     * Gets the predecessorLagDays value for this ProjectTaskSearchRowBasic.
     * 
     * @return predecessorLagDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPredecessorLagDays() {
        return predecessorLagDays;
    }


    /**
     * Sets the predecessorLagDays value for this ProjectTaskSearchRowBasic.
     * 
     * @param predecessorLagDays
     */
    public void setPredecessorLagDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] predecessorLagDays) {
        this.predecessorLagDays = predecessorLagDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPredecessorLagDays(int i) {
        return this.predecessorLagDays[i];
    }

    public void setPredecessorLagDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.predecessorLagDays[i] = _value;
    }


    /**
     * Gets the predecessors value for this ProjectTaskSearchRowBasic.
     * 
     * @return predecessors
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPredecessors() {
        return predecessors;
    }


    /**
     * Sets the predecessors value for this ProjectTaskSearchRowBasic.
     * 
     * @param predecessors
     */
    public void setPredecessors(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] predecessors) {
        this.predecessors = predecessors;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPredecessors(int i) {
        return this.predecessors[i];
    }

    public void setPredecessors(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.predecessors[i] = _value;
    }


    /**
     * Gets the predecessorType value for this ProjectTaskSearchRowBasic.
     * 
     * @return predecessorType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPredecessorType() {
        return predecessorType;
    }


    /**
     * Sets the predecessorType value for this ProjectTaskSearchRowBasic.
     * 
     * @param predecessorType
     */
    public void setPredecessorType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] predecessorType) {
        this.predecessorType = predecessorType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPredecessorType(int i) {
        return this.predecessorType[i];
    }

    public void setPredecessorType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.predecessorType[i] = _value;
    }


    /**
     * Gets the priority value for this ProjectTaskSearchRowBasic.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ProjectTaskSearchRowBasic.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] priority) {
        this.priority = priority;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getPriority(int i) {
        return this.priority[i];
    }

    public void setPriority(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.priority[i] = _value;
    }


    /**
     * Gets the remainingWork value for this ProjectTaskSearchRowBasic.
     * 
     * @return remainingWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRemainingWork() {
        return remainingWork;
    }


    /**
     * Sets the remainingWork value for this ProjectTaskSearchRowBasic.
     * 
     * @param remainingWork
     */
    public void setRemainingWork(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] remainingWork) {
        this.remainingWork = remainingWork;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRemainingWork(int i) {
        return this.remainingWork[i];
    }

    public void setRemainingWork(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.remainingWork[i] = _value;
    }


    /**
     * Gets the startDate value for this ProjectTaskSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTaskSearchRowBasic.
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
     * Gets the startDateBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return startDateBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getStartDateBaseline(int i) {
        return this.startDateBaseline[i];
    }

    public void setStartDateBaseline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.startDateBaseline[i] = _value;
    }


    /**
     * Gets the startDateVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return startDateVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getStartDateVariance() {
        return startDateVariance;
    }


    /**
     * Sets the startDateVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param startDateVariance
     */
    public void setStartDateVariance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] startDateVariance) {
        this.startDateVariance = startDateVariance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getStartDateVariance(int i) {
        return this.startDateVariance[i];
    }

    public void setStartDateVariance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.startDateVariance[i] = _value;
    }


    /**
     * Gets the status value for this ProjectTaskSearchRowBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProjectTaskSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status) {
        this.status = status;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the successor value for this ProjectTaskSearchRowBasic.
     * 
     * @return successor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSuccessor() {
        return successor;
    }


    /**
     * Sets the successor value for this ProjectTaskSearchRowBasic.
     * 
     * @param successor
     */
    public void setSuccessor(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] successor) {
        this.successor = successor;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSuccessor(int i) {
        return this.successor[i];
    }

    public void setSuccessor(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.successor[i] = _value;
    }


    /**
     * Gets the successorType value for this ProjectTaskSearchRowBasic.
     * 
     * @return successorType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSuccessorType() {
        return successorType;
    }


    /**
     * Sets the successorType value for this ProjectTaskSearchRowBasic.
     * 
     * @param successorType
     */
    public void setSuccessorType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] successorType) {
        this.successorType = successorType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSuccessorType(int i) {
        return this.successorType[i];
    }

    public void setSuccessorType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.successorType[i] = _value;
    }


    /**
     * Gets the title value for this ProjectTaskSearchRowBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProjectTaskSearchRowBasic.
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
     * Gets the customFieldList value for this ProjectTaskSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ProjectTaskSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskSearchRowBasic)) return false;
        ProjectTaskSearchRowBasic other = (ProjectTaskSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.actualWork, other.getActualWork()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              java.util.Arrays.equals(this.company, other.getCompany()))) &&
            ((this.constraintType==null && other.getConstraintType()==null) || 
             (this.constraintType!=null &&
              java.util.Arrays.equals(this.constraintType, other.getConstraintType()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              java.util.Arrays.equals(this.cost, other.getCost()))) &&
            ((this.costBase==null && other.getCostBase()==null) || 
             (this.costBase!=null &&
              java.util.Arrays.equals(this.costBase, other.getCostBase()))) &&
            ((this.costBaseBaseline==null && other.getCostBaseBaseline()==null) || 
             (this.costBaseBaseline!=null &&
              java.util.Arrays.equals(this.costBaseBaseline, other.getCostBaseBaseline()))) &&
            ((this.costBaseline==null && other.getCostBaseline()==null) || 
             (this.costBaseline!=null &&
              java.util.Arrays.equals(this.costBaseline, other.getCostBaseline()))) &&
            ((this.costBaseVariance==null && other.getCostBaseVariance()==null) || 
             (this.costBaseVariance!=null &&
              java.util.Arrays.equals(this.costBaseVariance, other.getCostBaseVariance()))) &&
            ((this.costVariance==null && other.getCostVariance()==null) || 
             (this.costVariance!=null &&
              java.util.Arrays.equals(this.costVariance, other.getCostVariance()))) &&
            ((this.costVariancePercent==null && other.getCostVariancePercent()==null) || 
             (this.costVariancePercent!=null &&
              java.util.Arrays.equals(this.costVariancePercent, other.getCostVariancePercent()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.endDateBaseline==null && other.getEndDateBaseline()==null) || 
             (this.endDateBaseline!=null &&
              java.util.Arrays.equals(this.endDateBaseline, other.getEndDateBaseline()))) &&
            ((this.endDateVariance==null && other.getEndDateVariance()==null) || 
             (this.endDateVariance!=null &&
              java.util.Arrays.equals(this.endDateVariance, other.getEndDateVariance()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              java.util.Arrays.equals(this.estimatedWork, other.getEstimatedWork()))) &&
            ((this.estimatedWorkBaseline==null && other.getEstimatedWorkBaseline()==null) || 
             (this.estimatedWorkBaseline!=null &&
              java.util.Arrays.equals(this.estimatedWorkBaseline, other.getEstimatedWorkBaseline()))) &&
            ((this.estimatedWorkVariance==null && other.getEstimatedWorkVariance()==null) || 
             (this.estimatedWorkVariance!=null &&
              java.util.Arrays.equals(this.estimatedWorkVariance, other.getEstimatedWorkVariance()))) &&
            ((this.estimatedWorkVariancePercent==null && other.getEstimatedWorkVariancePercent()==null) || 
             (this.estimatedWorkVariancePercent!=null &&
              java.util.Arrays.equals(this.estimatedWorkVariancePercent, other.getEstimatedWorkVariancePercent()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.finishByDate==null && other.getFinishByDate()==null) || 
             (this.finishByDate!=null &&
              java.util.Arrays.equals(this.finishByDate, other.getFinishByDate()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              java.util.Arrays.equals(this.id, other.getId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isMilestone==null && other.getIsMilestone()==null) || 
             (this.isMilestone!=null &&
              java.util.Arrays.equals(this.isMilestone, other.getIsMilestone()))) &&
            ((this.isSummaryTask==null && other.getIsSummaryTask()==null) || 
             (this.isSummaryTask!=null &&
              java.util.Arrays.equals(this.isSummaryTask, other.getIsSummaryTask()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.nonBillableTask==null && other.getNonBillableTask()==null) || 
             (this.nonBillableTask!=null &&
              java.util.Arrays.equals(this.nonBillableTask, other.getNonBillableTask()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
            ((this.percentWorkComplete==null && other.getPercentWorkComplete()==null) || 
             (this.percentWorkComplete!=null &&
              java.util.Arrays.equals(this.percentWorkComplete, other.getPercentWorkComplete()))) &&
            ((this.predecessor==null && other.getPredecessor()==null) || 
             (this.predecessor!=null &&
              java.util.Arrays.equals(this.predecessor, other.getPredecessor()))) &&
            ((this.predecessorLagDays==null && other.getPredecessorLagDays()==null) || 
             (this.predecessorLagDays!=null &&
              java.util.Arrays.equals(this.predecessorLagDays, other.getPredecessorLagDays()))) &&
            ((this.predecessors==null && other.getPredecessors()==null) || 
             (this.predecessors!=null &&
              java.util.Arrays.equals(this.predecessors, other.getPredecessors()))) &&
            ((this.predecessorType==null && other.getPredecessorType()==null) || 
             (this.predecessorType!=null &&
              java.util.Arrays.equals(this.predecessorType, other.getPredecessorType()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.remainingWork==null && other.getRemainingWork()==null) || 
             (this.remainingWork!=null &&
              java.util.Arrays.equals(this.remainingWork, other.getRemainingWork()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              java.util.Arrays.equals(this.startDateBaseline, other.getStartDateBaseline()))) &&
            ((this.startDateVariance==null && other.getStartDateVariance()==null) || 
             (this.startDateVariance!=null &&
              java.util.Arrays.equals(this.startDateVariance, other.getStartDateVariance()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.successor==null && other.getSuccessor()==null) || 
             (this.successor!=null &&
              java.util.Arrays.equals(this.successor, other.getSuccessor()))) &&
            ((this.successorType==null && other.getSuccessorType()==null) || 
             (this.successorType!=null &&
              java.util.Arrays.equals(this.successorType, other.getSuccessorType()))) &&
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
        if (getActualWork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualWork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualWork(), i);
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
        if (getConstraintType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConstraintType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConstraintType(), i);
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
        if (getCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostBase(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostBaseBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostBaseBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostBaseBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostBaseVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostBaseVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostBaseVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostVariancePercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostVariancePercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostVariancePercent(), i);
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
        if (getEndDateBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDateBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDateBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDateVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDateVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDateVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedWork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedWorkBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWorkBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWorkBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedWorkVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWorkVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWorkVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedWorkVariancePercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWorkVariancePercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWorkVariancePercent(), i);
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
        if (getFinishByDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinishByDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinishByDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getId(), i);
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
        if (getIsMilestone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsMilestone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsMilestone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSummaryTask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSummaryTask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSummaryTask(), i);
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
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNonBillableTask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonBillableTask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonBillableTask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPercentWorkComplete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPercentWorkComplete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPercentWorkComplete(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPredecessor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredecessor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredecessor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPredecessorLagDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredecessorLagDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredecessorLagDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPredecessors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredecessors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredecessors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPredecessorType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredecessorType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredecessorType(), i);
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
        if (getRemainingWork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemainingWork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemainingWork(), i);
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
        if (getStartDateBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDateBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDateBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDateVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDateVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDateVariance(), i);
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
        if (getSuccessor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccessorType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessorType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessorType(), i);
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
        new org.apache.axis.description.TypeDesc(ProjectTaskSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("constraintType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "constraintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBaseBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBaseVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costVariancePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costVariancePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDateVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWorkVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkVariancePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWorkVariancePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("finishByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "finishByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("isMilestone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isMilestone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSummaryTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSummaryTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonBillableTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nonBillableTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentWorkComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "percentWorkComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "predecessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessorLagDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "predecessorLagDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "predecessors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "predecessorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDateVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "successor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "successorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
