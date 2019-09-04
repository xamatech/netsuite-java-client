/**
 * JobSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class JobSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchStringField accountNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField address;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField addressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField addressLabel;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField addressPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allocatePayrollExpenses;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowAllResourcesForTasks;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowExpenses;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField applyProjectExpenseTypeToAll;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField attention;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField calculatedEndDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField calculatedEndDateBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField city;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField comments;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField county;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultTaxReg;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField defaultTaxRegText;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField email;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField entityId;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField estEndDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedGrossProfitPercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedLaborCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedLaborCostBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedLaborRevenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTimeOverride;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTimeOverrideBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estRevenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField fax;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField giveAccess;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField image;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeCrmTasksInTotals;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultBilling;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultShipping;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isExemptTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isProductiveTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isUtilizedTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField jobBillingType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jobItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField jobPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jobResource;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jobResourceRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField language;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastBaselineDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField level;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField limitTimeToAssignees;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField materializeTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField pctComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField percentTimeComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField permission;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField phoneticName;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField projectedEndDateBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField projectExpenseType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revRecForecastRule;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDateBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField state;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField timeRemaining;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField type;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField usePercentCompleteOverride;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField zipCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public JobSearchBasic() {
    }

    public JobSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchStringField accountNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualTime,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField address,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField addressee,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField addressLabel,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField addressPhone,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allocatePayrollExpenses,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowAllResourcesForTasks,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowExpenses,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowTime,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField applyProjectExpenseTypeToAll,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField attention,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingSchedule,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField calculatedEndDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField calculatedEndDateBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField city,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField comments,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField contact,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField county,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultTaxReg,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField defaultTaxRegText,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField email,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField entityId,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estCost,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField estEndDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedGrossProfit,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedGrossProfitPercent,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedLaborCost,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedLaborCostBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedLaborRevenue,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTime,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTimeOverride,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTimeOverrideBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estRevenue,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField fax,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField giveAccess,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField image,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeCrmTasksInTotals,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultBilling,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultShipping,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isExemptTime,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isProductiveTime,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isUtilizedTime,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField jobBillingType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jobItem,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField jobPrice,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jobResource,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jobResourceRole,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField language,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastBaselineDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField level,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField limitTimeToAssignees,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField materializeTime,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField pctComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField percentTimeComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField permission,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField phone,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField phoneticName,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField projectedEndDateBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField projectExpenseType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revRecForecastRule,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDateBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField state,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField timeRemaining,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField type,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField usePercentCompleteOverride,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField zipCode,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.actualTime = actualTime;
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.allocatePayrollExpenses = allocatePayrollExpenses;
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
        this.allowExpenses = allowExpenses;
        this.allowTime = allowTime;
        this.applyProjectExpenseTypeToAll = applyProjectExpenseTypeToAll;
        this.attention = attention;
        this.billingSchedule = billingSchedule;
        this.calculatedEndDate = calculatedEndDate;
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
        this.category = category;
        this.city = city;
        this.comments = comments;
        this.contact = contact;
        this.country = country;
        this.county = county;
        this.customer = customer;
        this.dateCreated = dateCreated;
        this.defaultTaxReg = defaultTaxReg;
        this.defaultTaxRegText = defaultTaxRegText;
        this.email = email;
        this.endDate = endDate;
        this.entityId = entityId;
        this.estCost = estCost;
        this.estEndDate = estEndDate;
        this.estimatedGrossProfit = estimatedGrossProfit;
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
        this.estimatedLaborCost = estimatedLaborCost;
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
        this.estimatedLaborRevenue = estimatedLaborRevenue;
        this.estimatedTime = estimatedTime;
        this.estimatedTimeOverride = estimatedTimeOverride;
        this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
        this.estRevenue = estRevenue;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.image = image;
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isExemptTime = isExemptTime;
        this.isInactive = isInactive;
        this.isProductiveTime = isProductiveTime;
        this.isUtilizedTime = isUtilizedTime;
        this.jobBillingType = jobBillingType;
        this.jobItem = jobItem;
        this.jobPrice = jobPrice;
        this.jobResource = jobResource;
        this.jobResourceRole = jobResourceRole;
        this.language = language;
        this.lastBaselineDate = lastBaselineDate;
        this.lastModifiedDate = lastModifiedDate;
        this.level = level;
        this.limitTimeToAssignees = limitTimeToAssignees;
        this.materializeTime = materializeTime;
        this.parent = parent;
        this.pctComplete = pctComplete;
        this.percentTimeComplete = percentTimeComplete;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.projectedEndDateBaseline = projectedEndDateBaseline;
        this.projectExpenseType = projectExpenseType;
        this.revRecForecastRule = revRecForecastRule;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.state = state;
        this.status = status;
        this.subsidiary = subsidiary;
        this.timeRemaining = timeRemaining;
        this.type = type;
        this.usePercentCompleteOverride = usePercentCompleteOverride;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountNumber value for this JobSearchBasic.
     * 
     * @return accountNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this JobSearchBasic.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the actualTime value for this JobSearchBasic.
     * 
     * @return actualTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getActualTime() {
        return actualTime;
    }


    /**
     * Sets the actualTime value for this JobSearchBasic.
     * 
     * @param actualTime
     */
    public void setActualTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualTime) {
        this.actualTime = actualTime;
    }


    /**
     * Gets the address value for this JobSearchBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this JobSearchBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the addressee value for this JobSearchBasic.
     * 
     * @return addressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this JobSearchBasic.
     * 
     * @param addressee
     */
    public void setAddressee(com.netsuite.webservices.platform.core_2019_1.SearchStringField addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addressLabel value for this JobSearchBasic.
     * 
     * @return addressLabel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this JobSearchBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(com.netsuite.webservices.platform.core_2019_1.SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }


    /**
     * Gets the addressPhone value for this JobSearchBasic.
     * 
     * @return addressPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this JobSearchBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }


    /**
     * Gets the allocatePayrollExpenses value for this JobSearchBasic.
     * 
     * @return allocatePayrollExpenses
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAllocatePayrollExpenses() {
        return allocatePayrollExpenses;
    }


    /**
     * Sets the allocatePayrollExpenses value for this JobSearchBasic.
     * 
     * @param allocatePayrollExpenses
     */
    public void setAllocatePayrollExpenses(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allocatePayrollExpenses) {
        this.allocatePayrollExpenses = allocatePayrollExpenses;
    }


    /**
     * Gets the allowAllResourcesForTasks value for this JobSearchBasic.
     * 
     * @return allowAllResourcesForTasks
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAllowAllResourcesForTasks() {
        return allowAllResourcesForTasks;
    }


    /**
     * Sets the allowAllResourcesForTasks value for this JobSearchBasic.
     * 
     * @param allowAllResourcesForTasks
     */
    public void setAllowAllResourcesForTasks(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowAllResourcesForTasks) {
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
    }


    /**
     * Gets the allowExpenses value for this JobSearchBasic.
     * 
     * @return allowExpenses
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAllowExpenses() {
        return allowExpenses;
    }


    /**
     * Sets the allowExpenses value for this JobSearchBasic.
     * 
     * @param allowExpenses
     */
    public void setAllowExpenses(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowExpenses) {
        this.allowExpenses = allowExpenses;
    }


    /**
     * Gets the allowTime value for this JobSearchBasic.
     * 
     * @return allowTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAllowTime() {
        return allowTime;
    }


    /**
     * Sets the allowTime value for this JobSearchBasic.
     * 
     * @param allowTime
     */
    public void setAllowTime(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowTime) {
        this.allowTime = allowTime;
    }


    /**
     * Gets the applyProjectExpenseTypeToAll value for this JobSearchBasic.
     * 
     * @return applyProjectExpenseTypeToAll
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getApplyProjectExpenseTypeToAll() {
        return applyProjectExpenseTypeToAll;
    }


    /**
     * Sets the applyProjectExpenseTypeToAll value for this JobSearchBasic.
     * 
     * @param applyProjectExpenseTypeToAll
     */
    public void setApplyProjectExpenseTypeToAll(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField applyProjectExpenseTypeToAll) {
        this.applyProjectExpenseTypeToAll = applyProjectExpenseTypeToAll;
    }


    /**
     * Gets the attention value for this JobSearchBasic.
     * 
     * @return attention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this JobSearchBasic.
     * 
     * @param attention
     */
    public void setAttention(com.netsuite.webservices.platform.core_2019_1.SearchStringField attention) {
        this.attention = attention;
    }


    /**
     * Gets the billingSchedule value for this JobSearchBasic.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this JobSearchBasic.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the calculatedEndDate value for this JobSearchBasic.
     * 
     * @return calculatedEndDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCalculatedEndDate() {
        return calculatedEndDate;
    }


    /**
     * Sets the calculatedEndDate value for this JobSearchBasic.
     * 
     * @param calculatedEndDate
     */
    public void setCalculatedEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField calculatedEndDate) {
        this.calculatedEndDate = calculatedEndDate;
    }


    /**
     * Gets the calculatedEndDateBaseline value for this JobSearchBasic.
     * 
     * @return calculatedEndDateBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCalculatedEndDateBaseline() {
        return calculatedEndDateBaseline;
    }


    /**
     * Sets the calculatedEndDateBaseline value for this JobSearchBasic.
     * 
     * @param calculatedEndDateBaseline
     */
    public void setCalculatedEndDateBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDateField calculatedEndDateBaseline) {
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
    }


    /**
     * Gets the category value for this JobSearchBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this JobSearchBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the city value for this JobSearchBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this JobSearchBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the comments value for this JobSearchBasic.
     * 
     * @return comments
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this JobSearchBasic.
     * 
     * @param comments
     */
    public void setComments(com.netsuite.webservices.platform.core_2019_1.SearchStringField comments) {
        this.comments = comments;
    }


    /**
     * Gets the contact value for this JobSearchBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this JobSearchBasic.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.SearchStringField contact) {
        this.contact = contact;
    }


    /**
     * Gets the country value for this JobSearchBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this JobSearchBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this JobSearchBasic.
     * 
     * @return county
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this JobSearchBasic.
     * 
     * @param county
     */
    public void setCounty(com.netsuite.webservices.platform.core_2019_1.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the customer value for this JobSearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this JobSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer) {
        this.customer = customer;
    }


    /**
     * Gets the dateCreated value for this JobSearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this JobSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the defaultTaxReg value for this JobSearchBasic.
     * 
     * @return defaultTaxReg
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDefaultTaxReg() {
        return defaultTaxReg;
    }


    /**
     * Sets the defaultTaxReg value for this JobSearchBasic.
     * 
     * @param defaultTaxReg
     */
    public void setDefaultTaxReg(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }


    /**
     * Gets the defaultTaxRegText value for this JobSearchBasic.
     * 
     * @return defaultTaxRegText
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDefaultTaxRegText() {
        return defaultTaxRegText;
    }


    /**
     * Sets the defaultTaxRegText value for this JobSearchBasic.
     * 
     * @param defaultTaxRegText
     */
    public void setDefaultTaxRegText(com.netsuite.webservices.platform.core_2019_1.SearchStringField defaultTaxRegText) {
        this.defaultTaxRegText = defaultTaxRegText;
    }


    /**
     * Gets the email value for this JobSearchBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this JobSearchBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the endDate value for this JobSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this JobSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the entityId value for this JobSearchBasic.
     * 
     * @return entityId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this JobSearchBasic.
     * 
     * @param entityId
     */
    public void setEntityId(com.netsuite.webservices.platform.core_2019_1.SearchStringField entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the estCost value for this JobSearchBasic.
     * 
     * @return estCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstCost() {
        return estCost;
    }


    /**
     * Sets the estCost value for this JobSearchBasic.
     * 
     * @param estCost
     */
    public void setEstCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estCost) {
        this.estCost = estCost;
    }


    /**
     * Gets the estEndDate value for this JobSearchBasic.
     * 
     * @return estEndDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEstEndDate() {
        return estEndDate;
    }


    /**
     * Sets the estEndDate value for this JobSearchBasic.
     * 
     * @param estEndDate
     */
    public void setEstEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField estEndDate) {
        this.estEndDate = estEndDate;
    }


    /**
     * Gets the estimatedGrossProfit value for this JobSearchBasic.
     * 
     * @return estimatedGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedGrossProfit() {
        return estimatedGrossProfit;
    }


    /**
     * Sets the estimatedGrossProfit value for this JobSearchBasic.
     * 
     * @param estimatedGrossProfit
     */
    public void setEstimatedGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedGrossProfit) {
        this.estimatedGrossProfit = estimatedGrossProfit;
    }


    /**
     * Gets the estimatedGrossProfitPercent value for this JobSearchBasic.
     * 
     * @return estimatedGrossProfitPercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedGrossProfitPercent() {
        return estimatedGrossProfitPercent;
    }


    /**
     * Sets the estimatedGrossProfitPercent value for this JobSearchBasic.
     * 
     * @param estimatedGrossProfitPercent
     */
    public void setEstimatedGrossProfitPercent(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedGrossProfitPercent) {
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
    }


    /**
     * Gets the estimatedLaborCost value for this JobSearchBasic.
     * 
     * @return estimatedLaborCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedLaborCost() {
        return estimatedLaborCost;
    }


    /**
     * Sets the estimatedLaborCost value for this JobSearchBasic.
     * 
     * @param estimatedLaborCost
     */
    public void setEstimatedLaborCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedLaborCost) {
        this.estimatedLaborCost = estimatedLaborCost;
    }


    /**
     * Gets the estimatedLaborCostBaseline value for this JobSearchBasic.
     * 
     * @return estimatedLaborCostBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedLaborCostBaseline() {
        return estimatedLaborCostBaseline;
    }


    /**
     * Sets the estimatedLaborCostBaseline value for this JobSearchBasic.
     * 
     * @param estimatedLaborCostBaseline
     */
    public void setEstimatedLaborCostBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedLaborCostBaseline) {
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
    }


    /**
     * Gets the estimatedLaborRevenue value for this JobSearchBasic.
     * 
     * @return estimatedLaborRevenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedLaborRevenue() {
        return estimatedLaborRevenue;
    }


    /**
     * Sets the estimatedLaborRevenue value for this JobSearchBasic.
     * 
     * @param estimatedLaborRevenue
     */
    public void setEstimatedLaborRevenue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedLaborRevenue) {
        this.estimatedLaborRevenue = estimatedLaborRevenue;
    }


    /**
     * Gets the estimatedTime value for this JobSearchBasic.
     * 
     * @return estimatedTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedTime() {
        return estimatedTime;
    }


    /**
     * Sets the estimatedTime value for this JobSearchBasic.
     * 
     * @param estimatedTime
     */
    public void setEstimatedTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTime) {
        this.estimatedTime = estimatedTime;
    }


    /**
     * Gets the estimatedTimeOverride value for this JobSearchBasic.
     * 
     * @return estimatedTimeOverride
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }


    /**
     * Sets the estimatedTimeOverride value for this JobSearchBasic.
     * 
     * @param estimatedTimeOverride
     */
    public void setEstimatedTimeOverride(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }


    /**
     * Gets the estimatedTimeOverrideBaseline value for this JobSearchBasic.
     * 
     * @return estimatedTimeOverrideBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedTimeOverrideBaseline() {
        return estimatedTimeOverrideBaseline;
    }


    /**
     * Sets the estimatedTimeOverrideBaseline value for this JobSearchBasic.
     * 
     * @param estimatedTimeOverrideBaseline
     */
    public void setEstimatedTimeOverrideBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedTimeOverrideBaseline) {
        this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
    }


    /**
     * Gets the estRevenue value for this JobSearchBasic.
     * 
     * @return estRevenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstRevenue() {
        return estRevenue;
    }


    /**
     * Sets the estRevenue value for this JobSearchBasic.
     * 
     * @param estRevenue
     */
    public void setEstRevenue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estRevenue) {
        this.estRevenue = estRevenue;
    }


    /**
     * Gets the externalId value for this JobSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this JobSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this JobSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this JobSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fax value for this JobSearchBasic.
     * 
     * @return fax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this JobSearchBasic.
     * 
     * @param fax
     */
    public void setFax(com.netsuite.webservices.platform.core_2019_1.SearchStringField fax) {
        this.fax = fax;
    }


    /**
     * Gets the giveAccess value for this JobSearchBasic.
     * 
     * @return giveAccess
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this JobSearchBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the globalSubscriptionStatus value for this JobSearchBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this JobSearchBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the image value for this JobSearchBasic.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getImage() {
        return image;
    }


    /**
     * Sets the image value for this JobSearchBasic.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2019_1.SearchStringField image) {
        this.image = image;
    }


    /**
     * Gets the includeCrmTasksInTotals value for this JobSearchBasic.
     * 
     * @return includeCrmTasksInTotals
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIncludeCrmTasksInTotals() {
        return includeCrmTasksInTotals;
    }


    /**
     * Sets the includeCrmTasksInTotals value for this JobSearchBasic.
     * 
     * @param includeCrmTasksInTotals
     */
    public void setIncludeCrmTasksInTotals(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeCrmTasksInTotals) {
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
    }


    /**
     * Gets the internalId value for this JobSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this JobSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this JobSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this JobSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDefaultBilling value for this JobSearchBasic.
     * 
     * @return isDefaultBilling
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this JobSearchBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }


    /**
     * Gets the isDefaultShipping value for this JobSearchBasic.
     * 
     * @return isDefaultShipping
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this JobSearchBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }


    /**
     * Gets the isExemptTime value for this JobSearchBasic.
     * 
     * @return isExemptTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsExemptTime() {
        return isExemptTime;
    }


    /**
     * Sets the isExemptTime value for this JobSearchBasic.
     * 
     * @param isExemptTime
     */
    public void setIsExemptTime(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isExemptTime) {
        this.isExemptTime = isExemptTime;
    }


    /**
     * Gets the isInactive value for this JobSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this JobSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isProductiveTime value for this JobSearchBasic.
     * 
     * @return isProductiveTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsProductiveTime() {
        return isProductiveTime;
    }


    /**
     * Sets the isProductiveTime value for this JobSearchBasic.
     * 
     * @param isProductiveTime
     */
    public void setIsProductiveTime(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isProductiveTime) {
        this.isProductiveTime = isProductiveTime;
    }


    /**
     * Gets the isUtilizedTime value for this JobSearchBasic.
     * 
     * @return isUtilizedTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsUtilizedTime() {
        return isUtilizedTime;
    }


    /**
     * Sets the isUtilizedTime value for this JobSearchBasic.
     * 
     * @param isUtilizedTime
     */
    public void setIsUtilizedTime(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isUtilizedTime) {
        this.isUtilizedTime = isUtilizedTime;
    }


    /**
     * Gets the jobBillingType value for this JobSearchBasic.
     * 
     * @return jobBillingType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getJobBillingType() {
        return jobBillingType;
    }


    /**
     * Sets the jobBillingType value for this JobSearchBasic.
     * 
     * @param jobBillingType
     */
    public void setJobBillingType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField jobBillingType) {
        this.jobBillingType = jobBillingType;
    }


    /**
     * Gets the jobItem value for this JobSearchBasic.
     * 
     * @return jobItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getJobItem() {
        return jobItem;
    }


    /**
     * Sets the jobItem value for this JobSearchBasic.
     * 
     * @param jobItem
     */
    public void setJobItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jobItem) {
        this.jobItem = jobItem;
    }


    /**
     * Gets the jobPrice value for this JobSearchBasic.
     * 
     * @return jobPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getJobPrice() {
        return jobPrice;
    }


    /**
     * Sets the jobPrice value for this JobSearchBasic.
     * 
     * @param jobPrice
     */
    public void setJobPrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField jobPrice) {
        this.jobPrice = jobPrice;
    }


    /**
     * Gets the jobResource value for this JobSearchBasic.
     * 
     * @return jobResource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getJobResource() {
        return jobResource;
    }


    /**
     * Sets the jobResource value for this JobSearchBasic.
     * 
     * @param jobResource
     */
    public void setJobResource(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jobResource) {
        this.jobResource = jobResource;
    }


    /**
     * Gets the jobResourceRole value for this JobSearchBasic.
     * 
     * @return jobResourceRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getJobResourceRole() {
        return jobResourceRole;
    }


    /**
     * Sets the jobResourceRole value for this JobSearchBasic.
     * 
     * @param jobResourceRole
     */
    public void setJobResourceRole(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jobResourceRole) {
        this.jobResourceRole = jobResourceRole;
    }


    /**
     * Gets the language value for this JobSearchBasic.
     * 
     * @return language
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this JobSearchBasic.
     * 
     * @param language
     */
    public void setLanguage(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField language) {
        this.language = language;
    }


    /**
     * Gets the lastBaselineDate value for this JobSearchBasic.
     * 
     * @return lastBaselineDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastBaselineDate() {
        return lastBaselineDate;
    }


    /**
     * Sets the lastBaselineDate value for this JobSearchBasic.
     * 
     * @param lastBaselineDate
     */
    public void setLastBaselineDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastBaselineDate) {
        this.lastBaselineDate = lastBaselineDate;
    }


    /**
     * Gets the lastModifiedDate value for this JobSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this JobSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the level value for this JobSearchBasic.
     * 
     * @return level
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLevel() {
        return level;
    }


    /**
     * Sets the level value for this JobSearchBasic.
     * 
     * @param level
     */
    public void setLevel(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField level) {
        this.level = level;
    }


    /**
     * Gets the limitTimeToAssignees value for this JobSearchBasic.
     * 
     * @return limitTimeToAssignees
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getLimitTimeToAssignees() {
        return limitTimeToAssignees;
    }


    /**
     * Sets the limitTimeToAssignees value for this JobSearchBasic.
     * 
     * @param limitTimeToAssignees
     */
    public void setLimitTimeToAssignees(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField limitTimeToAssignees) {
        this.limitTimeToAssignees = limitTimeToAssignees;
    }


    /**
     * Gets the materializeTime value for this JobSearchBasic.
     * 
     * @return materializeTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMaterializeTime() {
        return materializeTime;
    }


    /**
     * Sets the materializeTime value for this JobSearchBasic.
     * 
     * @param materializeTime
     */
    public void setMaterializeTime(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField materializeTime) {
        this.materializeTime = materializeTime;
    }


    /**
     * Gets the parent value for this JobSearchBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this JobSearchBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the pctComplete value for this JobSearchBasic.
     * 
     * @return pctComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPctComplete() {
        return pctComplete;
    }


    /**
     * Sets the pctComplete value for this JobSearchBasic.
     * 
     * @param pctComplete
     */
    public void setPctComplete(com.netsuite.webservices.platform.core_2019_1.SearchLongField pctComplete) {
        this.pctComplete = pctComplete;
    }


    /**
     * Gets the percentTimeComplete value for this JobSearchBasic.
     * 
     * @return percentTimeComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPercentTimeComplete() {
        return percentTimeComplete;
    }


    /**
     * Sets the percentTimeComplete value for this JobSearchBasic.
     * 
     * @param percentTimeComplete
     */
    public void setPercentTimeComplete(com.netsuite.webservices.platform.core_2019_1.SearchLongField percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }


    /**
     * Gets the permission value for this JobSearchBasic.
     * 
     * @return permission
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this JobSearchBasic.
     * 
     * @param permission
     */
    public void setPermission(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }


    /**
     * Gets the phone value for this JobSearchBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this JobSearchBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the phoneticName value for this JobSearchBasic.
     * 
     * @return phoneticName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this JobSearchBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(com.netsuite.webservices.platform.core_2019_1.SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the projectedEndDateBaseline value for this JobSearchBasic.
     * 
     * @return projectedEndDateBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getProjectedEndDateBaseline() {
        return projectedEndDateBaseline;
    }


    /**
     * Sets the projectedEndDateBaseline value for this JobSearchBasic.
     * 
     * @param projectedEndDateBaseline
     */
    public void setProjectedEndDateBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDateField projectedEndDateBaseline) {
        this.projectedEndDateBaseline = projectedEndDateBaseline;
    }


    /**
     * Gets the projectExpenseType value for this JobSearchBasic.
     * 
     * @return projectExpenseType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getProjectExpenseType() {
        return projectExpenseType;
    }


    /**
     * Sets the projectExpenseType value for this JobSearchBasic.
     * 
     * @param projectExpenseType
     */
    public void setProjectExpenseType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField projectExpenseType) {
        this.projectExpenseType = projectExpenseType;
    }


    /**
     * Gets the revRecForecastRule value for this JobSearchBasic.
     * 
     * @return revRecForecastRule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRevRecForecastRule() {
        return revRecForecastRule;
    }


    /**
     * Sets the revRecForecastRule value for this JobSearchBasic.
     * 
     * @param revRecForecastRule
     */
    public void setRevRecForecastRule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }


    /**
     * Gets the startDate value for this JobSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this JobSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startDateBaseline value for this JobSearchBasic.
     * 
     * @return startDateBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this JobSearchBasic.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }


    /**
     * Gets the state value for this JobSearchBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this JobSearchBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the status value for this JobSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this JobSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the subsidiary value for this JobSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this JobSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the timeRemaining value for this JobSearchBasic.
     * 
     * @return timeRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTimeRemaining() {
        return timeRemaining;
    }


    /**
     * Sets the timeRemaining value for this JobSearchBasic.
     * 
     * @param timeRemaining
     */
    public void setTimeRemaining(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField timeRemaining) {
        this.timeRemaining = timeRemaining;
    }


    /**
     * Gets the type value for this JobSearchBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this JobSearchBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the usePercentCompleteOverride value for this JobSearchBasic.
     * 
     * @return usePercentCompleteOverride
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUsePercentCompleteOverride() {
        return usePercentCompleteOverride;
    }


    /**
     * Sets the usePercentCompleteOverride value for this JobSearchBasic.
     * 
     * @param usePercentCompleteOverride
     */
    public void setUsePercentCompleteOverride(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField usePercentCompleteOverride) {
        this.usePercentCompleteOverride = usePercentCompleteOverride;
    }


    /**
     * Gets the zipCode value for this JobSearchBasic.
     * 
     * @return zipCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this JobSearchBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the customFieldList value for this JobSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this JobSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobSearchBasic)) return false;
        JobSearchBasic other = (JobSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.actualTime==null && other.getActualTime()==null) || 
             (this.actualTime!=null &&
              this.actualTime.equals(other.getActualTime()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              this.addressee.equals(other.getAddressee()))) &&
            ((this.addressLabel==null && other.getAddressLabel()==null) || 
             (this.addressLabel!=null &&
              this.addressLabel.equals(other.getAddressLabel()))) &&
            ((this.addressPhone==null && other.getAddressPhone()==null) || 
             (this.addressPhone!=null &&
              this.addressPhone.equals(other.getAddressPhone()))) &&
            ((this.allocatePayrollExpenses==null && other.getAllocatePayrollExpenses()==null) || 
             (this.allocatePayrollExpenses!=null &&
              this.allocatePayrollExpenses.equals(other.getAllocatePayrollExpenses()))) &&
            ((this.allowAllResourcesForTasks==null && other.getAllowAllResourcesForTasks()==null) || 
             (this.allowAllResourcesForTasks!=null &&
              this.allowAllResourcesForTasks.equals(other.getAllowAllResourcesForTasks()))) &&
            ((this.allowExpenses==null && other.getAllowExpenses()==null) || 
             (this.allowExpenses!=null &&
              this.allowExpenses.equals(other.getAllowExpenses()))) &&
            ((this.allowTime==null && other.getAllowTime()==null) || 
             (this.allowTime!=null &&
              this.allowTime.equals(other.getAllowTime()))) &&
            ((this.applyProjectExpenseTypeToAll==null && other.getApplyProjectExpenseTypeToAll()==null) || 
             (this.applyProjectExpenseTypeToAll!=null &&
              this.applyProjectExpenseTypeToAll.equals(other.getApplyProjectExpenseTypeToAll()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.calculatedEndDate==null && other.getCalculatedEndDate()==null) || 
             (this.calculatedEndDate!=null &&
              this.calculatedEndDate.equals(other.getCalculatedEndDate()))) &&
            ((this.calculatedEndDateBaseline==null && other.getCalculatedEndDateBaseline()==null) || 
             (this.calculatedEndDateBaseline!=null &&
              this.calculatedEndDateBaseline.equals(other.getCalculatedEndDateBaseline()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.defaultTaxReg==null && other.getDefaultTaxReg()==null) || 
             (this.defaultTaxReg!=null &&
              this.defaultTaxReg.equals(other.getDefaultTaxReg()))) &&
            ((this.defaultTaxRegText==null && other.getDefaultTaxRegText()==null) || 
             (this.defaultTaxRegText!=null &&
              this.defaultTaxRegText.equals(other.getDefaultTaxRegText()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.estCost==null && other.getEstCost()==null) || 
             (this.estCost!=null &&
              this.estCost.equals(other.getEstCost()))) &&
            ((this.estEndDate==null && other.getEstEndDate()==null) || 
             (this.estEndDate!=null &&
              this.estEndDate.equals(other.getEstEndDate()))) &&
            ((this.estimatedGrossProfit==null && other.getEstimatedGrossProfit()==null) || 
             (this.estimatedGrossProfit!=null &&
              this.estimatedGrossProfit.equals(other.getEstimatedGrossProfit()))) &&
            ((this.estimatedGrossProfitPercent==null && other.getEstimatedGrossProfitPercent()==null) || 
             (this.estimatedGrossProfitPercent!=null &&
              this.estimatedGrossProfitPercent.equals(other.getEstimatedGrossProfitPercent()))) &&
            ((this.estimatedLaborCost==null && other.getEstimatedLaborCost()==null) || 
             (this.estimatedLaborCost!=null &&
              this.estimatedLaborCost.equals(other.getEstimatedLaborCost()))) &&
            ((this.estimatedLaborCostBaseline==null && other.getEstimatedLaborCostBaseline()==null) || 
             (this.estimatedLaborCostBaseline!=null &&
              this.estimatedLaborCostBaseline.equals(other.getEstimatedLaborCostBaseline()))) &&
            ((this.estimatedLaborRevenue==null && other.getEstimatedLaborRevenue()==null) || 
             (this.estimatedLaborRevenue!=null &&
              this.estimatedLaborRevenue.equals(other.getEstimatedLaborRevenue()))) &&
            ((this.estimatedTime==null && other.getEstimatedTime()==null) || 
             (this.estimatedTime!=null &&
              this.estimatedTime.equals(other.getEstimatedTime()))) &&
            ((this.estimatedTimeOverride==null && other.getEstimatedTimeOverride()==null) || 
             (this.estimatedTimeOverride!=null &&
              this.estimatedTimeOverride.equals(other.getEstimatedTimeOverride()))) &&
            ((this.estimatedTimeOverrideBaseline==null && other.getEstimatedTimeOverrideBaseline()==null) || 
             (this.estimatedTimeOverrideBaseline!=null &&
              this.estimatedTimeOverrideBaseline.equals(other.getEstimatedTimeOverrideBaseline()))) &&
            ((this.estRevenue==null && other.getEstRevenue()==null) || 
             (this.estRevenue!=null &&
              this.estRevenue.equals(other.getEstRevenue()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.includeCrmTasksInTotals==null && other.getIncludeCrmTasksInTotals()==null) || 
             (this.includeCrmTasksInTotals!=null &&
              this.includeCrmTasksInTotals.equals(other.getIncludeCrmTasksInTotals()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isDefaultBilling==null && other.getIsDefaultBilling()==null) || 
             (this.isDefaultBilling!=null &&
              this.isDefaultBilling.equals(other.getIsDefaultBilling()))) &&
            ((this.isDefaultShipping==null && other.getIsDefaultShipping()==null) || 
             (this.isDefaultShipping!=null &&
              this.isDefaultShipping.equals(other.getIsDefaultShipping()))) &&
            ((this.isExemptTime==null && other.getIsExemptTime()==null) || 
             (this.isExemptTime!=null &&
              this.isExemptTime.equals(other.getIsExemptTime()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isProductiveTime==null && other.getIsProductiveTime()==null) || 
             (this.isProductiveTime!=null &&
              this.isProductiveTime.equals(other.getIsProductiveTime()))) &&
            ((this.isUtilizedTime==null && other.getIsUtilizedTime()==null) || 
             (this.isUtilizedTime!=null &&
              this.isUtilizedTime.equals(other.getIsUtilizedTime()))) &&
            ((this.jobBillingType==null && other.getJobBillingType()==null) || 
             (this.jobBillingType!=null &&
              this.jobBillingType.equals(other.getJobBillingType()))) &&
            ((this.jobItem==null && other.getJobItem()==null) || 
             (this.jobItem!=null &&
              this.jobItem.equals(other.getJobItem()))) &&
            ((this.jobPrice==null && other.getJobPrice()==null) || 
             (this.jobPrice!=null &&
              this.jobPrice.equals(other.getJobPrice()))) &&
            ((this.jobResource==null && other.getJobResource()==null) || 
             (this.jobResource!=null &&
              this.jobResource.equals(other.getJobResource()))) &&
            ((this.jobResourceRole==null && other.getJobResourceRole()==null) || 
             (this.jobResourceRole!=null &&
              this.jobResourceRole.equals(other.getJobResourceRole()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastBaselineDate==null && other.getLastBaselineDate()==null) || 
             (this.lastBaselineDate!=null &&
              this.lastBaselineDate.equals(other.getLastBaselineDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.limitTimeToAssignees==null && other.getLimitTimeToAssignees()==null) || 
             (this.limitTimeToAssignees!=null &&
              this.limitTimeToAssignees.equals(other.getLimitTimeToAssignees()))) &&
            ((this.materializeTime==null && other.getMaterializeTime()==null) || 
             (this.materializeTime!=null &&
              this.materializeTime.equals(other.getMaterializeTime()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.pctComplete==null && other.getPctComplete()==null) || 
             (this.pctComplete!=null &&
              this.pctComplete.equals(other.getPctComplete()))) &&
            ((this.percentTimeComplete==null && other.getPercentTimeComplete()==null) || 
             (this.percentTimeComplete!=null &&
              this.percentTimeComplete.equals(other.getPercentTimeComplete()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              this.permission.equals(other.getPermission()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.projectedEndDateBaseline==null && other.getProjectedEndDateBaseline()==null) || 
             (this.projectedEndDateBaseline!=null &&
              this.projectedEndDateBaseline.equals(other.getProjectedEndDateBaseline()))) &&
            ((this.projectExpenseType==null && other.getProjectExpenseType()==null) || 
             (this.projectExpenseType!=null &&
              this.projectExpenseType.equals(other.getProjectExpenseType()))) &&
            ((this.revRecForecastRule==null && other.getRevRecForecastRule()==null) || 
             (this.revRecForecastRule!=null &&
              this.revRecForecastRule.equals(other.getRevRecForecastRule()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              this.startDateBaseline.equals(other.getStartDateBaseline()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.timeRemaining==null && other.getTimeRemaining()==null) || 
             (this.timeRemaining!=null &&
              this.timeRemaining.equals(other.getTimeRemaining()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.usePercentCompleteOverride==null && other.getUsePercentCompleteOverride()==null) || 
             (this.usePercentCompleteOverride!=null &&
              this.usePercentCompleteOverride.equals(other.getUsePercentCompleteOverride()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getActualTime() != null) {
            _hashCode += getActualTime().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAddressee() != null) {
            _hashCode += getAddressee().hashCode();
        }
        if (getAddressLabel() != null) {
            _hashCode += getAddressLabel().hashCode();
        }
        if (getAddressPhone() != null) {
            _hashCode += getAddressPhone().hashCode();
        }
        if (getAllocatePayrollExpenses() != null) {
            _hashCode += getAllocatePayrollExpenses().hashCode();
        }
        if (getAllowAllResourcesForTasks() != null) {
            _hashCode += getAllowAllResourcesForTasks().hashCode();
        }
        if (getAllowExpenses() != null) {
            _hashCode += getAllowExpenses().hashCode();
        }
        if (getAllowTime() != null) {
            _hashCode += getAllowTime().hashCode();
        }
        if (getApplyProjectExpenseTypeToAll() != null) {
            _hashCode += getApplyProjectExpenseTypeToAll().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getCalculatedEndDate() != null) {
            _hashCode += getCalculatedEndDate().hashCode();
        }
        if (getCalculatedEndDateBaseline() != null) {
            _hashCode += getCalculatedEndDateBaseline().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDefaultTaxReg() != null) {
            _hashCode += getDefaultTaxReg().hashCode();
        }
        if (getDefaultTaxRegText() != null) {
            _hashCode += getDefaultTaxRegText().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getEstCost() != null) {
            _hashCode += getEstCost().hashCode();
        }
        if (getEstEndDate() != null) {
            _hashCode += getEstEndDate().hashCode();
        }
        if (getEstimatedGrossProfit() != null) {
            _hashCode += getEstimatedGrossProfit().hashCode();
        }
        if (getEstimatedGrossProfitPercent() != null) {
            _hashCode += getEstimatedGrossProfitPercent().hashCode();
        }
        if (getEstimatedLaborCost() != null) {
            _hashCode += getEstimatedLaborCost().hashCode();
        }
        if (getEstimatedLaborCostBaseline() != null) {
            _hashCode += getEstimatedLaborCostBaseline().hashCode();
        }
        if (getEstimatedLaborRevenue() != null) {
            _hashCode += getEstimatedLaborRevenue().hashCode();
        }
        if (getEstimatedTime() != null) {
            _hashCode += getEstimatedTime().hashCode();
        }
        if (getEstimatedTimeOverride() != null) {
            _hashCode += getEstimatedTimeOverride().hashCode();
        }
        if (getEstimatedTimeOverrideBaseline() != null) {
            _hashCode += getEstimatedTimeOverrideBaseline().hashCode();
        }
        if (getEstRevenue() != null) {
            _hashCode += getEstRevenue().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getIncludeCrmTasksInTotals() != null) {
            _hashCode += getIncludeCrmTasksInTotals().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsDefaultBilling() != null) {
            _hashCode += getIsDefaultBilling().hashCode();
        }
        if (getIsDefaultShipping() != null) {
            _hashCode += getIsDefaultShipping().hashCode();
        }
        if (getIsExemptTime() != null) {
            _hashCode += getIsExemptTime().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsProductiveTime() != null) {
            _hashCode += getIsProductiveTime().hashCode();
        }
        if (getIsUtilizedTime() != null) {
            _hashCode += getIsUtilizedTime().hashCode();
        }
        if (getJobBillingType() != null) {
            _hashCode += getJobBillingType().hashCode();
        }
        if (getJobItem() != null) {
            _hashCode += getJobItem().hashCode();
        }
        if (getJobPrice() != null) {
            _hashCode += getJobPrice().hashCode();
        }
        if (getJobResource() != null) {
            _hashCode += getJobResource().hashCode();
        }
        if (getJobResourceRole() != null) {
            _hashCode += getJobResourceRole().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLastBaselineDate() != null) {
            _hashCode += getLastBaselineDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getLimitTimeToAssignees() != null) {
            _hashCode += getLimitTimeToAssignees().hashCode();
        }
        if (getMaterializeTime() != null) {
            _hashCode += getMaterializeTime().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPctComplete() != null) {
            _hashCode += getPctComplete().hashCode();
        }
        if (getPercentTimeComplete() != null) {
            _hashCode += getPercentTimeComplete().hashCode();
        }
        if (getPermission() != null) {
            _hashCode += getPermission().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
        }
        if (getProjectedEndDateBaseline() != null) {
            _hashCode += getProjectedEndDateBaseline().hashCode();
        }
        if (getProjectExpenseType() != null) {
            _hashCode += getProjectExpenseType().hashCode();
        }
        if (getRevRecForecastRule() != null) {
            _hashCode += getRevRecForecastRule().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartDateBaseline() != null) {
            _hashCode += getStartDateBaseline().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTimeRemaining() != null) {
            _hashCode += getTimeRemaining().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUsePercentCompleteOverride() != null) {
            _hashCode += getUsePercentCompleteOverride().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocatePayrollExpenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allocatePayrollExpenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAllResourcesForTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allowAllResourcesForTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowExpenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allowExpenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allowTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyProjectExpenseTypeToAll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyProjectExpenseTypeToAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "calculatedEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedEndDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "calculatedEndDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
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
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTaxRegText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultTaxRegText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedLaborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborCostBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedLaborCostBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedLaborRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverrideBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedTimeOverrideBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCrmTasksInTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "includeCrmTasksInTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDefaultShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExemptTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isExemptTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProductiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isProductiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUtilizedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isUtilizedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobBillingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jobBillingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jobItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jobPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jobResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobResourceRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jobResourceRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBaselineDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastBaselineDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitTimeToAssignees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "limitTimeToAssignees"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materializeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "materializeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pctComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedEndDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectedEndDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectExpenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectExpenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePercentCompleteOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "usePercentCompleteOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
