/**
 * OpportunitySearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class OpportunitySearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableOffline;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingReason;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingTimeFrame;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField closeDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField competitor;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField contribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custType;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOpen;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField daysToClose;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entity;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entityStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedBudget;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedCloseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField forecastType;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField foreignProjectedAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField foreignRangeHigh;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField foreignRangeLow;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxTranCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isBudgetApproved;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField leadSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField number;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partner;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField partnerContribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate postingPeriodRelative;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField probability;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField projAltSalesAmt;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField projectedTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeHigh;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeHighAlt;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeLow;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeLowAlt;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesReadiness;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesRep;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxPeriod;

    private com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate taxPeriodRelative;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField title;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField tranDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfitPct;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranFxEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField tranId;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField winLossReason;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField wonBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public OpportunitySearchBasic() {
    }

    public OpportunitySearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableOffline,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingReason,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingTimeFrame,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField closeDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField competitor,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField contribution,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custType,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOpen,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField daysToClose,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entity,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entityStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedBudget,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedCloseDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField forecastType,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField foreignProjectedAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField foreignRangeHigh,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField foreignRangeLow,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxTranCostEstimate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isBudgetApproved,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField leadSource,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField memo,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField number,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partner,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField partnerContribution,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerRole,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerTeamMember,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate postingPeriodRelative,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField probability,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField projAltSalesAmt,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField projectedTotal,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeHigh,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeHighAlt,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeLow,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeLowAlt,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesReadiness,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesRep,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamMember,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamRole,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxPeriod,
           com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate taxPeriodRelative,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField title,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranCostEstimate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField tranDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfit,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfitPct,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranFxEstGrossProfit,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField tranId,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField winLossReason,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField wonBy,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.amount = amount;
        this.availableOffline = availableOffline;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this._class = _class;
        this.closeDate = closeDate;
        this.competitor = competitor;
        this.contribution = contribution;
        this.currency = currency;
        this.custType = custType;
        this.dateCreated = dateCreated;
        this.daysOpen = daysOpen;
        this.daysToClose = daysToClose;
        this.department = department;
        this.entity = entity;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.expectedCloseDate = expectedCloseDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.forecastType = forecastType;
        this.foreignProjectedAmount = foreignProjectedAmount;
        this.foreignRangeHigh = foreignRangeHigh;
        this.foreignRangeLow = foreignRangeLow;
        this.fxTranCostEstimate = fxTranCostEstimate;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isBudgetApproved = isBudgetApproved;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.leadSource = leadSource;
        this.location = location;
        this.memo = memo;
        this.number = number;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.postingPeriod = postingPeriod;
        this.postingPeriodRelative = postingPeriodRelative;
        this.probability = probability;
        this.projAltSalesAmt = projAltSalesAmt;
        this.projectedTotal = projectedTotal;
        this.rangeHigh = rangeHigh;
        this.rangeHighAlt = rangeHighAlt;
        this.rangeLow = rangeLow;
        this.rangeLowAlt = rangeLowAlt;
        this.salesReadiness = salesReadiness;
        this.salesRep = salesRep;
        this.salesTeamMember = salesTeamMember;
        this.salesTeamRole = salesTeamRole;
        this.status = status;
        this.subsidiary = subsidiary;
        this.taxPeriod = taxPeriod;
        this.taxPeriodRelative = taxPeriodRelative;
        this.title = title;
        this.tranCostEstimate = tranCostEstimate;
        this.tranDate = tranDate;
        this.tranEstGrossProfit = tranEstGrossProfit;
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
        this.tranId = tranId;
        this.winLossReason = winLossReason;
        this.wonBy = wonBy;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the amount value for this OpportunitySearchBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OpportunitySearchBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount) {
        this.amount = amount;
    }


    /**
     * Gets the availableOffline value for this OpportunitySearchBasic.
     * 
     * @return availableOffline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this OpportunitySearchBasic.
     * 
     * @param availableOffline
     */
    public void setAvailableOffline(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableOffline) {
        this.availableOffline = availableOffline;
    }


    /**
     * Gets the buyingReason value for this OpportunitySearchBasic.
     * 
     * @return buyingReason
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this OpportunitySearchBasic.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingReason) {
        this.buyingReason = buyingReason;
    }


    /**
     * Gets the buyingTimeFrame value for this OpportunitySearchBasic.
     * 
     * @return buyingTimeFrame
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this OpportunitySearchBasic.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }


    /**
     * Gets the _class value for this OpportunitySearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this OpportunitySearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the closeDate value for this OpportunitySearchBasic.
     * 
     * @return closeDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this OpportunitySearchBasic.
     * 
     * @param closeDate
     */
    public void setCloseDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField closeDate) {
        this.closeDate = closeDate;
    }


    /**
     * Gets the competitor value for this OpportunitySearchBasic.
     * 
     * @return competitor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCompetitor() {
        return competitor;
    }


    /**
     * Sets the competitor value for this OpportunitySearchBasic.
     * 
     * @param competitor
     */
    public void setCompetitor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField competitor) {
        this.competitor = competitor;
    }


    /**
     * Gets the contribution value for this OpportunitySearchBasic.
     * 
     * @return contribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this OpportunitySearchBasic.
     * 
     * @param contribution
     */
    public void setContribution(com.netsuite.webservices.platform.core_2019_1.SearchLongField contribution) {
        this.contribution = contribution;
    }


    /**
     * Gets the currency value for this OpportunitySearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OpportunitySearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the custType value for this OpportunitySearchBasic.
     * 
     * @return custType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this OpportunitySearchBasic.
     * 
     * @param custType
     */
    public void setCustType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custType) {
        this.custType = custType;
    }


    /**
     * Gets the dateCreated value for this OpportunitySearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this OpportunitySearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the daysOpen value for this OpportunitySearchBasic.
     * 
     * @return daysOpen
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDaysOpen() {
        return daysOpen;
    }


    /**
     * Sets the daysOpen value for this OpportunitySearchBasic.
     * 
     * @param daysOpen
     */
    public void setDaysOpen(com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOpen) {
        this.daysOpen = daysOpen;
    }


    /**
     * Gets the daysToClose value for this OpportunitySearchBasic.
     * 
     * @return daysToClose
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDaysToClose() {
        return daysToClose;
    }


    /**
     * Sets the daysToClose value for this OpportunitySearchBasic.
     * 
     * @param daysToClose
     */
    public void setDaysToClose(com.netsuite.webservices.platform.core_2019_1.SearchLongField daysToClose) {
        this.daysToClose = daysToClose;
    }


    /**
     * Gets the department value for this OpportunitySearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this OpportunitySearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the entity value for this OpportunitySearchBasic.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this OpportunitySearchBasic.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entity) {
        this.entity = entity;
    }


    /**
     * Gets the entityStatus value for this OpportunitySearchBasic.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this OpportunitySearchBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the estimatedBudget value for this OpportunitySearchBasic.
     * 
     * @return estimatedBudget
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this OpportunitySearchBasic.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }


    /**
     * Gets the expectedCloseDate value for this OpportunitySearchBasic.
     * 
     * @return expectedCloseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this OpportunitySearchBasic.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }


    /**
     * Gets the externalId value for this OpportunitySearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this OpportunitySearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this OpportunitySearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this OpportunitySearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the forecastType value for this OpportunitySearchBasic.
     * 
     * @return forecastType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this OpportunitySearchBasic.
     * 
     * @param forecastType
     */
    public void setForecastType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField forecastType) {
        this.forecastType = forecastType;
    }


    /**
     * Gets the foreignProjectedAmount value for this OpportunitySearchBasic.
     * 
     * @return foreignProjectedAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getForeignProjectedAmount() {
        return foreignProjectedAmount;
    }


    /**
     * Sets the foreignProjectedAmount value for this OpportunitySearchBasic.
     * 
     * @param foreignProjectedAmount
     */
    public void setForeignProjectedAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField foreignProjectedAmount) {
        this.foreignProjectedAmount = foreignProjectedAmount;
    }


    /**
     * Gets the foreignRangeHigh value for this OpportunitySearchBasic.
     * 
     * @return foreignRangeHigh
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getForeignRangeHigh() {
        return foreignRangeHigh;
    }


    /**
     * Sets the foreignRangeHigh value for this OpportunitySearchBasic.
     * 
     * @param foreignRangeHigh
     */
    public void setForeignRangeHigh(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField foreignRangeHigh) {
        this.foreignRangeHigh = foreignRangeHigh;
    }


    /**
     * Gets the foreignRangeLow value for this OpportunitySearchBasic.
     * 
     * @return foreignRangeLow
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getForeignRangeLow() {
        return foreignRangeLow;
    }


    /**
     * Sets the foreignRangeLow value for this OpportunitySearchBasic.
     * 
     * @param foreignRangeLow
     */
    public void setForeignRangeLow(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField foreignRangeLow) {
        this.foreignRangeLow = foreignRangeLow;
    }


    /**
     * Gets the fxTranCostEstimate value for this OpportunitySearchBasic.
     * 
     * @return fxTranCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }


    /**
     * Sets the fxTranCostEstimate value for this OpportunitySearchBasic.
     * 
     * @param fxTranCostEstimate
     */
    public void setFxTranCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }


    /**
     * Gets the internalId value for this OpportunitySearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this OpportunitySearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this OpportunitySearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this OpportunitySearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isBudgetApproved value for this OpportunitySearchBasic.
     * 
     * @return isBudgetApproved
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this OpportunitySearchBasic.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }


    /**
     * Gets the item value for this OpportunitySearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this OpportunitySearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lastModifiedDate value for this OpportunitySearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this OpportunitySearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the leadSource value for this OpportunitySearchBasic.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this OpportunitySearchBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the location value for this OpportunitySearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this OpportunitySearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this OpportunitySearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this OpportunitySearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the number value for this OpportunitySearchBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OpportunitySearchBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the partner value for this OpportunitySearchBasic.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this OpportunitySearchBasic.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partner) {
        this.partner = partner;
    }


    /**
     * Gets the partnerContribution value for this OpportunitySearchBasic.
     * 
     * @return partnerContribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this OpportunitySearchBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(com.netsuite.webservices.platform.core_2019_1.SearchLongField partnerContribution) {
        this.partnerContribution = partnerContribution;
    }


    /**
     * Gets the partnerRole value for this OpportunitySearchBasic.
     * 
     * @return partnerRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this OpportunitySearchBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerRole) {
        this.partnerRole = partnerRole;
    }


    /**
     * Gets the partnerTeamMember value for this OpportunitySearchBasic.
     * 
     * @return partnerTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this OpportunitySearchBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }


    /**
     * Gets the postingPeriod value for this OpportunitySearchBasic.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this OpportunitySearchBasic.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the postingPeriodRelative value for this OpportunitySearchBasic.
     * 
     * @return postingPeriodRelative
     */
    public com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate getPostingPeriodRelative() {
        return postingPeriodRelative;
    }


    /**
     * Sets the postingPeriodRelative value for this OpportunitySearchBasic.
     * 
     * @param postingPeriodRelative
     */
    public void setPostingPeriodRelative(com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate postingPeriodRelative) {
        this.postingPeriodRelative = postingPeriodRelative;
    }


    /**
     * Gets the probability value for this OpportunitySearchBasic.
     * 
     * @return probability
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this OpportunitySearchBasic.
     * 
     * @param probability
     */
    public void setProbability(com.netsuite.webservices.platform.core_2019_1.SearchLongField probability) {
        this.probability = probability;
    }


    /**
     * Gets the projAltSalesAmt value for this OpportunitySearchBasic.
     * 
     * @return projAltSalesAmt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getProjAltSalesAmt() {
        return projAltSalesAmt;
    }


    /**
     * Sets the projAltSalesAmt value for this OpportunitySearchBasic.
     * 
     * @param projAltSalesAmt
     */
    public void setProjAltSalesAmt(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField projAltSalesAmt) {
        this.projAltSalesAmt = projAltSalesAmt;
    }


    /**
     * Gets the projectedTotal value for this OpportunitySearchBasic.
     * 
     * @return projectedTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getProjectedTotal() {
        return projectedTotal;
    }


    /**
     * Sets the projectedTotal value for this OpportunitySearchBasic.
     * 
     * @param projectedTotal
     */
    public void setProjectedTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField projectedTotal) {
        this.projectedTotal = projectedTotal;
    }


    /**
     * Gets the rangeHigh value for this OpportunitySearchBasic.
     * 
     * @return rangeHigh
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRangeHigh() {
        return rangeHigh;
    }


    /**
     * Sets the rangeHigh value for this OpportunitySearchBasic.
     * 
     * @param rangeHigh
     */
    public void setRangeHigh(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeHigh) {
        this.rangeHigh = rangeHigh;
    }


    /**
     * Gets the rangeHighAlt value for this OpportunitySearchBasic.
     * 
     * @return rangeHighAlt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRangeHighAlt() {
        return rangeHighAlt;
    }


    /**
     * Sets the rangeHighAlt value for this OpportunitySearchBasic.
     * 
     * @param rangeHighAlt
     */
    public void setRangeHighAlt(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeHighAlt) {
        this.rangeHighAlt = rangeHighAlt;
    }


    /**
     * Gets the rangeLow value for this OpportunitySearchBasic.
     * 
     * @return rangeLow
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRangeLow() {
        return rangeLow;
    }


    /**
     * Sets the rangeLow value for this OpportunitySearchBasic.
     * 
     * @param rangeLow
     */
    public void setRangeLow(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeLow) {
        this.rangeLow = rangeLow;
    }


    /**
     * Gets the rangeLowAlt value for this OpportunitySearchBasic.
     * 
     * @return rangeLowAlt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRangeLowAlt() {
        return rangeLowAlt;
    }


    /**
     * Sets the rangeLowAlt value for this OpportunitySearchBasic.
     * 
     * @param rangeLowAlt
     */
    public void setRangeLowAlt(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rangeLowAlt) {
        this.rangeLowAlt = rangeLowAlt;
    }


    /**
     * Gets the salesReadiness value for this OpportunitySearchBasic.
     * 
     * @return salesReadiness
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this OpportunitySearchBasic.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesReadiness) {
        this.salesReadiness = salesReadiness;
    }


    /**
     * Gets the salesRep value for this OpportunitySearchBasic.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this OpportunitySearchBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the salesTeamMember value for this OpportunitySearchBasic.
     * 
     * @return salesTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this OpportunitySearchBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }


    /**
     * Gets the salesTeamRole value for this OpportunitySearchBasic.
     * 
     * @return salesTeamRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this OpportunitySearchBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }


    /**
     * Gets the status value for this OpportunitySearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OpportunitySearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the subsidiary value for this OpportunitySearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this OpportunitySearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the taxPeriod value for this OpportunitySearchBasic.
     * 
     * @return taxPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxPeriod() {
        return taxPeriod;
    }


    /**
     * Sets the taxPeriod value for this OpportunitySearchBasic.
     * 
     * @param taxPeriod
     */
    public void setTaxPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef taxPeriod) {
        this.taxPeriod = taxPeriod;
    }


    /**
     * Gets the taxPeriodRelative value for this OpportunitySearchBasic.
     * 
     * @return taxPeriodRelative
     */
    public com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate getTaxPeriodRelative() {
        return taxPeriodRelative;
    }


    /**
     * Sets the taxPeriodRelative value for this OpportunitySearchBasic.
     * 
     * @param taxPeriodRelative
     */
    public void setTaxPeriodRelative(com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate taxPeriodRelative) {
        this.taxPeriodRelative = taxPeriodRelative;
    }


    /**
     * Gets the title value for this OpportunitySearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OpportunitySearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the tranCostEstimate value for this OpportunitySearchBasic.
     * 
     * @return tranCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTranCostEstimate() {
        return tranCostEstimate;
    }


    /**
     * Sets the tranCostEstimate value for this OpportunitySearchBasic.
     * 
     * @param tranCostEstimate
     */
    public void setTranCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranCostEstimate) {
        this.tranCostEstimate = tranCostEstimate;
    }


    /**
     * Gets the tranDate value for this OpportunitySearchBasic.
     * 
     * @return tranDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this OpportunitySearchBasic.
     * 
     * @param tranDate
     */
    public void setTranDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranEstGrossProfit value for this OpportunitySearchBasic.
     * 
     * @return tranEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }


    /**
     * Sets the tranEstGrossProfit value for this OpportunitySearchBasic.
     * 
     * @param tranEstGrossProfit
     */
    public void setTranEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }


    /**
     * Gets the tranEstGrossProfitPct value for this OpportunitySearchBasic.
     * 
     * @return tranEstGrossProfitPct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTranEstGrossProfitPct() {
        return tranEstGrossProfitPct;
    }


    /**
     * Sets the tranEstGrossProfitPct value for this OpportunitySearchBasic.
     * 
     * @param tranEstGrossProfitPct
     */
    public void setTranEstGrossProfitPct(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfitPct) {
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
    }


    /**
     * Gets the tranFxEstGrossProfit value for this OpportunitySearchBasic.
     * 
     * @return tranFxEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }


    /**
     * Sets the tranFxEstGrossProfit value for this OpportunitySearchBasic.
     * 
     * @param tranFxEstGrossProfit
     */
    public void setTranFxEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }


    /**
     * Gets the tranId value for this OpportunitySearchBasic.
     * 
     * @return tranId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this OpportunitySearchBasic.
     * 
     * @param tranId
     */
    public void setTranId(com.netsuite.webservices.platform.core_2019_1.SearchStringField tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the winLossReason value for this OpportunitySearchBasic.
     * 
     * @return winLossReason
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getWinLossReason() {
        return winLossReason;
    }


    /**
     * Sets the winLossReason value for this OpportunitySearchBasic.
     * 
     * @param winLossReason
     */
    public void setWinLossReason(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField winLossReason) {
        this.winLossReason = winLossReason;
    }


    /**
     * Gets the wonBy value for this OpportunitySearchBasic.
     * 
     * @return wonBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getWonBy() {
        return wonBy;
    }


    /**
     * Sets the wonBy value for this OpportunitySearchBasic.
     * 
     * @param wonBy
     */
    public void setWonBy(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField wonBy) {
        this.wonBy = wonBy;
    }


    /**
     * Gets the customFieldList value for this OpportunitySearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this OpportunitySearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpportunitySearchBasic)) return false;
        OpportunitySearchBasic other = (OpportunitySearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              this.availableOffline.equals(other.getAvailableOffline()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              this.buyingReason.equals(other.getBuyingReason()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              this.buyingTimeFrame.equals(other.getBuyingTimeFrame()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              this.closeDate.equals(other.getCloseDate()))) &&
            ((this.competitor==null && other.getCompetitor()==null) || 
             (this.competitor!=null &&
              this.competitor.equals(other.getCompetitor()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              this.contribution.equals(other.getContribution()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.custType==null && other.getCustType()==null) || 
             (this.custType!=null &&
              this.custType.equals(other.getCustType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.daysOpen==null && other.getDaysOpen()==null) || 
             (this.daysOpen!=null &&
              this.daysOpen.equals(other.getDaysOpen()))) &&
            ((this.daysToClose==null && other.getDaysToClose()==null) || 
             (this.daysToClose!=null &&
              this.daysToClose.equals(other.getDaysToClose()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              this.estimatedBudget.equals(other.getEstimatedBudget()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              this.expectedCloseDate.equals(other.getExpectedCloseDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              this.forecastType.equals(other.getForecastType()))) &&
            ((this.foreignProjectedAmount==null && other.getForeignProjectedAmount()==null) || 
             (this.foreignProjectedAmount!=null &&
              this.foreignProjectedAmount.equals(other.getForeignProjectedAmount()))) &&
            ((this.foreignRangeHigh==null && other.getForeignRangeHigh()==null) || 
             (this.foreignRangeHigh!=null &&
              this.foreignRangeHigh.equals(other.getForeignRangeHigh()))) &&
            ((this.foreignRangeLow==null && other.getForeignRangeLow()==null) || 
             (this.foreignRangeLow!=null &&
              this.foreignRangeLow.equals(other.getForeignRangeLow()))) &&
            ((this.fxTranCostEstimate==null && other.getFxTranCostEstimate()==null) || 
             (this.fxTranCostEstimate!=null &&
              this.fxTranCostEstimate.equals(other.getFxTranCostEstimate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              this.isBudgetApproved.equals(other.getIsBudgetApproved()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.partnerContribution==null && other.getPartnerContribution()==null) || 
             (this.partnerContribution!=null &&
              this.partnerContribution.equals(other.getPartnerContribution()))) &&
            ((this.partnerRole==null && other.getPartnerRole()==null) || 
             (this.partnerRole!=null &&
              this.partnerRole.equals(other.getPartnerRole()))) &&
            ((this.partnerTeamMember==null && other.getPartnerTeamMember()==null) || 
             (this.partnerTeamMember!=null &&
              this.partnerTeamMember.equals(other.getPartnerTeamMember()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.postingPeriodRelative==null && other.getPostingPeriodRelative()==null) || 
             (this.postingPeriodRelative!=null &&
              this.postingPeriodRelative.equals(other.getPostingPeriodRelative()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.projAltSalesAmt==null && other.getProjAltSalesAmt()==null) || 
             (this.projAltSalesAmt!=null &&
              this.projAltSalesAmt.equals(other.getProjAltSalesAmt()))) &&
            ((this.projectedTotal==null && other.getProjectedTotal()==null) || 
             (this.projectedTotal!=null &&
              this.projectedTotal.equals(other.getProjectedTotal()))) &&
            ((this.rangeHigh==null && other.getRangeHigh()==null) || 
             (this.rangeHigh!=null &&
              this.rangeHigh.equals(other.getRangeHigh()))) &&
            ((this.rangeHighAlt==null && other.getRangeHighAlt()==null) || 
             (this.rangeHighAlt!=null &&
              this.rangeHighAlt.equals(other.getRangeHighAlt()))) &&
            ((this.rangeLow==null && other.getRangeLow()==null) || 
             (this.rangeLow!=null &&
              this.rangeLow.equals(other.getRangeLow()))) &&
            ((this.rangeLowAlt==null && other.getRangeLowAlt()==null) || 
             (this.rangeLowAlt!=null &&
              this.rangeLowAlt.equals(other.getRangeLowAlt()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              this.salesReadiness.equals(other.getSalesReadiness()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              this.salesTeamMember.equals(other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              this.salesTeamRole.equals(other.getSalesTeamRole()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.taxPeriod==null && other.getTaxPeriod()==null) || 
             (this.taxPeriod!=null &&
              this.taxPeriod.equals(other.getTaxPeriod()))) &&
            ((this.taxPeriodRelative==null && other.getTaxPeriodRelative()==null) || 
             (this.taxPeriodRelative!=null &&
              this.taxPeriodRelative.equals(other.getTaxPeriodRelative()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.tranCostEstimate==null && other.getTranCostEstimate()==null) || 
             (this.tranCostEstimate!=null &&
              this.tranCostEstimate.equals(other.getTranCostEstimate()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranEstGrossProfit==null && other.getTranEstGrossProfit()==null) || 
             (this.tranEstGrossProfit!=null &&
              this.tranEstGrossProfit.equals(other.getTranEstGrossProfit()))) &&
            ((this.tranEstGrossProfitPct==null && other.getTranEstGrossProfitPct()==null) || 
             (this.tranEstGrossProfitPct!=null &&
              this.tranEstGrossProfitPct.equals(other.getTranEstGrossProfitPct()))) &&
            ((this.tranFxEstGrossProfit==null && other.getTranFxEstGrossProfit()==null) || 
             (this.tranFxEstGrossProfit!=null &&
              this.tranFxEstGrossProfit.equals(other.getTranFxEstGrossProfit()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.winLossReason==null && other.getWinLossReason()==null) || 
             (this.winLossReason!=null &&
              this.winLossReason.equals(other.getWinLossReason()))) &&
            ((this.wonBy==null && other.getWonBy()==null) || 
             (this.wonBy!=null &&
              this.wonBy.equals(other.getWonBy()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAvailableOffline() != null) {
            _hashCode += getAvailableOffline().hashCode();
        }
        if (getBuyingReason() != null) {
            _hashCode += getBuyingReason().hashCode();
        }
        if (getBuyingTimeFrame() != null) {
            _hashCode += getBuyingTimeFrame().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCloseDate() != null) {
            _hashCode += getCloseDate().hashCode();
        }
        if (getCompetitor() != null) {
            _hashCode += getCompetitor().hashCode();
        }
        if (getContribution() != null) {
            _hashCode += getContribution().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustType() != null) {
            _hashCode += getCustType().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDaysOpen() != null) {
            _hashCode += getDaysOpen().hashCode();
        }
        if (getDaysToClose() != null) {
            _hashCode += getDaysToClose().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getEstimatedBudget() != null) {
            _hashCode += getEstimatedBudget().hashCode();
        }
        if (getExpectedCloseDate() != null) {
            _hashCode += getExpectedCloseDate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getForecastType() != null) {
            _hashCode += getForecastType().hashCode();
        }
        if (getForeignProjectedAmount() != null) {
            _hashCode += getForeignProjectedAmount().hashCode();
        }
        if (getForeignRangeHigh() != null) {
            _hashCode += getForeignRangeHigh().hashCode();
        }
        if (getForeignRangeLow() != null) {
            _hashCode += getForeignRangeLow().hashCode();
        }
        if (getFxTranCostEstimate() != null) {
            _hashCode += getFxTranCostEstimate().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsBudgetApproved() != null) {
            _hashCode += getIsBudgetApproved().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getPartnerContribution() != null) {
            _hashCode += getPartnerContribution().hashCode();
        }
        if (getPartnerRole() != null) {
            _hashCode += getPartnerRole().hashCode();
        }
        if (getPartnerTeamMember() != null) {
            _hashCode += getPartnerTeamMember().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getPostingPeriodRelative() != null) {
            _hashCode += getPostingPeriodRelative().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getProjAltSalesAmt() != null) {
            _hashCode += getProjAltSalesAmt().hashCode();
        }
        if (getProjectedTotal() != null) {
            _hashCode += getProjectedTotal().hashCode();
        }
        if (getRangeHigh() != null) {
            _hashCode += getRangeHigh().hashCode();
        }
        if (getRangeHighAlt() != null) {
            _hashCode += getRangeHighAlt().hashCode();
        }
        if (getRangeLow() != null) {
            _hashCode += getRangeLow().hashCode();
        }
        if (getRangeLowAlt() != null) {
            _hashCode += getRangeLowAlt().hashCode();
        }
        if (getSalesReadiness() != null) {
            _hashCode += getSalesReadiness().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getSalesTeamMember() != null) {
            _hashCode += getSalesTeamMember().hashCode();
        }
        if (getSalesTeamRole() != null) {
            _hashCode += getSalesTeamRole().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTaxPeriod() != null) {
            _hashCode += getTaxPeriod().hashCode();
        }
        if (getTaxPeriodRelative() != null) {
            _hashCode += getTaxPeriodRelative().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTranCostEstimate() != null) {
            _hashCode += getTranCostEstimate().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranEstGrossProfit() != null) {
            _hashCode += getTranEstGrossProfit().hashCode();
        }
        if (getTranEstGrossProfitPct() != null) {
            _hashCode += getTranEstGrossProfitPct().hashCode();
        }
        if (getTranFxEstGrossProfit() != null) {
            _hashCode += getTranFxEstGrossProfit().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getWinLossReason() != null) {
            _hashCode += getWinLossReason().hashCode();
        }
        if (getWonBy() != null) {
            _hashCode += getWonBy().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpportunitySearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "competitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "custType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysToClose");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysToClose"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignProjectedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "foreignProjectedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignRangeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "foreignRangeHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignRangeLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "foreignRangeLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxTranCostEstimate"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriodRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postingPeriodRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "PostingPeriodDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projAltSalesAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projAltSalesAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rangeHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeHighAlt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rangeHighAlt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rangeLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeLowAlt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rangeLowAlt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriodRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxPeriodRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "PostingPeriodDate"));
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
        elemField.setFieldName("tranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranEstGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winLossReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "winLossReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wonBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "wonBy"));
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
