/**
 * MseSubsidiarySearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class MseSubsidiarySearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField address;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField city;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField effectiveFrom;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField email;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField fax;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isElimination;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField legalName;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField nameNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField nexus;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField primary;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField state;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxEngine;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField taxIdNum;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField taxRegistrationNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField tranPrefix;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField url;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField validUntil;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField zip;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public MseSubsidiarySearchBasic() {
    }

    public MseSubsidiarySearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBook,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField address,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField city,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField effectiveFrom,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField email,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField fax,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isElimination,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField legalName,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField nameNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField nexus,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField phone,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField primary,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField state,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxEngine,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField taxIdNum,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField taxRegistrationNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField tranPrefix,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField url,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField validUntil,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField zip,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.accountingBook = accountingBook;
        this.accountingBookCurrency = accountingBookCurrency;
        this.address = address;
        this.city = city;
        this.country = country;
        this.currency = currency;
        this.effectiveFrom = effectiveFrom;
        this.email = email;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isElimination = isElimination;
        this.isInactive = isInactive;
        this.legalName = legalName;
        this.name = name;
        this.nameNoHierarchy = nameNoHierarchy;
        this.nexus = nexus;
        this.phone = phone;
        this.primary = primary;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptAmount = receiptAmount;
        this.receiptQuantity = receiptQuantity;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.state = state;
        this.subsidiary = subsidiary;
        this.taxEngine = taxEngine;
        this.taxIdNum = taxIdNum;
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.tranPrefix = tranPrefix;
        this.url = url;
        this.validUntil = validUntil;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountingBook value for this MseSubsidiarySearchBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this MseSubsidiarySearchBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the accountingBookCurrency value for this MseSubsidiarySearchBasic.
     * 
     * @return accountingBookCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccountingBookCurrency() {
        return accountingBookCurrency;
    }


    /**
     * Sets the accountingBookCurrency value for this MseSubsidiarySearchBasic.
     * 
     * @param accountingBookCurrency
     */
    public void setAccountingBookCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookCurrency) {
        this.accountingBookCurrency = accountingBookCurrency;
    }


    /**
     * Gets the address value for this MseSubsidiarySearchBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this MseSubsidiarySearchBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the city value for this MseSubsidiarySearchBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this MseSubsidiarySearchBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the country value for this MseSubsidiarySearchBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this MseSubsidiarySearchBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the currency value for this MseSubsidiarySearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this MseSubsidiarySearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the effectiveFrom value for this MseSubsidiarySearchBasic.
     * 
     * @return effectiveFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEffectiveFrom() {
        return effectiveFrom;
    }


    /**
     * Sets the effectiveFrom value for this MseSubsidiarySearchBasic.
     * 
     * @param effectiveFrom
     */
    public void setEffectiveFrom(com.netsuite.webservices.platform.core_2019_1.SearchDateField effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }


    /**
     * Gets the email value for this MseSubsidiarySearchBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this MseSubsidiarySearchBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the externalId value for this MseSubsidiarySearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this MseSubsidiarySearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this MseSubsidiarySearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this MseSubsidiarySearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fax value for this MseSubsidiarySearchBasic.
     * 
     * @return fax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this MseSubsidiarySearchBasic.
     * 
     * @param fax
     */
    public void setFax(com.netsuite.webservices.platform.core_2019_1.SearchStringField fax) {
        this.fax = fax;
    }


    /**
     * Gets the internalId value for this MseSubsidiarySearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this MseSubsidiarySearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this MseSubsidiarySearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this MseSubsidiarySearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isElimination value for this MseSubsidiarySearchBasic.
     * 
     * @return isElimination
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsElimination() {
        return isElimination;
    }


    /**
     * Sets the isElimination value for this MseSubsidiarySearchBasic.
     * 
     * @param isElimination
     */
    public void setIsElimination(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isElimination) {
        this.isElimination = isElimination;
    }


    /**
     * Gets the isInactive value for this MseSubsidiarySearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this MseSubsidiarySearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the legalName value for this MseSubsidiarySearchBasic.
     * 
     * @return legalName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this MseSubsidiarySearchBasic.
     * 
     * @param legalName
     */
    public void setLegalName(com.netsuite.webservices.platform.core_2019_1.SearchStringField legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the name value for this MseSubsidiarySearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this MseSubsidiarySearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the nameNoHierarchy value for this MseSubsidiarySearchBasic.
     * 
     * @return nameNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getNameNoHierarchy() {
        return nameNoHierarchy;
    }


    /**
     * Sets the nameNoHierarchy value for this MseSubsidiarySearchBasic.
     * 
     * @param nameNoHierarchy
     */
    public void setNameNoHierarchy(com.netsuite.webservices.platform.core_2019_1.SearchStringField nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }


    /**
     * Gets the nexus value for this MseSubsidiarySearchBasic.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this MseSubsidiarySearchBasic.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the phone value for this MseSubsidiarySearchBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this MseSubsidiarySearchBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the primary value for this MseSubsidiarySearchBasic.
     * 
     * @return primary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPrimary() {
        return primary;
    }


    /**
     * Sets the primary value for this MseSubsidiarySearchBasic.
     * 
     * @param primary
     */
    public void setPrimary(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField primary) {
        this.primary = primary;
    }


    /**
     * Gets the purchaseOrderAmount value for this MseSubsidiarySearchBasic.
     * 
     * @return purchaseOrderAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this MseSubsidiarySearchBasic.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }


    /**
     * Gets the purchaseOrderQuantity value for this MseSubsidiarySearchBasic.
     * 
     * @return purchaseOrderQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this MseSubsidiarySearchBasic.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this MseSubsidiarySearchBasic.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this MseSubsidiarySearchBasic.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }


    /**
     * Gets the receiptAmount value for this MseSubsidiarySearchBasic.
     * 
     * @return receiptAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this MseSubsidiarySearchBasic.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the receiptQuantity value for this MseSubsidiarySearchBasic.
     * 
     * @return receiptQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this MseSubsidiarySearchBasic.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }


    /**
     * Gets the receiptQuantityDiff value for this MseSubsidiarySearchBasic.
     * 
     * @return receiptQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this MseSubsidiarySearchBasic.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }


    /**
     * Gets the state value for this MseSubsidiarySearchBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this MseSubsidiarySearchBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the subsidiary value for this MseSubsidiarySearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this MseSubsidiarySearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the taxEngine value for this MseSubsidiarySearchBasic.
     * 
     * @return taxEngine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxEngine() {
        return taxEngine;
    }


    /**
     * Sets the taxEngine value for this MseSubsidiarySearchBasic.
     * 
     * @param taxEngine
     */
    public void setTaxEngine(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxEngine) {
        this.taxEngine = taxEngine;
    }


    /**
     * Gets the taxIdNum value for this MseSubsidiarySearchBasic.
     * 
     * @return taxIdNum
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTaxIdNum() {
        return taxIdNum;
    }


    /**
     * Sets the taxIdNum value for this MseSubsidiarySearchBasic.
     * 
     * @param taxIdNum
     */
    public void setTaxIdNum(com.netsuite.webservices.platform.core_2019_1.SearchStringField taxIdNum) {
        this.taxIdNum = taxIdNum;
    }


    /**
     * Gets the taxRegistrationNumber value for this MseSubsidiarySearchBasic.
     * 
     * @return taxRegistrationNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }


    /**
     * Sets the taxRegistrationNumber value for this MseSubsidiarySearchBasic.
     * 
     * @param taxRegistrationNumber
     */
    public void setTaxRegistrationNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }


    /**
     * Gets the tranPrefix value for this MseSubsidiarySearchBasic.
     * 
     * @return tranPrefix
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTranPrefix() {
        return tranPrefix;
    }


    /**
     * Sets the tranPrefix value for this MseSubsidiarySearchBasic.
     * 
     * @param tranPrefix
     */
    public void setTranPrefix(com.netsuite.webservices.platform.core_2019_1.SearchStringField tranPrefix) {
        this.tranPrefix = tranPrefix;
    }


    /**
     * Gets the url value for this MseSubsidiarySearchBasic.
     * 
     * @return url
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getUrl() {
        return url;
    }


    /**
     * Sets the url value for this MseSubsidiarySearchBasic.
     * 
     * @param url
     */
    public void setUrl(com.netsuite.webservices.platform.core_2019_1.SearchStringField url) {
        this.url = url;
    }


    /**
     * Gets the validUntil value for this MseSubsidiarySearchBasic.
     * 
     * @return validUntil
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this MseSubsidiarySearchBasic.
     * 
     * @param validUntil
     */
    public void setValidUntil(com.netsuite.webservices.platform.core_2019_1.SearchDateField validUntil) {
        this.validUntil = validUntil;
    }


    /**
     * Gets the zip value for this MseSubsidiarySearchBasic.
     * 
     * @return zip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this MseSubsidiarySearchBasic.
     * 
     * @param zip
     */
    public void setZip(com.netsuite.webservices.platform.core_2019_1.SearchStringField zip) {
        this.zip = zip;
    }


    /**
     * Gets the customFieldList value for this MseSubsidiarySearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this MseSubsidiarySearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MseSubsidiarySearchBasic)) return false;
        MseSubsidiarySearchBasic other = (MseSubsidiarySearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              this.accountingBook.equals(other.getAccountingBook()))) &&
            ((this.accountingBookCurrency==null && other.getAccountingBookCurrency()==null) || 
             (this.accountingBookCurrency!=null &&
              this.accountingBookCurrency.equals(other.getAccountingBookCurrency()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.effectiveFrom==null && other.getEffectiveFrom()==null) || 
             (this.effectiveFrom!=null &&
              this.effectiveFrom.equals(other.getEffectiveFrom()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isElimination==null && other.getIsElimination()==null) || 
             (this.isElimination!=null &&
              this.isElimination.equals(other.getIsElimination()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameNoHierarchy==null && other.getNameNoHierarchy()==null) || 
             (this.nameNoHierarchy!=null &&
              this.nameNoHierarchy.equals(other.getNameNoHierarchy()))) &&
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              this.nexus.equals(other.getNexus()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.primary==null && other.getPrimary()==null) || 
             (this.primary!=null &&
              this.primary.equals(other.getPrimary()))) &&
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.taxEngine==null && other.getTaxEngine()==null) || 
             (this.taxEngine!=null &&
              this.taxEngine.equals(other.getTaxEngine()))) &&
            ((this.taxIdNum==null && other.getTaxIdNum()==null) || 
             (this.taxIdNum!=null &&
              this.taxIdNum.equals(other.getTaxIdNum()))) &&
            ((this.taxRegistrationNumber==null && other.getTaxRegistrationNumber()==null) || 
             (this.taxRegistrationNumber!=null &&
              this.taxRegistrationNumber.equals(other.getTaxRegistrationNumber()))) &&
            ((this.tranPrefix==null && other.getTranPrefix()==null) || 
             (this.tranPrefix!=null &&
              this.tranPrefix.equals(other.getTranPrefix()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.validUntil==null && other.getValidUntil()==null) || 
             (this.validUntil!=null &&
              this.validUntil.equals(other.getValidUntil()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
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
        if (getAccountingBook() != null) {
            _hashCode += getAccountingBook().hashCode();
        }
        if (getAccountingBookCurrency() != null) {
            _hashCode += getAccountingBookCurrency().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getEffectiveFrom() != null) {
            _hashCode += getEffectiveFrom().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsElimination() != null) {
            _hashCode += getIsElimination().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNameNoHierarchy() != null) {
            _hashCode += getNameNoHierarchy().hashCode();
        }
        if (getNexus() != null) {
            _hashCode += getNexus().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPrimary() != null) {
            _hashCode += getPrimary().hashCode();
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTaxEngine() != null) {
            _hashCode += getTaxEngine().hashCode();
        }
        if (getTaxIdNum() != null) {
            _hashCode += getTaxIdNum().hashCode();
        }
        if (getTaxRegistrationNumber() != null) {
            _hashCode += getTaxRegistrationNumber().hashCode();
        }
        if (getTranPrefix() != null) {
            _hashCode += getTranPrefix().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getValidUntil() != null) {
            _hashCode += getValidUntil().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MseSubsidiarySearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MseSubsidiarySearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("isElimination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isElimination"));
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
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("primary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "primary"));
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
        elemField.setFieldName("taxEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxEngine"));
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
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "validUntil"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zip"));
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
