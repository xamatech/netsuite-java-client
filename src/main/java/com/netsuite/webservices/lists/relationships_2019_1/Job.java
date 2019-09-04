/**
 * Job.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class Job  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String entityId;

    private java.lang.String altName;

    private java.lang.String companyName;

    private java.lang.String phoneticName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entityStatus;

    private java.lang.String defaultAddress;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private java.lang.Boolean isInactive;

    private com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverrideList percentCompleteOverrideList;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Boolean billPay;

    private java.util.Calendar dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef category;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef workplace;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef language;

    private java.lang.String comments;

    private java.lang.String accountNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.Double fxRate;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.String phone;

    private java.lang.String altPhone;

    private java.util.Calendar calculatedEndDate;

    private java.util.Calendar calculatedEndDateBaseline;

    private java.util.Calendar startDateBaseline;

    private java.util.Calendar projectedEndDate;

    private java.util.Calendar projectedEndDateBaseline;

    private java.util.Calendar lastBaselineDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef jobType;

    private java.lang.Double percentComplete;

    private java.lang.Double estimatedCost;

    private java.lang.Double estimatedRevenue;

    private com.netsuite.webservices.platform.core_2019_1.Duration estimatedTime;

    private com.netsuite.webservices.platform.core_2019_1.Duration estimatedTimeOverride;

    private java.lang.String fax;

    private java.lang.String email;

    private com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference;

    private java.lang.Double openingBalance;

    private java.util.Calendar openingBalanceDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef openingBalanceAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.lists.relationships_2019_1.types.JobBillingType jobBillingType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef jobItem;

    private java.lang.Double percentTimeComplete;

    private com.netsuite.webservices.platform.core_2019_1.Duration actualTime;

    private java.lang.Boolean allowTime;

    private com.netsuite.webservices.platform.core_2019_1.Duration timeRemaining;

    private java.lang.Boolean limitTimeToAssignees;

    private java.lang.Double estimatedLaborCost;

    private java.lang.Double estimatedLaborCostBaseline;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef estimateRevRecTemplate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revRecForecastRule;

    private java.lang.Boolean usePercentCompleteOverride;

    private java.lang.Double estimatedLaborRevenue;

    private java.lang.Double estimatedGrossProfit;

    private java.lang.Double estimatedGrossProfitPercent;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef projectExpenseType;

    private java.lang.Boolean applyProjectExpenseTypeToAll;

    private java.lang.Boolean allowAllResourcesForTasks;

    private java.lang.Double jobPrice;

    private java.lang.Boolean isUtilizedTime;

    private java.lang.Boolean isProductiveTime;

    private java.lang.Boolean isExemptTime;

    private java.lang.Boolean materializeTime;

    private java.lang.Boolean allowExpenses;

    private java.lang.Boolean allocatePayrollExpenses;

    private java.lang.Boolean includeCrmTasksInTotals;

    private com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus;

    private com.netsuite.webservices.lists.relationships_2019_1.JobResourcesList jobResourcesList;

    private com.netsuite.webservices.lists.relationships_2019_1.JobPlStatementList plStatementList;

    private com.netsuite.webservices.lists.relationships_2019_1.JobAddressbookList addressbookList;

    private com.netsuite.webservices.lists.relationships_2019_1.JobMilestonesList milestonesList;

    private com.netsuite.webservices.lists.relationships_2019_1.JobCreditCardsList creditCardsList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Job() {
    }

    public Job(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String entityId,
           java.lang.String altName,
           java.lang.String companyName,
           java.lang.String phoneticName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entityStatus,
           java.lang.String defaultAddress,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           java.lang.Boolean isInactive,
           com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverrideList percentCompleteOverrideList,
           java.util.Calendar lastModifiedDate,
           java.lang.Boolean billPay,
           java.util.Calendar dateCreated,
           com.netsuite.webservices.platform.core_2019_1.RecordRef category,
           com.netsuite.webservices.platform.core_2019_1.RecordRef workplace,
           com.netsuite.webservices.platform.core_2019_1.RecordRef language,
           java.lang.String comments,
           java.lang.String accountNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.Double fxRate,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.String phone,
           java.lang.String altPhone,
           java.util.Calendar calculatedEndDate,
           java.util.Calendar calculatedEndDateBaseline,
           java.util.Calendar startDateBaseline,
           java.util.Calendar projectedEndDate,
           java.util.Calendar projectedEndDateBaseline,
           java.util.Calendar lastBaselineDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef jobType,
           java.lang.Double percentComplete,
           java.lang.Double estimatedCost,
           java.lang.Double estimatedRevenue,
           com.netsuite.webservices.platform.core_2019_1.Duration estimatedTime,
           com.netsuite.webservices.platform.core_2019_1.Duration estimatedTimeOverride,
           java.lang.String fax,
           java.lang.String email,
           com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference,
           java.lang.Double openingBalance,
           java.util.Calendar openingBalanceDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef openingBalanceAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.lists.relationships_2019_1.types.JobBillingType jobBillingType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef jobItem,
           java.lang.Double percentTimeComplete,
           com.netsuite.webservices.platform.core_2019_1.Duration actualTime,
           java.lang.Boolean allowTime,
           com.netsuite.webservices.platform.core_2019_1.Duration timeRemaining,
           java.lang.Boolean limitTimeToAssignees,
           java.lang.Double estimatedLaborCost,
           java.lang.Double estimatedLaborCostBaseline,
           com.netsuite.webservices.platform.core_2019_1.RecordRef estimateRevRecTemplate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revRecForecastRule,
           java.lang.Boolean usePercentCompleteOverride,
           java.lang.Double estimatedLaborRevenue,
           java.lang.Double estimatedGrossProfit,
           java.lang.Double estimatedGrossProfitPercent,
           com.netsuite.webservices.platform.core_2019_1.RecordRef projectExpenseType,
           java.lang.Boolean applyProjectExpenseTypeToAll,
           java.lang.Boolean allowAllResourcesForTasks,
           java.lang.Double jobPrice,
           java.lang.Boolean isUtilizedTime,
           java.lang.Boolean isProductiveTime,
           java.lang.Boolean isExemptTime,
           java.lang.Boolean materializeTime,
           java.lang.Boolean allowExpenses,
           java.lang.Boolean allocatePayrollExpenses,
           java.lang.Boolean includeCrmTasksInTotals,
           com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus,
           com.netsuite.webservices.lists.relationships_2019_1.JobResourcesList jobResourcesList,
           com.netsuite.webservices.lists.relationships_2019_1.JobPlStatementList plStatementList,
           com.netsuite.webservices.lists.relationships_2019_1.JobAddressbookList addressbookList,
           com.netsuite.webservices.lists.relationships_2019_1.JobMilestonesList milestonesList,
           com.netsuite.webservices.lists.relationships_2019_1.JobCreditCardsList creditCardsList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.entityId = entityId;
        this.altName = altName;
        this.companyName = companyName;
        this.phoneticName = phoneticName;
        this.entityStatus = entityStatus;
        this.defaultAddress = defaultAddress;
        this.parent = parent;
        this.isInactive = isInactive;
        this.percentCompleteOverrideList = percentCompleteOverrideList;
        this.lastModifiedDate = lastModifiedDate;
        this.billPay = billPay;
        this.dateCreated = dateCreated;
        this.category = category;
        this.workplace = workplace;
        this.language = language;
        this.comments = comments;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.fxRate = fxRate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.phone = phone;
        this.altPhone = altPhone;
        this.calculatedEndDate = calculatedEndDate;
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
        this.startDateBaseline = startDateBaseline;
        this.projectedEndDate = projectedEndDate;
        this.projectedEndDateBaseline = projectedEndDateBaseline;
        this.lastBaselineDate = lastBaselineDate;
        this.jobType = jobType;
        this.percentComplete = percentComplete;
        this.estimatedCost = estimatedCost;
        this.estimatedRevenue = estimatedRevenue;
        this.estimatedTime = estimatedTime;
        this.estimatedTimeOverride = estimatedTimeOverride;
        this.fax = fax;
        this.email = email;
        this.emailPreference = emailPreference;
        this.openingBalance = openingBalance;
        this.openingBalanceDate = openingBalanceDate;
        this.openingBalanceAccount = openingBalanceAccount;
        this.subsidiary = subsidiary;
        this.jobBillingType = jobBillingType;
        this.billingSchedule = billingSchedule;
        this.jobItem = jobItem;
        this.percentTimeComplete = percentTimeComplete;
        this.actualTime = actualTime;
        this.allowTime = allowTime;
        this.timeRemaining = timeRemaining;
        this.limitTimeToAssignees = limitTimeToAssignees;
        this.estimatedLaborCost = estimatedLaborCost;
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
        this.estimateRevRecTemplate = estimateRevRecTemplate;
        this.revRecForecastRule = revRecForecastRule;
        this.usePercentCompleteOverride = usePercentCompleteOverride;
        this.estimatedLaborRevenue = estimatedLaborRevenue;
        this.estimatedGrossProfit = estimatedGrossProfit;
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
        this.projectExpenseType = projectExpenseType;
        this.applyProjectExpenseTypeToAll = applyProjectExpenseTypeToAll;
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
        this.jobPrice = jobPrice;
        this.isUtilizedTime = isUtilizedTime;
        this.isProductiveTime = isProductiveTime;
        this.isExemptTime = isExemptTime;
        this.materializeTime = materializeTime;
        this.allowExpenses = allowExpenses;
        this.allocatePayrollExpenses = allocatePayrollExpenses;
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.jobResourcesList = jobResourcesList;
        this.plStatementList = plStatementList;
        this.addressbookList = addressbookList;
        this.milestonesList = milestonesList;
        this.creditCardsList = creditCardsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Job.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Job.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the entityId value for this Job.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this Job.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the altName value for this Job.
     * 
     * @return altName
     */
    public java.lang.String getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this Job.
     * 
     * @param altName
     */
    public void setAltName(java.lang.String altName) {
        this.altName = altName;
    }


    /**
     * Gets the companyName value for this Job.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Job.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the phoneticName value for this Job.
     * 
     * @return phoneticName
     */
    public java.lang.String getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this Job.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(java.lang.String phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the entityStatus value for this Job.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this Job.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the defaultAddress value for this Job.
     * 
     * @return defaultAddress
     */
    public java.lang.String getDefaultAddress() {
        return defaultAddress;
    }


    /**
     * Sets the defaultAddress value for this Job.
     * 
     * @param defaultAddress
     */
    public void setDefaultAddress(java.lang.String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }


    /**
     * Gets the parent value for this Job.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Job.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the isInactive value for this Job.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Job.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the percentCompleteOverrideList value for this Job.
     * 
     * @return percentCompleteOverrideList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverrideList getPercentCompleteOverrideList() {
        return percentCompleteOverrideList;
    }


    /**
     * Sets the percentCompleteOverrideList value for this Job.
     * 
     * @param percentCompleteOverrideList
     */
    public void setPercentCompleteOverrideList(com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverrideList percentCompleteOverrideList) {
        this.percentCompleteOverrideList = percentCompleteOverrideList;
    }


    /**
     * Gets the lastModifiedDate value for this Job.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Job.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the billPay value for this Job.
     * 
     * @return billPay
     */
    public java.lang.Boolean getBillPay() {
        return billPay;
    }


    /**
     * Sets the billPay value for this Job.
     * 
     * @param billPay
     */
    public void setBillPay(java.lang.Boolean billPay) {
        this.billPay = billPay;
    }


    /**
     * Gets the dateCreated value for this Job.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Job.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the category value for this Job.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Job.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the workplace value for this Job.
     * 
     * @return workplace
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getWorkplace() {
        return workplace;
    }


    /**
     * Sets the workplace value for this Job.
     * 
     * @param workplace
     */
    public void setWorkplace(com.netsuite.webservices.platform.core_2019_1.RecordRef workplace) {
        this.workplace = workplace;
    }


    /**
     * Gets the language value for this Job.
     * 
     * @return language
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Job.
     * 
     * @param language
     */
    public void setLanguage(com.netsuite.webservices.platform.core_2019_1.RecordRef language) {
        this.language = language;
    }


    /**
     * Gets the comments value for this Job.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Job.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the accountNumber value for this Job.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Job.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the currency value for this Job.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Job.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the fxRate value for this Job.
     * 
     * @return fxRate
     */
    public java.lang.Double getFxRate() {
        return fxRate;
    }


    /**
     * Sets the fxRate value for this Job.
     * 
     * @param fxRate
     */
    public void setFxRate(java.lang.Double fxRate) {
        this.fxRate = fxRate;
    }


    /**
     * Gets the startDate value for this Job.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Job.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Job.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Job.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the phone value for this Job.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Job.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the altPhone value for this Job.
     * 
     * @return altPhone
     */
    public java.lang.String getAltPhone() {
        return altPhone;
    }


    /**
     * Sets the altPhone value for this Job.
     * 
     * @param altPhone
     */
    public void setAltPhone(java.lang.String altPhone) {
        this.altPhone = altPhone;
    }


    /**
     * Gets the calculatedEndDate value for this Job.
     * 
     * @return calculatedEndDate
     */
    public java.util.Calendar getCalculatedEndDate() {
        return calculatedEndDate;
    }


    /**
     * Sets the calculatedEndDate value for this Job.
     * 
     * @param calculatedEndDate
     */
    public void setCalculatedEndDate(java.util.Calendar calculatedEndDate) {
        this.calculatedEndDate = calculatedEndDate;
    }


    /**
     * Gets the calculatedEndDateBaseline value for this Job.
     * 
     * @return calculatedEndDateBaseline
     */
    public java.util.Calendar getCalculatedEndDateBaseline() {
        return calculatedEndDateBaseline;
    }


    /**
     * Sets the calculatedEndDateBaseline value for this Job.
     * 
     * @param calculatedEndDateBaseline
     */
    public void setCalculatedEndDateBaseline(java.util.Calendar calculatedEndDateBaseline) {
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
    }


    /**
     * Gets the startDateBaseline value for this Job.
     * 
     * @return startDateBaseline
     */
    public java.util.Calendar getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this Job.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(java.util.Calendar startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }


    /**
     * Gets the projectedEndDate value for this Job.
     * 
     * @return projectedEndDate
     */
    public java.util.Calendar getProjectedEndDate() {
        return projectedEndDate;
    }


    /**
     * Sets the projectedEndDate value for this Job.
     * 
     * @param projectedEndDate
     */
    public void setProjectedEndDate(java.util.Calendar projectedEndDate) {
        this.projectedEndDate = projectedEndDate;
    }


    /**
     * Gets the projectedEndDateBaseline value for this Job.
     * 
     * @return projectedEndDateBaseline
     */
    public java.util.Calendar getProjectedEndDateBaseline() {
        return projectedEndDateBaseline;
    }


    /**
     * Sets the projectedEndDateBaseline value for this Job.
     * 
     * @param projectedEndDateBaseline
     */
    public void setProjectedEndDateBaseline(java.util.Calendar projectedEndDateBaseline) {
        this.projectedEndDateBaseline = projectedEndDateBaseline;
    }


    /**
     * Gets the lastBaselineDate value for this Job.
     * 
     * @return lastBaselineDate
     */
    public java.util.Calendar getLastBaselineDate() {
        return lastBaselineDate;
    }


    /**
     * Sets the lastBaselineDate value for this Job.
     * 
     * @param lastBaselineDate
     */
    public void setLastBaselineDate(java.util.Calendar lastBaselineDate) {
        this.lastBaselineDate = lastBaselineDate;
    }


    /**
     * Gets the jobType value for this Job.
     * 
     * @return jobType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJobType() {
        return jobType;
    }


    /**
     * Sets the jobType value for this Job.
     * 
     * @param jobType
     */
    public void setJobType(com.netsuite.webservices.platform.core_2019_1.RecordRef jobType) {
        this.jobType = jobType;
    }


    /**
     * Gets the percentComplete value for this Job.
     * 
     * @return percentComplete
     */
    public java.lang.Double getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this Job.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(java.lang.Double percentComplete) {
        this.percentComplete = percentComplete;
    }


    /**
     * Gets the estimatedCost value for this Job.
     * 
     * @return estimatedCost
     */
    public java.lang.Double getEstimatedCost() {
        return estimatedCost;
    }


    /**
     * Sets the estimatedCost value for this Job.
     * 
     * @param estimatedCost
     */
    public void setEstimatedCost(java.lang.Double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }


    /**
     * Gets the estimatedRevenue value for this Job.
     * 
     * @return estimatedRevenue
     */
    public java.lang.Double getEstimatedRevenue() {
        return estimatedRevenue;
    }


    /**
     * Sets the estimatedRevenue value for this Job.
     * 
     * @param estimatedRevenue
     */
    public void setEstimatedRevenue(java.lang.Double estimatedRevenue) {
        this.estimatedRevenue = estimatedRevenue;
    }


    /**
     * Gets the estimatedTime value for this Job.
     * 
     * @return estimatedTime
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getEstimatedTime() {
        return estimatedTime;
    }


    /**
     * Sets the estimatedTime value for this Job.
     * 
     * @param estimatedTime
     */
    public void setEstimatedTime(com.netsuite.webservices.platform.core_2019_1.Duration estimatedTime) {
        this.estimatedTime = estimatedTime;
    }


    /**
     * Gets the estimatedTimeOverride value for this Job.
     * 
     * @return estimatedTimeOverride
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }


    /**
     * Sets the estimatedTimeOverride value for this Job.
     * 
     * @param estimatedTimeOverride
     */
    public void setEstimatedTimeOverride(com.netsuite.webservices.platform.core_2019_1.Duration estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }


    /**
     * Gets the fax value for this Job.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Job.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Job.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Job.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emailPreference value for this Job.
     * 
     * @return emailPreference
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference getEmailPreference() {
        return emailPreference;
    }


    /**
     * Sets the emailPreference value for this Job.
     * 
     * @param emailPreference
     */
    public void setEmailPreference(com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference) {
        this.emailPreference = emailPreference;
    }


    /**
     * Gets the openingBalance value for this Job.
     * 
     * @return openingBalance
     */
    public java.lang.Double getOpeningBalance() {
        return openingBalance;
    }


    /**
     * Sets the openingBalance value for this Job.
     * 
     * @param openingBalance
     */
    public void setOpeningBalance(java.lang.Double openingBalance) {
        this.openingBalance = openingBalance;
    }


    /**
     * Gets the openingBalanceDate value for this Job.
     * 
     * @return openingBalanceDate
     */
    public java.util.Calendar getOpeningBalanceDate() {
        return openingBalanceDate;
    }


    /**
     * Sets the openingBalanceDate value for this Job.
     * 
     * @param openingBalanceDate
     */
    public void setOpeningBalanceDate(java.util.Calendar openingBalanceDate) {
        this.openingBalanceDate = openingBalanceDate;
    }


    /**
     * Gets the openingBalanceAccount value for this Job.
     * 
     * @return openingBalanceAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOpeningBalanceAccount() {
        return openingBalanceAccount;
    }


    /**
     * Sets the openingBalanceAccount value for this Job.
     * 
     * @param openingBalanceAccount
     */
    public void setOpeningBalanceAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef openingBalanceAccount) {
        this.openingBalanceAccount = openingBalanceAccount;
    }


    /**
     * Gets the subsidiary value for this Job.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Job.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the jobBillingType value for this Job.
     * 
     * @return jobBillingType
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.JobBillingType getJobBillingType() {
        return jobBillingType;
    }


    /**
     * Sets the jobBillingType value for this Job.
     * 
     * @param jobBillingType
     */
    public void setJobBillingType(com.netsuite.webservices.lists.relationships_2019_1.types.JobBillingType jobBillingType) {
        this.jobBillingType = jobBillingType;
    }


    /**
     * Gets the billingSchedule value for this Job.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this Job.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the jobItem value for this Job.
     * 
     * @return jobItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJobItem() {
        return jobItem;
    }


    /**
     * Sets the jobItem value for this Job.
     * 
     * @param jobItem
     */
    public void setJobItem(com.netsuite.webservices.platform.core_2019_1.RecordRef jobItem) {
        this.jobItem = jobItem;
    }


    /**
     * Gets the percentTimeComplete value for this Job.
     * 
     * @return percentTimeComplete
     */
    public java.lang.Double getPercentTimeComplete() {
        return percentTimeComplete;
    }


    /**
     * Sets the percentTimeComplete value for this Job.
     * 
     * @param percentTimeComplete
     */
    public void setPercentTimeComplete(java.lang.Double percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }


    /**
     * Gets the actualTime value for this Job.
     * 
     * @return actualTime
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getActualTime() {
        return actualTime;
    }


    /**
     * Sets the actualTime value for this Job.
     * 
     * @param actualTime
     */
    public void setActualTime(com.netsuite.webservices.platform.core_2019_1.Duration actualTime) {
        this.actualTime = actualTime;
    }


    /**
     * Gets the allowTime value for this Job.
     * 
     * @return allowTime
     */
    public java.lang.Boolean getAllowTime() {
        return allowTime;
    }


    /**
     * Sets the allowTime value for this Job.
     * 
     * @param allowTime
     */
    public void setAllowTime(java.lang.Boolean allowTime) {
        this.allowTime = allowTime;
    }


    /**
     * Gets the timeRemaining value for this Job.
     * 
     * @return timeRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getTimeRemaining() {
        return timeRemaining;
    }


    /**
     * Sets the timeRemaining value for this Job.
     * 
     * @param timeRemaining
     */
    public void setTimeRemaining(com.netsuite.webservices.platform.core_2019_1.Duration timeRemaining) {
        this.timeRemaining = timeRemaining;
    }


    /**
     * Gets the limitTimeToAssignees value for this Job.
     * 
     * @return limitTimeToAssignees
     */
    public java.lang.Boolean getLimitTimeToAssignees() {
        return limitTimeToAssignees;
    }


    /**
     * Sets the limitTimeToAssignees value for this Job.
     * 
     * @param limitTimeToAssignees
     */
    public void setLimitTimeToAssignees(java.lang.Boolean limitTimeToAssignees) {
        this.limitTimeToAssignees = limitTimeToAssignees;
    }


    /**
     * Gets the estimatedLaborCost value for this Job.
     * 
     * @return estimatedLaborCost
     */
    public java.lang.Double getEstimatedLaborCost() {
        return estimatedLaborCost;
    }


    /**
     * Sets the estimatedLaborCost value for this Job.
     * 
     * @param estimatedLaborCost
     */
    public void setEstimatedLaborCost(java.lang.Double estimatedLaborCost) {
        this.estimatedLaborCost = estimatedLaborCost;
    }


    /**
     * Gets the estimatedLaborCostBaseline value for this Job.
     * 
     * @return estimatedLaborCostBaseline
     */
    public java.lang.Double getEstimatedLaborCostBaseline() {
        return estimatedLaborCostBaseline;
    }


    /**
     * Sets the estimatedLaborCostBaseline value for this Job.
     * 
     * @param estimatedLaborCostBaseline
     */
    public void setEstimatedLaborCostBaseline(java.lang.Double estimatedLaborCostBaseline) {
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
    }


    /**
     * Gets the estimateRevRecTemplate value for this Job.
     * 
     * @return estimateRevRecTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEstimateRevRecTemplate() {
        return estimateRevRecTemplate;
    }


    /**
     * Sets the estimateRevRecTemplate value for this Job.
     * 
     * @param estimateRevRecTemplate
     */
    public void setEstimateRevRecTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef estimateRevRecTemplate) {
        this.estimateRevRecTemplate = estimateRevRecTemplate;
    }


    /**
     * Gets the revRecForecastRule value for this Job.
     * 
     * @return revRecForecastRule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevRecForecastRule() {
        return revRecForecastRule;
    }


    /**
     * Sets the revRecForecastRule value for this Job.
     * 
     * @param revRecForecastRule
     */
    public void setRevRecForecastRule(com.netsuite.webservices.platform.core_2019_1.RecordRef revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }


    /**
     * Gets the usePercentCompleteOverride value for this Job.
     * 
     * @return usePercentCompleteOverride
     */
    public java.lang.Boolean getUsePercentCompleteOverride() {
        return usePercentCompleteOverride;
    }


    /**
     * Sets the usePercentCompleteOverride value for this Job.
     * 
     * @param usePercentCompleteOverride
     */
    public void setUsePercentCompleteOverride(java.lang.Boolean usePercentCompleteOverride) {
        this.usePercentCompleteOverride = usePercentCompleteOverride;
    }


    /**
     * Gets the estimatedLaborRevenue value for this Job.
     * 
     * @return estimatedLaborRevenue
     */
    public java.lang.Double getEstimatedLaborRevenue() {
        return estimatedLaborRevenue;
    }


    /**
     * Sets the estimatedLaborRevenue value for this Job.
     * 
     * @param estimatedLaborRevenue
     */
    public void setEstimatedLaborRevenue(java.lang.Double estimatedLaborRevenue) {
        this.estimatedLaborRevenue = estimatedLaborRevenue;
    }


    /**
     * Gets the estimatedGrossProfit value for this Job.
     * 
     * @return estimatedGrossProfit
     */
    public java.lang.Double getEstimatedGrossProfit() {
        return estimatedGrossProfit;
    }


    /**
     * Sets the estimatedGrossProfit value for this Job.
     * 
     * @param estimatedGrossProfit
     */
    public void setEstimatedGrossProfit(java.lang.Double estimatedGrossProfit) {
        this.estimatedGrossProfit = estimatedGrossProfit;
    }


    /**
     * Gets the estimatedGrossProfitPercent value for this Job.
     * 
     * @return estimatedGrossProfitPercent
     */
    public java.lang.Double getEstimatedGrossProfitPercent() {
        return estimatedGrossProfitPercent;
    }


    /**
     * Sets the estimatedGrossProfitPercent value for this Job.
     * 
     * @param estimatedGrossProfitPercent
     */
    public void setEstimatedGrossProfitPercent(java.lang.Double estimatedGrossProfitPercent) {
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
    }


    /**
     * Gets the projectExpenseType value for this Job.
     * 
     * @return projectExpenseType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getProjectExpenseType() {
        return projectExpenseType;
    }


    /**
     * Sets the projectExpenseType value for this Job.
     * 
     * @param projectExpenseType
     */
    public void setProjectExpenseType(com.netsuite.webservices.platform.core_2019_1.RecordRef projectExpenseType) {
        this.projectExpenseType = projectExpenseType;
    }


    /**
     * Gets the applyProjectExpenseTypeToAll value for this Job.
     * 
     * @return applyProjectExpenseTypeToAll
     */
    public java.lang.Boolean getApplyProjectExpenseTypeToAll() {
        return applyProjectExpenseTypeToAll;
    }


    /**
     * Sets the applyProjectExpenseTypeToAll value for this Job.
     * 
     * @param applyProjectExpenseTypeToAll
     */
    public void setApplyProjectExpenseTypeToAll(java.lang.Boolean applyProjectExpenseTypeToAll) {
        this.applyProjectExpenseTypeToAll = applyProjectExpenseTypeToAll;
    }


    /**
     * Gets the allowAllResourcesForTasks value for this Job.
     * 
     * @return allowAllResourcesForTasks
     */
    public java.lang.Boolean getAllowAllResourcesForTasks() {
        return allowAllResourcesForTasks;
    }


    /**
     * Sets the allowAllResourcesForTasks value for this Job.
     * 
     * @param allowAllResourcesForTasks
     */
    public void setAllowAllResourcesForTasks(java.lang.Boolean allowAllResourcesForTasks) {
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
    }


    /**
     * Gets the jobPrice value for this Job.
     * 
     * @return jobPrice
     */
    public java.lang.Double getJobPrice() {
        return jobPrice;
    }


    /**
     * Sets the jobPrice value for this Job.
     * 
     * @param jobPrice
     */
    public void setJobPrice(java.lang.Double jobPrice) {
        this.jobPrice = jobPrice;
    }


    /**
     * Gets the isUtilizedTime value for this Job.
     * 
     * @return isUtilizedTime
     */
    public java.lang.Boolean getIsUtilizedTime() {
        return isUtilizedTime;
    }


    /**
     * Sets the isUtilizedTime value for this Job.
     * 
     * @param isUtilizedTime
     */
    public void setIsUtilizedTime(java.lang.Boolean isUtilizedTime) {
        this.isUtilizedTime = isUtilizedTime;
    }


    /**
     * Gets the isProductiveTime value for this Job.
     * 
     * @return isProductiveTime
     */
    public java.lang.Boolean getIsProductiveTime() {
        return isProductiveTime;
    }


    /**
     * Sets the isProductiveTime value for this Job.
     * 
     * @param isProductiveTime
     */
    public void setIsProductiveTime(java.lang.Boolean isProductiveTime) {
        this.isProductiveTime = isProductiveTime;
    }


    /**
     * Gets the isExemptTime value for this Job.
     * 
     * @return isExemptTime
     */
    public java.lang.Boolean getIsExemptTime() {
        return isExemptTime;
    }


    /**
     * Sets the isExemptTime value for this Job.
     * 
     * @param isExemptTime
     */
    public void setIsExemptTime(java.lang.Boolean isExemptTime) {
        this.isExemptTime = isExemptTime;
    }


    /**
     * Gets the materializeTime value for this Job.
     * 
     * @return materializeTime
     */
    public java.lang.Boolean getMaterializeTime() {
        return materializeTime;
    }


    /**
     * Sets the materializeTime value for this Job.
     * 
     * @param materializeTime
     */
    public void setMaterializeTime(java.lang.Boolean materializeTime) {
        this.materializeTime = materializeTime;
    }


    /**
     * Gets the allowExpenses value for this Job.
     * 
     * @return allowExpenses
     */
    public java.lang.Boolean getAllowExpenses() {
        return allowExpenses;
    }


    /**
     * Sets the allowExpenses value for this Job.
     * 
     * @param allowExpenses
     */
    public void setAllowExpenses(java.lang.Boolean allowExpenses) {
        this.allowExpenses = allowExpenses;
    }


    /**
     * Gets the allocatePayrollExpenses value for this Job.
     * 
     * @return allocatePayrollExpenses
     */
    public java.lang.Boolean getAllocatePayrollExpenses() {
        return allocatePayrollExpenses;
    }


    /**
     * Sets the allocatePayrollExpenses value for this Job.
     * 
     * @param allocatePayrollExpenses
     */
    public void setAllocatePayrollExpenses(java.lang.Boolean allocatePayrollExpenses) {
        this.allocatePayrollExpenses = allocatePayrollExpenses;
    }


    /**
     * Gets the includeCrmTasksInTotals value for this Job.
     * 
     * @return includeCrmTasksInTotals
     */
    public java.lang.Boolean getIncludeCrmTasksInTotals() {
        return includeCrmTasksInTotals;
    }


    /**
     * Sets the includeCrmTasksInTotals value for this Job.
     * 
     * @param includeCrmTasksInTotals
     */
    public void setIncludeCrmTasksInTotals(java.lang.Boolean includeCrmTasksInTotals) {
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
    }


    /**
     * Gets the globalSubscriptionStatus value for this Job.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this Job.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the jobResourcesList value for this Job.
     * 
     * @return jobResourcesList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.JobResourcesList getJobResourcesList() {
        return jobResourcesList;
    }


    /**
     * Sets the jobResourcesList value for this Job.
     * 
     * @param jobResourcesList
     */
    public void setJobResourcesList(com.netsuite.webservices.lists.relationships_2019_1.JobResourcesList jobResourcesList) {
        this.jobResourcesList = jobResourcesList;
    }


    /**
     * Gets the plStatementList value for this Job.
     * 
     * @return plStatementList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.JobPlStatementList getPlStatementList() {
        return plStatementList;
    }


    /**
     * Sets the plStatementList value for this Job.
     * 
     * @param plStatementList
     */
    public void setPlStatementList(com.netsuite.webservices.lists.relationships_2019_1.JobPlStatementList plStatementList) {
        this.plStatementList = plStatementList;
    }


    /**
     * Gets the addressbookList value for this Job.
     * 
     * @return addressbookList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.JobAddressbookList getAddressbookList() {
        return addressbookList;
    }


    /**
     * Sets the addressbookList value for this Job.
     * 
     * @param addressbookList
     */
    public void setAddressbookList(com.netsuite.webservices.lists.relationships_2019_1.JobAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }


    /**
     * Gets the milestonesList value for this Job.
     * 
     * @return milestonesList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.JobMilestonesList getMilestonesList() {
        return milestonesList;
    }


    /**
     * Sets the milestonesList value for this Job.
     * 
     * @param milestonesList
     */
    public void setMilestonesList(com.netsuite.webservices.lists.relationships_2019_1.JobMilestonesList milestonesList) {
        this.milestonesList = milestonesList;
    }


    /**
     * Gets the creditCardsList value for this Job.
     * 
     * @return creditCardsList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.JobCreditCardsList getCreditCardsList() {
        return creditCardsList;
    }


    /**
     * Sets the creditCardsList value for this Job.
     * 
     * @param creditCardsList
     */
    public void setCreditCardsList(com.netsuite.webservices.lists.relationships_2019_1.JobCreditCardsList creditCardsList) {
        this.creditCardsList = creditCardsList;
    }


    /**
     * Gets the customFieldList value for this Job.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Job.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Job.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Job.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Job.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Job.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Job)) return false;
        Job other = (Job) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.altName==null && other.getAltName()==null) || 
             (this.altName!=null &&
              this.altName.equals(other.getAltName()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.defaultAddress==null && other.getDefaultAddress()==null) || 
             (this.defaultAddress!=null &&
              this.defaultAddress.equals(other.getDefaultAddress()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.percentCompleteOverrideList==null && other.getPercentCompleteOverrideList()==null) || 
             (this.percentCompleteOverrideList!=null &&
              this.percentCompleteOverrideList.equals(other.getPercentCompleteOverrideList()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.billPay==null && other.getBillPay()==null) || 
             (this.billPay!=null &&
              this.billPay.equals(other.getBillPay()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.workplace==null && other.getWorkplace()==null) || 
             (this.workplace!=null &&
              this.workplace.equals(other.getWorkplace()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.fxRate==null && other.getFxRate()==null) || 
             (this.fxRate!=null &&
              this.fxRate.equals(other.getFxRate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.altPhone==null && other.getAltPhone()==null) || 
             (this.altPhone!=null &&
              this.altPhone.equals(other.getAltPhone()))) &&
            ((this.calculatedEndDate==null && other.getCalculatedEndDate()==null) || 
             (this.calculatedEndDate!=null &&
              this.calculatedEndDate.equals(other.getCalculatedEndDate()))) &&
            ((this.calculatedEndDateBaseline==null && other.getCalculatedEndDateBaseline()==null) || 
             (this.calculatedEndDateBaseline!=null &&
              this.calculatedEndDateBaseline.equals(other.getCalculatedEndDateBaseline()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              this.startDateBaseline.equals(other.getStartDateBaseline()))) &&
            ((this.projectedEndDate==null && other.getProjectedEndDate()==null) || 
             (this.projectedEndDate!=null &&
              this.projectedEndDate.equals(other.getProjectedEndDate()))) &&
            ((this.projectedEndDateBaseline==null && other.getProjectedEndDateBaseline()==null) || 
             (this.projectedEndDateBaseline!=null &&
              this.projectedEndDateBaseline.equals(other.getProjectedEndDateBaseline()))) &&
            ((this.lastBaselineDate==null && other.getLastBaselineDate()==null) || 
             (this.lastBaselineDate!=null &&
              this.lastBaselineDate.equals(other.getLastBaselineDate()))) &&
            ((this.jobType==null && other.getJobType()==null) || 
             (this.jobType!=null &&
              this.jobType.equals(other.getJobType()))) &&
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              this.percentComplete.equals(other.getPercentComplete()))) &&
            ((this.estimatedCost==null && other.getEstimatedCost()==null) || 
             (this.estimatedCost!=null &&
              this.estimatedCost.equals(other.getEstimatedCost()))) &&
            ((this.estimatedRevenue==null && other.getEstimatedRevenue()==null) || 
             (this.estimatedRevenue!=null &&
              this.estimatedRevenue.equals(other.getEstimatedRevenue()))) &&
            ((this.estimatedTime==null && other.getEstimatedTime()==null) || 
             (this.estimatedTime!=null &&
              this.estimatedTime.equals(other.getEstimatedTime()))) &&
            ((this.estimatedTimeOverride==null && other.getEstimatedTimeOverride()==null) || 
             (this.estimatedTimeOverride!=null &&
              this.estimatedTimeOverride.equals(other.getEstimatedTimeOverride()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailPreference==null && other.getEmailPreference()==null) || 
             (this.emailPreference!=null &&
              this.emailPreference.equals(other.getEmailPreference()))) &&
            ((this.openingBalance==null && other.getOpeningBalance()==null) || 
             (this.openingBalance!=null &&
              this.openingBalance.equals(other.getOpeningBalance()))) &&
            ((this.openingBalanceDate==null && other.getOpeningBalanceDate()==null) || 
             (this.openingBalanceDate!=null &&
              this.openingBalanceDate.equals(other.getOpeningBalanceDate()))) &&
            ((this.openingBalanceAccount==null && other.getOpeningBalanceAccount()==null) || 
             (this.openingBalanceAccount!=null &&
              this.openingBalanceAccount.equals(other.getOpeningBalanceAccount()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.jobBillingType==null && other.getJobBillingType()==null) || 
             (this.jobBillingType!=null &&
              this.jobBillingType.equals(other.getJobBillingType()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.jobItem==null && other.getJobItem()==null) || 
             (this.jobItem!=null &&
              this.jobItem.equals(other.getJobItem()))) &&
            ((this.percentTimeComplete==null && other.getPercentTimeComplete()==null) || 
             (this.percentTimeComplete!=null &&
              this.percentTimeComplete.equals(other.getPercentTimeComplete()))) &&
            ((this.actualTime==null && other.getActualTime()==null) || 
             (this.actualTime!=null &&
              this.actualTime.equals(other.getActualTime()))) &&
            ((this.allowTime==null && other.getAllowTime()==null) || 
             (this.allowTime!=null &&
              this.allowTime.equals(other.getAllowTime()))) &&
            ((this.timeRemaining==null && other.getTimeRemaining()==null) || 
             (this.timeRemaining!=null &&
              this.timeRemaining.equals(other.getTimeRemaining()))) &&
            ((this.limitTimeToAssignees==null && other.getLimitTimeToAssignees()==null) || 
             (this.limitTimeToAssignees!=null &&
              this.limitTimeToAssignees.equals(other.getLimitTimeToAssignees()))) &&
            ((this.estimatedLaborCost==null && other.getEstimatedLaborCost()==null) || 
             (this.estimatedLaborCost!=null &&
              this.estimatedLaborCost.equals(other.getEstimatedLaborCost()))) &&
            ((this.estimatedLaborCostBaseline==null && other.getEstimatedLaborCostBaseline()==null) || 
             (this.estimatedLaborCostBaseline!=null &&
              this.estimatedLaborCostBaseline.equals(other.getEstimatedLaborCostBaseline()))) &&
            ((this.estimateRevRecTemplate==null && other.getEstimateRevRecTemplate()==null) || 
             (this.estimateRevRecTemplate!=null &&
              this.estimateRevRecTemplate.equals(other.getEstimateRevRecTemplate()))) &&
            ((this.revRecForecastRule==null && other.getRevRecForecastRule()==null) || 
             (this.revRecForecastRule!=null &&
              this.revRecForecastRule.equals(other.getRevRecForecastRule()))) &&
            ((this.usePercentCompleteOverride==null && other.getUsePercentCompleteOverride()==null) || 
             (this.usePercentCompleteOverride!=null &&
              this.usePercentCompleteOverride.equals(other.getUsePercentCompleteOverride()))) &&
            ((this.estimatedLaborRevenue==null && other.getEstimatedLaborRevenue()==null) || 
             (this.estimatedLaborRevenue!=null &&
              this.estimatedLaborRevenue.equals(other.getEstimatedLaborRevenue()))) &&
            ((this.estimatedGrossProfit==null && other.getEstimatedGrossProfit()==null) || 
             (this.estimatedGrossProfit!=null &&
              this.estimatedGrossProfit.equals(other.getEstimatedGrossProfit()))) &&
            ((this.estimatedGrossProfitPercent==null && other.getEstimatedGrossProfitPercent()==null) || 
             (this.estimatedGrossProfitPercent!=null &&
              this.estimatedGrossProfitPercent.equals(other.getEstimatedGrossProfitPercent()))) &&
            ((this.projectExpenseType==null && other.getProjectExpenseType()==null) || 
             (this.projectExpenseType!=null &&
              this.projectExpenseType.equals(other.getProjectExpenseType()))) &&
            ((this.applyProjectExpenseTypeToAll==null && other.getApplyProjectExpenseTypeToAll()==null) || 
             (this.applyProjectExpenseTypeToAll!=null &&
              this.applyProjectExpenseTypeToAll.equals(other.getApplyProjectExpenseTypeToAll()))) &&
            ((this.allowAllResourcesForTasks==null && other.getAllowAllResourcesForTasks()==null) || 
             (this.allowAllResourcesForTasks!=null &&
              this.allowAllResourcesForTasks.equals(other.getAllowAllResourcesForTasks()))) &&
            ((this.jobPrice==null && other.getJobPrice()==null) || 
             (this.jobPrice!=null &&
              this.jobPrice.equals(other.getJobPrice()))) &&
            ((this.isUtilizedTime==null && other.getIsUtilizedTime()==null) || 
             (this.isUtilizedTime!=null &&
              this.isUtilizedTime.equals(other.getIsUtilizedTime()))) &&
            ((this.isProductiveTime==null && other.getIsProductiveTime()==null) || 
             (this.isProductiveTime!=null &&
              this.isProductiveTime.equals(other.getIsProductiveTime()))) &&
            ((this.isExemptTime==null && other.getIsExemptTime()==null) || 
             (this.isExemptTime!=null &&
              this.isExemptTime.equals(other.getIsExemptTime()))) &&
            ((this.materializeTime==null && other.getMaterializeTime()==null) || 
             (this.materializeTime!=null &&
              this.materializeTime.equals(other.getMaterializeTime()))) &&
            ((this.allowExpenses==null && other.getAllowExpenses()==null) || 
             (this.allowExpenses!=null &&
              this.allowExpenses.equals(other.getAllowExpenses()))) &&
            ((this.allocatePayrollExpenses==null && other.getAllocatePayrollExpenses()==null) || 
             (this.allocatePayrollExpenses!=null &&
              this.allocatePayrollExpenses.equals(other.getAllocatePayrollExpenses()))) &&
            ((this.includeCrmTasksInTotals==null && other.getIncludeCrmTasksInTotals()==null) || 
             (this.includeCrmTasksInTotals!=null &&
              this.includeCrmTasksInTotals.equals(other.getIncludeCrmTasksInTotals()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.jobResourcesList==null && other.getJobResourcesList()==null) || 
             (this.jobResourcesList!=null &&
              this.jobResourcesList.equals(other.getJobResourcesList()))) &&
            ((this.plStatementList==null && other.getPlStatementList()==null) || 
             (this.plStatementList!=null &&
              this.plStatementList.equals(other.getPlStatementList()))) &&
            ((this.addressbookList==null && other.getAddressbookList()==null) || 
             (this.addressbookList!=null &&
              this.addressbookList.equals(other.getAddressbookList()))) &&
            ((this.milestonesList==null && other.getMilestonesList()==null) || 
             (this.milestonesList!=null &&
              this.milestonesList.equals(other.getMilestonesList()))) &&
            ((this.creditCardsList==null && other.getCreditCardsList()==null) || 
             (this.creditCardsList!=null &&
              this.creditCardsList.equals(other.getCreditCardsList()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getAltName() != null) {
            _hashCode += getAltName().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getDefaultAddress() != null) {
            _hashCode += getDefaultAddress().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getPercentCompleteOverrideList() != null) {
            _hashCode += getPercentCompleteOverrideList().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getBillPay() != null) {
            _hashCode += getBillPay().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getWorkplace() != null) {
            _hashCode += getWorkplace().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getFxRate() != null) {
            _hashCode += getFxRate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getAltPhone() != null) {
            _hashCode += getAltPhone().hashCode();
        }
        if (getCalculatedEndDate() != null) {
            _hashCode += getCalculatedEndDate().hashCode();
        }
        if (getCalculatedEndDateBaseline() != null) {
            _hashCode += getCalculatedEndDateBaseline().hashCode();
        }
        if (getStartDateBaseline() != null) {
            _hashCode += getStartDateBaseline().hashCode();
        }
        if (getProjectedEndDate() != null) {
            _hashCode += getProjectedEndDate().hashCode();
        }
        if (getProjectedEndDateBaseline() != null) {
            _hashCode += getProjectedEndDateBaseline().hashCode();
        }
        if (getLastBaselineDate() != null) {
            _hashCode += getLastBaselineDate().hashCode();
        }
        if (getJobType() != null) {
            _hashCode += getJobType().hashCode();
        }
        if (getPercentComplete() != null) {
            _hashCode += getPercentComplete().hashCode();
        }
        if (getEstimatedCost() != null) {
            _hashCode += getEstimatedCost().hashCode();
        }
        if (getEstimatedRevenue() != null) {
            _hashCode += getEstimatedRevenue().hashCode();
        }
        if (getEstimatedTime() != null) {
            _hashCode += getEstimatedTime().hashCode();
        }
        if (getEstimatedTimeOverride() != null) {
            _hashCode += getEstimatedTimeOverride().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailPreference() != null) {
            _hashCode += getEmailPreference().hashCode();
        }
        if (getOpeningBalance() != null) {
            _hashCode += getOpeningBalance().hashCode();
        }
        if (getOpeningBalanceDate() != null) {
            _hashCode += getOpeningBalanceDate().hashCode();
        }
        if (getOpeningBalanceAccount() != null) {
            _hashCode += getOpeningBalanceAccount().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getJobBillingType() != null) {
            _hashCode += getJobBillingType().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getJobItem() != null) {
            _hashCode += getJobItem().hashCode();
        }
        if (getPercentTimeComplete() != null) {
            _hashCode += getPercentTimeComplete().hashCode();
        }
        if (getActualTime() != null) {
            _hashCode += getActualTime().hashCode();
        }
        if (getAllowTime() != null) {
            _hashCode += getAllowTime().hashCode();
        }
        if (getTimeRemaining() != null) {
            _hashCode += getTimeRemaining().hashCode();
        }
        if (getLimitTimeToAssignees() != null) {
            _hashCode += getLimitTimeToAssignees().hashCode();
        }
        if (getEstimatedLaborCost() != null) {
            _hashCode += getEstimatedLaborCost().hashCode();
        }
        if (getEstimatedLaborCostBaseline() != null) {
            _hashCode += getEstimatedLaborCostBaseline().hashCode();
        }
        if (getEstimateRevRecTemplate() != null) {
            _hashCode += getEstimateRevRecTemplate().hashCode();
        }
        if (getRevRecForecastRule() != null) {
            _hashCode += getRevRecForecastRule().hashCode();
        }
        if (getUsePercentCompleteOverride() != null) {
            _hashCode += getUsePercentCompleteOverride().hashCode();
        }
        if (getEstimatedLaborRevenue() != null) {
            _hashCode += getEstimatedLaborRevenue().hashCode();
        }
        if (getEstimatedGrossProfit() != null) {
            _hashCode += getEstimatedGrossProfit().hashCode();
        }
        if (getEstimatedGrossProfitPercent() != null) {
            _hashCode += getEstimatedGrossProfitPercent().hashCode();
        }
        if (getProjectExpenseType() != null) {
            _hashCode += getProjectExpenseType().hashCode();
        }
        if (getApplyProjectExpenseTypeToAll() != null) {
            _hashCode += getApplyProjectExpenseTypeToAll().hashCode();
        }
        if (getAllowAllResourcesForTasks() != null) {
            _hashCode += getAllowAllResourcesForTasks().hashCode();
        }
        if (getJobPrice() != null) {
            _hashCode += getJobPrice().hashCode();
        }
        if (getIsUtilizedTime() != null) {
            _hashCode += getIsUtilizedTime().hashCode();
        }
        if (getIsProductiveTime() != null) {
            _hashCode += getIsProductiveTime().hashCode();
        }
        if (getIsExemptTime() != null) {
            _hashCode += getIsExemptTime().hashCode();
        }
        if (getMaterializeTime() != null) {
            _hashCode += getMaterializeTime().hashCode();
        }
        if (getAllowExpenses() != null) {
            _hashCode += getAllowExpenses().hashCode();
        }
        if (getAllocatePayrollExpenses() != null) {
            _hashCode += getAllocatePayrollExpenses().hashCode();
        }
        if (getIncludeCrmTasksInTotals() != null) {
            _hashCode += getIncludeCrmTasksInTotals().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getJobResourcesList() != null) {
            _hashCode += getJobResourcesList().hashCode();
        }
        if (getPlStatementList() != null) {
            _hashCode += getPlStatementList().hashCode();
        }
        if (getAddressbookList() != null) {
            _hashCode += getAddressbookList().hashCode();
        }
        if (getMilestonesList() != null) {
            _hashCode += getMilestonesList().hashCode();
        }
        if (getCreditCardsList() != null) {
            _hashCode += getCreditCardsList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Job.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "Job"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "defaultAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentCompleteOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "percentCompleteOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobPercentCompleteOverrideList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "fxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "altPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "calculatedEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedEndDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "calculatedEndDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "projectedEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedEndDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "projectedEndDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBaselineDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastBaselineDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "EmailPreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "openingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBalanceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "openingBalanceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBalanceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "openingBalanceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobBillingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobBillingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "JobBillingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "allowTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitTimeToAssignees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "limitTimeToAssignees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedLaborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborCostBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedLaborCostBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimateRevRecTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimateRevRecTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePercentCompleteOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "usePercentCompleteOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedLaborRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectExpenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "projectExpenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyProjectExpenseTypeToAll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "applyProjectExpenseTypeToAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAllResourcesForTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "allowAllResourcesForTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUtilizedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isUtilizedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProductiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isProductiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExemptTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isExemptTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materializeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "materializeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowExpenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "allowExpenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocatePayrollExpenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "allocatePayrollExpenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCrmTasksInTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "includeCrmTasksInTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobResourcesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobResourcesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobResourcesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plStatementList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "plStatementList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobPlStatementList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobAddressbookList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestonesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "milestonesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobMilestonesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "creditCardsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobCreditCardsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customFieldList"));
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
