/**
 * Estimate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class Estimate  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum;

    private java.lang.Boolean taxRegOverride;

    private java.lang.Boolean taxDetailsOverride;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef job;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum;

    private java.util.Calendar taxPointDate;

    private java.lang.String source;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.String title;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entityStatus;

    private java.lang.Double probability;

    private java.lang.Boolean includeInForecast;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef forecastType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef opportunity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef terms;

    private java.util.Calendar dueDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule;

    private java.lang.String status;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef partner;

    private java.lang.String contribPct;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource;

    private java.util.Calendar expectedCloseDate;

    private java.lang.String otherRefNum;

    private java.lang.String memo;

    private java.util.Calendar endDate;

    private java.util.Calendar startDate;

    private java.lang.Double totalCostEstimate;

    private java.lang.Double estGrossProfit;

    private java.lang.Double estGrossProfitPercent;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom;

    private java.lang.Double exchangeRate;

    private java.lang.String currencyName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem;

    private java.lang.String discountRate;

    private java.lang.Boolean isTaxable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem;

    private java.lang.Double taxRate;

    private java.lang.String vatRegNum;

    private java.lang.Boolean toBePrinted;

    private java.lang.Boolean toBeEmailed;

    private java.lang.String email;

    private java.lang.Boolean toBeFaxed;

    private java.lang.String fax;

    private java.lang.Boolean visibleToCustomer;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel;

    private java.lang.String message;

    private com.netsuite.webservices.platform.common_2019_1.Address billingAddress;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList;

    private com.netsuite.webservices.platform.common_2019_1.Address shippingAddress;

    private java.lang.Boolean shipIsResidential;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList;

    private java.lang.String fob;

    private java.util.Calendar shipDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod;

    private java.lang.Double shippingCost;

    private java.lang.Double shippingTax1Rate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shippingTaxCode;

    private java.lang.String shippingTax2Rate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef handlingTaxCode;

    private java.lang.Double handlingTax1Rate;

    private java.lang.Double handlingCost;

    private java.lang.String trackingNumbers;

    private java.lang.String handlingTax2Rate;

    private java.lang.String linkedTrackingNumbers;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup;

    private java.lang.Boolean syncSalesTeams;

    private java.lang.Double altSalesTotal;

    private java.lang.Boolean canHaveStackable;

    private java.lang.Double oneTime;

    private java.lang.Double recurWeekly;

    private java.lang.Double recurMonthly;

    private java.lang.Double recurQuarterly;

    private java.lang.Double recurAnnually;

    private java.lang.Double subTotal;

    private java.lang.Double discountTotal;

    private java.lang.Double taxTotal;

    private java.lang.Double altShippingCost;

    private java.lang.Double altHandlingCost;

    private java.lang.Double total;

    private java.lang.Double tax2Total;

    private com.netsuite.webservices.transactions.sales_2019_1.EstimateItemList itemList;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.transactions.sales_2019_1.EstimateSalesTeamList salesTeamList;

    private java.lang.Boolean syncPartnerTeams;

    private com.netsuite.webservices.transactions.sales_2019_1.EstimatePartnersList partnersList;

    private com.netsuite.webservices.transactions.sales_2019_1.PromotionsList promotionsList;

    private com.netsuite.webservices.transactions.sales_2019_1.EstimateShipGroupList shipGroupList;

    private com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Estimate() {
    }

    public Estimate(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nexus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum,
           java.lang.Boolean taxRegOverride,
           java.lang.Boolean taxDetailsOverride,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef job,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum,
           java.util.Calendar taxPointDate,
           java.lang.String source,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.String title,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entityStatus,
           java.lang.Double probability,
           java.lang.Boolean includeInForecast,
           com.netsuite.webservices.platform.core_2019_1.RecordRef forecastType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef opportunity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef terms,
           java.util.Calendar dueDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule,
           java.lang.String status,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep,
           com.netsuite.webservices.platform.core_2019_1.RecordRef partner,
           java.lang.String contribPct,
           com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource,
           java.util.Calendar expectedCloseDate,
           java.lang.String otherRefNum,
           java.lang.String memo,
           java.util.Calendar endDate,
           java.util.Calendar startDate,
           java.lang.Double totalCostEstimate,
           java.lang.Double estGrossProfit,
           java.lang.Double estGrossProfitPercent,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom,
           java.lang.Double exchangeRate,
           java.lang.String currencyName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode,
           com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem,
           java.lang.String discountRate,
           java.lang.Boolean isTaxable,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem,
           java.lang.Double taxRate,
           java.lang.String vatRegNum,
           java.lang.Boolean toBePrinted,
           java.lang.Boolean toBeEmailed,
           java.lang.String email,
           java.lang.Boolean toBeFaxed,
           java.lang.String fax,
           java.lang.Boolean visibleToCustomer,
           com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel,
           java.lang.String message,
           com.netsuite.webservices.platform.common_2019_1.Address billingAddress,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList,
           com.netsuite.webservices.platform.common_2019_1.Address shippingAddress,
           java.lang.Boolean shipIsResidential,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList,
           java.lang.String fob,
           java.util.Calendar shipDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod,
           java.lang.Double shippingCost,
           java.lang.Double shippingTax1Rate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shippingTaxCode,
           java.lang.String shippingTax2Rate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef handlingTaxCode,
           java.lang.Double handlingTax1Rate,
           java.lang.Double handlingCost,
           java.lang.String trackingNumbers,
           java.lang.String handlingTax2Rate,
           java.lang.String linkedTrackingNumbers,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup,
           java.lang.Boolean syncSalesTeams,
           java.lang.Double altSalesTotal,
           java.lang.Boolean canHaveStackable,
           java.lang.Double oneTime,
           java.lang.Double recurWeekly,
           java.lang.Double recurMonthly,
           java.lang.Double recurQuarterly,
           java.lang.Double recurAnnually,
           java.lang.Double subTotal,
           java.lang.Double discountTotal,
           java.lang.Double taxTotal,
           java.lang.Double altShippingCost,
           java.lang.Double altHandlingCost,
           java.lang.Double total,
           java.lang.Double tax2Total,
           com.netsuite.webservices.transactions.sales_2019_1.EstimateItemList itemList,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.transactions.sales_2019_1.EstimateSalesTeamList salesTeamList,
           java.lang.Boolean syncPartnerTeams,
           com.netsuite.webservices.transactions.sales_2019_1.EstimatePartnersList partnersList,
           com.netsuite.webservices.transactions.sales_2019_1.PromotionsList promotionsList,
           com.netsuite.webservices.transactions.sales_2019_1.EstimateShipGroupList shipGroupList,
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
        this.entity = entity;
        this.job = job;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.taxPointDate = taxPointDate;
        this.source = source;
        this.customForm = customForm;
        this.currency = currency;
        this.title = title;
        this.entityStatus = entityStatus;
        this.probability = probability;
        this.includeInForecast = includeInForecast;
        this.forecastType = forecastType;
        this.opportunity = opportunity;
        this.department = department;
        this._class = _class;
        this.terms = terms;
        this.dueDate = dueDate;
        this.location = location;
        this.subsidiary = subsidiary;
        this.billingSchedule = billingSchedule;
        this.status = status;
        this.salesRep = salesRep;
        this.partner = partner;
        this.contribPct = contribPct;
        this.leadSource = leadSource;
        this.expectedCloseDate = expectedCloseDate;
        this.otherRefNum = otherRefNum;
        this.memo = memo;
        this.endDate = endDate;
        this.startDate = startDate;
        this.totalCostEstimate = totalCostEstimate;
        this.estGrossProfit = estGrossProfit;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.createdFrom = createdFrom;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
        this.promoCode = promoCode;
        this.discountItem = discountItem;
        this.discountRate = discountRate;
        this.isTaxable = isTaxable;
        this.taxItem = taxItem;
        this.taxRate = taxRate;
        this.vatRegNum = vatRegNum;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.email = email;
        this.toBeFaxed = toBeFaxed;
        this.fax = fax;
        this.visibleToCustomer = visibleToCustomer;
        this.messageSel = messageSel;
        this.message = message;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.shippingAddress = shippingAddress;
        this.shipIsResidential = shipIsResidential;
        this.shipAddressList = shipAddressList;
        this.fob = fob;
        this.shipDate = shipDate;
        this.shipMethod = shipMethod;
        this.shippingCost = shippingCost;
        this.shippingTax1Rate = shippingTax1Rate;
        this.shippingTaxCode = shippingTaxCode;
        this.shippingTax2Rate = shippingTax2Rate;
        this.handlingTaxCode = handlingTaxCode;
        this.handlingTax1Rate = handlingTax1Rate;
        this.handlingCost = handlingCost;
        this.trackingNumbers = trackingNumbers;
        this.handlingTax2Rate = handlingTax2Rate;
        this.linkedTrackingNumbers = linkedTrackingNumbers;
        this.salesGroup = salesGroup;
        this.syncSalesTeams = syncSalesTeams;
        this.altSalesTotal = altSalesTotal;
        this.canHaveStackable = canHaveStackable;
        this.oneTime = oneTime;
        this.recurWeekly = recurWeekly;
        this.recurMonthly = recurMonthly;
        this.recurQuarterly = recurQuarterly;
        this.recurAnnually = recurAnnually;
        this.subTotal = subTotal;
        this.discountTotal = discountTotal;
        this.taxTotal = taxTotal;
        this.altShippingCost = altShippingCost;
        this.altHandlingCost = altHandlingCost;
        this.total = total;
        this.tax2Total = tax2Total;
        this.itemList = itemList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.salesTeamList = salesTeamList;
        this.syncPartnerTeams = syncPartnerTeams;
        this.partnersList = partnersList;
        this.promotionsList = promotionsList;
        this.shipGroupList = shipGroupList;
        this.taxDetailsList = taxDetailsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this Estimate.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Estimate.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this Estimate.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Estimate.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the nexus value for this Estimate.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this Estimate.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the subsidiaryTaxRegNum value for this Estimate.
     * 
     * @return subsidiaryTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiaryTaxRegNum() {
        return subsidiaryTaxRegNum;
    }


    /**
     * Sets the subsidiaryTaxRegNum value for this Estimate.
     * 
     * @param subsidiaryTaxRegNum
     */
    public void setSubsidiaryTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }


    /**
     * Gets the taxRegOverride value for this Estimate.
     * 
     * @return taxRegOverride
     */
    public java.lang.Boolean getTaxRegOverride() {
        return taxRegOverride;
    }


    /**
     * Sets the taxRegOverride value for this Estimate.
     * 
     * @param taxRegOverride
     */
    public void setTaxRegOverride(java.lang.Boolean taxRegOverride) {
        this.taxRegOverride = taxRegOverride;
    }


    /**
     * Gets the taxDetailsOverride value for this Estimate.
     * 
     * @return taxDetailsOverride
     */
    public java.lang.Boolean getTaxDetailsOverride() {
        return taxDetailsOverride;
    }


    /**
     * Sets the taxDetailsOverride value for this Estimate.
     * 
     * @param taxDetailsOverride
     */
    public void setTaxDetailsOverride(java.lang.Boolean taxDetailsOverride) {
        this.taxDetailsOverride = taxDetailsOverride;
    }


    /**
     * Gets the entity value for this Estimate.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this Estimate.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the job value for this Estimate.
     * 
     * @return job
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this Estimate.
     * 
     * @param job
     */
    public void setJob(com.netsuite.webservices.platform.core_2019_1.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the tranDate value for this Estimate.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this Estimate.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this Estimate.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this Estimate.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the entityTaxRegNum value for this Estimate.
     * 
     * @return entityTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntityTaxRegNum() {
        return entityTaxRegNum;
    }


    /**
     * Sets the entityTaxRegNum value for this Estimate.
     * 
     * @param entityTaxRegNum
     */
    public void setEntityTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum) {
        this.entityTaxRegNum = entityTaxRegNum;
    }


    /**
     * Gets the taxPointDate value for this Estimate.
     * 
     * @return taxPointDate
     */
    public java.util.Calendar getTaxPointDate() {
        return taxPointDate;
    }


    /**
     * Sets the taxPointDate value for this Estimate.
     * 
     * @param taxPointDate
     */
    public void setTaxPointDate(java.util.Calendar taxPointDate) {
        this.taxPointDate = taxPointDate;
    }


    /**
     * Gets the source value for this Estimate.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Estimate.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the customForm value for this Estimate.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Estimate.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the currency value for this Estimate.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Estimate.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the title value for this Estimate.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Estimate.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the entityStatus value for this Estimate.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this Estimate.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the probability value for this Estimate.
     * 
     * @return probability
     */
    public java.lang.Double getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this Estimate.
     * 
     * @param probability
     */
    public void setProbability(java.lang.Double probability) {
        this.probability = probability;
    }


    /**
     * Gets the includeInForecast value for this Estimate.
     * 
     * @return includeInForecast
     */
    public java.lang.Boolean getIncludeInForecast() {
        return includeInForecast;
    }


    /**
     * Sets the includeInForecast value for this Estimate.
     * 
     * @param includeInForecast
     */
    public void setIncludeInForecast(java.lang.Boolean includeInForecast) {
        this.includeInForecast = includeInForecast;
    }


    /**
     * Gets the forecastType value for this Estimate.
     * 
     * @return forecastType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this Estimate.
     * 
     * @param forecastType
     */
    public void setForecastType(com.netsuite.webservices.platform.core_2019_1.RecordRef forecastType) {
        this.forecastType = forecastType;
    }


    /**
     * Gets the opportunity value for this Estimate.
     * 
     * @return opportunity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOpportunity() {
        return opportunity;
    }


    /**
     * Sets the opportunity value for this Estimate.
     * 
     * @param opportunity
     */
    public void setOpportunity(com.netsuite.webservices.platform.core_2019_1.RecordRef opportunity) {
        this.opportunity = opportunity;
    }


    /**
     * Gets the department value for this Estimate.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Estimate.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this Estimate.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Estimate.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the terms value for this Estimate.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this Estimate.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef terms) {
        this.terms = terms;
    }


    /**
     * Gets the dueDate value for this Estimate.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Estimate.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the location value for this Estimate.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Estimate.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this Estimate.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Estimate.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the billingSchedule value for this Estimate.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this Estimate.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the status value for this Estimate.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Estimate.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the salesRep value for this Estimate.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this Estimate.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the partner value for this Estimate.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this Estimate.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.RecordRef partner) {
        this.partner = partner;
    }


    /**
     * Gets the contribPct value for this Estimate.
     * 
     * @return contribPct
     */
    public java.lang.String getContribPct() {
        return contribPct;
    }


    /**
     * Sets the contribPct value for this Estimate.
     * 
     * @param contribPct
     */
    public void setContribPct(java.lang.String contribPct) {
        this.contribPct = contribPct;
    }


    /**
     * Gets the leadSource value for this Estimate.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Estimate.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the expectedCloseDate value for this Estimate.
     * 
     * @return expectedCloseDate
     */
    public java.util.Calendar getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this Estimate.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(java.util.Calendar expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }


    /**
     * Gets the otherRefNum value for this Estimate.
     * 
     * @return otherRefNum
     */
    public java.lang.String getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this Estimate.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(java.lang.String otherRefNum) {
        this.otherRefNum = otherRefNum;
    }


    /**
     * Gets the memo value for this Estimate.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this Estimate.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the endDate value for this Estimate.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Estimate.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the startDate value for this Estimate.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Estimate.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the totalCostEstimate value for this Estimate.
     * 
     * @return totalCostEstimate
     */
    public java.lang.Double getTotalCostEstimate() {
        return totalCostEstimate;
    }


    /**
     * Sets the totalCostEstimate value for this Estimate.
     * 
     * @param totalCostEstimate
     */
    public void setTotalCostEstimate(java.lang.Double totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }


    /**
     * Gets the estGrossProfit value for this Estimate.
     * 
     * @return estGrossProfit
     */
    public java.lang.Double getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this Estimate.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(java.lang.Double estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }


    /**
     * Gets the estGrossProfitPercent value for this Estimate.
     * 
     * @return estGrossProfitPercent
     */
    public java.lang.Double getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }


    /**
     * Sets the estGrossProfitPercent value for this Estimate.
     * 
     * @param estGrossProfitPercent
     */
    public void setEstGrossProfitPercent(java.lang.Double estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }


    /**
     * Gets the createdFrom value for this Estimate.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this Estimate.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the exchangeRate value for this Estimate.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this Estimate.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the currencyName value for this Estimate.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this Estimate.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the promoCode value for this Estimate.
     * 
     * @return promoCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this Estimate.
     * 
     * @param promoCode
     */
    public void setPromoCode(com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the discountItem value for this Estimate.
     * 
     * @return discountItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDiscountItem() {
        return discountItem;
    }


    /**
     * Sets the discountItem value for this Estimate.
     * 
     * @param discountItem
     */
    public void setDiscountItem(com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem) {
        this.discountItem = discountItem;
    }


    /**
     * Gets the discountRate value for this Estimate.
     * 
     * @return discountRate
     */
    public java.lang.String getDiscountRate() {
        return discountRate;
    }


    /**
     * Sets the discountRate value for this Estimate.
     * 
     * @param discountRate
     */
    public void setDiscountRate(java.lang.String discountRate) {
        this.discountRate = discountRate;
    }


    /**
     * Gets the isTaxable value for this Estimate.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this Estimate.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the taxItem value for this Estimate.
     * 
     * @return taxItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this Estimate.
     * 
     * @param taxItem
     */
    public void setTaxItem(com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the taxRate value for this Estimate.
     * 
     * @return taxRate
     */
    public java.lang.Double getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this Estimate.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the vatRegNum value for this Estimate.
     * 
     * @return vatRegNum
     */
    public java.lang.String getVatRegNum() {
        return vatRegNum;
    }


    /**
     * Sets the vatRegNum value for this Estimate.
     * 
     * @param vatRegNum
     */
    public void setVatRegNum(java.lang.String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }


    /**
     * Gets the toBePrinted value for this Estimate.
     * 
     * @return toBePrinted
     */
    public java.lang.Boolean getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this Estimate.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(java.lang.Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }


    /**
     * Gets the toBeEmailed value for this Estimate.
     * 
     * @return toBeEmailed
     */
    public java.lang.Boolean getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this Estimate.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(java.lang.Boolean toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }


    /**
     * Gets the email value for this Estimate.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Estimate.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the toBeFaxed value for this Estimate.
     * 
     * @return toBeFaxed
     */
    public java.lang.Boolean getToBeFaxed() {
        return toBeFaxed;
    }


    /**
     * Sets the toBeFaxed value for this Estimate.
     * 
     * @param toBeFaxed
     */
    public void setToBeFaxed(java.lang.Boolean toBeFaxed) {
        this.toBeFaxed = toBeFaxed;
    }


    /**
     * Gets the fax value for this Estimate.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Estimate.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the visibleToCustomer value for this Estimate.
     * 
     * @return visibleToCustomer
     */
    public java.lang.Boolean getVisibleToCustomer() {
        return visibleToCustomer;
    }


    /**
     * Sets the visibleToCustomer value for this Estimate.
     * 
     * @param visibleToCustomer
     */
    public void setVisibleToCustomer(java.lang.Boolean visibleToCustomer) {
        this.visibleToCustomer = visibleToCustomer;
    }


    /**
     * Gets the messageSel value for this Estimate.
     * 
     * @return messageSel
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getMessageSel() {
        return messageSel;
    }


    /**
     * Sets the messageSel value for this Estimate.
     * 
     * @param messageSel
     */
    public void setMessageSel(com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel) {
        this.messageSel = messageSel;
    }


    /**
     * Gets the message value for this Estimate.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Estimate.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the billingAddress value for this Estimate.
     * 
     * @return billingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this Estimate.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(com.netsuite.webservices.platform.common_2019_1.Address billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billAddressList value for this Estimate.
     * 
     * @return billAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillAddressList() {
        return billAddressList;
    }


    /**
     * Sets the billAddressList value for this Estimate.
     * 
     * @param billAddressList
     */
    public void setBillAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }


    /**
     * Gets the shippingAddress value for this Estimate.
     * 
     * @return shippingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this Estimate.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(com.netsuite.webservices.platform.common_2019_1.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the shipIsResidential value for this Estimate.
     * 
     * @return shipIsResidential
     */
    public java.lang.Boolean getShipIsResidential() {
        return shipIsResidential;
    }


    /**
     * Sets the shipIsResidential value for this Estimate.
     * 
     * @param shipIsResidential
     */
    public void setShipIsResidential(java.lang.Boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }


    /**
     * Gets the shipAddressList value for this Estimate.
     * 
     * @return shipAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipAddressList() {
        return shipAddressList;
    }


    /**
     * Sets the shipAddressList value for this Estimate.
     * 
     * @param shipAddressList
     */
    public void setShipAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }


    /**
     * Gets the fob value for this Estimate.
     * 
     * @return fob
     */
    public java.lang.String getFob() {
        return fob;
    }


    /**
     * Sets the fob value for this Estimate.
     * 
     * @param fob
     */
    public void setFob(java.lang.String fob) {
        this.fob = fob;
    }


    /**
     * Gets the shipDate value for this Estimate.
     * 
     * @return shipDate
     */
    public java.util.Calendar getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this Estimate.
     * 
     * @param shipDate
     */
    public void setShipDate(java.util.Calendar shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the shipMethod value for this Estimate.
     * 
     * @return shipMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this Estimate.
     * 
     * @param shipMethod
     */
    public void setShipMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the shippingCost value for this Estimate.
     * 
     * @return shippingCost
     */
    public java.lang.Double getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this Estimate.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.lang.Double shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the shippingTax1Rate value for this Estimate.
     * 
     * @return shippingTax1Rate
     */
    public java.lang.Double getShippingTax1Rate() {
        return shippingTax1Rate;
    }


    /**
     * Sets the shippingTax1Rate value for this Estimate.
     * 
     * @param shippingTax1Rate
     */
    public void setShippingTax1Rate(java.lang.Double shippingTax1Rate) {
        this.shippingTax1Rate = shippingTax1Rate;
    }


    /**
     * Gets the shippingTaxCode value for this Estimate.
     * 
     * @return shippingTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShippingTaxCode() {
        return shippingTaxCode;
    }


    /**
     * Sets the shippingTaxCode value for this Estimate.
     * 
     * @param shippingTaxCode
     */
    public void setShippingTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef shippingTaxCode) {
        this.shippingTaxCode = shippingTaxCode;
    }


    /**
     * Gets the shippingTax2Rate value for this Estimate.
     * 
     * @return shippingTax2Rate
     */
    public java.lang.String getShippingTax2Rate() {
        return shippingTax2Rate;
    }


    /**
     * Sets the shippingTax2Rate value for this Estimate.
     * 
     * @param shippingTax2Rate
     */
    public void setShippingTax2Rate(java.lang.String shippingTax2Rate) {
        this.shippingTax2Rate = shippingTax2Rate;
    }


    /**
     * Gets the handlingTaxCode value for this Estimate.
     * 
     * @return handlingTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getHandlingTaxCode() {
        return handlingTaxCode;
    }


    /**
     * Sets the handlingTaxCode value for this Estimate.
     * 
     * @param handlingTaxCode
     */
    public void setHandlingTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef handlingTaxCode) {
        this.handlingTaxCode = handlingTaxCode;
    }


    /**
     * Gets the handlingTax1Rate value for this Estimate.
     * 
     * @return handlingTax1Rate
     */
    public java.lang.Double getHandlingTax1Rate() {
        return handlingTax1Rate;
    }


    /**
     * Sets the handlingTax1Rate value for this Estimate.
     * 
     * @param handlingTax1Rate
     */
    public void setHandlingTax1Rate(java.lang.Double handlingTax1Rate) {
        this.handlingTax1Rate = handlingTax1Rate;
    }


    /**
     * Gets the handlingCost value for this Estimate.
     * 
     * @return handlingCost
     */
    public java.lang.Double getHandlingCost() {
        return handlingCost;
    }


    /**
     * Sets the handlingCost value for this Estimate.
     * 
     * @param handlingCost
     */
    public void setHandlingCost(java.lang.Double handlingCost) {
        this.handlingCost = handlingCost;
    }


    /**
     * Gets the trackingNumbers value for this Estimate.
     * 
     * @return trackingNumbers
     */
    public java.lang.String getTrackingNumbers() {
        return trackingNumbers;
    }


    /**
     * Sets the trackingNumbers value for this Estimate.
     * 
     * @param trackingNumbers
     */
    public void setTrackingNumbers(java.lang.String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }


    /**
     * Gets the handlingTax2Rate value for this Estimate.
     * 
     * @return handlingTax2Rate
     */
    public java.lang.String getHandlingTax2Rate() {
        return handlingTax2Rate;
    }


    /**
     * Sets the handlingTax2Rate value for this Estimate.
     * 
     * @param handlingTax2Rate
     */
    public void setHandlingTax2Rate(java.lang.String handlingTax2Rate) {
        this.handlingTax2Rate = handlingTax2Rate;
    }


    /**
     * Gets the linkedTrackingNumbers value for this Estimate.
     * 
     * @return linkedTrackingNumbers
     */
    public java.lang.String getLinkedTrackingNumbers() {
        return linkedTrackingNumbers;
    }


    /**
     * Sets the linkedTrackingNumbers value for this Estimate.
     * 
     * @param linkedTrackingNumbers
     */
    public void setLinkedTrackingNumbers(java.lang.String linkedTrackingNumbers) {
        this.linkedTrackingNumbers = linkedTrackingNumbers;
    }


    /**
     * Gets the salesGroup value for this Estimate.
     * 
     * @return salesGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesGroup() {
        return salesGroup;
    }


    /**
     * Sets the salesGroup value for this Estimate.
     * 
     * @param salesGroup
     */
    public void setSalesGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup) {
        this.salesGroup = salesGroup;
    }


    /**
     * Gets the syncSalesTeams value for this Estimate.
     * 
     * @return syncSalesTeams
     */
    public java.lang.Boolean getSyncSalesTeams() {
        return syncSalesTeams;
    }


    /**
     * Sets the syncSalesTeams value for this Estimate.
     * 
     * @param syncSalesTeams
     */
    public void setSyncSalesTeams(java.lang.Boolean syncSalesTeams) {
        this.syncSalesTeams = syncSalesTeams;
    }


    /**
     * Gets the altSalesTotal value for this Estimate.
     * 
     * @return altSalesTotal
     */
    public java.lang.Double getAltSalesTotal() {
        return altSalesTotal;
    }


    /**
     * Sets the altSalesTotal value for this Estimate.
     * 
     * @param altSalesTotal
     */
    public void setAltSalesTotal(java.lang.Double altSalesTotal) {
        this.altSalesTotal = altSalesTotal;
    }


    /**
     * Gets the canHaveStackable value for this Estimate.
     * 
     * @return canHaveStackable
     */
    public java.lang.Boolean getCanHaveStackable() {
        return canHaveStackable;
    }


    /**
     * Sets the canHaveStackable value for this Estimate.
     * 
     * @param canHaveStackable
     */
    public void setCanHaveStackable(java.lang.Boolean canHaveStackable) {
        this.canHaveStackable = canHaveStackable;
    }


    /**
     * Gets the oneTime value for this Estimate.
     * 
     * @return oneTime
     */
    public java.lang.Double getOneTime() {
        return oneTime;
    }


    /**
     * Sets the oneTime value for this Estimate.
     * 
     * @param oneTime
     */
    public void setOneTime(java.lang.Double oneTime) {
        this.oneTime = oneTime;
    }


    /**
     * Gets the recurWeekly value for this Estimate.
     * 
     * @return recurWeekly
     */
    public java.lang.Double getRecurWeekly() {
        return recurWeekly;
    }


    /**
     * Sets the recurWeekly value for this Estimate.
     * 
     * @param recurWeekly
     */
    public void setRecurWeekly(java.lang.Double recurWeekly) {
        this.recurWeekly = recurWeekly;
    }


    /**
     * Gets the recurMonthly value for this Estimate.
     * 
     * @return recurMonthly
     */
    public java.lang.Double getRecurMonthly() {
        return recurMonthly;
    }


    /**
     * Sets the recurMonthly value for this Estimate.
     * 
     * @param recurMonthly
     */
    public void setRecurMonthly(java.lang.Double recurMonthly) {
        this.recurMonthly = recurMonthly;
    }


    /**
     * Gets the recurQuarterly value for this Estimate.
     * 
     * @return recurQuarterly
     */
    public java.lang.Double getRecurQuarterly() {
        return recurQuarterly;
    }


    /**
     * Sets the recurQuarterly value for this Estimate.
     * 
     * @param recurQuarterly
     */
    public void setRecurQuarterly(java.lang.Double recurQuarterly) {
        this.recurQuarterly = recurQuarterly;
    }


    /**
     * Gets the recurAnnually value for this Estimate.
     * 
     * @return recurAnnually
     */
    public java.lang.Double getRecurAnnually() {
        return recurAnnually;
    }


    /**
     * Sets the recurAnnually value for this Estimate.
     * 
     * @param recurAnnually
     */
    public void setRecurAnnually(java.lang.Double recurAnnually) {
        this.recurAnnually = recurAnnually;
    }


    /**
     * Gets the subTotal value for this Estimate.
     * 
     * @return subTotal
     */
    public java.lang.Double getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this Estimate.
     * 
     * @param subTotal
     */
    public void setSubTotal(java.lang.Double subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the discountTotal value for this Estimate.
     * 
     * @return discountTotal
     */
    public java.lang.Double getDiscountTotal() {
        return discountTotal;
    }


    /**
     * Sets the discountTotal value for this Estimate.
     * 
     * @param discountTotal
     */
    public void setDiscountTotal(java.lang.Double discountTotal) {
        this.discountTotal = discountTotal;
    }


    /**
     * Gets the taxTotal value for this Estimate.
     * 
     * @return taxTotal
     */
    public java.lang.Double getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this Estimate.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(java.lang.Double taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the altShippingCost value for this Estimate.
     * 
     * @return altShippingCost
     */
    public java.lang.Double getAltShippingCost() {
        return altShippingCost;
    }


    /**
     * Sets the altShippingCost value for this Estimate.
     * 
     * @param altShippingCost
     */
    public void setAltShippingCost(java.lang.Double altShippingCost) {
        this.altShippingCost = altShippingCost;
    }


    /**
     * Gets the altHandlingCost value for this Estimate.
     * 
     * @return altHandlingCost
     */
    public java.lang.Double getAltHandlingCost() {
        return altHandlingCost;
    }


    /**
     * Sets the altHandlingCost value for this Estimate.
     * 
     * @param altHandlingCost
     */
    public void setAltHandlingCost(java.lang.Double altHandlingCost) {
        this.altHandlingCost = altHandlingCost;
    }


    /**
     * Gets the total value for this Estimate.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this Estimate.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the tax2Total value for this Estimate.
     * 
     * @return tax2Total
     */
    public java.lang.Double getTax2Total() {
        return tax2Total;
    }


    /**
     * Sets the tax2Total value for this Estimate.
     * 
     * @param tax2Total
     */
    public void setTax2Total(java.lang.Double tax2Total) {
        this.tax2Total = tax2Total;
    }


    /**
     * Gets the itemList value for this Estimate.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.EstimateItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this Estimate.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.transactions.sales_2019_1.EstimateItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the accountingBookDetailList value for this Estimate.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this Estimate.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the salesTeamList value for this Estimate.
     * 
     * @return salesTeamList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.EstimateSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }


    /**
     * Sets the salesTeamList value for this Estimate.
     * 
     * @param salesTeamList
     */
    public void setSalesTeamList(com.netsuite.webservices.transactions.sales_2019_1.EstimateSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }


    /**
     * Gets the syncPartnerTeams value for this Estimate.
     * 
     * @return syncPartnerTeams
     */
    public java.lang.Boolean getSyncPartnerTeams() {
        return syncPartnerTeams;
    }


    /**
     * Sets the syncPartnerTeams value for this Estimate.
     * 
     * @param syncPartnerTeams
     */
    public void setSyncPartnerTeams(java.lang.Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }


    /**
     * Gets the partnersList value for this Estimate.
     * 
     * @return partnersList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.EstimatePartnersList getPartnersList() {
        return partnersList;
    }


    /**
     * Sets the partnersList value for this Estimate.
     * 
     * @param partnersList
     */
    public void setPartnersList(com.netsuite.webservices.transactions.sales_2019_1.EstimatePartnersList partnersList) {
        this.partnersList = partnersList;
    }


    /**
     * Gets the promotionsList value for this Estimate.
     * 
     * @return promotionsList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.PromotionsList getPromotionsList() {
        return promotionsList;
    }


    /**
     * Sets the promotionsList value for this Estimate.
     * 
     * @param promotionsList
     */
    public void setPromotionsList(com.netsuite.webservices.transactions.sales_2019_1.PromotionsList promotionsList) {
        this.promotionsList = promotionsList;
    }


    /**
     * Gets the shipGroupList value for this Estimate.
     * 
     * @return shipGroupList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.EstimateShipGroupList getShipGroupList() {
        return shipGroupList;
    }


    /**
     * Sets the shipGroupList value for this Estimate.
     * 
     * @param shipGroupList
     */
    public void setShipGroupList(com.netsuite.webservices.transactions.sales_2019_1.EstimateShipGroupList shipGroupList) {
        this.shipGroupList = shipGroupList;
    }


    /**
     * Gets the taxDetailsList value for this Estimate.
     * 
     * @return taxDetailsList
     */
    public com.netsuite.webservices.platform.common_2019_1.TaxDetailsList getTaxDetailsList() {
        return taxDetailsList;
    }


    /**
     * Sets the taxDetailsList value for this Estimate.
     * 
     * @param taxDetailsList
     */
    public void setTaxDetailsList(com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList) {
        this.taxDetailsList = taxDetailsList;
    }


    /**
     * Gets the customFieldList value for this Estimate.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Estimate.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Estimate.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Estimate.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Estimate.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Estimate.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Estimate)) return false;
        Estimate other = (Estimate) obj;
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
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
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
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.includeInForecast==null && other.getIncludeInForecast()==null) || 
             (this.includeInForecast!=null &&
              this.includeInForecast.equals(other.getIncludeInForecast()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              this.forecastType.equals(other.getForecastType()))) &&
            ((this.opportunity==null && other.getOpportunity()==null) || 
             (this.opportunity!=null &&
              this.opportunity.equals(other.getOpportunity()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.contribPct==null && other.getContribPct()==null) || 
             (this.contribPct!=null &&
              this.contribPct.equals(other.getContribPct()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              this.expectedCloseDate.equals(other.getExpectedCloseDate()))) &&
            ((this.otherRefNum==null && other.getOtherRefNum()==null) || 
             (this.otherRefNum!=null &&
              this.otherRefNum.equals(other.getOtherRefNum()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.totalCostEstimate==null && other.getTotalCostEstimate()==null) || 
             (this.totalCostEstimate!=null &&
              this.totalCostEstimate.equals(other.getTotalCostEstimate()))) &&
            ((this.estGrossProfit==null && other.getEstGrossProfit()==null) || 
             (this.estGrossProfit!=null &&
              this.estGrossProfit.equals(other.getEstGrossProfit()))) &&
            ((this.estGrossProfitPercent==null && other.getEstGrossProfitPercent()==null) || 
             (this.estGrossProfitPercent!=null &&
              this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.discountItem==null && other.getDiscountItem()==null) || 
             (this.discountItem!=null &&
              this.discountItem.equals(other.getDiscountItem()))) &&
            ((this.discountRate==null && other.getDiscountRate()==null) || 
             (this.discountRate!=null &&
              this.discountRate.equals(other.getDiscountRate()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              this.taxItem.equals(other.getTaxItem()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.vatRegNum==null && other.getVatRegNum()==null) || 
             (this.vatRegNum!=null &&
              this.vatRegNum.equals(other.getVatRegNum()))) &&
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
            ((this.visibleToCustomer==null && other.getVisibleToCustomer()==null) || 
             (this.visibleToCustomer!=null &&
              this.visibleToCustomer.equals(other.getVisibleToCustomer()))) &&
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
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.shippingTax1Rate==null && other.getShippingTax1Rate()==null) || 
             (this.shippingTax1Rate!=null &&
              this.shippingTax1Rate.equals(other.getShippingTax1Rate()))) &&
            ((this.shippingTaxCode==null && other.getShippingTaxCode()==null) || 
             (this.shippingTaxCode!=null &&
              this.shippingTaxCode.equals(other.getShippingTaxCode()))) &&
            ((this.shippingTax2Rate==null && other.getShippingTax2Rate()==null) || 
             (this.shippingTax2Rate!=null &&
              this.shippingTax2Rate.equals(other.getShippingTax2Rate()))) &&
            ((this.handlingTaxCode==null && other.getHandlingTaxCode()==null) || 
             (this.handlingTaxCode!=null &&
              this.handlingTaxCode.equals(other.getHandlingTaxCode()))) &&
            ((this.handlingTax1Rate==null && other.getHandlingTax1Rate()==null) || 
             (this.handlingTax1Rate!=null &&
              this.handlingTax1Rate.equals(other.getHandlingTax1Rate()))) &&
            ((this.handlingCost==null && other.getHandlingCost()==null) || 
             (this.handlingCost!=null &&
              this.handlingCost.equals(other.getHandlingCost()))) &&
            ((this.trackingNumbers==null && other.getTrackingNumbers()==null) || 
             (this.trackingNumbers!=null &&
              this.trackingNumbers.equals(other.getTrackingNumbers()))) &&
            ((this.handlingTax2Rate==null && other.getHandlingTax2Rate()==null) || 
             (this.handlingTax2Rate!=null &&
              this.handlingTax2Rate.equals(other.getHandlingTax2Rate()))) &&
            ((this.linkedTrackingNumbers==null && other.getLinkedTrackingNumbers()==null) || 
             (this.linkedTrackingNumbers!=null &&
              this.linkedTrackingNumbers.equals(other.getLinkedTrackingNumbers()))) &&
            ((this.salesGroup==null && other.getSalesGroup()==null) || 
             (this.salesGroup!=null &&
              this.salesGroup.equals(other.getSalesGroup()))) &&
            ((this.syncSalesTeams==null && other.getSyncSalesTeams()==null) || 
             (this.syncSalesTeams!=null &&
              this.syncSalesTeams.equals(other.getSyncSalesTeams()))) &&
            ((this.altSalesTotal==null && other.getAltSalesTotal()==null) || 
             (this.altSalesTotal!=null &&
              this.altSalesTotal.equals(other.getAltSalesTotal()))) &&
            ((this.canHaveStackable==null && other.getCanHaveStackable()==null) || 
             (this.canHaveStackable!=null &&
              this.canHaveStackable.equals(other.getCanHaveStackable()))) &&
            ((this.oneTime==null && other.getOneTime()==null) || 
             (this.oneTime!=null &&
              this.oneTime.equals(other.getOneTime()))) &&
            ((this.recurWeekly==null && other.getRecurWeekly()==null) || 
             (this.recurWeekly!=null &&
              this.recurWeekly.equals(other.getRecurWeekly()))) &&
            ((this.recurMonthly==null && other.getRecurMonthly()==null) || 
             (this.recurMonthly!=null &&
              this.recurMonthly.equals(other.getRecurMonthly()))) &&
            ((this.recurQuarterly==null && other.getRecurQuarterly()==null) || 
             (this.recurQuarterly!=null &&
              this.recurQuarterly.equals(other.getRecurQuarterly()))) &&
            ((this.recurAnnually==null && other.getRecurAnnually()==null) || 
             (this.recurAnnually!=null &&
              this.recurAnnually.equals(other.getRecurAnnually()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.discountTotal==null && other.getDiscountTotal()==null) || 
             (this.discountTotal!=null &&
              this.discountTotal.equals(other.getDiscountTotal()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              this.taxTotal.equals(other.getTaxTotal()))) &&
            ((this.altShippingCost==null && other.getAltShippingCost()==null) || 
             (this.altShippingCost!=null &&
              this.altShippingCost.equals(other.getAltShippingCost()))) &&
            ((this.altHandlingCost==null && other.getAltHandlingCost()==null) || 
             (this.altHandlingCost!=null &&
              this.altHandlingCost.equals(other.getAltHandlingCost()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.tax2Total==null && other.getTax2Total()==null) || 
             (this.tax2Total!=null &&
              this.tax2Total.equals(other.getTax2Total()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
            ((this.salesTeamList==null && other.getSalesTeamList()==null) || 
             (this.salesTeamList!=null &&
              this.salesTeamList.equals(other.getSalesTeamList()))) &&
            ((this.syncPartnerTeams==null && other.getSyncPartnerTeams()==null) || 
             (this.syncPartnerTeams!=null &&
              this.syncPartnerTeams.equals(other.getSyncPartnerTeams()))) &&
            ((this.partnersList==null && other.getPartnersList()==null) || 
             (this.partnersList!=null &&
              this.partnersList.equals(other.getPartnersList()))) &&
            ((this.promotionsList==null && other.getPromotionsList()==null) || 
             (this.promotionsList!=null &&
              this.promotionsList.equals(other.getPromotionsList()))) &&
            ((this.shipGroupList==null && other.getShipGroupList()==null) || 
             (this.shipGroupList!=null &&
              this.shipGroupList.equals(other.getShipGroupList()))) &&
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
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getIncludeInForecast() != null) {
            _hashCode += getIncludeInForecast().hashCode();
        }
        if (getForecastType() != null) {
            _hashCode += getForecastType().hashCode();
        }
        if (getOpportunity() != null) {
            _hashCode += getOpportunity().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getContribPct() != null) {
            _hashCode += getContribPct().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getExpectedCloseDate() != null) {
            _hashCode += getExpectedCloseDate().hashCode();
        }
        if (getOtherRefNum() != null) {
            _hashCode += getOtherRefNum().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
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
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getDiscountItem() != null) {
            _hashCode += getDiscountItem().hashCode();
        }
        if (getDiscountRate() != null) {
            _hashCode += getDiscountRate().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getTaxItem() != null) {
            _hashCode += getTaxItem().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getVatRegNum() != null) {
            _hashCode += getVatRegNum().hashCode();
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
        if (getVisibleToCustomer() != null) {
            _hashCode += getVisibleToCustomer().hashCode();
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
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getShippingTax1Rate() != null) {
            _hashCode += getShippingTax1Rate().hashCode();
        }
        if (getShippingTaxCode() != null) {
            _hashCode += getShippingTaxCode().hashCode();
        }
        if (getShippingTax2Rate() != null) {
            _hashCode += getShippingTax2Rate().hashCode();
        }
        if (getHandlingTaxCode() != null) {
            _hashCode += getHandlingTaxCode().hashCode();
        }
        if (getHandlingTax1Rate() != null) {
            _hashCode += getHandlingTax1Rate().hashCode();
        }
        if (getHandlingCost() != null) {
            _hashCode += getHandlingCost().hashCode();
        }
        if (getTrackingNumbers() != null) {
            _hashCode += getTrackingNumbers().hashCode();
        }
        if (getHandlingTax2Rate() != null) {
            _hashCode += getHandlingTax2Rate().hashCode();
        }
        if (getLinkedTrackingNumbers() != null) {
            _hashCode += getLinkedTrackingNumbers().hashCode();
        }
        if (getSalesGroup() != null) {
            _hashCode += getSalesGroup().hashCode();
        }
        if (getSyncSalesTeams() != null) {
            _hashCode += getSyncSalesTeams().hashCode();
        }
        if (getAltSalesTotal() != null) {
            _hashCode += getAltSalesTotal().hashCode();
        }
        if (getCanHaveStackable() != null) {
            _hashCode += getCanHaveStackable().hashCode();
        }
        if (getOneTime() != null) {
            _hashCode += getOneTime().hashCode();
        }
        if (getRecurWeekly() != null) {
            _hashCode += getRecurWeekly().hashCode();
        }
        if (getRecurMonthly() != null) {
            _hashCode += getRecurMonthly().hashCode();
        }
        if (getRecurQuarterly() != null) {
            _hashCode += getRecurQuarterly().hashCode();
        }
        if (getRecurAnnually() != null) {
            _hashCode += getRecurAnnually().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getDiscountTotal() != null) {
            _hashCode += getDiscountTotal().hashCode();
        }
        if (getTaxTotal() != null) {
            _hashCode += getTaxTotal().hashCode();
        }
        if (getAltShippingCost() != null) {
            _hashCode += getAltShippingCost().hashCode();
        }
        if (getAltHandlingCost() != null) {
            _hashCode += getAltHandlingCost().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getTax2Total() != null) {
            _hashCode += getTax2Total().hashCode();
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
        if (getSyncPartnerTeams() != null) {
            _hashCode += getSyncPartnerTeams().hashCode();
        }
        if (getPartnersList() != null) {
            _hashCode += getPartnersList().hashCode();
        }
        if (getPromotionsList() != null) {
            _hashCode += getPromotionsList().hashCode();
        }
        if (getShipGroupList() != null) {
            _hashCode += getShipGroupList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Estimate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "Estimate"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxRegOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "entityTaxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInForecast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "includeInForecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "opportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "contribPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "discountItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "discountRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vatRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeFaxed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "toBeFaxed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibleToCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "visibleToCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "messageSel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIsResidential");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipIsResidential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax1Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingTax1Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax1Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingTax1Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedTrackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "linkedTrackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncSalesTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "syncSalesTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "altSalesTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canHaveStackable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "canHaveStackable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "oneTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurWeekly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recurWeekly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurMonthly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recurMonthly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurQuarterly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recurQuarterly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurAnnually");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recurAnnually"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "discountTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altShippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "altShippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altHandlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "altHandlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "EstimateItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "EstimateSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncPartnerTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "syncPartnerTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "EstimatePartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "promotionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "PromotionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "EstimateShipGroupList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
