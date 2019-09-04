/**
 * VendorSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class VendorSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchStringField accountNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField address;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField addressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField addressLabel;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField addressPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField attention;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField city;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField comments;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField county;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditLimit;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField currentExchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultTaxReg;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField defaultTaxRegText;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField eligibleForCommission;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField email;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField emailPreference;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField emailTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField entityId;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField expenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField fax;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField faxTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField firstName;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxUnbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField giveAccess;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField group;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasDuplicates;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField image;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incoterm;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField is1099Eligible;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultBilling;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultShipping;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isJobResourceVend;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPerson;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField laborCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField language;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField lastName;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField level;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField middleName;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField otherRelationships;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payablesAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField pec;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField permission;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField phoneticName;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField printTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField salutation;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField state;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField taxIdNum;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField timeApprover;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField title;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField url;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField vatRegNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workCalendar;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField zipCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public VendorSearchBasic() {
    }

    public VendorSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchStringField accountNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField address,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField addressee,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField addressLabel,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField addressPhone,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField attention,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField city,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField comments,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField contact,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField county,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditLimit,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField currentExchangeRate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultTaxReg,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField defaultTaxRegText,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField eligibleForCommission,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField email,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField emailPreference,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField emailTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField entityId,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField expenseAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField fax,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField faxTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField firstName,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxUnbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField giveAccess,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField group,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasDuplicates,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField image,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incoterm,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField is1099Eligible,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultBilling,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultShipping,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isJobResourceVend,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPerson,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField laborCost,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField language,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField lastName,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField level,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField middleName,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField otherRelationships,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payablesAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField pec,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField permission,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField phone,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField phoneticName,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField printTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField salutation,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField state,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField taxIdNum,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField timeApprover,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField title,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField url,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField vatRegNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workCalendar,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField zipCode,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.attention = attention;
        this.balance = balance;
        this.billAddress = billAddress;
        this.category = category;
        this.city = city;
        this.comments = comments;
        this.contact = contact;
        this.country = country;
        this.county = county;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.currentExchangeRate = currentExchangeRate;
        this.dateCreated = dateCreated;
        this.defaultTaxReg = defaultTaxReg;
        this.defaultTaxRegText = defaultTaxRegText;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.emailPreference = emailPreference;
        this.emailTransactions = emailTransactions;
        this.entityId = entityId;
        this.expenseAccount = expenseAccount;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.faxTransactions = faxTransactions;
        this.firstName = firstName;
        this.fxBalance = fxBalance;
        this.fxUnbilledOrders = fxUnbilledOrders;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.group = group;
        this.hasDuplicates = hasDuplicates;
        this.image = image;
        this.incoterm = incoterm;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.is1099Eligible = is1099Eligible;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isJobResourceVend = isJobResourceVend;
        this.isPerson = isPerson;
        this.laborCost = laborCost;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.level = level;
        this.middleName = middleName;
        this.otherRelationships = otherRelationships;
        this.payablesAccount = payablesAccount;
        this.pec = pec;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.printTransactions = printTransactions;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptAmount = receiptAmount;
        this.receiptQuantity = receiptQuantity;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.state = state;
        this.subsidiary = subsidiary;
        this.taxIdNum = taxIdNum;
        this.timeApprover = timeApprover;
        this.title = title;
        this.unbilledOrders = unbilledOrders;
        this.url = url;
        this.vatRegNumber = vatRegNumber;
        this.workCalendar = workCalendar;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountNumber value for this VendorSearchBasic.
     * 
     * @return accountNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this VendorSearchBasic.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the address value for this VendorSearchBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this VendorSearchBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the addressee value for this VendorSearchBasic.
     * 
     * @return addressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this VendorSearchBasic.
     * 
     * @param addressee
     */
    public void setAddressee(com.netsuite.webservices.platform.core_2019_1.SearchStringField addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addressLabel value for this VendorSearchBasic.
     * 
     * @return addressLabel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this VendorSearchBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(com.netsuite.webservices.platform.core_2019_1.SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }


    /**
     * Gets the addressPhone value for this VendorSearchBasic.
     * 
     * @return addressPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this VendorSearchBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }


    /**
     * Gets the attention value for this VendorSearchBasic.
     * 
     * @return attention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this VendorSearchBasic.
     * 
     * @param attention
     */
    public void setAttention(com.netsuite.webservices.platform.core_2019_1.SearchStringField attention) {
        this.attention = attention;
    }


    /**
     * Gets the balance value for this VendorSearchBasic.
     * 
     * @return balance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this VendorSearchBasic.
     * 
     * @param balance
     */
    public void setBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance) {
        this.balance = balance;
    }


    /**
     * Gets the billAddress value for this VendorSearchBasic.
     * 
     * @return billAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this VendorSearchBasic.
     * 
     * @param billAddress
     */
    public void setBillAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddress) {
        this.billAddress = billAddress;
    }


    /**
     * Gets the category value for this VendorSearchBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this VendorSearchBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the city value for this VendorSearchBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this VendorSearchBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the comments value for this VendorSearchBasic.
     * 
     * @return comments
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this VendorSearchBasic.
     * 
     * @param comments
     */
    public void setComments(com.netsuite.webservices.platform.core_2019_1.SearchStringField comments) {
        this.comments = comments;
    }


    /**
     * Gets the contact value for this VendorSearchBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this VendorSearchBasic.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.SearchStringField contact) {
        this.contact = contact;
    }


    /**
     * Gets the country value for this VendorSearchBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this VendorSearchBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this VendorSearchBasic.
     * 
     * @return county
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this VendorSearchBasic.
     * 
     * @param county
     */
    public void setCounty(com.netsuite.webservices.platform.core_2019_1.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the creditLimit value for this VendorSearchBasic.
     * 
     * @return creditLimit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this VendorSearchBasic.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the currency value for this VendorSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this VendorSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the currentExchangeRate value for this VendorSearchBasic.
     * 
     * @return currentExchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCurrentExchangeRate() {
        return currentExchangeRate;
    }


    /**
     * Sets the currentExchangeRate value for this VendorSearchBasic.
     * 
     * @param currentExchangeRate
     */
    public void setCurrentExchangeRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField currentExchangeRate) {
        this.currentExchangeRate = currentExchangeRate;
    }


    /**
     * Gets the dateCreated value for this VendorSearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this VendorSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the defaultTaxReg value for this VendorSearchBasic.
     * 
     * @return defaultTaxReg
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDefaultTaxReg() {
        return defaultTaxReg;
    }


    /**
     * Sets the defaultTaxReg value for this VendorSearchBasic.
     * 
     * @param defaultTaxReg
     */
    public void setDefaultTaxReg(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }


    /**
     * Gets the defaultTaxRegText value for this VendorSearchBasic.
     * 
     * @return defaultTaxRegText
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDefaultTaxRegText() {
        return defaultTaxRegText;
    }


    /**
     * Sets the defaultTaxRegText value for this VendorSearchBasic.
     * 
     * @param defaultTaxRegText
     */
    public void setDefaultTaxRegText(com.netsuite.webservices.platform.core_2019_1.SearchStringField defaultTaxRegText) {
        this.defaultTaxRegText = defaultTaxRegText;
    }


    /**
     * Gets the eligibleForCommission value for this VendorSearchBasic.
     * 
     * @return eligibleForCommission
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this VendorSearchBasic.
     * 
     * @param eligibleForCommission
     */
    public void setEligibleForCommission(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }


    /**
     * Gets the email value for this VendorSearchBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this VendorSearchBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the emailPreference value for this VendorSearchBasic.
     * 
     * @return emailPreference
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getEmailPreference() {
        return emailPreference;
    }


    /**
     * Sets the emailPreference value for this VendorSearchBasic.
     * 
     * @param emailPreference
     */
    public void setEmailPreference(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField emailPreference) {
        this.emailPreference = emailPreference;
    }


    /**
     * Gets the emailTransactions value for this VendorSearchBasic.
     * 
     * @return emailTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getEmailTransactions() {
        return emailTransactions;
    }


    /**
     * Sets the emailTransactions value for this VendorSearchBasic.
     * 
     * @param emailTransactions
     */
    public void setEmailTransactions(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField emailTransactions) {
        this.emailTransactions = emailTransactions;
    }


    /**
     * Gets the entityId value for this VendorSearchBasic.
     * 
     * @return entityId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this VendorSearchBasic.
     * 
     * @param entityId
     */
    public void setEntityId(com.netsuite.webservices.platform.core_2019_1.SearchStringField entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the expenseAccount value for this VendorSearchBasic.
     * 
     * @return expenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this VendorSearchBasic.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField expenseAccount) {
        this.expenseAccount = expenseAccount;
    }


    /**
     * Gets the externalId value for this VendorSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this VendorSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this VendorSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this VendorSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fax value for this VendorSearchBasic.
     * 
     * @return fax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this VendorSearchBasic.
     * 
     * @param fax
     */
    public void setFax(com.netsuite.webservices.platform.core_2019_1.SearchStringField fax) {
        this.fax = fax;
    }


    /**
     * Gets the faxTransactions value for this VendorSearchBasic.
     * 
     * @return faxTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getFaxTransactions() {
        return faxTransactions;
    }


    /**
     * Sets the faxTransactions value for this VendorSearchBasic.
     * 
     * @param faxTransactions
     */
    public void setFaxTransactions(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField faxTransactions) {
        this.faxTransactions = faxTransactions;
    }


    /**
     * Gets the firstName value for this VendorSearchBasic.
     * 
     * @return firstName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this VendorSearchBasic.
     * 
     * @param firstName
     */
    public void setFirstName(com.netsuite.webservices.platform.core_2019_1.SearchStringField firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the fxBalance value for this VendorSearchBasic.
     * 
     * @return fxBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxBalance() {
        return fxBalance;
    }


    /**
     * Sets the fxBalance value for this VendorSearchBasic.
     * 
     * @param fxBalance
     */
    public void setFxBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxBalance) {
        this.fxBalance = fxBalance;
    }


    /**
     * Gets the fxUnbilledOrders value for this VendorSearchBasic.
     * 
     * @return fxUnbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxUnbilledOrders() {
        return fxUnbilledOrders;
    }


    /**
     * Sets the fxUnbilledOrders value for this VendorSearchBasic.
     * 
     * @param fxUnbilledOrders
     */
    public void setFxUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxUnbilledOrders) {
        this.fxUnbilledOrders = fxUnbilledOrders;
    }


    /**
     * Gets the giveAccess value for this VendorSearchBasic.
     * 
     * @return giveAccess
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this VendorSearchBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the globalSubscriptionStatus value for this VendorSearchBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this VendorSearchBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the group value for this VendorSearchBasic.
     * 
     * @return group
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getGroup() {
        return group;
    }


    /**
     * Sets the group value for this VendorSearchBasic.
     * 
     * @param group
     */
    public void setGroup(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField group) {
        this.group = group;
    }


    /**
     * Gets the hasDuplicates value for this VendorSearchBasic.
     * 
     * @return hasDuplicates
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getHasDuplicates() {
        return hasDuplicates;
    }


    /**
     * Sets the hasDuplicates value for this VendorSearchBasic.
     * 
     * @param hasDuplicates
     */
    public void setHasDuplicates(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }


    /**
     * Gets the image value for this VendorSearchBasic.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getImage() {
        return image;
    }


    /**
     * Sets the image value for this VendorSearchBasic.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2019_1.SearchStringField image) {
        this.image = image;
    }


    /**
     * Gets the incoterm value for this VendorSearchBasic.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this VendorSearchBasic.
     * 
     * @param incoterm
     */
    public void setIncoterm(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incoterm) {
        this.incoterm = incoterm;
    }


    /**
     * Gets the internalId value for this VendorSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this VendorSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this VendorSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this VendorSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the is1099Eligible value for this VendorSearchBasic.
     * 
     * @return is1099Eligible
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIs1099Eligible() {
        return is1099Eligible;
    }


    /**
     * Sets the is1099Eligible value for this VendorSearchBasic.
     * 
     * @param is1099Eligible
     */
    public void setIs1099Eligible(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField is1099Eligible) {
        this.is1099Eligible = is1099Eligible;
    }


    /**
     * Gets the isDefaultBilling value for this VendorSearchBasic.
     * 
     * @return isDefaultBilling
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this VendorSearchBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }


    /**
     * Gets the isDefaultShipping value for this VendorSearchBasic.
     * 
     * @return isDefaultShipping
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this VendorSearchBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }


    /**
     * Gets the isInactive value for this VendorSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this VendorSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isJobResourceVend value for this VendorSearchBasic.
     * 
     * @return isJobResourceVend
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsJobResourceVend() {
        return isJobResourceVend;
    }


    /**
     * Sets the isJobResourceVend value for this VendorSearchBasic.
     * 
     * @param isJobResourceVend
     */
    public void setIsJobResourceVend(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isJobResourceVend) {
        this.isJobResourceVend = isJobResourceVend;
    }


    /**
     * Gets the isPerson value for this VendorSearchBasic.
     * 
     * @return isPerson
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this VendorSearchBasic.
     * 
     * @param isPerson
     */
    public void setIsPerson(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPerson) {
        this.isPerson = isPerson;
    }


    /**
     * Gets the laborCost value for this VendorSearchBasic.
     * 
     * @return laborCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLaborCost() {
        return laborCost;
    }


    /**
     * Sets the laborCost value for this VendorSearchBasic.
     * 
     * @param laborCost
     */
    public void setLaborCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField laborCost) {
        this.laborCost = laborCost;
    }


    /**
     * Gets the language value for this VendorSearchBasic.
     * 
     * @return language
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this VendorSearchBasic.
     * 
     * @param language
     */
    public void setLanguage(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedDate value for this VendorSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this VendorSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this VendorSearchBasic.
     * 
     * @return lastName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this VendorSearchBasic.
     * 
     * @param lastName
     */
    public void setLastName(com.netsuite.webservices.platform.core_2019_1.SearchStringField lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the level value for this VendorSearchBasic.
     * 
     * @return level
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLevel() {
        return level;
    }


    /**
     * Sets the level value for this VendorSearchBasic.
     * 
     * @param level
     */
    public void setLevel(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField level) {
        this.level = level;
    }


    /**
     * Gets the middleName value for this VendorSearchBasic.
     * 
     * @return middleName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this VendorSearchBasic.
     * 
     * @param middleName
     */
    public void setMiddleName(com.netsuite.webservices.platform.core_2019_1.SearchStringField middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the otherRelationships value for this VendorSearchBasic.
     * 
     * @return otherRelationships
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getOtherRelationships() {
        return otherRelationships;
    }


    /**
     * Sets the otherRelationships value for this VendorSearchBasic.
     * 
     * @param otherRelationships
     */
    public void setOtherRelationships(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField otherRelationships) {
        this.otherRelationships = otherRelationships;
    }


    /**
     * Gets the payablesAccount value for this VendorSearchBasic.
     * 
     * @return payablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPayablesAccount() {
        return payablesAccount;
    }


    /**
     * Sets the payablesAccount value for this VendorSearchBasic.
     * 
     * @param payablesAccount
     */
    public void setPayablesAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payablesAccount) {
        this.payablesAccount = payablesAccount;
    }


    /**
     * Gets the pec value for this VendorSearchBasic.
     * 
     * @return pec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPec() {
        return pec;
    }


    /**
     * Sets the pec value for this VendorSearchBasic.
     * 
     * @param pec
     */
    public void setPec(com.netsuite.webservices.platform.core_2019_1.SearchStringField pec) {
        this.pec = pec;
    }


    /**
     * Gets the permission value for this VendorSearchBasic.
     * 
     * @return permission
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this VendorSearchBasic.
     * 
     * @param permission
     */
    public void setPermission(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }


    /**
     * Gets the phone value for this VendorSearchBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this VendorSearchBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the phoneticName value for this VendorSearchBasic.
     * 
     * @return phoneticName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this VendorSearchBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(com.netsuite.webservices.platform.core_2019_1.SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the printTransactions value for this VendorSearchBasic.
     * 
     * @return printTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPrintTransactions() {
        return printTransactions;
    }


    /**
     * Sets the printTransactions value for this VendorSearchBasic.
     * 
     * @param printTransactions
     */
    public void setPrintTransactions(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField printTransactions) {
        this.printTransactions = printTransactions;
    }


    /**
     * Gets the purchaseOrderAmount value for this VendorSearchBasic.
     * 
     * @return purchaseOrderAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this VendorSearchBasic.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }


    /**
     * Gets the purchaseOrderQuantity value for this VendorSearchBasic.
     * 
     * @return purchaseOrderQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this VendorSearchBasic.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this VendorSearchBasic.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this VendorSearchBasic.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }


    /**
     * Gets the receiptAmount value for this VendorSearchBasic.
     * 
     * @return receiptAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this VendorSearchBasic.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the receiptQuantity value for this VendorSearchBasic.
     * 
     * @return receiptQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this VendorSearchBasic.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }


    /**
     * Gets the receiptQuantityDiff value for this VendorSearchBasic.
     * 
     * @return receiptQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this VendorSearchBasic.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }


    /**
     * Gets the salutation value for this VendorSearchBasic.
     * 
     * @return salutation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this VendorSearchBasic.
     * 
     * @param salutation
     */
    public void setSalutation(com.netsuite.webservices.platform.core_2019_1.SearchStringField salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the shipAddress value for this VendorSearchBasic.
     * 
     * @return shipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this VendorSearchBasic.
     * 
     * @param shipAddress
     */
    public void setShipAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the state value for this VendorSearchBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this VendorSearchBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the subsidiary value for this VendorSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this VendorSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the taxIdNum value for this VendorSearchBasic.
     * 
     * @return taxIdNum
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTaxIdNum() {
        return taxIdNum;
    }


    /**
     * Sets the taxIdNum value for this VendorSearchBasic.
     * 
     * @param taxIdNum
     */
    public void setTaxIdNum(com.netsuite.webservices.platform.core_2019_1.SearchStringField taxIdNum) {
        this.taxIdNum = taxIdNum;
    }


    /**
     * Gets the timeApprover value for this VendorSearchBasic.
     * 
     * @return timeApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTimeApprover() {
        return timeApprover;
    }


    /**
     * Sets the timeApprover value for this VendorSearchBasic.
     * 
     * @param timeApprover
     */
    public void setTimeApprover(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField timeApprover) {
        this.timeApprover = timeApprover;
    }


    /**
     * Gets the title value for this VendorSearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this VendorSearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the unbilledOrders value for this VendorSearchBasic.
     * 
     * @return unbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this VendorSearchBasic.
     * 
     * @param unbilledOrders
     */
    public void setUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }


    /**
     * Gets the url value for this VendorSearchBasic.
     * 
     * @return url
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getUrl() {
        return url;
    }


    /**
     * Sets the url value for this VendorSearchBasic.
     * 
     * @param url
     */
    public void setUrl(com.netsuite.webservices.platform.core_2019_1.SearchStringField url) {
        this.url = url;
    }


    /**
     * Gets the vatRegNumber value for this VendorSearchBasic.
     * 
     * @return vatRegNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getVatRegNumber() {
        return vatRegNumber;
    }


    /**
     * Sets the vatRegNumber value for this VendorSearchBasic.
     * 
     * @param vatRegNumber
     */
    public void setVatRegNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }


    /**
     * Gets the workCalendar value for this VendorSearchBasic.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this VendorSearchBasic.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workCalendar) {
        this.workCalendar = workCalendar;
    }


    /**
     * Gets the zipCode value for this VendorSearchBasic.
     * 
     * @return zipCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this VendorSearchBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the customFieldList value for this VendorSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this VendorSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorSearchBasic)) return false;
        VendorSearchBasic other = (VendorSearchBasic) obj;
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
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              this.billAddress.equals(other.getBillAddress()))) &&
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
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.currentExchangeRate==null && other.getCurrentExchangeRate()==null) || 
             (this.currentExchangeRate!=null &&
              this.currentExchangeRate.equals(other.getCurrentExchangeRate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.defaultTaxReg==null && other.getDefaultTaxReg()==null) || 
             (this.defaultTaxReg!=null &&
              this.defaultTaxReg.equals(other.getDefaultTaxReg()))) &&
            ((this.defaultTaxRegText==null && other.getDefaultTaxRegText()==null) || 
             (this.defaultTaxRegText!=null &&
              this.defaultTaxRegText.equals(other.getDefaultTaxRegText()))) &&
            ((this.eligibleForCommission==null && other.getEligibleForCommission()==null) || 
             (this.eligibleForCommission!=null &&
              this.eligibleForCommission.equals(other.getEligibleForCommission()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailPreference==null && other.getEmailPreference()==null) || 
             (this.emailPreference!=null &&
              this.emailPreference.equals(other.getEmailPreference()))) &&
            ((this.emailTransactions==null && other.getEmailTransactions()==null) || 
             (this.emailTransactions!=null &&
              this.emailTransactions.equals(other.getEmailTransactions()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.expenseAccount==null && other.getExpenseAccount()==null) || 
             (this.expenseAccount!=null &&
              this.expenseAccount.equals(other.getExpenseAccount()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.faxTransactions==null && other.getFaxTransactions()==null) || 
             (this.faxTransactions!=null &&
              this.faxTransactions.equals(other.getFaxTransactions()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.fxBalance==null && other.getFxBalance()==null) || 
             (this.fxBalance!=null &&
              this.fxBalance.equals(other.getFxBalance()))) &&
            ((this.fxUnbilledOrders==null && other.getFxUnbilledOrders()==null) || 
             (this.fxUnbilledOrders!=null &&
              this.fxUnbilledOrders.equals(other.getFxUnbilledOrders()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.hasDuplicates==null && other.getHasDuplicates()==null) || 
             (this.hasDuplicates!=null &&
              this.hasDuplicates.equals(other.getHasDuplicates()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              this.incoterm.equals(other.getIncoterm()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.is1099Eligible==null && other.getIs1099Eligible()==null) || 
             (this.is1099Eligible!=null &&
              this.is1099Eligible.equals(other.getIs1099Eligible()))) &&
            ((this.isDefaultBilling==null && other.getIsDefaultBilling()==null) || 
             (this.isDefaultBilling!=null &&
              this.isDefaultBilling.equals(other.getIsDefaultBilling()))) &&
            ((this.isDefaultShipping==null && other.getIsDefaultShipping()==null) || 
             (this.isDefaultShipping!=null &&
              this.isDefaultShipping.equals(other.getIsDefaultShipping()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isJobResourceVend==null && other.getIsJobResourceVend()==null) || 
             (this.isJobResourceVend!=null &&
              this.isJobResourceVend.equals(other.getIsJobResourceVend()))) &&
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              this.isPerson.equals(other.getIsPerson()))) &&
            ((this.laborCost==null && other.getLaborCost()==null) || 
             (this.laborCost!=null &&
              this.laborCost.equals(other.getLaborCost()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.otherRelationships==null && other.getOtherRelationships()==null) || 
             (this.otherRelationships!=null &&
              this.otherRelationships.equals(other.getOtherRelationships()))) &&
            ((this.payablesAccount==null && other.getPayablesAccount()==null) || 
             (this.payablesAccount!=null &&
              this.payablesAccount.equals(other.getPayablesAccount()))) &&
            ((this.pec==null && other.getPec()==null) || 
             (this.pec!=null &&
              this.pec.equals(other.getPec()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              this.permission.equals(other.getPermission()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.printTransactions==null && other.getPrintTransactions()==null) || 
             (this.printTransactions!=null &&
              this.printTransactions.equals(other.getPrintTransactions()))) &&
            ((this.purchaseOrderAmount==null && other.getPurchaseOrderAmount()==null) || 
             (this.purchaseOrderAmount!=null &&
              this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount()))) &&
            ((this.purchaseOrderQuantity==null && other.getPurchaseOrderQuantity()==null) || 
             (this.purchaseOrderQuantity!=null &&
              this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity()))) &&
            ((this.purchaseOrderQuantityDiff==null && other.getPurchaseOrderQuantityDiff()==null) || 
             (this.purchaseOrderQuantityDiff!=null &&
              this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff()))) &&
            ((this.receiptAmount==null && other.getReceiptAmount()==null) || 
             (this.receiptAmount!=null &&
              this.receiptAmount.equals(other.getReceiptAmount()))) &&
            ((this.receiptQuantity==null && other.getReceiptQuantity()==null) || 
             (this.receiptQuantity!=null &&
              this.receiptQuantity.equals(other.getReceiptQuantity()))) &&
            ((this.receiptQuantityDiff==null && other.getReceiptQuantityDiff()==null) || 
             (this.receiptQuantityDiff!=null &&
              this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.taxIdNum==null && other.getTaxIdNum()==null) || 
             (this.taxIdNum!=null &&
              this.taxIdNum.equals(other.getTaxIdNum()))) &&
            ((this.timeApprover==null && other.getTimeApprover()==null) || 
             (this.timeApprover!=null &&
              this.timeApprover.equals(other.getTimeApprover()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.unbilledOrders==null && other.getUnbilledOrders()==null) || 
             (this.unbilledOrders!=null &&
              this.unbilledOrders.equals(other.getUnbilledOrders()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.vatRegNumber==null && other.getVatRegNumber()==null) || 
             (this.vatRegNumber!=null &&
              this.vatRegNumber.equals(other.getVatRegNumber()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              this.workCalendar.equals(other.getWorkCalendar()))) &&
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
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBillAddress() != null) {
            _hashCode += getBillAddress().hashCode();
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
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCurrentExchangeRate() != null) {
            _hashCode += getCurrentExchangeRate().hashCode();
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
        if (getEligibleForCommission() != null) {
            _hashCode += getEligibleForCommission().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailPreference() != null) {
            _hashCode += getEmailPreference().hashCode();
        }
        if (getEmailTransactions() != null) {
            _hashCode += getEmailTransactions().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getExpenseAccount() != null) {
            _hashCode += getExpenseAccount().hashCode();
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
        if (getFaxTransactions() != null) {
            _hashCode += getFaxTransactions().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFxBalance() != null) {
            _hashCode += getFxBalance().hashCode();
        }
        if (getFxUnbilledOrders() != null) {
            _hashCode += getFxUnbilledOrders().hashCode();
        }
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getHasDuplicates() != null) {
            _hashCode += getHasDuplicates().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getIncoterm() != null) {
            _hashCode += getIncoterm().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIs1099Eligible() != null) {
            _hashCode += getIs1099Eligible().hashCode();
        }
        if (getIsDefaultBilling() != null) {
            _hashCode += getIsDefaultBilling().hashCode();
        }
        if (getIsDefaultShipping() != null) {
            _hashCode += getIsDefaultShipping().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsJobResourceVend() != null) {
            _hashCode += getIsJobResourceVend().hashCode();
        }
        if (getIsPerson() != null) {
            _hashCode += getIsPerson().hashCode();
        }
        if (getLaborCost() != null) {
            _hashCode += getLaborCost().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getOtherRelationships() != null) {
            _hashCode += getOtherRelationships().hashCode();
        }
        if (getPayablesAccount() != null) {
            _hashCode += getPayablesAccount().hashCode();
        }
        if (getPec() != null) {
            _hashCode += getPec().hashCode();
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
        if (getPrintTransactions() != null) {
            _hashCode += getPrintTransactions().hashCode();
        }
        if (getPurchaseOrderAmount() != null) {
            _hashCode += getPurchaseOrderAmount().hashCode();
        }
        if (getPurchaseOrderQuantity() != null) {
            _hashCode += getPurchaseOrderQuantity().hashCode();
        }
        if (getPurchaseOrderQuantityDiff() != null) {
            _hashCode += getPurchaseOrderQuantityDiff().hashCode();
        }
        if (getReceiptAmount() != null) {
            _hashCode += getReceiptAmount().hashCode();
        }
        if (getReceiptQuantity() != null) {
            _hashCode += getReceiptQuantity().hashCode();
        }
        if (getReceiptQuantityDiff() != null) {
            _hashCode += getReceiptQuantityDiff().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTaxIdNum() != null) {
            _hashCode += getTaxIdNum().hashCode();
        }
        if (getTimeApprover() != null) {
            _hashCode += getTimeApprover().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUnbilledOrders() != null) {
            _hashCode += getUnbilledOrders().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getVatRegNumber() != null) {
            _hashCode += getVatRegNumber().hashCode();
        }
        if (getWorkCalendar() != null) {
            _hashCode += getWorkCalendar().hashCode();
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
        new org.apache.axis.description.TypeDesc(VendorSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("currentExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currentExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxUnbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxUnbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDuplicates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hasDuplicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("is1099Eligible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "is1099Eligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isJobResourceVend");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isJobResourceVend"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRelationships");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "otherRelationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payablesAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "printTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxIdNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "timeApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
