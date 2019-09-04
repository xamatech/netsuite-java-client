/**
 * CustomerPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2019_1;

public class CustomerPayment  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef arAcct;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private java.lang.Double balance;

    private java.lang.Double pending;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.Double payment;

    private java.lang.Boolean autoApply;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod;

    private java.lang.Boolean ccIsPurchaseCardBin;

    private java.lang.String memo;

    private java.lang.Boolean ccProcessAsPurchaseCard;

    private java.lang.String checkNum;

    private java.lang.String currencyName;

    private java.lang.Double exchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard;

    private java.lang.Boolean chargeIt;

    private java.lang.String ccNumber;

    private java.util.Calendar ccExpireDate;

    private java.lang.String ccName;

    private java.lang.String ccStreet;

    private java.lang.String ccZipCode;

    private java.lang.Boolean ccApproved;

    private java.lang.String authCode;

    private com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsStreetMatch;

    private com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsZipMatch;

    private java.lang.Boolean isRecurringPayment;

    private java.lang.String ccSecurityCode;

    private java.lang.Boolean ignoreAvs;

    private com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccSecurityCodeMatch;

    private java.lang.String threeDStatusCode;

    private java.lang.String pnRefNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor;

    private java.lang.String debitCardIssueNo;

    private java.util.Calendar validFrom;

    private java.lang.Boolean undepFunds;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef account;

    private java.lang.Double total;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private java.lang.Double applied;

    private java.lang.Double unapplied;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption;

    private java.lang.String inputAuthCode;

    private java.lang.String inputReferenceCode;

    private java.lang.String checkNumber;

    private java.lang.String paymentCardCsc;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile;

    private com.netsuite.webservices.transactions.customers_2019_1.types.CustomerPaymentHandlingMode handlingMode;

    private java.lang.String outputAuthCode;

    private java.lang.String outputReferenceCode;

    private com.netsuite.webservices.transactions.customers_2019_1.types.CustomerPaymentPaymentOperation paymentOperation;

    private java.lang.String dynamicDescriptor;

    private java.lang.String status;

    private com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentApplyList applyList;

    private com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentCreditList creditList;

    private com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentDepositList depositList;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CustomerPayment() {
    }

    public CustomerPayment(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef arAcct,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           java.lang.Double balance,
           java.lang.Double pending,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.Double payment,
           java.lang.Boolean autoApply,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod,
           java.lang.Boolean ccIsPurchaseCardBin,
           java.lang.String memo,
           java.lang.Boolean ccProcessAsPurchaseCard,
           java.lang.String checkNum,
           java.lang.String currencyName,
           java.lang.Double exchangeRate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard,
           java.lang.Boolean chargeIt,
           java.lang.String ccNumber,
           java.util.Calendar ccExpireDate,
           java.lang.String ccName,
           java.lang.String ccStreet,
           java.lang.String ccZipCode,
           java.lang.Boolean ccApproved,
           java.lang.String authCode,
           com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsStreetMatch,
           com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsZipMatch,
           java.lang.Boolean isRecurringPayment,
           java.lang.String ccSecurityCode,
           java.lang.Boolean ignoreAvs,
           com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccSecurityCodeMatch,
           java.lang.String threeDStatusCode,
           java.lang.String pnRefNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor,
           java.lang.String debitCardIssueNo,
           java.util.Calendar validFrom,
           java.lang.Boolean undepFunds,
           com.netsuite.webservices.platform.core_2019_1.RecordRef account,
           java.lang.Double total,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           java.lang.Double applied,
           java.lang.Double unapplied,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption,
           java.lang.String inputAuthCode,
           java.lang.String inputReferenceCode,
           java.lang.String checkNumber,
           java.lang.String paymentCardCsc,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile,
           com.netsuite.webservices.transactions.customers_2019_1.types.CustomerPaymentHandlingMode handlingMode,
           java.lang.String outputAuthCode,
           java.lang.String outputReferenceCode,
           com.netsuite.webservices.transactions.customers_2019_1.types.CustomerPaymentPaymentOperation paymentOperation,
           java.lang.String dynamicDescriptor,
           java.lang.String status,
           com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentApplyList applyList,
           com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentCreditList creditList,
           com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentDepositList depositList,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.arAcct = arAcct;
        this.customer = customer;
        this.balance = balance;
        this.pending = pending;
        this.currency = currency;
        this.payment = payment;
        this.autoApply = autoApply;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.postingPeriod = postingPeriod;
        this.paymentMethod = paymentMethod;
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
        this.memo = memo;
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
        this.checkNum = checkNum;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.creditCard = creditCard;
        this.chargeIt = chargeIt;
        this.ccNumber = ccNumber;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.ccApproved = ccApproved;
        this.authCode = authCode;
        this.ccAvsStreetMatch = ccAvsStreetMatch;
        this.ccAvsZipMatch = ccAvsZipMatch;
        this.isRecurringPayment = isRecurringPayment;
        this.ccSecurityCode = ccSecurityCode;
        this.ignoreAvs = ignoreAvs;
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
        this.threeDStatusCode = threeDStatusCode;
        this.pnRefNum = pnRefNum;
        this.creditCardProcessor = creditCardProcessor;
        this.debitCardIssueNo = debitCardIssueNo;
        this.validFrom = validFrom;
        this.undepFunds = undepFunds;
        this.account = account;
        this.total = total;
        this.subsidiary = subsidiary;
        this.applied = applied;
        this.unapplied = unapplied;
        this._class = _class;
        this.department = department;
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
        this.status = status;
        this.applyList = applyList;
        this.creditList = creditList;
        this.depositList = depositList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this CustomerPayment.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CustomerPayment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this CustomerPayment.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CustomerPayment.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this CustomerPayment.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this CustomerPayment.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the arAcct value for this CustomerPayment.
     * 
     * @return arAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getArAcct() {
        return arAcct;
    }


    /**
     * Sets the arAcct value for this CustomerPayment.
     * 
     * @param arAcct
     */
    public void setArAcct(com.netsuite.webservices.platform.core_2019_1.RecordRef arAcct) {
        this.arAcct = arAcct;
    }


    /**
     * Gets the customer value for this CustomerPayment.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this CustomerPayment.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the balance value for this CustomerPayment.
     * 
     * @return balance
     */
    public java.lang.Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this CustomerPayment.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the pending value for this CustomerPayment.
     * 
     * @return pending
     */
    public java.lang.Double getPending() {
        return pending;
    }


    /**
     * Sets the pending value for this CustomerPayment.
     * 
     * @param pending
     */
    public void setPending(java.lang.Double pending) {
        this.pending = pending;
    }


    /**
     * Gets the currency value for this CustomerPayment.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CustomerPayment.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the payment value for this CustomerPayment.
     * 
     * @return payment
     */
    public java.lang.Double getPayment() {
        return payment;
    }


    /**
     * Sets the payment value for this CustomerPayment.
     * 
     * @param payment
     */
    public void setPayment(java.lang.Double payment) {
        this.payment = payment;
    }


    /**
     * Gets the autoApply value for this CustomerPayment.
     * 
     * @return autoApply
     */
    public java.lang.Boolean getAutoApply() {
        return autoApply;
    }


    /**
     * Sets the autoApply value for this CustomerPayment.
     * 
     * @param autoApply
     */
    public void setAutoApply(java.lang.Boolean autoApply) {
        this.autoApply = autoApply;
    }


    /**
     * Gets the tranDate value for this CustomerPayment.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this CustomerPayment.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this CustomerPayment.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this CustomerPayment.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the postingPeriod value for this CustomerPayment.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this CustomerPayment.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the paymentMethod value for this CustomerPayment.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this CustomerPayment.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the ccIsPurchaseCardBin value for this CustomerPayment.
     * 
     * @return ccIsPurchaseCardBin
     */
    public java.lang.Boolean getCcIsPurchaseCardBin() {
        return ccIsPurchaseCardBin;
    }


    /**
     * Sets the ccIsPurchaseCardBin value for this CustomerPayment.
     * 
     * @param ccIsPurchaseCardBin
     */
    public void setCcIsPurchaseCardBin(java.lang.Boolean ccIsPurchaseCardBin) {
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
    }


    /**
     * Gets the memo value for this CustomerPayment.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this CustomerPayment.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the ccProcessAsPurchaseCard value for this CustomerPayment.
     * 
     * @return ccProcessAsPurchaseCard
     */
    public java.lang.Boolean getCcProcessAsPurchaseCard() {
        return ccProcessAsPurchaseCard;
    }


    /**
     * Sets the ccProcessAsPurchaseCard value for this CustomerPayment.
     * 
     * @param ccProcessAsPurchaseCard
     */
    public void setCcProcessAsPurchaseCard(java.lang.Boolean ccProcessAsPurchaseCard) {
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
    }


    /**
     * Gets the checkNum value for this CustomerPayment.
     * 
     * @return checkNum
     */
    public java.lang.String getCheckNum() {
        return checkNum;
    }


    /**
     * Sets the checkNum value for this CustomerPayment.
     * 
     * @param checkNum
     */
    public void setCheckNum(java.lang.String checkNum) {
        this.checkNum = checkNum;
    }


    /**
     * Gets the currencyName value for this CustomerPayment.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this CustomerPayment.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the exchangeRate value for this CustomerPayment.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this CustomerPayment.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the creditCard value for this CustomerPayment.
     * 
     * @return creditCard
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this CustomerPayment.
     * 
     * @param creditCard
     */
    public void setCreditCard(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the chargeIt value for this CustomerPayment.
     * 
     * @return chargeIt
     */
    public java.lang.Boolean getChargeIt() {
        return chargeIt;
    }


    /**
     * Sets the chargeIt value for this CustomerPayment.
     * 
     * @param chargeIt
     */
    public void setChargeIt(java.lang.Boolean chargeIt) {
        this.chargeIt = chargeIt;
    }


    /**
     * Gets the ccNumber value for this CustomerPayment.
     * 
     * @return ccNumber
     */
    public java.lang.String getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this CustomerPayment.
     * 
     * @param ccNumber
     */
    public void setCcNumber(java.lang.String ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the ccExpireDate value for this CustomerPayment.
     * 
     * @return ccExpireDate
     */
    public java.util.Calendar getCcExpireDate() {
        return ccExpireDate;
    }


    /**
     * Sets the ccExpireDate value for this CustomerPayment.
     * 
     * @param ccExpireDate
     */
    public void setCcExpireDate(java.util.Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }


    /**
     * Gets the ccName value for this CustomerPayment.
     * 
     * @return ccName
     */
    public java.lang.String getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this CustomerPayment.
     * 
     * @param ccName
     */
    public void setCcName(java.lang.String ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the ccStreet value for this CustomerPayment.
     * 
     * @return ccStreet
     */
    public java.lang.String getCcStreet() {
        return ccStreet;
    }


    /**
     * Sets the ccStreet value for this CustomerPayment.
     * 
     * @param ccStreet
     */
    public void setCcStreet(java.lang.String ccStreet) {
        this.ccStreet = ccStreet;
    }


    /**
     * Gets the ccZipCode value for this CustomerPayment.
     * 
     * @return ccZipCode
     */
    public java.lang.String getCcZipCode() {
        return ccZipCode;
    }


    /**
     * Sets the ccZipCode value for this CustomerPayment.
     * 
     * @param ccZipCode
     */
    public void setCcZipCode(java.lang.String ccZipCode) {
        this.ccZipCode = ccZipCode;
    }


    /**
     * Gets the ccApproved value for this CustomerPayment.
     * 
     * @return ccApproved
     */
    public java.lang.Boolean getCcApproved() {
        return ccApproved;
    }


    /**
     * Sets the ccApproved value for this CustomerPayment.
     * 
     * @param ccApproved
     */
    public void setCcApproved(java.lang.Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }


    /**
     * Gets the authCode value for this CustomerPayment.
     * 
     * @return authCode
     */
    public java.lang.String getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this CustomerPayment.
     * 
     * @param authCode
     */
    public void setAuthCode(java.lang.String authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the ccAvsStreetMatch value for this CustomerPayment.
     * 
     * @return ccAvsStreetMatch
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode getCcAvsStreetMatch() {
        return ccAvsStreetMatch;
    }


    /**
     * Sets the ccAvsStreetMatch value for this CustomerPayment.
     * 
     * @param ccAvsStreetMatch
     */
    public void setCcAvsStreetMatch(com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsStreetMatch) {
        this.ccAvsStreetMatch = ccAvsStreetMatch;
    }


    /**
     * Gets the ccAvsZipMatch value for this CustomerPayment.
     * 
     * @return ccAvsZipMatch
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode getCcAvsZipMatch() {
        return ccAvsZipMatch;
    }


    /**
     * Sets the ccAvsZipMatch value for this CustomerPayment.
     * 
     * @param ccAvsZipMatch
     */
    public void setCcAvsZipMatch(com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsZipMatch) {
        this.ccAvsZipMatch = ccAvsZipMatch;
    }


    /**
     * Gets the isRecurringPayment value for this CustomerPayment.
     * 
     * @return isRecurringPayment
     */
    public java.lang.Boolean getIsRecurringPayment() {
        return isRecurringPayment;
    }


    /**
     * Sets the isRecurringPayment value for this CustomerPayment.
     * 
     * @param isRecurringPayment
     */
    public void setIsRecurringPayment(java.lang.Boolean isRecurringPayment) {
        this.isRecurringPayment = isRecurringPayment;
    }


    /**
     * Gets the ccSecurityCode value for this CustomerPayment.
     * 
     * @return ccSecurityCode
     */
    public java.lang.String getCcSecurityCode() {
        return ccSecurityCode;
    }


    /**
     * Sets the ccSecurityCode value for this CustomerPayment.
     * 
     * @param ccSecurityCode
     */
    public void setCcSecurityCode(java.lang.String ccSecurityCode) {
        this.ccSecurityCode = ccSecurityCode;
    }


    /**
     * Gets the ignoreAvs value for this CustomerPayment.
     * 
     * @return ignoreAvs
     */
    public java.lang.Boolean getIgnoreAvs() {
        return ignoreAvs;
    }


    /**
     * Sets the ignoreAvs value for this CustomerPayment.
     * 
     * @param ignoreAvs
     */
    public void setIgnoreAvs(java.lang.Boolean ignoreAvs) {
        this.ignoreAvs = ignoreAvs;
    }


    /**
     * Gets the ccSecurityCodeMatch value for this CustomerPayment.
     * 
     * @return ccSecurityCodeMatch
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode getCcSecurityCodeMatch() {
        return ccSecurityCodeMatch;
    }


    /**
     * Sets the ccSecurityCodeMatch value for this CustomerPayment.
     * 
     * @param ccSecurityCodeMatch
     */
    public void setCcSecurityCodeMatch(com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccSecurityCodeMatch) {
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
    }


    /**
     * Gets the threeDStatusCode value for this CustomerPayment.
     * 
     * @return threeDStatusCode
     */
    public java.lang.String getThreeDStatusCode() {
        return threeDStatusCode;
    }


    /**
     * Sets the threeDStatusCode value for this CustomerPayment.
     * 
     * @param threeDStatusCode
     */
    public void setThreeDStatusCode(java.lang.String threeDStatusCode) {
        this.threeDStatusCode = threeDStatusCode;
    }


    /**
     * Gets the pnRefNum value for this CustomerPayment.
     * 
     * @return pnRefNum
     */
    public java.lang.String getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this CustomerPayment.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(java.lang.String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }


    /**
     * Gets the creditCardProcessor value for this CustomerPayment.
     * 
     * @return creditCardProcessor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCardProcessor() {
        return creditCardProcessor;
    }


    /**
     * Sets the creditCardProcessor value for this CustomerPayment.
     * 
     * @param creditCardProcessor
     */
    public void setCreditCardProcessor(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }


    /**
     * Gets the debitCardIssueNo value for this CustomerPayment.
     * 
     * @return debitCardIssueNo
     */
    public java.lang.String getDebitCardIssueNo() {
        return debitCardIssueNo;
    }


    /**
     * Sets the debitCardIssueNo value for this CustomerPayment.
     * 
     * @param debitCardIssueNo
     */
    public void setDebitCardIssueNo(java.lang.String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }


    /**
     * Gets the validFrom value for this CustomerPayment.
     * 
     * @return validFrom
     */
    public java.util.Calendar getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this CustomerPayment.
     * 
     * @param validFrom
     */
    public void setValidFrom(java.util.Calendar validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the undepFunds value for this CustomerPayment.
     * 
     * @return undepFunds
     */
    public java.lang.Boolean getUndepFunds() {
        return undepFunds;
    }


    /**
     * Sets the undepFunds value for this CustomerPayment.
     * 
     * @param undepFunds
     */
    public void setUndepFunds(java.lang.Boolean undepFunds) {
        this.undepFunds = undepFunds;
    }


    /**
     * Gets the account value for this CustomerPayment.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CustomerPayment.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the total value for this CustomerPayment.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this CustomerPayment.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the subsidiary value for this CustomerPayment.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this CustomerPayment.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the applied value for this CustomerPayment.
     * 
     * @return applied
     */
    public java.lang.Double getApplied() {
        return applied;
    }


    /**
     * Sets the applied value for this CustomerPayment.
     * 
     * @param applied
     */
    public void setApplied(java.lang.Double applied) {
        this.applied = applied;
    }


    /**
     * Gets the unapplied value for this CustomerPayment.
     * 
     * @return unapplied
     */
    public java.lang.Double getUnapplied() {
        return unapplied;
    }


    /**
     * Sets the unapplied value for this CustomerPayment.
     * 
     * @param unapplied
     */
    public void setUnapplied(java.lang.Double unapplied) {
        this.unapplied = unapplied;
    }


    /**
     * Gets the _class value for this CustomerPayment.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this CustomerPayment.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the department value for this CustomerPayment.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CustomerPayment.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this CustomerPayment.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CustomerPayment.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the paymentOption value for this CustomerPayment.
     * 
     * @return paymentOption
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentOption() {
        return paymentOption;
    }


    /**
     * Sets the paymentOption value for this CustomerPayment.
     * 
     * @param paymentOption
     */
    public void setPaymentOption(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption) {
        this.paymentOption = paymentOption;
    }


    /**
     * Gets the inputAuthCode value for this CustomerPayment.
     * 
     * @return inputAuthCode
     */
    public java.lang.String getInputAuthCode() {
        return inputAuthCode;
    }


    /**
     * Sets the inputAuthCode value for this CustomerPayment.
     * 
     * @param inputAuthCode
     */
    public void setInputAuthCode(java.lang.String inputAuthCode) {
        this.inputAuthCode = inputAuthCode;
    }


    /**
     * Gets the inputReferenceCode value for this CustomerPayment.
     * 
     * @return inputReferenceCode
     */
    public java.lang.String getInputReferenceCode() {
        return inputReferenceCode;
    }


    /**
     * Sets the inputReferenceCode value for this CustomerPayment.
     * 
     * @param inputReferenceCode
     */
    public void setInputReferenceCode(java.lang.String inputReferenceCode) {
        this.inputReferenceCode = inputReferenceCode;
    }


    /**
     * Gets the checkNumber value for this CustomerPayment.
     * 
     * @return checkNumber
     */
    public java.lang.String getCheckNumber() {
        return checkNumber;
    }


    /**
     * Sets the checkNumber value for this CustomerPayment.
     * 
     * @param checkNumber
     */
    public void setCheckNumber(java.lang.String checkNumber) {
        this.checkNumber = checkNumber;
    }


    /**
     * Gets the paymentCardCsc value for this CustomerPayment.
     * 
     * @return paymentCardCsc
     */
    public java.lang.String getPaymentCardCsc() {
        return paymentCardCsc;
    }


    /**
     * Sets the paymentCardCsc value for this CustomerPayment.
     * 
     * @param paymentCardCsc
     */
    public void setPaymentCardCsc(java.lang.String paymentCardCsc) {
        this.paymentCardCsc = paymentCardCsc;
    }


    /**
     * Gets the paymentProcessingProfile value for this CustomerPayment.
     * 
     * @return paymentProcessingProfile
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentProcessingProfile() {
        return paymentProcessingProfile;
    }


    /**
     * Sets the paymentProcessingProfile value for this CustomerPayment.
     * 
     * @param paymentProcessingProfile
     */
    public void setPaymentProcessingProfile(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile) {
        this.paymentProcessingProfile = paymentProcessingProfile;
    }


    /**
     * Gets the handlingMode value for this CustomerPayment.
     * 
     * @return handlingMode
     */
    public com.netsuite.webservices.transactions.customers_2019_1.types.CustomerPaymentHandlingMode getHandlingMode() {
        return handlingMode;
    }


    /**
     * Sets the handlingMode value for this CustomerPayment.
     * 
     * @param handlingMode
     */
    public void setHandlingMode(com.netsuite.webservices.transactions.customers_2019_1.types.CustomerPaymentHandlingMode handlingMode) {
        this.handlingMode = handlingMode;
    }


    /**
     * Gets the outputAuthCode value for this CustomerPayment.
     * 
     * @return outputAuthCode
     */
    public java.lang.String getOutputAuthCode() {
        return outputAuthCode;
    }


    /**
     * Sets the outputAuthCode value for this CustomerPayment.
     * 
     * @param outputAuthCode
     */
    public void setOutputAuthCode(java.lang.String outputAuthCode) {
        this.outputAuthCode = outputAuthCode;
    }


    /**
     * Gets the outputReferenceCode value for this CustomerPayment.
     * 
     * @return outputReferenceCode
     */
    public java.lang.String getOutputReferenceCode() {
        return outputReferenceCode;
    }


    /**
     * Sets the outputReferenceCode value for this CustomerPayment.
     * 
     * @param outputReferenceCode
     */
    public void setOutputReferenceCode(java.lang.String outputReferenceCode) {
        this.outputReferenceCode = outputReferenceCode;
    }


    /**
     * Gets the paymentOperation value for this CustomerPayment.
     * 
     * @return paymentOperation
     */
    public com.netsuite.webservices.transactions.customers_2019_1.types.CustomerPaymentPaymentOperation getPaymentOperation() {
        return paymentOperation;
    }


    /**
     * Sets the paymentOperation value for this CustomerPayment.
     * 
     * @param paymentOperation
     */
    public void setPaymentOperation(com.netsuite.webservices.transactions.customers_2019_1.types.CustomerPaymentPaymentOperation paymentOperation) {
        this.paymentOperation = paymentOperation;
    }


    /**
     * Gets the dynamicDescriptor value for this CustomerPayment.
     * 
     * @return dynamicDescriptor
     */
    public java.lang.String getDynamicDescriptor() {
        return dynamicDescriptor;
    }


    /**
     * Sets the dynamicDescriptor value for this CustomerPayment.
     * 
     * @param dynamicDescriptor
     */
    public void setDynamicDescriptor(java.lang.String dynamicDescriptor) {
        this.dynamicDescriptor = dynamicDescriptor;
    }


    /**
     * Gets the status value for this CustomerPayment.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CustomerPayment.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the applyList value for this CustomerPayment.
     * 
     * @return applyList
     */
    public com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentApplyList getApplyList() {
        return applyList;
    }


    /**
     * Sets the applyList value for this CustomerPayment.
     * 
     * @param applyList
     */
    public void setApplyList(com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentApplyList applyList) {
        this.applyList = applyList;
    }


    /**
     * Gets the creditList value for this CustomerPayment.
     * 
     * @return creditList
     */
    public com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentCreditList getCreditList() {
        return creditList;
    }


    /**
     * Sets the creditList value for this CustomerPayment.
     * 
     * @param creditList
     */
    public void setCreditList(com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentCreditList creditList) {
        this.creditList = creditList;
    }


    /**
     * Gets the depositList value for this CustomerPayment.
     * 
     * @return depositList
     */
    public com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentDepositList getDepositList() {
        return depositList;
    }


    /**
     * Sets the depositList value for this CustomerPayment.
     * 
     * @param depositList
     */
    public void setDepositList(com.netsuite.webservices.transactions.customers_2019_1.CustomerPaymentDepositList depositList) {
        this.depositList = depositList;
    }


    /**
     * Gets the accountingBookDetailList value for this CustomerPayment.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this CustomerPayment.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the customFieldList value for this CustomerPayment.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CustomerPayment.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this CustomerPayment.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomerPayment.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CustomerPayment.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomerPayment.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerPayment)) return false;
        CustomerPayment other = (CustomerPayment) obj;
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
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.arAcct==null && other.getArAcct()==null) || 
             (this.arAcct!=null &&
              this.arAcct.equals(other.getArAcct()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.pending==null && other.getPending()==null) || 
             (this.pending!=null &&
              this.pending.equals(other.getPending()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.payment==null && other.getPayment()==null) || 
             (this.payment!=null &&
              this.payment.equals(other.getPayment()))) &&
            ((this.autoApply==null && other.getAutoApply()==null) || 
             (this.autoApply!=null &&
              this.autoApply.equals(other.getAutoApply()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
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
            ((this.checkNum==null && other.getCheckNum()==null) || 
             (this.checkNum!=null &&
              this.checkNum.equals(other.getCheckNum()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.chargeIt==null && other.getChargeIt()==null) || 
             (this.chargeIt!=null &&
              this.chargeIt.equals(other.getChargeIt()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
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
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.ccAvsStreetMatch==null && other.getCcAvsStreetMatch()==null) || 
             (this.ccAvsStreetMatch!=null &&
              this.ccAvsStreetMatch.equals(other.getCcAvsStreetMatch()))) &&
            ((this.ccAvsZipMatch==null && other.getCcAvsZipMatch()==null) || 
             (this.ccAvsZipMatch!=null &&
              this.ccAvsZipMatch.equals(other.getCcAvsZipMatch()))) &&
            ((this.isRecurringPayment==null && other.getIsRecurringPayment()==null) || 
             (this.isRecurringPayment!=null &&
              this.isRecurringPayment.equals(other.getIsRecurringPayment()))) &&
            ((this.ccSecurityCode==null && other.getCcSecurityCode()==null) || 
             (this.ccSecurityCode!=null &&
              this.ccSecurityCode.equals(other.getCcSecurityCode()))) &&
            ((this.ignoreAvs==null && other.getIgnoreAvs()==null) || 
             (this.ignoreAvs!=null &&
              this.ignoreAvs.equals(other.getIgnoreAvs()))) &&
            ((this.ccSecurityCodeMatch==null && other.getCcSecurityCodeMatch()==null) || 
             (this.ccSecurityCodeMatch!=null &&
              this.ccSecurityCodeMatch.equals(other.getCcSecurityCodeMatch()))) &&
            ((this.threeDStatusCode==null && other.getThreeDStatusCode()==null) || 
             (this.threeDStatusCode!=null &&
              this.threeDStatusCode.equals(other.getThreeDStatusCode()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              this.pnRefNum.equals(other.getPnRefNum()))) &&
            ((this.creditCardProcessor==null && other.getCreditCardProcessor()==null) || 
             (this.creditCardProcessor!=null &&
              this.creditCardProcessor.equals(other.getCreditCardProcessor()))) &&
            ((this.debitCardIssueNo==null && other.getDebitCardIssueNo()==null) || 
             (this.debitCardIssueNo!=null &&
              this.debitCardIssueNo.equals(other.getDebitCardIssueNo()))) &&
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
            ((this.undepFunds==null && other.getUndepFunds()==null) || 
             (this.undepFunds!=null &&
              this.undepFunds.equals(other.getUndepFunds()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.applied==null && other.getApplied()==null) || 
             (this.applied!=null &&
              this.applied.equals(other.getApplied()))) &&
            ((this.unapplied==null && other.getUnapplied()==null) || 
             (this.unapplied!=null &&
              this.unapplied.equals(other.getUnapplied()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.applyList==null && other.getApplyList()==null) || 
             (this.applyList!=null &&
              this.applyList.equals(other.getApplyList()))) &&
            ((this.creditList==null && other.getCreditList()==null) || 
             (this.creditList!=null &&
              this.creditList.equals(other.getCreditList()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getArAcct() != null) {
            _hashCode += getArAcct().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getPending() != null) {
            _hashCode += getPending().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPayment() != null) {
            _hashCode += getPayment().hashCode();
        }
        if (getAutoApply() != null) {
            _hashCode += getAutoApply().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
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
        if (getCheckNum() != null) {
            _hashCode += getCheckNum().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getChargeIt() != null) {
            _hashCode += getChargeIt().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
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
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getCcAvsStreetMatch() != null) {
            _hashCode += getCcAvsStreetMatch().hashCode();
        }
        if (getCcAvsZipMatch() != null) {
            _hashCode += getCcAvsZipMatch().hashCode();
        }
        if (getIsRecurringPayment() != null) {
            _hashCode += getIsRecurringPayment().hashCode();
        }
        if (getCcSecurityCode() != null) {
            _hashCode += getCcSecurityCode().hashCode();
        }
        if (getIgnoreAvs() != null) {
            _hashCode += getIgnoreAvs().hashCode();
        }
        if (getCcSecurityCodeMatch() != null) {
            _hashCode += getCcSecurityCodeMatch().hashCode();
        }
        if (getThreeDStatusCode() != null) {
            _hashCode += getThreeDStatusCode().hashCode();
        }
        if (getPnRefNum() != null) {
            _hashCode += getPnRefNum().hashCode();
        }
        if (getCreditCardProcessor() != null) {
            _hashCode += getCreditCardProcessor().hashCode();
        }
        if (getDebitCardIssueNo() != null) {
            _hashCode += getDebitCardIssueNo().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        if (getUndepFunds() != null) {
            _hashCode += getUndepFunds().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getApplied() != null) {
            _hashCode += getApplied().hashCode();
        }
        if (getUnapplied() != null) {
            _hashCode += getUnapplied().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getApplyList() != null) {
            _hashCode += getApplyList().hashCode();
        }
        if (getCreditList() != null) {
            _hashCode += getCreditList().hashCode();
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
        new org.apache.axis.description.TypeDesc(CustomerPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "CustomerPayment"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customer"));
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
        elemField.setFieldName("pending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "pending"));
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
        elemField.setFieldName("payment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "payment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoApply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "autoApply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("checkNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "checkNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "creditCard"));
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
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccNumber"));
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
        elemField.setFieldName("ccSecurityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ccSecurityCode"));
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
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "pnRefNum"));
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
        elemField.setFieldName("undepFunds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "undepFunds"));
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
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("applied");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "applied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unapplied");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "unapplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "department"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "CustomerPaymentHandlingMode"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "CustomerPaymentPaymentOperation"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "applyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "CustomerPaymentApplyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "creditList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "CustomerPaymentCreditList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "depositList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "CustomerPaymentDepositList"));
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
