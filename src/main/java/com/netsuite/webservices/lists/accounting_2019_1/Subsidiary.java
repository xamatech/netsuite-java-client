/**
 * Subsidiary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class Subsidiary  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String name;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean showSubsidiaryName;

    private java.lang.String url;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef logo;

    private java.lang.String tranPrefix;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef pageLogo;

    private java.lang.String state;

    private com.netsuite.webservices.platform.common_2019_1.types.Country country;

    private com.netsuite.webservices.platform.common_2019_1.Address mainAddress;

    private com.netsuite.webservices.platform.common_2019_1.Address shippingAddress;

    private com.netsuite.webservices.platform.common_2019_1.Address returnAddress;

    private java.lang.String legalName;

    private java.lang.Boolean isElimination;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef fiscalCalendar;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxFiscalCalendar;

    private java.lang.Boolean allowPayroll;

    private java.lang.String email;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.Double purchaseOrderQuantity;

    private java.lang.Double purchaseOrderAmount;

    private java.lang.Double purchaseOrderQuantityDiff;

    private java.lang.Double receiptQuantity;

    private java.lang.Double receiptAmount;

    private java.lang.Double receiptQuantityDiff;

    private java.lang.String fax;

    private java.lang.String edition;

    private java.lang.String federalIdNumber;

    private java.lang.String addrLanguage;

    private java.lang.String nonConsol;

    private java.lang.String consol;

    private java.lang.String state1TaxNumber;

    private com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryTaxRegistrationList taxRegistrationList;

    private java.lang.String ssnOrTin;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef interCoAccount;

    private com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexusList nexusList;

    private com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef checkLayout;

    private java.lang.String inboundEmail;

    private com.netsuite.webservices.lists.accounting_2019_1.ClassTranslationList classTranslationList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Subsidiary() {
    }

    public Subsidiary(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           java.lang.Boolean isInactive,
           java.lang.Boolean showSubsidiaryName,
           java.lang.String url,
           com.netsuite.webservices.platform.core_2019_1.RecordRef logo,
           java.lang.String tranPrefix,
           com.netsuite.webservices.platform.core_2019_1.RecordRef pageLogo,
           java.lang.String state,
           com.netsuite.webservices.platform.common_2019_1.types.Country country,
           com.netsuite.webservices.platform.common_2019_1.Address mainAddress,
           com.netsuite.webservices.platform.common_2019_1.Address shippingAddress,
           com.netsuite.webservices.platform.common_2019_1.Address returnAddress,
           java.lang.String legalName,
           java.lang.Boolean isElimination,
           com.netsuite.webservices.platform.core_2019_1.RecordRef fiscalCalendar,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxFiscalCalendar,
           java.lang.Boolean allowPayroll,
           java.lang.String email,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.Double purchaseOrderQuantity,
           java.lang.Double purchaseOrderAmount,
           java.lang.Double purchaseOrderQuantityDiff,
           java.lang.Double receiptQuantity,
           java.lang.Double receiptAmount,
           java.lang.Double receiptQuantityDiff,
           java.lang.String fax,
           java.lang.String edition,
           java.lang.String federalIdNumber,
           java.lang.String addrLanguage,
           java.lang.String nonConsol,
           java.lang.String consol,
           java.lang.String state1TaxNumber,
           com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryTaxRegistrationList taxRegistrationList,
           java.lang.String ssnOrTin,
           com.netsuite.webservices.platform.core_2019_1.RecordRef interCoAccount,
           com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexusList nexusList,
           com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef checkLayout,
           java.lang.String inboundEmail,
           com.netsuite.webservices.lists.accounting_2019_1.ClassTranslationList classTranslationList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.parent = parent;
        this.isInactive = isInactive;
        this.showSubsidiaryName = showSubsidiaryName;
        this.url = url;
        this.logo = logo;
        this.tranPrefix = tranPrefix;
        this.pageLogo = pageLogo;
        this.state = state;
        this.country = country;
        this.mainAddress = mainAddress;
        this.shippingAddress = shippingAddress;
        this.returnAddress = returnAddress;
        this.legalName = legalName;
        this.isElimination = isElimination;
        this.fiscalCalendar = fiscalCalendar;
        this.taxFiscalCalendar = taxFiscalCalendar;
        this.allowPayroll = allowPayroll;
        this.email = email;
        this.currency = currency;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptQuantity = receiptQuantity;
        this.receiptAmount = receiptAmount;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.fax = fax;
        this.edition = edition;
        this.federalIdNumber = federalIdNumber;
        this.addrLanguage = addrLanguage;
        this.nonConsol = nonConsol;
        this.consol = consol;
        this.state1TaxNumber = state1TaxNumber;
        this.taxRegistrationList = taxRegistrationList;
        this.ssnOrTin = ssnOrTin;
        this.interCoAccount = interCoAccount;
        this.nexusList = nexusList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.checkLayout = checkLayout;
        this.inboundEmail = inboundEmail;
        this.classTranslationList = classTranslationList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the name value for this Subsidiary.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Subsidiary.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parent value for this Subsidiary.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Subsidiary.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the isInactive value for this Subsidiary.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Subsidiary.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the showSubsidiaryName value for this Subsidiary.
     * 
     * @return showSubsidiaryName
     */
    public java.lang.Boolean getShowSubsidiaryName() {
        return showSubsidiaryName;
    }


    /**
     * Sets the showSubsidiaryName value for this Subsidiary.
     * 
     * @param showSubsidiaryName
     */
    public void setShowSubsidiaryName(java.lang.Boolean showSubsidiaryName) {
        this.showSubsidiaryName = showSubsidiaryName;
    }


    /**
     * Gets the url value for this Subsidiary.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Subsidiary.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the logo value for this Subsidiary.
     * 
     * @return logo
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this Subsidiary.
     * 
     * @param logo
     */
    public void setLogo(com.netsuite.webservices.platform.core_2019_1.RecordRef logo) {
        this.logo = logo;
    }


    /**
     * Gets the tranPrefix value for this Subsidiary.
     * 
     * @return tranPrefix
     */
    public java.lang.String getTranPrefix() {
        return tranPrefix;
    }


    /**
     * Sets the tranPrefix value for this Subsidiary.
     * 
     * @param tranPrefix
     */
    public void setTranPrefix(java.lang.String tranPrefix) {
        this.tranPrefix = tranPrefix;
    }


    /**
     * Gets the pageLogo value for this Subsidiary.
     * 
     * @return pageLogo
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPageLogo() {
        return pageLogo;
    }


    /**
     * Sets the pageLogo value for this Subsidiary.
     * 
     * @param pageLogo
     */
    public void setPageLogo(com.netsuite.webservices.platform.core_2019_1.RecordRef pageLogo) {
        this.pageLogo = pageLogo;
    }


    /**
     * Gets the state value for this Subsidiary.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Subsidiary.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the country value for this Subsidiary.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Country getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Subsidiary.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.common_2019_1.types.Country country) {
        this.country = country;
    }


    /**
     * Gets the mainAddress value for this Subsidiary.
     * 
     * @return mainAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getMainAddress() {
        return mainAddress;
    }


    /**
     * Sets the mainAddress value for this Subsidiary.
     * 
     * @param mainAddress
     */
    public void setMainAddress(com.netsuite.webservices.platform.common_2019_1.Address mainAddress) {
        this.mainAddress = mainAddress;
    }


    /**
     * Gets the shippingAddress value for this Subsidiary.
     * 
     * @return shippingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this Subsidiary.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(com.netsuite.webservices.platform.common_2019_1.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the returnAddress value for this Subsidiary.
     * 
     * @return returnAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getReturnAddress() {
        return returnAddress;
    }


    /**
     * Sets the returnAddress value for this Subsidiary.
     * 
     * @param returnAddress
     */
    public void setReturnAddress(com.netsuite.webservices.platform.common_2019_1.Address returnAddress) {
        this.returnAddress = returnAddress;
    }


    /**
     * Gets the legalName value for this Subsidiary.
     * 
     * @return legalName
     */
    public java.lang.String getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this Subsidiary.
     * 
     * @param legalName
     */
    public void setLegalName(java.lang.String legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the isElimination value for this Subsidiary.
     * 
     * @return isElimination
     */
    public java.lang.Boolean getIsElimination() {
        return isElimination;
    }


    /**
     * Sets the isElimination value for this Subsidiary.
     * 
     * @param isElimination
     */
    public void setIsElimination(java.lang.Boolean isElimination) {
        this.isElimination = isElimination;
    }


    /**
     * Gets the fiscalCalendar value for this Subsidiary.
     * 
     * @return fiscalCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFiscalCalendar() {
        return fiscalCalendar;
    }


    /**
     * Sets the fiscalCalendar value for this Subsidiary.
     * 
     * @param fiscalCalendar
     */
    public void setFiscalCalendar(com.netsuite.webservices.platform.core_2019_1.RecordRef fiscalCalendar) {
        this.fiscalCalendar = fiscalCalendar;
    }


    /**
     * Gets the taxFiscalCalendar value for this Subsidiary.
     * 
     * @return taxFiscalCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxFiscalCalendar() {
        return taxFiscalCalendar;
    }


    /**
     * Sets the taxFiscalCalendar value for this Subsidiary.
     * 
     * @param taxFiscalCalendar
     */
    public void setTaxFiscalCalendar(com.netsuite.webservices.platform.core_2019_1.RecordRef taxFiscalCalendar) {
        this.taxFiscalCalendar = taxFiscalCalendar;
    }


    /**
     * Gets the allowPayroll value for this Subsidiary.
     * 
     * @return allowPayroll
     */
    public java.lang.Boolean getAllowPayroll() {
        return allowPayroll;
    }


    /**
     * Sets the allowPayroll value for this Subsidiary.
     * 
     * @param allowPayroll
     */
    public void setAllowPayroll(java.lang.Boolean allowPayroll) {
        this.allowPayroll = allowPayroll;
    }


    /**
     * Gets the email value for this Subsidiary.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Subsidiary.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the currency value for this Subsidiary.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Subsidiary.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the purchaseOrderQuantity value for this Subsidiary.
     * 
     * @return purchaseOrderQuantity
     */
    public java.lang.Double getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this Subsidiary.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(java.lang.Double purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }


    /**
     * Gets the purchaseOrderAmount value for this Subsidiary.
     * 
     * @return purchaseOrderAmount
     */
    public java.lang.Double getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this Subsidiary.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(java.lang.Double purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this Subsidiary.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public java.lang.Double getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this Subsidiary.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(java.lang.Double purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }


    /**
     * Gets the receiptQuantity value for this Subsidiary.
     * 
     * @return receiptQuantity
     */
    public java.lang.Double getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this Subsidiary.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(java.lang.Double receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }


    /**
     * Gets the receiptAmount value for this Subsidiary.
     * 
     * @return receiptAmount
     */
    public java.lang.Double getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this Subsidiary.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(java.lang.Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the receiptQuantityDiff value for this Subsidiary.
     * 
     * @return receiptQuantityDiff
     */
    public java.lang.Double getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this Subsidiary.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(java.lang.Double receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }


    /**
     * Gets the fax value for this Subsidiary.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Subsidiary.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the edition value for this Subsidiary.
     * 
     * @return edition
     */
    public java.lang.String getEdition() {
        return edition;
    }


    /**
     * Sets the edition value for this Subsidiary.
     * 
     * @param edition
     */
    public void setEdition(java.lang.String edition) {
        this.edition = edition;
    }


    /**
     * Gets the federalIdNumber value for this Subsidiary.
     * 
     * @return federalIdNumber
     */
    public java.lang.String getFederalIdNumber() {
        return federalIdNumber;
    }


    /**
     * Sets the federalIdNumber value for this Subsidiary.
     * 
     * @param federalIdNumber
     */
    public void setFederalIdNumber(java.lang.String federalIdNumber) {
        this.federalIdNumber = federalIdNumber;
    }


    /**
     * Gets the addrLanguage value for this Subsidiary.
     * 
     * @return addrLanguage
     */
    public java.lang.String getAddrLanguage() {
        return addrLanguage;
    }


    /**
     * Sets the addrLanguage value for this Subsidiary.
     * 
     * @param addrLanguage
     */
    public void setAddrLanguage(java.lang.String addrLanguage) {
        this.addrLanguage = addrLanguage;
    }


    /**
     * Gets the nonConsol value for this Subsidiary.
     * 
     * @return nonConsol
     */
    public java.lang.String getNonConsol() {
        return nonConsol;
    }


    /**
     * Sets the nonConsol value for this Subsidiary.
     * 
     * @param nonConsol
     */
    public void setNonConsol(java.lang.String nonConsol) {
        this.nonConsol = nonConsol;
    }


    /**
     * Gets the consol value for this Subsidiary.
     * 
     * @return consol
     */
    public java.lang.String getConsol() {
        return consol;
    }


    /**
     * Sets the consol value for this Subsidiary.
     * 
     * @param consol
     */
    public void setConsol(java.lang.String consol) {
        this.consol = consol;
    }


    /**
     * Gets the state1TaxNumber value for this Subsidiary.
     * 
     * @return state1TaxNumber
     */
    public java.lang.String getState1TaxNumber() {
        return state1TaxNumber;
    }


    /**
     * Sets the state1TaxNumber value for this Subsidiary.
     * 
     * @param state1TaxNumber
     */
    public void setState1TaxNumber(java.lang.String state1TaxNumber) {
        this.state1TaxNumber = state1TaxNumber;
    }


    /**
     * Gets the taxRegistrationList value for this Subsidiary.
     * 
     * @return taxRegistrationList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryTaxRegistrationList getTaxRegistrationList() {
        return taxRegistrationList;
    }


    /**
     * Sets the taxRegistrationList value for this Subsidiary.
     * 
     * @param taxRegistrationList
     */
    public void setTaxRegistrationList(com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryTaxRegistrationList taxRegistrationList) {
        this.taxRegistrationList = taxRegistrationList;
    }


    /**
     * Gets the ssnOrTin value for this Subsidiary.
     * 
     * @return ssnOrTin
     */
    public java.lang.String getSsnOrTin() {
        return ssnOrTin;
    }


    /**
     * Sets the ssnOrTin value for this Subsidiary.
     * 
     * @param ssnOrTin
     */
    public void setSsnOrTin(java.lang.String ssnOrTin) {
        this.ssnOrTin = ssnOrTin;
    }


    /**
     * Gets the interCoAccount value for this Subsidiary.
     * 
     * @return interCoAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInterCoAccount() {
        return interCoAccount;
    }


    /**
     * Sets the interCoAccount value for this Subsidiary.
     * 
     * @param interCoAccount
     */
    public void setInterCoAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef interCoAccount) {
        this.interCoAccount = interCoAccount;
    }


    /**
     * Gets the nexusList value for this Subsidiary.
     * 
     * @return nexusList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexusList getNexusList() {
        return nexusList;
    }


    /**
     * Sets the nexusList value for this Subsidiary.
     * 
     * @param nexusList
     */
    public void setNexusList(com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexusList nexusList) {
        this.nexusList = nexusList;
    }


    /**
     * Gets the accountingBookDetailList value for this Subsidiary.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this Subsidiary.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the checkLayout value for this Subsidiary.
     * 
     * @return checkLayout
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCheckLayout() {
        return checkLayout;
    }


    /**
     * Sets the checkLayout value for this Subsidiary.
     * 
     * @param checkLayout
     */
    public void setCheckLayout(com.netsuite.webservices.platform.core_2019_1.RecordRef checkLayout) {
        this.checkLayout = checkLayout;
    }


    /**
     * Gets the inboundEmail value for this Subsidiary.
     * 
     * @return inboundEmail
     */
    public java.lang.String getInboundEmail() {
        return inboundEmail;
    }


    /**
     * Sets the inboundEmail value for this Subsidiary.
     * 
     * @param inboundEmail
     */
    public void setInboundEmail(java.lang.String inboundEmail) {
        this.inboundEmail = inboundEmail;
    }


    /**
     * Gets the classTranslationList value for this Subsidiary.
     * 
     * @return classTranslationList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ClassTranslationList getClassTranslationList() {
        return classTranslationList;
    }


    /**
     * Sets the classTranslationList value for this Subsidiary.
     * 
     * @param classTranslationList
     */
    public void setClassTranslationList(com.netsuite.webservices.lists.accounting_2019_1.ClassTranslationList classTranslationList) {
        this.classTranslationList = classTranslationList;
    }


    /**
     * Gets the customFieldList value for this Subsidiary.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Subsidiary.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Subsidiary.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Subsidiary.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Subsidiary.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Subsidiary.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subsidiary)) return false;
        Subsidiary other = (Subsidiary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.showSubsidiaryName==null && other.getShowSubsidiaryName()==null) || 
             (this.showSubsidiaryName!=null &&
              this.showSubsidiaryName.equals(other.getShowSubsidiaryName()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.tranPrefix==null && other.getTranPrefix()==null) || 
             (this.tranPrefix!=null &&
              this.tranPrefix.equals(other.getTranPrefix()))) &&
            ((this.pageLogo==null && other.getPageLogo()==null) || 
             (this.pageLogo!=null &&
              this.pageLogo.equals(other.getPageLogo()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.mainAddress==null && other.getMainAddress()==null) || 
             (this.mainAddress!=null &&
              this.mainAddress.equals(other.getMainAddress()))) &&
            ((this.shippingAddress==null && other.getShippingAddress()==null) || 
             (this.shippingAddress!=null &&
              this.shippingAddress.equals(other.getShippingAddress()))) &&
            ((this.returnAddress==null && other.getReturnAddress()==null) || 
             (this.returnAddress!=null &&
              this.returnAddress.equals(other.getReturnAddress()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.isElimination==null && other.getIsElimination()==null) || 
             (this.isElimination!=null &&
              this.isElimination.equals(other.getIsElimination()))) &&
            ((this.fiscalCalendar==null && other.getFiscalCalendar()==null) || 
             (this.fiscalCalendar!=null &&
              this.fiscalCalendar.equals(other.getFiscalCalendar()))) &&
            ((this.taxFiscalCalendar==null && other.getTaxFiscalCalendar()==null) || 
             (this.taxFiscalCalendar!=null &&
              this.taxFiscalCalendar.equals(other.getTaxFiscalCalendar()))) &&
            ((this.allowPayroll==null && other.getAllowPayroll()==null) || 
             (this.allowPayroll!=null &&
              this.allowPayroll.equals(other.getAllowPayroll()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
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
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.edition==null && other.getEdition()==null) || 
             (this.edition!=null &&
              this.edition.equals(other.getEdition()))) &&
            ((this.federalIdNumber==null && other.getFederalIdNumber()==null) || 
             (this.federalIdNumber!=null &&
              this.federalIdNumber.equals(other.getFederalIdNumber()))) &&
            ((this.addrLanguage==null && other.getAddrLanguage()==null) || 
             (this.addrLanguage!=null &&
              this.addrLanguage.equals(other.getAddrLanguage()))) &&
            ((this.nonConsol==null && other.getNonConsol()==null) || 
             (this.nonConsol!=null &&
              this.nonConsol.equals(other.getNonConsol()))) &&
            ((this.consol==null && other.getConsol()==null) || 
             (this.consol!=null &&
              this.consol.equals(other.getConsol()))) &&
            ((this.state1TaxNumber==null && other.getState1TaxNumber()==null) || 
             (this.state1TaxNumber!=null &&
              this.state1TaxNumber.equals(other.getState1TaxNumber()))) &&
            ((this.taxRegistrationList==null && other.getTaxRegistrationList()==null) || 
             (this.taxRegistrationList!=null &&
              this.taxRegistrationList.equals(other.getTaxRegistrationList()))) &&
            ((this.ssnOrTin==null && other.getSsnOrTin()==null) || 
             (this.ssnOrTin!=null &&
              this.ssnOrTin.equals(other.getSsnOrTin()))) &&
            ((this.interCoAccount==null && other.getInterCoAccount()==null) || 
             (this.interCoAccount!=null &&
              this.interCoAccount.equals(other.getInterCoAccount()))) &&
            ((this.nexusList==null && other.getNexusList()==null) || 
             (this.nexusList!=null &&
              this.nexusList.equals(other.getNexusList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
            ((this.checkLayout==null && other.getCheckLayout()==null) || 
             (this.checkLayout!=null &&
              this.checkLayout.equals(other.getCheckLayout()))) &&
            ((this.inboundEmail==null && other.getInboundEmail()==null) || 
             (this.inboundEmail!=null &&
              this.inboundEmail.equals(other.getInboundEmail()))) &&
            ((this.classTranslationList==null && other.getClassTranslationList()==null) || 
             (this.classTranslationList!=null &&
              this.classTranslationList.equals(other.getClassTranslationList()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getShowSubsidiaryName() != null) {
            _hashCode += getShowSubsidiaryName().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getTranPrefix() != null) {
            _hashCode += getTranPrefix().hashCode();
        }
        if (getPageLogo() != null) {
            _hashCode += getPageLogo().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getMainAddress() != null) {
            _hashCode += getMainAddress().hashCode();
        }
        if (getShippingAddress() != null) {
            _hashCode += getShippingAddress().hashCode();
        }
        if (getReturnAddress() != null) {
            _hashCode += getReturnAddress().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getIsElimination() != null) {
            _hashCode += getIsElimination().hashCode();
        }
        if (getFiscalCalendar() != null) {
            _hashCode += getFiscalCalendar().hashCode();
        }
        if (getTaxFiscalCalendar() != null) {
            _hashCode += getTaxFiscalCalendar().hashCode();
        }
        if (getAllowPayroll() != null) {
            _hashCode += getAllowPayroll().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
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
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEdition() != null) {
            _hashCode += getEdition().hashCode();
        }
        if (getFederalIdNumber() != null) {
            _hashCode += getFederalIdNumber().hashCode();
        }
        if (getAddrLanguage() != null) {
            _hashCode += getAddrLanguage().hashCode();
        }
        if (getNonConsol() != null) {
            _hashCode += getNonConsol().hashCode();
        }
        if (getConsol() != null) {
            _hashCode += getConsol().hashCode();
        }
        if (getState1TaxNumber() != null) {
            _hashCode += getState1TaxNumber().hashCode();
        }
        if (getTaxRegistrationList() != null) {
            _hashCode += getTaxRegistrationList().hashCode();
        }
        if (getSsnOrTin() != null) {
            _hashCode += getSsnOrTin().hashCode();
        }
        if (getInterCoAccount() != null) {
            _hashCode += getInterCoAccount().hashCode();
        }
        if (getNexusList() != null) {
            _hashCode += getNexusList().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
        }
        if (getCheckLayout() != null) {
            _hashCode += getCheckLayout().hashCode();
        }
        if (getInboundEmail() != null) {
            _hashCode += getInboundEmail().hashCode();
        }
        if (getClassTranslationList() != null) {
            _hashCode += getClassTranslationList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Subsidiary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "Subsidiary"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSubsidiaryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "showSubsidiaryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "pageLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "mainAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "shippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "returnAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isElimination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isElimination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fiscalCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxFiscalCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxFiscalCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPayroll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "allowPayroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("federalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "federalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "addrLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonConsol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nonConsol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "consol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state1TaxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "state1TaxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxRegistrationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SubsidiaryTaxRegistrationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssnOrTin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ssnOrTin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interCoAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "interCoAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nexusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SubsidiaryNexusList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SubsidiaryAccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "checkLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inboundEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classTranslationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "classTranslationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ClassTranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "customFieldList"));
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
