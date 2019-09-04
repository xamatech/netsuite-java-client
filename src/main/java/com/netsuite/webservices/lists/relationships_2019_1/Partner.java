/**
 * Partner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class Partner  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String entityId;

    private java.lang.String altName;

    private java.lang.String partnerCode;

    private java.lang.Boolean isPerson;

    private java.lang.String phoneticName;

    private java.lang.String salutation;

    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String lastName;

    private java.lang.String companyName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private java.lang.String phone;

    private java.lang.String fax;

    private java.lang.String email;

    private java.lang.String url;

    private java.lang.String defaultAddress;

    private java.lang.Boolean isInactive;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar dateCreated;

    private com.netsuite.webservices.lists.relationships_2019_1.PartnerTaxRegistrationList taxRegistrationList;

    private com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus;

    private java.lang.String referringUrl;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList roleList;

    private com.netsuite.webservices.lists.relationships_2019_1.CategoryList categoryList;

    private java.lang.String title;

    private java.lang.String printOnCheckAs;

    private java.lang.String taxIdNum;

    private java.lang.String vatRegNumber;

    private java.lang.String comments;

    private java.lang.String bcn;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef image;

    private com.netsuite.webservices.lists.relationships_2019_1.types.TaxFractionUnit taxFractionUnit;

    private com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultTaxReg;

    private com.netsuite.webservices.lists.relationships_2019_1.types.TaxRounding taxRounding;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private java.lang.String homePhone;

    private java.lang.String mobilePhone;

    private java.lang.String altEmail;

    private java.lang.Boolean giveAccess;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef accessRole;

    private java.lang.Boolean sendEmail;

    private java.lang.String password;

    private java.lang.String password2;

    private java.lang.Boolean requirePwdChange;

    private java.lang.Boolean subPartnerLogin;

    private java.lang.String loginAs;

    private java.lang.Boolean eligibleForCommission;

    private com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRolesList contactRolesList;

    private com.netsuite.webservices.lists.relationships_2019_1.PartnerPromoCodeList promoCodeList;

    private com.netsuite.webservices.lists.relationships_2019_1.PartnerAddressbookList addressbookList;

    private com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Partner() {
    }

    public Partner(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String entityId,
           java.lang.String altName,
           java.lang.String partnerCode,
           java.lang.Boolean isPerson,
           java.lang.String phoneticName,
           java.lang.String salutation,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String lastName,
           java.lang.String companyName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           java.lang.String phone,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String url,
           java.lang.String defaultAddress,
           java.lang.Boolean isInactive,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar dateCreated,
           com.netsuite.webservices.lists.relationships_2019_1.PartnerTaxRegistrationList taxRegistrationList,
           com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus,
           java.lang.String referringUrl,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList roleList,
           com.netsuite.webservices.lists.relationships_2019_1.CategoryList categoryList,
           java.lang.String title,
           java.lang.String printOnCheckAs,
           java.lang.String taxIdNum,
           java.lang.String vatRegNumber,
           java.lang.String comments,
           java.lang.String bcn,
           com.netsuite.webservices.platform.core_2019_1.RecordRef image,
           com.netsuite.webservices.lists.relationships_2019_1.types.TaxFractionUnit taxFractionUnit,
           com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultTaxReg,
           com.netsuite.webservices.lists.relationships_2019_1.types.TaxRounding taxRounding,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           java.lang.String homePhone,
           java.lang.String mobilePhone,
           java.lang.String altEmail,
           java.lang.Boolean giveAccess,
           com.netsuite.webservices.platform.core_2019_1.RecordRef accessRole,
           java.lang.Boolean sendEmail,
           java.lang.String password,
           java.lang.String password2,
           java.lang.Boolean requirePwdChange,
           java.lang.Boolean subPartnerLogin,
           java.lang.String loginAs,
           java.lang.Boolean eligibleForCommission,
           com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRolesList contactRolesList,
           com.netsuite.webservices.lists.relationships_2019_1.PartnerPromoCodeList promoCodeList,
           com.netsuite.webservices.lists.relationships_2019_1.PartnerAddressbookList addressbookList,
           com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.entityId = entityId;
        this.altName = altName;
        this.partnerCode = partnerCode;
        this.isPerson = isPerson;
        this.phoneticName = phoneticName;
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.parent = parent;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.url = url;
        this.defaultAddress = defaultAddress;
        this.isInactive = isInactive;
        this.lastModifiedDate = lastModifiedDate;
        this.dateCreated = dateCreated;
        this.taxRegistrationList = taxRegistrationList;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.referringUrl = referringUrl;
        this.roleList = roleList;
        this.categoryList = categoryList;
        this.title = title;
        this.printOnCheckAs = printOnCheckAs;
        this.taxIdNum = taxIdNum;
        this.vatRegNumber = vatRegNumber;
        this.comments = comments;
        this.bcn = bcn;
        this.image = image;
        this.taxFractionUnit = taxFractionUnit;
        this.emailPreference = emailPreference;
        this.defaultTaxReg = defaultTaxReg;
        this.taxRounding = taxRounding;
        this.department = department;
        this.location = location;
        this._class = _class;
        this.subsidiary = subsidiary;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.altEmail = altEmail;
        this.giveAccess = giveAccess;
        this.accessRole = accessRole;
        this.sendEmail = sendEmail;
        this.password = password;
        this.password2 = password2;
        this.requirePwdChange = requirePwdChange;
        this.subPartnerLogin = subPartnerLogin;
        this.loginAs = loginAs;
        this.eligibleForCommission = eligibleForCommission;
        this.contactRolesList = contactRolesList;
        this.promoCodeList = promoCodeList;
        this.addressbookList = addressbookList;
        this.subscriptionsList = subscriptionsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Partner.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Partner.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the entityId value for this Partner.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this Partner.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the altName value for this Partner.
     * 
     * @return altName
     */
    public java.lang.String getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this Partner.
     * 
     * @param altName
     */
    public void setAltName(java.lang.String altName) {
        this.altName = altName;
    }


    /**
     * Gets the partnerCode value for this Partner.
     * 
     * @return partnerCode
     */
    public java.lang.String getPartnerCode() {
        return partnerCode;
    }


    /**
     * Sets the partnerCode value for this Partner.
     * 
     * @param partnerCode
     */
    public void setPartnerCode(java.lang.String partnerCode) {
        this.partnerCode = partnerCode;
    }


    /**
     * Gets the isPerson value for this Partner.
     * 
     * @return isPerson
     */
    public java.lang.Boolean getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this Partner.
     * 
     * @param isPerson
     */
    public void setIsPerson(java.lang.Boolean isPerson) {
        this.isPerson = isPerson;
    }


    /**
     * Gets the phoneticName value for this Partner.
     * 
     * @return phoneticName
     */
    public java.lang.String getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this Partner.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(java.lang.String phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the salutation value for this Partner.
     * 
     * @return salutation
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this Partner.
     * 
     * @param salutation
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the firstName value for this Partner.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Partner.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this Partner.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this Partner.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the lastName value for this Partner.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Partner.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the companyName value for this Partner.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Partner.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the parent value for this Partner.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Partner.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the phone value for this Partner.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Partner.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this Partner.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Partner.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Partner.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Partner.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the url value for this Partner.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Partner.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the defaultAddress value for this Partner.
     * 
     * @return defaultAddress
     */
    public java.lang.String getDefaultAddress() {
        return defaultAddress;
    }


    /**
     * Sets the defaultAddress value for this Partner.
     * 
     * @param defaultAddress
     */
    public void setDefaultAddress(java.lang.String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }


    /**
     * Gets the isInactive value for this Partner.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Partner.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the lastModifiedDate value for this Partner.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Partner.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the dateCreated value for this Partner.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Partner.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the taxRegistrationList value for this Partner.
     * 
     * @return taxRegistrationList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.PartnerTaxRegistrationList getTaxRegistrationList() {
        return taxRegistrationList;
    }


    /**
     * Sets the taxRegistrationList value for this Partner.
     * 
     * @param taxRegistrationList
     */
    public void setTaxRegistrationList(com.netsuite.webservices.lists.relationships_2019_1.PartnerTaxRegistrationList taxRegistrationList) {
        this.taxRegistrationList = taxRegistrationList;
    }


    /**
     * Gets the globalSubscriptionStatus value for this Partner.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this Partner.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the referringUrl value for this Partner.
     * 
     * @return referringUrl
     */
    public java.lang.String getReferringUrl() {
        return referringUrl;
    }


    /**
     * Sets the referringUrl value for this Partner.
     * 
     * @param referringUrl
     */
    public void setReferringUrl(java.lang.String referringUrl) {
        this.referringUrl = referringUrl;
    }


    /**
     * Gets the roleList value for this Partner.
     * 
     * @return roleList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getRoleList() {
        return roleList;
    }


    /**
     * Sets the roleList value for this Partner.
     * 
     * @param roleList
     */
    public void setRoleList(com.netsuite.webservices.platform.core_2019_1.RecordRefList roleList) {
        this.roleList = roleList;
    }


    /**
     * Gets the categoryList value for this Partner.
     * 
     * @return categoryList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CategoryList getCategoryList() {
        return categoryList;
    }


    /**
     * Sets the categoryList value for this Partner.
     * 
     * @param categoryList
     */
    public void setCategoryList(com.netsuite.webservices.lists.relationships_2019_1.CategoryList categoryList) {
        this.categoryList = categoryList;
    }


    /**
     * Gets the title value for this Partner.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Partner.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the printOnCheckAs value for this Partner.
     * 
     * @return printOnCheckAs
     */
    public java.lang.String getPrintOnCheckAs() {
        return printOnCheckAs;
    }


    /**
     * Sets the printOnCheckAs value for this Partner.
     * 
     * @param printOnCheckAs
     */
    public void setPrintOnCheckAs(java.lang.String printOnCheckAs) {
        this.printOnCheckAs = printOnCheckAs;
    }


    /**
     * Gets the taxIdNum value for this Partner.
     * 
     * @return taxIdNum
     */
    public java.lang.String getTaxIdNum() {
        return taxIdNum;
    }


    /**
     * Sets the taxIdNum value for this Partner.
     * 
     * @param taxIdNum
     */
    public void setTaxIdNum(java.lang.String taxIdNum) {
        this.taxIdNum = taxIdNum;
    }


    /**
     * Gets the vatRegNumber value for this Partner.
     * 
     * @return vatRegNumber
     */
    public java.lang.String getVatRegNumber() {
        return vatRegNumber;
    }


    /**
     * Sets the vatRegNumber value for this Partner.
     * 
     * @param vatRegNumber
     */
    public void setVatRegNumber(java.lang.String vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }


    /**
     * Gets the comments value for this Partner.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Partner.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the bcn value for this Partner.
     * 
     * @return bcn
     */
    public java.lang.String getBcn() {
        return bcn;
    }


    /**
     * Sets the bcn value for this Partner.
     * 
     * @param bcn
     */
    public void setBcn(java.lang.String bcn) {
        this.bcn = bcn;
    }


    /**
     * Gets the image value for this Partner.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getImage() {
        return image;
    }


    /**
     * Sets the image value for this Partner.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2019_1.RecordRef image) {
        this.image = image;
    }


    /**
     * Gets the taxFractionUnit value for this Partner.
     * 
     * @return taxFractionUnit
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.TaxFractionUnit getTaxFractionUnit() {
        return taxFractionUnit;
    }


    /**
     * Sets the taxFractionUnit value for this Partner.
     * 
     * @param taxFractionUnit
     */
    public void setTaxFractionUnit(com.netsuite.webservices.lists.relationships_2019_1.types.TaxFractionUnit taxFractionUnit) {
        this.taxFractionUnit = taxFractionUnit;
    }


    /**
     * Gets the emailPreference value for this Partner.
     * 
     * @return emailPreference
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference getEmailPreference() {
        return emailPreference;
    }


    /**
     * Sets the emailPreference value for this Partner.
     * 
     * @param emailPreference
     */
    public void setEmailPreference(com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference) {
        this.emailPreference = emailPreference;
    }


    /**
     * Gets the defaultTaxReg value for this Partner.
     * 
     * @return defaultTaxReg
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultTaxReg() {
        return defaultTaxReg;
    }


    /**
     * Sets the defaultTaxReg value for this Partner.
     * 
     * @param defaultTaxReg
     */
    public void setDefaultTaxReg(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }


    /**
     * Gets the taxRounding value for this Partner.
     * 
     * @return taxRounding
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.TaxRounding getTaxRounding() {
        return taxRounding;
    }


    /**
     * Sets the taxRounding value for this Partner.
     * 
     * @param taxRounding
     */
    public void setTaxRounding(com.netsuite.webservices.lists.relationships_2019_1.types.TaxRounding taxRounding) {
        this.taxRounding = taxRounding;
    }


    /**
     * Gets the department value for this Partner.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Partner.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this Partner.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Partner.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the _class value for this Partner.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Partner.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the subsidiary value for this Partner.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Partner.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the homePhone value for this Partner.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this Partner.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the mobilePhone value for this Partner.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this Partner.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the altEmail value for this Partner.
     * 
     * @return altEmail
     */
    public java.lang.String getAltEmail() {
        return altEmail;
    }


    /**
     * Sets the altEmail value for this Partner.
     * 
     * @param altEmail
     */
    public void setAltEmail(java.lang.String altEmail) {
        this.altEmail = altEmail;
    }


    /**
     * Gets the giveAccess value for this Partner.
     * 
     * @return giveAccess
     */
    public java.lang.Boolean getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this Partner.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(java.lang.Boolean giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the accessRole value for this Partner.
     * 
     * @return accessRole
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccessRole() {
        return accessRole;
    }


    /**
     * Sets the accessRole value for this Partner.
     * 
     * @param accessRole
     */
    public void setAccessRole(com.netsuite.webservices.platform.core_2019_1.RecordRef accessRole) {
        this.accessRole = accessRole;
    }


    /**
     * Gets the sendEmail value for this Partner.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this Partner.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the password value for this Partner.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Partner.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the password2 value for this Partner.
     * 
     * @return password2
     */
    public java.lang.String getPassword2() {
        return password2;
    }


    /**
     * Sets the password2 value for this Partner.
     * 
     * @param password2
     */
    public void setPassword2(java.lang.String password2) {
        this.password2 = password2;
    }


    /**
     * Gets the requirePwdChange value for this Partner.
     * 
     * @return requirePwdChange
     */
    public java.lang.Boolean getRequirePwdChange() {
        return requirePwdChange;
    }


    /**
     * Sets the requirePwdChange value for this Partner.
     * 
     * @param requirePwdChange
     */
    public void setRequirePwdChange(java.lang.Boolean requirePwdChange) {
        this.requirePwdChange = requirePwdChange;
    }


    /**
     * Gets the subPartnerLogin value for this Partner.
     * 
     * @return subPartnerLogin
     */
    public java.lang.Boolean getSubPartnerLogin() {
        return subPartnerLogin;
    }


    /**
     * Sets the subPartnerLogin value for this Partner.
     * 
     * @param subPartnerLogin
     */
    public void setSubPartnerLogin(java.lang.Boolean subPartnerLogin) {
        this.subPartnerLogin = subPartnerLogin;
    }


    /**
     * Gets the loginAs value for this Partner.
     * 
     * @return loginAs
     */
    public java.lang.String getLoginAs() {
        return loginAs;
    }


    /**
     * Sets the loginAs value for this Partner.
     * 
     * @param loginAs
     */
    public void setLoginAs(java.lang.String loginAs) {
        this.loginAs = loginAs;
    }


    /**
     * Gets the eligibleForCommission value for this Partner.
     * 
     * @return eligibleForCommission
     */
    public java.lang.Boolean getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this Partner.
     * 
     * @param eligibleForCommission
     */
    public void setEligibleForCommission(java.lang.Boolean eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }


    /**
     * Gets the contactRolesList value for this Partner.
     * 
     * @return contactRolesList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRolesList getContactRolesList() {
        return contactRolesList;
    }


    /**
     * Sets the contactRolesList value for this Partner.
     * 
     * @param contactRolesList
     */
    public void setContactRolesList(com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRolesList contactRolesList) {
        this.contactRolesList = contactRolesList;
    }


    /**
     * Gets the promoCodeList value for this Partner.
     * 
     * @return promoCodeList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.PartnerPromoCodeList getPromoCodeList() {
        return promoCodeList;
    }


    /**
     * Sets the promoCodeList value for this Partner.
     * 
     * @param promoCodeList
     */
    public void setPromoCodeList(com.netsuite.webservices.lists.relationships_2019_1.PartnerPromoCodeList promoCodeList) {
        this.promoCodeList = promoCodeList;
    }


    /**
     * Gets the addressbookList value for this Partner.
     * 
     * @return addressbookList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.PartnerAddressbookList getAddressbookList() {
        return addressbookList;
    }


    /**
     * Sets the addressbookList value for this Partner.
     * 
     * @param addressbookList
     */
    public void setAddressbookList(com.netsuite.webservices.lists.relationships_2019_1.PartnerAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }


    /**
     * Gets the subscriptionsList value for this Partner.
     * 
     * @return subscriptionsList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }


    /**
     * Sets the subscriptionsList value for this Partner.
     * 
     * @param subscriptionsList
     */
    public void setSubscriptionsList(com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }


    /**
     * Gets the customFieldList value for this Partner.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Partner.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Partner.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Partner.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Partner.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Partner.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Partner)) return false;
        Partner other = (Partner) obj;
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
            ((this.partnerCode==null && other.getPartnerCode()==null) || 
             (this.partnerCode!=null &&
              this.partnerCode.equals(other.getPartnerCode()))) &&
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
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
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
            ((this.taxRegistrationList==null && other.getTaxRegistrationList()==null) || 
             (this.taxRegistrationList!=null &&
              this.taxRegistrationList.equals(other.getTaxRegistrationList()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.referringUrl==null && other.getReferringUrl()==null) || 
             (this.referringUrl!=null &&
              this.referringUrl.equals(other.getReferringUrl()))) &&
            ((this.roleList==null && other.getRoleList()==null) || 
             (this.roleList!=null &&
              this.roleList.equals(other.getRoleList()))) &&
            ((this.categoryList==null && other.getCategoryList()==null) || 
             (this.categoryList!=null &&
              this.categoryList.equals(other.getCategoryList()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.printOnCheckAs==null && other.getPrintOnCheckAs()==null) || 
             (this.printOnCheckAs!=null &&
              this.printOnCheckAs.equals(other.getPrintOnCheckAs()))) &&
            ((this.taxIdNum==null && other.getTaxIdNum()==null) || 
             (this.taxIdNum!=null &&
              this.taxIdNum.equals(other.getTaxIdNum()))) &&
            ((this.vatRegNumber==null && other.getVatRegNumber()==null) || 
             (this.vatRegNumber!=null &&
              this.vatRegNumber.equals(other.getVatRegNumber()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.bcn==null && other.getBcn()==null) || 
             (this.bcn!=null &&
              this.bcn.equals(other.getBcn()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.taxFractionUnit==null && other.getTaxFractionUnit()==null) || 
             (this.taxFractionUnit!=null &&
              this.taxFractionUnit.equals(other.getTaxFractionUnit()))) &&
            ((this.emailPreference==null && other.getEmailPreference()==null) || 
             (this.emailPreference!=null &&
              this.emailPreference.equals(other.getEmailPreference()))) &&
            ((this.defaultTaxReg==null && other.getDefaultTaxReg()==null) || 
             (this.defaultTaxReg!=null &&
              this.defaultTaxReg.equals(other.getDefaultTaxReg()))) &&
            ((this.taxRounding==null && other.getTaxRounding()==null) || 
             (this.taxRounding!=null &&
              this.taxRounding.equals(other.getTaxRounding()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.altEmail==null && other.getAltEmail()==null) || 
             (this.altEmail!=null &&
              this.altEmail.equals(other.getAltEmail()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.accessRole==null && other.getAccessRole()==null) || 
             (this.accessRole!=null &&
              this.accessRole.equals(other.getAccessRole()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.password2==null && other.getPassword2()==null) || 
             (this.password2!=null &&
              this.password2.equals(other.getPassword2()))) &&
            ((this.requirePwdChange==null && other.getRequirePwdChange()==null) || 
             (this.requirePwdChange!=null &&
              this.requirePwdChange.equals(other.getRequirePwdChange()))) &&
            ((this.subPartnerLogin==null && other.getSubPartnerLogin()==null) || 
             (this.subPartnerLogin!=null &&
              this.subPartnerLogin.equals(other.getSubPartnerLogin()))) &&
            ((this.loginAs==null && other.getLoginAs()==null) || 
             (this.loginAs!=null &&
              this.loginAs.equals(other.getLoginAs()))) &&
            ((this.eligibleForCommission==null && other.getEligibleForCommission()==null) || 
             (this.eligibleForCommission!=null &&
              this.eligibleForCommission.equals(other.getEligibleForCommission()))) &&
            ((this.contactRolesList==null && other.getContactRolesList()==null) || 
             (this.contactRolesList!=null &&
              this.contactRolesList.equals(other.getContactRolesList()))) &&
            ((this.promoCodeList==null && other.getPromoCodeList()==null) || 
             (this.promoCodeList!=null &&
              this.promoCodeList.equals(other.getPromoCodeList()))) &&
            ((this.addressbookList==null && other.getAddressbookList()==null) || 
             (this.addressbookList!=null &&
              this.addressbookList.equals(other.getAddressbookList()))) &&
            ((this.subscriptionsList==null && other.getSubscriptionsList()==null) || 
             (this.subscriptionsList!=null &&
              this.subscriptionsList.equals(other.getSubscriptionsList()))) &&
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
        if (getPartnerCode() != null) {
            _hashCode += getPartnerCode().hashCode();
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
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
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
        if (getTaxRegistrationList() != null) {
            _hashCode += getTaxRegistrationList().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getReferringUrl() != null) {
            _hashCode += getReferringUrl().hashCode();
        }
        if (getRoleList() != null) {
            _hashCode += getRoleList().hashCode();
        }
        if (getCategoryList() != null) {
            _hashCode += getCategoryList().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getPrintOnCheckAs() != null) {
            _hashCode += getPrintOnCheckAs().hashCode();
        }
        if (getTaxIdNum() != null) {
            _hashCode += getTaxIdNum().hashCode();
        }
        if (getVatRegNumber() != null) {
            _hashCode += getVatRegNumber().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getBcn() != null) {
            _hashCode += getBcn().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getTaxFractionUnit() != null) {
            _hashCode += getTaxFractionUnit().hashCode();
        }
        if (getEmailPreference() != null) {
            _hashCode += getEmailPreference().hashCode();
        }
        if (getDefaultTaxReg() != null) {
            _hashCode += getDefaultTaxReg().hashCode();
        }
        if (getTaxRounding() != null) {
            _hashCode += getTaxRounding().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
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
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getAccessRole() != null) {
            _hashCode += getAccessRole().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
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
        if (getSubPartnerLogin() != null) {
            _hashCode += getSubPartnerLogin().hashCode();
        }
        if (getLoginAs() != null) {
            _hashCode += getLoginAs().hashCode();
        }
        if (getEligibleForCommission() != null) {
            _hashCode += getEligibleForCommission().hashCode();
        }
        if (getContactRolesList() != null) {
            _hashCode += getContactRolesList().hashCode();
        }
        if (getPromoCodeList() != null) {
            _hashCode += getPromoCodeList().hashCode();
        }
        if (getAddressbookList() != null) {
            _hashCode += getAddressbookList().hashCode();
        }
        if (getSubscriptionsList() != null) {
            _hashCode += getSubscriptionsList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Partner.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "Partner"));
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
        elemField.setFieldName("partnerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "partnerCode"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("taxRegistrationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxRegistrationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "PartnerTaxRegistrationList"));
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
        elemField.setFieldName("referringUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "referringUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "roleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "categoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CategoryList"));
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
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxIdNum"));
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
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxFractionUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxFractionUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "TaxFractionUnit"));
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
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRounding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxRounding"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "TaxRounding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "class"));
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
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "accessRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("subPartnerLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subPartnerLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginAs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "loginAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("contactRolesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactRolesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ContactAccessRolesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCodeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "promoCodeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "PartnerPromoCodeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "PartnerAddressbookList"));
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
