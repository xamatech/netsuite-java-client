/**
 * PurchaseOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class PurchaseOrder  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum;

    private java.lang.Boolean taxRegOverride;

    private java.lang.Boolean taxDetailsOverride;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseContract;

    private java.lang.String vatRegNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef employee;

    private java.lang.Boolean supervisorApproval;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum;

    private java.util.Calendar taxPointDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef terms;

    private java.util.Calendar dueDate;

    private java.lang.String otherRefNum;

    private java.lang.Double availableVendorCredit;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus;

    private java.lang.Double exchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover;

    private java.lang.String source;

    private java.lang.String currencyName;

    private java.lang.Boolean toBePrinted;

    private java.lang.Boolean toBeEmailed;

    private java.lang.String email;

    private java.lang.Boolean toBeFaxed;

    private java.lang.String fax;

    private java.lang.String message;

    private com.netsuite.webservices.platform.common_2019_1.Address billingAddress;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipTo;

    private java.lang.Double subTotal;

    private java.lang.Double taxTotal;

    private java.lang.Double tax2Total;

    private com.netsuite.webservices.platform.common_2019_1.Address shippingAddress;

    private java.lang.Boolean shipIsResidential;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList;

    private java.lang.String fob;

    private java.util.Calendar shipDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef incoterm;

    private java.lang.String trackingNumbers;

    private java.lang.String linkedTrackingNumbers;

    private java.lang.Double total;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef intercoTransaction;

    private com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus intercoStatus;

    private java.lang.String status;

    private com.netsuite.webservices.transactions.purchases_2019_1.types.PurchaseOrderOrderStatus orderStatus;

    private com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderItemList itemList;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderExpenseList expenseList;

    private com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public PurchaseOrder() {
    }

    public PurchaseOrder(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nexus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum,
           java.lang.Boolean taxRegOverride,
           java.lang.Boolean taxDetailsOverride,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseContract,
           java.lang.String vatRegNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef employee,
           java.lang.Boolean supervisorApproval,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum,
           java.util.Calendar taxPointDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom,
           com.netsuite.webservices.platform.core_2019_1.RecordRef terms,
           java.util.Calendar dueDate,
           java.lang.String otherRefNum,
           java.lang.Double availableVendorCredit,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus,
           java.lang.Double exchangeRate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover,
           java.lang.String source,
           java.lang.String currencyName,
           java.lang.Boolean toBePrinted,
           java.lang.Boolean toBeEmailed,
           java.lang.String email,
           java.lang.Boolean toBeFaxed,
           java.lang.String fax,
           java.lang.String message,
           com.netsuite.webservices.platform.common_2019_1.Address billingAddress,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipTo,
           java.lang.Double subTotal,
           java.lang.Double taxTotal,
           java.lang.Double tax2Total,
           com.netsuite.webservices.platform.common_2019_1.Address shippingAddress,
           java.lang.Boolean shipIsResidential,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList,
           java.lang.String fob,
           java.util.Calendar shipDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef incoterm,
           java.lang.String trackingNumbers,
           java.lang.String linkedTrackingNumbers,
           java.lang.Double total,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef intercoTransaction,
           com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus intercoStatus,
           java.lang.String status,
           com.netsuite.webservices.transactions.purchases_2019_1.types.PurchaseOrderOrderStatus orderStatus,
           com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderItemList itemList,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderExpenseList expenseList,
           com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.nexus = nexus;
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.taxDetailsOverride = taxDetailsOverride;
        this.customForm = customForm;
        this.entity = entity;
        this.purchaseContract = purchaseContract;
        this.vatRegNum = vatRegNum;
        this.employee = employee;
        this.supervisorApproval = supervisorApproval;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.taxPointDate = taxPointDate;
        this.createdFrom = createdFrom;
        this.terms = terms;
        this.dueDate = dueDate;
        this.otherRefNum = otherRefNum;
        this.availableVendorCredit = availableVendorCredit;
        this.memo = memo;
        this.approvalStatus = approvalStatus;
        this.exchangeRate = exchangeRate;
        this.nextApprover = nextApprover;
        this.source = source;
        this.currencyName = currencyName;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.email = email;
        this.toBeFaxed = toBeFaxed;
        this.fax = fax;
        this.message = message;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.currency = currency;
        this.shipTo = shipTo;
        this.subTotal = subTotal;
        this.taxTotal = taxTotal;
        this.tax2Total = tax2Total;
        this.shippingAddress = shippingAddress;
        this.shipIsResidential = shipIsResidential;
        this.shipAddressList = shipAddressList;
        this.fob = fob;
        this.shipDate = shipDate;
        this.shipMethod = shipMethod;
        this.incoterm = incoterm;
        this.trackingNumbers = trackingNumbers;
        this.linkedTrackingNumbers = linkedTrackingNumbers;
        this.total = total;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.subsidiary = subsidiary;
        this.intercoTransaction = intercoTransaction;
        this.intercoStatus = intercoStatus;
        this.status = status;
        this.orderStatus = orderStatus;
        this.itemList = itemList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.expenseList = expenseList;
        this.taxDetailsList = taxDetailsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this PurchaseOrder.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this PurchaseOrder.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this PurchaseOrder.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PurchaseOrder.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the nexus value for this PurchaseOrder.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this PurchaseOrder.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the subsidiaryTaxRegNum value for this PurchaseOrder.
     * 
     * @return subsidiaryTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiaryTaxRegNum() {
        return subsidiaryTaxRegNum;
    }


    /**
     * Sets the subsidiaryTaxRegNum value for this PurchaseOrder.
     * 
     * @param subsidiaryTaxRegNum
     */
    public void setSubsidiaryTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }


    /**
     * Gets the taxRegOverride value for this PurchaseOrder.
     * 
     * @return taxRegOverride
     */
    public java.lang.Boolean getTaxRegOverride() {
        return taxRegOverride;
    }


    /**
     * Sets the taxRegOverride value for this PurchaseOrder.
     * 
     * @param taxRegOverride
     */
    public void setTaxRegOverride(java.lang.Boolean taxRegOverride) {
        this.taxRegOverride = taxRegOverride;
    }


    /**
     * Gets the taxDetailsOverride value for this PurchaseOrder.
     * 
     * @return taxDetailsOverride
     */
    public java.lang.Boolean getTaxDetailsOverride() {
        return taxDetailsOverride;
    }


    /**
     * Sets the taxDetailsOverride value for this PurchaseOrder.
     * 
     * @param taxDetailsOverride
     */
    public void setTaxDetailsOverride(java.lang.Boolean taxDetailsOverride) {
        this.taxDetailsOverride = taxDetailsOverride;
    }


    /**
     * Gets the customForm value for this PurchaseOrder.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this PurchaseOrder.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the entity value for this PurchaseOrder.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this PurchaseOrder.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the purchaseContract value for this PurchaseOrder.
     * 
     * @return purchaseContract
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchaseContract() {
        return purchaseContract;
    }


    /**
     * Sets the purchaseContract value for this PurchaseOrder.
     * 
     * @param purchaseContract
     */
    public void setPurchaseContract(com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseContract) {
        this.purchaseContract = purchaseContract;
    }


    /**
     * Gets the vatRegNum value for this PurchaseOrder.
     * 
     * @return vatRegNum
     */
    public java.lang.String getVatRegNum() {
        return vatRegNum;
    }


    /**
     * Sets the vatRegNum value for this PurchaseOrder.
     * 
     * @param vatRegNum
     */
    public void setVatRegNum(java.lang.String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }


    /**
     * Gets the employee value for this PurchaseOrder.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this PurchaseOrder.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.RecordRef employee) {
        this.employee = employee;
    }


    /**
     * Gets the supervisorApproval value for this PurchaseOrder.
     * 
     * @return supervisorApproval
     */
    public java.lang.Boolean getSupervisorApproval() {
        return supervisorApproval;
    }


    /**
     * Sets the supervisorApproval value for this PurchaseOrder.
     * 
     * @param supervisorApproval
     */
    public void setSupervisorApproval(java.lang.Boolean supervisorApproval) {
        this.supervisorApproval = supervisorApproval;
    }


    /**
     * Gets the tranDate value for this PurchaseOrder.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this PurchaseOrder.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this PurchaseOrder.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this PurchaseOrder.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the entityTaxRegNum value for this PurchaseOrder.
     * 
     * @return entityTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntityTaxRegNum() {
        return entityTaxRegNum;
    }


    /**
     * Sets the entityTaxRegNum value for this PurchaseOrder.
     * 
     * @param entityTaxRegNum
     */
    public void setEntityTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum) {
        this.entityTaxRegNum = entityTaxRegNum;
    }


    /**
     * Gets the taxPointDate value for this PurchaseOrder.
     * 
     * @return taxPointDate
     */
    public java.util.Calendar getTaxPointDate() {
        return taxPointDate;
    }


    /**
     * Sets the taxPointDate value for this PurchaseOrder.
     * 
     * @param taxPointDate
     */
    public void setTaxPointDate(java.util.Calendar taxPointDate) {
        this.taxPointDate = taxPointDate;
    }


    /**
     * Gets the createdFrom value for this PurchaseOrder.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this PurchaseOrder.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the terms value for this PurchaseOrder.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this PurchaseOrder.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef terms) {
        this.terms = terms;
    }


    /**
     * Gets the dueDate value for this PurchaseOrder.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this PurchaseOrder.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the otherRefNum value for this PurchaseOrder.
     * 
     * @return otherRefNum
     */
    public java.lang.String getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this PurchaseOrder.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(java.lang.String otherRefNum) {
        this.otherRefNum = otherRefNum;
    }


    /**
     * Gets the availableVendorCredit value for this PurchaseOrder.
     * 
     * @return availableVendorCredit
     */
    public java.lang.Double getAvailableVendorCredit() {
        return availableVendorCredit;
    }


    /**
     * Sets the availableVendorCredit value for this PurchaseOrder.
     * 
     * @param availableVendorCredit
     */
    public void setAvailableVendorCredit(java.lang.Double availableVendorCredit) {
        this.availableVendorCredit = availableVendorCredit;
    }


    /**
     * Gets the memo value for this PurchaseOrder.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PurchaseOrder.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the approvalStatus value for this PurchaseOrder.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this PurchaseOrder.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the exchangeRate value for this PurchaseOrder.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this PurchaseOrder.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the nextApprover value for this PurchaseOrder.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this PurchaseOrder.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover) {
        this.nextApprover = nextApprover;
    }


    /**
     * Gets the source value for this PurchaseOrder.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this PurchaseOrder.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the currencyName value for this PurchaseOrder.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this PurchaseOrder.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the toBePrinted value for this PurchaseOrder.
     * 
     * @return toBePrinted
     */
    public java.lang.Boolean getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this PurchaseOrder.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(java.lang.Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }


    /**
     * Gets the toBeEmailed value for this PurchaseOrder.
     * 
     * @return toBeEmailed
     */
    public java.lang.Boolean getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this PurchaseOrder.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(java.lang.Boolean toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }


    /**
     * Gets the email value for this PurchaseOrder.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this PurchaseOrder.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the toBeFaxed value for this PurchaseOrder.
     * 
     * @return toBeFaxed
     */
    public java.lang.Boolean getToBeFaxed() {
        return toBeFaxed;
    }


    /**
     * Sets the toBeFaxed value for this PurchaseOrder.
     * 
     * @param toBeFaxed
     */
    public void setToBeFaxed(java.lang.Boolean toBeFaxed) {
        this.toBeFaxed = toBeFaxed;
    }


    /**
     * Gets the fax value for this PurchaseOrder.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this PurchaseOrder.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the message value for this PurchaseOrder.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this PurchaseOrder.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the billingAddress value for this PurchaseOrder.
     * 
     * @return billingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this PurchaseOrder.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(com.netsuite.webservices.platform.common_2019_1.Address billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billAddressList value for this PurchaseOrder.
     * 
     * @return billAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillAddressList() {
        return billAddressList;
    }


    /**
     * Sets the billAddressList value for this PurchaseOrder.
     * 
     * @param billAddressList
     */
    public void setBillAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }


    /**
     * Gets the currency value for this PurchaseOrder.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PurchaseOrder.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the shipTo value for this PurchaseOrder.
     * 
     * @return shipTo
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this PurchaseOrder.
     * 
     * @param shipTo
     */
    public void setShipTo(com.netsuite.webservices.platform.core_2019_1.RecordRef shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the subTotal value for this PurchaseOrder.
     * 
     * @return subTotal
     */
    public java.lang.Double getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this PurchaseOrder.
     * 
     * @param subTotal
     */
    public void setSubTotal(java.lang.Double subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the taxTotal value for this PurchaseOrder.
     * 
     * @return taxTotal
     */
    public java.lang.Double getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this PurchaseOrder.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(java.lang.Double taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the tax2Total value for this PurchaseOrder.
     * 
     * @return tax2Total
     */
    public java.lang.Double getTax2Total() {
        return tax2Total;
    }


    /**
     * Sets the tax2Total value for this PurchaseOrder.
     * 
     * @param tax2Total
     */
    public void setTax2Total(java.lang.Double tax2Total) {
        this.tax2Total = tax2Total;
    }


    /**
     * Gets the shippingAddress value for this PurchaseOrder.
     * 
     * @return shippingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this PurchaseOrder.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(com.netsuite.webservices.platform.common_2019_1.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the shipIsResidential value for this PurchaseOrder.
     * 
     * @return shipIsResidential
     */
    public java.lang.Boolean getShipIsResidential() {
        return shipIsResidential;
    }


    /**
     * Sets the shipIsResidential value for this PurchaseOrder.
     * 
     * @param shipIsResidential
     */
    public void setShipIsResidential(java.lang.Boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }


    /**
     * Gets the shipAddressList value for this PurchaseOrder.
     * 
     * @return shipAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipAddressList() {
        return shipAddressList;
    }


    /**
     * Sets the shipAddressList value for this PurchaseOrder.
     * 
     * @param shipAddressList
     */
    public void setShipAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }


    /**
     * Gets the fob value for this PurchaseOrder.
     * 
     * @return fob
     */
    public java.lang.String getFob() {
        return fob;
    }


    /**
     * Sets the fob value for this PurchaseOrder.
     * 
     * @param fob
     */
    public void setFob(java.lang.String fob) {
        this.fob = fob;
    }


    /**
     * Gets the shipDate value for this PurchaseOrder.
     * 
     * @return shipDate
     */
    public java.util.Calendar getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this PurchaseOrder.
     * 
     * @param shipDate
     */
    public void setShipDate(java.util.Calendar shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the shipMethod value for this PurchaseOrder.
     * 
     * @return shipMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this PurchaseOrder.
     * 
     * @param shipMethod
     */
    public void setShipMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the incoterm value for this PurchaseOrder.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this PurchaseOrder.
     * 
     * @param incoterm
     */
    public void setIncoterm(com.netsuite.webservices.platform.core_2019_1.RecordRef incoterm) {
        this.incoterm = incoterm;
    }


    /**
     * Gets the trackingNumbers value for this PurchaseOrder.
     * 
     * @return trackingNumbers
     */
    public java.lang.String getTrackingNumbers() {
        return trackingNumbers;
    }


    /**
     * Sets the trackingNumbers value for this PurchaseOrder.
     * 
     * @param trackingNumbers
     */
    public void setTrackingNumbers(java.lang.String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }


    /**
     * Gets the linkedTrackingNumbers value for this PurchaseOrder.
     * 
     * @return linkedTrackingNumbers
     */
    public java.lang.String getLinkedTrackingNumbers() {
        return linkedTrackingNumbers;
    }


    /**
     * Sets the linkedTrackingNumbers value for this PurchaseOrder.
     * 
     * @param linkedTrackingNumbers
     */
    public void setLinkedTrackingNumbers(java.lang.String linkedTrackingNumbers) {
        this.linkedTrackingNumbers = linkedTrackingNumbers;
    }


    /**
     * Gets the total value for this PurchaseOrder.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this PurchaseOrder.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the _class value for this PurchaseOrder.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PurchaseOrder.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the department value for this PurchaseOrder.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PurchaseOrder.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this PurchaseOrder.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PurchaseOrder.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this PurchaseOrder.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PurchaseOrder.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the intercoTransaction value for this PurchaseOrder.
     * 
     * @return intercoTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIntercoTransaction() {
        return intercoTransaction;
    }


    /**
     * Sets the intercoTransaction value for this PurchaseOrder.
     * 
     * @param intercoTransaction
     */
    public void setIntercoTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef intercoTransaction) {
        this.intercoTransaction = intercoTransaction;
    }


    /**
     * Gets the intercoStatus value for this PurchaseOrder.
     * 
     * @return intercoStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus getIntercoStatus() {
        return intercoStatus;
    }


    /**
     * Sets the intercoStatus value for this PurchaseOrder.
     * 
     * @param intercoStatus
     */
    public void setIntercoStatus(com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus intercoStatus) {
        this.intercoStatus = intercoStatus;
    }


    /**
     * Gets the status value for this PurchaseOrder.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PurchaseOrder.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the orderStatus value for this PurchaseOrder.
     * 
     * @return orderStatus
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.types.PurchaseOrderOrderStatus getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this PurchaseOrder.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(com.netsuite.webservices.transactions.purchases_2019_1.types.PurchaseOrderOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the itemList value for this PurchaseOrder.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this PurchaseOrder.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the accountingBookDetailList value for this PurchaseOrder.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this PurchaseOrder.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the expenseList value for this PurchaseOrder.
     * 
     * @return expenseList
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderExpenseList getExpenseList() {
        return expenseList;
    }


    /**
     * Sets the expenseList value for this PurchaseOrder.
     * 
     * @param expenseList
     */
    public void setExpenseList(com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderExpenseList expenseList) {
        this.expenseList = expenseList;
    }


    /**
     * Gets the taxDetailsList value for this PurchaseOrder.
     * 
     * @return taxDetailsList
     */
    public com.netsuite.webservices.platform.common_2019_1.TaxDetailsList getTaxDetailsList() {
        return taxDetailsList;
    }


    /**
     * Sets the taxDetailsList value for this PurchaseOrder.
     * 
     * @param taxDetailsList
     */
    public void setTaxDetailsList(com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList) {
        this.taxDetailsList = taxDetailsList;
    }


    /**
     * Gets the customFieldList value for this PurchaseOrder.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this PurchaseOrder.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this PurchaseOrder.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PurchaseOrder.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this PurchaseOrder.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PurchaseOrder.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrder)) return false;
        PurchaseOrder other = (PurchaseOrder) obj;
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
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              this.nexus.equals(other.getNexus()))) &&
            ((this.subsidiaryTaxRegNum==null && other.getSubsidiaryTaxRegNum()==null) || 
             (this.subsidiaryTaxRegNum!=null &&
              this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum()))) &&
            ((this.taxRegOverride==null && other.getTaxRegOverride()==null) || 
             (this.taxRegOverride!=null &&
              this.taxRegOverride.equals(other.getTaxRegOverride()))) &&
            ((this.taxDetailsOverride==null && other.getTaxDetailsOverride()==null) || 
             (this.taxDetailsOverride!=null &&
              this.taxDetailsOverride.equals(other.getTaxDetailsOverride()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.purchaseContract==null && other.getPurchaseContract()==null) || 
             (this.purchaseContract!=null &&
              this.purchaseContract.equals(other.getPurchaseContract()))) &&
            ((this.vatRegNum==null && other.getVatRegNum()==null) || 
             (this.vatRegNum!=null &&
              this.vatRegNum.equals(other.getVatRegNum()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.supervisorApproval==null && other.getSupervisorApproval()==null) || 
             (this.supervisorApproval!=null &&
              this.supervisorApproval.equals(other.getSupervisorApproval()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.entityTaxRegNum==null && other.getEntityTaxRegNum()==null) || 
             (this.entityTaxRegNum!=null &&
              this.entityTaxRegNum.equals(other.getEntityTaxRegNum()))) &&
            ((this.taxPointDate==null && other.getTaxPointDate()==null) || 
             (this.taxPointDate!=null &&
              this.taxPointDate.equals(other.getTaxPointDate()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.otherRefNum==null && other.getOtherRefNum()==null) || 
             (this.otherRefNum!=null &&
              this.otherRefNum.equals(other.getOtherRefNum()))) &&
            ((this.availableVendorCredit==null && other.getAvailableVendorCredit()==null) || 
             (this.availableVendorCredit!=null &&
              this.availableVendorCredit.equals(other.getAvailableVendorCredit()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              this.nextApprover.equals(other.getNextApprover()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.toBePrinted==null && other.getToBePrinted()==null) || 
             (this.toBePrinted!=null &&
              this.toBePrinted.equals(other.getToBePrinted()))) &&
            ((this.toBeEmailed==null && other.getToBeEmailed()==null) || 
             (this.toBeEmailed!=null &&
              this.toBeEmailed.equals(other.getToBeEmailed()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.toBeFaxed==null && other.getToBeFaxed()==null) || 
             (this.toBeFaxed!=null &&
              this.toBeFaxed.equals(other.getToBeFaxed()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.billAddressList==null && other.getBillAddressList()==null) || 
             (this.billAddressList!=null &&
              this.billAddressList.equals(other.getBillAddressList()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              this.taxTotal.equals(other.getTaxTotal()))) &&
            ((this.tax2Total==null && other.getTax2Total()==null) || 
             (this.tax2Total!=null &&
              this.tax2Total.equals(other.getTax2Total()))) &&
            ((this.shippingAddress==null && other.getShippingAddress()==null) || 
             (this.shippingAddress!=null &&
              this.shippingAddress.equals(other.getShippingAddress()))) &&
            ((this.shipIsResidential==null && other.getShipIsResidential()==null) || 
             (this.shipIsResidential!=null &&
              this.shipIsResidential.equals(other.getShipIsResidential()))) &&
            ((this.shipAddressList==null && other.getShipAddressList()==null) || 
             (this.shipAddressList!=null &&
              this.shipAddressList.equals(other.getShipAddressList()))) &&
            ((this.fob==null && other.getFob()==null) || 
             (this.fob!=null &&
              this.fob.equals(other.getFob()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              this.incoterm.equals(other.getIncoterm()))) &&
            ((this.trackingNumbers==null && other.getTrackingNumbers()==null) || 
             (this.trackingNumbers!=null &&
              this.trackingNumbers.equals(other.getTrackingNumbers()))) &&
            ((this.linkedTrackingNumbers==null && other.getLinkedTrackingNumbers()==null) || 
             (this.linkedTrackingNumbers!=null &&
              this.linkedTrackingNumbers.equals(other.getLinkedTrackingNumbers()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.intercoTransaction==null && other.getIntercoTransaction()==null) || 
             (this.intercoTransaction!=null &&
              this.intercoTransaction.equals(other.getIntercoTransaction()))) &&
            ((this.intercoStatus==null && other.getIntercoStatus()==null) || 
             (this.intercoStatus!=null &&
              this.intercoStatus.equals(other.getIntercoStatus()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
            ((this.expenseList==null && other.getExpenseList()==null) || 
             (this.expenseList!=null &&
              this.expenseList.equals(other.getExpenseList()))) &&
            ((this.taxDetailsList==null && other.getTaxDetailsList()==null) || 
             (this.taxDetailsList!=null &&
              this.taxDetailsList.equals(other.getTaxDetailsList()))) &&
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
        if (getNexus() != null) {
            _hashCode += getNexus().hashCode();
        }
        if (getSubsidiaryTaxRegNum() != null) {
            _hashCode += getSubsidiaryTaxRegNum().hashCode();
        }
        if (getTaxRegOverride() != null) {
            _hashCode += getTaxRegOverride().hashCode();
        }
        if (getTaxDetailsOverride() != null) {
            _hashCode += getTaxDetailsOverride().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getPurchaseContract() != null) {
            _hashCode += getPurchaseContract().hashCode();
        }
        if (getVatRegNum() != null) {
            _hashCode += getVatRegNum().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getSupervisorApproval() != null) {
            _hashCode += getSupervisorApproval().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getEntityTaxRegNum() != null) {
            _hashCode += getEntityTaxRegNum().hashCode();
        }
        if (getTaxPointDate() != null) {
            _hashCode += getTaxPointDate().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getOtherRefNum() != null) {
            _hashCode += getOtherRefNum().hashCode();
        }
        if (getAvailableVendorCredit() != null) {
            _hashCode += getAvailableVendorCredit().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getNextApprover() != null) {
            _hashCode += getNextApprover().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getToBePrinted() != null) {
            _hashCode += getToBePrinted().hashCode();
        }
        if (getToBeEmailed() != null) {
            _hashCode += getToBeEmailed().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getToBeFaxed() != null) {
            _hashCode += getToBeFaxed().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getBillAddressList() != null) {
            _hashCode += getBillAddressList().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getTaxTotal() != null) {
            _hashCode += getTaxTotal().hashCode();
        }
        if (getTax2Total() != null) {
            _hashCode += getTax2Total().hashCode();
        }
        if (getShippingAddress() != null) {
            _hashCode += getShippingAddress().hashCode();
        }
        if (getShipIsResidential() != null) {
            _hashCode += getShipIsResidential().hashCode();
        }
        if (getShipAddressList() != null) {
            _hashCode += getShipAddressList().hashCode();
        }
        if (getFob() != null) {
            _hashCode += getFob().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getIncoterm() != null) {
            _hashCode += getIncoterm().hashCode();
        }
        if (getTrackingNumbers() != null) {
            _hashCode += getTrackingNumbers().hashCode();
        }
        if (getLinkedTrackingNumbers() != null) {
            _hashCode += getLinkedTrackingNumbers().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getIntercoTransaction() != null) {
            _hashCode += getIntercoTransaction().hashCode();
        }
        if (getIntercoStatus() != null) {
            _hashCode += getIntercoStatus().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
        }
        if (getExpenseList() != null) {
            _hashCode += getExpenseList().hashCode();
        }
        if (getTaxDetailsList() != null) {
            _hashCode += getTaxDetailsList().hashCode();
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
        new org.apache.axis.description.TypeDesc(PurchaseOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseOrder"));
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
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "subsidiaryTaxRegNum"));
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
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseContract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "purchaseContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorApproval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "supervisorApproval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("entityTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "entityTaxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "terms"));
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
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableVendorCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "availableVendorCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeFaxed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "toBeFaxed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIsResidential");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipIsResidential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "fob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedTrackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "linkedTrackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "class"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "intercoTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "IntercoStatus"));
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
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "orderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseOrderOrderStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseOrderItemList"));
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
        elemField.setFieldName("expenseList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "expenseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseOrderExpenseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetailsList"));
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
