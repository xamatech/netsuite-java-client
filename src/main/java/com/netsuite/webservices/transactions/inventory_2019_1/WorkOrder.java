/**
 * WorkOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class WorkOrder  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingRouting;

    private java.lang.Boolean autoCalculateLag;

    private java.lang.String status;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef job;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef assemblyItem;

    private java.lang.Boolean expandAssembly;

    private java.lang.Boolean isWip;

    private java.lang.Double quantity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billOfMaterials;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef units;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderOrderStatus orderStatus;

    private java.lang.Boolean firmed;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderItemList itemList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderSchedulingMethod schedulingMethod;

    private com.netsuite.webservices.transactions.inventory_2019_1.SalesTeamList salesTeamList;

    private com.netsuite.webservices.transactions.inventory_2019_1.PartnersList partnersList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom;

    private java.lang.String sourceTransactionId;

    private java.lang.Long sourceTransactionLine;

    private java.lang.Boolean specialOrder;

    private java.lang.Double buildable;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList options;

    private java.lang.Double built;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revision;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billOfMaterialsRevision;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public WorkOrder() {
    }

    public WorkOrder(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingRouting,
           java.lang.Boolean autoCalculateLag,
           java.lang.String status,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef job,
           com.netsuite.webservices.platform.core_2019_1.RecordRef assemblyItem,
           java.lang.Boolean expandAssembly,
           java.lang.Boolean isWip,
           java.lang.Double quantity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billOfMaterials,
           com.netsuite.webservices.platform.core_2019_1.RecordRef units,
           java.util.Calendar tranDate,
           com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderOrderStatus orderStatus,
           java.lang.Boolean firmed,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderItemList itemList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderSchedulingMethod schedulingMethod,
           com.netsuite.webservices.transactions.inventory_2019_1.SalesTeamList salesTeamList,
           com.netsuite.webservices.transactions.inventory_2019_1.PartnersList partnersList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom,
           java.lang.String sourceTransactionId,
           java.lang.Long sourceTransactionLine,
           java.lang.Boolean specialOrder,
           java.lang.Double buildable,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList options,
           java.lang.Double built,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revision,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billOfMaterialsRevision,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.manufacturingRouting = manufacturingRouting;
        this.autoCalculateLag = autoCalculateLag;
        this.status = status;
        this.tranId = tranId;
        this.entity = entity;
        this.job = job;
        this.assemblyItem = assemblyItem;
        this.expandAssembly = expandAssembly;
        this.isWip = isWip;
        this.quantity = quantity;
        this.billOfMaterials = billOfMaterials;
        this.units = units;
        this.tranDate = tranDate;
        this.orderStatus = orderStatus;
        this.firmed = firmed;
        this.memo = memo;
        this.department = department;
        this._class = _class;
        this.itemList = itemList;
        this.location = location;
        this.schedulingMethod = schedulingMethod;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
        this.createdFrom = createdFrom;
        this.sourceTransactionId = sourceTransactionId;
        this.sourceTransactionLine = sourceTransactionLine;
        this.specialOrder = specialOrder;
        this.buildable = buildable;
        this.options = options;
        this.built = built;
        this.startDate = startDate;
        this.endDate = endDate;
        this.revision = revision;
        this.billOfMaterialsRevision = billOfMaterialsRevision;
        this.subsidiary = subsidiary;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this WorkOrder.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this WorkOrder.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this WorkOrder.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this WorkOrder.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this WorkOrder.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this WorkOrder.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the manufacturingRouting value for this WorkOrder.
     * 
     * @return manufacturingRouting
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getManufacturingRouting() {
        return manufacturingRouting;
    }


    /**
     * Sets the manufacturingRouting value for this WorkOrder.
     * 
     * @param manufacturingRouting
     */
    public void setManufacturingRouting(com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingRouting) {
        this.manufacturingRouting = manufacturingRouting;
    }


    /**
     * Gets the autoCalculateLag value for this WorkOrder.
     * 
     * @return autoCalculateLag
     */
    public java.lang.Boolean getAutoCalculateLag() {
        return autoCalculateLag;
    }


    /**
     * Sets the autoCalculateLag value for this WorkOrder.
     * 
     * @param autoCalculateLag
     */
    public void setAutoCalculateLag(java.lang.Boolean autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }


    /**
     * Gets the status value for this WorkOrder.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WorkOrder.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the tranId value for this WorkOrder.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this WorkOrder.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the entity value for this WorkOrder.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this WorkOrder.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the job value for this WorkOrder.
     * 
     * @return job
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this WorkOrder.
     * 
     * @param job
     */
    public void setJob(com.netsuite.webservices.platform.core_2019_1.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the assemblyItem value for this WorkOrder.
     * 
     * @return assemblyItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAssemblyItem() {
        return assemblyItem;
    }


    /**
     * Sets the assemblyItem value for this WorkOrder.
     * 
     * @param assemblyItem
     */
    public void setAssemblyItem(com.netsuite.webservices.platform.core_2019_1.RecordRef assemblyItem) {
        this.assemblyItem = assemblyItem;
    }


    /**
     * Gets the expandAssembly value for this WorkOrder.
     * 
     * @return expandAssembly
     */
    public java.lang.Boolean getExpandAssembly() {
        return expandAssembly;
    }


    /**
     * Sets the expandAssembly value for this WorkOrder.
     * 
     * @param expandAssembly
     */
    public void setExpandAssembly(java.lang.Boolean expandAssembly) {
        this.expandAssembly = expandAssembly;
    }


    /**
     * Gets the isWip value for this WorkOrder.
     * 
     * @return isWip
     */
    public java.lang.Boolean getIsWip() {
        return isWip;
    }


    /**
     * Sets the isWip value for this WorkOrder.
     * 
     * @param isWip
     */
    public void setIsWip(java.lang.Boolean isWip) {
        this.isWip = isWip;
    }


    /**
     * Gets the quantity value for this WorkOrder.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this WorkOrder.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the billOfMaterials value for this WorkOrder.
     * 
     * @return billOfMaterials
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillOfMaterials() {
        return billOfMaterials;
    }


    /**
     * Sets the billOfMaterials value for this WorkOrder.
     * 
     * @param billOfMaterials
     */
    public void setBillOfMaterials(com.netsuite.webservices.platform.core_2019_1.RecordRef billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }


    /**
     * Gets the units value for this WorkOrder.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this WorkOrder.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the tranDate value for this WorkOrder.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this WorkOrder.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the orderStatus value for this WorkOrder.
     * 
     * @return orderStatus
     */
    public com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderOrderStatus getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this WorkOrder.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the firmed value for this WorkOrder.
     * 
     * @return firmed
     */
    public java.lang.Boolean getFirmed() {
        return firmed;
    }


    /**
     * Sets the firmed value for this WorkOrder.
     * 
     * @param firmed
     */
    public void setFirmed(java.lang.Boolean firmed) {
        this.firmed = firmed;
    }


    /**
     * Gets the memo value for this WorkOrder.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this WorkOrder.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the department value for this WorkOrder.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this WorkOrder.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this WorkOrder.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this WorkOrder.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the itemList value for this WorkOrder.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this WorkOrder.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the location value for this WorkOrder.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this WorkOrder.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the schedulingMethod value for this WorkOrder.
     * 
     * @return schedulingMethod
     */
    public com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderSchedulingMethod getSchedulingMethod() {
        return schedulingMethod;
    }


    /**
     * Sets the schedulingMethod value for this WorkOrder.
     * 
     * @param schedulingMethod
     */
    public void setSchedulingMethod(com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderSchedulingMethod schedulingMethod) {
        this.schedulingMethod = schedulingMethod;
    }


    /**
     * Gets the salesTeamList value for this WorkOrder.
     * 
     * @return salesTeamList
     */
    public com.netsuite.webservices.transactions.inventory_2019_1.SalesTeamList getSalesTeamList() {
        return salesTeamList;
    }


    /**
     * Sets the salesTeamList value for this WorkOrder.
     * 
     * @param salesTeamList
     */
    public void setSalesTeamList(com.netsuite.webservices.transactions.inventory_2019_1.SalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }


    /**
     * Gets the partnersList value for this WorkOrder.
     * 
     * @return partnersList
     */
    public com.netsuite.webservices.transactions.inventory_2019_1.PartnersList getPartnersList() {
        return partnersList;
    }


    /**
     * Sets the partnersList value for this WorkOrder.
     * 
     * @param partnersList
     */
    public void setPartnersList(com.netsuite.webservices.transactions.inventory_2019_1.PartnersList partnersList) {
        this.partnersList = partnersList;
    }


    /**
     * Gets the createdFrom value for this WorkOrder.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this WorkOrder.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the sourceTransactionId value for this WorkOrder.
     * 
     * @return sourceTransactionId
     */
    public java.lang.String getSourceTransactionId() {
        return sourceTransactionId;
    }


    /**
     * Sets the sourceTransactionId value for this WorkOrder.
     * 
     * @param sourceTransactionId
     */
    public void setSourceTransactionId(java.lang.String sourceTransactionId) {
        this.sourceTransactionId = sourceTransactionId;
    }


    /**
     * Gets the sourceTransactionLine value for this WorkOrder.
     * 
     * @return sourceTransactionLine
     */
    public java.lang.Long getSourceTransactionLine() {
        return sourceTransactionLine;
    }


    /**
     * Sets the sourceTransactionLine value for this WorkOrder.
     * 
     * @param sourceTransactionLine
     */
    public void setSourceTransactionLine(java.lang.Long sourceTransactionLine) {
        this.sourceTransactionLine = sourceTransactionLine;
    }


    /**
     * Gets the specialOrder value for this WorkOrder.
     * 
     * @return specialOrder
     */
    public java.lang.Boolean getSpecialOrder() {
        return specialOrder;
    }


    /**
     * Sets the specialOrder value for this WorkOrder.
     * 
     * @param specialOrder
     */
    public void setSpecialOrder(java.lang.Boolean specialOrder) {
        this.specialOrder = specialOrder;
    }


    /**
     * Gets the buildable value for this WorkOrder.
     * 
     * @return buildable
     */
    public java.lang.Double getBuildable() {
        return buildable;
    }


    /**
     * Sets the buildable value for this WorkOrder.
     * 
     * @param buildable
     */
    public void setBuildable(java.lang.Double buildable) {
        this.buildable = buildable;
    }


    /**
     * Gets the options value for this WorkOrder.
     * 
     * @return options
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this WorkOrder.
     * 
     * @param options
     */
    public void setOptions(com.netsuite.webservices.platform.core_2019_1.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the built value for this WorkOrder.
     * 
     * @return built
     */
    public java.lang.Double getBuilt() {
        return built;
    }


    /**
     * Sets the built value for this WorkOrder.
     * 
     * @param built
     */
    public void setBuilt(java.lang.Double built) {
        this.built = built;
    }


    /**
     * Gets the startDate value for this WorkOrder.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this WorkOrder.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this WorkOrder.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this WorkOrder.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the revision value for this WorkOrder.
     * 
     * @return revision
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this WorkOrder.
     * 
     * @param revision
     */
    public void setRevision(com.netsuite.webservices.platform.core_2019_1.RecordRef revision) {
        this.revision = revision;
    }


    /**
     * Gets the billOfMaterialsRevision value for this WorkOrder.
     * 
     * @return billOfMaterialsRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillOfMaterialsRevision() {
        return billOfMaterialsRevision;
    }


    /**
     * Sets the billOfMaterialsRevision value for this WorkOrder.
     * 
     * @param billOfMaterialsRevision
     */
    public void setBillOfMaterialsRevision(com.netsuite.webservices.platform.core_2019_1.RecordRef billOfMaterialsRevision) {
        this.billOfMaterialsRevision = billOfMaterialsRevision;
    }


    /**
     * Gets the subsidiary value for this WorkOrder.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this WorkOrder.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the accountingBookDetailList value for this WorkOrder.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this WorkOrder.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the customFieldList value for this WorkOrder.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this WorkOrder.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this WorkOrder.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this WorkOrder.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this WorkOrder.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this WorkOrder.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkOrder)) return false;
        WorkOrder other = (WorkOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.manufacturingRouting==null && other.getManufacturingRouting()==null) || 
             (this.manufacturingRouting!=null &&
              this.manufacturingRouting.equals(other.getManufacturingRouting()))) &&
            ((this.autoCalculateLag==null && other.getAutoCalculateLag()==null) || 
             (this.autoCalculateLag!=null &&
              this.autoCalculateLag.equals(other.getAutoCalculateLag()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.assemblyItem==null && other.getAssemblyItem()==null) || 
             (this.assemblyItem!=null &&
              this.assemblyItem.equals(other.getAssemblyItem()))) &&
            ((this.expandAssembly==null && other.getExpandAssembly()==null) || 
             (this.expandAssembly!=null &&
              this.expandAssembly.equals(other.getExpandAssembly()))) &&
            ((this.isWip==null && other.getIsWip()==null) || 
             (this.isWip!=null &&
              this.isWip.equals(other.getIsWip()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.billOfMaterials==null && other.getBillOfMaterials()==null) || 
             (this.billOfMaterials!=null &&
              this.billOfMaterials.equals(other.getBillOfMaterials()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
            ((this.firmed==null && other.getFirmed()==null) || 
             (this.firmed!=null &&
              this.firmed.equals(other.getFirmed()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.schedulingMethod==null && other.getSchedulingMethod()==null) || 
             (this.schedulingMethod!=null &&
              this.schedulingMethod.equals(other.getSchedulingMethod()))) &&
            ((this.salesTeamList==null && other.getSalesTeamList()==null) || 
             (this.salesTeamList!=null &&
              this.salesTeamList.equals(other.getSalesTeamList()))) &&
            ((this.partnersList==null && other.getPartnersList()==null) || 
             (this.partnersList!=null &&
              this.partnersList.equals(other.getPartnersList()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.sourceTransactionId==null && other.getSourceTransactionId()==null) || 
             (this.sourceTransactionId!=null &&
              this.sourceTransactionId.equals(other.getSourceTransactionId()))) &&
            ((this.sourceTransactionLine==null && other.getSourceTransactionLine()==null) || 
             (this.sourceTransactionLine!=null &&
              this.sourceTransactionLine.equals(other.getSourceTransactionLine()))) &&
            ((this.specialOrder==null && other.getSpecialOrder()==null) || 
             (this.specialOrder!=null &&
              this.specialOrder.equals(other.getSpecialOrder()))) &&
            ((this.buildable==null && other.getBuildable()==null) || 
             (this.buildable!=null &&
              this.buildable.equals(other.getBuildable()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.built==null && other.getBuilt()==null) || 
             (this.built!=null &&
              this.built.equals(other.getBuilt()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
            ((this.billOfMaterialsRevision==null && other.getBillOfMaterialsRevision()==null) || 
             (this.billOfMaterialsRevision!=null &&
              this.billOfMaterialsRevision.equals(other.getBillOfMaterialsRevision()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getManufacturingRouting() != null) {
            _hashCode += getManufacturingRouting().hashCode();
        }
        if (getAutoCalculateLag() != null) {
            _hashCode += getAutoCalculateLag().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getAssemblyItem() != null) {
            _hashCode += getAssemblyItem().hashCode();
        }
        if (getExpandAssembly() != null) {
            _hashCode += getExpandAssembly().hashCode();
        }
        if (getIsWip() != null) {
            _hashCode += getIsWip().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getBillOfMaterials() != null) {
            _hashCode += getBillOfMaterials().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        if (getFirmed() != null) {
            _hashCode += getFirmed().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSchedulingMethod() != null) {
            _hashCode += getSchedulingMethod().hashCode();
        }
        if (getSalesTeamList() != null) {
            _hashCode += getSalesTeamList().hashCode();
        }
        if (getPartnersList() != null) {
            _hashCode += getPartnersList().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getSourceTransactionId() != null) {
            _hashCode += getSourceTransactionId().hashCode();
        }
        if (getSourceTransactionLine() != null) {
            _hashCode += getSourceTransactionLine().hashCode();
        }
        if (getSpecialOrder() != null) {
            _hashCode += getSpecialOrder().hashCode();
        }
        if (getBuildable() != null) {
            _hashCode += getBuildable().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getBuilt() != null) {
            _hashCode += getBuilt().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        if (getBillOfMaterialsRevision() != null) {
            _hashCode += getBillOfMaterialsRevision().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
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
        new org.apache.axis.description.TypeDesc(WorkOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrder"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingRouting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "manufacturingRouting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assemblyItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "assemblyItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "expandAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "isWip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "orderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderOrderStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "firmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedulingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "schedulingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderSchedulingMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "SalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "PartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "sourceTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceTransactionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "sourceTransactionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "specialOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "buildable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("built");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "built"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterialsRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "billOfMaterialsRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
