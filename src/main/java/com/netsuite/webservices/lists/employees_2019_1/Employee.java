/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class Employee  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef template;

    private java.lang.String entityId;

    private java.lang.String salutation;

    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String lastName;

    private java.lang.String altName;

    private java.lang.String phone;

    private java.lang.String fax;

    private java.lang.String email;

    private java.lang.String defaultAddress;

    private java.lang.Boolean isInactive;

    private java.lang.String phoneticName;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar dateCreated;

    private java.lang.String initials;

    private java.lang.String officePhone;

    private java.lang.String homePhone;

    private java.lang.String mobilePhone;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingClass;

    private java.lang.String accountNumber;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeeCompensationCurrency compensationCurrency;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeeBaseWageType baseWageType;

    private java.lang.Double baseWage;

    private java.lang.String comments;

    private com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef image;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeePayFrequency payFrequency;

    private java.util.Calendar lastPaidDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeeUseTimeData useTimeData;

    private java.lang.Boolean usePerquest;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef workplace;

    private java.lang.String adpId;

    private java.lang.Boolean directDeposit;

    private java.lang.Double expenseLimit;

    private java.lang.Double purchaseOrderLimit;

    private java.lang.Double purchaseOrderApprovalLimit;

    private java.lang.String socialSecurityNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef supervisor;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef approver;

    private java.lang.Double approvalLimit;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef timeApprover;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef employeeType;

    private java.lang.Boolean isSalesRep;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesRole;

    private java.lang.Boolean isSupportRep;

    private java.lang.Boolean isJobResource;

    private java.lang.Double laborCost;

    private java.util.Calendar birthDate;

    private java.util.Calendar hireDate;

    private java.util.Calendar releaseDate;

    private java.lang.String terminationDetails;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef terminationReason;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeeTerminationRegretted terminationRegretted;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeeTerminationCategory terminationCategory;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef timeOffPlan;

    private java.util.Calendar lastReviewDate;

    private java.util.Calendar nextReviewDate;

    private java.lang.String title;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef employeeStatus;

    private java.lang.String jobDescription;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeeWorkAssignment workAssignment;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef job;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef maritalStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef ethnicity;

    private com.netsuite.webservices.lists.employees_2019_1.types.Gender gender;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseOrderApprover;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef workCalendar;

    private java.lang.Boolean giveAccess;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultExpenseReportCurrency;

    private java.lang.Boolean concurrentWebServicesUser;

    private java.lang.Boolean sendEmail;

    private java.lang.Boolean hasOfflineAccess;

    private java.lang.String password;

    private java.lang.String password2;

    private java.lang.Boolean requirePwdChange;

    private java.lang.Boolean inheritIPRules;

    private java.lang.String IPAddressRule;

    private java.util.Calendar startDateTimeOffCalc;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeeCommissionPaymentPreference commissionPaymentPreference;

    private java.lang.Boolean billPay;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultAcctCorpCardExp;

    private java.lang.Boolean eligibleForCommission;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeSubscriptionsList subscriptionsList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeRatesList ratesList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbookList addressbookList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeRolesList rolesList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeHrEducationList hrEducationList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTimeList accruedTimeList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeDirectDepositList directDepositList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeCurrencyList currencyList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeCompanyContributionList companyContributionList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeEarningList earningList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeEmergencyContactList emergencyContactList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeHcmPositionList hcmPositionList;

    private com.netsuite.webservices.lists.employees_2019_1.EmployeeDeductionList deductionList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Employee() {
    }

    public Employee(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef template,
           java.lang.String entityId,
           java.lang.String salutation,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String lastName,
           java.lang.String altName,
           java.lang.String phone,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String defaultAddress,
           java.lang.Boolean isInactive,
           java.lang.String phoneticName,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar dateCreated,
           java.lang.String initials,
           java.lang.String officePhone,
           java.lang.String homePhone,
           java.lang.String mobilePhone,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingClass,
           java.lang.String accountNumber,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeeCompensationCurrency compensationCurrency,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeeBaseWageType baseWageType,
           java.lang.Double baseWage,
           java.lang.String comments,
           com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef image,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeePayFrequency payFrequency,
           java.util.Calendar lastPaidDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeeUseTimeData useTimeData,
           java.lang.Boolean usePerquest,
           com.netsuite.webservices.platform.core_2019_1.RecordRef workplace,
           java.lang.String adpId,
           java.lang.Boolean directDeposit,
           java.lang.Double expenseLimit,
           java.lang.Double purchaseOrderLimit,
           java.lang.Double purchaseOrderApprovalLimit,
           java.lang.String socialSecurityNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef supervisor,
           com.netsuite.webservices.platform.core_2019_1.RecordRef approver,
           java.lang.Double approvalLimit,
           com.netsuite.webservices.platform.core_2019_1.RecordRef timeApprover,
           com.netsuite.webservices.platform.core_2019_1.RecordRef employeeType,
           java.lang.Boolean isSalesRep,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesRole,
           java.lang.Boolean isSupportRep,
           java.lang.Boolean isJobResource,
           java.lang.Double laborCost,
           java.util.Calendar birthDate,
           java.util.Calendar hireDate,
           java.util.Calendar releaseDate,
           java.lang.String terminationDetails,
           com.netsuite.webservices.platform.core_2019_1.RecordRef terminationReason,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeeTerminationRegretted terminationRegretted,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeeTerminationCategory terminationCategory,
           com.netsuite.webservices.platform.core_2019_1.RecordRef timeOffPlan,
           java.util.Calendar lastReviewDate,
           java.util.Calendar nextReviewDate,
           java.lang.String title,
           com.netsuite.webservices.platform.core_2019_1.RecordRef employeeStatus,
           java.lang.String jobDescription,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeeWorkAssignment workAssignment,
           com.netsuite.webservices.platform.core_2019_1.RecordRef job,
           com.netsuite.webservices.platform.core_2019_1.RecordRef maritalStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef ethnicity,
           com.netsuite.webservices.lists.employees_2019_1.types.Gender gender,
           com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseOrderApprover,
           com.netsuite.webservices.platform.core_2019_1.RecordRef workCalendar,
           java.lang.Boolean giveAccess,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultExpenseReportCurrency,
           java.lang.Boolean concurrentWebServicesUser,
           java.lang.Boolean sendEmail,
           java.lang.Boolean hasOfflineAccess,
           java.lang.String password,
           java.lang.String password2,
           java.lang.Boolean requirePwdChange,
           java.lang.Boolean inheritIPRules,
           java.lang.String IPAddressRule,
           java.util.Calendar startDateTimeOffCalc,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeeCommissionPaymentPreference commissionPaymentPreference,
           java.lang.Boolean billPay,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultAcctCorpCardExp,
           java.lang.Boolean eligibleForCommission,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeSubscriptionsList subscriptionsList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeRatesList ratesList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbookList addressbookList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeRolesList rolesList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeHrEducationList hrEducationList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTimeList accruedTimeList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeDirectDepositList directDepositList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeCurrencyList currencyList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeCompanyContributionList companyContributionList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeEarningList earningList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeEmergencyContactList emergencyContactList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeHcmPositionList hcmPositionList,
           com.netsuite.webservices.lists.employees_2019_1.EmployeeDeductionList deductionList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.template = template;
        this.entityId = entityId;
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.altName = altName;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.defaultAddress = defaultAddress;
        this.isInactive = isInactive;
        this.phoneticName = phoneticName;
        this.lastModifiedDate = lastModifiedDate;
        this.dateCreated = dateCreated;
        this.initials = initials;
        this.officePhone = officePhone;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiary = subsidiary;
        this.billingClass = billingClass;
        this.accountNumber = accountNumber;
        this.compensationCurrency = compensationCurrency;
        this.baseWageType = baseWageType;
        this.baseWage = baseWage;
        this.comments = comments;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.image = image;
        this.payFrequency = payFrequency;
        this.lastPaidDate = lastPaidDate;
        this.currency = currency;
        this.useTimeData = useTimeData;
        this.usePerquest = usePerquest;
        this.workplace = workplace;
        this.adpId = adpId;
        this.directDeposit = directDeposit;
        this.expenseLimit = expenseLimit;
        this.purchaseOrderLimit = purchaseOrderLimit;
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
        this.socialSecurityNumber = socialSecurityNumber;
        this.supervisor = supervisor;
        this.approver = approver;
        this.approvalLimit = approvalLimit;
        this.timeApprover = timeApprover;
        this.employeeType = employeeType;
        this.isSalesRep = isSalesRep;
        this.salesRole = salesRole;
        this.isSupportRep = isSupportRep;
        this.isJobResource = isJobResource;
        this.laborCost = laborCost;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.releaseDate = releaseDate;
        this.terminationDetails = terminationDetails;
        this.terminationReason = terminationReason;
        this.terminationRegretted = terminationRegretted;
        this.terminationCategory = terminationCategory;
        this.timeOffPlan = timeOffPlan;
        this.lastReviewDate = lastReviewDate;
        this.nextReviewDate = nextReviewDate;
        this.title = title;
        this.employeeStatus = employeeStatus;
        this.jobDescription = jobDescription;
        this.workAssignment = workAssignment;
        this.job = job;
        this.maritalStatus = maritalStatus;
        this.ethnicity = ethnicity;
        this.gender = gender;
        this.purchaseOrderApprover = purchaseOrderApprover;
        this.workCalendar = workCalendar;
        this.giveAccess = giveAccess;
        this.defaultExpenseReportCurrency = defaultExpenseReportCurrency;
        this.concurrentWebServicesUser = concurrentWebServicesUser;
        this.sendEmail = sendEmail;
        this.hasOfflineAccess = hasOfflineAccess;
        this.password = password;
        this.password2 = password2;
        this.requirePwdChange = requirePwdChange;
        this.inheritIPRules = inheritIPRules;
        this.IPAddressRule = IPAddressRule;
        this.startDateTimeOffCalc = startDateTimeOffCalc;
        this.commissionPaymentPreference = commissionPaymentPreference;
        this.billPay = billPay;
        this.defaultAcctCorpCardExp = defaultAcctCorpCardExp;
        this.eligibleForCommission = eligibleForCommission;
        this.subscriptionsList = subscriptionsList;
        this.ratesList = ratesList;
        this.addressbookList = addressbookList;
        this.rolesList = rolesList;
        this.hrEducationList = hrEducationList;
        this.accruedTimeList = accruedTimeList;
        this.directDepositList = directDepositList;
        this.currencyList = currencyList;
        this.companyContributionList = companyContributionList;
        this.earningList = earningList;
        this.emergencyContactList = emergencyContactList;
        this.hcmPositionList = hcmPositionList;
        this.deductionList = deductionList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Employee.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Employee.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the template value for this Employee.
     * 
     * @return template
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this Employee.
     * 
     * @param template
     */
    public void setTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef template) {
        this.template = template;
    }


    /**
     * Gets the entityId value for this Employee.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this Employee.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the salutation value for this Employee.
     * 
     * @return salutation
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this Employee.
     * 
     * @param salutation
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the firstName value for this Employee.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Employee.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this Employee.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this Employee.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the lastName value for this Employee.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Employee.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the altName value for this Employee.
     * 
     * @return altName
     */
    public java.lang.String getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this Employee.
     * 
     * @param altName
     */
    public void setAltName(java.lang.String altName) {
        this.altName = altName;
    }


    /**
     * Gets the phone value for this Employee.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Employee.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this Employee.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Employee.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Employee.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Employee.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the defaultAddress value for this Employee.
     * 
     * @return defaultAddress
     */
    public java.lang.String getDefaultAddress() {
        return defaultAddress;
    }


    /**
     * Sets the defaultAddress value for this Employee.
     * 
     * @param defaultAddress
     */
    public void setDefaultAddress(java.lang.String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }


    /**
     * Gets the isInactive value for this Employee.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Employee.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the phoneticName value for this Employee.
     * 
     * @return phoneticName
     */
    public java.lang.String getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this Employee.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(java.lang.String phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the lastModifiedDate value for this Employee.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Employee.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the dateCreated value for this Employee.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Employee.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the initials value for this Employee.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this Employee.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the officePhone value for this Employee.
     * 
     * @return officePhone
     */
    public java.lang.String getOfficePhone() {
        return officePhone;
    }


    /**
     * Sets the officePhone value for this Employee.
     * 
     * @param officePhone
     */
    public void setOfficePhone(java.lang.String officePhone) {
        this.officePhone = officePhone;
    }


    /**
     * Gets the homePhone value for this Employee.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this Employee.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the mobilePhone value for this Employee.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this Employee.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the department value for this Employee.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Employee.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this Employee.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Employee.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this Employee.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Employee.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this Employee.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Employee.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the billingClass value for this Employee.
     * 
     * @return billingClass
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingClass() {
        return billingClass;
    }


    /**
     * Sets the billingClass value for this Employee.
     * 
     * @param billingClass
     */
    public void setBillingClass(com.netsuite.webservices.platform.core_2019_1.RecordRef billingClass) {
        this.billingClass = billingClass;
    }


    /**
     * Gets the accountNumber value for this Employee.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Employee.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the compensationCurrency value for this Employee.
     * 
     * @return compensationCurrency
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeeCompensationCurrency getCompensationCurrency() {
        return compensationCurrency;
    }


    /**
     * Sets the compensationCurrency value for this Employee.
     * 
     * @param compensationCurrency
     */
    public void setCompensationCurrency(com.netsuite.webservices.lists.employees_2019_1.types.EmployeeCompensationCurrency compensationCurrency) {
        this.compensationCurrency = compensationCurrency;
    }


    /**
     * Gets the baseWageType value for this Employee.
     * 
     * @return baseWageType
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeeBaseWageType getBaseWageType() {
        return baseWageType;
    }


    /**
     * Sets the baseWageType value for this Employee.
     * 
     * @param baseWageType
     */
    public void setBaseWageType(com.netsuite.webservices.lists.employees_2019_1.types.EmployeeBaseWageType baseWageType) {
        this.baseWageType = baseWageType;
    }


    /**
     * Gets the baseWage value for this Employee.
     * 
     * @return baseWage
     */
    public java.lang.Double getBaseWage() {
        return baseWage;
    }


    /**
     * Sets the baseWage value for this Employee.
     * 
     * @param baseWage
     */
    public void setBaseWage(java.lang.Double baseWage) {
        this.baseWage = baseWage;
    }


    /**
     * Gets the comments value for this Employee.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Employee.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the globalSubscriptionStatus value for this Employee.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this Employee.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the image value for this Employee.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getImage() {
        return image;
    }


    /**
     * Sets the image value for this Employee.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2019_1.RecordRef image) {
        this.image = image;
    }


    /**
     * Gets the payFrequency value for this Employee.
     * 
     * @return payFrequency
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeePayFrequency getPayFrequency() {
        return payFrequency;
    }


    /**
     * Sets the payFrequency value for this Employee.
     * 
     * @param payFrequency
     */
    public void setPayFrequency(com.netsuite.webservices.lists.employees_2019_1.types.EmployeePayFrequency payFrequency) {
        this.payFrequency = payFrequency;
    }


    /**
     * Gets the lastPaidDate value for this Employee.
     * 
     * @return lastPaidDate
     */
    public java.util.Calendar getLastPaidDate() {
        return lastPaidDate;
    }


    /**
     * Sets the lastPaidDate value for this Employee.
     * 
     * @param lastPaidDate
     */
    public void setLastPaidDate(java.util.Calendar lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }


    /**
     * Gets the currency value for this Employee.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Employee.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the useTimeData value for this Employee.
     * 
     * @return useTimeData
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeeUseTimeData getUseTimeData() {
        return useTimeData;
    }


    /**
     * Sets the useTimeData value for this Employee.
     * 
     * @param useTimeData
     */
    public void setUseTimeData(com.netsuite.webservices.lists.employees_2019_1.types.EmployeeUseTimeData useTimeData) {
        this.useTimeData = useTimeData;
    }


    /**
     * Gets the usePerquest value for this Employee.
     * 
     * @return usePerquest
     */
    public java.lang.Boolean getUsePerquest() {
        return usePerquest;
    }


    /**
     * Sets the usePerquest value for this Employee.
     * 
     * @param usePerquest
     */
    public void setUsePerquest(java.lang.Boolean usePerquest) {
        this.usePerquest = usePerquest;
    }


    /**
     * Gets the workplace value for this Employee.
     * 
     * @return workplace
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getWorkplace() {
        return workplace;
    }


    /**
     * Sets the workplace value for this Employee.
     * 
     * @param workplace
     */
    public void setWorkplace(com.netsuite.webservices.platform.core_2019_1.RecordRef workplace) {
        this.workplace = workplace;
    }


    /**
     * Gets the adpId value for this Employee.
     * 
     * @return adpId
     */
    public java.lang.String getAdpId() {
        return adpId;
    }


    /**
     * Sets the adpId value for this Employee.
     * 
     * @param adpId
     */
    public void setAdpId(java.lang.String adpId) {
        this.adpId = adpId;
    }


    /**
     * Gets the directDeposit value for this Employee.
     * 
     * @return directDeposit
     */
    public java.lang.Boolean getDirectDeposit() {
        return directDeposit;
    }


    /**
     * Sets the directDeposit value for this Employee.
     * 
     * @param directDeposit
     */
    public void setDirectDeposit(java.lang.Boolean directDeposit) {
        this.directDeposit = directDeposit;
    }


    /**
     * Gets the expenseLimit value for this Employee.
     * 
     * @return expenseLimit
     */
    public java.lang.Double getExpenseLimit() {
        return expenseLimit;
    }


    /**
     * Sets the expenseLimit value for this Employee.
     * 
     * @param expenseLimit
     */
    public void setExpenseLimit(java.lang.Double expenseLimit) {
        this.expenseLimit = expenseLimit;
    }


    /**
     * Gets the purchaseOrderLimit value for this Employee.
     * 
     * @return purchaseOrderLimit
     */
    public java.lang.Double getPurchaseOrderLimit() {
        return purchaseOrderLimit;
    }


    /**
     * Sets the purchaseOrderLimit value for this Employee.
     * 
     * @param purchaseOrderLimit
     */
    public void setPurchaseOrderLimit(java.lang.Double purchaseOrderLimit) {
        this.purchaseOrderLimit = purchaseOrderLimit;
    }


    /**
     * Gets the purchaseOrderApprovalLimit value for this Employee.
     * 
     * @return purchaseOrderApprovalLimit
     */
    public java.lang.Double getPurchaseOrderApprovalLimit() {
        return purchaseOrderApprovalLimit;
    }


    /**
     * Sets the purchaseOrderApprovalLimit value for this Employee.
     * 
     * @param purchaseOrderApprovalLimit
     */
    public void setPurchaseOrderApprovalLimit(java.lang.Double purchaseOrderApprovalLimit) {
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
    }


    /**
     * Gets the socialSecurityNumber value for this Employee.
     * 
     * @return socialSecurityNumber
     */
    public java.lang.String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this Employee.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(java.lang.String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the supervisor value for this Employee.
     * 
     * @return supervisor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSupervisor() {
        return supervisor;
    }


    /**
     * Sets the supervisor value for this Employee.
     * 
     * @param supervisor
     */
    public void setSupervisor(com.netsuite.webservices.platform.core_2019_1.RecordRef supervisor) {
        this.supervisor = supervisor;
    }


    /**
     * Gets the approver value for this Employee.
     * 
     * @return approver
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getApprover() {
        return approver;
    }


    /**
     * Sets the approver value for this Employee.
     * 
     * @param approver
     */
    public void setApprover(com.netsuite.webservices.platform.core_2019_1.RecordRef approver) {
        this.approver = approver;
    }


    /**
     * Gets the approvalLimit value for this Employee.
     * 
     * @return approvalLimit
     */
    public java.lang.Double getApprovalLimit() {
        return approvalLimit;
    }


    /**
     * Sets the approvalLimit value for this Employee.
     * 
     * @param approvalLimit
     */
    public void setApprovalLimit(java.lang.Double approvalLimit) {
        this.approvalLimit = approvalLimit;
    }


    /**
     * Gets the timeApprover value for this Employee.
     * 
     * @return timeApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTimeApprover() {
        return timeApprover;
    }


    /**
     * Sets the timeApprover value for this Employee.
     * 
     * @param timeApprover
     */
    public void setTimeApprover(com.netsuite.webservices.platform.core_2019_1.RecordRef timeApprover) {
        this.timeApprover = timeApprover;
    }


    /**
     * Gets the employeeType value for this Employee.
     * 
     * @return employeeType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEmployeeType() {
        return employeeType;
    }


    /**
     * Sets the employeeType value for this Employee.
     * 
     * @param employeeType
     */
    public void setEmployeeType(com.netsuite.webservices.platform.core_2019_1.RecordRef employeeType) {
        this.employeeType = employeeType;
    }


    /**
     * Gets the isSalesRep value for this Employee.
     * 
     * @return isSalesRep
     */
    public java.lang.Boolean getIsSalesRep() {
        return isSalesRep;
    }


    /**
     * Sets the isSalesRep value for this Employee.
     * 
     * @param isSalesRep
     */
    public void setIsSalesRep(java.lang.Boolean isSalesRep) {
        this.isSalesRep = isSalesRep;
    }


    /**
     * Gets the salesRole value for this Employee.
     * 
     * @return salesRole
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesRole() {
        return salesRole;
    }


    /**
     * Sets the salesRole value for this Employee.
     * 
     * @param salesRole
     */
    public void setSalesRole(com.netsuite.webservices.platform.core_2019_1.RecordRef salesRole) {
        this.salesRole = salesRole;
    }


    /**
     * Gets the isSupportRep value for this Employee.
     * 
     * @return isSupportRep
     */
    public java.lang.Boolean getIsSupportRep() {
        return isSupportRep;
    }


    /**
     * Sets the isSupportRep value for this Employee.
     * 
     * @param isSupportRep
     */
    public void setIsSupportRep(java.lang.Boolean isSupportRep) {
        this.isSupportRep = isSupportRep;
    }


    /**
     * Gets the isJobResource value for this Employee.
     * 
     * @return isJobResource
     */
    public java.lang.Boolean getIsJobResource() {
        return isJobResource;
    }


    /**
     * Sets the isJobResource value for this Employee.
     * 
     * @param isJobResource
     */
    public void setIsJobResource(java.lang.Boolean isJobResource) {
        this.isJobResource = isJobResource;
    }


    /**
     * Gets the laborCost value for this Employee.
     * 
     * @return laborCost
     */
    public java.lang.Double getLaborCost() {
        return laborCost;
    }


    /**
     * Sets the laborCost value for this Employee.
     * 
     * @param laborCost
     */
    public void setLaborCost(java.lang.Double laborCost) {
        this.laborCost = laborCost;
    }


    /**
     * Gets the birthDate value for this Employee.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this Employee.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the hireDate value for this Employee.
     * 
     * @return hireDate
     */
    public java.util.Calendar getHireDate() {
        return hireDate;
    }


    /**
     * Sets the hireDate value for this Employee.
     * 
     * @param hireDate
     */
    public void setHireDate(java.util.Calendar hireDate) {
        this.hireDate = hireDate;
    }


    /**
     * Gets the releaseDate value for this Employee.
     * 
     * @return releaseDate
     */
    public java.util.Calendar getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this Employee.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(java.util.Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the terminationDetails value for this Employee.
     * 
     * @return terminationDetails
     */
    public java.lang.String getTerminationDetails() {
        return terminationDetails;
    }


    /**
     * Sets the terminationDetails value for this Employee.
     * 
     * @param terminationDetails
     */
    public void setTerminationDetails(java.lang.String terminationDetails) {
        this.terminationDetails = terminationDetails;
    }


    /**
     * Gets the terminationReason value for this Employee.
     * 
     * @return terminationReason
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTerminationReason() {
        return terminationReason;
    }


    /**
     * Sets the terminationReason value for this Employee.
     * 
     * @param terminationReason
     */
    public void setTerminationReason(com.netsuite.webservices.platform.core_2019_1.RecordRef terminationReason) {
        this.terminationReason = terminationReason;
    }


    /**
     * Gets the terminationRegretted value for this Employee.
     * 
     * @return terminationRegretted
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeeTerminationRegretted getTerminationRegretted() {
        return terminationRegretted;
    }


    /**
     * Sets the terminationRegretted value for this Employee.
     * 
     * @param terminationRegretted
     */
    public void setTerminationRegretted(com.netsuite.webservices.lists.employees_2019_1.types.EmployeeTerminationRegretted terminationRegretted) {
        this.terminationRegretted = terminationRegretted;
    }


    /**
     * Gets the terminationCategory value for this Employee.
     * 
     * @return terminationCategory
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeeTerminationCategory getTerminationCategory() {
        return terminationCategory;
    }


    /**
     * Sets the terminationCategory value for this Employee.
     * 
     * @param terminationCategory
     */
    public void setTerminationCategory(com.netsuite.webservices.lists.employees_2019_1.types.EmployeeTerminationCategory terminationCategory) {
        this.terminationCategory = terminationCategory;
    }


    /**
     * Gets the timeOffPlan value for this Employee.
     * 
     * @return timeOffPlan
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTimeOffPlan() {
        return timeOffPlan;
    }


    /**
     * Sets the timeOffPlan value for this Employee.
     * 
     * @param timeOffPlan
     */
    public void setTimeOffPlan(com.netsuite.webservices.platform.core_2019_1.RecordRef timeOffPlan) {
        this.timeOffPlan = timeOffPlan;
    }


    /**
     * Gets the lastReviewDate value for this Employee.
     * 
     * @return lastReviewDate
     */
    public java.util.Calendar getLastReviewDate() {
        return lastReviewDate;
    }


    /**
     * Sets the lastReviewDate value for this Employee.
     * 
     * @param lastReviewDate
     */
    public void setLastReviewDate(java.util.Calendar lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }


    /**
     * Gets the nextReviewDate value for this Employee.
     * 
     * @return nextReviewDate
     */
    public java.util.Calendar getNextReviewDate() {
        return nextReviewDate;
    }


    /**
     * Sets the nextReviewDate value for this Employee.
     * 
     * @param nextReviewDate
     */
    public void setNextReviewDate(java.util.Calendar nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }


    /**
     * Gets the title value for this Employee.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Employee.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the employeeStatus value for this Employee.
     * 
     * @return employeeStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEmployeeStatus() {
        return employeeStatus;
    }


    /**
     * Sets the employeeStatus value for this Employee.
     * 
     * @param employeeStatus
     */
    public void setEmployeeStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef employeeStatus) {
        this.employeeStatus = employeeStatus;
    }


    /**
     * Gets the jobDescription value for this Employee.
     * 
     * @return jobDescription
     */
    public java.lang.String getJobDescription() {
        return jobDescription;
    }


    /**
     * Sets the jobDescription value for this Employee.
     * 
     * @param jobDescription
     */
    public void setJobDescription(java.lang.String jobDescription) {
        this.jobDescription = jobDescription;
    }


    /**
     * Gets the workAssignment value for this Employee.
     * 
     * @return workAssignment
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeeWorkAssignment getWorkAssignment() {
        return workAssignment;
    }


    /**
     * Sets the workAssignment value for this Employee.
     * 
     * @param workAssignment
     */
    public void setWorkAssignment(com.netsuite.webservices.lists.employees_2019_1.types.EmployeeWorkAssignment workAssignment) {
        this.workAssignment = workAssignment;
    }


    /**
     * Gets the job value for this Employee.
     * 
     * @return job
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this Employee.
     * 
     * @param job
     */
    public void setJob(com.netsuite.webservices.platform.core_2019_1.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the maritalStatus value for this Employee.
     * 
     * @return maritalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this Employee.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the ethnicity value for this Employee.
     * 
     * @return ethnicity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEthnicity() {
        return ethnicity;
    }


    /**
     * Sets the ethnicity value for this Employee.
     * 
     * @param ethnicity
     */
    public void setEthnicity(com.netsuite.webservices.platform.core_2019_1.RecordRef ethnicity) {
        this.ethnicity = ethnicity;
    }


    /**
     * Gets the gender value for this Employee.
     * 
     * @return gender
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.Gender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Employee.
     * 
     * @param gender
     */
    public void setGender(com.netsuite.webservices.lists.employees_2019_1.types.Gender gender) {
        this.gender = gender;
    }


    /**
     * Gets the purchaseOrderApprover value for this Employee.
     * 
     * @return purchaseOrderApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchaseOrderApprover() {
        return purchaseOrderApprover;
    }


    /**
     * Sets the purchaseOrderApprover value for this Employee.
     * 
     * @param purchaseOrderApprover
     */
    public void setPurchaseOrderApprover(com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseOrderApprover) {
        this.purchaseOrderApprover = purchaseOrderApprover;
    }


    /**
     * Gets the workCalendar value for this Employee.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this Employee.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(com.netsuite.webservices.platform.core_2019_1.RecordRef workCalendar) {
        this.workCalendar = workCalendar;
    }


    /**
     * Gets the giveAccess value for this Employee.
     * 
     * @return giveAccess
     */
    public java.lang.Boolean getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this Employee.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(java.lang.Boolean giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the defaultExpenseReportCurrency value for this Employee.
     * 
     * @return defaultExpenseReportCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultExpenseReportCurrency() {
        return defaultExpenseReportCurrency;
    }


    /**
     * Sets the defaultExpenseReportCurrency value for this Employee.
     * 
     * @param defaultExpenseReportCurrency
     */
    public void setDefaultExpenseReportCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultExpenseReportCurrency) {
        this.defaultExpenseReportCurrency = defaultExpenseReportCurrency;
    }


    /**
     * Gets the concurrentWebServicesUser value for this Employee.
     * 
     * @return concurrentWebServicesUser
     */
    public java.lang.Boolean getConcurrentWebServicesUser() {
        return concurrentWebServicesUser;
    }


    /**
     * Sets the concurrentWebServicesUser value for this Employee.
     * 
     * @param concurrentWebServicesUser
     */
    public void setConcurrentWebServicesUser(java.lang.Boolean concurrentWebServicesUser) {
        this.concurrentWebServicesUser = concurrentWebServicesUser;
    }


    /**
     * Gets the sendEmail value for this Employee.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this Employee.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the hasOfflineAccess value for this Employee.
     * 
     * @return hasOfflineAccess
     */
    public java.lang.Boolean getHasOfflineAccess() {
        return hasOfflineAccess;
    }


    /**
     * Sets the hasOfflineAccess value for this Employee.
     * 
     * @param hasOfflineAccess
     */
    public void setHasOfflineAccess(java.lang.Boolean hasOfflineAccess) {
        this.hasOfflineAccess = hasOfflineAccess;
    }


    /**
     * Gets the password value for this Employee.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Employee.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the password2 value for this Employee.
     * 
     * @return password2
     */
    public java.lang.String getPassword2() {
        return password2;
    }


    /**
     * Sets the password2 value for this Employee.
     * 
     * @param password2
     */
    public void setPassword2(java.lang.String password2) {
        this.password2 = password2;
    }


    /**
     * Gets the requirePwdChange value for this Employee.
     * 
     * @return requirePwdChange
     */
    public java.lang.Boolean getRequirePwdChange() {
        return requirePwdChange;
    }


    /**
     * Sets the requirePwdChange value for this Employee.
     * 
     * @param requirePwdChange
     */
    public void setRequirePwdChange(java.lang.Boolean requirePwdChange) {
        this.requirePwdChange = requirePwdChange;
    }


    /**
     * Gets the inheritIPRules value for this Employee.
     * 
     * @return inheritIPRules
     */
    public java.lang.Boolean getInheritIPRules() {
        return inheritIPRules;
    }


    /**
     * Sets the inheritIPRules value for this Employee.
     * 
     * @param inheritIPRules
     */
    public void setInheritIPRules(java.lang.Boolean inheritIPRules) {
        this.inheritIPRules = inheritIPRules;
    }


    /**
     * Gets the IPAddressRule value for this Employee.
     * 
     * @return IPAddressRule
     */
    public java.lang.String getIPAddressRule() {
        return IPAddressRule;
    }


    /**
     * Sets the IPAddressRule value for this Employee.
     * 
     * @param IPAddressRule
     */
    public void setIPAddressRule(java.lang.String IPAddressRule) {
        this.IPAddressRule = IPAddressRule;
    }


    /**
     * Gets the startDateTimeOffCalc value for this Employee.
     * 
     * @return startDateTimeOffCalc
     */
    public java.util.Calendar getStartDateTimeOffCalc() {
        return startDateTimeOffCalc;
    }


    /**
     * Sets the startDateTimeOffCalc value for this Employee.
     * 
     * @param startDateTimeOffCalc
     */
    public void setStartDateTimeOffCalc(java.util.Calendar startDateTimeOffCalc) {
        this.startDateTimeOffCalc = startDateTimeOffCalc;
    }


    /**
     * Gets the commissionPaymentPreference value for this Employee.
     * 
     * @return commissionPaymentPreference
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeeCommissionPaymentPreference getCommissionPaymentPreference() {
        return commissionPaymentPreference;
    }


    /**
     * Sets the commissionPaymentPreference value for this Employee.
     * 
     * @param commissionPaymentPreference
     */
    public void setCommissionPaymentPreference(com.netsuite.webservices.lists.employees_2019_1.types.EmployeeCommissionPaymentPreference commissionPaymentPreference) {
        this.commissionPaymentPreference = commissionPaymentPreference;
    }


    /**
     * Gets the billPay value for this Employee.
     * 
     * @return billPay
     */
    public java.lang.Boolean getBillPay() {
        return billPay;
    }


    /**
     * Sets the billPay value for this Employee.
     * 
     * @param billPay
     */
    public void setBillPay(java.lang.Boolean billPay) {
        this.billPay = billPay;
    }


    /**
     * Gets the defaultAcctCorpCardExp value for this Employee.
     * 
     * @return defaultAcctCorpCardExp
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultAcctCorpCardExp() {
        return defaultAcctCorpCardExp;
    }


    /**
     * Sets the defaultAcctCorpCardExp value for this Employee.
     * 
     * @param defaultAcctCorpCardExp
     */
    public void setDefaultAcctCorpCardExp(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultAcctCorpCardExp) {
        this.defaultAcctCorpCardExp = defaultAcctCorpCardExp;
    }


    /**
     * Gets the eligibleForCommission value for this Employee.
     * 
     * @return eligibleForCommission
     */
    public java.lang.Boolean getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this Employee.
     * 
     * @param eligibleForCommission
     */
    public void setEligibleForCommission(java.lang.Boolean eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }


    /**
     * Gets the subscriptionsList value for this Employee.
     * 
     * @return subscriptionsList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeSubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }


    /**
     * Sets the subscriptionsList value for this Employee.
     * 
     * @param subscriptionsList
     */
    public void setSubscriptionsList(com.netsuite.webservices.lists.employees_2019_1.EmployeeSubscriptionsList subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }


    /**
     * Gets the ratesList value for this Employee.
     * 
     * @return ratesList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeRatesList getRatesList() {
        return ratesList;
    }


    /**
     * Sets the ratesList value for this Employee.
     * 
     * @param ratesList
     */
    public void setRatesList(com.netsuite.webservices.lists.employees_2019_1.EmployeeRatesList ratesList) {
        this.ratesList = ratesList;
    }


    /**
     * Gets the addressbookList value for this Employee.
     * 
     * @return addressbookList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbookList getAddressbookList() {
        return addressbookList;
    }


    /**
     * Sets the addressbookList value for this Employee.
     * 
     * @param addressbookList
     */
    public void setAddressbookList(com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }


    /**
     * Gets the rolesList value for this Employee.
     * 
     * @return rolesList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeRolesList getRolesList() {
        return rolesList;
    }


    /**
     * Sets the rolesList value for this Employee.
     * 
     * @param rolesList
     */
    public void setRolesList(com.netsuite.webservices.lists.employees_2019_1.EmployeeRolesList rolesList) {
        this.rolesList = rolesList;
    }


    /**
     * Gets the hrEducationList value for this Employee.
     * 
     * @return hrEducationList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeHrEducationList getHrEducationList() {
        return hrEducationList;
    }


    /**
     * Sets the hrEducationList value for this Employee.
     * 
     * @param hrEducationList
     */
    public void setHrEducationList(com.netsuite.webservices.lists.employees_2019_1.EmployeeHrEducationList hrEducationList) {
        this.hrEducationList = hrEducationList;
    }


    /**
     * Gets the accruedTimeList value for this Employee.
     * 
     * @return accruedTimeList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTimeList getAccruedTimeList() {
        return accruedTimeList;
    }


    /**
     * Sets the accruedTimeList value for this Employee.
     * 
     * @param accruedTimeList
     */
    public void setAccruedTimeList(com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTimeList accruedTimeList) {
        this.accruedTimeList = accruedTimeList;
    }


    /**
     * Gets the directDepositList value for this Employee.
     * 
     * @return directDepositList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeDirectDepositList getDirectDepositList() {
        return directDepositList;
    }


    /**
     * Sets the directDepositList value for this Employee.
     * 
     * @param directDepositList
     */
    public void setDirectDepositList(com.netsuite.webservices.lists.employees_2019_1.EmployeeDirectDepositList directDepositList) {
        this.directDepositList = directDepositList;
    }


    /**
     * Gets the currencyList value for this Employee.
     * 
     * @return currencyList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeCurrencyList getCurrencyList() {
        return currencyList;
    }


    /**
     * Sets the currencyList value for this Employee.
     * 
     * @param currencyList
     */
    public void setCurrencyList(com.netsuite.webservices.lists.employees_2019_1.EmployeeCurrencyList currencyList) {
        this.currencyList = currencyList;
    }


    /**
     * Gets the companyContributionList value for this Employee.
     * 
     * @return companyContributionList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeCompanyContributionList getCompanyContributionList() {
        return companyContributionList;
    }


    /**
     * Sets the companyContributionList value for this Employee.
     * 
     * @param companyContributionList
     */
    public void setCompanyContributionList(com.netsuite.webservices.lists.employees_2019_1.EmployeeCompanyContributionList companyContributionList) {
        this.companyContributionList = companyContributionList;
    }


    /**
     * Gets the earningList value for this Employee.
     * 
     * @return earningList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeEarningList getEarningList() {
        return earningList;
    }


    /**
     * Sets the earningList value for this Employee.
     * 
     * @param earningList
     */
    public void setEarningList(com.netsuite.webservices.lists.employees_2019_1.EmployeeEarningList earningList) {
        this.earningList = earningList;
    }


    /**
     * Gets the emergencyContactList value for this Employee.
     * 
     * @return emergencyContactList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeEmergencyContactList getEmergencyContactList() {
        return emergencyContactList;
    }


    /**
     * Sets the emergencyContactList value for this Employee.
     * 
     * @param emergencyContactList
     */
    public void setEmergencyContactList(com.netsuite.webservices.lists.employees_2019_1.EmployeeEmergencyContactList emergencyContactList) {
        this.emergencyContactList = emergencyContactList;
    }


    /**
     * Gets the hcmPositionList value for this Employee.
     * 
     * @return hcmPositionList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeHcmPositionList getHcmPositionList() {
        return hcmPositionList;
    }


    /**
     * Sets the hcmPositionList value for this Employee.
     * 
     * @param hcmPositionList
     */
    public void setHcmPositionList(com.netsuite.webservices.lists.employees_2019_1.EmployeeHcmPositionList hcmPositionList) {
        this.hcmPositionList = hcmPositionList;
    }


    /**
     * Gets the deductionList value for this Employee.
     * 
     * @return deductionList
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeDeductionList getDeductionList() {
        return deductionList;
    }


    /**
     * Sets the deductionList value for this Employee.
     * 
     * @param deductionList
     */
    public void setDeductionList(com.netsuite.webservices.lists.employees_2019_1.EmployeeDeductionList deductionList) {
        this.deductionList = deductionList;
    }


    /**
     * Gets the customFieldList value for this Employee.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Employee.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Employee.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Employee.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Employee.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Employee.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
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
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.altName==null && other.getAltName()==null) || 
             (this.altName!=null &&
              this.altName.equals(other.getAltName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.defaultAddress==null && other.getDefaultAddress()==null) || 
             (this.defaultAddress!=null &&
              this.defaultAddress.equals(other.getDefaultAddress()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.officePhone==null && other.getOfficePhone()==null) || 
             (this.officePhone!=null &&
              this.officePhone.equals(other.getOfficePhone()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
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
            ((this.billingClass==null && other.getBillingClass()==null) || 
             (this.billingClass!=null &&
              this.billingClass.equals(other.getBillingClass()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.compensationCurrency==null && other.getCompensationCurrency()==null) || 
             (this.compensationCurrency!=null &&
              this.compensationCurrency.equals(other.getCompensationCurrency()))) &&
            ((this.baseWageType==null && other.getBaseWageType()==null) || 
             (this.baseWageType!=null &&
              this.baseWageType.equals(other.getBaseWageType()))) &&
            ((this.baseWage==null && other.getBaseWage()==null) || 
             (this.baseWage!=null &&
              this.baseWage.equals(other.getBaseWage()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.payFrequency==null && other.getPayFrequency()==null) || 
             (this.payFrequency!=null &&
              this.payFrequency.equals(other.getPayFrequency()))) &&
            ((this.lastPaidDate==null && other.getLastPaidDate()==null) || 
             (this.lastPaidDate!=null &&
              this.lastPaidDate.equals(other.getLastPaidDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.useTimeData==null && other.getUseTimeData()==null) || 
             (this.useTimeData!=null &&
              this.useTimeData.equals(other.getUseTimeData()))) &&
            ((this.usePerquest==null && other.getUsePerquest()==null) || 
             (this.usePerquest!=null &&
              this.usePerquest.equals(other.getUsePerquest()))) &&
            ((this.workplace==null && other.getWorkplace()==null) || 
             (this.workplace!=null &&
              this.workplace.equals(other.getWorkplace()))) &&
            ((this.adpId==null && other.getAdpId()==null) || 
             (this.adpId!=null &&
              this.adpId.equals(other.getAdpId()))) &&
            ((this.directDeposit==null && other.getDirectDeposit()==null) || 
             (this.directDeposit!=null &&
              this.directDeposit.equals(other.getDirectDeposit()))) &&
            ((this.expenseLimit==null && other.getExpenseLimit()==null) || 
             (this.expenseLimit!=null &&
              this.expenseLimit.equals(other.getExpenseLimit()))) &&
            ((this.purchaseOrderLimit==null && other.getPurchaseOrderLimit()==null) || 
             (this.purchaseOrderLimit!=null &&
              this.purchaseOrderLimit.equals(other.getPurchaseOrderLimit()))) &&
            ((this.purchaseOrderApprovalLimit==null && other.getPurchaseOrderApprovalLimit()==null) || 
             (this.purchaseOrderApprovalLimit!=null &&
              this.purchaseOrderApprovalLimit.equals(other.getPurchaseOrderApprovalLimit()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.supervisor==null && other.getSupervisor()==null) || 
             (this.supervisor!=null &&
              this.supervisor.equals(other.getSupervisor()))) &&
            ((this.approver==null && other.getApprover()==null) || 
             (this.approver!=null &&
              this.approver.equals(other.getApprover()))) &&
            ((this.approvalLimit==null && other.getApprovalLimit()==null) || 
             (this.approvalLimit!=null &&
              this.approvalLimit.equals(other.getApprovalLimit()))) &&
            ((this.timeApprover==null && other.getTimeApprover()==null) || 
             (this.timeApprover!=null &&
              this.timeApprover.equals(other.getTimeApprover()))) &&
            ((this.employeeType==null && other.getEmployeeType()==null) || 
             (this.employeeType!=null &&
              this.employeeType.equals(other.getEmployeeType()))) &&
            ((this.isSalesRep==null && other.getIsSalesRep()==null) || 
             (this.isSalesRep!=null &&
              this.isSalesRep.equals(other.getIsSalesRep()))) &&
            ((this.salesRole==null && other.getSalesRole()==null) || 
             (this.salesRole!=null &&
              this.salesRole.equals(other.getSalesRole()))) &&
            ((this.isSupportRep==null && other.getIsSupportRep()==null) || 
             (this.isSupportRep!=null &&
              this.isSupportRep.equals(other.getIsSupportRep()))) &&
            ((this.isJobResource==null && other.getIsJobResource()==null) || 
             (this.isJobResource!=null &&
              this.isJobResource.equals(other.getIsJobResource()))) &&
            ((this.laborCost==null && other.getLaborCost()==null) || 
             (this.laborCost!=null &&
              this.laborCost.equals(other.getLaborCost()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.hireDate==null && other.getHireDate()==null) || 
             (this.hireDate!=null &&
              this.hireDate.equals(other.getHireDate()))) &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate()))) &&
            ((this.terminationDetails==null && other.getTerminationDetails()==null) || 
             (this.terminationDetails!=null &&
              this.terminationDetails.equals(other.getTerminationDetails()))) &&
            ((this.terminationReason==null && other.getTerminationReason()==null) || 
             (this.terminationReason!=null &&
              this.terminationReason.equals(other.getTerminationReason()))) &&
            ((this.terminationRegretted==null && other.getTerminationRegretted()==null) || 
             (this.terminationRegretted!=null &&
              this.terminationRegretted.equals(other.getTerminationRegretted()))) &&
            ((this.terminationCategory==null && other.getTerminationCategory()==null) || 
             (this.terminationCategory!=null &&
              this.terminationCategory.equals(other.getTerminationCategory()))) &&
            ((this.timeOffPlan==null && other.getTimeOffPlan()==null) || 
             (this.timeOffPlan!=null &&
              this.timeOffPlan.equals(other.getTimeOffPlan()))) &&
            ((this.lastReviewDate==null && other.getLastReviewDate()==null) || 
             (this.lastReviewDate!=null &&
              this.lastReviewDate.equals(other.getLastReviewDate()))) &&
            ((this.nextReviewDate==null && other.getNextReviewDate()==null) || 
             (this.nextReviewDate!=null &&
              this.nextReviewDate.equals(other.getNextReviewDate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.employeeStatus==null && other.getEmployeeStatus()==null) || 
             (this.employeeStatus!=null &&
              this.employeeStatus.equals(other.getEmployeeStatus()))) &&
            ((this.jobDescription==null && other.getJobDescription()==null) || 
             (this.jobDescription!=null &&
              this.jobDescription.equals(other.getJobDescription()))) &&
            ((this.workAssignment==null && other.getWorkAssignment()==null) || 
             (this.workAssignment!=null &&
              this.workAssignment.equals(other.getWorkAssignment()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.ethnicity==null && other.getEthnicity()==null) || 
             (this.ethnicity!=null &&
              this.ethnicity.equals(other.getEthnicity()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.purchaseOrderApprover==null && other.getPurchaseOrderApprover()==null) || 
             (this.purchaseOrderApprover!=null &&
              this.purchaseOrderApprover.equals(other.getPurchaseOrderApprover()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              this.workCalendar.equals(other.getWorkCalendar()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.defaultExpenseReportCurrency==null && other.getDefaultExpenseReportCurrency()==null) || 
             (this.defaultExpenseReportCurrency!=null &&
              this.defaultExpenseReportCurrency.equals(other.getDefaultExpenseReportCurrency()))) &&
            ((this.concurrentWebServicesUser==null && other.getConcurrentWebServicesUser()==null) || 
             (this.concurrentWebServicesUser!=null &&
              this.concurrentWebServicesUser.equals(other.getConcurrentWebServicesUser()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.hasOfflineAccess==null && other.getHasOfflineAccess()==null) || 
             (this.hasOfflineAccess!=null &&
              this.hasOfflineAccess.equals(other.getHasOfflineAccess()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.password2==null && other.getPassword2()==null) || 
             (this.password2!=null &&
              this.password2.equals(other.getPassword2()))) &&
            ((this.requirePwdChange==null && other.getRequirePwdChange()==null) || 
             (this.requirePwdChange!=null &&
              this.requirePwdChange.equals(other.getRequirePwdChange()))) &&
            ((this.inheritIPRules==null && other.getInheritIPRules()==null) || 
             (this.inheritIPRules!=null &&
              this.inheritIPRules.equals(other.getInheritIPRules()))) &&
            ((this.IPAddressRule==null && other.getIPAddressRule()==null) || 
             (this.IPAddressRule!=null &&
              this.IPAddressRule.equals(other.getIPAddressRule()))) &&
            ((this.startDateTimeOffCalc==null && other.getStartDateTimeOffCalc()==null) || 
             (this.startDateTimeOffCalc!=null &&
              this.startDateTimeOffCalc.equals(other.getStartDateTimeOffCalc()))) &&
            ((this.commissionPaymentPreference==null && other.getCommissionPaymentPreference()==null) || 
             (this.commissionPaymentPreference!=null &&
              this.commissionPaymentPreference.equals(other.getCommissionPaymentPreference()))) &&
            ((this.billPay==null && other.getBillPay()==null) || 
             (this.billPay!=null &&
              this.billPay.equals(other.getBillPay()))) &&
            ((this.defaultAcctCorpCardExp==null && other.getDefaultAcctCorpCardExp()==null) || 
             (this.defaultAcctCorpCardExp!=null &&
              this.defaultAcctCorpCardExp.equals(other.getDefaultAcctCorpCardExp()))) &&
            ((this.eligibleForCommission==null && other.getEligibleForCommission()==null) || 
             (this.eligibleForCommission!=null &&
              this.eligibleForCommission.equals(other.getEligibleForCommission()))) &&
            ((this.subscriptionsList==null && other.getSubscriptionsList()==null) || 
             (this.subscriptionsList!=null &&
              this.subscriptionsList.equals(other.getSubscriptionsList()))) &&
            ((this.ratesList==null && other.getRatesList()==null) || 
             (this.ratesList!=null &&
              this.ratesList.equals(other.getRatesList()))) &&
            ((this.addressbookList==null && other.getAddressbookList()==null) || 
             (this.addressbookList!=null &&
              this.addressbookList.equals(other.getAddressbookList()))) &&
            ((this.rolesList==null && other.getRolesList()==null) || 
             (this.rolesList!=null &&
              this.rolesList.equals(other.getRolesList()))) &&
            ((this.hrEducationList==null && other.getHrEducationList()==null) || 
             (this.hrEducationList!=null &&
              this.hrEducationList.equals(other.getHrEducationList()))) &&
            ((this.accruedTimeList==null && other.getAccruedTimeList()==null) || 
             (this.accruedTimeList!=null &&
              this.accruedTimeList.equals(other.getAccruedTimeList()))) &&
            ((this.directDepositList==null && other.getDirectDepositList()==null) || 
             (this.directDepositList!=null &&
              this.directDepositList.equals(other.getDirectDepositList()))) &&
            ((this.currencyList==null && other.getCurrencyList()==null) || 
             (this.currencyList!=null &&
              this.currencyList.equals(other.getCurrencyList()))) &&
            ((this.companyContributionList==null && other.getCompanyContributionList()==null) || 
             (this.companyContributionList!=null &&
              this.companyContributionList.equals(other.getCompanyContributionList()))) &&
            ((this.earningList==null && other.getEarningList()==null) || 
             (this.earningList!=null &&
              this.earningList.equals(other.getEarningList()))) &&
            ((this.emergencyContactList==null && other.getEmergencyContactList()==null) || 
             (this.emergencyContactList!=null &&
              this.emergencyContactList.equals(other.getEmergencyContactList()))) &&
            ((this.hcmPositionList==null && other.getHcmPositionList()==null) || 
             (this.hcmPositionList!=null &&
              this.hcmPositionList.equals(other.getHcmPositionList()))) &&
            ((this.deductionList==null && other.getDeductionList()==null) || 
             (this.deductionList!=null &&
              this.deductionList.equals(other.getDeductionList()))) &&
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
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getAltName() != null) {
            _hashCode += getAltName().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getDefaultAddress() != null) {
            _hashCode += getDefaultAddress().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getOfficePhone() != null) {
            _hashCode += getOfficePhone().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
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
        if (getBillingClass() != null) {
            _hashCode += getBillingClass().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getCompensationCurrency() != null) {
            _hashCode += getCompensationCurrency().hashCode();
        }
        if (getBaseWageType() != null) {
            _hashCode += getBaseWageType().hashCode();
        }
        if (getBaseWage() != null) {
            _hashCode += getBaseWage().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getPayFrequency() != null) {
            _hashCode += getPayFrequency().hashCode();
        }
        if (getLastPaidDate() != null) {
            _hashCode += getLastPaidDate().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getUseTimeData() != null) {
            _hashCode += getUseTimeData().hashCode();
        }
        if (getUsePerquest() != null) {
            _hashCode += getUsePerquest().hashCode();
        }
        if (getWorkplace() != null) {
            _hashCode += getWorkplace().hashCode();
        }
        if (getAdpId() != null) {
            _hashCode += getAdpId().hashCode();
        }
        if (getDirectDeposit() != null) {
            _hashCode += getDirectDeposit().hashCode();
        }
        if (getExpenseLimit() != null) {
            _hashCode += getExpenseLimit().hashCode();
        }
        if (getPurchaseOrderLimit() != null) {
            _hashCode += getPurchaseOrderLimit().hashCode();
        }
        if (getPurchaseOrderApprovalLimit() != null) {
            _hashCode += getPurchaseOrderApprovalLimit().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getSupervisor() != null) {
            _hashCode += getSupervisor().hashCode();
        }
        if (getApprover() != null) {
            _hashCode += getApprover().hashCode();
        }
        if (getApprovalLimit() != null) {
            _hashCode += getApprovalLimit().hashCode();
        }
        if (getTimeApprover() != null) {
            _hashCode += getTimeApprover().hashCode();
        }
        if (getEmployeeType() != null) {
            _hashCode += getEmployeeType().hashCode();
        }
        if (getIsSalesRep() != null) {
            _hashCode += getIsSalesRep().hashCode();
        }
        if (getSalesRole() != null) {
            _hashCode += getSalesRole().hashCode();
        }
        if (getIsSupportRep() != null) {
            _hashCode += getIsSupportRep().hashCode();
        }
        if (getIsJobResource() != null) {
            _hashCode += getIsJobResource().hashCode();
        }
        if (getLaborCost() != null) {
            _hashCode += getLaborCost().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getHireDate() != null) {
            _hashCode += getHireDate().hashCode();
        }
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
        }
        if (getTerminationDetails() != null) {
            _hashCode += getTerminationDetails().hashCode();
        }
        if (getTerminationReason() != null) {
            _hashCode += getTerminationReason().hashCode();
        }
        if (getTerminationRegretted() != null) {
            _hashCode += getTerminationRegretted().hashCode();
        }
        if (getTerminationCategory() != null) {
            _hashCode += getTerminationCategory().hashCode();
        }
        if (getTimeOffPlan() != null) {
            _hashCode += getTimeOffPlan().hashCode();
        }
        if (getLastReviewDate() != null) {
            _hashCode += getLastReviewDate().hashCode();
        }
        if (getNextReviewDate() != null) {
            _hashCode += getNextReviewDate().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getEmployeeStatus() != null) {
            _hashCode += getEmployeeStatus().hashCode();
        }
        if (getJobDescription() != null) {
            _hashCode += getJobDescription().hashCode();
        }
        if (getWorkAssignment() != null) {
            _hashCode += getWorkAssignment().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getEthnicity() != null) {
            _hashCode += getEthnicity().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getPurchaseOrderApprover() != null) {
            _hashCode += getPurchaseOrderApprover().hashCode();
        }
        if (getWorkCalendar() != null) {
            _hashCode += getWorkCalendar().hashCode();
        }
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getDefaultExpenseReportCurrency() != null) {
            _hashCode += getDefaultExpenseReportCurrency().hashCode();
        }
        if (getConcurrentWebServicesUser() != null) {
            _hashCode += getConcurrentWebServicesUser().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        if (getHasOfflineAccess() != null) {
            _hashCode += getHasOfflineAccess().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPassword2() != null) {
            _hashCode += getPassword2().hashCode();
        }
        if (getRequirePwdChange() != null) {
            _hashCode += getRequirePwdChange().hashCode();
        }
        if (getInheritIPRules() != null) {
            _hashCode += getInheritIPRules().hashCode();
        }
        if (getIPAddressRule() != null) {
            _hashCode += getIPAddressRule().hashCode();
        }
        if (getStartDateTimeOffCalc() != null) {
            _hashCode += getStartDateTimeOffCalc().hashCode();
        }
        if (getCommissionPaymentPreference() != null) {
            _hashCode += getCommissionPaymentPreference().hashCode();
        }
        if (getBillPay() != null) {
            _hashCode += getBillPay().hashCode();
        }
        if (getDefaultAcctCorpCardExp() != null) {
            _hashCode += getDefaultAcctCorpCardExp().hashCode();
        }
        if (getEligibleForCommission() != null) {
            _hashCode += getEligibleForCommission().hashCode();
        }
        if (getSubscriptionsList() != null) {
            _hashCode += getSubscriptionsList().hashCode();
        }
        if (getRatesList() != null) {
            _hashCode += getRatesList().hashCode();
        }
        if (getAddressbookList() != null) {
            _hashCode += getAddressbookList().hashCode();
        }
        if (getRolesList() != null) {
            _hashCode += getRolesList().hashCode();
        }
        if (getHrEducationList() != null) {
            _hashCode += getHrEducationList().hashCode();
        }
        if (getAccruedTimeList() != null) {
            _hashCode += getAccruedTimeList().hashCode();
        }
        if (getDirectDepositList() != null) {
            _hashCode += getDirectDepositList().hashCode();
        }
        if (getCurrencyList() != null) {
            _hashCode += getCurrencyList().hashCode();
        }
        if (getCompanyContributionList() != null) {
            _hashCode += getCompanyContributionList().hashCode();
        }
        if (getEarningList() != null) {
            _hashCode += getEarningList().hashCode();
        }
        if (getEmergencyContactList() != null) {
            _hashCode += getEmergencyContactList().hashCode();
        }
        if (getHcmPositionList() != null) {
            _hashCode += getHcmPositionList().hashCode();
        }
        if (getDeductionList() != null) {
            _hashCode += getDeductionList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "Employee"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "defaultAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "officePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "billingClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compensationCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "compensationCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeeCompensationCurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseWageType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "baseWageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeeBaseWageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseWage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "baseWage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "payFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeePayFrequency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPaidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "lastPaidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useTimeData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "useTimeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeeUseTimeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePerquest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "usePerquest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adpId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "adpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "directDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "expenseLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "purchaseOrderLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderApprovalLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "purchaseOrderApprovalLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "socialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "supervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "approvalLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "timeApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "employeeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSalesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "isSalesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "salesRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSupportRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "isSupportRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isJobResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "isJobResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "hireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "releaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "terminationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminationReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "terminationReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminationRegretted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "terminationRegretted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeeTerminationRegretted"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminationCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "terminationCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeeTerminationCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOffPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "timeOffPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "lastReviewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextReviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "nextReviewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "employeeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "jobDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "workAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeeWorkAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "maritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnicity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "ethnicity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "Gender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "purchaseOrderApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultExpenseReportCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "defaultExpenseReportCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurrentWebServicesUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "concurrentWebServicesUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasOfflineAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "hasOfflineAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "password2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requirePwdChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "requirePwdChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inheritIPRules");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "inheritIPRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddressRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "IPAddressRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTimeOffCalc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "startDateTimeOffCalc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionPaymentPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "commissionPaymentPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeeCommissionPaymentPreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "billPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAcctCorpCardExp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "defaultAcctCorpCardExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "subscriptionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeSubscriptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "ratesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeRatesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeAddressbookList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "rolesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeRolesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hrEducationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "hrEducationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeHrEducationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accruedTimeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "accruedTimeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeAccruedTimeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDepositList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "directDepositList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeDirectDepositList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "currencyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeCurrencyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyContributionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "companyContributionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeCompanyContributionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earningList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "earningList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeEarningList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emergencyContactList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "emergencyContactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeEmergencyContactList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hcmPositionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "hcmPositionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeHcmPositionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "deductionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeDeductionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "customFieldList"));
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
