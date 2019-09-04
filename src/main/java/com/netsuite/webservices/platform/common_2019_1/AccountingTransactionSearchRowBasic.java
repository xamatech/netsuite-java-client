/**
 * AccountingTransactionSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class AccountingTransactionSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] account;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesNetAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] baseCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] catchUpPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] customGL;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] debitAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] deferRevRec;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] exchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] multiSubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] netAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] posting;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityRevCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recognizedRevenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revCommitStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revenueStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecEndDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] revRecOnRevCommitment;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecStartDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] tranIsVsoeBundle;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoeAllocation;

    public AccountingTransactionSearchRowBasic() {
    }

    public AccountingTransactionSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] account,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBook,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesNetAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] baseCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] catchUpPeriod,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] customGL,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] debitAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] deferRevRec,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] exchangeRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] multiSubsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] netAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] posting,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityRevCommitted,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recognizedRevenue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revCommitStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revenueStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecEndDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] revRecOnRevCommitment,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecStartDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] tranIsVsoeBundle,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoeAllocation) {
        this.account = account;
        this.accountingBook = accountingBook;
        this.accountType = accountType;
        this.altSalesAmount = altSalesAmount;
        this.altSalesNetAmount = altSalesNetAmount;
        this.amount = amount;
        this.baseCurrency = baseCurrency;
        this.catchUpPeriod = catchUpPeriod;
        this.creditAmount = creditAmount;
        this.customGL = customGL;
        this.dateCreated = dateCreated;
        this.debitAmount = debitAmount;
        this.deferRevRec = deferRevRec;
        this.exchangeRate = exchangeRate;
        this.fxAmount = fxAmount;
        this.grossAmount = grossAmount;
        this.internalId = internalId;
        this.lastModifiedDate = lastModifiedDate;
        this.multiSubsidiary = multiSubsidiary;
        this.netAmount = netAmount;
        this.posting = posting;
        this.quantityRevCommitted = quantityRevCommitted;
        this.recognizedRevenue = recognizedRevenue;
        this.revCommitStatus = revCommitStatus;
        this.revenueStatus = revenueStatus;
        this.revRecEndDate = revRecEndDate;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.revRecStartDate = revRecStartDate;
        this.subsidiary = subsidiary;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.vsoeAllocation = vsoeAllocation;
    }


    /**
     * Gets the account value for this AccountingTransactionSearchRowBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this AccountingTransactionSearchRowBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] account) {
        this.account = account;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the accountingBook value for this AccountingTransactionSearchRowBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this AccountingTransactionSearchRowBasic.
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
     * Gets the accountType value for this AccountingTransactionSearchRowBasic.
     * 
     * @return accountType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this AccountingTransactionSearchRowBasic.
     * 
     * @param accountType
     */
    public void setAccountType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountType) {
        this.accountType = accountType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAccountType(int i) {
        return this.accountType[i];
    }

    public void setAccountType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.accountType[i] = _value;
    }


    /**
     * Gets the altSalesAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @return altSalesAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAltSalesAmount() {
        return altSalesAmount;
    }


    /**
     * Sets the altSalesAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @param altSalesAmount
     */
    public void setAltSalesAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAltSalesAmount(int i) {
        return this.altSalesAmount[i];
    }

    public void setAltSalesAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.altSalesAmount[i] = _value;
    }


    /**
     * Gets the altSalesNetAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @return altSalesNetAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAltSalesNetAmount() {
        return altSalesNetAmount;
    }


    /**
     * Sets the altSalesNetAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @param altSalesNetAmount
     */
    public void setAltSalesNetAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAltSalesNetAmount(int i) {
        return this.altSalesNetAmount[i];
    }

    public void setAltSalesNetAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.altSalesNetAmount[i] = _value;
    }


    /**
     * Gets the amount value for this AccountingTransactionSearchRowBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AccountingTransactionSearchRowBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }


    /**
     * Gets the baseCurrency value for this AccountingTransactionSearchRowBasic.
     * 
     * @return baseCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBaseCurrency() {
        return baseCurrency;
    }


    /**
     * Sets the baseCurrency value for this AccountingTransactionSearchRowBasic.
     * 
     * @param baseCurrency
     */
    public void setBaseCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBaseCurrency(int i) {
        return this.baseCurrency[i];
    }

    public void setBaseCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.baseCurrency[i] = _value;
    }


    /**
     * Gets the catchUpPeriod value for this AccountingTransactionSearchRowBasic.
     * 
     * @return catchUpPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCatchUpPeriod() {
        return catchUpPeriod;
    }


    /**
     * Sets the catchUpPeriod value for this AccountingTransactionSearchRowBasic.
     * 
     * @param catchUpPeriod
     */
    public void setCatchUpPeriod(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCatchUpPeriod(int i) {
        return this.catchUpPeriod[i];
    }

    public void setCatchUpPeriod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.catchUpPeriod[i] = _value;
    }


    /**
     * Gets the creditAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @return creditAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditAmount) {
        this.creditAmount = creditAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCreditAmount(int i) {
        return this.creditAmount[i];
    }

    public void setCreditAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.creditAmount[i] = _value;
    }


    /**
     * Gets the customGL value for this AccountingTransactionSearchRowBasic.
     * 
     * @return customGL
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getCustomGL() {
        return customGL;
    }


    /**
     * Sets the customGL value for this AccountingTransactionSearchRowBasic.
     * 
     * @param customGL
     */
    public void setCustomGL(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] customGL) {
        this.customGL = customGL;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getCustomGL(int i) {
        return this.customGL[i];
    }

    public void setCustomGL(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.customGL[i] = _value;
    }


    /**
     * Gets the dateCreated value for this AccountingTransactionSearchRowBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this AccountingTransactionSearchRowBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }


    /**
     * Gets the debitAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @return debitAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] debitAmount) {
        this.debitAmount = debitAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDebitAmount(int i) {
        return this.debitAmount[i];
    }

    public void setDebitAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.debitAmount[i] = _value;
    }


    /**
     * Gets the deferRevRec value for this AccountingTransactionSearchRowBasic.
     * 
     * @return deferRevRec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this AccountingTransactionSearchRowBasic.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getDeferRevRec(int i) {
        return this.deferRevRec[i];
    }

    public void setDeferRevRec(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.deferRevRec[i] = _value;
    }


    /**
     * Gets the exchangeRate value for this AccountingTransactionSearchRowBasic.
     * 
     * @return exchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this AccountingTransactionSearchRowBasic.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getExchangeRate(int i) {
        return this.exchangeRate[i];
    }

    public void setExchangeRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.exchangeRate[i] = _value;
    }


    /**
     * Gets the fxAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @return fxAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxAmount() {
        return fxAmount;
    }


    /**
     * Sets the fxAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @param fxAmount
     */
    public void setFxAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxAmount) {
        this.fxAmount = fxAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxAmount(int i) {
        return this.fxAmount[i];
    }

    public void setFxAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxAmount[i] = _value;
    }


    /**
     * Gets the grossAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @return grossAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @param grossAmount
     */
    public void setGrossAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossAmount) {
        this.grossAmount = grossAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGrossAmount(int i) {
        return this.grossAmount[i];
    }

    public void setGrossAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.grossAmount[i] = _value;
    }


    /**
     * Gets the internalId value for this AccountingTransactionSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AccountingTransactionSearchRowBasic.
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
     * Gets the lastModifiedDate value for this AccountingTransactionSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this AccountingTransactionSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the multiSubsidiary value for this AccountingTransactionSearchRowBasic.
     * 
     * @return multiSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMultiSubsidiary() {
        return multiSubsidiary;
    }


    /**
     * Sets the multiSubsidiary value for this AccountingTransactionSearchRowBasic.
     * 
     * @param multiSubsidiary
     */
    public void setMultiSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMultiSubsidiary(int i) {
        return this.multiSubsidiary[i];
    }

    public void setMultiSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.multiSubsidiary[i] = _value;
    }


    /**
     * Gets the netAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @return netAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this AccountingTransactionSearchRowBasic.
     * 
     * @param netAmount
     */
    public void setNetAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] netAmount) {
        this.netAmount = netAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getNetAmount(int i) {
        return this.netAmount[i];
    }

    public void setNetAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.netAmount[i] = _value;
    }


    /**
     * Gets the posting value for this AccountingTransactionSearchRowBasic.
     * 
     * @return posting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPosting() {
        return posting;
    }


    /**
     * Sets the posting value for this AccountingTransactionSearchRowBasic.
     * 
     * @param posting
     */
    public void setPosting(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] posting) {
        this.posting = posting;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPosting(int i) {
        return this.posting[i];
    }

    public void setPosting(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.posting[i] = _value;
    }


    /**
     * Gets the quantityRevCommitted value for this AccountingTransactionSearchRowBasic.
     * 
     * @return quantityRevCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityRevCommitted() {
        return quantityRevCommitted;
    }


    /**
     * Sets the quantityRevCommitted value for this AccountingTransactionSearchRowBasic.
     * 
     * @param quantityRevCommitted
     */
    public void setQuantityRevCommitted(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityRevCommitted(int i) {
        return this.quantityRevCommitted[i];
    }

    public void setQuantityRevCommitted(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityRevCommitted[i] = _value;
    }


    /**
     * Gets the recognizedRevenue value for this AccountingTransactionSearchRowBasic.
     * 
     * @return recognizedRevenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this AccountingTransactionSearchRowBasic.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRecognizedRevenue(int i) {
        return this.recognizedRevenue[i];
    }

    public void setRecognizedRevenue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.recognizedRevenue[i] = _value;
    }


    /**
     * Gets the revCommitStatus value for this AccountingTransactionSearchRowBasic.
     * 
     * @return revCommitStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getRevCommitStatus() {
        return revCommitStatus;
    }


    /**
     * Sets the revCommitStatus value for this AccountingTransactionSearchRowBasic.
     * 
     * @param revCommitStatus
     */
    public void setRevCommitStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getRevCommitStatus(int i) {
        return this.revCommitStatus[i];
    }

    public void setRevCommitStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.revCommitStatus[i] = _value;
    }


    /**
     * Gets the revenueStatus value for this AccountingTransactionSearchRowBasic.
     * 
     * @return revenueStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this AccountingTransactionSearchRowBasic.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revenueStatus) {
        this.revenueStatus = revenueStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getRevenueStatus(int i) {
        return this.revenueStatus[i];
    }

    public void setRevenueStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.revenueStatus[i] = _value;
    }


    /**
     * Gets the revRecEndDate value for this AccountingTransactionSearchRowBasic.
     * 
     * @return revRecEndDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this AccountingTransactionSearchRowBasic.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getRevRecEndDate(int i) {
        return this.revRecEndDate[i];
    }

    public void setRevRecEndDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.revRecEndDate[i] = _value;
    }


    /**
     * Gets the revRecOnRevCommitment value for this AccountingTransactionSearchRowBasic.
     * 
     * @return revRecOnRevCommitment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this AccountingTransactionSearchRowBasic.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getRevRecOnRevCommitment(int i) {
        return this.revRecOnRevCommitment[i];
    }

    public void setRevRecOnRevCommitment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.revRecOnRevCommitment[i] = _value;
    }


    /**
     * Gets the revRecStartDate value for this AccountingTransactionSearchRowBasic.
     * 
     * @return revRecStartDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this AccountingTransactionSearchRowBasic.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getRevRecStartDate(int i) {
        return this.revRecStartDate[i];
    }

    public void setRevRecStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.revRecStartDate[i] = _value;
    }


    /**
     * Gets the subsidiary value for this AccountingTransactionSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this AccountingTransactionSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the tranIsVsoeBundle value for this AccountingTransactionSearchRowBasic.
     * 
     * @return tranIsVsoeBundle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this AccountingTransactionSearchRowBasic.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getTranIsVsoeBundle(int i) {
        return this.tranIsVsoeBundle[i];
    }

    public void setTranIsVsoeBundle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.tranIsVsoeBundle[i] = _value;
    }


    /**
     * Gets the vsoeAllocation value for this AccountingTransactionSearchRowBasic.
     * 
     * @return vsoeAllocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getVsoeAllocation() {
        return vsoeAllocation;
    }


    /**
     * Sets the vsoeAllocation value for this AccountingTransactionSearchRowBasic.
     * 
     * @param vsoeAllocation
     */
    public void setVsoeAllocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getVsoeAllocation(int i) {
        return this.vsoeAllocation[i];
    }

    public void setVsoeAllocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.vsoeAllocation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountingTransactionSearchRowBasic)) return false;
        AccountingTransactionSearchRowBasic other = (AccountingTransactionSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              java.util.Arrays.equals(this.accountingBook, other.getAccountingBook()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              java.util.Arrays.equals(this.accountType, other.getAccountType()))) &&
            ((this.altSalesAmount==null && other.getAltSalesAmount()==null) || 
             (this.altSalesAmount!=null &&
              java.util.Arrays.equals(this.altSalesAmount, other.getAltSalesAmount()))) &&
            ((this.altSalesNetAmount==null && other.getAltSalesNetAmount()==null) || 
             (this.altSalesNetAmount!=null &&
              java.util.Arrays.equals(this.altSalesNetAmount, other.getAltSalesNetAmount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              java.util.Arrays.equals(this.amount, other.getAmount()))) &&
            ((this.baseCurrency==null && other.getBaseCurrency()==null) || 
             (this.baseCurrency!=null &&
              java.util.Arrays.equals(this.baseCurrency, other.getBaseCurrency()))) &&
            ((this.catchUpPeriod==null && other.getCatchUpPeriod()==null) || 
             (this.catchUpPeriod!=null &&
              java.util.Arrays.equals(this.catchUpPeriod, other.getCatchUpPeriod()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              java.util.Arrays.equals(this.creditAmount, other.getCreditAmount()))) &&
            ((this.customGL==null && other.getCustomGL()==null) || 
             (this.customGL!=null &&
              java.util.Arrays.equals(this.customGL, other.getCustomGL()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.debitAmount==null && other.getDebitAmount()==null) || 
             (this.debitAmount!=null &&
              java.util.Arrays.equals(this.debitAmount, other.getDebitAmount()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              java.util.Arrays.equals(this.deferRevRec, other.getDeferRevRec()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              java.util.Arrays.equals(this.exchangeRate, other.getExchangeRate()))) &&
            ((this.fxAmount==null && other.getFxAmount()==null) || 
             (this.fxAmount!=null &&
              java.util.Arrays.equals(this.fxAmount, other.getFxAmount()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              java.util.Arrays.equals(this.grossAmount, other.getGrossAmount()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.multiSubsidiary==null && other.getMultiSubsidiary()==null) || 
             (this.multiSubsidiary!=null &&
              java.util.Arrays.equals(this.multiSubsidiary, other.getMultiSubsidiary()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              java.util.Arrays.equals(this.netAmount, other.getNetAmount()))) &&
            ((this.posting==null && other.getPosting()==null) || 
             (this.posting!=null &&
              java.util.Arrays.equals(this.posting, other.getPosting()))) &&
            ((this.quantityRevCommitted==null && other.getQuantityRevCommitted()==null) || 
             (this.quantityRevCommitted!=null &&
              java.util.Arrays.equals(this.quantityRevCommitted, other.getQuantityRevCommitted()))) &&
            ((this.recognizedRevenue==null && other.getRecognizedRevenue()==null) || 
             (this.recognizedRevenue!=null &&
              java.util.Arrays.equals(this.recognizedRevenue, other.getRecognizedRevenue()))) &&
            ((this.revCommitStatus==null && other.getRevCommitStatus()==null) || 
             (this.revCommitStatus!=null &&
              java.util.Arrays.equals(this.revCommitStatus, other.getRevCommitStatus()))) &&
            ((this.revenueStatus==null && other.getRevenueStatus()==null) || 
             (this.revenueStatus!=null &&
              java.util.Arrays.equals(this.revenueStatus, other.getRevenueStatus()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              java.util.Arrays.equals(this.revRecEndDate, other.getRevRecEndDate()))) &&
            ((this.revRecOnRevCommitment==null && other.getRevRecOnRevCommitment()==null) || 
             (this.revRecOnRevCommitment!=null &&
              java.util.Arrays.equals(this.revRecOnRevCommitment, other.getRevRecOnRevCommitment()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              java.util.Arrays.equals(this.revRecStartDate, other.getRevRecStartDate()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              java.util.Arrays.equals(this.tranIsVsoeBundle, other.getTranIsVsoeBundle()))) &&
            ((this.vsoeAllocation==null && other.getVsoeAllocation()==null) || 
             (this.vsoeAllocation!=null &&
              java.util.Arrays.equals(this.vsoeAllocation, other.getVsoeAllocation())));
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
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltSalesAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltSalesAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltSalesAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltSalesNetAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltSalesNetAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltSalesNetAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBaseCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCatchUpPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatchUpPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatchUpPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomGL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomGL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomGL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDebitAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDebitAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDebitAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferRevRec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferRevRec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferRevRec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExchangeRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExchangeRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExchangeRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrossAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrossAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrossAmount(), i);
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
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMultiSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultiSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultiSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPosting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPosting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPosting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityRevCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityRevCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityRevCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecognizedRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecognizedRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecognizedRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevCommitStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevCommitStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevCommitStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevenueStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevenueStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevenueStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecOnRevCommitment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecOnRevCommitment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecOnRevCommitment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranIsVsoeBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranIsVsoeBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranIsVsoeBundle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeAllocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeAllocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeAllocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountingTransactionSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingTransactionSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customGL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customGL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
