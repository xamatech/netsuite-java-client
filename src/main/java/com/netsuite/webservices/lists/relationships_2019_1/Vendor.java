/**
 * Vendor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class Vendor  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String entityId;

    private java.lang.String altName;

    private java.lang.Boolean isPerson;

    private java.lang.String phoneticName;

    private java.lang.String salutation;

    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String lastName;

    private java.lang.String companyName;

    private java.lang.String phone;

    private java.lang.String fax;

    private java.lang.String email;

    private java.lang.String url;

    private java.lang.String defaultAddress;

    private java.lang.Boolean isInactive;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef category;

    private java.lang.String title;

    private java.lang.String printOnCheckAs;

    private java.lang.String altPhone;

    private java.lang.String homePhone;

    private java.lang.String mobilePhone;

    private java.lang.String altEmail;

    private java.lang.String comments;

    private com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef image;

    private com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef representingSubsidiary;

    private java.lang.String accountNumber;

    private java.lang.String legalName;

    private java.lang.String vatRegNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef payablesAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef terms;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef incoterm;

    private java.lang.Double creditLimit;

    private java.lang.Double balancePrimary;

    private java.lang.Double openingBalance;

    private java.util.Calendar openingBalanceDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef openingBalanceAccount;

    private java.lang.Double balance;

    private java.lang.Double unbilledOrdersPrimary;

    private java.lang.String bcn;

    private java.lang.Double unbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.Boolean is1099Eligible;

    private java.lang.Boolean isJobResourceVend;

    private java.lang.Double laborCost;

    private java.lang.Double purchaseOrderQuantity;

    private java.lang.Double purchaseOrderAmount;

    private java.lang.Double purchaseOrderQuantityDiff;

    private java.lang.Double receiptQuantity;

    private java.lang.Double receiptAmount;

    private java.lang.Double receiptQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef workCalendar;

    private java.lang.String taxIdNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem;

    private java.lang.Boolean giveAccess;

    private java.lang.Boolean sendEmail;

    private java.lang.Boolean billPay;

    private java.lang.Boolean isAccountant;

    private java.lang.String password;

    private java.lang.String password2;

    private java.lang.Boolean requirePwdChange;

    private java.lang.Boolean eligibleForCommission;

    private java.lang.Boolean emailTransactions;

    private java.lang.Boolean printTransactions;

    private java.lang.Boolean faxTransactions;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultTaxReg;

    private com.netsuite.webservices.lists.relationships_2019_1.VendorPricingScheduleList pricingScheduleList;

    private com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList;

    private com.netsuite.webservices.lists.relationships_2019_1.VendorAddressbookList addressbookList;

    private com.netsuite.webservices.lists.relationships_2019_1.VendorCurrencyList currencyList;

    private com.netsuite.webservices.lists.relationships_2019_1.VendorRolesList rolesList;

    private com.netsuite.webservices.lists.relationships_2019_1.VendorTaxRegistrationList taxRegistrationList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Vendor() {
    }

    public Vendor(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String entityId,
           java.lang.String altName,
           java.lang.Boolean isPerson,
           java.lang.String phoneticName,
           java.lang.String salutation,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String lastName,
           java.lang.String companyName,
           java.lang.String phone,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String url,
           java.lang.String defaultAddress,
           java.lang.Boolean isInactive,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar dateCreated,
           com.netsuite.webservices.platform.core_2019_1.RecordRef category,
           java.lang.String title,
           java.lang.String printOnCheckAs,
           java.lang.String altPhone,
           java.lang.String homePhone,
           java.lang.String mobilePhone,
           java.lang.String altEmail,
           java.lang.String comments,
           com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef image,
           com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef representingSubsidiary,
           java.lang.String accountNumber,
           java.lang.String legalName,
           java.lang.String vatRegNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef payablesAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef terms,
           com.netsuite.webservices.platform.core_2019_1.RecordRef incoterm,
           java.lang.Double creditLimit,
           java.lang.Double balancePrimary,
           java.lang.Double openingBalance,
           java.util.Calendar openingBalanceDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef openingBalanceAccount,
           java.lang.Double balance,
           java.lang.Double unbilledOrdersPrimary,
           java.lang.String bcn,
           java.lang.Double unbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.Boolean is1099Eligible,
           java.lang.Boolean isJobResourceVend,
           java.lang.Double laborCost,
           java.lang.Double purchaseOrderQuantity,
           java.lang.Double purchaseOrderAmount,
           java.lang.Double purchaseOrderQuantityDiff,
           java.lang.Double receiptQuantity,
           java.lang.Double receiptAmount,
           java.lang.Double receiptQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.RecordRef workCalendar,
           java.lang.String taxIdNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem,
           java.lang.Boolean giveAccess,
           java.lang.Boolean sendEmail,
           java.lang.Boolean billPay,
           java.lang.Boolean isAccountant,
           java.lang.String password,
           java.lang.String password2,
           java.lang.Boolean requirePwdChange,
           java.lang.Boolean eligibleForCommission,
           java.lang.Boolean emailTransactions,
           java.lang.Boolean printTransactions,
           java.lang.Boolean faxTransactions,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultTaxReg,
           com.netsuite.webservices.lists.relationships_2019_1.VendorPricingScheduleList pricingScheduleList,
           com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList,
           com.netsuite.webservices.lists.relationships_2019_1.VendorAddressbookList addressbookList,
           com.netsuite.webservices.lists.relationships_2019_1.VendorCurrencyList currencyList,
           com.netsuite.webservices.lists.relationships_2019_1.VendorRolesList rolesList,
           com.netsuite.webservices.lists.relationships_2019_1.VendorTaxRegistrationList taxRegistrationList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.entityId = entityId;
        this.altName = altName;
        this.isPerson = isPerson;
        this.phoneticName = phoneticName;
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.url = url;
        this.defaultAddress = defaultAddress;
        this.isInactive = isInactive;
        this.lastModifiedDate = lastModifiedDate;
        this.dateCreated = dateCreated;
        this.category = category;
        this.title = title;
        this.printOnCheckAs = printOnCheckAs;
        this.altPhone = altPhone;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.altEmail = altEmail;
        this.comments = comments;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.image = image;
        this.emailPreference = emailPreference;
        this.subsidiary = subsidiary;
        this.representingSubsidiary = representingSubsidiary;
        this.accountNumber = accountNumber;
        this.legalName = legalName;
        this.vatRegNumber = vatRegNumber;
        this.expenseAccount = expenseAccount;
        this.payablesAccount = payablesAccount;
        this.terms = terms;
        this.incoterm = incoterm;
        this.creditLimit = creditLimit;
        this.balancePrimary = balancePrimary;
        this.openingBalance = openingBalance;
        this.openingBalanceDate = openingBalanceDate;
        this.openingBalanceAccount = openingBalanceAccount;
        this.balance = balance;
        this.unbilledOrdersPrimary = unbilledOrdersPrimary;
        this.bcn = bcn;
        this.unbilledOrders = unbilledOrders;
        this.currency = currency;
        this.is1099Eligible = is1099Eligible;
        this.isJobResourceVend = isJobResourceVend;
        this.laborCost = laborCost;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptQuantity = receiptQuantity;
        this.receiptAmount = receiptAmount;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.workCalendar = workCalendar;
        this.taxIdNum = taxIdNum;
        this.taxItem = taxItem;
        this.giveAccess = giveAccess;
        this.sendEmail = sendEmail;
        this.billPay = billPay;
        this.isAccountant = isAccountant;
        this.password = password;
        this.password2 = password2;
        this.requirePwdChange = requirePwdChange;
        this.eligibleForCommission = eligibleForCommission;
        this.emailTransactions = emailTransactions;
        this.printTransactions = printTransactions;
        this.faxTransactions = faxTransactions;
        this.defaultTaxReg = defaultTaxReg;
        this.pricingScheduleList = pricingScheduleList;
        this.subscriptionsList = subscriptionsList;
        this.addressbookList = addressbookList;
        this.currencyList = currencyList;
        this.rolesList = rolesList;
        this.taxRegistrationList = taxRegistrationList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Vendor.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Vendor.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the entityId value for this Vendor.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this Vendor.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the altName value for this Vendor.
     * 
     * @return altName
     */
    public java.lang.String getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this Vendor.
     * 
     * @param altName
     */
    public void setAltName(java.lang.String altName) {
        this.altName = altName;
    }


    /**
     * Gets the isPerson value for this Vendor.
     * 
     * @return isPerson
     */
    public java.lang.Boolean getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this Vendor.
     * 
     * @param isPerson
     */
    public void setIsPerson(java.lang.Boolean isPerson) {
        this.isPerson = isPerson;
    }


    /**
     * Gets the phoneticName value for this Vendor.
     * 
     * @return phoneticName
     */
    public java.lang.String getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this Vendor.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(java.lang.String phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the salutation value for this Vendor.
     * 
     * @return salutation
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this Vendor.
     * 
     * @param salutation
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the firstName value for this Vendor.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Vendor.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this Vendor.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this Vendor.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the lastName value for this Vendor.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Vendor.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the companyName value for this Vendor.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Vendor.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the phone value for this Vendor.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Vendor.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this Vendor.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Vendor.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Vendor.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Vendor.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the url value for this Vendor.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Vendor.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the defaultAddress value for this Vendor.
     * 
     * @return defaultAddress
     */
    public java.lang.String getDefaultAddress() {
        return defaultAddress;
    }


    /**
     * Sets the defaultAddress value for this Vendor.
     * 
     * @param defaultAddress
     */
    public void setDefaultAddress(java.lang.String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }


    /**
     * Gets the isInactive value for this Vendor.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Vendor.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the lastModifiedDate value for this Vendor.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Vendor.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the dateCreated value for this Vendor.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Vendor.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the category value for this Vendor.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Vendor.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the title value for this Vendor.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Vendor.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the printOnCheckAs value for this Vendor.
     * 
     * @return printOnCheckAs
     */
    public java.lang.String getPrintOnCheckAs() {
        return printOnCheckAs;
    }


    /**
     * Sets the printOnCheckAs value for this Vendor.
     * 
     * @param printOnCheckAs
     */
    public void setPrintOnCheckAs(java.lang.String printOnCheckAs) {
        this.printOnCheckAs = printOnCheckAs;
    }


    /**
     * Gets the altPhone value for this Vendor.
     * 
     * @return altPhone
     */
    public java.lang.String getAltPhone() {
        return altPhone;
    }


    /**
     * Sets the altPhone value for this Vendor.
     * 
     * @param altPhone
     */
    public void setAltPhone(java.lang.String altPhone) {
        this.altPhone = altPhone;
    }


    /**
     * Gets the homePhone value for this Vendor.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this Vendor.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the mobilePhone value for this Vendor.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this Vendor.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the altEmail value for this Vendor.
     * 
     * @return altEmail
     */
    public java.lang.String getAltEmail() {
        return altEmail;
    }


    /**
     * Sets the altEmail value for this Vendor.
     * 
     * @param altEmail
     */
    public void setAltEmail(java.lang.String altEmail) {
        this.altEmail = altEmail;
    }


    /**
     * Gets the comments value for this Vendor.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Vendor.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the globalSubscriptionStatus value for this Vendor.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this Vendor.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the image value for this Vendor.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getImage() {
        return image;
    }


    /**
     * Sets the image value for this Vendor.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2019_1.RecordRef image) {
        this.image = image;
    }


    /**
     * Gets the emailPreference value for this Vendor.
     * 
     * @return emailPreference
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference getEmailPreference() {
        return emailPreference;
    }


    /**
     * Sets the emailPreference value for this Vendor.
     * 
     * @param emailPreference
     */
    public void setEmailPreference(com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference) {
        this.emailPreference = emailPreference;
    }


    /**
     * Gets the subsidiary value for this Vendor.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Vendor.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the representingSubsidiary value for this Vendor.
     * 
     * @return representingSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRepresentingSubsidiary() {
        return representingSubsidiary;
    }


    /**
     * Sets the representingSubsidiary value for this Vendor.
     * 
     * @param representingSubsidiary
     */
    public void setRepresentingSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef representingSubsidiary) {
        this.representingSubsidiary = representingSubsidiary;
    }


    /**
     * Gets the accountNumber value for this Vendor.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Vendor.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the legalName value for this Vendor.
     * 
     * @return legalName
     */
    public java.lang.String getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this Vendor.
     * 
     * @param legalName
     */
    public void setLegalName(java.lang.String legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the vatRegNumber value for this Vendor.
     * 
     * @return vatRegNumber
     */
    public java.lang.String getVatRegNumber() {
        return vatRegNumber;
    }


    /**
     * Sets the vatRegNumber value for this Vendor.
     * 
     * @param vatRegNumber
     */
    public void setVatRegNumber(java.lang.String vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }


    /**
     * Gets the expenseAccount value for this Vendor.
     * 
     * @return expenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this Vendor.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }


    /**
     * Gets the payablesAccount value for this Vendor.
     * 
     * @return payablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPayablesAccount() {
        return payablesAccount;
    }


    /**
     * Sets the payablesAccount value for this Vendor.
     * 
     * @param payablesAccount
     */
    public void setPayablesAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef payablesAccount) {
        this.payablesAccount = payablesAccount;
    }


    /**
     * Gets the terms value for this Vendor.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this Vendor.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef terms) {
        this.terms = terms;
    }


    /**
     * Gets the incoterm value for this Vendor.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this Vendor.
     * 
     * @param incoterm
     */
    public void setIncoterm(com.netsuite.webservices.platform.core_2019_1.RecordRef incoterm) {
        this.incoterm = incoterm;
    }


    /**
     * Gets the creditLimit value for this Vendor.
     * 
     * @return creditLimit
     */
    public java.lang.Double getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this Vendor.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.Double creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the balancePrimary value for this Vendor.
     * 
     * @return balancePrimary
     */
    public java.lang.Double getBalancePrimary() {
        return balancePrimary;
    }


    /**
     * Sets the balancePrimary value for this Vendor.
     * 
     * @param balancePrimary
     */
    public void setBalancePrimary(java.lang.Double balancePrimary) {
        this.balancePrimary = balancePrimary;
    }


    /**
     * Gets the openingBalance value for this Vendor.
     * 
     * @return openingBalance
     */
    public java.lang.Double getOpeningBalance() {
        return openingBalance;
    }


    /**
     * Sets the openingBalance value for this Vendor.
     * 
     * @param openingBalance
     */
    public void setOpeningBalance(java.lang.Double openingBalance) {
        this.openingBalance = openingBalance;
    }


    /**
     * Gets the openingBalanceDate value for this Vendor.
     * 
     * @return openingBalanceDate
     */
    public java.util.Calendar getOpeningBalanceDate() {
        return openingBalanceDate;
    }


    /**
     * Sets the openingBalanceDate value for this Vendor.
     * 
     * @param openingBalanceDate
     */
    public void setOpeningBalanceDate(java.util.Calendar openingBalanceDate) {
        this.openingBalanceDate = openingBalanceDate;
    }


    /**
     * Gets the openingBalanceAccount value for this Vendor.
     * 
     * @return openingBalanceAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOpeningBalanceAccount() {
        return openingBalanceAccount;
    }


    /**
     * Sets the openingBalanceAccount value for this Vendor.
     * 
     * @param openingBalanceAccount
     */
    public void setOpeningBalanceAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef openingBalanceAccount) {
        this.openingBalanceAccount = openingBalanceAccount;
    }


    /**
     * Gets the balance value for this Vendor.
     * 
     * @return balance
     */
    public java.lang.Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Vendor.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the unbilledOrdersPrimary value for this Vendor.
     * 
     * @return unbilledOrdersPrimary
     */
    public java.lang.Double getUnbilledOrdersPrimary() {
        return unbilledOrdersPrimary;
    }


    /**
     * Sets the unbilledOrdersPrimary value for this Vendor.
     * 
     * @param unbilledOrdersPrimary
     */
    public void setUnbilledOrdersPrimary(java.lang.Double unbilledOrdersPrimary) {
        this.unbilledOrdersPrimary = unbilledOrdersPrimary;
    }


    /**
     * Gets the bcn value for this Vendor.
     * 
     * @return bcn
     */
    public java.lang.String getBcn() {
        return bcn;
    }


    /**
     * Sets the bcn value for this Vendor.
     * 
     * @param bcn
     */
    public void setBcn(java.lang.String bcn) {
        this.bcn = bcn;
    }


    /**
     * Gets the unbilledOrders value for this Vendor.
     * 
     * @return unbilledOrders
     */
    public java.lang.Double getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this Vendor.
     * 
     * @param unbilledOrders
     */
    public void setUnbilledOrders(java.lang.Double unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }


    /**
     * Gets the currency value for this Vendor.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Vendor.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the is1099Eligible value for this Vendor.
     * 
     * @return is1099Eligible
     */
    public java.lang.Boolean getIs1099Eligible() {
        return is1099Eligible;
    }


    /**
     * Sets the is1099Eligible value for this Vendor.
     * 
     * @param is1099Eligible
     */
    public void setIs1099Eligible(java.lang.Boolean is1099Eligible) {
        this.is1099Eligible = is1099Eligible;
    }


    /**
     * Gets the isJobResourceVend value for this Vendor.
     * 
     * @return isJobResourceVend
     */
    public java.lang.Boolean getIsJobResourceVend() {
        return isJobResourceVend;
    }


    /**
     * Sets the isJobResourceVend value for this Vendor.
     * 
     * @param isJobResourceVend
     */
    public void setIsJobResourceVend(java.lang.Boolean isJobResourceVend) {
        this.isJobResourceVend = isJobResourceVend;
    }


    /**
     * Gets the laborCost value for this Vendor.
     * 
     * @return laborCost
     */
    public java.lang.Double getLaborCost() {
        return laborCost;
    }


    /**
     * Sets the laborCost value for this Vendor.
     * 
     * @param laborCost
     */
    public void setLaborCost(java.lang.Double laborCost) {
        this.laborCost = laborCost;
    }


    /**
     * Gets the purchaseOrderQuantity value for this Vendor.
     * 
     * @return purchaseOrderQuantity
     */
    public java.lang.Double getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this Vendor.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(java.lang.Double purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }


    /**
     * Gets the purchaseOrderAmount value for this Vendor.
     * 
     * @return purchaseOrderAmount
     */
    public java.lang.Double getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this Vendor.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(java.lang.Double purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this Vendor.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public java.lang.Double getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this Vendor.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(java.lang.Double purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }


    /**
     * Gets the receiptQuantity value for this Vendor.
     * 
     * @return receiptQuantity
     */
    public java.lang.Double getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this Vendor.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(java.lang.Double receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }


    /**
     * Gets the receiptAmount value for this Vendor.
     * 
     * @return receiptAmount
     */
    public java.lang.Double getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this Vendor.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(java.lang.Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the receiptQuantityDiff value for this Vendor.
     * 
     * @return receiptQuantityDiff
     */
    public java.lang.Double getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this Vendor.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(java.lang.Double receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }


    /**
     * Gets the workCalendar value for this Vendor.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this Vendor.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(com.netsuite.webservices.platform.core_2019_1.RecordRef workCalendar) {
        this.workCalendar = workCalendar;
    }


    /**
     * Gets the taxIdNum value for this Vendor.
     * 
     * @return taxIdNum
     */
    public java.lang.String getTaxIdNum() {
        return taxIdNum;
    }


    /**
     * Sets the taxIdNum value for this Vendor.
     * 
     * @param taxIdNum
     */
    public void setTaxIdNum(java.lang.String taxIdNum) {
        this.taxIdNum = taxIdNum;
    }


    /**
     * Gets the taxItem value for this Vendor.
     * 
     * @return taxItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this Vendor.
     * 
     * @param taxItem
     */
    public void setTaxItem(com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the giveAccess value for this Vendor.
     * 
     * @return giveAccess
     */
    public java.lang.Boolean getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this Vendor.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(java.lang.Boolean giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the sendEmail value for this Vendor.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this Vendor.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the billPay value for this Vendor.
     * 
     * @return billPay
     */
    public java.lang.Boolean getBillPay() {
        return billPay;
    }


    /**
     * Sets the billPay value for this Vendor.
     * 
     * @param billPay
     */
    public void setBillPay(java.lang.Boolean billPay) {
        this.billPay = billPay;
    }


    /**
     * Gets the isAccountant value for this Vendor.
     * 
     * @return isAccountant
     */
    public java.lang.Boolean getIsAccountant() {
        return isAccountant;
    }


    /**
     * Sets the isAccountant value for this Vendor.
     * 
     * @param isAccountant
     */
    public void setIsAccountant(java.lang.Boolean isAccountant) {
        this.isAccountant = isAccountant;
    }


    /**
     * Gets the password value for this Vendor.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Vendor.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the password2 value for this Vendor.
     * 
     * @return password2
     */
    public java.lang.String getPassword2() {
        return password2;
    }


    /**
     * Sets the password2 value for this Vendor.
     * 
     * @param password2
     */
    public void setPassword2(java.lang.String password2) {
        this.password2 = password2;
    }


    /**
     * Gets the requirePwdChange value for this Vendor.
     * 
     * @return requirePwdChange
     */
    public java.lang.Boolean getRequirePwdChange() {
        return requirePwdChange;
    }


    /**
     * Sets the requirePwdChange value for this Vendor.
     * 
     * @param requirePwdChange
     */
    public void setRequirePwdChange(java.lang.Boolean requirePwdChange) {
        this.requirePwdChange = requirePwdChange;
    }


    /**
     * Gets the eligibleForCommission value for this Vendor.
     * 
     * @return eligibleForCommission
     */
    public java.lang.Boolean getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this Vendor.
     * 
     * @param eligibleForCommission
     */
    public void setEligibleForCommission(java.lang.Boolean eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }


    /**
     * Gets the emailTransactions value for this Vendor.
     * 
     * @return emailTransactions
     */
    public java.lang.Boolean getEmailTransactions() {
        return emailTransactions;
    }


    /**
     * Sets the emailTransactions value for this Vendor.
     * 
     * @param emailTransactions
     */
    public void setEmailTransactions(java.lang.Boolean emailTransactions) {
        this.emailTransactions = emailTransactions;
    }


    /**
     * Gets the printTransactions value for this Vendor.
     * 
     * @return printTransactions
     */
    public java.lang.Boolean getPrintTransactions() {
        return printTransactions;
    }


    /**
     * Sets the printTransactions value for this Vendor.
     * 
     * @param printTransactions
     */
    public void setPrintTransactions(java.lang.Boolean printTransactions) {
        this.printTransactions = printTransactions;
    }


    /**
     * Gets the faxTransactions value for this Vendor.
     * 
     * @return faxTransactions
     */
    public java.lang.Boolean getFaxTransactions() {
        return faxTransactions;
    }


    /**
     * Sets the faxTransactions value for this Vendor.
     * 
     * @param faxTransactions
     */
    public void setFaxTransactions(java.lang.Boolean faxTransactions) {
        this.faxTransactions = faxTransactions;
    }


    /**
     * Gets the defaultTaxReg value for this Vendor.
     * 
     * @return defaultTaxReg
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultTaxReg() {
        return defaultTaxReg;
    }


    /**
     * Sets the defaultTaxReg value for this Vendor.
     * 
     * @param defaultTaxReg
     */
    public void setDefaultTaxReg(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }


    /**
     * Gets the pricingScheduleList value for this Vendor.
     * 
     * @return pricingScheduleList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.VendorPricingScheduleList getPricingScheduleList() {
        return pricingScheduleList;
    }


    /**
     * Sets the pricingScheduleList value for this Vendor.
     * 
     * @param pricingScheduleList
     */
    public void setPricingScheduleList(com.netsuite.webservices.lists.relationships_2019_1.VendorPricingScheduleList pricingScheduleList) {
        this.pricingScheduleList = pricingScheduleList;
    }


    /**
     * Gets the subscriptionsList value for this Vendor.
     * 
     * @return subscriptionsList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }


    /**
     * Sets the subscriptionsList value for this Vendor.
     * 
     * @param subscriptionsList
     */
    public void setSubscriptionsList(com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }


    /**
     * Gets the addressbookList value for this Vendor.
     * 
     * @return addressbookList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.VendorAddressbookList getAddressbookList() {
        return addressbookList;
    }


    /**
     * Sets the addressbookList value for this Vendor.
     * 
     * @param addressbookList
     */
    public void setAddressbookList(com.netsuite.webservices.lists.relationships_2019_1.VendorAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }


    /**
     * Gets the currencyList value for this Vendor.
     * 
     * @return currencyList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.VendorCurrencyList getCurrencyList() {
        return currencyList;
    }


    /**
     * Sets the currencyList value for this Vendor.
     * 
     * @param currencyList
     */
    public void setCurrencyList(com.netsuite.webservices.lists.relationships_2019_1.VendorCurrencyList currencyList) {
        this.currencyList = currencyList;
    }


    /**
     * Gets the rolesList value for this Vendor.
     * 
     * @return rolesList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.VendorRolesList getRolesList() {
        return rolesList;
    }


    /**
     * Sets the rolesList value for this Vendor.
     * 
     * @param rolesList
     */
    public void setRolesList(com.netsuite.webservices.lists.relationships_2019_1.VendorRolesList rolesList) {
        this.rolesList = rolesList;
    }


    /**
     * Gets the taxRegistrationList value for this Vendor.
     * 
     * @return taxRegistrationList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.VendorTaxRegistrationList getTaxRegistrationList() {
        return taxRegistrationList;
    }


    /**
     * Sets the taxRegistrationList value for this Vendor.
     * 
     * @param taxRegistrationList
     */
    public void setTaxRegistrationList(com.netsuite.webservices.lists.relationships_2019_1.VendorTaxRegistrationList taxRegistrationList) {
        this.taxRegistrationList = taxRegistrationList;
    }


    /**
     * Gets the customFieldList value for this Vendor.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Vendor.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Vendor.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Vendor.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Vendor.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Vendor.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vendor)) return false;
        Vendor other = (Vendor) obj;
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
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              this.isPerson.equals(other.getIsPerson()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
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
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.defaultAddress==null && other.getDefaultAddress()==null) || 
             (this.defaultAddress!=null &&
              this.defaultAddress.equals(other.getDefaultAddress()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.printOnCheckAs==null && other.getPrintOnCheckAs()==null) || 
             (this.printOnCheckAs!=null &&
              this.printOnCheckAs.equals(other.getPrintOnCheckAs()))) &&
            ((this.altPhone==null && other.getAltPhone()==null) || 
             (this.altPhone!=null &&
              this.altPhone.equals(other.getAltPhone()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.altEmail==null && other.getAltEmail()==null) || 
             (this.altEmail!=null &&
              this.altEmail.equals(other.getAltEmail()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.emailPreference==null && other.getEmailPreference()==null) || 
             (this.emailPreference!=null &&
              this.emailPreference.equals(other.getEmailPreference()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.representingSubsidiary==null && other.getRepresentingSubsidiary()==null) || 
             (this.representingSubsidiary!=null &&
              this.representingSubsidiary.equals(other.getRepresentingSubsidiary()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.vatRegNumber==null && other.getVatRegNumber()==null) || 
             (this.vatRegNumber!=null &&
              this.vatRegNumber.equals(other.getVatRegNumber()))) &&
            ((this.expenseAccount==null && other.getExpenseAccount()==null) || 
             (this.expenseAccount!=null &&
              this.expenseAccount.equals(other.getExpenseAccount()))) &&
            ((this.payablesAccount==null && other.getPayablesAccount()==null) || 
             (this.payablesAccount!=null &&
              this.payablesAccount.equals(other.getPayablesAccount()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              this.incoterm.equals(other.getIncoterm()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.balancePrimary==null && other.getBalancePrimary()==null) || 
             (this.balancePrimary!=null &&
              this.balancePrimary.equals(other.getBalancePrimary()))) &&
            ((this.openingBalance==null && other.getOpeningBalance()==null) || 
             (this.openingBalance!=null &&
              this.openingBalance.equals(other.getOpeningBalance()))) &&
            ((this.openingBalanceDate==null && other.getOpeningBalanceDate()==null) || 
             (this.openingBalanceDate!=null &&
              this.openingBalanceDate.equals(other.getOpeningBalanceDate()))) &&
            ((this.openingBalanceAccount==null && other.getOpeningBalanceAccount()==null) || 
             (this.openingBalanceAccount!=null &&
              this.openingBalanceAccount.equals(other.getOpeningBalanceAccount()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.unbilledOrdersPrimary==null && other.getUnbilledOrdersPrimary()==null) || 
             (this.unbilledOrdersPrimary!=null &&
              this.unbilledOrdersPrimary.equals(other.getUnbilledOrdersPrimary()))) &&
            ((this.bcn==null && other.getBcn()==null) || 
             (this.bcn!=null &&
              this.bcn.equals(other.getBcn()))) &&
            ((this.unbilledOrders==null && other.getUnbilledOrders()==null) || 
             (this.unbilledOrders!=null &&
              this.unbilledOrders.equals(other.getUnbilledOrders()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.is1099Eligible==null && other.getIs1099Eligible()==null) || 
             (this.is1099Eligible!=null &&
              this.is1099Eligible.equals(other.getIs1099Eligible()))) &&
            ((this.isJobResourceVend==null && other.getIsJobResourceVend()==null) || 
             (this.isJobResourceVend!=null &&
              this.isJobResourceVend.equals(other.getIsJobResourceVend()))) &&
            ((this.laborCost==null && other.getLaborCost()==null) || 
             (this.laborCost!=null &&
              this.laborCost.equals(other.getLaborCost()))) &&
            ((this.purchaseOrderQuantity==null && other.getPurchaseOrderQuantity()==null) || 
             (this.purchaseOrderQuantity!=null &&
              this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity()))) &&
            ((this.purchaseOrderAmount==null && other.getPurchaseOrderAmount()==null) || 
             (this.purchaseOrderAmount!=null &&
              this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount()))) &&
            ((this.purchaseOrderQuantityDiff==null && other.getPurchaseOrderQuantityDiff()==null) || 
             (this.purchaseOrderQuantityDiff!=null &&
              this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff()))) &&
            ((this.receiptQuantity==null && other.getReceiptQuantity()==null) || 
             (this.receiptQuantity!=null &&
              this.receiptQuantity.equals(other.getReceiptQuantity()))) &&
            ((this.receiptAmount==null && other.getReceiptAmount()==null) || 
             (this.receiptAmount!=null &&
              this.receiptAmount.equals(other.getReceiptAmount()))) &&
            ((this.receiptQuantityDiff==null && other.getReceiptQuantityDiff()==null) || 
             (this.receiptQuantityDiff!=null &&
              this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              this.workCalendar.equals(other.getWorkCalendar()))) &&
            ((this.taxIdNum==null && other.getTaxIdNum()==null) || 
             (this.taxIdNum!=null &&
              this.taxIdNum.equals(other.getTaxIdNum()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              this.taxItem.equals(other.getTaxItem()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.billPay==null && other.getBillPay()==null) || 
             (this.billPay!=null &&
              this.billPay.equals(other.getBillPay()))) &&
            ((this.isAccountant==null && other.getIsAccountant()==null) || 
             (this.isAccountant!=null &&
              this.isAccountant.equals(other.getIsAccountant()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.password2==null && other.getPassword2()==null) || 
             (this.password2!=null &&
              this.password2.equals(other.getPassword2()))) &&
            ((this.requirePwdChange==null && other.getRequirePwdChange()==null) || 
             (this.requirePwdChange!=null &&
              this.requirePwdChange.equals(other.getRequirePwdChange()))) &&
            ((this.eligibleForCommission==null && other.getEligibleForCommission()==null) || 
             (this.eligibleForCommission!=null &&
              this.eligibleForCommission.equals(other.getEligibleForCommission()))) &&
            ((this.emailTransactions==null && other.getEmailTransactions()==null) || 
             (this.emailTransactions!=null &&
              this.emailTransactions.equals(other.getEmailTransactions()))) &&
            ((this.printTransactions==null && other.getPrintTransactions()==null) || 
             (this.printTransactions!=null &&
              this.printTransactions.equals(other.getPrintTransactions()))) &&
            ((this.faxTransactions==null && other.getFaxTransactions()==null) || 
             (this.faxTransactions!=null &&
              this.faxTransactions.equals(other.getFaxTransactions()))) &&
            ((this.defaultTaxReg==null && other.getDefaultTaxReg()==null) || 
             (this.defaultTaxReg!=null &&
              this.defaultTaxReg.equals(other.getDefaultTaxReg()))) &&
            ((this.pricingScheduleList==null && other.getPricingScheduleList()==null) || 
             (this.pricingScheduleList!=null &&
              this.pricingScheduleList.equals(other.getPricingScheduleList()))) &&
            ((this.subscriptionsList==null && other.getSubscriptionsList()==null) || 
             (this.subscriptionsList!=null &&
              this.subscriptionsList.equals(other.getSubscriptionsList()))) &&
            ((this.addressbookList==null && other.getAddressbookList()==null) || 
             (this.addressbookList!=null &&
              this.addressbookList.equals(other.getAddressbookList()))) &&
            ((this.currencyList==null && other.getCurrencyList()==null) || 
             (this.currencyList!=null &&
              this.currencyList.equals(other.getCurrencyList()))) &&
            ((this.rolesList==null && other.getRolesList()==null) || 
             (this.rolesList!=null &&
              this.rolesList.equals(other.getRolesList()))) &&
            ((this.taxRegistrationList==null && other.getTaxRegistrationList()==null) || 
             (this.taxRegistrationList!=null &&
              this.taxRegistrationList.equals(other.getTaxRegistrationList()))) &&
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
        if (getIsPerson() != null) {
            _hashCode += getIsPerson().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
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
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getDefaultAddress() != null) {
            _hashCode += getDefaultAddress().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getPrintOnCheckAs() != null) {
            _hashCode += getPrintOnCheckAs().hashCode();
        }
        if (getAltPhone() != null) {
            _hashCode += getAltPhone().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getAltEmail() != null) {
            _hashCode += getAltEmail().hashCode();
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
        if (getEmailPreference() != null) {
            _hashCode += getEmailPreference().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getRepresentingSubsidiary() != null) {
            _hashCode += getRepresentingSubsidiary().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getVatRegNumber() != null) {
            _hashCode += getVatRegNumber().hashCode();
        }
        if (getExpenseAccount() != null) {
            _hashCode += getExpenseAccount().hashCode();
        }
        if (getPayablesAccount() != null) {
            _hashCode += getPayablesAccount().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getIncoterm() != null) {
            _hashCode += getIncoterm().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getBalancePrimary() != null) {
            _hashCode += getBalancePrimary().hashCode();
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getUnbilledOrdersPrimary() != null) {
            _hashCode += getUnbilledOrdersPrimary().hashCode();
        }
        if (getBcn() != null) {
            _hashCode += getBcn().hashCode();
        }
        if (getUnbilledOrders() != null) {
            _hashCode += getUnbilledOrders().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getIs1099Eligible() != null) {
            _hashCode += getIs1099Eligible().hashCode();
        }
        if (getIsJobResourceVend() != null) {
            _hashCode += getIsJobResourceVend().hashCode();
        }
        if (getLaborCost() != null) {
            _hashCode += getLaborCost().hashCode();
        }
        if (getPurchaseOrderQuantity() != null) {
            _hashCode += getPurchaseOrderQuantity().hashCode();
        }
        if (getPurchaseOrderAmount() != null) {
            _hashCode += getPurchaseOrderAmount().hashCode();
        }
        if (getPurchaseOrderQuantityDiff() != null) {
            _hashCode += getPurchaseOrderQuantityDiff().hashCode();
        }
        if (getReceiptQuantity() != null) {
            _hashCode += getReceiptQuantity().hashCode();
        }
        if (getReceiptAmount() != null) {
            _hashCode += getReceiptAmount().hashCode();
        }
        if (getReceiptQuantityDiff() != null) {
            _hashCode += getReceiptQuantityDiff().hashCode();
        }
        if (getWorkCalendar() != null) {
            _hashCode += getWorkCalendar().hashCode();
        }
        if (getTaxIdNum() != null) {
            _hashCode += getTaxIdNum().hashCode();
        }
        if (getTaxItem() != null) {
            _hashCode += getTaxItem().hashCode();
        }
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        if (getBillPay() != null) {
            _hashCode += getBillPay().hashCode();
        }
        if (getIsAccountant() != null) {
            _hashCode += getIsAccountant().hashCode();
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
        if (getEligibleForCommission() != null) {
            _hashCode += getEligibleForCommission().hashCode();
        }
        if (getEmailTransactions() != null) {
            _hashCode += getEmailTransactions().hashCode();
        }
        if (getPrintTransactions() != null) {
            _hashCode += getPrintTransactions().hashCode();
        }
        if (getFaxTransactions() != null) {
            _hashCode += getFaxTransactions().hashCode();
        }
        if (getDefaultTaxReg() != null) {
            _hashCode += getDefaultTaxReg().hashCode();
        }
        if (getPricingScheduleList() != null) {
            _hashCode += getPricingScheduleList().hashCode();
        }
        if (getSubscriptionsList() != null) {
            _hashCode += getSubscriptionsList().hashCode();
        }
        if (getAddressbookList() != null) {
            _hashCode += getAddressbookList().hashCode();
        }
        if (getCurrencyList() != null) {
            _hashCode += getCurrencyList().hashCode();
        }
        if (getRolesList() != null) {
            _hashCode += getRolesList().hashCode();
        }
        if (getTaxRegistrationList() != null) {
            _hashCode += getTaxRegistrationList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Vendor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "Vendor"));
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
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastName"));
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
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printOnCheckAs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "printOnCheckAs"));
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
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "altEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representingSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "representingSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "payablesAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancePrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "balancePrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledOrdersPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "unbilledOrdersPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bcn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "bcn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("is1099Eligible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "is1099Eligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isJobResourceVend");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isJobResourceVend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxIdNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("isAccountant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isAccountant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "password2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requirePwdChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "requirePwdChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "printTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingScheduleList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "pricingScheduleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorPricingScheduleList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subscriptionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "SubscriptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorAddressbookList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "currencyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorCurrencyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "rolesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorRolesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxRegistrationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorTaxRegistrationList"));
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
