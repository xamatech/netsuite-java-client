/**
 * ReturnAuthorization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2019_1;

public class ReturnAuthorization  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum;

    private java.lang.Boolean taxRegOverride;

    private java.lang.Boolean taxDetailsOverride;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private java.lang.String vatRegNum;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum;

    private java.util.Calendar taxPointDate;

    private java.lang.String source;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef intercoTransaction;

    private com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus intercoStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef job;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef partner;

    private java.lang.String otherRefNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef drAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef fxAccount;

    private java.util.Calendar salesEffectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule;

    private java.lang.Double totalCostEstimate;

    private java.lang.Double estGrossProfit;

    private java.lang.Double estGrossProfitPercent;

    private java.util.Calendar revRecStartDate;

    private java.util.Calendar revRecEndDate;

    private java.lang.Boolean excludeCommission;

    private java.lang.Double exchangeRate;

    private java.lang.String currencyName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem;

    private java.lang.String discountRate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem;

    private java.lang.Double taxRate;

    private java.lang.Boolean toBePrinted;

    private java.lang.Boolean toBeEmailed;

    private java.lang.Boolean toBeFaxed;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel;

    private java.lang.String message;

    private com.netsuite.webservices.platform.common_2019_1.Address billingAddress;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList;

    private java.lang.String shipAddress;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup;

    private java.lang.Boolean syncSalesTeams;

    private com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus revenueStatus;

    private java.lang.Double recognizedRevenue;

    private java.lang.Double deferredRevenue;

    private java.lang.Boolean revRecOnRevCommitment;

    private com.netsuite.webservices.platform.common_2019_1.types.RevenueCommitStatus revCommitStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard;

    private java.lang.String ccNumber;

    private java.lang.Double altSalesTotal;

    private java.util.Calendar ccExpireDate;

    private java.lang.String ccName;

    private java.lang.String ccStreet;

    private java.lang.String ccZipCode;

    private java.lang.Boolean ccApproved;

    private java.lang.String pnRefNum;

    private java.lang.Double subTotal;

    private java.lang.Double discountTotal;

    private java.lang.Double total;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor;

    private java.lang.String payPalAuthId;

    private java.lang.Boolean payPalProcess;

    private java.lang.String email;

    private java.lang.String fax;

    private java.lang.String debitCardIssueNo;

    private java.lang.Boolean isTaxable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode;

    private java.lang.String status;

    private java.lang.Double taxTotal;

    private java.lang.Double tax2Total;

    private java.util.Calendar validFrom;

    private com.netsuite.webservices.transactions.customers_2019_1.types.ReturnAuthorizationOrderStatus orderStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef giftCert;

    private java.lang.String contribPct;

    private java.lang.Double giftCertTotal;

    private java.lang.Double giftCertApplied;

    private java.lang.Double giftCertAvailable;

    private java.lang.Boolean tranIsVsoeBundle;

    private java.lang.Boolean vsoeAutoCalc;

    private java.lang.Boolean syncPartnerTeams;

    private com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationItemList itemList;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationSalesTeamList salesTeamList;

    private com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationPartnersList partnersList;

    private com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public ReturnAuthorization() {
    }

    public ReturnAuthorization(
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
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           java.lang.String vatRegNum,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum,
           java.util.Calendar taxPointDate,
           java.lang.String source,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef intercoTransaction,
           com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus intercoStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef job,
           com.netsuite.webservices.platform.core_2019_1.RecordRef partner,
           java.lang.String otherRefNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef drAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef fxAccount,
           java.util.Calendar salesEffectiveDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule,
           java.lang.Double totalCostEstimate,
           java.lang.Double estGrossProfit,
           java.lang.Double estGrossProfitPercent,
           java.util.Calendar revRecStartDate,
           java.util.Calendar revRecEndDate,
           java.lang.Boolean excludeCommission,
           java.lang.Double exchangeRate,
           java.lang.String currencyName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem,
           java.lang.String discountRate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem,
           java.lang.Double taxRate,
           java.lang.Boolean toBePrinted,
           java.lang.Boolean toBeEmailed,
           java.lang.Boolean toBeFaxed,
           com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel,
           java.lang.String message,
           com.netsuite.webservices.platform.common_2019_1.Address billingAddress,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList,
           java.lang.String shipAddress,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup,
           java.lang.Boolean syncSalesTeams,
           com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus revenueStatus,
           java.lang.Double recognizedRevenue,
           java.lang.Double deferredRevenue,
           java.lang.Boolean revRecOnRevCommitment,
           com.netsuite.webservices.platform.common_2019_1.types.RevenueCommitStatus revCommitStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard,
           java.lang.String ccNumber,
           java.lang.Double altSalesTotal,
           java.util.Calendar ccExpireDate,
           java.lang.String ccName,
           java.lang.String ccStreet,
           java.lang.String ccZipCode,
           java.lang.Boolean ccApproved,
           java.lang.String pnRefNum,
           java.lang.Double subTotal,
           java.lang.Double discountTotal,
           java.lang.Double total,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor,
           java.lang.String payPalAuthId,
           java.lang.Boolean payPalProcess,
           java.lang.String email,
           java.lang.String fax,
           java.lang.String debitCardIssueNo,
           java.lang.Boolean isTaxable,
           com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode,
           java.lang.String status,
           java.lang.Double taxTotal,
           java.lang.Double tax2Total,
           java.util.Calendar validFrom,
           com.netsuite.webservices.transactions.customers_2019_1.types.ReturnAuthorizationOrderStatus orderStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep,
           com.netsuite.webservices.platform.core_2019_1.RecordRef giftCert,
           java.lang.String contribPct,
           java.lang.Double giftCertTotal,
           java.lang.Double giftCertApplied,
           java.lang.Double giftCertAvailable,
           java.lang.Boolean tranIsVsoeBundle,
           java.lang.Boolean vsoeAutoCalc,
           java.lang.Boolean syncPartnerTeams,
           com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationItemList itemList,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationSalesTeamList salesTeamList,
           com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationPartnersList partnersList,
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
        this.currency = currency;
        this.entity = entity;
        this.vatRegNum = vatRegNum;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.taxPointDate = taxPointDate;
        this.source = source;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiary = subsidiary;
        this.intercoTransaction = intercoTransaction;
        this.intercoStatus = intercoStatus;
        this.job = job;
        this.partner = partner;
        this.otherRefNum = otherRefNum;
        this.leadSource = leadSource;
        this.memo = memo;
        this.drAccount = drAccount;
        this.fxAccount = fxAccount;
        this.salesEffectiveDate = salesEffectiveDate;
        this.createdFrom = createdFrom;
        this.revRecSchedule = revRecSchedule;
        this.totalCostEstimate = totalCostEstimate;
        this.estGrossProfit = estGrossProfit;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.revRecStartDate = revRecStartDate;
        this.revRecEndDate = revRecEndDate;
        this.excludeCommission = excludeCommission;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
        this.discountItem = discountItem;
        this.discountRate = discountRate;
        this.taxItem = taxItem;
        this.taxRate = taxRate;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.toBeFaxed = toBeFaxed;
        this.messageSel = messageSel;
        this.message = message;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.shipAddressList = shipAddressList;
        this.shipAddress = shipAddress;
        this.salesGroup = salesGroup;
        this.syncSalesTeams = syncSalesTeams;
        this.revenueStatus = revenueStatus;
        this.recognizedRevenue = recognizedRevenue;
        this.deferredRevenue = deferredRevenue;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.revCommitStatus = revCommitStatus;
        this.paymentMethod = paymentMethod;
        this.creditCard = creditCard;
        this.ccNumber = ccNumber;
        this.altSalesTotal = altSalesTotal;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.ccApproved = ccApproved;
        this.pnRefNum = pnRefNum;
        this.subTotal = subTotal;
        this.discountTotal = discountTotal;
        this.total = total;
        this.creditCardProcessor = creditCardProcessor;
        this.payPalAuthId = payPalAuthId;
        this.payPalProcess = payPalProcess;
        this.email = email;
        this.fax = fax;
        this.debitCardIssueNo = debitCardIssueNo;
        this.isTaxable = isTaxable;
        this.promoCode = promoCode;
        this.status = status;
        this.taxTotal = taxTotal;
        this.tax2Total = tax2Total;
        this.validFrom = validFrom;
        this.orderStatus = orderStatus;
        this.salesRep = salesRep;
        this.giftCert = giftCert;
        this.contribPct = contribPct;
        this.giftCertTotal = giftCertTotal;
        this.giftCertApplied = giftCertApplied;
        this.giftCertAvailable = giftCertAvailable;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.vsoeAutoCalc = vsoeAutoCalc;
        this.syncPartnerTeams = syncPartnerTeams;
        this.itemList = itemList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
        this.taxDetailsList = taxDetailsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this ReturnAuthorization.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ReturnAuthorization.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this ReturnAuthorization.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ReturnAuthorization.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the nexus value for this ReturnAuthorization.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this ReturnAuthorization.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the subsidiaryTaxRegNum value for this ReturnAuthorization.
     * 
     * @return subsidiaryTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiaryTaxRegNum() {
        return subsidiaryTaxRegNum;
    }


    /**
     * Sets the subsidiaryTaxRegNum value for this ReturnAuthorization.
     * 
     * @param subsidiaryTaxRegNum
     */
    public void setSubsidiaryTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }


    /**
     * Gets the taxRegOverride value for this ReturnAuthorization.
     * 
     * @return taxRegOverride
     */
    public java.lang.Boolean getTaxRegOverride() {
        return taxRegOverride;
    }


    /**
     * Sets the taxRegOverride value for this ReturnAuthorization.
     * 
     * @param taxRegOverride
     */
    public void setTaxRegOverride(java.lang.Boolean taxRegOverride) {
        this.taxRegOverride = taxRegOverride;
    }


    /**
     * Gets the taxDetailsOverride value for this ReturnAuthorization.
     * 
     * @return taxDetailsOverride
     */
    public java.lang.Boolean getTaxDetailsOverride() {
        return taxDetailsOverride;
    }


    /**
     * Sets the taxDetailsOverride value for this ReturnAuthorization.
     * 
     * @param taxDetailsOverride
     */
    public void setTaxDetailsOverride(java.lang.Boolean taxDetailsOverride) {
        this.taxDetailsOverride = taxDetailsOverride;
    }


    /**
     * Gets the customForm value for this ReturnAuthorization.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this ReturnAuthorization.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the currency value for this ReturnAuthorization.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ReturnAuthorization.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the entity value for this ReturnAuthorization.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this ReturnAuthorization.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the vatRegNum value for this ReturnAuthorization.
     * 
     * @return vatRegNum
     */
    public java.lang.String getVatRegNum() {
        return vatRegNum;
    }


    /**
     * Sets the vatRegNum value for this ReturnAuthorization.
     * 
     * @param vatRegNum
     */
    public void setVatRegNum(java.lang.String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }


    /**
     * Gets the tranDate value for this ReturnAuthorization.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this ReturnAuthorization.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this ReturnAuthorization.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this ReturnAuthorization.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the entityTaxRegNum value for this ReturnAuthorization.
     * 
     * @return entityTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntityTaxRegNum() {
        return entityTaxRegNum;
    }


    /**
     * Sets the entityTaxRegNum value for this ReturnAuthorization.
     * 
     * @param entityTaxRegNum
     */
    public void setEntityTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum) {
        this.entityTaxRegNum = entityTaxRegNum;
    }


    /**
     * Gets the taxPointDate value for this ReturnAuthorization.
     * 
     * @return taxPointDate
     */
    public java.util.Calendar getTaxPointDate() {
        return taxPointDate;
    }


    /**
     * Sets the taxPointDate value for this ReturnAuthorization.
     * 
     * @param taxPointDate
     */
    public void setTaxPointDate(java.util.Calendar taxPointDate) {
        this.taxPointDate = taxPointDate;
    }


    /**
     * Gets the source value for this ReturnAuthorization.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ReturnAuthorization.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the department value for this ReturnAuthorization.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ReturnAuthorization.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this ReturnAuthorization.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ReturnAuthorization.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this ReturnAuthorization.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ReturnAuthorization.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this ReturnAuthorization.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ReturnAuthorization.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the intercoTransaction value for this ReturnAuthorization.
     * 
     * @return intercoTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIntercoTransaction() {
        return intercoTransaction;
    }


    /**
     * Sets the intercoTransaction value for this ReturnAuthorization.
     * 
     * @param intercoTransaction
     */
    public void setIntercoTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef intercoTransaction) {
        this.intercoTransaction = intercoTransaction;
    }


    /**
     * Gets the intercoStatus value for this ReturnAuthorization.
     * 
     * @return intercoStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus getIntercoStatus() {
        return intercoStatus;
    }


    /**
     * Sets the intercoStatus value for this ReturnAuthorization.
     * 
     * @param intercoStatus
     */
    public void setIntercoStatus(com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus intercoStatus) {
        this.intercoStatus = intercoStatus;
    }


    /**
     * Gets the job value for this ReturnAuthorization.
     * 
     * @return job
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this ReturnAuthorization.
     * 
     * @param job
     */
    public void setJob(com.netsuite.webservices.platform.core_2019_1.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the partner value for this ReturnAuthorization.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this ReturnAuthorization.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.RecordRef partner) {
        this.partner = partner;
    }


    /**
     * Gets the otherRefNum value for this ReturnAuthorization.
     * 
     * @return otherRefNum
     */
    public java.lang.String getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this ReturnAuthorization.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(java.lang.String otherRefNum) {
        this.otherRefNum = otherRefNum;
    }


    /**
     * Gets the leadSource value for this ReturnAuthorization.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this ReturnAuthorization.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the memo value for this ReturnAuthorization.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this ReturnAuthorization.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the drAccount value for this ReturnAuthorization.
     * 
     * @return drAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDrAccount() {
        return drAccount;
    }


    /**
     * Sets the drAccount value for this ReturnAuthorization.
     * 
     * @param drAccount
     */
    public void setDrAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef drAccount) {
        this.drAccount = drAccount;
    }


    /**
     * Gets the fxAccount value for this ReturnAuthorization.
     * 
     * @return fxAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFxAccount() {
        return fxAccount;
    }


    /**
     * Sets the fxAccount value for this ReturnAuthorization.
     * 
     * @param fxAccount
     */
    public void setFxAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef fxAccount) {
        this.fxAccount = fxAccount;
    }


    /**
     * Gets the salesEffectiveDate value for this ReturnAuthorization.
     * 
     * @return salesEffectiveDate
     */
    public java.util.Calendar getSalesEffectiveDate() {
        return salesEffectiveDate;
    }


    /**
     * Sets the salesEffectiveDate value for this ReturnAuthorization.
     * 
     * @param salesEffectiveDate
     */
    public void setSalesEffectiveDate(java.util.Calendar salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }


    /**
     * Gets the createdFrom value for this ReturnAuthorization.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this ReturnAuthorization.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the revRecSchedule value for this ReturnAuthorization.
     * 
     * @return revRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this ReturnAuthorization.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the totalCostEstimate value for this ReturnAuthorization.
     * 
     * @return totalCostEstimate
     */
    public java.lang.Double getTotalCostEstimate() {
        return totalCostEstimate;
    }


    /**
     * Sets the totalCostEstimate value for this ReturnAuthorization.
     * 
     * @param totalCostEstimate
     */
    public void setTotalCostEstimate(java.lang.Double totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }


    /**
     * Gets the estGrossProfit value for this ReturnAuthorization.
     * 
     * @return estGrossProfit
     */
    public java.lang.Double getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this ReturnAuthorization.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(java.lang.Double estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }


    /**
     * Gets the estGrossProfitPercent value for this ReturnAuthorization.
     * 
     * @return estGrossProfitPercent
     */
    public java.lang.Double getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }


    /**
     * Sets the estGrossProfitPercent value for this ReturnAuthorization.
     * 
     * @param estGrossProfitPercent
     */
    public void setEstGrossProfitPercent(java.lang.Double estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }


    /**
     * Gets the revRecStartDate value for this ReturnAuthorization.
     * 
     * @return revRecStartDate
     */
    public java.util.Calendar getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this ReturnAuthorization.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(java.util.Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the revRecEndDate value for this ReturnAuthorization.
     * 
     * @return revRecEndDate
     */
    public java.util.Calendar getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this ReturnAuthorization.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(java.util.Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }


    /**
     * Gets the excludeCommission value for this ReturnAuthorization.
     * 
     * @return excludeCommission
     */
    public java.lang.Boolean getExcludeCommission() {
        return excludeCommission;
    }


    /**
     * Sets the excludeCommission value for this ReturnAuthorization.
     * 
     * @param excludeCommission
     */
    public void setExcludeCommission(java.lang.Boolean excludeCommission) {
        this.excludeCommission = excludeCommission;
    }


    /**
     * Gets the exchangeRate value for this ReturnAuthorization.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this ReturnAuthorization.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the currencyName value for this ReturnAuthorization.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this ReturnAuthorization.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the discountItem value for this ReturnAuthorization.
     * 
     * @return discountItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDiscountItem() {
        return discountItem;
    }


    /**
     * Sets the discountItem value for this ReturnAuthorization.
     * 
     * @param discountItem
     */
    public void setDiscountItem(com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem) {
        this.discountItem = discountItem;
    }


    /**
     * Gets the discountRate value for this ReturnAuthorization.
     * 
     * @return discountRate
     */
    public java.lang.String getDiscountRate() {
        return discountRate;
    }


    /**
     * Sets the discountRate value for this ReturnAuthorization.
     * 
     * @param discountRate
     */
    public void setDiscountRate(java.lang.String discountRate) {
        this.discountRate = discountRate;
    }


    /**
     * Gets the taxItem value for this ReturnAuthorization.
     * 
     * @return taxItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this ReturnAuthorization.
     * 
     * @param taxItem
     */
    public void setTaxItem(com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the taxRate value for this ReturnAuthorization.
     * 
     * @return taxRate
     */
    public java.lang.Double getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this ReturnAuthorization.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the toBePrinted value for this ReturnAuthorization.
     * 
     * @return toBePrinted
     */
    public java.lang.Boolean getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this ReturnAuthorization.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(java.lang.Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }


    /**
     * Gets the toBeEmailed value for this ReturnAuthorization.
     * 
     * @return toBeEmailed
     */
    public java.lang.Boolean getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this ReturnAuthorization.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(java.lang.Boolean toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }


    /**
     * Gets the toBeFaxed value for this ReturnAuthorization.
     * 
     * @return toBeFaxed
     */
    public java.lang.Boolean getToBeFaxed() {
        return toBeFaxed;
    }


    /**
     * Sets the toBeFaxed value for this ReturnAuthorization.
     * 
     * @param toBeFaxed
     */
    public void setToBeFaxed(java.lang.Boolean toBeFaxed) {
        this.toBeFaxed = toBeFaxed;
    }


    /**
     * Gets the messageSel value for this ReturnAuthorization.
     * 
     * @return messageSel
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getMessageSel() {
        return messageSel;
    }


    /**
     * Sets the messageSel value for this ReturnAuthorization.
     * 
     * @param messageSel
     */
    public void setMessageSel(com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel) {
        this.messageSel = messageSel;
    }


    /**
     * Gets the message value for this ReturnAuthorization.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ReturnAuthorization.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the billingAddress value for this ReturnAuthorization.
     * 
     * @return billingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this ReturnAuthorization.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(com.netsuite.webservices.platform.common_2019_1.Address billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billAddressList value for this ReturnAuthorization.
     * 
     * @return billAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillAddressList() {
        return billAddressList;
    }


    /**
     * Sets the billAddressList value for this ReturnAuthorization.
     * 
     * @param billAddressList
     */
    public void setBillAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }


    /**
     * Gets the shipAddressList value for this ReturnAuthorization.
     * 
     * @return shipAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipAddressList() {
        return shipAddressList;
    }


    /**
     * Sets the shipAddressList value for this ReturnAuthorization.
     * 
     * @param shipAddressList
     */
    public void setShipAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }


    /**
     * Gets the shipAddress value for this ReturnAuthorization.
     * 
     * @return shipAddress
     */
    public java.lang.String getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this ReturnAuthorization.
     * 
     * @param shipAddress
     */
    public void setShipAddress(java.lang.String shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the salesGroup value for this ReturnAuthorization.
     * 
     * @return salesGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesGroup() {
        return salesGroup;
    }


    /**
     * Sets the salesGroup value for this ReturnAuthorization.
     * 
     * @param salesGroup
     */
    public void setSalesGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup) {
        this.salesGroup = salesGroup;
    }


    /**
     * Gets the syncSalesTeams value for this ReturnAuthorization.
     * 
     * @return syncSalesTeams
     */
    public java.lang.Boolean getSyncSalesTeams() {
        return syncSalesTeams;
    }


    /**
     * Sets the syncSalesTeams value for this ReturnAuthorization.
     * 
     * @param syncSalesTeams
     */
    public void setSyncSalesTeams(java.lang.Boolean syncSalesTeams) {
        this.syncSalesTeams = syncSalesTeams;
    }


    /**
     * Gets the revenueStatus value for this ReturnAuthorization.
     * 
     * @return revenueStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this ReturnAuthorization.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus revenueStatus) {
        this.revenueStatus = revenueStatus;
    }


    /**
     * Gets the recognizedRevenue value for this ReturnAuthorization.
     * 
     * @return recognizedRevenue
     */
    public java.lang.Double getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this ReturnAuthorization.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(java.lang.Double recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }


    /**
     * Gets the deferredRevenue value for this ReturnAuthorization.
     * 
     * @return deferredRevenue
     */
    public java.lang.Double getDeferredRevenue() {
        return deferredRevenue;
    }


    /**
     * Sets the deferredRevenue value for this ReturnAuthorization.
     * 
     * @param deferredRevenue
     */
    public void setDeferredRevenue(java.lang.Double deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }


    /**
     * Gets the revRecOnRevCommitment value for this ReturnAuthorization.
     * 
     * @return revRecOnRevCommitment
     */
    public java.lang.Boolean getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this ReturnAuthorization.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(java.lang.Boolean revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }


    /**
     * Gets the revCommitStatus value for this ReturnAuthorization.
     * 
     * @return revCommitStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.RevenueCommitStatus getRevCommitStatus() {
        return revCommitStatus;
    }


    /**
     * Sets the revCommitStatus value for this ReturnAuthorization.
     * 
     * @param revCommitStatus
     */
    public void setRevCommitStatus(com.netsuite.webservices.platform.common_2019_1.types.RevenueCommitStatus revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }


    /**
     * Gets the paymentMethod value for this ReturnAuthorization.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this ReturnAuthorization.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the creditCard value for this ReturnAuthorization.
     * 
     * @return creditCard
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this ReturnAuthorization.
     * 
     * @param creditCard
     */
    public void setCreditCard(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the ccNumber value for this ReturnAuthorization.
     * 
     * @return ccNumber
     */
    public java.lang.String getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this ReturnAuthorization.
     * 
     * @param ccNumber
     */
    public void setCcNumber(java.lang.String ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the altSalesTotal value for this ReturnAuthorization.
     * 
     * @return altSalesTotal
     */
    public java.lang.Double getAltSalesTotal() {
        return altSalesTotal;
    }


    /**
     * Sets the altSalesTotal value for this ReturnAuthorization.
     * 
     * @param altSalesTotal
     */
    public void setAltSalesTotal(java.lang.Double altSalesTotal) {
        this.altSalesTotal = altSalesTotal;
    }


    /**
     * Gets the ccExpireDate value for this ReturnAuthorization.
     * 
     * @return ccExpireDate
     */
    public java.util.Calendar getCcExpireDate() {
        return ccExpireDate;
    }


    /**
     * Sets the ccExpireDate value for this ReturnAuthorization.
     * 
     * @param ccExpireDate
     */
    public void setCcExpireDate(java.util.Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }


    /**
     * Gets the ccName value for this ReturnAuthorization.
     * 
     * @return ccName
     */
    public java.lang.String getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this ReturnAuthorization.
     * 
     * @param ccName
     */
    public void setCcName(java.lang.String ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the ccStreet value for this ReturnAuthorization.
     * 
     * @return ccStreet
     */
    public java.lang.String getCcStreet() {
        return ccStreet;
    }


    /**
     * Sets the ccStreet value for this ReturnAuthorization.
     * 
     * @param ccStreet
     */
    public void setCcStreet(java.lang.String ccStreet) {
        this.ccStreet = ccStreet;
    }


    /**
     * Gets the ccZipCode value for this ReturnAuthorization.
     * 
     * @return ccZipCode
     */
    public java.lang.String getCcZipCode() {
        return ccZipCode;
    }


    /**
     * Sets the ccZipCode value for this ReturnAuthorization.
     * 
     * @param ccZipCode
     */
    public void setCcZipCode(java.lang.String ccZipCode) {
        this.ccZipCode = ccZipCode;
    }


    /**
     * Gets the ccApproved value for this ReturnAuthorization.
     * 
     * @return ccApproved
     */
    public java.lang.Boolean getCcApproved() {
        return ccApproved;
    }


    /**
     * Sets the ccApproved value for this ReturnAuthorization.
     * 
     * @param ccApproved
     */
    public void setCcApproved(java.lang.Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }


    /**
     * Gets the pnRefNum value for this ReturnAuthorization.
     * 
     * @return pnRefNum
     */
    public java.lang.String getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this ReturnAuthorization.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(java.lang.String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }


    /**
     * Gets the subTotal value for this ReturnAuthorization.
     * 
     * @return subTotal
     */
    public java.lang.Double getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this ReturnAuthorization.
     * 
     * @param subTotal
     */
    public void setSubTotal(java.lang.Double subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the discountTotal value for this ReturnAuthorization.
     * 
     * @return discountTotal
     */
    public java.lang.Double getDiscountTotal() {
        return discountTotal;
    }


    /**
     * Sets the discountTotal value for this ReturnAuthorization.
     * 
     * @param discountTotal
     */
    public void setDiscountTotal(java.lang.Double discountTotal) {
        this.discountTotal = discountTotal;
    }


    /**
     * Gets the total value for this ReturnAuthorization.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this ReturnAuthorization.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the creditCardProcessor value for this ReturnAuthorization.
     * 
     * @return creditCardProcessor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCardProcessor() {
        return creditCardProcessor;
    }


    /**
     * Sets the creditCardProcessor value for this ReturnAuthorization.
     * 
     * @param creditCardProcessor
     */
    public void setCreditCardProcessor(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }


    /**
     * Gets the payPalAuthId value for this ReturnAuthorization.
     * 
     * @return payPalAuthId
     */
    public java.lang.String getPayPalAuthId() {
        return payPalAuthId;
    }


    /**
     * Sets the payPalAuthId value for this ReturnAuthorization.
     * 
     * @param payPalAuthId
     */
    public void setPayPalAuthId(java.lang.String payPalAuthId) {
        this.payPalAuthId = payPalAuthId;
    }


    /**
     * Gets the payPalProcess value for this ReturnAuthorization.
     * 
     * @return payPalProcess
     */
    public java.lang.Boolean getPayPalProcess() {
        return payPalProcess;
    }


    /**
     * Sets the payPalProcess value for this ReturnAuthorization.
     * 
     * @param payPalProcess
     */
    public void setPayPalProcess(java.lang.Boolean payPalProcess) {
        this.payPalProcess = payPalProcess;
    }


    /**
     * Gets the email value for this ReturnAuthorization.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ReturnAuthorization.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fax value for this ReturnAuthorization.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this ReturnAuthorization.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the debitCardIssueNo value for this ReturnAuthorization.
     * 
     * @return debitCardIssueNo
     */
    public java.lang.String getDebitCardIssueNo() {
        return debitCardIssueNo;
    }


    /**
     * Sets the debitCardIssueNo value for this ReturnAuthorization.
     * 
     * @param debitCardIssueNo
     */
    public void setDebitCardIssueNo(java.lang.String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }


    /**
     * Gets the isTaxable value for this ReturnAuthorization.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this ReturnAuthorization.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the promoCode value for this ReturnAuthorization.
     * 
     * @return promoCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this ReturnAuthorization.
     * 
     * @param promoCode
     */
    public void setPromoCode(com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the status value for this ReturnAuthorization.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReturnAuthorization.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the taxTotal value for this ReturnAuthorization.
     * 
     * @return taxTotal
     */
    public java.lang.Double getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this ReturnAuthorization.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(java.lang.Double taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the tax2Total value for this ReturnAuthorization.
     * 
     * @return tax2Total
     */
    public java.lang.Double getTax2Total() {
        return tax2Total;
    }


    /**
     * Sets the tax2Total value for this ReturnAuthorization.
     * 
     * @param tax2Total
     */
    public void setTax2Total(java.lang.Double tax2Total) {
        this.tax2Total = tax2Total;
    }


    /**
     * Gets the validFrom value for this ReturnAuthorization.
     * 
     * @return validFrom
     */
    public java.util.Calendar getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this ReturnAuthorization.
     * 
     * @param validFrom
     */
    public void setValidFrom(java.util.Calendar validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the orderStatus value for this ReturnAuthorization.
     * 
     * @return orderStatus
     */
    public com.netsuite.webservices.transactions.customers_2019_1.types.ReturnAuthorizationOrderStatus getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this ReturnAuthorization.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(com.netsuite.webservices.transactions.customers_2019_1.types.ReturnAuthorizationOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the salesRep value for this ReturnAuthorization.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this ReturnAuthorization.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the giftCert value for this ReturnAuthorization.
     * 
     * @return giftCert
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getGiftCert() {
        return giftCert;
    }


    /**
     * Sets the giftCert value for this ReturnAuthorization.
     * 
     * @param giftCert
     */
    public void setGiftCert(com.netsuite.webservices.platform.core_2019_1.RecordRef giftCert) {
        this.giftCert = giftCert;
    }


    /**
     * Gets the contribPct value for this ReturnAuthorization.
     * 
     * @return contribPct
     */
    public java.lang.String getContribPct() {
        return contribPct;
    }


    /**
     * Sets the contribPct value for this ReturnAuthorization.
     * 
     * @param contribPct
     */
    public void setContribPct(java.lang.String contribPct) {
        this.contribPct = contribPct;
    }


    /**
     * Gets the giftCertTotal value for this ReturnAuthorization.
     * 
     * @return giftCertTotal
     */
    public java.lang.Double getGiftCertTotal() {
        return giftCertTotal;
    }


    /**
     * Sets the giftCertTotal value for this ReturnAuthorization.
     * 
     * @param giftCertTotal
     */
    public void setGiftCertTotal(java.lang.Double giftCertTotal) {
        this.giftCertTotal = giftCertTotal;
    }


    /**
     * Gets the giftCertApplied value for this ReturnAuthorization.
     * 
     * @return giftCertApplied
     */
    public java.lang.Double getGiftCertApplied() {
        return giftCertApplied;
    }


    /**
     * Sets the giftCertApplied value for this ReturnAuthorization.
     * 
     * @param giftCertApplied
     */
    public void setGiftCertApplied(java.lang.Double giftCertApplied) {
        this.giftCertApplied = giftCertApplied;
    }


    /**
     * Gets the giftCertAvailable value for this ReturnAuthorization.
     * 
     * @return giftCertAvailable
     */
    public java.lang.Double getGiftCertAvailable() {
        return giftCertAvailable;
    }


    /**
     * Sets the giftCertAvailable value for this ReturnAuthorization.
     * 
     * @param giftCertAvailable
     */
    public void setGiftCertAvailable(java.lang.Double giftCertAvailable) {
        this.giftCertAvailable = giftCertAvailable;
    }


    /**
     * Gets the tranIsVsoeBundle value for this ReturnAuthorization.
     * 
     * @return tranIsVsoeBundle
     */
    public java.lang.Boolean getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this ReturnAuthorization.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(java.lang.Boolean tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }


    /**
     * Gets the vsoeAutoCalc value for this ReturnAuthorization.
     * 
     * @return vsoeAutoCalc
     */
    public java.lang.Boolean getVsoeAutoCalc() {
        return vsoeAutoCalc;
    }


    /**
     * Sets the vsoeAutoCalc value for this ReturnAuthorization.
     * 
     * @param vsoeAutoCalc
     */
    public void setVsoeAutoCalc(java.lang.Boolean vsoeAutoCalc) {
        this.vsoeAutoCalc = vsoeAutoCalc;
    }


    /**
     * Gets the syncPartnerTeams value for this ReturnAuthorization.
     * 
     * @return syncPartnerTeams
     */
    public java.lang.Boolean getSyncPartnerTeams() {
        return syncPartnerTeams;
    }


    /**
     * Sets the syncPartnerTeams value for this ReturnAuthorization.
     * 
     * @param syncPartnerTeams
     */
    public void setSyncPartnerTeams(java.lang.Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }


    /**
     * Gets the itemList value for this ReturnAuthorization.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this ReturnAuthorization.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the accountingBookDetailList value for this ReturnAuthorization.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this ReturnAuthorization.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the salesTeamList value for this ReturnAuthorization.
     * 
     * @return salesTeamList
     */
    public com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }


    /**
     * Sets the salesTeamList value for this ReturnAuthorization.
     * 
     * @param salesTeamList
     */
    public void setSalesTeamList(com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }


    /**
     * Gets the partnersList value for this ReturnAuthorization.
     * 
     * @return partnersList
     */
    public com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationPartnersList getPartnersList() {
        return partnersList;
    }


    /**
     * Sets the partnersList value for this ReturnAuthorization.
     * 
     * @param partnersList
     */
    public void setPartnersList(com.netsuite.webservices.transactions.customers_2019_1.ReturnAuthorizationPartnersList partnersList) {
        this.partnersList = partnersList;
    }


    /**
     * Gets the taxDetailsList value for this ReturnAuthorization.
     * 
     * @return taxDetailsList
     */
    public com.netsuite.webservices.platform.common_2019_1.TaxDetailsList getTaxDetailsList() {
        return taxDetailsList;
    }


    /**
     * Sets the taxDetailsList value for this ReturnAuthorization.
     * 
     * @param taxDetailsList
     */
    public void setTaxDetailsList(com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList) {
        this.taxDetailsList = taxDetailsList;
    }


    /**
     * Gets the customFieldList value for this ReturnAuthorization.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ReturnAuthorization.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this ReturnAuthorization.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ReturnAuthorization.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ReturnAuthorization.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ReturnAuthorization.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnAuthorization)) return false;
        ReturnAuthorization other = (ReturnAuthorization) obj;
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
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.vatRegNum==null && other.getVatRegNum()==null) || 
             (this.vatRegNum!=null &&
              this.vatRegNum.equals(other.getVatRegNum()))) &&
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
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
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
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.otherRefNum==null && other.getOtherRefNum()==null) || 
             (this.otherRefNum!=null &&
              this.otherRefNum.equals(other.getOtherRefNum()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.drAccount==null && other.getDrAccount()==null) || 
             (this.drAccount!=null &&
              this.drAccount.equals(other.getDrAccount()))) &&
            ((this.fxAccount==null && other.getFxAccount()==null) || 
             (this.fxAccount!=null &&
              this.fxAccount.equals(other.getFxAccount()))) &&
            ((this.salesEffectiveDate==null && other.getSalesEffectiveDate()==null) || 
             (this.salesEffectiveDate!=null &&
              this.salesEffectiveDate.equals(other.getSalesEffectiveDate()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.totalCostEstimate==null && other.getTotalCostEstimate()==null) || 
             (this.totalCostEstimate!=null &&
              this.totalCostEstimate.equals(other.getTotalCostEstimate()))) &&
            ((this.estGrossProfit==null && other.getEstGrossProfit()==null) || 
             (this.estGrossProfit!=null &&
              this.estGrossProfit.equals(other.getEstGrossProfit()))) &&
            ((this.estGrossProfitPercent==null && other.getEstGrossProfitPercent()==null) || 
             (this.estGrossProfitPercent!=null &&
              this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              this.revRecStartDate.equals(other.getRevRecStartDate()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              this.revRecEndDate.equals(other.getRevRecEndDate()))) &&
            ((this.excludeCommission==null && other.getExcludeCommission()==null) || 
             (this.excludeCommission!=null &&
              this.excludeCommission.equals(other.getExcludeCommission()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.discountItem==null && other.getDiscountItem()==null) || 
             (this.discountItem!=null &&
              this.discountItem.equals(other.getDiscountItem()))) &&
            ((this.discountRate==null && other.getDiscountRate()==null) || 
             (this.discountRate!=null &&
              this.discountRate.equals(other.getDiscountRate()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              this.taxItem.equals(other.getTaxItem()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.toBePrinted==null && other.getToBePrinted()==null) || 
             (this.toBePrinted!=null &&
              this.toBePrinted.equals(other.getToBePrinted()))) &&
            ((this.toBeEmailed==null && other.getToBeEmailed()==null) || 
             (this.toBeEmailed!=null &&
              this.toBeEmailed.equals(other.getToBeEmailed()))) &&
            ((this.toBeFaxed==null && other.getToBeFaxed()==null) || 
             (this.toBeFaxed!=null &&
              this.toBeFaxed.equals(other.getToBeFaxed()))) &&
            ((this.messageSel==null && other.getMessageSel()==null) || 
             (this.messageSel!=null &&
              this.messageSel.equals(other.getMessageSel()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.billAddressList==null && other.getBillAddressList()==null) || 
             (this.billAddressList!=null &&
              this.billAddressList.equals(other.getBillAddressList()))) &&
            ((this.shipAddressList==null && other.getShipAddressList()==null) || 
             (this.shipAddressList!=null &&
              this.shipAddressList.equals(other.getShipAddressList()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.salesGroup==null && other.getSalesGroup()==null) || 
             (this.salesGroup!=null &&
              this.salesGroup.equals(other.getSalesGroup()))) &&
            ((this.syncSalesTeams==null && other.getSyncSalesTeams()==null) || 
             (this.syncSalesTeams!=null &&
              this.syncSalesTeams.equals(other.getSyncSalesTeams()))) &&
            ((this.revenueStatus==null && other.getRevenueStatus()==null) || 
             (this.revenueStatus!=null &&
              this.revenueStatus.equals(other.getRevenueStatus()))) &&
            ((this.recognizedRevenue==null && other.getRecognizedRevenue()==null) || 
             (this.recognizedRevenue!=null &&
              this.recognizedRevenue.equals(other.getRecognizedRevenue()))) &&
            ((this.deferredRevenue==null && other.getDeferredRevenue()==null) || 
             (this.deferredRevenue!=null &&
              this.deferredRevenue.equals(other.getDeferredRevenue()))) &&
            ((this.revRecOnRevCommitment==null && other.getRevRecOnRevCommitment()==null) || 
             (this.revRecOnRevCommitment!=null &&
              this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment()))) &&
            ((this.revCommitStatus==null && other.getRevCommitStatus()==null) || 
             (this.revCommitStatus!=null &&
              this.revCommitStatus.equals(other.getRevCommitStatus()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.altSalesTotal==null && other.getAltSalesTotal()==null) || 
             (this.altSalesTotal!=null &&
              this.altSalesTotal.equals(other.getAltSalesTotal()))) &&
            ((this.ccExpireDate==null && other.getCcExpireDate()==null) || 
             (this.ccExpireDate!=null &&
              this.ccExpireDate.equals(other.getCcExpireDate()))) &&
            ((this.ccName==null && other.getCcName()==null) || 
             (this.ccName!=null &&
              this.ccName.equals(other.getCcName()))) &&
            ((this.ccStreet==null && other.getCcStreet()==null) || 
             (this.ccStreet!=null &&
              this.ccStreet.equals(other.getCcStreet()))) &&
            ((this.ccZipCode==null && other.getCcZipCode()==null) || 
             (this.ccZipCode!=null &&
              this.ccZipCode.equals(other.getCcZipCode()))) &&
            ((this.ccApproved==null && other.getCcApproved()==null) || 
             (this.ccApproved!=null &&
              this.ccApproved.equals(other.getCcApproved()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              this.pnRefNum.equals(other.getPnRefNum()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.discountTotal==null && other.getDiscountTotal()==null) || 
             (this.discountTotal!=null &&
              this.discountTotal.equals(other.getDiscountTotal()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.creditCardProcessor==null && other.getCreditCardProcessor()==null) || 
             (this.creditCardProcessor!=null &&
              this.creditCardProcessor.equals(other.getCreditCardProcessor()))) &&
            ((this.payPalAuthId==null && other.getPayPalAuthId()==null) || 
             (this.payPalAuthId!=null &&
              this.payPalAuthId.equals(other.getPayPalAuthId()))) &&
            ((this.payPalProcess==null && other.getPayPalProcess()==null) || 
             (this.payPalProcess!=null &&
              this.payPalProcess.equals(other.getPayPalProcess()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.debitCardIssueNo==null && other.getDebitCardIssueNo()==null) || 
             (this.debitCardIssueNo!=null &&
              this.debitCardIssueNo.equals(other.getDebitCardIssueNo()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              this.taxTotal.equals(other.getTaxTotal()))) &&
            ((this.tax2Total==null && other.getTax2Total()==null) || 
             (this.tax2Total!=null &&
              this.tax2Total.equals(other.getTax2Total()))) &&
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.giftCert==null && other.getGiftCert()==null) || 
             (this.giftCert!=null &&
              this.giftCert.equals(other.getGiftCert()))) &&
            ((this.contribPct==null && other.getContribPct()==null) || 
             (this.contribPct!=null &&
              this.contribPct.equals(other.getContribPct()))) &&
            ((this.giftCertTotal==null && other.getGiftCertTotal()==null) || 
             (this.giftCertTotal!=null &&
              this.giftCertTotal.equals(other.getGiftCertTotal()))) &&
            ((this.giftCertApplied==null && other.getGiftCertApplied()==null) || 
             (this.giftCertApplied!=null &&
              this.giftCertApplied.equals(other.getGiftCertApplied()))) &&
            ((this.giftCertAvailable==null && other.getGiftCertAvailable()==null) || 
             (this.giftCertAvailable!=null &&
              this.giftCertAvailable.equals(other.getGiftCertAvailable()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle()))) &&
            ((this.vsoeAutoCalc==null && other.getVsoeAutoCalc()==null) || 
             (this.vsoeAutoCalc!=null &&
              this.vsoeAutoCalc.equals(other.getVsoeAutoCalc()))) &&
            ((this.syncPartnerTeams==null && other.getSyncPartnerTeams()==null) || 
             (this.syncPartnerTeams!=null &&
              this.syncPartnerTeams.equals(other.getSyncPartnerTeams()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
            ((this.salesTeamList==null && other.getSalesTeamList()==null) || 
             (this.salesTeamList!=null &&
              this.salesTeamList.equals(other.getSalesTeamList()))) &&
            ((this.partnersList==null && other.getPartnersList()==null) || 
             (this.partnersList!=null &&
              this.partnersList.equals(other.getPartnersList()))) &&
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getVatRegNum() != null) {
            _hashCode += getVatRegNum().hashCode();
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
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
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getIntercoTransaction() != null) {
            _hashCode += getIntercoTransaction().hashCode();
        }
        if (getIntercoStatus() != null) {
            _hashCode += getIntercoStatus().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getOtherRefNum() != null) {
            _hashCode += getOtherRefNum().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getDrAccount() != null) {
            _hashCode += getDrAccount().hashCode();
        }
        if (getFxAccount() != null) {
            _hashCode += getFxAccount().hashCode();
        }
        if (getSalesEffectiveDate() != null) {
            _hashCode += getSalesEffectiveDate().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getTotalCostEstimate() != null) {
            _hashCode += getTotalCostEstimate().hashCode();
        }
        if (getEstGrossProfit() != null) {
            _hashCode += getEstGrossProfit().hashCode();
        }
        if (getEstGrossProfitPercent() != null) {
            _hashCode += getEstGrossProfitPercent().hashCode();
        }
        if (getRevRecStartDate() != null) {
            _hashCode += getRevRecStartDate().hashCode();
        }
        if (getRevRecEndDate() != null) {
            _hashCode += getRevRecEndDate().hashCode();
        }
        if (getExcludeCommission() != null) {
            _hashCode += getExcludeCommission().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getDiscountItem() != null) {
            _hashCode += getDiscountItem().hashCode();
        }
        if (getDiscountRate() != null) {
            _hashCode += getDiscountRate().hashCode();
        }
        if (getTaxItem() != null) {
            _hashCode += getTaxItem().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getToBePrinted() != null) {
            _hashCode += getToBePrinted().hashCode();
        }
        if (getToBeEmailed() != null) {
            _hashCode += getToBeEmailed().hashCode();
        }
        if (getToBeFaxed() != null) {
            _hashCode += getToBeFaxed().hashCode();
        }
        if (getMessageSel() != null) {
            _hashCode += getMessageSel().hashCode();
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
        if (getShipAddressList() != null) {
            _hashCode += getShipAddressList().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getSalesGroup() != null) {
            _hashCode += getSalesGroup().hashCode();
        }
        if (getSyncSalesTeams() != null) {
            _hashCode += getSyncSalesTeams().hashCode();
        }
        if (getRevenueStatus() != null) {
            _hashCode += getRevenueStatus().hashCode();
        }
        if (getRecognizedRevenue() != null) {
            _hashCode += getRecognizedRevenue().hashCode();
        }
        if (getDeferredRevenue() != null) {
            _hashCode += getDeferredRevenue().hashCode();
        }
        if (getRevRecOnRevCommitment() != null) {
            _hashCode += getRevRecOnRevCommitment().hashCode();
        }
        if (getRevCommitStatus() != null) {
            _hashCode += getRevCommitStatus().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getAltSalesTotal() != null) {
            _hashCode += getAltSalesTotal().hashCode();
        }
        if (getCcExpireDate() != null) {
            _hashCode += getCcExpireDate().hashCode();
        }
        if (getCcName() != null) {
            _hashCode += getCcName().hashCode();
        }
        if (getCcStreet() != null) {
            _hashCode += getCcStreet().hashCode();
        }
        if (getCcZipCode() != null) {
            _hashCode += getCcZipCode().hashCode();
        }
        if (getCcApproved() != null) {
            _hashCode += getCcApproved().hashCode();
        }
        if (getPnRefNum() != null) {
            _hashCode += getPnRefNum().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getDiscountTotal() != null) {
            _hashCode += getDiscountTotal().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getCreditCardProcessor() != null) {
            _hashCode += getCreditCardProcessor().hashCode();
        }
        if (getPayPalAuthId() != null) {
            _hashCode += getPayPalAuthId().hashCode();
        }
        if (getPayPalProcess() != null) {
            _hashCode += getPayPalProcess().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getDebitCardIssueNo() != null) {
            _hashCode += getDebitCardIssueNo().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTaxTotal() != null) {
            _hashCode += getTaxTotal().hashCode();
        }
        if (getTax2Total() != null) {
            _hashCode += getTax2Total().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getGiftCert() != null) {
            _hashCode += getGiftCert().hashCode();
        }
        if (getContribPct() != null) {
            _hashCode += getContribPct().hashCode();
        }
        if (getGiftCertTotal() != null) {
            _hashCode += getGiftCertTotal().hashCode();
        }
        if (getGiftCertApplied() != null) {
            _hashCode += getGiftCertApplied().hashCode();
        }
        if (getGiftCertAvailable() != null) {
            _hashCode += getGiftCertAvailable().hashCode();
        }
        if (getTranIsVsoeBundle() != null) {
            _hashCode += getTranIsVsoeBundle().hashCode();
        }
        if (getVsoeAutoCalc() != null) {
            _hashCode += getVsoeAutoCalc().hashCode();
        }
        if (getSyncPartnerTeams() != null) {
            _hashCode += getSyncPartnerTeams().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
        }
        if (getSalesTeamList() != null) {
            _hashCode += getSalesTeamList().hashCode();
        }
        if (getPartnersList() != null) {
            _hashCode += getPartnersList().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReturnAuthorization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ReturnAuthorization"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "taxRegOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "vatRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "entityTaxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "intercoTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "IntercoStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "discountItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "discountRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeFaxed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "toBeFaxed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "messageSel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncSalesTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "syncSalesTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "RevenueStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "RevenueCommitStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "altSalesTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "subTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "discountTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardProcessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "creditCardProcessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalAuthId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "payPalAuthId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "payPalProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitCardIssueNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "debitCardIssueNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "validFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "orderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "ReturnAuthorizationOrderStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "giftCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "contribPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "giftCertTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "giftCertApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "giftCertAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAutoCalc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "vsoeAutoCalc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncPartnerTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "syncPartnerTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ReturnAuthorizationItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ReturnAuthorizationSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ReturnAuthorizationPartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "taxDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
