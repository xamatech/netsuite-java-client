/**
 * ManufacturingOperationTaskSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ManufacturingOperationTaskSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualRunTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualSetupTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] completedQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] inputQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] laborResources;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lagAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] lagType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lagUnits;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] machineResources;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingCostTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingWorkCenter;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] order;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] predecessor;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] predecessorType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] remainingQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] runRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] runTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] sequence;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] setupTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] status;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] workOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public ManufacturingOperationTaskSearchRowBasic() {
    }

    public ManufacturingOperationTaskSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualRunTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualSetupTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] completedQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWork,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] inputQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] laborResources,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lagAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] lagType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lagUnits,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] machineResources,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingCostTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingWorkCenter,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] order,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] predecessor,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] predecessorType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] remainingQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] runRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] runTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] sequence,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] setupTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] status,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] workOrder,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.actualRunTime = actualRunTime;
        this.actualSetupTime = actualSetupTime;
        this.completedQuantity = completedQuantity;
        this.endDate = endDate;
        this.estimatedWork = estimatedWork;
        this.externalId = externalId;
        this.id = id;
        this.inputQuantity = inputQuantity;
        this.internalId = internalId;
        this.laborResources = laborResources;
        this.lagAmount = lagAmount;
        this.lagType = lagType;
        this.lagUnits = lagUnits;
        this.machineResources = machineResources;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.message = message;
        this.name = name;
        this.order = order;
        this.predecessor = predecessor;
        this.predecessorType = predecessorType;
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
     * Gets the actualRunTime value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return actualRunTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getActualRunTime() {
        return actualRunTime;
    }


    /**
     * Sets the actualRunTime value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param actualRunTime
     */
    public void setActualRunTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualRunTime) {
        this.actualRunTime = actualRunTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getActualRunTime(int i) {
        return this.actualRunTime[i];
    }

    public void setActualRunTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.actualRunTime[i] = _value;
    }


    /**
     * Gets the actualSetupTime value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return actualSetupTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getActualSetupTime() {
        return actualSetupTime;
    }


    /**
     * Sets the actualSetupTime value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param actualSetupTime
     */
    public void setActualSetupTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualSetupTime) {
        this.actualSetupTime = actualSetupTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getActualSetupTime(int i) {
        return this.actualSetupTime[i];
    }

    public void setActualSetupTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.actualSetupTime[i] = _value;
    }


    /**
     * Gets the completedQuantity value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return completedQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCompletedQuantity() {
        return completedQuantity;
    }


    /**
     * Sets the completedQuantity value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param completedQuantity
     */
    public void setCompletedQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] completedQuantity) {
        this.completedQuantity = completedQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCompletedQuantity(int i) {
        return this.completedQuantity[i];
    }

    public void setCompletedQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.completedQuantity[i] = _value;
    }


    /**
     * Gets the endDate value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the estimatedWork value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return estimatedWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the externalId value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the id value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return id
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getId() {
        return id;
    }


    /**
     * Sets the id value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the inputQuantity value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return inputQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getInputQuantity() {
        return inputQuantity;
    }


    /**
     * Sets the inputQuantity value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param inputQuantity
     */
    public void setInputQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getInputQuantity(int i) {
        return this.inputQuantity[i];
    }

    public void setInputQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.inputQuantity[i] = _value;
    }


    /**
     * Gets the internalId value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the laborResources value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return laborResources
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLaborResources() {
        return laborResources;
    }


    /**
     * Sets the laborResources value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param laborResources
     */
    public void setLaborResources(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] laborResources) {
        this.laborResources = laborResources;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLaborResources(int i) {
        return this.laborResources[i];
    }

    public void setLaborResources(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.laborResources[i] = _value;
    }


    /**
     * Gets the lagAmount value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return lagAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLagAmount() {
        return lagAmount;
    }


    /**
     * Sets the lagAmount value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param lagAmount
     */
    public void setLagAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lagAmount) {
        this.lagAmount = lagAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLagAmount(int i) {
        return this.lagAmount[i];
    }

    public void setLagAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.lagAmount[i] = _value;
    }


    /**
     * Gets the lagType value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return lagType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLagType() {
        return lagType;
    }


    /**
     * Sets the lagType value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param lagType
     */
    public void setLagType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] lagType) {
        this.lagType = lagType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLagType(int i) {
        return this.lagType[i];
    }

    public void setLagType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.lagType[i] = _value;
    }


    /**
     * Gets the lagUnits value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return lagUnits
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLagUnits() {
        return lagUnits;
    }


    /**
     * Sets the lagUnits value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param lagUnits
     */
    public void setLagUnits(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lagUnits) {
        this.lagUnits = lagUnits;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLagUnits(int i) {
        return this.lagUnits[i];
    }

    public void setLagUnits(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.lagUnits[i] = _value;
    }


    /**
     * Gets the machineResources value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return machineResources
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getMachineResources() {
        return machineResources;
    }


    /**
     * Sets the machineResources value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param machineResources
     */
    public void setMachineResources(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] machineResources) {
        this.machineResources = machineResources;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getMachineResources(int i) {
        return this.machineResources[i];
    }

    public void setMachineResources(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.machineResources[i] = _value;
    }


    /**
     * Gets the manufacturingCostTemplate value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return manufacturingCostTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }


    /**
     * Sets the manufacturingCostTemplate value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param manufacturingCostTemplate
     */
    public void setManufacturingCostTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getManufacturingCostTemplate(int i) {
        return this.manufacturingCostTemplate[i];
    }

    public void setManufacturingCostTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.manufacturingCostTemplate[i] = _value;
    }


    /**
     * Gets the manufacturingWorkCenter value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return manufacturingWorkCenter
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }


    /**
     * Sets the manufacturingWorkCenter value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param manufacturingWorkCenter
     */
    public void setManufacturingWorkCenter(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getManufacturingWorkCenter(int i) {
        return this.manufacturingWorkCenter[i];
    }

    public void setManufacturingWorkCenter(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.manufacturingWorkCenter[i] = _value;
    }


    /**
     * Gets the message value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the name value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the order value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return order
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getOrder() {
        return order;
    }


    /**
     * Sets the order value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param order
     */
    public void setOrder(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] order) {
        this.order = order;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getOrder(int i) {
        return this.order[i];
    }

    public void setOrder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.order[i] = _value;
    }


    /**
     * Gets the predecessor value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return predecessor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPredecessor() {
        return predecessor;
    }


    /**
     * Sets the predecessor value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the predecessorType value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return predecessorType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPredecessorType() {
        return predecessorType;
    }


    /**
     * Sets the predecessorType value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the remainingQuantity value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return remainingQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRemainingQuantity() {
        return remainingQuantity;
    }


    /**
     * Sets the remainingQuantity value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param remainingQuantity
     */
    public void setRemainingQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRemainingQuantity(int i) {
        return this.remainingQuantity[i];
    }

    public void setRemainingQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.remainingQuantity[i] = _value;
    }


    /**
     * Gets the runRate value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return runRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRunRate() {
        return runRate;
    }


    /**
     * Sets the runRate value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param runRate
     */
    public void setRunRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] runRate) {
        this.runRate = runRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRunRate(int i) {
        return this.runRate[i];
    }

    public void setRunRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.runRate[i] = _value;
    }


    /**
     * Gets the runTime value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return runTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRunTime() {
        return runTime;
    }


    /**
     * Sets the runTime value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param runTime
     */
    public void setRunTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] runTime) {
        this.runTime = runTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRunTime(int i) {
        return this.runTime[i];
    }

    public void setRunTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.runTime[i] = _value;
    }


    /**
     * Gets the sequence value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return sequence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param sequence
     */
    public void setSequence(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] sequence) {
        this.sequence = sequence;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getSequence(int i) {
        return this.sequence[i];
    }

    public void setSequence(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.sequence[i] = _value;
    }


    /**
     * Gets the setupTime value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return setupTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getSetupTime() {
        return setupTime;
    }


    /**
     * Sets the setupTime value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param setupTime
     */
    public void setSetupTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] setupTime) {
        this.setupTime = setupTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getSetupTime(int i) {
        return this.setupTime[i];
    }

    public void setSetupTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.setupTime[i] = _value;
    }


    /**
     * Gets the startDate value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the status value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ManufacturingOperationTaskSearchRowBasic.
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
     * Gets the workOrder value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return workOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getWorkOrder() {
        return workOrder;
    }


    /**
     * Sets the workOrder value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param workOrder
     */
    public void setWorkOrder(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] workOrder) {
        this.workOrder = workOrder;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getWorkOrder(int i) {
        return this.workOrder[i];
    }

    public void setWorkOrder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.workOrder[i] = _value;
    }


    /**
     * Gets the customFieldList value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ManufacturingOperationTaskSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingOperationTaskSearchRowBasic)) return false;
        ManufacturingOperationTaskSearchRowBasic other = (ManufacturingOperationTaskSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.actualRunTime, other.getActualRunTime()))) &&
            ((this.actualSetupTime==null && other.getActualSetupTime()==null) || 
             (this.actualSetupTime!=null &&
              java.util.Arrays.equals(this.actualSetupTime, other.getActualSetupTime()))) &&
            ((this.completedQuantity==null && other.getCompletedQuantity()==null) || 
             (this.completedQuantity!=null &&
              java.util.Arrays.equals(this.completedQuantity, other.getCompletedQuantity()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              java.util.Arrays.equals(this.estimatedWork, other.getEstimatedWork()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              java.util.Arrays.equals(this.id, other.getId()))) &&
            ((this.inputQuantity==null && other.getInputQuantity()==null) || 
             (this.inputQuantity!=null &&
              java.util.Arrays.equals(this.inputQuantity, other.getInputQuantity()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.laborResources==null && other.getLaborResources()==null) || 
             (this.laborResources!=null &&
              java.util.Arrays.equals(this.laborResources, other.getLaborResources()))) &&
            ((this.lagAmount==null && other.getLagAmount()==null) || 
             (this.lagAmount!=null &&
              java.util.Arrays.equals(this.lagAmount, other.getLagAmount()))) &&
            ((this.lagType==null && other.getLagType()==null) || 
             (this.lagType!=null &&
              java.util.Arrays.equals(this.lagType, other.getLagType()))) &&
            ((this.lagUnits==null && other.getLagUnits()==null) || 
             (this.lagUnits!=null &&
              java.util.Arrays.equals(this.lagUnits, other.getLagUnits()))) &&
            ((this.machineResources==null && other.getMachineResources()==null) || 
             (this.machineResources!=null &&
              java.util.Arrays.equals(this.machineResources, other.getMachineResources()))) &&
            ((this.manufacturingCostTemplate==null && other.getManufacturingCostTemplate()==null) || 
             (this.manufacturingCostTemplate!=null &&
              java.util.Arrays.equals(this.manufacturingCostTemplate, other.getManufacturingCostTemplate()))) &&
            ((this.manufacturingWorkCenter==null && other.getManufacturingWorkCenter()==null) || 
             (this.manufacturingWorkCenter!=null &&
              java.util.Arrays.equals(this.manufacturingWorkCenter, other.getManufacturingWorkCenter()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              java.util.Arrays.equals(this.order, other.getOrder()))) &&
            ((this.predecessor==null && other.getPredecessor()==null) || 
             (this.predecessor!=null &&
              java.util.Arrays.equals(this.predecessor, other.getPredecessor()))) &&
            ((this.predecessorType==null && other.getPredecessorType()==null) || 
             (this.predecessorType!=null &&
              java.util.Arrays.equals(this.predecessorType, other.getPredecessorType()))) &&
            ((this.remainingQuantity==null && other.getRemainingQuantity()==null) || 
             (this.remainingQuantity!=null &&
              java.util.Arrays.equals(this.remainingQuantity, other.getRemainingQuantity()))) &&
            ((this.runRate==null && other.getRunRate()==null) || 
             (this.runRate!=null &&
              java.util.Arrays.equals(this.runRate, other.getRunRate()))) &&
            ((this.runTime==null && other.getRunTime()==null) || 
             (this.runTime!=null &&
              java.util.Arrays.equals(this.runTime, other.getRunTime()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              java.util.Arrays.equals(this.sequence, other.getSequence()))) &&
            ((this.setupTime==null && other.getSetupTime()==null) || 
             (this.setupTime!=null &&
              java.util.Arrays.equals(this.setupTime, other.getSetupTime()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.workOrder==null && other.getWorkOrder()==null) || 
             (this.workOrder!=null &&
              java.util.Arrays.equals(this.workOrder, other.getWorkOrder()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualRunTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualRunTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActualSetupTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualSetupTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualSetupTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompletedQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompletedQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompletedQuantity(), i);
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
        if (getInputQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputQuantity(), i);
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
        if (getLaborResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLaborResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLaborResources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLagAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLagAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLagAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLagType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLagType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLagType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLagUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLagUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLagUnits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMachineResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMachineResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMachineResources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturingCostTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingCostTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingCostTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturingWorkCenter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingWorkCenter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingWorkCenter(), i);
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrder(), i);
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
        if (getRemainingQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemainingQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemainingQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRunRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRunRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRunRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRunTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRunTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRunTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSequence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSequence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSequence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSetupTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSetupTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSetupTime(), i);
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
        if (getWorkOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkOrder(), i);
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
        new org.apache.axis.description.TypeDesc(ManufacturingOperationTaskSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualRunTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualSetupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualSetupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "completedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWork"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inputQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingWorkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "order"));
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
        elemField.setFieldName("predecessorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "predecessorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "remainingQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "runTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "setupTime"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "workOrder"));
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
