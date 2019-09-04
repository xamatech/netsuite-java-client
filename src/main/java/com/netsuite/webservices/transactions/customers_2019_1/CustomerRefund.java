/**
 * CustomerRefund.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2019_1;

public class CustomerRefund  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String status;

    private java.lang.String transactionNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.Double balance;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef arAcct;

    private java.lang.String currencyName;

    private java.lang.Double exchangeRate;

    private java.lang.String address;

    private java.lang.Double total;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef voidJournal;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef account;

    private java.lang.Boolean toBePrinted;

    private java.lang.String tranId;

    private java.lang.String debitCardIssueNo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor;

    private java.lang.Boolean chargeIt;

    private java.lang.String pnRefNum;

    private java.util.Calendar validFrom;

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

    private com.netsuite.webservices.transactions.customers_2019_1.types.CustomerRefundHandlingMode handlingMode;

    private java.lang.String outputAuthCode;

    private java.lang.String outputReferenceCode;

    private com.netsuite.webservices.transactions.customers_2019_1.types.CustomerRefundPaymentOperation paymentOperation;

    private java.lang.String dynamicDescriptor;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard;

    private java.lang.Boolean ccIsPurchaseCardBin;

    private java.lang.String ccNumber;

    private java.lang.Boolean ccProcessAsPurchaseCard;

    private java.util.Calendar ccExpireDate;

    private java.lang.String ccName;

    private java.lang.String ccStreet;

    private java.lang.String ccZipCode;

    private java.lang.Boolean ccApproved;

    private com.netsuite.webservices.transactions.customers_2019_1.CustomerRefundApplyList applyList;

    private com.netsuite.webservices.transactions.customers_2019_1.CustomerRefundDepositList depositList;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CustomerRefund() {
    }

    public CustomerRefund(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           java.lang.String status,
           java.lang.String transactionNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.Double balance,
           com.netsuite.webservices.platform.core_2019_1.RecordRef arAcct,
           java.lang.String currencyName,
           java.lang.Double exchangeRate,
           java.lang.String address,
           java.lang.Double total,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.util.Calendar tranDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef voidJournal,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef account,
           java.lang.Boolean toBePrinted,
           java.lang.String tranId,
           java.lang.String debitCardIssueNo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor,
           java.lang.Boolean chargeIt,
           java.lang.String pnRefNum,
           java.util.Calendar validFrom,
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
           com.netsuite.webservices.transactions.customers_2019_1.types.CustomerRefundHandlingMode handlingMode,
           java.lang.String outputAuthCode,
           java.lang.String outputReferenceCode,
           com.netsuite.webservices.transactions.customers_2019_1.types.CustomerRefundPaymentOperation paymentOperation,
           java.lang.String dynamicDescriptor,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard,
           java.lang.Boolean ccIsPurchaseCardBin,
           java.lang.String ccNumber,
           java.lang.Boolean ccProcessAsPurchaseCard,
           java.util.Calendar ccExpireDate,
           java.lang.String ccName,
           java.lang.String ccStreet,
           java.lang.String ccZipCode,
           java.lang.Boolean ccApproved,
           com.netsuite.webservices.transactions.customers_2019_1.CustomerRefundApplyList applyList,
           com.netsuite.webservices.transactions.customers_2019_1.CustomerRefundDepositList depositList,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.status = status;
        this.transactionNumber = transactionNumber;
        this.customer = customer;
        this.customForm = customForm;
        this.balance = balance;
        this.arAcct = arAcct;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.address = address;
        this.total = total;
        this.currency = currency;
        this.tranDate = tranDate;
        this.voidJournal = voidJournal;
        this.postingPeriod = postingPeriod;
        this.memo = memo;
        this.paymentMethod = paymentMethod;
        this.account = account;
        this.toBePrinted = toBePrinted;
        this.tranId = tranId;
        this.debitCardIssueNo = debitCardIssueNo;
        this.creditCardProcessor = creditCardProcessor;
        this.chargeIt = chargeIt;
        this.pnRefNum = pnRefNum;
        this.validFrom = validFrom;
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
        this.creditCard = creditCard;
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
        this.ccNumber = ccNumber;
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.ccApproved = ccApproved;
        this.applyList = applyList;
        this.depositList = depositList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this CustomerRefund.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CustomerRefund.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this CustomerRefund.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CustomerRefund.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the status value for this CustomerRefund.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CustomerRefund.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the transactionNumber value for this CustomerRefund.
     * 
     * @return transactionNumber
     */
    public java.lang.String getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this CustomerRefund.
     * 
     * @param transactionNumber
     */
    public void setTransactionNumber(java.lang.String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the customer value for this CustomerRefund.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this CustomerRefund.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the customForm value for this CustomerRefund.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this CustomerRefund.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the balance value for this CustomerRefund.
     * 
     * @return balance
     */
    public java.lang.Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this CustomerRefund.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the arAcct value for this CustomerRefund.
     * 
     * @return arAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getArAcct() {
        return arAcct;
    }


    /**
     * Sets the arAcct value for this CustomerRefund.
     * 
     * @param arAcct
     */
    public void setArAcct(com.netsuite.webservices.platform.core_2019_1.RecordRef arAcct) {
        this.arAcct = arAcct;
    }


    /**
     * Gets the currencyName value for this CustomerRefund.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this CustomerRefund.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the exchangeRate value for this CustomerRefund.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this CustomerRefund.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the address value for this CustomerRefund.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CustomerRefund.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the total value for this CustomerRefund.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this CustomerRefund.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the currency value for this CustomerRefund.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CustomerRefund.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the tranDate value for this CustomerRefund.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this CustomerRefund.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the voidJournal value for this CustomerRefund.
     * 
     * @return voidJournal
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVoidJournal() {
        return voidJournal;
    }


    /**
     * Sets the voidJournal value for this CustomerRefund.
     * 
     * @param voidJournal
     */
    public void setVoidJournal(com.netsuite.webservices.platform.core_2019_1.RecordRef voidJournal) {
        this.voidJournal = voidJournal;
    }


    /**
     * Gets the postingPeriod value for this CustomerRefund.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this CustomerRefund.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the memo value for this CustomerRefund.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this CustomerRefund.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the paymentMethod value for this CustomerRefund.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this CustomerRefund.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the account value for this CustomerRefund.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CustomerRefund.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the toBePrinted value for this CustomerRefund.
     * 
     * @return toBePrinted
     */
    public java.lang.Boolean getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this CustomerRefund.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(java.lang.Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }


    /**
     * Gets the tranId value for this CustomerRefund.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this CustomerRefund.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the debitCardIssueNo value for this CustomerRefund.
     * 
     * @return debitCardIssueNo
     */
    public java.lang.String getDebitCardIssueNo() {
        return debitCardIssueNo;
    }


    /**
     * Sets the debitCardIssueNo value for this CustomerRefund.
     * 
     * @param debitCardIssueNo
     */
    public void setDebitCardIssueNo(java.lang.String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }


    /**
     * Gets the creditCardProcessor value for this CustomerRefund.
     * 
     * @return creditCardProcessor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCardProcessor() {
        return creditCardProcessor;
    }


    /**
     * Sets the creditCardProcessor value for this CustomerRefund.
     * 
     * @param creditCardProcessor
     */
    public void setCreditCardProcessor(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }


    /**
     * Gets the chargeIt value for this CustomerRefund.
     * 
     * @return chargeIt
     */
    public java.lang.Boolean getChargeIt() {
        return chargeIt;
    }


    /**
     * Sets the chargeIt value for this CustomerRefund.
     * 
     * @param chargeIt
     */
    public void setChargeIt(java.lang.Boolean chargeIt) {
        this.chargeIt = chargeIt;
    }


    /**
     * Gets the pnRefNum value for this CustomerRefund.
     * 
     * @return pnRefNum
     */
    public java.lang.String getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this CustomerRefund.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(java.lang.String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }


    /**
     * Gets the validFrom value for this CustomerRefund.
     * 
     * @return validFrom
     */
    public java.util.Calendar getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this CustomerRefund.
     * 
     * @param validFrom
     */
    public void setValidFrom(java.util.Calendar validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the subsidiary value for this CustomerRefund.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this CustomerRefund.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the department value for this CustomerRefund.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CustomerRefund.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this CustomerRefund.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this CustomerRefund.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this CustomerRefund.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CustomerRefund.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the paymentOption value for this CustomerRefund.
     * 
     * @return paymentOption
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentOption() {
        return paymentOption;
    }


    /**
     * Sets the paymentOption value for this CustomerRefund.
     * 
     * @param paymentOption
     */
    public void setPaymentOption(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption) {
        this.paymentOption = paymentOption;
    }


    /**
     * Gets the inputAuthCode value for this CustomerRefund.
     * 
     * @return inputAuthCode
     */
    public java.lang.String getInputAuthCode() {
        return inputAuthCode;
    }


    /**
     * Sets the inputAuthCode value for this CustomerRefund.
     * 
     * @param inputAuthCode
     */
    public void setInputAuthCode(java.lang.String inputAuthCode) {
        this.inputAuthCode = inputAuthCode;
    }


    /**
     * Gets the inputReferenceCode value for this CustomerRefund.
     * 
     * @return inputReferenceCode
     */
    public java.lang.String getInputReferenceCode() {
        return inputReferenceCode;
    }


    /**
     * Sets the inputReferenceCode value for this CustomerRefund.
     * 
     * @param inputReferenceCode
     */
    public void setInputReferenceCode(java.lang.String inputReferenceCode) {
        this.inputReferenceCode = inputReferenceCode;
    }


    /**
     * Gets the checkNumber value for this CustomerRefund.
     * 
     * @return checkNumber
     */
    public java.lang.String getCheckNumber() {
        return checkNumber;
    }


    /**
     * Sets the checkNumber value for this CustomerRefund.
     * 
     * @param checkNumber
     */
    public void setCheckNumber(java.lang.String checkNumber) {
        this.checkNumber = checkNumber;
    }


    /**
     * Gets the paymentCardCsc value for this CustomerRefund.
     * 
     * @return paymentCardCsc
     */
    public java.lang.String getPaymentCardCsc() {
        return paymentCardCsc;
    }


    /**
     * Sets the paymentCardCsc value for this CustomerRefund.
     * 
     * @param paymentCardCsc
     */
    public void setPaymentCardCsc(java.lang.String paymentCardCsc) {
        this.paymentCardCsc = paymentCardCsc;
    }


    /**
     * Gets the paymentProcessingProfile value for this CustomerRefund.
     * 
     * @return paymentProcessingProfile
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentProcessingProfile() {
        return paymentProcessingProfile;
    }


    /**
     * Sets the paymentProcessingProfile value for this CustomerRefund.
     * 
     * @param paymentProcessingProfile
     */
    public void setPaymentProcessingProfile(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile) {
        this.paymentProcessingProfile = paymentProcessingProfile;
    }


    /**
     * Gets the handlingMode value for this CustomerRefund.
     * 
     * @return handlingMode
     */
    public com.netsuite.webservices.transactions.customers_2019_1.types.CustomerRefundHandlingMode getHandlingMode() {
        return handlingMode;
    }


    /**
     * Sets the handlingMode value for this CustomerRefund.
     * 
     * @param handlingMode
     */
    public void setHandlingMode(com.netsuite.webservices.transactions.customers_2019_1.types.CustomerRefundHandlingMode handlingMode) {
        this.handlingMode = handlingMode;
    }


    /**
     * Gets the outputAuthCode value for this CustomerRefund.
     * 
     * @return outputAuthCode
     */
    public java.lang.String getOutputAuthCode() {
        return outputAuthCode;
    }


    /**
     * Sets the outputAuthCode value for this CustomerRefund.
     * 
     * @param outputAuthCode
     */
    public void setOutputAuthCode(java.lang.String outputAuthCode) {
        this.outputAuthCode = outputAuthCode;
    }


    /**
     * Gets the outputReferenceCode value for this CustomerRefund.
     * 
     * @return outputReferenceCode
     */
    public java.lang.String getOutputReferenceCode() {
        return outputReferenceCode;
    }


    /**
     * Sets the outputReferenceCode value for this CustomerRefund.
     * 
     * @param outputReferenceCode
     */
    public void setOutputReferenceCode(java.lang.String outputReferenceCode) {
        this.outputReferenceCode = outputReferenceCode;
    }


    /**
     * Gets the paymentOperation value for this CustomerRefund.
     * 
     * @return paymentOperation
     */
    public com.netsuite.webservices.transactions.customers_2019_1.types.CustomerRefundPaymentOperation getPaymentOperation() {
        return paymentOperation;
    }


    /**
     * Sets the paymentOperation value for this CustomerRefund.
     * 
     * @param paymentOperation
     */
    public void setPaymentOperation(com.netsuite.webservices.transactions.customers_2019_1.types.CustomerRefundPaymentOperation paymentOperation) {
        this.paymentOperation = paymentOperation;
    }


    /**
     * Gets the dynamicDescriptor value for this CustomerRefund.
     * 
     * @return dynamicDescriptor
     */
    public java.lang.String getDynamicDescriptor() {
        return dynamicDescriptor;
    }


    /**
     * Sets the dynamicDescriptor value for this CustomerRefund.
     * 
     * @param dynamicDescriptor
     */
    public void setDynamicDescriptor(java.lang.String dynamicDescriptor) {
        this.dynamicDescriptor = dynamicDescriptor;
    }


    /**
     * Gets the creditCard value for this CustomerRefund.
     * 
     * @return creditCard
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this CustomerRefund.
     * 
     * @param creditCard
     */
    public void setCreditCard(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the ccIsPurchaseCardBin value for this CustomerRefund.
     * 
     * @return ccIsPurchaseCardBin
     */
    public java.lang.Boolean getCcIsPurchaseCardBin() {
        return ccIsPurchaseCardBin;
    }


    /**
     * Sets the ccIsPurchaseCardBin value for this CustomerRefund.
     * 
     * @param ccIsPurchaseCardBin
     */
    public void setCcIsPurchaseCardBin(java.lang.Boolean ccIsPurchaseCardBin) {
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
    }


    /**
     * Gets the ccNumber value for this CustomerRefund.
     * 
     * @return ccNumber
     */
    public java.lang.String getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this CustomerRefund.
     * 
     * @param ccNumber
     */
    public void setCcNumber(java.lang.String ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the ccProcessAsPurchaseCard value for this CustomerRefund.
     * 
     * @return ccProcessAsPurchaseCard
     */
    public java.lang.Boolean getCcProcessAsPurchaseCard() {
        return ccProcessAsPurchaseCard;
    }


    /**
     * Sets the ccProcessAsPurchaseCard value for this CustomerRefund.
     * 
     * @param ccProcessAsPurchaseCard
     */
    public void setCcProcessAsPurchaseCard(java.lang.Boolean ccProcessAsPurchaseCard) {
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
    }


    /**
     * Gets the ccExpireDate value for this CustomerRefund.
     * 
     * @return ccExpireDate
     */
    public java.util.Calendar getCcExpireDate() {
        return ccExpireDate;
    }


    /**
     * Sets the ccExpireDate value for this CustomerRefund.
     * 
     * @param ccExpireDate
     */
    public void setCcExpireDate(java.util.Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }


    /**
     * Gets the ccName value for this CustomerRefund.
     * 
     * @return ccName
     */
    public java.lang.String getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this CustomerRefund.
     * 
     * @param ccName
     */
    public void setCcName(java.lang.String ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the ccStreet value for this CustomerRefund.
     * 
     * @return ccStreet
     */
    public java.lang.String getCcStreet() {
        return ccStreet;
    }


    /**
     * Sets the ccStreet value for this CustomerRefund.
     * 
     * @param ccStreet
     */
    public void setCcStreet(java.lang.String ccStreet) {
        this.ccStreet = ccStreet;
    }


    /**
     * Gets the ccZipCode value for this CustomerRefund.
     * 
     * @return ccZipCode
     */
    public java.lang.String getCcZipCode() {
        return ccZipCode;
    }


    /**
     * Sets the ccZipCode value for this CustomerRefund.
     * 
     * @param ccZipCode
     */
    public void setCcZipCode(java.lang.String ccZipCode) {
        this.ccZipCode = ccZipCode;
    }


    /**
     * Gets the ccApproved value for this CustomerRefund.
     * 
     * @return ccApproved
     */
    public java.lang.Boolean getCcApproved() {
        return ccApproved;
    }


    /**
     * Sets the ccApproved value for this CustomerRefund.
     * 
     * @param ccApproved
     */
    public void setCcApproved(java.lang.Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }


    /**
     * Gets the applyList value for this CustomerRefund.
     * 
     * @return applyList
     */
    public com.netsuite.webservices.transactions.customers_2019_1.CustomerRefundApplyList getApplyList() {
        return applyList;
    }


    /**
     * Sets the applyList value for this CustomerRefund.
     * 
     * @param applyList
     */
    public void setApplyList(com.netsuite.webservices.transactions.customers_2019_1.CustomerRefundApplyList applyList) {
        this.applyList = applyList;
    }


    /**
     * Gets the depositList value for this CustomerRefund.
     * 
     * @return depositList
     */
    public com.netsuite.webservices.transactions.customers_2019_1.CustomerRefundDepositList getDepositList() {
        return depositList;
    }


    /**
     * Sets the depositList value for this CustomerRefund.
     * 
     * @param depositList
     */
    public void setDepositList(com.netsuite.webservices.transactions.customers_2019_1.CustomerRefundDepositList depositList) {
        this.depositList = depositList;
    }


    /**
     * Gets the accountingBookDetailList value for this CustomerRefund.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this CustomerRefund.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the customFieldList value for this CustomerRefund.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CustomerRefund.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this CustomerRefund.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomerRefund.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CustomerRefund.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomerRefund.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerRefund)) return false;
        CustomerRefund other = (CustomerRefund) obj;
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
            ((this.transactionNumber==null && other.getTransactionNumber()==null) || 
             (this.transactionNumber!=null &&
              this.transactionNumber.equals(other.getTransactionNumber()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.arAcct==null && other.getArAcct()==null) || 
             (this.arAcct!=null &&
              this.arAcct.equals(other.getArAcct()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.voidJournal==null && other.getVoidJournal()==null) || 
             (this.voidJournal!=null &&
              this.voidJournal.equals(other.getVoidJournal()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.toBePrinted==null && other.getToBePrinted()==null) || 
             (this.toBePrinted!=null &&
              this.toBePrinted.equals(other.getToBePrinted()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.debitCardIssueNo==null && other.getDebitCardIssueNo()==null) || 
             (this.debitCardIssueNo!=null &&
              this.debitCardIssueNo.equals(other.getDebitCardIssueNo()))) &&
            ((this.creditCardProcessor==null && other.getCreditCardProcessor()==null) || 
             (this.creditCardProcessor!=null &&
              this.creditCardProcessor.equals(other.getCreditCardProcessor()))) &&
            ((this.chargeIt==null && other.getChargeIt()==null) || 
             (this.chargeIt!=null &&
              this.chargeIt.equals(other.getChargeIt()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              this.pnRefNum.equals(other.getPnRefNum()))) &&
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
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
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.ccIsPurchaseCardBin==null && other.getCcIsPurchaseCardBin()==null) || 
             (this.ccIsPurchaseCardBin!=null &&
              this.ccIsPurchaseCardBin.equals(other.getCcIsPurchaseCardBin()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.ccProcessAsPurchaseCard==null && other.getCcProcessAsPurchaseCard()==null) || 
             (this.ccProcessAsPurchaseCard!=null &&
              this.ccProcessAsPurchaseCard.equals(other.getCcProcessAsPurchaseCard()))) &&
            ((this.ccExpireDate==null && other.getCcExpireDate()==null) || 
             (this.ccExpireDate!=null &&
              this.ccExpireDate.equals(other.getCcExpireDate()))) &&
            ((this.ccName==null && other.getCcName()==null) || 
             (this.ccName!=null &&
              this.ccName.equals(other.getCcName()))) &&
            ((this.ccStreet==null && other.getCcStreet()==null) || 
             (this.ccStreet!=null &&
              this.ccStreet.equals(other.getCcStreet()))) &&
            ((this.ccZipCode==null && other.getCcZipCode()==null) || 
             (this.ccZipCode!=null &&
              this.ccZipCode.equals(other.getCcZipCode()))) &&
            ((this.ccApproved==null && other.getCcApproved()==null) || 
             (this.ccApproved!=null &&
              this.ccApproved.equals(other.getCcApproved()))) &&
            ((this.applyList==null && other.getApplyList()==null) || 
             (this.applyList!=null &&
              this.applyList.equals(other.getApplyList()))) &&
            ((this.depositList==null && other.getDepositList()==null) || 
             (this.depositList!=null &&
              this.depositList.equals(other.getDepositList()))) &&
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
        if (getTransactionNumber() != null) {
            _hashCode += getTransactionNumber().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getArAcct() != null) {
            _hashCode += getArAcct().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getVoidJournal() != null) {
            _hashCode += getVoidJournal().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getToBePrinted() != null) {
            _hashCode += getToBePrinted().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getDebitCardIssueNo() != null) {
            _hashCode += getDebitCardIssueNo().hashCode();
        }
        if (getCreditCardProcessor() != null) {
            _hashCode += getCreditCardProcessor().hashCode();
        }
        if (getChargeIt() != null) {
            _hashCode += getChargeIt().hashCode();
        }
        if (getPnRefNum() != null) {
            _hashCode += getPnRefNum().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
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
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getCcIsPurchaseCardBin() != null) {
            _hashCode += getCcIsPurchaseCardBin().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getCcProcessAsPurchaseCard() != null) {
            _hashCode += getCcProcessAsPurchaseCard().hashCode();
        }
        if (getCcExpireDate() != null) {
            _hashCode += getCcExpireDate().hashCode();
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
        if (getCcApproved() != null) {
            _hashCode += getCcApproved().hashCode();
        }
        if (getApplyList() != null) {
            _hashCode += getApplyList().hashCode();
        }
        if (getDepositList() != null) {
            _hashCode += getDepositList().hashCode();
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
        new org.apache.axis.description.TypeDesc(CustomerRefund.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "CustomerRefund"));
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
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "transactionNumber"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "arAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "total"));
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
        elemField.setFieldName("voidJournal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "voidJournal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "toBePrinted"));
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
        elemField.setFieldName("debitCardIssueNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "debitCardIssueNo"));
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
        elemField.setFieldName("chargeIt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "chargeIt"));
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
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "validFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "CustomerRefundHandlingMode"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "CustomerRefundPaymentOperation"));
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
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "creditCard"));
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
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccNumber"));
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
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccExpireDate"));
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
        elemField.setFieldName("ccApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "applyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "CustomerRefundApplyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "depositList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "CustomerRefundDepositList"));
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
