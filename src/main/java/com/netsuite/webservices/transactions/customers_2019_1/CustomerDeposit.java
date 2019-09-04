/**
 * CustomerDeposit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2019_1;

public class CustomerDeposit  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String status;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesOrder;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.Double payment;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod;

    private java.lang.Boolean ccIsPurchaseCardBin;

    private java.lang.String memo;

    private java.lang.Boolean ccProcessAsPurchaseCard;

    private java.lang.String currencyName;

    private java.lang.Double exchangeRate;

    private java.lang.String checkNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard;

    private java.lang.String ccSecurityCode;

    private java.lang.String ccNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption;

    private java.lang.String inputAuthCode;

    private java.lang.String inputReferenceCode;

    private java.lang.String checkNumber;

    private java.lang.String paymentCardCsc;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile;

    private com.netsuite.webservices.transactions.customers_2019_1.types.CustomerDepositHandlingMode handlingMode;

    private java.lang.String outputAuthCode;

    private java.lang.String outputReferenceCode;

    private com.netsuite.webservices.transactions.customers_2019_1.types.CustomerDepositPaymentOperation paymentOperation;

    private java.lang.String dynamicDescriptor;

    private java.util.Calendar ccExpireDate;

    private java.lang.String debitCardIssueNo;

    private java.util.Calendar validFrom;

    private java.lang.String ccName;

    private java.lang.String ccStreet;

    private java.lang.String ccZipCode;

    private java.lang.Boolean chargeIt;

    private java.lang.Boolean ccApproved;

    private java.lang.String pnRefNum;

    private java.lang.String authCode;

    private com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsStreetMatch;

    private java.lang.String softDescriptor;

    private com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsZipMatch;

    private java.lang.Boolean isRecurringPayment;

    private com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccSecurityCodeMatch;

    private java.lang.String threeDStatusCode;

    private java.lang.Boolean ignoreAvs;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef account;

    private java.lang.Boolean undepFunds;

    private java.lang.String tranId;

    private com.netsuite.webservices.transactions.customers_2019_1.CustomerDepositApplyList applyList;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CustomerDeposit() {
    }

    public CustomerDeposit(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           java.lang.String status,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesOrder,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.Double payment,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.util.Calendar tranDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod,
           java.lang.Boolean ccIsPurchaseCardBin,
           java.lang.String memo,
           java.lang.Boolean ccProcessAsPurchaseCard,
           java.lang.String currencyName,
           java.lang.Double exchangeRate,
           java.lang.String checkNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard,
           java.lang.String ccSecurityCode,
           java.lang.String ccNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption,
           java.lang.String inputAuthCode,
           java.lang.String inputReferenceCode,
           java.lang.String checkNumber,
           java.lang.String paymentCardCsc,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile,
           com.netsuite.webservices.transactions.customers_2019_1.types.CustomerDepositHandlingMode handlingMode,
           java.lang.String outputAuthCode,
           java.lang.String outputReferenceCode,
           com.netsuite.webservices.transactions.customers_2019_1.types.CustomerDepositPaymentOperation paymentOperation,
           java.lang.String dynamicDescriptor,
           java.util.Calendar ccExpireDate,
           java.lang.String debitCardIssueNo,
           java.util.Calendar validFrom,
           java.lang.String ccName,
           java.lang.String ccStreet,
           java.lang.String ccZipCode,
           java.lang.Boolean chargeIt,
           java.lang.Boolean ccApproved,
           java.lang.String pnRefNum,
           java.lang.String authCode,
           com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsStreetMatch,
           java.lang.String softDescriptor,
           com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsZipMatch,
           java.lang.Boolean isRecurringPayment,
           com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccSecurityCodeMatch,
           java.lang.String threeDStatusCode,
           java.lang.Boolean ignoreAvs,
           com.netsuite.webservices.platform.core_2019_1.RecordRef account,
           java.lang.Boolean undepFunds,
           java.lang.String tranId,
           com.netsuite.webservices.transactions.customers_2019_1.CustomerDepositApplyList applyList,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.status = status;
        this.customer = customer;
        this.salesOrder = salesOrder;
        this.customForm = customForm;
        this.payment = payment;
        this.currency = currency;
        this.tranDate = tranDate;
        this.postingPeriod = postingPeriod;
        this.paymentMethod = paymentMethod;
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
        this.memo = memo;
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.checkNum = checkNum;
        this.creditCardProcessor = creditCardProcessor;
        this.creditCard = creditCard;
        this.ccSecurityCode = ccSecurityCode;
        this.ccNumber = ccNumber;
        this.subsidiary = subsidiary;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.paymentOption = paymentOption;
        this.inputAuthCode = inputAuthCode;
        this.inputReferenceCode = inputReferenceCode;
        this.checkNumber = checkNumber;
        this.paymentCardCsc = paymentCardCsc;
        this.paymentProcessingProfile = paymentProcessingProfile;
        this.handlingMode = handlingMode;
        this.outputAuthCode = outputAuthCode;
        this.outputReferenceCode = outputReferenceCode;
        this.paymentOperation = paymentOperation;
        this.dynamicDescriptor = dynamicDescriptor;
        this.ccExpireDate = ccExpireDate;
        this.debitCardIssueNo = debitCardIssueNo;
        this.validFrom = validFrom;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.chargeIt = chargeIt;
        this.ccApproved = ccApproved;
        this.pnRefNum = pnRefNum;
        this.authCode = authCode;
        this.ccAvsStreetMatch = ccAvsStreetMatch;
        this.softDescriptor = softDescriptor;
        this.ccAvsZipMatch = ccAvsZipMatch;
        this.isRecurringPayment = isRecurringPayment;
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
        this.threeDStatusCode = threeDStatusCode;
        this.ignoreAvs = ignoreAvs;
        this.account = account;
        this.undepFunds = undepFunds;
        this.tranId = tranId;
        this.applyList = applyList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this CustomerDeposit.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CustomerDeposit.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this CustomerDeposit.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CustomerDeposit.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the status value for this CustomerDeposit.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CustomerDeposit.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the customer value for this CustomerDeposit.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this CustomerDeposit.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the salesOrder value for this CustomerDeposit.
     * 
     * @return salesOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesOrder() {
        return salesOrder;
    }


    /**
     * Sets the salesOrder value for this CustomerDeposit.
     * 
     * @param salesOrder
     */
    public void setSalesOrder(com.netsuite.webservices.platform.core_2019_1.RecordRef salesOrder) {
        this.salesOrder = salesOrder;
    }


    /**
     * Gets the customForm value for this CustomerDeposit.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this CustomerDeposit.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the payment value for this CustomerDeposit.
     * 
     * @return payment
     */
    public java.lang.Double getPayment() {
        return payment;
    }


    /**
     * Sets the payment value for this CustomerDeposit.
     * 
     * @param payment
     */
    public void setPayment(java.lang.Double payment) {
        this.payment = payment;
    }


    /**
     * Gets the currency value for this CustomerDeposit.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CustomerDeposit.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the tranDate value for this CustomerDeposit.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this CustomerDeposit.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the postingPeriod value for this CustomerDeposit.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this CustomerDeposit.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the paymentMethod value for this CustomerDeposit.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this CustomerDeposit.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the ccIsPurchaseCardBin value for this CustomerDeposit.
     * 
     * @return ccIsPurchaseCardBin
     */
    public java.lang.Boolean getCcIsPurchaseCardBin() {
        return ccIsPurchaseCardBin;
    }


    /**
     * Sets the ccIsPurchaseCardBin value for this CustomerDeposit.
     * 
     * @param ccIsPurchaseCardBin
     */
    public void setCcIsPurchaseCardBin(java.lang.Boolean ccIsPurchaseCardBin) {
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
    }


    /**
     * Gets the memo value for this CustomerDeposit.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this CustomerDeposit.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the ccProcessAsPurchaseCard value for this CustomerDeposit.
     * 
     * @return ccProcessAsPurchaseCard
     */
    public java.lang.Boolean getCcProcessAsPurchaseCard() {
        return ccProcessAsPurchaseCard;
    }


    /**
     * Sets the ccProcessAsPurchaseCard value for this CustomerDeposit.
     * 
     * @param ccProcessAsPurchaseCard
     */
    public void setCcProcessAsPurchaseCard(java.lang.Boolean ccProcessAsPurchaseCard) {
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
    }


    /**
     * Gets the currencyName value for this CustomerDeposit.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this CustomerDeposit.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the exchangeRate value for this CustomerDeposit.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this CustomerDeposit.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the checkNum value for this CustomerDeposit.
     * 
     * @return checkNum
     */
    public java.lang.String getCheckNum() {
        return checkNum;
    }


    /**
     * Sets the checkNum value for this CustomerDeposit.
     * 
     * @param checkNum
     */
    public void setCheckNum(java.lang.String checkNum) {
        this.checkNum = checkNum;
    }


    /**
     * Gets the creditCardProcessor value for this CustomerDeposit.
     * 
     * @return creditCardProcessor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCardProcessor() {
        return creditCardProcessor;
    }


    /**
     * Sets the creditCardProcessor value for this CustomerDeposit.
     * 
     * @param creditCardProcessor
     */
    public void setCreditCardProcessor(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }


    /**
     * Gets the creditCard value for this CustomerDeposit.
     * 
     * @return creditCard
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this CustomerDeposit.
     * 
     * @param creditCard
     */
    public void setCreditCard(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the ccSecurityCode value for this CustomerDeposit.
     * 
     * @return ccSecurityCode
     */
    public java.lang.String getCcSecurityCode() {
        return ccSecurityCode;
    }


    /**
     * Sets the ccSecurityCode value for this CustomerDeposit.
     * 
     * @param ccSecurityCode
     */
    public void setCcSecurityCode(java.lang.String ccSecurityCode) {
        this.ccSecurityCode = ccSecurityCode;
    }


    /**
     * Gets the ccNumber value for this CustomerDeposit.
     * 
     * @return ccNumber
     */
    public java.lang.String getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this CustomerDeposit.
     * 
     * @param ccNumber
     */
    public void setCcNumber(java.lang.String ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the subsidiary value for this CustomerDeposit.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this CustomerDeposit.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the department value for this CustomerDeposit.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CustomerDeposit.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this CustomerDeposit.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this CustomerDeposit.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this CustomerDeposit.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CustomerDeposit.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the paymentOption value for this CustomerDeposit.
     * 
     * @return paymentOption
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentOption() {
        return paymentOption;
    }


    /**
     * Sets the paymentOption value for this CustomerDeposit.
     * 
     * @param paymentOption
     */
    public void setPaymentOption(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption) {
        this.paymentOption = paymentOption;
    }


    /**
     * Gets the inputAuthCode value for this CustomerDeposit.
     * 
     * @return inputAuthCode
     */
    public java.lang.String getInputAuthCode() {
        return inputAuthCode;
    }


    /**
     * Sets the inputAuthCode value for this CustomerDeposit.
     * 
     * @param inputAuthCode
     */
    public void setInputAuthCode(java.lang.String inputAuthCode) {
        this.inputAuthCode = inputAuthCode;
    }


    /**
     * Gets the inputReferenceCode value for this CustomerDeposit.
     * 
     * @return inputReferenceCode
     */
    public java.lang.String getInputReferenceCode() {
        return inputReferenceCode;
    }


    /**
     * Sets the inputReferenceCode value for this CustomerDeposit.
     * 
     * @param inputReferenceCode
     */
    public void setInputReferenceCode(java.lang.String inputReferenceCode) {
        this.inputReferenceCode = inputReferenceCode;
    }


    /**
     * Gets the checkNumber value for this CustomerDeposit.
     * 
     * @return checkNumber
     */
    public java.lang.String getCheckNumber() {
        return checkNumber;
    }


    /**
     * Sets the checkNumber value for this CustomerDeposit.
     * 
     * @param checkNumber
     */
    public void setCheckNumber(java.lang.String checkNumber) {
        this.checkNumber = checkNumber;
    }


    /**
     * Gets the paymentCardCsc value for this CustomerDeposit.
     * 
     * @return paymentCardCsc
     */
    public java.lang.String getPaymentCardCsc() {
        return paymentCardCsc;
    }


    /**
     * Sets the paymentCardCsc value for this CustomerDeposit.
     * 
     * @param paymentCardCsc
     */
    public void setPaymentCardCsc(java.lang.String paymentCardCsc) {
        this.paymentCardCsc = paymentCardCsc;
    }


    /**
     * Gets the paymentProcessingProfile value for this CustomerDeposit.
     * 
     * @return paymentProcessingProfile
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentProcessingProfile() {
        return paymentProcessingProfile;
    }


    /**
     * Sets the paymentProcessingProfile value for this CustomerDeposit.
     * 
     * @param paymentProcessingProfile
     */
    public void setPaymentProcessingProfile(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile) {
        this.paymentProcessingProfile = paymentProcessingProfile;
    }


    /**
     * Gets the handlingMode value for this CustomerDeposit.
     * 
     * @return handlingMode
     */
    public com.netsuite.webservices.transactions.customers_2019_1.types.CustomerDepositHandlingMode getHandlingMode() {
        return handlingMode;
    }


    /**
     * Sets the handlingMode value for this CustomerDeposit.
     * 
     * @param handlingMode
     */
    public void setHandlingMode(com.netsuite.webservices.transactions.customers_2019_1.types.CustomerDepositHandlingMode handlingMode) {
        this.handlingMode = handlingMode;
    }


    /**
     * Gets the outputAuthCode value for this CustomerDeposit.
     * 
     * @return outputAuthCode
     */
    public java.lang.String getOutputAuthCode() {
        return outputAuthCode;
    }


    /**
     * Sets the outputAuthCode value for this CustomerDeposit.
     * 
     * @param outputAuthCode
     */
    public void setOutputAuthCode(java.lang.String outputAuthCode) {
        this.outputAuthCode = outputAuthCode;
    }


    /**
     * Gets the outputReferenceCode value for this CustomerDeposit.
     * 
     * @return outputReferenceCode
     */
    public java.lang.String getOutputReferenceCode() {
        return outputReferenceCode;
    }


    /**
     * Sets the outputReferenceCode value for this CustomerDeposit.
     * 
     * @param outputReferenceCode
     */
    public void setOutputReferenceCode(java.lang.String outputReferenceCode) {
        this.outputReferenceCode = outputReferenceCode;
    }


    /**
     * Gets the paymentOperation value for this CustomerDeposit.
     * 
     * @return paymentOperation
     */
    public com.netsuite.webservices.transactions.customers_2019_1.types.CustomerDepositPaymentOperation getPaymentOperation() {
        return paymentOperation;
    }


    /**
     * Sets the paymentOperation value for this CustomerDeposit.
     * 
     * @param paymentOperation
     */
    public void setPaymentOperation(com.netsuite.webservices.transactions.customers_2019_1.types.CustomerDepositPaymentOperation paymentOperation) {
        this.paymentOperation = paymentOperation;
    }


    /**
     * Gets the dynamicDescriptor value for this CustomerDeposit.
     * 
     * @return dynamicDescriptor
     */
    public java.lang.String getDynamicDescriptor() {
        return dynamicDescriptor;
    }


    /**
     * Sets the dynamicDescriptor value for this CustomerDeposit.
     * 
     * @param dynamicDescriptor
     */
    public void setDynamicDescriptor(java.lang.String dynamicDescriptor) {
        this.dynamicDescriptor = dynamicDescriptor;
    }


    /**
     * Gets the ccExpireDate value for this CustomerDeposit.
     * 
     * @return ccExpireDate
     */
    public java.util.Calendar getCcExpireDate() {
        return ccExpireDate;
    }


    /**
     * Sets the ccExpireDate value for this CustomerDeposit.
     * 
     * @param ccExpireDate
     */
    public void setCcExpireDate(java.util.Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }


    /**
     * Gets the debitCardIssueNo value for this CustomerDeposit.
     * 
     * @return debitCardIssueNo
     */
    public java.lang.String getDebitCardIssueNo() {
        return debitCardIssueNo;
    }


    /**
     * Sets the debitCardIssueNo value for this CustomerDeposit.
     * 
     * @param debitCardIssueNo
     */
    public void setDebitCardIssueNo(java.lang.String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }


    /**
     * Gets the validFrom value for this CustomerDeposit.
     * 
     * @return validFrom
     */
    public java.util.Calendar getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this CustomerDeposit.
     * 
     * @param validFrom
     */
    public void setValidFrom(java.util.Calendar validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the ccName value for this CustomerDeposit.
     * 
     * @return ccName
     */
    public java.lang.String getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this CustomerDeposit.
     * 
     * @param ccName
     */
    public void setCcName(java.lang.String ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the ccStreet value for this CustomerDeposit.
     * 
     * @return ccStreet
     */
    public java.lang.String getCcStreet() {
        return ccStreet;
    }


    /**
     * Sets the ccStreet value for this CustomerDeposit.
     * 
     * @param ccStreet
     */
    public void setCcStreet(java.lang.String ccStreet) {
        this.ccStreet = ccStreet;
    }


    /**
     * Gets the ccZipCode value for this CustomerDeposit.
     * 
     * @return ccZipCode
     */
    public java.lang.String getCcZipCode() {
        return ccZipCode;
    }


    /**
     * Sets the ccZipCode value for this CustomerDeposit.
     * 
     * @param ccZipCode
     */
    public void setCcZipCode(java.lang.String ccZipCode) {
        this.ccZipCode = ccZipCode;
    }


    /**
     * Gets the chargeIt value for this CustomerDeposit.
     * 
     * @return chargeIt
     */
    public java.lang.Boolean getChargeIt() {
        return chargeIt;
    }


    /**
     * Sets the chargeIt value for this CustomerDeposit.
     * 
     * @param chargeIt
     */
    public void setChargeIt(java.lang.Boolean chargeIt) {
        this.chargeIt = chargeIt;
    }


    /**
     * Gets the ccApproved value for this CustomerDeposit.
     * 
     * @return ccApproved
     */
    public java.lang.Boolean getCcApproved() {
        return ccApproved;
    }


    /**
     * Sets the ccApproved value for this CustomerDeposit.
     * 
     * @param ccApproved
     */
    public void setCcApproved(java.lang.Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }


    /**
     * Gets the pnRefNum value for this CustomerDeposit.
     * 
     * @return pnRefNum
     */
    public java.lang.String getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this CustomerDeposit.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(java.lang.String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }


    /**
     * Gets the authCode value for this CustomerDeposit.
     * 
     * @return authCode
     */
    public java.lang.String getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this CustomerDeposit.
     * 
     * @param authCode
     */
    public void setAuthCode(java.lang.String authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the ccAvsStreetMatch value for this CustomerDeposit.
     * 
     * @return ccAvsStreetMatch
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode getCcAvsStreetMatch() {
        return ccAvsStreetMatch;
    }


    /**
     * Sets the ccAvsStreetMatch value for this CustomerDeposit.
     * 
     * @param ccAvsStreetMatch
     */
    public void setCcAvsStreetMatch(com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsStreetMatch) {
        this.ccAvsStreetMatch = ccAvsStreetMatch;
    }


    /**
     * Gets the softDescriptor value for this CustomerDeposit.
     * 
     * @return softDescriptor
     */
    public java.lang.String getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this CustomerDeposit.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(java.lang.String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the ccAvsZipMatch value for this CustomerDeposit.
     * 
     * @return ccAvsZipMatch
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode getCcAvsZipMatch() {
        return ccAvsZipMatch;
    }


    /**
     * Sets the ccAvsZipMatch value for this CustomerDeposit.
     * 
     * @param ccAvsZipMatch
     */
    public void setCcAvsZipMatch(com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsZipMatch) {
        this.ccAvsZipMatch = ccAvsZipMatch;
    }


    /**
     * Gets the isRecurringPayment value for this CustomerDeposit.
     * 
     * @return isRecurringPayment
     */
    public java.lang.Boolean getIsRecurringPayment() {
        return isRecurringPayment;
    }


    /**
     * Sets the isRecurringPayment value for this CustomerDeposit.
     * 
     * @param isRecurringPayment
     */
    public void setIsRecurringPayment(java.lang.Boolean isRecurringPayment) {
        this.isRecurringPayment = isRecurringPayment;
    }


    /**
     * Gets the ccSecurityCodeMatch value for this CustomerDeposit.
     * 
     * @return ccSecurityCodeMatch
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode getCcSecurityCodeMatch() {
        return ccSecurityCodeMatch;
    }


    /**
     * Sets the ccSecurityCodeMatch value for this CustomerDeposit.
     * 
     * @param ccSecurityCodeMatch
     */
    public void setCcSecurityCodeMatch(com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccSecurityCodeMatch) {
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
    }


    /**
     * Gets the threeDStatusCode value for this CustomerDeposit.
     * 
     * @return threeDStatusCode
     */
    public java.lang.String getThreeDStatusCode() {
        return threeDStatusCode;
    }


    /**
     * Sets the threeDStatusCode value for this CustomerDeposit.
     * 
     * @param threeDStatusCode
     */
    public void setThreeDStatusCode(java.lang.String threeDStatusCode) {
        this.threeDStatusCode = threeDStatusCode;
    }


    /**
     * Gets the ignoreAvs value for this CustomerDeposit.
     * 
     * @return ignoreAvs
     */
    public java.lang.Boolean getIgnoreAvs() {
        return ignoreAvs;
    }


    /**
     * Sets the ignoreAvs value for this CustomerDeposit.
     * 
     * @param ignoreAvs
     */
    public void setIgnoreAvs(java.lang.Boolean ignoreAvs) {
        this.ignoreAvs = ignoreAvs;
    }


    /**
     * Gets the account value for this CustomerDeposit.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CustomerDeposit.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the undepFunds value for this CustomerDeposit.
     * 
     * @return undepFunds
     */
    public java.lang.Boolean getUndepFunds() {
        return undepFunds;
    }


    /**
     * Sets the undepFunds value for this CustomerDeposit.
     * 
     * @param undepFunds
     */
    public void setUndepFunds(java.lang.Boolean undepFunds) {
        this.undepFunds = undepFunds;
    }


    /**
     * Gets the tranId value for this CustomerDeposit.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this CustomerDeposit.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the applyList value for this CustomerDeposit.
     * 
     * @return applyList
     */
    public com.netsuite.webservices.transactions.customers_2019_1.CustomerDepositApplyList getApplyList() {
        return applyList;
    }


    /**
     * Sets the applyList value for this CustomerDeposit.
     * 
     * @param applyList
     */
    public void setApplyList(com.netsuite.webservices.transactions.customers_2019_1.CustomerDepositApplyList applyList) {
        this.applyList = applyList;
    }


    /**
     * Gets the accountingBookDetailList value for this CustomerDeposit.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this CustomerDeposit.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the customFieldList value for this CustomerDeposit.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CustomerDeposit.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this CustomerDeposit.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomerDeposit.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CustomerDeposit.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomerDeposit.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerDeposit)) return false;
        CustomerDeposit other = (CustomerDeposit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.salesOrder==null && other.getSalesOrder()==null) || 
             (this.salesOrder!=null &&
              this.salesOrder.equals(other.getSalesOrder()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.payment==null && other.getPayment()==null) || 
             (this.payment!=null &&
              this.payment.equals(other.getPayment()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.ccIsPurchaseCardBin==null && other.getCcIsPurchaseCardBin()==null) || 
             (this.ccIsPurchaseCardBin!=null &&
              this.ccIsPurchaseCardBin.equals(other.getCcIsPurchaseCardBin()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.ccProcessAsPurchaseCard==null && other.getCcProcessAsPurchaseCard()==null) || 
             (this.ccProcessAsPurchaseCard!=null &&
              this.ccProcessAsPurchaseCard.equals(other.getCcProcessAsPurchaseCard()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.checkNum==null && other.getCheckNum()==null) || 
             (this.checkNum!=null &&
              this.checkNum.equals(other.getCheckNum()))) &&
            ((this.creditCardProcessor==null && other.getCreditCardProcessor()==null) || 
             (this.creditCardProcessor!=null &&
              this.creditCardProcessor.equals(other.getCreditCardProcessor()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.ccSecurityCode==null && other.getCcSecurityCode()==null) || 
             (this.ccSecurityCode!=null &&
              this.ccSecurityCode.equals(other.getCcSecurityCode()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.paymentOption==null && other.getPaymentOption()==null) || 
             (this.paymentOption!=null &&
              this.paymentOption.equals(other.getPaymentOption()))) &&
            ((this.inputAuthCode==null && other.getInputAuthCode()==null) || 
             (this.inputAuthCode!=null &&
              this.inputAuthCode.equals(other.getInputAuthCode()))) &&
            ((this.inputReferenceCode==null && other.getInputReferenceCode()==null) || 
             (this.inputReferenceCode!=null &&
              this.inputReferenceCode.equals(other.getInputReferenceCode()))) &&
            ((this.checkNumber==null && other.getCheckNumber()==null) || 
             (this.checkNumber!=null &&
              this.checkNumber.equals(other.getCheckNumber()))) &&
            ((this.paymentCardCsc==null && other.getPaymentCardCsc()==null) || 
             (this.paymentCardCsc!=null &&
              this.paymentCardCsc.equals(other.getPaymentCardCsc()))) &&
            ((this.paymentProcessingProfile==null && other.getPaymentProcessingProfile()==null) || 
             (this.paymentProcessingProfile!=null &&
              this.paymentProcessingProfile.equals(other.getPaymentProcessingProfile()))) &&
            ((this.handlingMode==null && other.getHandlingMode()==null) || 
             (this.handlingMode!=null &&
              this.handlingMode.equals(other.getHandlingMode()))) &&
            ((this.outputAuthCode==null && other.getOutputAuthCode()==null) || 
             (this.outputAuthCode!=null &&
              this.outputAuthCode.equals(other.getOutputAuthCode()))) &&
            ((this.outputReferenceCode==null && other.getOutputReferenceCode()==null) || 
             (this.outputReferenceCode!=null &&
              this.outputReferenceCode.equals(other.getOutputReferenceCode()))) &&
            ((this.paymentOperation==null && other.getPaymentOperation()==null) || 
             (this.paymentOperation!=null &&
              this.paymentOperation.equals(other.getPaymentOperation()))) &&
            ((this.dynamicDescriptor==null && other.getDynamicDescriptor()==null) || 
             (this.dynamicDescriptor!=null &&
              this.dynamicDescriptor.equals(other.getDynamicDescriptor()))) &&
            ((this.ccExpireDate==null && other.getCcExpireDate()==null) || 
             (this.ccExpireDate!=null &&
              this.ccExpireDate.equals(other.getCcExpireDate()))) &&
            ((this.debitCardIssueNo==null && other.getDebitCardIssueNo()==null) || 
             (this.debitCardIssueNo!=null &&
              this.debitCardIssueNo.equals(other.getDebitCardIssueNo()))) &&
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
            ((this.ccName==null && other.getCcName()==null) || 
             (this.ccName!=null &&
              this.ccName.equals(other.getCcName()))) &&
            ((this.ccStreet==null && other.getCcStreet()==null) || 
             (this.ccStreet!=null &&
              this.ccStreet.equals(other.getCcStreet()))) &&
            ((this.ccZipCode==null && other.getCcZipCode()==null) || 
             (this.ccZipCode!=null &&
              this.ccZipCode.equals(other.getCcZipCode()))) &&
            ((this.chargeIt==null && other.getChargeIt()==null) || 
             (this.chargeIt!=null &&
              this.chargeIt.equals(other.getChargeIt()))) &&
            ((this.ccApproved==null && other.getCcApproved()==null) || 
             (this.ccApproved!=null &&
              this.ccApproved.equals(other.getCcApproved()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              this.pnRefNum.equals(other.getPnRefNum()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.ccAvsStreetMatch==null && other.getCcAvsStreetMatch()==null) || 
             (this.ccAvsStreetMatch!=null &&
              this.ccAvsStreetMatch.equals(other.getCcAvsStreetMatch()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor()))) &&
            ((this.ccAvsZipMatch==null && other.getCcAvsZipMatch()==null) || 
             (this.ccAvsZipMatch!=null &&
              this.ccAvsZipMatch.equals(other.getCcAvsZipMatch()))) &&
            ((this.isRecurringPayment==null && other.getIsRecurringPayment()==null) || 
             (this.isRecurringPayment!=null &&
              this.isRecurringPayment.equals(other.getIsRecurringPayment()))) &&
            ((this.ccSecurityCodeMatch==null && other.getCcSecurityCodeMatch()==null) || 
             (this.ccSecurityCodeMatch!=null &&
              this.ccSecurityCodeMatch.equals(other.getCcSecurityCodeMatch()))) &&
            ((this.threeDStatusCode==null && other.getThreeDStatusCode()==null) || 
             (this.threeDStatusCode!=null &&
              this.threeDStatusCode.equals(other.getThreeDStatusCode()))) &&
            ((this.ignoreAvs==null && other.getIgnoreAvs()==null) || 
             (this.ignoreAvs!=null &&
              this.ignoreAvs.equals(other.getIgnoreAvs()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.undepFunds==null && other.getUndepFunds()==null) || 
             (this.undepFunds!=null &&
              this.undepFunds.equals(other.getUndepFunds()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.applyList==null && other.getApplyList()==null) || 
             (this.applyList!=null &&
              this.applyList.equals(other.getApplyList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getSalesOrder() != null) {
            _hashCode += getSalesOrder().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getPayment() != null) {
            _hashCode += getPayment().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getCcIsPurchaseCardBin() != null) {
            _hashCode += getCcIsPurchaseCardBin().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getCcProcessAsPurchaseCard() != null) {
            _hashCode += getCcProcessAsPurchaseCard().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getCheckNum() != null) {
            _hashCode += getCheckNum().hashCode();
        }
        if (getCreditCardProcessor() != null) {
            _hashCode += getCreditCardProcessor().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getCcSecurityCode() != null) {
            _hashCode += getCcSecurityCode().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
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
        if (getPaymentOption() != null) {
            _hashCode += getPaymentOption().hashCode();
        }
        if (getInputAuthCode() != null) {
            _hashCode += getInputAuthCode().hashCode();
        }
        if (getInputReferenceCode() != null) {
            _hashCode += getInputReferenceCode().hashCode();
        }
        if (getCheckNumber() != null) {
            _hashCode += getCheckNumber().hashCode();
        }
        if (getPaymentCardCsc() != null) {
            _hashCode += getPaymentCardCsc().hashCode();
        }
        if (getPaymentProcessingProfile() != null) {
            _hashCode += getPaymentProcessingProfile().hashCode();
        }
        if (getHandlingMode() != null) {
            _hashCode += getHandlingMode().hashCode();
        }
        if (getOutputAuthCode() != null) {
            _hashCode += getOutputAuthCode().hashCode();
        }
        if (getOutputReferenceCode() != null) {
            _hashCode += getOutputReferenceCode().hashCode();
        }
        if (getPaymentOperation() != null) {
            _hashCode += getPaymentOperation().hashCode();
        }
        if (getDynamicDescriptor() != null) {
            _hashCode += getDynamicDescriptor().hashCode();
        }
        if (getCcExpireDate() != null) {
            _hashCode += getCcExpireDate().hashCode();
        }
        if (getDebitCardIssueNo() != null) {
            _hashCode += getDebitCardIssueNo().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        if (getCcName() != null) {
            _hashCode += getCcName().hashCode();
        }
        if (getCcStreet() != null) {
            _hashCode += getCcStreet().hashCode();
        }
        if (getCcZipCode() != null) {
            _hashCode += getCcZipCode().hashCode();
        }
        if (getChargeIt() != null) {
            _hashCode += getChargeIt().hashCode();
        }
        if (getCcApproved() != null) {
            _hashCode += getCcApproved().hashCode();
        }
        if (getPnRefNum() != null) {
            _hashCode += getPnRefNum().hashCode();
        }
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getCcAvsStreetMatch() != null) {
            _hashCode += getCcAvsStreetMatch().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        if (getCcAvsZipMatch() != null) {
            _hashCode += getCcAvsZipMatch().hashCode();
        }
        if (getIsRecurringPayment() != null) {
            _hashCode += getIsRecurringPayment().hashCode();
        }
        if (getCcSecurityCodeMatch() != null) {
            _hashCode += getCcSecurityCodeMatch().hashCode();
        }
        if (getThreeDStatusCode() != null) {
            _hashCode += getThreeDStatusCode().hashCode();
        }
        if (getIgnoreAvs() != null) {
            _hashCode += getIgnoreAvs().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getUndepFunds() != null) {
            _hashCode += getUndepFunds().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getApplyList() != null) {
            _hashCode += getApplyList().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
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
        new org.apache.axis.description.TypeDesc(CustomerDeposit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "CustomerDeposit"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "payment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccIsPurchaseCardBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccIsPurchaseCardBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccProcessAsPurchaseCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccProcessAsPurchaseCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "checkNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardProcessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "creditCardProcessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSecurityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccSecurityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "paymentOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputAuthCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "inputAuthCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "inputReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "checkNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCardCsc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "paymentCardCsc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentProcessingProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "paymentProcessingProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "handlingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "CustomerDepositHandlingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputAuthCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "outputAuthCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "outputReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "paymentOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "CustomerDepositPaymentOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "dynamicDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitCardIssueNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "debitCardIssueNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "validFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeIt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "chargeIt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAvsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccAvsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAvsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccAvsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRecurringPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "isRecurringPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSecurityCodeMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccSecurityCodeMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threeDStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "threeDStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreAvs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ignoreAvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undepFunds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "undepFunds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "applyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "CustomerDepositApplyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
