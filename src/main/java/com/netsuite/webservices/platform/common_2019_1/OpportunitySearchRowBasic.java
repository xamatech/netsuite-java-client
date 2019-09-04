/**
 * OpportunitySearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class OpportunitySearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] actionItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableOffline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingReason;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingTimeFrame;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] closeDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] competitor;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contributionPrimary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] custType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysOpen;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysToClose;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] decisionMaker;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entityStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedBudget;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedCloseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] forecastType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] foreignProjectedAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] foreignRangeHigh;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] foreignRangeLow;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxTranCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBudgetApproved;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] leadSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] partnerContribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] period;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] probability;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] projAltSalesAmt;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] projectedTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeHigh;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeHighAlt;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeLow;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeLowAlt;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesReadiness;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesRep;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] total;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] tranDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranEstGrossProfitPct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranFxEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] weightedTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] winLossReason;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] wonBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public OpportunitySearchRowBasic() {
    }

    public OpportunitySearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] actionItem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableOffline,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingReason,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingTimeFrame,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] closeDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] competitor,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contribution,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contributionPrimary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] custType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysOpen,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysToClose,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] decisionMaker,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entityStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedBudget,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedCloseDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] forecastType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] foreignProjectedAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] foreignRangeHigh,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] foreignRangeLow,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxTranCostEstimate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBudgetApproved,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] leadSource,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partner,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] partnerContribution,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerRole,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerTeamMember,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] period,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] probability,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] projAltSalesAmt,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] projectedTotal,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeHigh,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeHighAlt,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeLow,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeLowAlt,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesReadiness,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesRep,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamMember,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamRole,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxPeriod,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] total,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranCostEstimate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] tranDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranEstGrossProfit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranEstGrossProfitPct,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranFxEstGrossProfit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] weightedTotal,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] winLossReason,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] wonBy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.actionItem = actionItem;
        this.availableOffline = availableOffline;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this._class = _class;
        this.closeDate = closeDate;
        this.competitor = competitor;
        this.contribution = contribution;
        this.contributionPrimary = contributionPrimary;
        this.currency = currency;
        this.custType = custType;
        this.dateCreated = dateCreated;
        this.daysOpen = daysOpen;
        this.daysToClose = daysToClose;
        this.decisionMaker = decisionMaker;
        this.department = department;
        this.status = status;
        this.entity = entity;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.expectedCloseDate = expectedCloseDate;
        this.externalId = externalId;
        this.forecastType = forecastType;
        this.foreignProjectedAmount = foreignProjectedAmount;
        this.foreignRangeHigh = foreignRangeHigh;
        this.foreignRangeLow = foreignRangeLow;
        this.fxTranCostEstimate = fxTranCostEstimate;
        this.internalId = internalId;
        this.isBudgetApproved = isBudgetApproved;
        this.lastModifiedDate = lastModifiedDate;
        this.leadSource = leadSource;
        this.location = location;
        this.memo = memo;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.period = period;
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
        this.subsidiary = subsidiary;
        this.taxPeriod = taxPeriod;
        this.title = title;
        this.total = total;
        this.tranCostEstimate = tranCostEstimate;
        this.tranDate = tranDate;
        this.tranEstGrossProfit = tranEstGrossProfit;
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
        this.tranId = tranId;
        this.weightedTotal = weightedTotal;
        this.winLossReason = winLossReason;
        this.wonBy = wonBy;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the actionItem value for this OpportunitySearchRowBasic.
     * 
     * @return actionItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getActionItem() {
        return actionItem;
    }


    /**
     * Sets the actionItem value for this OpportunitySearchRowBasic.
     * 
     * @param actionItem
     */
    public void setActionItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] actionItem) {
        this.actionItem = actionItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getActionItem(int i) {
        return this.actionItem[i];
    }

    public void setActionItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.actionItem[i] = _value;
    }


    /**
     * Gets the availableOffline value for this OpportunitySearchRowBasic.
     * 
     * @return availableOffline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this OpportunitySearchRowBasic.
     * 
     * @param availableOffline
     */
    public void setAvailableOffline(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableOffline) {
        this.availableOffline = availableOffline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAvailableOffline(int i) {
        return this.availableOffline[i];
    }

    public void setAvailableOffline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.availableOffline[i] = _value;
    }


    /**
     * Gets the buyingReason value for this OpportunitySearchRowBasic.
     * 
     * @return buyingReason
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this OpportunitySearchRowBasic.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingReason) {
        this.buyingReason = buyingReason;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBuyingReason(int i) {
        return this.buyingReason[i];
    }

    public void setBuyingReason(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.buyingReason[i] = _value;
    }


    /**
     * Gets the buyingTimeFrame value for this OpportunitySearchRowBasic.
     * 
     * @return buyingTimeFrame
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this OpportunitySearchRowBasic.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBuyingTimeFrame(int i) {
        return this.buyingTimeFrame[i];
    }

    public void setBuyingTimeFrame(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.buyingTimeFrame[i] = _value;
    }


    /**
     * Gets the _class value for this OpportunitySearchRowBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this OpportunitySearchRowBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this._class[i] = _value;
    }


    /**
     * Gets the closeDate value for this OpportunitySearchRowBasic.
     * 
     * @return closeDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this OpportunitySearchRowBasic.
     * 
     * @param closeDate
     */
    public void setCloseDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] closeDate) {
        this.closeDate = closeDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCloseDate(int i) {
        return this.closeDate[i];
    }

    public void setCloseDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.closeDate[i] = _value;
    }


    /**
     * Gets the competitor value for this OpportunitySearchRowBasic.
     * 
     * @return competitor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCompetitor() {
        return competitor;
    }


    /**
     * Sets the competitor value for this OpportunitySearchRowBasic.
     * 
     * @param competitor
     */
    public void setCompetitor(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] competitor) {
        this.competitor = competitor;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCompetitor(int i) {
        return this.competitor[i];
    }

    public void setCompetitor(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.competitor[i] = _value;
    }


    /**
     * Gets the contribution value for this OpportunitySearchRowBasic.
     * 
     * @return contribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this OpportunitySearchRowBasic.
     * 
     * @param contribution
     */
    public void setContribution(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contribution) {
        this.contribution = contribution;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getContribution(int i) {
        return this.contribution[i];
    }

    public void setContribution(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.contribution[i] = _value;
    }


    /**
     * Gets the contributionPrimary value for this OpportunitySearchRowBasic.
     * 
     * @return contributionPrimary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getContributionPrimary() {
        return contributionPrimary;
    }


    /**
     * Sets the contributionPrimary value for this OpportunitySearchRowBasic.
     * 
     * @param contributionPrimary
     */
    public void setContributionPrimary(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contributionPrimary) {
        this.contributionPrimary = contributionPrimary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getContributionPrimary(int i) {
        return this.contributionPrimary[i];
    }

    public void setContributionPrimary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.contributionPrimary[i] = _value;
    }


    /**
     * Gets the currency value for this OpportunitySearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OpportunitySearchRowBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }


    /**
     * Gets the custType value for this OpportunitySearchRowBasic.
     * 
     * @return custType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this OpportunitySearchRowBasic.
     * 
     * @param custType
     */
    public void setCustType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] custType) {
        this.custType = custType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCustType(int i) {
        return this.custType[i];
    }

    public void setCustType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.custType[i] = _value;
    }


    /**
     * Gets the dateCreated value for this OpportunitySearchRowBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this OpportunitySearchRowBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }


    /**
     * Gets the daysOpen value for this OpportunitySearchRowBasic.
     * 
     * @return daysOpen
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDaysOpen() {
        return daysOpen;
    }


    /**
     * Sets the daysOpen value for this OpportunitySearchRowBasic.
     * 
     * @param daysOpen
     */
    public void setDaysOpen(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysOpen) {
        this.daysOpen = daysOpen;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDaysOpen(int i) {
        return this.daysOpen[i];
    }

    public void setDaysOpen(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.daysOpen[i] = _value;
    }


    /**
     * Gets the daysToClose value for this OpportunitySearchRowBasic.
     * 
     * @return daysToClose
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDaysToClose() {
        return daysToClose;
    }


    /**
     * Sets the daysToClose value for this OpportunitySearchRowBasic.
     * 
     * @param daysToClose
     */
    public void setDaysToClose(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysToClose) {
        this.daysToClose = daysToClose;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDaysToClose(int i) {
        return this.daysToClose[i];
    }

    public void setDaysToClose(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.daysToClose[i] = _value;
    }


    /**
     * Gets the decisionMaker value for this OpportunitySearchRowBasic.
     * 
     * @return decisionMaker
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDecisionMaker() {
        return decisionMaker;
    }


    /**
     * Sets the decisionMaker value for this OpportunitySearchRowBasic.
     * 
     * @param decisionMaker
     */
    public void setDecisionMaker(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDecisionMaker(int i) {
        return this.decisionMaker[i];
    }

    public void setDecisionMaker(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.decisionMaker[i] = _value;
    }


    /**
     * Gets the department value for this OpportunitySearchRowBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this OpportunitySearchRowBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department) {
        this.department = department;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.department[i] = _value;
    }


    /**
     * Gets the status value for this OpportunitySearchRowBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OpportunitySearchRowBasic.
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
     * Gets the entity value for this OpportunitySearchRowBasic.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this OpportunitySearchRowBasic.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entity) {
        this.entity = entity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.entity[i] = _value;
    }


    /**
     * Gets the entityStatus value for this OpportunitySearchRowBasic.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this OpportunitySearchRowBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entityStatus) {
        this.entityStatus = entityStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEntityStatus(int i) {
        return this.entityStatus[i];
    }

    public void setEntityStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.entityStatus[i] = _value;
    }


    /**
     * Gets the estimatedBudget value for this OpportunitySearchRowBasic.
     * 
     * @return estimatedBudget
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this OpportunitySearchRowBasic.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstimatedBudget(int i) {
        return this.estimatedBudget[i];
    }

    public void setEstimatedBudget(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estimatedBudget[i] = _value;
    }


    /**
     * Gets the expectedCloseDate value for this OpportunitySearchRowBasic.
     * 
     * @return expectedCloseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this OpportunitySearchRowBasic.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getExpectedCloseDate(int i) {
        return this.expectedCloseDate[i];
    }

    public void setExpectedCloseDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.expectedCloseDate[i] = _value;
    }


    /**
     * Gets the externalId value for this OpportunitySearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this OpportunitySearchRowBasic.
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
     * Gets the forecastType value for this OpportunitySearchRowBasic.
     * 
     * @return forecastType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this OpportunitySearchRowBasic.
     * 
     * @param forecastType
     */
    public void setForecastType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] forecastType) {
        this.forecastType = forecastType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getForecastType(int i) {
        return this.forecastType[i];
    }

    public void setForecastType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.forecastType[i] = _value;
    }


    /**
     * Gets the foreignProjectedAmount value for this OpportunitySearchRowBasic.
     * 
     * @return foreignProjectedAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getForeignProjectedAmount() {
        return foreignProjectedAmount;
    }


    /**
     * Sets the foreignProjectedAmount value for this OpportunitySearchRowBasic.
     * 
     * @param foreignProjectedAmount
     */
    public void setForeignProjectedAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] foreignProjectedAmount) {
        this.foreignProjectedAmount = foreignProjectedAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getForeignProjectedAmount(int i) {
        return this.foreignProjectedAmount[i];
    }

    public void setForeignProjectedAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.foreignProjectedAmount[i] = _value;
    }


    /**
     * Gets the foreignRangeHigh value for this OpportunitySearchRowBasic.
     * 
     * @return foreignRangeHigh
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getForeignRangeHigh() {
        return foreignRangeHigh;
    }


    /**
     * Sets the foreignRangeHigh value for this OpportunitySearchRowBasic.
     * 
     * @param foreignRangeHigh
     */
    public void setForeignRangeHigh(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] foreignRangeHigh) {
        this.foreignRangeHigh = foreignRangeHigh;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getForeignRangeHigh(int i) {
        return this.foreignRangeHigh[i];
    }

    public void setForeignRangeHigh(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.foreignRangeHigh[i] = _value;
    }


    /**
     * Gets the foreignRangeLow value for this OpportunitySearchRowBasic.
     * 
     * @return foreignRangeLow
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getForeignRangeLow() {
        return foreignRangeLow;
    }


    /**
     * Sets the foreignRangeLow value for this OpportunitySearchRowBasic.
     * 
     * @param foreignRangeLow
     */
    public void setForeignRangeLow(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] foreignRangeLow) {
        this.foreignRangeLow = foreignRangeLow;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getForeignRangeLow(int i) {
        return this.foreignRangeLow[i];
    }

    public void setForeignRangeLow(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.foreignRangeLow[i] = _value;
    }


    /**
     * Gets the fxTranCostEstimate value for this OpportunitySearchRowBasic.
     * 
     * @return fxTranCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }


    /**
     * Sets the fxTranCostEstimate value for this OpportunitySearchRowBasic.
     * 
     * @param fxTranCostEstimate
     */
    public void setFxTranCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxTranCostEstimate(int i) {
        return this.fxTranCostEstimate[i];
    }

    public void setFxTranCostEstimate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxTranCostEstimate[i] = _value;
    }


    /**
     * Gets the internalId value for this OpportunitySearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this OpportunitySearchRowBasic.
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
     * Gets the isBudgetApproved value for this OpportunitySearchRowBasic.
     * 
     * @return isBudgetApproved
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this OpportunitySearchRowBasic.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsBudgetApproved(int i) {
        return this.isBudgetApproved[i];
    }

    public void setIsBudgetApproved(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isBudgetApproved[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this OpportunitySearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this OpportunitySearchRowBasic.
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
     * Gets the leadSource value for this OpportunitySearchRowBasic.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this OpportunitySearchRowBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] leadSource) {
        this.leadSource = leadSource;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLeadSource(int i) {
        return this.leadSource[i];
    }

    public void setLeadSource(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.leadSource[i] = _value;
    }


    /**
     * Gets the location value for this OpportunitySearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this OpportunitySearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location) {
        this.location = location;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the memo value for this OpportunitySearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this OpportunitySearchRowBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.memo[i] = _value;
    }


    /**
     * Gets the partner value for this OpportunitySearchRowBasic.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this OpportunitySearchRowBasic.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partner) {
        this.partner = partner;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPartner(int i) {
        return this.partner[i];
    }

    public void setPartner(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.partner[i] = _value;
    }


    /**
     * Gets the partnerContribution value for this OpportunitySearchRowBasic.
     * 
     * @return partnerContribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this OpportunitySearchRowBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] partnerContribution) {
        this.partnerContribution = partnerContribution;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPartnerContribution(int i) {
        return this.partnerContribution[i];
    }

    public void setPartnerContribution(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.partnerContribution[i] = _value;
    }


    /**
     * Gets the partnerRole value for this OpportunitySearchRowBasic.
     * 
     * @return partnerRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this OpportunitySearchRowBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerRole) {
        this.partnerRole = partnerRole;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPartnerRole(int i) {
        return this.partnerRole[i];
    }

    public void setPartnerRole(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.partnerRole[i] = _value;
    }


    /**
     * Gets the partnerTeamMember value for this OpportunitySearchRowBasic.
     * 
     * @return partnerTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this OpportunitySearchRowBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPartnerTeamMember(int i) {
        return this.partnerTeamMember[i];
    }

    public void setPartnerTeamMember(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.partnerTeamMember[i] = _value;
    }


    /**
     * Gets the period value for this OpportunitySearchRowBasic.
     * 
     * @return period
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this OpportunitySearchRowBasic.
     * 
     * @param period
     */
    public void setPeriod(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] period) {
        this.period = period;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPeriod(int i) {
        return this.period[i];
    }

    public void setPeriod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.period[i] = _value;
    }


    /**
     * Gets the probability value for this OpportunitySearchRowBasic.
     * 
     * @return probability
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this OpportunitySearchRowBasic.
     * 
     * @param probability
     */
    public void setProbability(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] probability) {
        this.probability = probability;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getProbability(int i) {
        return this.probability[i];
    }

    public void setProbability(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.probability[i] = _value;
    }


    /**
     * Gets the projAltSalesAmt value for this OpportunitySearchRowBasic.
     * 
     * @return projAltSalesAmt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getProjAltSalesAmt() {
        return projAltSalesAmt;
    }


    /**
     * Sets the projAltSalesAmt value for this OpportunitySearchRowBasic.
     * 
     * @param projAltSalesAmt
     */
    public void setProjAltSalesAmt(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] projAltSalesAmt) {
        this.projAltSalesAmt = projAltSalesAmt;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getProjAltSalesAmt(int i) {
        return this.projAltSalesAmt[i];
    }

    public void setProjAltSalesAmt(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.projAltSalesAmt[i] = _value;
    }


    /**
     * Gets the projectedTotal value for this OpportunitySearchRowBasic.
     * 
     * @return projectedTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getProjectedTotal() {
        return projectedTotal;
    }


    /**
     * Sets the projectedTotal value for this OpportunitySearchRowBasic.
     * 
     * @param projectedTotal
     */
    public void setProjectedTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] projectedTotal) {
        this.projectedTotal = projectedTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getProjectedTotal(int i) {
        return this.projectedTotal[i];
    }

    public void setProjectedTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.projectedTotal[i] = _value;
    }


    /**
     * Gets the rangeHigh value for this OpportunitySearchRowBasic.
     * 
     * @return rangeHigh
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRangeHigh() {
        return rangeHigh;
    }


    /**
     * Sets the rangeHigh value for this OpportunitySearchRowBasic.
     * 
     * @param rangeHigh
     */
    public void setRangeHigh(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeHigh) {
        this.rangeHigh = rangeHigh;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRangeHigh(int i) {
        return this.rangeHigh[i];
    }

    public void setRangeHigh(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.rangeHigh[i] = _value;
    }


    /**
     * Gets the rangeHighAlt value for this OpportunitySearchRowBasic.
     * 
     * @return rangeHighAlt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRangeHighAlt() {
        return rangeHighAlt;
    }


    /**
     * Sets the rangeHighAlt value for this OpportunitySearchRowBasic.
     * 
     * @param rangeHighAlt
     */
    public void setRangeHighAlt(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeHighAlt) {
        this.rangeHighAlt = rangeHighAlt;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRangeHighAlt(int i) {
        return this.rangeHighAlt[i];
    }

    public void setRangeHighAlt(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.rangeHighAlt[i] = _value;
    }


    /**
     * Gets the rangeLow value for this OpportunitySearchRowBasic.
     * 
     * @return rangeLow
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRangeLow() {
        return rangeLow;
    }


    /**
     * Sets the rangeLow value for this OpportunitySearchRowBasic.
     * 
     * @param rangeLow
     */
    public void setRangeLow(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeLow) {
        this.rangeLow = rangeLow;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRangeLow(int i) {
        return this.rangeLow[i];
    }

    public void setRangeLow(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.rangeLow[i] = _value;
    }


    /**
     * Gets the rangeLowAlt value for this OpportunitySearchRowBasic.
     * 
     * @return rangeLowAlt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRangeLowAlt() {
        return rangeLowAlt;
    }


    /**
     * Sets the rangeLowAlt value for this OpportunitySearchRowBasic.
     * 
     * @param rangeLowAlt
     */
    public void setRangeLowAlt(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rangeLowAlt) {
        this.rangeLowAlt = rangeLowAlt;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRangeLowAlt(int i) {
        return this.rangeLowAlt[i];
    }

    public void setRangeLowAlt(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.rangeLowAlt[i] = _value;
    }


    /**
     * Gets the salesReadiness value for this OpportunitySearchRowBasic.
     * 
     * @return salesReadiness
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this OpportunitySearchRowBasic.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSalesReadiness(int i) {
        return this.salesReadiness[i];
    }

    public void setSalesReadiness(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.salesReadiness[i] = _value;
    }


    /**
     * Gets the salesRep value for this OpportunitySearchRowBasic.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this OpportunitySearchRowBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesRep) {
        this.salesRep = salesRep;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSalesRep(int i) {
        return this.salesRep[i];
    }

    public void setSalesRep(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.salesRep[i] = _value;
    }


    /**
     * Gets the salesTeamMember value for this OpportunitySearchRowBasic.
     * 
     * @return salesTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this OpportunitySearchRowBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSalesTeamMember(int i) {
        return this.salesTeamMember[i];
    }

    public void setSalesTeamMember(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.salesTeamMember[i] = _value;
    }


    /**
     * Gets the salesTeamRole value for this OpportunitySearchRowBasic.
     * 
     * @return salesTeamRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this OpportunitySearchRowBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSalesTeamRole(int i) {
        return this.salesTeamRole[i];
    }

    public void setSalesTeamRole(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.salesTeamRole[i] = _value;
    }


    /**
     * Gets the subsidiary value for this OpportunitySearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this OpportunitySearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the taxPeriod value for this OpportunitySearchRowBasic.
     * 
     * @return taxPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxPeriod() {
        return taxPeriod;
    }


    /**
     * Sets the taxPeriod value for this OpportunitySearchRowBasic.
     * 
     * @param taxPeriod
     */
    public void setTaxPeriod(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxPeriod(int i) {
        return this.taxPeriod[i];
    }

    public void setTaxPeriod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxPeriod[i] = _value;
    }


    /**
     * Gets the title value for this OpportunitySearchRowBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OpportunitySearchRowBasic.
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
     * Gets the total value for this OpportunitySearchRowBasic.
     * 
     * @return total
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTotal() {
        return total;
    }


    /**
     * Sets the total value for this OpportunitySearchRowBasic.
     * 
     * @param total
     */
    public void setTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] total) {
        this.total = total;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTotal(int i) {
        return this.total[i];
    }

    public void setTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.total[i] = _value;
    }


    /**
     * Gets the tranCostEstimate value for this OpportunitySearchRowBasic.
     * 
     * @return tranCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTranCostEstimate() {
        return tranCostEstimate;
    }


    /**
     * Sets the tranCostEstimate value for this OpportunitySearchRowBasic.
     * 
     * @param tranCostEstimate
     */
    public void setTranCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranCostEstimate) {
        this.tranCostEstimate = tranCostEstimate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTranCostEstimate(int i) {
        return this.tranCostEstimate[i];
    }

    public void setTranCostEstimate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.tranCostEstimate[i] = _value;
    }


    /**
     * Gets the tranDate value for this OpportunitySearchRowBasic.
     * 
     * @return tranDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this OpportunitySearchRowBasic.
     * 
     * @param tranDate
     */
    public void setTranDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] tranDate) {
        this.tranDate = tranDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getTranDate(int i) {
        return this.tranDate[i];
    }

    public void setTranDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.tranDate[i] = _value;
    }


    /**
     * Gets the tranEstGrossProfit value for this OpportunitySearchRowBasic.
     * 
     * @return tranEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }


    /**
     * Sets the tranEstGrossProfit value for this OpportunitySearchRowBasic.
     * 
     * @param tranEstGrossProfit
     */
    public void setTranEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTranEstGrossProfit(int i) {
        return this.tranEstGrossProfit[i];
    }

    public void setTranEstGrossProfit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.tranEstGrossProfit[i] = _value;
    }


    /**
     * Gets the tranEstGrossProfitPct value for this OpportunitySearchRowBasic.
     * 
     * @return tranEstGrossProfitPct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTranEstGrossProfitPct() {
        return tranEstGrossProfitPct;
    }


    /**
     * Sets the tranEstGrossProfitPct value for this OpportunitySearchRowBasic.
     * 
     * @param tranEstGrossProfitPct
     */
    public void setTranEstGrossProfitPct(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranEstGrossProfitPct) {
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTranEstGrossProfitPct(int i) {
        return this.tranEstGrossProfitPct[i];
    }

    public void setTranEstGrossProfitPct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.tranEstGrossProfitPct[i] = _value;
    }


    /**
     * Gets the tranFxEstGrossProfit value for this OpportunitySearchRowBasic.
     * 
     * @return tranFxEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }


    /**
     * Sets the tranFxEstGrossProfit value for this OpportunitySearchRowBasic.
     * 
     * @param tranFxEstGrossProfit
     */
    public void setTranFxEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTranFxEstGrossProfit(int i) {
        return this.tranFxEstGrossProfit[i];
    }

    public void setTranFxEstGrossProfit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.tranFxEstGrossProfit[i] = _value;
    }


    /**
     * Gets the tranId value for this OpportunitySearchRowBasic.
     * 
     * @return tranId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this OpportunitySearchRowBasic.
     * 
     * @param tranId
     */
    public void setTranId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranId) {
        this.tranId = tranId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTranId(int i) {
        return this.tranId[i];
    }

    public void setTranId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.tranId[i] = _value;
    }


    /**
     * Gets the weightedTotal value for this OpportunitySearchRowBasic.
     * 
     * @return weightedTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getWeightedTotal() {
        return weightedTotal;
    }


    /**
     * Sets the weightedTotal value for this OpportunitySearchRowBasic.
     * 
     * @param weightedTotal
     */
    public void setWeightedTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] weightedTotal) {
        this.weightedTotal = weightedTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getWeightedTotal(int i) {
        return this.weightedTotal[i];
    }

    public void setWeightedTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.weightedTotal[i] = _value;
    }


    /**
     * Gets the winLossReason value for this OpportunitySearchRowBasic.
     * 
     * @return winLossReason
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getWinLossReason() {
        return winLossReason;
    }


    /**
     * Sets the winLossReason value for this OpportunitySearchRowBasic.
     * 
     * @param winLossReason
     */
    public void setWinLossReason(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] winLossReason) {
        this.winLossReason = winLossReason;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getWinLossReason(int i) {
        return this.winLossReason[i];
    }

    public void setWinLossReason(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.winLossReason[i] = _value;
    }


    /**
     * Gets the wonBy value for this OpportunitySearchRowBasic.
     * 
     * @return wonBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getWonBy() {
        return wonBy;
    }


    /**
     * Sets the wonBy value for this OpportunitySearchRowBasic.
     * 
     * @param wonBy
     */
    public void setWonBy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] wonBy) {
        this.wonBy = wonBy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getWonBy(int i) {
        return this.wonBy[i];
    }

    public void setWonBy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.wonBy[i] = _value;
    }


    /**
     * Gets the customFieldList value for this OpportunitySearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this OpportunitySearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpportunitySearchRowBasic)) return false;
        OpportunitySearchRowBasic other = (OpportunitySearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionItem==null && other.getActionItem()==null) || 
             (this.actionItem!=null &&
              java.util.Arrays.equals(this.actionItem, other.getActionItem()))) &&
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              java.util.Arrays.equals(this.availableOffline, other.getAvailableOffline()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              java.util.Arrays.equals(this.buyingReason, other.getBuyingReason()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              java.util.Arrays.equals(this.buyingTimeFrame, other.getBuyingTimeFrame()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              java.util.Arrays.equals(this.closeDate, other.getCloseDate()))) &&
            ((this.competitor==null && other.getCompetitor()==null) || 
             (this.competitor!=null &&
              java.util.Arrays.equals(this.competitor, other.getCompetitor()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              java.util.Arrays.equals(this.contribution, other.getContribution()))) &&
            ((this.contributionPrimary==null && other.getContributionPrimary()==null) || 
             (this.contributionPrimary!=null &&
              java.util.Arrays.equals(this.contributionPrimary, other.getContributionPrimary()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.custType==null && other.getCustType()==null) || 
             (this.custType!=null &&
              java.util.Arrays.equals(this.custType, other.getCustType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.daysOpen==null && other.getDaysOpen()==null) || 
             (this.daysOpen!=null &&
              java.util.Arrays.equals(this.daysOpen, other.getDaysOpen()))) &&
            ((this.daysToClose==null && other.getDaysToClose()==null) || 
             (this.daysToClose!=null &&
              java.util.Arrays.equals(this.daysToClose, other.getDaysToClose()))) &&
            ((this.decisionMaker==null && other.getDecisionMaker()==null) || 
             (this.decisionMaker!=null &&
              java.util.Arrays.equals(this.decisionMaker, other.getDecisionMaker()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              java.util.Arrays.equals(this.entity, other.getEntity()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              java.util.Arrays.equals(this.entityStatus, other.getEntityStatus()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              java.util.Arrays.equals(this.estimatedBudget, other.getEstimatedBudget()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              java.util.Arrays.equals(this.expectedCloseDate, other.getExpectedCloseDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              java.util.Arrays.equals(this.forecastType, other.getForecastType()))) &&
            ((this.foreignProjectedAmount==null && other.getForeignProjectedAmount()==null) || 
             (this.foreignProjectedAmount!=null &&
              java.util.Arrays.equals(this.foreignProjectedAmount, other.getForeignProjectedAmount()))) &&
            ((this.foreignRangeHigh==null && other.getForeignRangeHigh()==null) || 
             (this.foreignRangeHigh!=null &&
              java.util.Arrays.equals(this.foreignRangeHigh, other.getForeignRangeHigh()))) &&
            ((this.foreignRangeLow==null && other.getForeignRangeLow()==null) || 
             (this.foreignRangeLow!=null &&
              java.util.Arrays.equals(this.foreignRangeLow, other.getForeignRangeLow()))) &&
            ((this.fxTranCostEstimate==null && other.getFxTranCostEstimate()==null) || 
             (this.fxTranCostEstimate!=null &&
              java.util.Arrays.equals(this.fxTranCostEstimate, other.getFxTranCostEstimate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              java.util.Arrays.equals(this.isBudgetApproved, other.getIsBudgetApproved()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              java.util.Arrays.equals(this.leadSource, other.getLeadSource()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              java.util.Arrays.equals(this.partner, other.getPartner()))) &&
            ((this.partnerContribution==null && other.getPartnerContribution()==null) || 
             (this.partnerContribution!=null &&
              java.util.Arrays.equals(this.partnerContribution, other.getPartnerContribution()))) &&
            ((this.partnerRole==null && other.getPartnerRole()==null) || 
             (this.partnerRole!=null &&
              java.util.Arrays.equals(this.partnerRole, other.getPartnerRole()))) &&
            ((this.partnerTeamMember==null && other.getPartnerTeamMember()==null) || 
             (this.partnerTeamMember!=null &&
              java.util.Arrays.equals(this.partnerTeamMember, other.getPartnerTeamMember()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              java.util.Arrays.equals(this.period, other.getPeriod()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              java.util.Arrays.equals(this.probability, other.getProbability()))) &&
            ((this.projAltSalesAmt==null && other.getProjAltSalesAmt()==null) || 
             (this.projAltSalesAmt!=null &&
              java.util.Arrays.equals(this.projAltSalesAmt, other.getProjAltSalesAmt()))) &&
            ((this.projectedTotal==null && other.getProjectedTotal()==null) || 
             (this.projectedTotal!=null &&
              java.util.Arrays.equals(this.projectedTotal, other.getProjectedTotal()))) &&
            ((this.rangeHigh==null && other.getRangeHigh()==null) || 
             (this.rangeHigh!=null &&
              java.util.Arrays.equals(this.rangeHigh, other.getRangeHigh()))) &&
            ((this.rangeHighAlt==null && other.getRangeHighAlt()==null) || 
             (this.rangeHighAlt!=null &&
              java.util.Arrays.equals(this.rangeHighAlt, other.getRangeHighAlt()))) &&
            ((this.rangeLow==null && other.getRangeLow()==null) || 
             (this.rangeLow!=null &&
              java.util.Arrays.equals(this.rangeLow, other.getRangeLow()))) &&
            ((this.rangeLowAlt==null && other.getRangeLowAlt()==null) || 
             (this.rangeLowAlt!=null &&
              java.util.Arrays.equals(this.rangeLowAlt, other.getRangeLowAlt()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              java.util.Arrays.equals(this.salesReadiness, other.getSalesReadiness()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              java.util.Arrays.equals(this.salesRep, other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              java.util.Arrays.equals(this.salesTeamMember, other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              java.util.Arrays.equals(this.salesTeamRole, other.getSalesTeamRole()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.taxPeriod==null && other.getTaxPeriod()==null) || 
             (this.taxPeriod!=null &&
              java.util.Arrays.equals(this.taxPeriod, other.getTaxPeriod()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              java.util.Arrays.equals(this.total, other.getTotal()))) &&
            ((this.tranCostEstimate==null && other.getTranCostEstimate()==null) || 
             (this.tranCostEstimate!=null &&
              java.util.Arrays.equals(this.tranCostEstimate, other.getTranCostEstimate()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              java.util.Arrays.equals(this.tranDate, other.getTranDate()))) &&
            ((this.tranEstGrossProfit==null && other.getTranEstGrossProfit()==null) || 
             (this.tranEstGrossProfit!=null &&
              java.util.Arrays.equals(this.tranEstGrossProfit, other.getTranEstGrossProfit()))) &&
            ((this.tranEstGrossProfitPct==null && other.getTranEstGrossProfitPct()==null) || 
             (this.tranEstGrossProfitPct!=null &&
              java.util.Arrays.equals(this.tranEstGrossProfitPct, other.getTranEstGrossProfitPct()))) &&
            ((this.tranFxEstGrossProfit==null && other.getTranFxEstGrossProfit()==null) || 
             (this.tranFxEstGrossProfit!=null &&
              java.util.Arrays.equals(this.tranFxEstGrossProfit, other.getTranFxEstGrossProfit()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              java.util.Arrays.equals(this.tranId, other.getTranId()))) &&
            ((this.weightedTotal==null && other.getWeightedTotal()==null) || 
             (this.weightedTotal!=null &&
              java.util.Arrays.equals(this.weightedTotal, other.getWeightedTotal()))) &&
            ((this.winLossReason==null && other.getWinLossReason()==null) || 
             (this.winLossReason!=null &&
              java.util.Arrays.equals(this.winLossReason, other.getWinLossReason()))) &&
            ((this.wonBy==null && other.getWonBy()==null) || 
             (this.wonBy!=null &&
              java.util.Arrays.equals(this.wonBy, other.getWonBy()))) &&
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
        if (getActionItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableOffline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableOffline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableOffline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyingReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyingReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyingReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyingTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyingTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyingTimeFrame(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCloseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCloseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCloseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompetitor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompetitor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompetitor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContributionPrimary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContributionPrimary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContributionPrimary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysOpen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysOpen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysOpen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysToClose() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysToClose());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysToClose(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDecisionMaker() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDecisionMaker());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDecisionMaker(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
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
        if (getEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedBudget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedBudget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedBudget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedCloseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedCloseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedCloseDate(), i);
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
        if (getForecastType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecastType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForeignProjectedAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForeignProjectedAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForeignProjectedAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForeignRangeHigh() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForeignRangeHigh());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForeignRangeHigh(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForeignRangeLow() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForeignRangeLow());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForeignRangeLow(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxTranCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxTranCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxTranCostEstimate(), i);
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
        if (getIsBudgetApproved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsBudgetApproved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsBudgetApproved(), i);
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
        if (getLeadSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeadSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeadSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerContribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerContribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerContribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerTeamMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerTeamMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerTeamMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProbability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProbability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProbability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjAltSalesAmt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjAltSalesAmt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjAltSalesAmt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectedTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectedTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectedTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRangeHigh() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRangeHigh());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRangeHigh(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRangeHighAlt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRangeHighAlt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRangeHighAlt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRangeLow() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRangeLow());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRangeLow(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRangeLowAlt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRangeLowAlt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRangeLowAlt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesReadiness() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesReadiness());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesReadiness(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesRep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesRep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesRep(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTeamMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeamMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeamMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTeamRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeamRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeamRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxPeriod(), i);
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
        if (getTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranEstGrossProfitPct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranEstGrossProfitPct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranEstGrossProfitPct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranFxEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranFxEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranFxEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeightedTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeightedTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeightedTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWinLossReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWinLossReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWinLossReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWonBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWonBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWonBy(), i);
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
        new org.apache.axis.description.TypeDesc(OpportunitySearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actionItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "competitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contributionPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contributionPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "custType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysToClose");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysToClose"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisionMaker");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "decisionMaker"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignProjectedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "foreignProjectedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignRangeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "foreignRangeHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignRangeLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "foreignRangeLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxTranCostEstimate"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isBudgetApproved"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projAltSalesAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projAltSalesAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rangeHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeHighAlt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rangeHighAlt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rangeLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeLowAlt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rangeLowAlt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranEstGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "weightedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winLossReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "winLossReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wonBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "wonBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
