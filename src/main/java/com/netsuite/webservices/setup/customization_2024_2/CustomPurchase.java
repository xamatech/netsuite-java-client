/**
 * CustomPurchase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2024_2;

public class CustomPurchase  extends com.netsuite.webservices.platform.core_2024_2.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef tranType;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef subsidiaryTaxRegNum;

    private java.lang.Boolean taxRegOverride;

    private java.lang.Boolean taxDetailsOverride;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef billAddressList;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef account;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef entity;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef postingPeriod;

    private java.util.Calendar tranDate;

    private java.lang.String currencyName;

    private com.netsuite.webservices.platform.common_2024_2.Address billingAddress;

    private java.lang.Double exchangeRate;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef entityTaxRegNum;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef terms;

    private java.util.Calendar dueDate;

    private java.util.Calendar discountDate;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef createdFrom;

    private java.lang.Double userTotal;

    private java.lang.Double discountAmount;

    private java.lang.Double taxTotal;

    private java.lang.Boolean paymentHold;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef tranStatus;

    private java.lang.Double availableVendorCredit;

    private com.netsuite.webservices.platform.common_2024_2.types.LandedCostMethod landedCostMethod;

    private java.lang.Boolean landedCostPerLine;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef currency;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef incoterm;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef _class;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef department;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef location;

    private java.lang.String status;

    private java.lang.String transactionNumber;

    private java.lang.Boolean overrideInstallments;

    private com.netsuite.webservices.platform.common_2024_2.InstallmentList installmentList;

    private com.netsuite.webservices.setup.customization_2024_2.CustomPurchaseExpenseList expenseList;

    private com.netsuite.webservices.platform.common_2024_2.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.setup.customization_2024_2.CustomPurchaseItemList itemList;

    private com.netsuite.webservices.platform.common_2024_2.PurchLandedCostList landedCostsList;

    private com.netsuite.webservices.platform.core_2024_2.RecordRefList purchaseOrderList;

    private com.netsuite.webservices.platform.common_2024_2.TaxDetailsList taxDetailsList;

    private com.netsuite.webservices.platform.core_2024_2.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CustomPurchase() {
    }

    public CustomPurchase(
           com.netsuite.webservices.platform.core_2024_2.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2024_2.RecordRef tranType,
           com.netsuite.webservices.platform.core_2024_2.RecordRef nexus,
           com.netsuite.webservices.platform.core_2024_2.RecordRef subsidiaryTaxRegNum,
           java.lang.Boolean taxRegOverride,
           java.lang.Boolean taxDetailsOverride,
           com.netsuite.webservices.platform.core_2024_2.RecordRef customForm,
           com.netsuite.webservices.platform.core_2024_2.RecordRef billAddressList,
           com.netsuite.webservices.platform.core_2024_2.RecordRef account,
           com.netsuite.webservices.platform.core_2024_2.RecordRef entity,
           com.netsuite.webservices.platform.core_2024_2.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2024_2.RecordRef postingPeriod,
           java.util.Calendar tranDate,
           java.lang.String currencyName,
           com.netsuite.webservices.platform.common_2024_2.Address billingAddress,
           java.lang.Double exchangeRate,
           com.netsuite.webservices.platform.core_2024_2.RecordRef entityTaxRegNum,
           com.netsuite.webservices.platform.core_2024_2.RecordRef terms,
           java.util.Calendar dueDate,
           java.util.Calendar discountDate,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2024_2.RecordRef createdFrom,
           java.lang.Double userTotal,
           java.lang.Double discountAmount,
           java.lang.Double taxTotal,
           java.lang.Boolean paymentHold,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2024_2.RecordRef tranStatus,
           java.lang.Double availableVendorCredit,
           com.netsuite.webservices.platform.common_2024_2.types.LandedCostMethod landedCostMethod,
           java.lang.Boolean landedCostPerLine,
           com.netsuite.webservices.platform.core_2024_2.RecordRef currency,
           com.netsuite.webservices.platform.core_2024_2.RecordRef incoterm,
           com.netsuite.webservices.platform.core_2024_2.RecordRef _class,
           com.netsuite.webservices.platform.core_2024_2.RecordRef department,
           com.netsuite.webservices.platform.core_2024_2.RecordRef location,
           java.lang.String status,
           java.lang.String transactionNumber,
           java.lang.Boolean overrideInstallments,
           com.netsuite.webservices.platform.common_2024_2.InstallmentList installmentList,
           com.netsuite.webservices.setup.customization_2024_2.CustomPurchaseExpenseList expenseList,
           com.netsuite.webservices.platform.common_2024_2.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.setup.customization_2024_2.CustomPurchaseItemList itemList,
           com.netsuite.webservices.platform.common_2024_2.PurchLandedCostList landedCostsList,
           com.netsuite.webservices.platform.core_2024_2.RecordRefList purchaseOrderList,
           com.netsuite.webservices.platform.common_2024_2.TaxDetailsList taxDetailsList,
           com.netsuite.webservices.platform.core_2024_2.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.tranType = tranType;
        this.nexus = nexus;
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.taxDetailsOverride = taxDetailsOverride;
        this.customForm = customForm;
        this.billAddressList = billAddressList;
        this.account = account;
        this.entity = entity;
        this.subsidiary = subsidiary;
        this.postingPeriod = postingPeriod;
        this.tranDate = tranDate;
        this.currencyName = currencyName;
        this.billingAddress = billingAddress;
        this.exchangeRate = exchangeRate;
        this.entityTaxRegNum = entityTaxRegNum;
        this.terms = terms;
        this.dueDate = dueDate;
        this.discountDate = discountDate;
        this.tranId = tranId;
        this.createdFrom = createdFrom;
        this.userTotal = userTotal;
        this.discountAmount = discountAmount;
        this.taxTotal = taxTotal;
        this.paymentHold = paymentHold;
        this.memo = memo;
        this.tranStatus = tranStatus;
        this.availableVendorCredit = availableVendorCredit;
        this.landedCostMethod = landedCostMethod;
        this.landedCostPerLine = landedCostPerLine;
        this.currency = currency;
        this.incoterm = incoterm;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.status = status;
        this.transactionNumber = transactionNumber;
        this.overrideInstallments = overrideInstallments;
        this.installmentList = installmentList;
        this.expenseList = expenseList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.itemList = itemList;
        this.landedCostsList = landedCostsList;
        this.purchaseOrderList = purchaseOrderList;
        this.taxDetailsList = taxDetailsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this CustomPurchase.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CustomPurchase.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this CustomPurchase.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CustomPurchase.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the tranType value for this CustomPurchase.
     * 
     * @return tranType
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getTranType() {
        return tranType;
    }


    /**
     * Sets the tranType value for this CustomPurchase.
     * 
     * @param tranType
     */
    public void setTranType(com.netsuite.webservices.platform.core_2024_2.RecordRef tranType) {
        this.tranType = tranType;
    }


    /**
     * Gets the nexus value for this CustomPurchase.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this CustomPurchase.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2024_2.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the subsidiaryTaxRegNum value for this CustomPurchase.
     * 
     * @return subsidiaryTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getSubsidiaryTaxRegNum() {
        return subsidiaryTaxRegNum;
    }


    /**
     * Sets the subsidiaryTaxRegNum value for this CustomPurchase.
     * 
     * @param subsidiaryTaxRegNum
     */
    public void setSubsidiaryTaxRegNum(com.netsuite.webservices.platform.core_2024_2.RecordRef subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }


    /**
     * Gets the taxRegOverride value for this CustomPurchase.
     * 
     * @return taxRegOverride
     */
    public java.lang.Boolean getTaxRegOverride() {
        return taxRegOverride;
    }


    /**
     * Sets the taxRegOverride value for this CustomPurchase.
     * 
     * @param taxRegOverride
     */
    public void setTaxRegOverride(java.lang.Boolean taxRegOverride) {
        this.taxRegOverride = taxRegOverride;
    }


    /**
     * Gets the taxDetailsOverride value for this CustomPurchase.
     * 
     * @return taxDetailsOverride
     */
    public java.lang.Boolean getTaxDetailsOverride() {
        return taxDetailsOverride;
    }


    /**
     * Sets the taxDetailsOverride value for this CustomPurchase.
     * 
     * @param taxDetailsOverride
     */
    public void setTaxDetailsOverride(java.lang.Boolean taxDetailsOverride) {
        this.taxDetailsOverride = taxDetailsOverride;
    }


    /**
     * Gets the customForm value for this CustomPurchase.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this CustomPurchase.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2024_2.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the billAddressList value for this CustomPurchase.
     * 
     * @return billAddressList
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getBillAddressList() {
        return billAddressList;
    }


    /**
     * Sets the billAddressList value for this CustomPurchase.
     * 
     * @param billAddressList
     */
    public void setBillAddressList(com.netsuite.webservices.platform.core_2024_2.RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }


    /**
     * Gets the account value for this CustomPurchase.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CustomPurchase.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2024_2.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the entity value for this CustomPurchase.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this CustomPurchase.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2024_2.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the subsidiary value for this CustomPurchase.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this CustomPurchase.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2024_2.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the postingPeriod value for this CustomPurchase.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this CustomPurchase.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2024_2.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the tranDate value for this CustomPurchase.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this CustomPurchase.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the currencyName value for this CustomPurchase.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this CustomPurchase.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the billingAddress value for this CustomPurchase.
     * 
     * @return billingAddress
     */
    public com.netsuite.webservices.platform.common_2024_2.Address getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this CustomPurchase.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(com.netsuite.webservices.platform.common_2024_2.Address billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the exchangeRate value for this CustomPurchase.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this CustomPurchase.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the entityTaxRegNum value for this CustomPurchase.
     * 
     * @return entityTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getEntityTaxRegNum() {
        return entityTaxRegNum;
    }


    /**
     * Sets the entityTaxRegNum value for this CustomPurchase.
     * 
     * @param entityTaxRegNum
     */
    public void setEntityTaxRegNum(com.netsuite.webservices.platform.core_2024_2.RecordRef entityTaxRegNum) {
        this.entityTaxRegNum = entityTaxRegNum;
    }


    /**
     * Gets the terms value for this CustomPurchase.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this CustomPurchase.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2024_2.RecordRef terms) {
        this.terms = terms;
    }


    /**
     * Gets the dueDate value for this CustomPurchase.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this CustomPurchase.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the discountDate value for this CustomPurchase.
     * 
     * @return discountDate
     */
    public java.util.Calendar getDiscountDate() {
        return discountDate;
    }


    /**
     * Sets the discountDate value for this CustomPurchase.
     * 
     * @param discountDate
     */
    public void setDiscountDate(java.util.Calendar discountDate) {
        this.discountDate = discountDate;
    }


    /**
     * Gets the tranId value for this CustomPurchase.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this CustomPurchase.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the createdFrom value for this CustomPurchase.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this CustomPurchase.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2024_2.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the userTotal value for this CustomPurchase.
     * 
     * @return userTotal
     */
    public java.lang.Double getUserTotal() {
        return userTotal;
    }


    /**
     * Sets the userTotal value for this CustomPurchase.
     * 
     * @param userTotal
     */
    public void setUserTotal(java.lang.Double userTotal) {
        this.userTotal = userTotal;
    }


    /**
     * Gets the discountAmount value for this CustomPurchase.
     * 
     * @return discountAmount
     */
    public java.lang.Double getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this CustomPurchase.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.lang.Double discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the taxTotal value for this CustomPurchase.
     * 
     * @return taxTotal
     */
    public java.lang.Double getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this CustomPurchase.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(java.lang.Double taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the paymentHold value for this CustomPurchase.
     * 
     * @return paymentHold
     */
    public java.lang.Boolean getPaymentHold() {
        return paymentHold;
    }


    /**
     * Sets the paymentHold value for this CustomPurchase.
     * 
     * @param paymentHold
     */
    public void setPaymentHold(java.lang.Boolean paymentHold) {
        this.paymentHold = paymentHold;
    }


    /**
     * Gets the memo value for this CustomPurchase.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this CustomPurchase.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the tranStatus value for this CustomPurchase.
     * 
     * @return tranStatus
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getTranStatus() {
        return tranStatus;
    }


    /**
     * Sets the tranStatus value for this CustomPurchase.
     * 
     * @param tranStatus
     */
    public void setTranStatus(com.netsuite.webservices.platform.core_2024_2.RecordRef tranStatus) {
        this.tranStatus = tranStatus;
    }


    /**
     * Gets the availableVendorCredit value for this CustomPurchase.
     * 
     * @return availableVendorCredit
     */
    public java.lang.Double getAvailableVendorCredit() {
        return availableVendorCredit;
    }


    /**
     * Sets the availableVendorCredit value for this CustomPurchase.
     * 
     * @param availableVendorCredit
     */
    public void setAvailableVendorCredit(java.lang.Double availableVendorCredit) {
        this.availableVendorCredit = availableVendorCredit;
    }


    /**
     * Gets the landedCostMethod value for this CustomPurchase.
     * 
     * @return landedCostMethod
     */
    public com.netsuite.webservices.platform.common_2024_2.types.LandedCostMethod getLandedCostMethod() {
        return landedCostMethod;
    }


    /**
     * Sets the landedCostMethod value for this CustomPurchase.
     * 
     * @param landedCostMethod
     */
    public void setLandedCostMethod(com.netsuite.webservices.platform.common_2024_2.types.LandedCostMethod landedCostMethod) {
        this.landedCostMethod = landedCostMethod;
    }


    /**
     * Gets the landedCostPerLine value for this CustomPurchase.
     * 
     * @return landedCostPerLine
     */
    public java.lang.Boolean getLandedCostPerLine() {
        return landedCostPerLine;
    }


    /**
     * Sets the landedCostPerLine value for this CustomPurchase.
     * 
     * @param landedCostPerLine
     */
    public void setLandedCostPerLine(java.lang.Boolean landedCostPerLine) {
        this.landedCostPerLine = landedCostPerLine;
    }


    /**
     * Gets the currency value for this CustomPurchase.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CustomPurchase.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2024_2.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the incoterm value for this CustomPurchase.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this CustomPurchase.
     * 
     * @param incoterm
     */
    public void setIncoterm(com.netsuite.webservices.platform.core_2024_2.RecordRef incoterm) {
        this.incoterm = incoterm;
    }


    /**
     * Gets the _class value for this CustomPurchase.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this CustomPurchase.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2024_2.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the department value for this CustomPurchase.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CustomPurchase.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2024_2.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this CustomPurchase.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CustomPurchase.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2024_2.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the status value for this CustomPurchase.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CustomPurchase.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the transactionNumber value for this CustomPurchase.
     * 
     * @return transactionNumber
     */
    public java.lang.String getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this CustomPurchase.
     * 
     * @param transactionNumber
     */
    public void setTransactionNumber(java.lang.String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the overrideInstallments value for this CustomPurchase.
     * 
     * @return overrideInstallments
     */
    public java.lang.Boolean getOverrideInstallments() {
        return overrideInstallments;
    }


    /**
     * Sets the overrideInstallments value for this CustomPurchase.
     * 
     * @param overrideInstallments
     */
    public void setOverrideInstallments(java.lang.Boolean overrideInstallments) {
        this.overrideInstallments = overrideInstallments;
    }


    /**
     * Gets the installmentList value for this CustomPurchase.
     * 
     * @return installmentList
     */
    public com.netsuite.webservices.platform.common_2024_2.InstallmentList getInstallmentList() {
        return installmentList;
    }


    /**
     * Sets the installmentList value for this CustomPurchase.
     * 
     * @param installmentList
     */
    public void setInstallmentList(com.netsuite.webservices.platform.common_2024_2.InstallmentList installmentList) {
        this.installmentList = installmentList;
    }


    /**
     * Gets the expenseList value for this CustomPurchase.
     * 
     * @return expenseList
     */
    public com.netsuite.webservices.setup.customization_2024_2.CustomPurchaseExpenseList getExpenseList() {
        return expenseList;
    }


    /**
     * Sets the expenseList value for this CustomPurchase.
     * 
     * @param expenseList
     */
    public void setExpenseList(com.netsuite.webservices.setup.customization_2024_2.CustomPurchaseExpenseList expenseList) {
        this.expenseList = expenseList;
    }


    /**
     * Gets the accountingBookDetailList value for this CustomPurchase.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2024_2.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this CustomPurchase.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2024_2.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the itemList value for this CustomPurchase.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.setup.customization_2024_2.CustomPurchaseItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this CustomPurchase.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.setup.customization_2024_2.CustomPurchaseItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the landedCostsList value for this CustomPurchase.
     * 
     * @return landedCostsList
     */
    public com.netsuite.webservices.platform.common_2024_2.PurchLandedCostList getLandedCostsList() {
        return landedCostsList;
    }


    /**
     * Sets the landedCostsList value for this CustomPurchase.
     * 
     * @param landedCostsList
     */
    public void setLandedCostsList(com.netsuite.webservices.platform.common_2024_2.PurchLandedCostList landedCostsList) {
        this.landedCostsList = landedCostsList;
    }


    /**
     * Gets the purchaseOrderList value for this CustomPurchase.
     * 
     * @return purchaseOrderList
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRefList getPurchaseOrderList() {
        return purchaseOrderList;
    }


    /**
     * Sets the purchaseOrderList value for this CustomPurchase.
     * 
     * @param purchaseOrderList
     */
    public void setPurchaseOrderList(com.netsuite.webservices.platform.core_2024_2.RecordRefList purchaseOrderList) {
        this.purchaseOrderList = purchaseOrderList;
    }


    /**
     * Gets the taxDetailsList value for this CustomPurchase.
     * 
     * @return taxDetailsList
     */
    public com.netsuite.webservices.platform.common_2024_2.TaxDetailsList getTaxDetailsList() {
        return taxDetailsList;
    }


    /**
     * Sets the taxDetailsList value for this CustomPurchase.
     * 
     * @param taxDetailsList
     */
    public void setTaxDetailsList(com.netsuite.webservices.platform.common_2024_2.TaxDetailsList taxDetailsList) {
        this.taxDetailsList = taxDetailsList;
    }


    /**
     * Gets the customFieldList value for this CustomPurchase.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2024_2.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CustomPurchase.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2024_2.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this CustomPurchase.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomPurchase.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CustomPurchase.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomPurchase.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomPurchase)) return false;
        CustomPurchase other = (CustomPurchase) obj;
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
            ((this.tranType==null && other.getTranType()==null) || 
             (this.tranType!=null &&
              this.tranType.equals(other.getTranType()))) &&
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
            ((this.billAddressList==null && other.getBillAddressList()==null) || 
             (this.billAddressList!=null &&
              this.billAddressList.equals(other.getBillAddressList()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.entityTaxRegNum==null && other.getEntityTaxRegNum()==null) || 
             (this.entityTaxRegNum!=null &&
              this.entityTaxRegNum.equals(other.getEntityTaxRegNum()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.discountDate==null && other.getDiscountDate()==null) || 
             (this.discountDate!=null &&
              this.discountDate.equals(other.getDiscountDate()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.userTotal==null && other.getUserTotal()==null) || 
             (this.userTotal!=null &&
              this.userTotal.equals(other.getUserTotal()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              this.taxTotal.equals(other.getTaxTotal()))) &&
            ((this.paymentHold==null && other.getPaymentHold()==null) || 
             (this.paymentHold!=null &&
              this.paymentHold.equals(other.getPaymentHold()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.tranStatus==null && other.getTranStatus()==null) || 
             (this.tranStatus!=null &&
              this.tranStatus.equals(other.getTranStatus()))) &&
            ((this.availableVendorCredit==null && other.getAvailableVendorCredit()==null) || 
             (this.availableVendorCredit!=null &&
              this.availableVendorCredit.equals(other.getAvailableVendorCredit()))) &&
            ((this.landedCostMethod==null && other.getLandedCostMethod()==null) || 
             (this.landedCostMethod!=null &&
              this.landedCostMethod.equals(other.getLandedCostMethod()))) &&
            ((this.landedCostPerLine==null && other.getLandedCostPerLine()==null) || 
             (this.landedCostPerLine!=null &&
              this.landedCostPerLine.equals(other.getLandedCostPerLine()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              this.incoterm.equals(other.getIncoterm()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.transactionNumber==null && other.getTransactionNumber()==null) || 
             (this.transactionNumber!=null &&
              this.transactionNumber.equals(other.getTransactionNumber()))) &&
            ((this.overrideInstallments==null && other.getOverrideInstallments()==null) || 
             (this.overrideInstallments!=null &&
              this.overrideInstallments.equals(other.getOverrideInstallments()))) &&
            ((this.installmentList==null && other.getInstallmentList()==null) || 
             (this.installmentList!=null &&
              this.installmentList.equals(other.getInstallmentList()))) &&
            ((this.expenseList==null && other.getExpenseList()==null) || 
             (this.expenseList!=null &&
              this.expenseList.equals(other.getExpenseList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.landedCostsList==null && other.getLandedCostsList()==null) || 
             (this.landedCostsList!=null &&
              this.landedCostsList.equals(other.getLandedCostsList()))) &&
            ((this.purchaseOrderList==null && other.getPurchaseOrderList()==null) || 
             (this.purchaseOrderList!=null &&
              this.purchaseOrderList.equals(other.getPurchaseOrderList()))) &&
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
        if (getTranType() != null) {
            _hashCode += getTranType().hashCode();
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
        if (getBillAddressList() != null) {
            _hashCode += getBillAddressList().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getEntityTaxRegNum() != null) {
            _hashCode += getEntityTaxRegNum().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getDiscountDate() != null) {
            _hashCode += getDiscountDate().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getUserTotal() != null) {
            _hashCode += getUserTotal().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getTaxTotal() != null) {
            _hashCode += getTaxTotal().hashCode();
        }
        if (getPaymentHold() != null) {
            _hashCode += getPaymentHold().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getTranStatus() != null) {
            _hashCode += getTranStatus().hashCode();
        }
        if (getAvailableVendorCredit() != null) {
            _hashCode += getAvailableVendorCredit().hashCode();
        }
        if (getLandedCostMethod() != null) {
            _hashCode += getLandedCostMethod().hashCode();
        }
        if (getLandedCostPerLine() != null) {
            _hashCode += getLandedCostPerLine().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getIncoterm() != null) {
            _hashCode += getIncoterm().hashCode();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTransactionNumber() != null) {
            _hashCode += getTransactionNumber().hashCode();
        }
        if (getOverrideInstallments() != null) {
            _hashCode += getOverrideInstallments().hashCode();
        }
        if (getInstallmentList() != null) {
            _hashCode += getInstallmentList().hashCode();
        }
        if (getExpenseList() != null) {
            _hashCode += getExpenseList().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getLandedCostsList() != null) {
            _hashCode += getLandedCostsList().hashCode();
        }
        if (getPurchaseOrderList() != null) {
            _hashCode += getPurchaseOrderList().hashCode();
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
        new org.apache.axis.description.TypeDesc(CustomPurchase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "CustomPurchase"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "tranType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "taxRegOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "entityTaxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "discountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "userTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "discountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "paymentHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "tranStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableVendorCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "availableVendorCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "landedCostMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2024_2.platform.webservices.netsuite.com", "LandedCostMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostPerLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "landedCostPerLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "transactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideInstallments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "overrideInstallments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "installmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "InstallmentList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "expenseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "CustomPurchaseExpenseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "CustomPurchaseItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "landedCostsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "PurchLandedCostList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "purchaseOrderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "taxDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "TaxDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "CustomFieldList"));
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
