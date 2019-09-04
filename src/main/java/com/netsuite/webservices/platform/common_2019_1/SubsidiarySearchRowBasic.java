/**
 * SubsidiarySearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class SubsidiarySearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] anonymousCustomerInboundEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] anonymousCustomerOnlineForms;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseAssignmentTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseAutomaticClosureTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseCopyEmployeeTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseCreationTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseEscalationTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseUpdateTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] companyNameForSupportMessages;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] effectiveFrom;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] employeeCaseUpdateTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fax;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isElimination;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] legalName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mainSupportEmailAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nameNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nexus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxEngine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxIdNum;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxRegistrationNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranPrefix;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] validUntil;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public SubsidiarySearchRowBasic() {
    }

    public SubsidiarySearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBook,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] anonymousCustomerInboundEmail,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] anonymousCustomerOnlineForms,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseAssignmentTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseAutomaticClosureTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseCopyEmployeeTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseCreationTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseEscalationTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseUpdateTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] companyNameForSupportMessages,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] effectiveFrom,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] employeeCaseUpdateTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fax,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isElimination,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] legalName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mainSupportEmailAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nameNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nexus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxEngine,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxIdNum,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxRegistrationNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranPrefix,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] validUntil,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.accountingBook = accountingBook;
        this.accountingBookCurrency = accountingBookCurrency;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.anonymousCustomerInboundEmail = anonymousCustomerInboundEmail;
        this.anonymousCustomerOnlineForms = anonymousCustomerOnlineForms;
        this.caseAssignmentTemplate = caseAssignmentTemplate;
        this.caseAutomaticClosureTemplate = caseAutomaticClosureTemplate;
        this.caseCopyEmployeeTemplate = caseCopyEmployeeTemplate;
        this.caseCreationTemplate = caseCreationTemplate;
        this.caseEscalationTemplate = caseEscalationTemplate;
        this.caseUpdateTemplate = caseUpdateTemplate;
        this.city = city;
        this.companyNameForSupportMessages = companyNameForSupportMessages;
        this.country = country;
        this.currency = currency;
        this.effectiveFrom = effectiveFrom;
        this.email = email;
        this.employeeCaseUpdateTemplate = employeeCaseUpdateTemplate;
        this.externalId = externalId;
        this.fax = fax;
        this.internalId = internalId;
        this.isElimination = isElimination;
        this.isInactive = isInactive;
        this.legalName = legalName;
        this.mainSupportEmailAddress = mainSupportEmailAddress;
        this.name = name;
        this.nameNoHierarchy = nameNoHierarchy;
        this.nexus = nexus;
        this.phone = phone;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptAmount = receiptAmount;
        this.receiptQuantity = receiptQuantity;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.state = state;
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
     * Gets the accountingBook value for this SubsidiarySearchRowBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this SubsidiarySearchRowBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBook) {
        this.accountingBook = accountingBook;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccountingBook(int i) {
        return this.accountingBook[i];
    }

    public void setAccountingBook(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.accountingBook[i] = _value;
    }


    /**
     * Gets the accountingBookCurrency value for this SubsidiarySearchRowBasic.
     * 
     * @return accountingBookCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccountingBookCurrency() {
        return accountingBookCurrency;
    }


    /**
     * Sets the accountingBookCurrency value for this SubsidiarySearchRowBasic.
     * 
     * @param accountingBookCurrency
     */
    public void setAccountingBookCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookCurrency) {
        this.accountingBookCurrency = accountingBookCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccountingBookCurrency(int i) {
        return this.accountingBookCurrency[i];
    }

    public void setAccountingBookCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.accountingBookCurrency[i] = _value;
    }


    /**
     * Gets the address1 value for this SubsidiarySearchRowBasic.
     * 
     * @return address1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this SubsidiarySearchRowBasic.
     * 
     * @param address1
     */
    public void setAddress1(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1) {
        this.address1 = address1;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress1(int i) {
        return this.address1[i];
    }

    public void setAddress1(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address1[i] = _value;
    }


    /**
     * Gets the address2 value for this SubsidiarySearchRowBasic.
     * 
     * @return address2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this SubsidiarySearchRowBasic.
     * 
     * @param address2
     */
    public void setAddress2(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2) {
        this.address2 = address2;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress2(int i) {
        return this.address2[i];
    }

    public void setAddress2(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address2[i] = _value;
    }


    /**
     * Gets the address3 value for this SubsidiarySearchRowBasic.
     * 
     * @return address3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this SubsidiarySearchRowBasic.
     * 
     * @param address3
     */
    public void setAddress3(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3) {
        this.address3 = address3;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress3(int i) {
        return this.address3[i];
    }

    public void setAddress3(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address3[i] = _value;
    }


    /**
     * Gets the anonymousCustomerInboundEmail value for this SubsidiarySearchRowBasic.
     * 
     * @return anonymousCustomerInboundEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAnonymousCustomerInboundEmail() {
        return anonymousCustomerInboundEmail;
    }


    /**
     * Sets the anonymousCustomerInboundEmail value for this SubsidiarySearchRowBasic.
     * 
     * @param anonymousCustomerInboundEmail
     */
    public void setAnonymousCustomerInboundEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] anonymousCustomerInboundEmail) {
        this.anonymousCustomerInboundEmail = anonymousCustomerInboundEmail;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAnonymousCustomerInboundEmail(int i) {
        return this.anonymousCustomerInboundEmail[i];
    }

    public void setAnonymousCustomerInboundEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.anonymousCustomerInboundEmail[i] = _value;
    }


    /**
     * Gets the anonymousCustomerOnlineForms value for this SubsidiarySearchRowBasic.
     * 
     * @return anonymousCustomerOnlineForms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAnonymousCustomerOnlineForms() {
        return anonymousCustomerOnlineForms;
    }


    /**
     * Sets the anonymousCustomerOnlineForms value for this SubsidiarySearchRowBasic.
     * 
     * @param anonymousCustomerOnlineForms
     */
    public void setAnonymousCustomerOnlineForms(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] anonymousCustomerOnlineForms) {
        this.anonymousCustomerOnlineForms = anonymousCustomerOnlineForms;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAnonymousCustomerOnlineForms(int i) {
        return this.anonymousCustomerOnlineForms[i];
    }

    public void setAnonymousCustomerOnlineForms(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.anonymousCustomerOnlineForms[i] = _value;
    }


    /**
     * Gets the caseAssignmentTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @return caseAssignmentTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCaseAssignmentTemplate() {
        return caseAssignmentTemplate;
    }


    /**
     * Sets the caseAssignmentTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @param caseAssignmentTemplate
     */
    public void setCaseAssignmentTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseAssignmentTemplate) {
        this.caseAssignmentTemplate = caseAssignmentTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCaseAssignmentTemplate(int i) {
        return this.caseAssignmentTemplate[i];
    }

    public void setCaseAssignmentTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.caseAssignmentTemplate[i] = _value;
    }


    /**
     * Gets the caseAutomaticClosureTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @return caseAutomaticClosureTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCaseAutomaticClosureTemplate() {
        return caseAutomaticClosureTemplate;
    }


    /**
     * Sets the caseAutomaticClosureTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @param caseAutomaticClosureTemplate
     */
    public void setCaseAutomaticClosureTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseAutomaticClosureTemplate) {
        this.caseAutomaticClosureTemplate = caseAutomaticClosureTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCaseAutomaticClosureTemplate(int i) {
        return this.caseAutomaticClosureTemplate[i];
    }

    public void setCaseAutomaticClosureTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.caseAutomaticClosureTemplate[i] = _value;
    }


    /**
     * Gets the caseCopyEmployeeTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @return caseCopyEmployeeTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCaseCopyEmployeeTemplate() {
        return caseCopyEmployeeTemplate;
    }


    /**
     * Sets the caseCopyEmployeeTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @param caseCopyEmployeeTemplate
     */
    public void setCaseCopyEmployeeTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseCopyEmployeeTemplate) {
        this.caseCopyEmployeeTemplate = caseCopyEmployeeTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCaseCopyEmployeeTemplate(int i) {
        return this.caseCopyEmployeeTemplate[i];
    }

    public void setCaseCopyEmployeeTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.caseCopyEmployeeTemplate[i] = _value;
    }


    /**
     * Gets the caseCreationTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @return caseCreationTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCaseCreationTemplate() {
        return caseCreationTemplate;
    }


    /**
     * Sets the caseCreationTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @param caseCreationTemplate
     */
    public void setCaseCreationTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseCreationTemplate) {
        this.caseCreationTemplate = caseCreationTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCaseCreationTemplate(int i) {
        return this.caseCreationTemplate[i];
    }

    public void setCaseCreationTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.caseCreationTemplate[i] = _value;
    }


    /**
     * Gets the caseEscalationTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @return caseEscalationTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCaseEscalationTemplate() {
        return caseEscalationTemplate;
    }


    /**
     * Sets the caseEscalationTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @param caseEscalationTemplate
     */
    public void setCaseEscalationTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseEscalationTemplate) {
        this.caseEscalationTemplate = caseEscalationTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCaseEscalationTemplate(int i) {
        return this.caseEscalationTemplate[i];
    }

    public void setCaseEscalationTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.caseEscalationTemplate[i] = _value;
    }


    /**
     * Gets the caseUpdateTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @return caseUpdateTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCaseUpdateTemplate() {
        return caseUpdateTemplate;
    }


    /**
     * Sets the caseUpdateTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @param caseUpdateTemplate
     */
    public void setCaseUpdateTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseUpdateTemplate) {
        this.caseUpdateTemplate = caseUpdateTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCaseUpdateTemplate(int i) {
        return this.caseUpdateTemplate[i];
    }

    public void setCaseUpdateTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.caseUpdateTemplate[i] = _value;
    }


    /**
     * Gets the city value for this SubsidiarySearchRowBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this SubsidiarySearchRowBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city) {
        this.city = city;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.city[i] = _value;
    }


    /**
     * Gets the companyNameForSupportMessages value for this SubsidiarySearchRowBasic.
     * 
     * @return companyNameForSupportMessages
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCompanyNameForSupportMessages() {
        return companyNameForSupportMessages;
    }


    /**
     * Sets the companyNameForSupportMessages value for this SubsidiarySearchRowBasic.
     * 
     * @param companyNameForSupportMessages
     */
    public void setCompanyNameForSupportMessages(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] companyNameForSupportMessages) {
        this.companyNameForSupportMessages = companyNameForSupportMessages;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCompanyNameForSupportMessages(int i) {
        return this.companyNameForSupportMessages[i];
    }

    public void setCompanyNameForSupportMessages(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.companyNameForSupportMessages[i] = _value;
    }


    /**
     * Gets the country value for this SubsidiarySearchRowBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this SubsidiarySearchRowBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }


    /**
     * Gets the currency value for this SubsidiarySearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this SubsidiarySearchRowBasic.
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
     * Gets the effectiveFrom value for this SubsidiarySearchRowBasic.
     * 
     * @return effectiveFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEffectiveFrom() {
        return effectiveFrom;
    }


    /**
     * Sets the effectiveFrom value for this SubsidiarySearchRowBasic.
     * 
     * @param effectiveFrom
     */
    public void setEffectiveFrom(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEffectiveFrom(int i) {
        return this.effectiveFrom[i];
    }

    public void setEffectiveFrom(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.effectiveFrom[i] = _value;
    }


    /**
     * Gets the email value for this SubsidiarySearchRowBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SubsidiarySearchRowBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email) {
        this.email = email;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the employeeCaseUpdateTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @return employeeCaseUpdateTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEmployeeCaseUpdateTemplate() {
        return employeeCaseUpdateTemplate;
    }


    /**
     * Sets the employeeCaseUpdateTemplate value for this SubsidiarySearchRowBasic.
     * 
     * @param employeeCaseUpdateTemplate
     */
    public void setEmployeeCaseUpdateTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] employeeCaseUpdateTemplate) {
        this.employeeCaseUpdateTemplate = employeeCaseUpdateTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEmployeeCaseUpdateTemplate(int i) {
        return this.employeeCaseUpdateTemplate[i];
    }

    public void setEmployeeCaseUpdateTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.employeeCaseUpdateTemplate[i] = _value;
    }


    /**
     * Gets the externalId value for this SubsidiarySearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SubsidiarySearchRowBasic.
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
     * Gets the fax value for this SubsidiarySearchRowBasic.
     * 
     * @return fax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this SubsidiarySearchRowBasic.
     * 
     * @param fax
     */
    public void setFax(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fax) {
        this.fax = fax;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFax(int i) {
        return this.fax[i];
    }

    public void setFax(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.fax[i] = _value;
    }


    /**
     * Gets the internalId value for this SubsidiarySearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SubsidiarySearchRowBasic.
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
     * Gets the isElimination value for this SubsidiarySearchRowBasic.
     * 
     * @return isElimination
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsElimination() {
        return isElimination;
    }


    /**
     * Sets the isElimination value for this SubsidiarySearchRowBasic.
     * 
     * @param isElimination
     */
    public void setIsElimination(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isElimination) {
        this.isElimination = isElimination;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsElimination(int i) {
        return this.isElimination[i];
    }

    public void setIsElimination(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isElimination[i] = _value;
    }


    /**
     * Gets the isInactive value for this SubsidiarySearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SubsidiarySearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the legalName value for this SubsidiarySearchRowBasic.
     * 
     * @return legalName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this SubsidiarySearchRowBasic.
     * 
     * @param legalName
     */
    public void setLegalName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] legalName) {
        this.legalName = legalName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLegalName(int i) {
        return this.legalName[i];
    }

    public void setLegalName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.legalName[i] = _value;
    }


    /**
     * Gets the mainSupportEmailAddress value for this SubsidiarySearchRowBasic.
     * 
     * @return mainSupportEmailAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMainSupportEmailAddress() {
        return mainSupportEmailAddress;
    }


    /**
     * Sets the mainSupportEmailAddress value for this SubsidiarySearchRowBasic.
     * 
     * @param mainSupportEmailAddress
     */
    public void setMainSupportEmailAddress(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mainSupportEmailAddress) {
        this.mainSupportEmailAddress = mainSupportEmailAddress;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMainSupportEmailAddress(int i) {
        return this.mainSupportEmailAddress[i];
    }

    public void setMainSupportEmailAddress(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.mainSupportEmailAddress[i] = _value;
    }


    /**
     * Gets the name value for this SubsidiarySearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this SubsidiarySearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the nameNoHierarchy value for this SubsidiarySearchRowBasic.
     * 
     * @return nameNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNameNoHierarchy() {
        return nameNoHierarchy;
    }


    /**
     * Sets the nameNoHierarchy value for this SubsidiarySearchRowBasic.
     * 
     * @param nameNoHierarchy
     */
    public void setNameNoHierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNameNoHierarchy(int i) {
        return this.nameNoHierarchy[i];
    }

    public void setNameNoHierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.nameNoHierarchy[i] = _value;
    }


    /**
     * Gets the nexus value for this SubsidiarySearchRowBasic.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this SubsidiarySearchRowBasic.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nexus) {
        this.nexus = nexus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getNexus(int i) {
        return this.nexus[i];
    }

    public void setNexus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.nexus[i] = _value;
    }


    /**
     * Gets the phone value for this SubsidiarySearchRowBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this SubsidiarySearchRowBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone) {
        this.phone = phone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.phone[i] = _value;
    }


    /**
     * Gets the purchaseOrderAmount value for this SubsidiarySearchRowBasic.
     * 
     * @return purchaseOrderAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this SubsidiarySearchRowBasic.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPurchaseOrderAmount(int i) {
        return this.purchaseOrderAmount[i];
    }

    public void setPurchaseOrderAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.purchaseOrderAmount[i] = _value;
    }


    /**
     * Gets the purchaseOrderQuantity value for this SubsidiarySearchRowBasic.
     * 
     * @return purchaseOrderQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this SubsidiarySearchRowBasic.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPurchaseOrderQuantity(int i) {
        return this.purchaseOrderQuantity[i];
    }

    public void setPurchaseOrderQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.purchaseOrderQuantity[i] = _value;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this SubsidiarySearchRowBasic.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this SubsidiarySearchRowBasic.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPurchaseOrderQuantityDiff(int i) {
        return this.purchaseOrderQuantityDiff[i];
    }

    public void setPurchaseOrderQuantityDiff(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.purchaseOrderQuantityDiff[i] = _value;
    }


    /**
     * Gets the receiptAmount value for this SubsidiarySearchRowBasic.
     * 
     * @return receiptAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this SubsidiarySearchRowBasic.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReceiptAmount(int i) {
        return this.receiptAmount[i];
    }

    public void setReceiptAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.receiptAmount[i] = _value;
    }


    /**
     * Gets the receiptQuantity value for this SubsidiarySearchRowBasic.
     * 
     * @return receiptQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this SubsidiarySearchRowBasic.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReceiptQuantity(int i) {
        return this.receiptQuantity[i];
    }

    public void setReceiptQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.receiptQuantity[i] = _value;
    }


    /**
     * Gets the receiptQuantityDiff value for this SubsidiarySearchRowBasic.
     * 
     * @return receiptQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this SubsidiarySearchRowBasic.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReceiptQuantityDiff(int i) {
        return this.receiptQuantityDiff[i];
    }

    public void setReceiptQuantityDiff(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.receiptQuantityDiff[i] = _value;
    }


    /**
     * Gets the state value for this SubsidiarySearchRowBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this SubsidiarySearchRowBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state) {
        this.state = state;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the taxEngine value for this SubsidiarySearchRowBasic.
     * 
     * @return taxEngine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxEngine() {
        return taxEngine;
    }


    /**
     * Sets the taxEngine value for this SubsidiarySearchRowBasic.
     * 
     * @param taxEngine
     */
    public void setTaxEngine(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxEngine) {
        this.taxEngine = taxEngine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxEngine(int i) {
        return this.taxEngine[i];
    }

    public void setTaxEngine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxEngine[i] = _value;
    }


    /**
     * Gets the taxIdNum value for this SubsidiarySearchRowBasic.
     * 
     * @return taxIdNum
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTaxIdNum() {
        return taxIdNum;
    }


    /**
     * Sets the taxIdNum value for this SubsidiarySearchRowBasic.
     * 
     * @param taxIdNum
     */
    public void setTaxIdNum(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxIdNum) {
        this.taxIdNum = taxIdNum;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTaxIdNum(int i) {
        return this.taxIdNum[i];
    }

    public void setTaxIdNum(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.taxIdNum[i] = _value;
    }


    /**
     * Gets the taxRegistrationNumber value for this SubsidiarySearchRowBasic.
     * 
     * @return taxRegistrationNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }


    /**
     * Sets the taxRegistrationNumber value for this SubsidiarySearchRowBasic.
     * 
     * @param taxRegistrationNumber
     */
    public void setTaxRegistrationNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTaxRegistrationNumber(int i) {
        return this.taxRegistrationNumber[i];
    }

    public void setTaxRegistrationNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.taxRegistrationNumber[i] = _value;
    }


    /**
     * Gets the tranPrefix value for this SubsidiarySearchRowBasic.
     * 
     * @return tranPrefix
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTranPrefix() {
        return tranPrefix;
    }


    /**
     * Sets the tranPrefix value for this SubsidiarySearchRowBasic.
     * 
     * @param tranPrefix
     */
    public void setTranPrefix(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranPrefix) {
        this.tranPrefix = tranPrefix;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTranPrefix(int i) {
        return this.tranPrefix[i];
    }

    public void setTranPrefix(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.tranPrefix[i] = _value;
    }


    /**
     * Gets the url value for this SubsidiarySearchRowBasic.
     * 
     * @return url
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUrl() {
        return url;
    }


    /**
     * Sets the url value for this SubsidiarySearchRowBasic.
     * 
     * @param url
     */
    public void setUrl(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url) {
        this.url = url;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getUrl(int i) {
        return this.url[i];
    }

    public void setUrl(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.url[i] = _value;
    }


    /**
     * Gets the validUntil value for this SubsidiarySearchRowBasic.
     * 
     * @return validUntil
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this SubsidiarySearchRowBasic.
     * 
     * @param validUntil
     */
    public void setValidUntil(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] validUntil) {
        this.validUntil = validUntil;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getValidUntil(int i) {
        return this.validUntil[i];
    }

    public void setValidUntil(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.validUntil[i] = _value;
    }


    /**
     * Gets the zip value for this SubsidiarySearchRowBasic.
     * 
     * @return zip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this SubsidiarySearchRowBasic.
     * 
     * @param zip
     */
    public void setZip(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip) {
        this.zip = zip;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getZip(int i) {
        return this.zip[i];
    }

    public void setZip(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.zip[i] = _value;
    }


    /**
     * Gets the customFieldList value for this SubsidiarySearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SubsidiarySearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubsidiarySearchRowBasic)) return false;
        SubsidiarySearchRowBasic other = (SubsidiarySearchRowBasic) obj;
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
              java.util.Arrays.equals(this.accountingBook, other.getAccountingBook()))) &&
            ((this.accountingBookCurrency==null && other.getAccountingBookCurrency()==null) || 
             (this.accountingBookCurrency!=null &&
              java.util.Arrays.equals(this.accountingBookCurrency, other.getAccountingBookCurrency()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              java.util.Arrays.equals(this.address1, other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              java.util.Arrays.equals(this.address2, other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              java.util.Arrays.equals(this.address3, other.getAddress3()))) &&
            ((this.anonymousCustomerInboundEmail==null && other.getAnonymousCustomerInboundEmail()==null) || 
             (this.anonymousCustomerInboundEmail!=null &&
              java.util.Arrays.equals(this.anonymousCustomerInboundEmail, other.getAnonymousCustomerInboundEmail()))) &&
            ((this.anonymousCustomerOnlineForms==null && other.getAnonymousCustomerOnlineForms()==null) || 
             (this.anonymousCustomerOnlineForms!=null &&
              java.util.Arrays.equals(this.anonymousCustomerOnlineForms, other.getAnonymousCustomerOnlineForms()))) &&
            ((this.caseAssignmentTemplate==null && other.getCaseAssignmentTemplate()==null) || 
             (this.caseAssignmentTemplate!=null &&
              java.util.Arrays.equals(this.caseAssignmentTemplate, other.getCaseAssignmentTemplate()))) &&
            ((this.caseAutomaticClosureTemplate==null && other.getCaseAutomaticClosureTemplate()==null) || 
             (this.caseAutomaticClosureTemplate!=null &&
              java.util.Arrays.equals(this.caseAutomaticClosureTemplate, other.getCaseAutomaticClosureTemplate()))) &&
            ((this.caseCopyEmployeeTemplate==null && other.getCaseCopyEmployeeTemplate()==null) || 
             (this.caseCopyEmployeeTemplate!=null &&
              java.util.Arrays.equals(this.caseCopyEmployeeTemplate, other.getCaseCopyEmployeeTemplate()))) &&
            ((this.caseCreationTemplate==null && other.getCaseCreationTemplate()==null) || 
             (this.caseCreationTemplate!=null &&
              java.util.Arrays.equals(this.caseCreationTemplate, other.getCaseCreationTemplate()))) &&
            ((this.caseEscalationTemplate==null && other.getCaseEscalationTemplate()==null) || 
             (this.caseEscalationTemplate!=null &&
              java.util.Arrays.equals(this.caseEscalationTemplate, other.getCaseEscalationTemplate()))) &&
            ((this.caseUpdateTemplate==null && other.getCaseUpdateTemplate()==null) || 
             (this.caseUpdateTemplate!=null &&
              java.util.Arrays.equals(this.caseUpdateTemplate, other.getCaseUpdateTemplate()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.companyNameForSupportMessages==null && other.getCompanyNameForSupportMessages()==null) || 
             (this.companyNameForSupportMessages!=null &&
              java.util.Arrays.equals(this.companyNameForSupportMessages, other.getCompanyNameForSupportMessages()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.effectiveFrom==null && other.getEffectiveFrom()==null) || 
             (this.effectiveFrom!=null &&
              java.util.Arrays.equals(this.effectiveFrom, other.getEffectiveFrom()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.employeeCaseUpdateTemplate==null && other.getEmployeeCaseUpdateTemplate()==null) || 
             (this.employeeCaseUpdateTemplate!=null &&
              java.util.Arrays.equals(this.employeeCaseUpdateTemplate, other.getEmployeeCaseUpdateTemplate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              java.util.Arrays.equals(this.fax, other.getFax()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isElimination==null && other.getIsElimination()==null) || 
             (this.isElimination!=null &&
              java.util.Arrays.equals(this.isElimination, other.getIsElimination()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              java.util.Arrays.equals(this.legalName, other.getLegalName()))) &&
            ((this.mainSupportEmailAddress==null && other.getMainSupportEmailAddress()==null) || 
             (this.mainSupportEmailAddress!=null &&
              java.util.Arrays.equals(this.mainSupportEmailAddress, other.getMainSupportEmailAddress()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.nameNoHierarchy==null && other.getNameNoHierarchy()==null) || 
             (this.nameNoHierarchy!=null &&
              java.util.Arrays.equals(this.nameNoHierarchy, other.getNameNoHierarchy()))) &&
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              java.util.Arrays.equals(this.nexus, other.getNexus()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.purchaseOrderAmount==null && other.getPurchaseOrderAmount()==null) || 
             (this.purchaseOrderAmount!=null &&
              java.util.Arrays.equals(this.purchaseOrderAmount, other.getPurchaseOrderAmount()))) &&
            ((this.purchaseOrderQuantity==null && other.getPurchaseOrderQuantity()==null) || 
             (this.purchaseOrderQuantity!=null &&
              java.util.Arrays.equals(this.purchaseOrderQuantity, other.getPurchaseOrderQuantity()))) &&
            ((this.purchaseOrderQuantityDiff==null && other.getPurchaseOrderQuantityDiff()==null) || 
             (this.purchaseOrderQuantityDiff!=null &&
              java.util.Arrays.equals(this.purchaseOrderQuantityDiff, other.getPurchaseOrderQuantityDiff()))) &&
            ((this.receiptAmount==null && other.getReceiptAmount()==null) || 
             (this.receiptAmount!=null &&
              java.util.Arrays.equals(this.receiptAmount, other.getReceiptAmount()))) &&
            ((this.receiptQuantity==null && other.getReceiptQuantity()==null) || 
             (this.receiptQuantity!=null &&
              java.util.Arrays.equals(this.receiptQuantity, other.getReceiptQuantity()))) &&
            ((this.receiptQuantityDiff==null && other.getReceiptQuantityDiff()==null) || 
             (this.receiptQuantityDiff!=null &&
              java.util.Arrays.equals(this.receiptQuantityDiff, other.getReceiptQuantityDiff()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.taxEngine==null && other.getTaxEngine()==null) || 
             (this.taxEngine!=null &&
              java.util.Arrays.equals(this.taxEngine, other.getTaxEngine()))) &&
            ((this.taxIdNum==null && other.getTaxIdNum()==null) || 
             (this.taxIdNum!=null &&
              java.util.Arrays.equals(this.taxIdNum, other.getTaxIdNum()))) &&
            ((this.taxRegistrationNumber==null && other.getTaxRegistrationNumber()==null) || 
             (this.taxRegistrationNumber!=null &&
              java.util.Arrays.equals(this.taxRegistrationNumber, other.getTaxRegistrationNumber()))) &&
            ((this.tranPrefix==null && other.getTranPrefix()==null) || 
             (this.tranPrefix!=null &&
              java.util.Arrays.equals(this.tranPrefix, other.getTranPrefix()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              java.util.Arrays.equals(this.url, other.getUrl()))) &&
            ((this.validUntil==null && other.getValidUntil()==null) || 
             (this.validUntil!=null &&
              java.util.Arrays.equals(this.validUntil, other.getValidUntil()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              java.util.Arrays.equals(this.zip, other.getZip()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBook());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBook(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountingBookCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBookCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBookCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnonymousCustomerInboundEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnonymousCustomerInboundEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnonymousCustomerInboundEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnonymousCustomerOnlineForms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnonymousCustomerOnlineForms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnonymousCustomerOnlineForms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseAssignmentTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseAssignmentTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseAssignmentTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseAutomaticClosureTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseAutomaticClosureTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseAutomaticClosureTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseCopyEmployeeTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseCopyEmployeeTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseCopyEmployeeTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseCreationTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseCreationTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseCreationTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseEscalationTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseEscalationTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseEscalationTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseUpdateTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseUpdateTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseUpdateTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompanyNameForSupportMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanyNameForSupportMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanyNameForSupportMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
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
        if (getEffectiveFrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveFrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveFrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeCaseUpdateTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeCaseUpdateTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeCaseUpdateTemplate(), i);
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
        if (getFax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFax(), i);
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
        if (getIsElimination() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsElimination());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsElimination(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegalName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegalName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegalName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMainSupportEmailAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMainSupportEmailAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMainSupportEmailAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNameNoHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameNoHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameNoHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNexus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNexus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNexus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderQuantityDiff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderQuantityDiff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderQuantityDiff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptQuantityDiff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptQuantityDiff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptQuantityDiff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxEngine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxEngine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxEngine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxIdNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxIdNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxIdNum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxRegistrationNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxRegistrationNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxRegistrationNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranPrefix() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranPrefix());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranPrefix(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValidUntil() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidUntil());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidUntil(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZip(), i);
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
        new org.apache.axis.description.TypeDesc(SubsidiarySearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonymousCustomerInboundEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "anonymousCustomerInboundEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonymousCustomerOnlineForms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "anonymousCustomerOnlineForms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseAssignmentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseAssignmentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseAutomaticClosureTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseAutomaticClosureTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCopyEmployeeTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseCopyEmployeeTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCreationTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseCreationTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseEscalationTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseEscalationTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseUpdateTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseUpdateTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyNameForSupportMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "companyNameForSupportMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("effectiveFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeCaseUpdateTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employeeCaseUpdateTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isElimination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isElimination"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainSupportEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mainSupportEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxEngine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxIdNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "validUntil"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
