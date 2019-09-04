/**
 * PurchaseRequisition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class PurchaseRequisition  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String source;

    private java.lang.Double subTotal;

    private java.lang.String currencyName;

    private java.lang.Double exchangeRate;

    private java.lang.String vatRegNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxRegNum;

    private java.lang.Boolean taxRegOverride;

    private java.lang.Double estimatedTotal;

    private java.lang.String status;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private java.util.Calendar dueDate;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover;

    private java.lang.Double taxTotal;

    private java.lang.Double tax2Total;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private java.lang.Double total;

    private com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionItemList itemList;

    private com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpenseList expenseList;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public PurchaseRequisition() {
    }

    public PurchaseRequisition(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String source,
           java.lang.Double subTotal,
           java.lang.String currencyName,
           java.lang.Double exchangeRate,
           java.lang.String vatRegNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nexus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxRegNum,
           java.lang.Boolean taxRegOverride,
           java.lang.Double estimatedTotal,
           java.lang.String status,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           java.util.Calendar dueDate,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover,
           java.lang.Double taxTotal,
           java.lang.Double tax2Total,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           java.lang.Double total,
           com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionItemList itemList,
           com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpenseList expenseList,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.source = source;
        this.subTotal = subTotal;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.vatRegNum = vatRegNum;
        this.nexus = nexus;
        this.taxRegNum = taxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.estimatedTotal = estimatedTotal;
        this.status = status;
        this.currency = currency;
        this.entity = entity;
        this.dueDate = dueDate;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.memo = memo;
        this.approvalStatus = approvalStatus;
        this.nextApprover = nextApprover;
        this.taxTotal = taxTotal;
        this.tax2Total = tax2Total;
        this.subsidiary = subsidiary;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.total = total;
        this.itemList = itemList;
        this.expenseList = expenseList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this PurchaseRequisition.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this PurchaseRequisition.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this PurchaseRequisition.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PurchaseRequisition.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this PurchaseRequisition.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this PurchaseRequisition.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the source value for this PurchaseRequisition.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this PurchaseRequisition.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the subTotal value for this PurchaseRequisition.
     * 
     * @return subTotal
     */
    public java.lang.Double getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this PurchaseRequisition.
     * 
     * @param subTotal
     */
    public void setSubTotal(java.lang.Double subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the currencyName value for this PurchaseRequisition.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this PurchaseRequisition.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the exchangeRate value for this PurchaseRequisition.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this PurchaseRequisition.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the vatRegNum value for this PurchaseRequisition.
     * 
     * @return vatRegNum
     */
    public java.lang.String getVatRegNum() {
        return vatRegNum;
    }


    /**
     * Sets the vatRegNum value for this PurchaseRequisition.
     * 
     * @param vatRegNum
     */
    public void setVatRegNum(java.lang.String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }


    /**
     * Gets the nexus value for this PurchaseRequisition.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this PurchaseRequisition.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the taxRegNum value for this PurchaseRequisition.
     * 
     * @return taxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxRegNum() {
        return taxRegNum;
    }


    /**
     * Sets the taxRegNum value for this PurchaseRequisition.
     * 
     * @param taxRegNum
     */
    public void setTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef taxRegNum) {
        this.taxRegNum = taxRegNum;
    }


    /**
     * Gets the taxRegOverride value for this PurchaseRequisition.
     * 
     * @return taxRegOverride
     */
    public java.lang.Boolean getTaxRegOverride() {
        return taxRegOverride;
    }


    /**
     * Sets the taxRegOverride value for this PurchaseRequisition.
     * 
     * @param taxRegOverride
     */
    public void setTaxRegOverride(java.lang.Boolean taxRegOverride) {
        this.taxRegOverride = taxRegOverride;
    }


    /**
     * Gets the estimatedTotal value for this PurchaseRequisition.
     * 
     * @return estimatedTotal
     */
    public java.lang.Double getEstimatedTotal() {
        return estimatedTotal;
    }


    /**
     * Sets the estimatedTotal value for this PurchaseRequisition.
     * 
     * @param estimatedTotal
     */
    public void setEstimatedTotal(java.lang.Double estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
    }


    /**
     * Gets the status value for this PurchaseRequisition.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PurchaseRequisition.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the currency value for this PurchaseRequisition.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PurchaseRequisition.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the entity value for this PurchaseRequisition.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this PurchaseRequisition.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the dueDate value for this PurchaseRequisition.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this PurchaseRequisition.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the tranDate value for this PurchaseRequisition.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this PurchaseRequisition.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this PurchaseRequisition.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this PurchaseRequisition.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the memo value for this PurchaseRequisition.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PurchaseRequisition.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the approvalStatus value for this PurchaseRequisition.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this PurchaseRequisition.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the nextApprover value for this PurchaseRequisition.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this PurchaseRequisition.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover) {
        this.nextApprover = nextApprover;
    }


    /**
     * Gets the taxTotal value for this PurchaseRequisition.
     * 
     * @return taxTotal
     */
    public java.lang.Double getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this PurchaseRequisition.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(java.lang.Double taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the tax2Total value for this PurchaseRequisition.
     * 
     * @return tax2Total
     */
    public java.lang.Double getTax2Total() {
        return tax2Total;
    }


    /**
     * Sets the tax2Total value for this PurchaseRequisition.
     * 
     * @param tax2Total
     */
    public void setTax2Total(java.lang.Double tax2Total) {
        this.tax2Total = tax2Total;
    }


    /**
     * Gets the subsidiary value for this PurchaseRequisition.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PurchaseRequisition.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the department value for this PurchaseRequisition.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PurchaseRequisition.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this PurchaseRequisition.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PurchaseRequisition.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this PurchaseRequisition.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PurchaseRequisition.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the total value for this PurchaseRequisition.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this PurchaseRequisition.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the itemList value for this PurchaseRequisition.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this PurchaseRequisition.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the expenseList value for this PurchaseRequisition.
     * 
     * @return expenseList
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpenseList getExpenseList() {
        return expenseList;
    }


    /**
     * Sets the expenseList value for this PurchaseRequisition.
     * 
     * @param expenseList
     */
    public void setExpenseList(com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpenseList expenseList) {
        this.expenseList = expenseList;
    }


    /**
     * Gets the accountingBookDetailList value for this PurchaseRequisition.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this PurchaseRequisition.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the customFieldList value for this PurchaseRequisition.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this PurchaseRequisition.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this PurchaseRequisition.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PurchaseRequisition.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this PurchaseRequisition.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PurchaseRequisition.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseRequisition)) return false;
        PurchaseRequisition other = (PurchaseRequisition) obj;
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
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.vatRegNum==null && other.getVatRegNum()==null) || 
             (this.vatRegNum!=null &&
              this.vatRegNum.equals(other.getVatRegNum()))) &&
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              this.nexus.equals(other.getNexus()))) &&
            ((this.taxRegNum==null && other.getTaxRegNum()==null) || 
             (this.taxRegNum!=null &&
              this.taxRegNum.equals(other.getTaxRegNum()))) &&
            ((this.taxRegOverride==null && other.getTaxRegOverride()==null) || 
             (this.taxRegOverride!=null &&
              this.taxRegOverride.equals(other.getTaxRegOverride()))) &&
            ((this.estimatedTotal==null && other.getEstimatedTotal()==null) || 
             (this.estimatedTotal!=null &&
              this.estimatedTotal.equals(other.getEstimatedTotal()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              this.nextApprover.equals(other.getNextApprover()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              this.taxTotal.equals(other.getTaxTotal()))) &&
            ((this.tax2Total==null && other.getTax2Total()==null) || 
             (this.tax2Total!=null &&
              this.tax2Total.equals(other.getTax2Total()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.expenseList==null && other.getExpenseList()==null) || 
             (this.expenseList!=null &&
              this.expenseList.equals(other.getExpenseList()))) &&
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getVatRegNum() != null) {
            _hashCode += getVatRegNum().hashCode();
        }
        if (getNexus() != null) {
            _hashCode += getNexus().hashCode();
        }
        if (getTaxRegNum() != null) {
            _hashCode += getTaxRegNum().hashCode();
        }
        if (getTaxRegOverride() != null) {
            _hashCode += getTaxRegOverride().hashCode();
        }
        if (getEstimatedTotal() != null) {
            _hashCode += getEstimatedTotal().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getNextApprover() != null) {
            _hashCode += getNextApprover().hashCode();
        }
        if (getTaxTotal() != null) {
            _hashCode += getTaxTotal().hashCode();
        }
        if (getTax2Total() != null) {
            _hashCode += getTax2Total().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getExpenseList() != null) {
            _hashCode += getExpenseList().hashCode();
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
        new org.apache.axis.description.TypeDesc(PurchaseRequisition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseRequisition"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "subTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "vatRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxRegOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "estimatedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseRequisitionItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "expenseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseRequisitionExpenseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
