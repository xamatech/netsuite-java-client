/**
 * ManufacturingOperationTaskSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ManufacturingOperationTaskSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualRunTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualSetupTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField completedQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField id;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField inputQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField laborResources;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lagAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField lagType;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField lagUnits;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField machineResources;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingCostTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingWorkCenter;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField order;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField predecessor;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField remainingQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField runRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField runTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField sequence;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField setupTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public ManufacturingOperationTaskSearchBasic() {
    }

    public ManufacturingOperationTaskSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualRunTime,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualSetupTime,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField completedQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWork,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField id,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField inputQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField laborResources,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lagAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField lagType,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField lagUnits,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField machineResources,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingCostTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingWorkCenter,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField order,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField predecessor,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField remainingQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField runRate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField runTime,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField sequence,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField setupTime,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workOrder,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.actualRunTime = actualRunTime;
        this.actualSetupTime = actualSetupTime;
        this.completedQuantity = completedQuantity;
        this.endDate = endDate;
        this.estimatedWork = estimatedWork;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.id = id;
        this.inputQuantity = inputQuantity;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.laborResources = laborResources;
        this.lagAmount = lagAmount;
        this.lagType = lagType;
        this.lagUnits = lagUnits;
        this.machineResources = machineResources;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.name = name;
        this.order = order;
        this.predecessor = predecessor;
        this.remainingQuantity = remainingQuantity;
        this.runRate = runRate;
        this.runTime = runTime;
        this.sequence = sequence;
        this.setupTime = setupTime;
        this.startDate = startDate;
        this.status = status;
        this.workOrder = workOrder;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the actualRunTime value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return actualRunTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getActualRunTime() {
        return actualRunTime;
    }


    /**
     * Sets the actualRunTime value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param actualRunTime
     */
    public void setActualRunTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualRunTime) {
        this.actualRunTime = actualRunTime;
    }


    /**
     * Gets the actualSetupTime value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return actualSetupTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getActualSetupTime() {
        return actualSetupTime;
    }


    /**
     * Sets the actualSetupTime value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param actualSetupTime
     */
    public void setActualSetupTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualSetupTime) {
        this.actualSetupTime = actualSetupTime;
    }


    /**
     * Gets the completedQuantity value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return completedQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCompletedQuantity() {
        return completedQuantity;
    }


    /**
     * Sets the completedQuantity value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param completedQuantity
     */
    public void setCompletedQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField completedQuantity) {
        this.completedQuantity = completedQuantity;
    }


    /**
     * Gets the endDate value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the estimatedWork value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return estimatedWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWork) {
        this.estimatedWork = estimatedWork;
    }


    /**
     * Gets the externalId value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the id value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return id
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getId() {
        return id;
    }


    /**
     * Sets the id value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param id
     */
    public void setId(com.netsuite.webservices.platform.core_2019_1.SearchLongField id) {
        this.id = id;
    }


    /**
     * Gets the inputQuantity value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return inputQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getInputQuantity() {
        return inputQuantity;
    }


    /**
     * Sets the inputQuantity value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param inputQuantity
     */
    public void setInputQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField inputQuantity) {
        this.inputQuantity = inputQuantity;
    }


    /**
     * Gets the internalId value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the laborResources value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return laborResources
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLaborResources() {
        return laborResources;
    }


    /**
     * Sets the laborResources value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param laborResources
     */
    public void setLaborResources(com.netsuite.webservices.platform.core_2019_1.SearchLongField laborResources) {
        this.laborResources = laborResources;
    }


    /**
     * Gets the lagAmount value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return lagAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLagAmount() {
        return lagAmount;
    }


    /**
     * Sets the lagAmount value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param lagAmount
     */
    public void setLagAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lagAmount) {
        this.lagAmount = lagAmount;
    }


    /**
     * Gets the lagType value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return lagType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLagType() {
        return lagType;
    }


    /**
     * Sets the lagType value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param lagType
     */
    public void setLagType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField lagType) {
        this.lagType = lagType;
    }


    /**
     * Gets the lagUnits value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return lagUnits
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getLagUnits() {
        return lagUnits;
    }


    /**
     * Sets the lagUnits value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param lagUnits
     */
    public void setLagUnits(com.netsuite.webservices.platform.core_2019_1.SearchStringField lagUnits) {
        this.lagUnits = lagUnits;
    }


    /**
     * Gets the machineResources value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return machineResources
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getMachineResources() {
        return machineResources;
    }


    /**
     * Sets the machineResources value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param machineResources
     */
    public void setMachineResources(com.netsuite.webservices.platform.core_2019_1.SearchLongField machineResources) {
        this.machineResources = machineResources;
    }


    /**
     * Gets the manufacturingCostTemplate value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return manufacturingCostTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }


    /**
     * Sets the manufacturingCostTemplate value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param manufacturingCostTemplate
     */
    public void setManufacturingCostTemplate(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }


    /**
     * Gets the manufacturingWorkCenter value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return manufacturingWorkCenter
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }


    /**
     * Sets the manufacturingWorkCenter value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param manufacturingWorkCenter
     */
    public void setManufacturingWorkCenter(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }


    /**
     * Gets the name value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the order value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return order
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getOrder() {
        return order;
    }


    /**
     * Sets the order value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param order
     */
    public void setOrder(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField order) {
        this.order = order;
    }


    /**
     * Gets the predecessor value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return predecessor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPredecessor() {
        return predecessor;
    }


    /**
     * Sets the predecessor value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param predecessor
     */
    public void setPredecessor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField predecessor) {
        this.predecessor = predecessor;
    }


    /**
     * Gets the remainingQuantity value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return remainingQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRemainingQuantity() {
        return remainingQuantity;
    }


    /**
     * Sets the remainingQuantity value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param remainingQuantity
     */
    public void setRemainingQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }


    /**
     * Gets the runRate value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return runRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRunRate() {
        return runRate;
    }


    /**
     * Sets the runRate value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param runRate
     */
    public void setRunRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField runRate) {
        this.runRate = runRate;
    }


    /**
     * Gets the runTime value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return runTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRunTime() {
        return runTime;
    }


    /**
     * Sets the runTime value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param runTime
     */
    public void setRunTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField runTime) {
        this.runTime = runTime;
    }


    /**
     * Gets the sequence value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return sequence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param sequence
     */
    public void setSequence(com.netsuite.webservices.platform.core_2019_1.SearchLongField sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the setupTime value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return setupTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getSetupTime() {
        return setupTime;
    }


    /**
     * Sets the setupTime value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param setupTime
     */
    public void setSetupTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField setupTime) {
        this.setupTime = setupTime;
    }


    /**
     * Gets the startDate value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the workOrder value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return workOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getWorkOrder() {
        return workOrder;
    }


    /**
     * Sets the workOrder value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param workOrder
     */
    public void setWorkOrder(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workOrder) {
        this.workOrder = workOrder;
    }


    /**
     * Gets the customFieldList value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ManufacturingOperationTaskSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingOperationTaskSearchBasic)) return false;
        ManufacturingOperationTaskSearchBasic other = (ManufacturingOperationTaskSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualRunTime==null && other.getActualRunTime()==null) || 
             (this.actualRunTime!=null &&
              this.actualRunTime.equals(other.getActualRunTime()))) &&
            ((this.actualSetupTime==null && other.getActualSetupTime()==null) || 
             (this.actualSetupTime!=null &&
              this.actualSetupTime.equals(other.getActualSetupTime()))) &&
            ((this.completedQuantity==null && other.getCompletedQuantity()==null) || 
             (this.completedQuantity!=null &&
              this.completedQuantity.equals(other.getCompletedQuantity()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              this.estimatedWork.equals(other.getEstimatedWork()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.inputQuantity==null && other.getInputQuantity()==null) || 
             (this.inputQuantity!=null &&
              this.inputQuantity.equals(other.getInputQuantity()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.laborResources==null && other.getLaborResources()==null) || 
             (this.laborResources!=null &&
              this.laborResources.equals(other.getLaborResources()))) &&
            ((this.lagAmount==null && other.getLagAmount()==null) || 
             (this.lagAmount!=null &&
              this.lagAmount.equals(other.getLagAmount()))) &&
            ((this.lagType==null && other.getLagType()==null) || 
             (this.lagType!=null &&
              this.lagType.equals(other.getLagType()))) &&
            ((this.lagUnits==null && other.getLagUnits()==null) || 
             (this.lagUnits!=null &&
              this.lagUnits.equals(other.getLagUnits()))) &&
            ((this.machineResources==null && other.getMachineResources()==null) || 
             (this.machineResources!=null &&
              this.machineResources.equals(other.getMachineResources()))) &&
            ((this.manufacturingCostTemplate==null && other.getManufacturingCostTemplate()==null) || 
             (this.manufacturingCostTemplate!=null &&
              this.manufacturingCostTemplate.equals(other.getManufacturingCostTemplate()))) &&
            ((this.manufacturingWorkCenter==null && other.getManufacturingWorkCenter()==null) || 
             (this.manufacturingWorkCenter!=null &&
              this.manufacturingWorkCenter.equals(other.getManufacturingWorkCenter()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.predecessor==null && other.getPredecessor()==null) || 
             (this.predecessor!=null &&
              this.predecessor.equals(other.getPredecessor()))) &&
            ((this.remainingQuantity==null && other.getRemainingQuantity()==null) || 
             (this.remainingQuantity!=null &&
              this.remainingQuantity.equals(other.getRemainingQuantity()))) &&
            ((this.runRate==null && other.getRunRate()==null) || 
             (this.runRate!=null &&
              this.runRate.equals(other.getRunRate()))) &&
            ((this.runTime==null && other.getRunTime()==null) || 
             (this.runTime!=null &&
              this.runTime.equals(other.getRunTime()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.setupTime==null && other.getSetupTime()==null) || 
             (this.setupTime!=null &&
              this.setupTime.equals(other.getSetupTime()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.workOrder==null && other.getWorkOrder()==null) || 
             (this.workOrder!=null &&
              this.workOrder.equals(other.getWorkOrder()))) &&
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
        if (getActualRunTime() != null) {
            _hashCode += getActualRunTime().hashCode();
        }
        if (getActualSetupTime() != null) {
            _hashCode += getActualSetupTime().hashCode();
        }
        if (getCompletedQuantity() != null) {
            _hashCode += getCompletedQuantity().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEstimatedWork() != null) {
            _hashCode += getEstimatedWork().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInputQuantity() != null) {
            _hashCode += getInputQuantity().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getLaborResources() != null) {
            _hashCode += getLaborResources().hashCode();
        }
        if (getLagAmount() != null) {
            _hashCode += getLagAmount().hashCode();
        }
        if (getLagType() != null) {
            _hashCode += getLagType().hashCode();
        }
        if (getLagUnits() != null) {
            _hashCode += getLagUnits().hashCode();
        }
        if (getMachineResources() != null) {
            _hashCode += getMachineResources().hashCode();
        }
        if (getManufacturingCostTemplate() != null) {
            _hashCode += getManufacturingCostTemplate().hashCode();
        }
        if (getManufacturingWorkCenter() != null) {
            _hashCode += getManufacturingWorkCenter().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getPredecessor() != null) {
            _hashCode += getPredecessor().hashCode();
        }
        if (getRemainingQuantity() != null) {
            _hashCode += getRemainingQuantity().hashCode();
        }
        if (getRunRate() != null) {
            _hashCode += getRunRate().hashCode();
        }
        if (getRunTime() != null) {
            _hashCode += getRunTime().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getSetupTime() != null) {
            _hashCode += getSetupTime().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getWorkOrder() != null) {
            _hashCode += getWorkOrder().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturingOperationTaskSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualRunTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualSetupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualSetupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "completedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWork"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inputQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingWorkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "order"));
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
        elemField.setFieldName("remainingQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "remainingQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "runTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "setupTime"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "workOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
