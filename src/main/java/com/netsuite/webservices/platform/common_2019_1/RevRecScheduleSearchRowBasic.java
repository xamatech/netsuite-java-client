/**
 * RevRecScheduleSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class RevRecScheduleSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] amorStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amortizedAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] amorType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] deferredAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] destAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] initialAmt;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isRecognized;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] jeDoc;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineSequenceNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nameUrl;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] pctComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] pctRecognition;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] periodOffset;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurFxAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] schedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] scheduleNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] sourceAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] srcDocLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] srcTran;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] srcTranPostPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] startOffset;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useForeignAmounts;

    public RevRecScheduleSearchRowBasic() {
    }

    public RevRecScheduleSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBook,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] amorStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amortizedAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] amorType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] deferredAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] destAcct,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] initialAmt,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isRecognized,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] jeDoc,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineSequenceNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nameUrl,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] pctComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] pctRecognition,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] periodOffset,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurFxAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] schedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] scheduleNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] sourceAcct,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] srcDocLine,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] srcTran,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] srcTranPostPeriod,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] startOffset,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useForeignAmounts) {
        this.accountingBook = accountingBook;
        this.amorStatus = amorStatus;
        this.amorTemplate = amorTemplate;
        this.amortizedAmount = amortizedAmount;
        this.amorType = amorType;
        this.amount = amount;
        this.currency = currency;
        this.deferredAmount = deferredAmount;
        this.destAcct = destAcct;
        this.externalId = externalId;
        this.initialAmt = initialAmt;
        this.internalId = internalId;
        this.isRecognized = isRecognized;
        this.jeDoc = jeDoc;
        this.lineSequenceNumber = lineSequenceNumber;
        this.name = name;
        this.nameUrl = nameUrl;
        this.pctComplete = pctComplete;
        this.pctRecognition = pctRecognition;
        this.periodOffset = periodOffset;
        this.recurAmount = recurAmount;
        this.recurFxAmount = recurFxAmount;
        this.schedDate = schedDate;
        this.scheduleNumber = scheduleNumber;
        this.sourceAcct = sourceAcct;
        this.srcDocLine = srcDocLine;
        this.srcTran = srcTran;
        this.srcTranPostPeriod = srcTranPostPeriod;
        this.startOffset = startOffset;
        this.useForeignAmounts = useForeignAmounts;
    }


    /**
     * Gets the accountingBook value for this RevRecScheduleSearchRowBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this RevRecScheduleSearchRowBasic.
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
     * Gets the amorStatus value for this RevRecScheduleSearchRowBasic.
     * 
     * @return amorStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getAmorStatus() {
        return amorStatus;
    }


    /**
     * Sets the amorStatus value for this RevRecScheduleSearchRowBasic.
     * 
     * @param amorStatus
     */
    public void setAmorStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] amorStatus) {
        this.amorStatus = amorStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getAmorStatus(int i) {
        return this.amorStatus[i];
    }

    public void setAmorStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.amorStatus[i] = _value;
    }


    /**
     * Gets the amorTemplate value for this RevRecScheduleSearchRowBasic.
     * 
     * @return amorTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAmorTemplate() {
        return amorTemplate;
    }


    /**
     * Sets the amorTemplate value for this RevRecScheduleSearchRowBasic.
     * 
     * @param amorTemplate
     */
    public void setAmorTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorTemplate) {
        this.amorTemplate = amorTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAmorTemplate(int i) {
        return this.amorTemplate[i];
    }

    public void setAmorTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.amorTemplate[i] = _value;
    }


    /**
     * Gets the amortizedAmount value for this RevRecScheduleSearchRowBasic.
     * 
     * @return amortizedAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmortizedAmount() {
        return amortizedAmount;
    }


    /**
     * Sets the amortizedAmount value for this RevRecScheduleSearchRowBasic.
     * 
     * @param amortizedAmount
     */
    public void setAmortizedAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amortizedAmount) {
        this.amortizedAmount = amortizedAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmortizedAmount(int i) {
        return this.amortizedAmount[i];
    }

    public void setAmortizedAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amortizedAmount[i] = _value;
    }


    /**
     * Gets the amorType value for this RevRecScheduleSearchRowBasic.
     * 
     * @return amorType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getAmorType() {
        return amorType;
    }


    /**
     * Sets the amorType value for this RevRecScheduleSearchRowBasic.
     * 
     * @param amorType
     */
    public void setAmorType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] amorType) {
        this.amorType = amorType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getAmorType(int i) {
        return this.amorType[i];
    }

    public void setAmorType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.amorType[i] = _value;
    }


    /**
     * Gets the amount value for this RevRecScheduleSearchRowBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RevRecScheduleSearchRowBasic.
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
     * Gets the currency value for this RevRecScheduleSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this RevRecScheduleSearchRowBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] currency) {
        this.currency = currency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.currency[i] = _value;
    }


    /**
     * Gets the deferredAmount value for this RevRecScheduleSearchRowBasic.
     * 
     * @return deferredAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDeferredAmount() {
        return deferredAmount;
    }


    /**
     * Sets the deferredAmount value for this RevRecScheduleSearchRowBasic.
     * 
     * @param deferredAmount
     */
    public void setDeferredAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] deferredAmount) {
        this.deferredAmount = deferredAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDeferredAmount(int i) {
        return this.deferredAmount[i];
    }

    public void setDeferredAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.deferredAmount[i] = _value;
    }


    /**
     * Gets the destAcct value for this RevRecScheduleSearchRowBasic.
     * 
     * @return destAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDestAcct() {
        return destAcct;
    }


    /**
     * Sets the destAcct value for this RevRecScheduleSearchRowBasic.
     * 
     * @param destAcct
     */
    public void setDestAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] destAcct) {
        this.destAcct = destAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDestAcct(int i) {
        return this.destAcct[i];
    }

    public void setDestAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.destAcct[i] = _value;
    }


    /**
     * Gets the externalId value for this RevRecScheduleSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this RevRecScheduleSearchRowBasic.
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
     * Gets the initialAmt value for this RevRecScheduleSearchRowBasic.
     * 
     * @return initialAmt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getInitialAmt() {
        return initialAmt;
    }


    /**
     * Sets the initialAmt value for this RevRecScheduleSearchRowBasic.
     * 
     * @param initialAmt
     */
    public void setInitialAmt(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] initialAmt) {
        this.initialAmt = initialAmt;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getInitialAmt(int i) {
        return this.initialAmt[i];
    }

    public void setInitialAmt(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.initialAmt[i] = _value;
    }


    /**
     * Gets the internalId value for this RevRecScheduleSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this RevRecScheduleSearchRowBasic.
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
     * Gets the isRecognized value for this RevRecScheduleSearchRowBasic.
     * 
     * @return isRecognized
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsRecognized() {
        return isRecognized;
    }


    /**
     * Sets the isRecognized value for this RevRecScheduleSearchRowBasic.
     * 
     * @param isRecognized
     */
    public void setIsRecognized(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isRecognized) {
        this.isRecognized = isRecognized;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsRecognized(int i) {
        return this.isRecognized[i];
    }

    public void setIsRecognized(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isRecognized[i] = _value;
    }


    /**
     * Gets the jeDoc value for this RevRecScheduleSearchRowBasic.
     * 
     * @return jeDoc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getJeDoc() {
        return jeDoc;
    }


    /**
     * Sets the jeDoc value for this RevRecScheduleSearchRowBasic.
     * 
     * @param jeDoc
     */
    public void setJeDoc(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] jeDoc) {
        this.jeDoc = jeDoc;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getJeDoc(int i) {
        return this.jeDoc[i];
    }

    public void setJeDoc(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.jeDoc[i] = _value;
    }


    /**
     * Gets the lineSequenceNumber value for this RevRecScheduleSearchRowBasic.
     * 
     * @return lineSequenceNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLineSequenceNumber() {
        return lineSequenceNumber;
    }


    /**
     * Sets the lineSequenceNumber value for this RevRecScheduleSearchRowBasic.
     * 
     * @param lineSequenceNumber
     */
    public void setLineSequenceNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineSequenceNumber) {
        this.lineSequenceNumber = lineSequenceNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLineSequenceNumber(int i) {
        return this.lineSequenceNumber[i];
    }

    public void setLineSequenceNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.lineSequenceNumber[i] = _value;
    }


    /**
     * Gets the name value for this RevRecScheduleSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this RevRecScheduleSearchRowBasic.
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
     * Gets the nameUrl value for this RevRecScheduleSearchRowBasic.
     * 
     * @return nameUrl
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNameUrl() {
        return nameUrl;
    }


    /**
     * Sets the nameUrl value for this RevRecScheduleSearchRowBasic.
     * 
     * @param nameUrl
     */
    public void setNameUrl(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nameUrl) {
        this.nameUrl = nameUrl;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNameUrl(int i) {
        return this.nameUrl[i];
    }

    public void setNameUrl(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.nameUrl[i] = _value;
    }


    /**
     * Gets the pctComplete value for this RevRecScheduleSearchRowBasic.
     * 
     * @return pctComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPctComplete() {
        return pctComplete;
    }


    /**
     * Sets the pctComplete value for this RevRecScheduleSearchRowBasic.
     * 
     * @param pctComplete
     */
    public void setPctComplete(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] pctComplete) {
        this.pctComplete = pctComplete;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPctComplete(int i) {
        return this.pctComplete[i];
    }

    public void setPctComplete(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.pctComplete[i] = _value;
    }


    /**
     * Gets the pctRecognition value for this RevRecScheduleSearchRowBasic.
     * 
     * @return pctRecognition
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPctRecognition() {
        return pctRecognition;
    }


    /**
     * Sets the pctRecognition value for this RevRecScheduleSearchRowBasic.
     * 
     * @param pctRecognition
     */
    public void setPctRecognition(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] pctRecognition) {
        this.pctRecognition = pctRecognition;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPctRecognition(int i) {
        return this.pctRecognition[i];
    }

    public void setPctRecognition(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.pctRecognition[i] = _value;
    }


    /**
     * Gets the periodOffset value for this RevRecScheduleSearchRowBasic.
     * 
     * @return periodOffset
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getPeriodOffset() {
        return periodOffset;
    }


    /**
     * Sets the periodOffset value for this RevRecScheduleSearchRowBasic.
     * 
     * @param periodOffset
     */
    public void setPeriodOffset(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] periodOffset) {
        this.periodOffset = periodOffset;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getPeriodOffset(int i) {
        return this.periodOffset[i];
    }

    public void setPeriodOffset(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.periodOffset[i] = _value;
    }


    /**
     * Gets the recurAmount value for this RevRecScheduleSearchRowBasic.
     * 
     * @return recurAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRecurAmount() {
        return recurAmount;
    }


    /**
     * Sets the recurAmount value for this RevRecScheduleSearchRowBasic.
     * 
     * @param recurAmount
     */
    public void setRecurAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurAmount) {
        this.recurAmount = recurAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRecurAmount(int i) {
        return this.recurAmount[i];
    }

    public void setRecurAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.recurAmount[i] = _value;
    }


    /**
     * Gets the recurFxAmount value for this RevRecScheduleSearchRowBasic.
     * 
     * @return recurFxAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRecurFxAmount() {
        return recurFxAmount;
    }


    /**
     * Sets the recurFxAmount value for this RevRecScheduleSearchRowBasic.
     * 
     * @param recurFxAmount
     */
    public void setRecurFxAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurFxAmount) {
        this.recurFxAmount = recurFxAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRecurFxAmount(int i) {
        return this.recurFxAmount[i];
    }

    public void setRecurFxAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.recurFxAmount[i] = _value;
    }


    /**
     * Gets the schedDate value for this RevRecScheduleSearchRowBasic.
     * 
     * @return schedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getSchedDate() {
        return schedDate;
    }


    /**
     * Sets the schedDate value for this RevRecScheduleSearchRowBasic.
     * 
     * @param schedDate
     */
    public void setSchedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] schedDate) {
        this.schedDate = schedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getSchedDate(int i) {
        return this.schedDate[i];
    }

    public void setSchedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.schedDate[i] = _value;
    }


    /**
     * Gets the scheduleNumber value for this RevRecScheduleSearchRowBasic.
     * 
     * @return scheduleNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getScheduleNumber() {
        return scheduleNumber;
    }


    /**
     * Sets the scheduleNumber value for this RevRecScheduleSearchRowBasic.
     * 
     * @param scheduleNumber
     */
    public void setScheduleNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getScheduleNumber(int i) {
        return this.scheduleNumber[i];
    }

    public void setScheduleNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.scheduleNumber[i] = _value;
    }


    /**
     * Gets the sourceAcct value for this RevRecScheduleSearchRowBasic.
     * 
     * @return sourceAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSourceAcct() {
        return sourceAcct;
    }


    /**
     * Sets the sourceAcct value for this RevRecScheduleSearchRowBasic.
     * 
     * @param sourceAcct
     */
    public void setSourceAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] sourceAcct) {
        this.sourceAcct = sourceAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSourceAcct(int i) {
        return this.sourceAcct[i];
    }

    public void setSourceAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.sourceAcct[i] = _value;
    }


    /**
     * Gets the srcDocLine value for this RevRecScheduleSearchRowBasic.
     * 
     * @return srcDocLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSrcDocLine() {
        return srcDocLine;
    }


    /**
     * Sets the srcDocLine value for this RevRecScheduleSearchRowBasic.
     * 
     * @param srcDocLine
     */
    public void setSrcDocLine(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] srcDocLine) {
        this.srcDocLine = srcDocLine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSrcDocLine(int i) {
        return this.srcDocLine[i];
    }

    public void setSrcDocLine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.srcDocLine[i] = _value;
    }


    /**
     * Gets the srcTran value for this RevRecScheduleSearchRowBasic.
     * 
     * @return srcTran
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSrcTran() {
        return srcTran;
    }


    /**
     * Sets the srcTran value for this RevRecScheduleSearchRowBasic.
     * 
     * @param srcTran
     */
    public void setSrcTran(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] srcTran) {
        this.srcTran = srcTran;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSrcTran(int i) {
        return this.srcTran[i];
    }

    public void setSrcTran(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.srcTran[i] = _value;
    }


    /**
     * Gets the srcTranPostPeriod value for this RevRecScheduleSearchRowBasic.
     * 
     * @return srcTranPostPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSrcTranPostPeriod() {
        return srcTranPostPeriod;
    }


    /**
     * Sets the srcTranPostPeriod value for this RevRecScheduleSearchRowBasic.
     * 
     * @param srcTranPostPeriod
     */
    public void setSrcTranPostPeriod(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] srcTranPostPeriod) {
        this.srcTranPostPeriod = srcTranPostPeriod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSrcTranPostPeriod(int i) {
        return this.srcTranPostPeriod[i];
    }

    public void setSrcTranPostPeriod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.srcTranPostPeriod[i] = _value;
    }


    /**
     * Gets the startOffset value for this RevRecScheduleSearchRowBasic.
     * 
     * @return startOffset
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getStartOffset() {
        return startOffset;
    }


    /**
     * Sets the startOffset value for this RevRecScheduleSearchRowBasic.
     * 
     * @param startOffset
     */
    public void setStartOffset(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] startOffset) {
        this.startOffset = startOffset;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getStartOffset(int i) {
        return this.startOffset[i];
    }

    public void setStartOffset(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.startOffset[i] = _value;
    }


    /**
     * Gets the useForeignAmounts value for this RevRecScheduleSearchRowBasic.
     * 
     * @return useForeignAmounts
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getUseForeignAmounts() {
        return useForeignAmounts;
    }


    /**
     * Sets the useForeignAmounts value for this RevRecScheduleSearchRowBasic.
     * 
     * @param useForeignAmounts
     */
    public void setUseForeignAmounts(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useForeignAmounts) {
        this.useForeignAmounts = useForeignAmounts;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getUseForeignAmounts(int i) {
        return this.useForeignAmounts[i];
    }

    public void setUseForeignAmounts(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.useForeignAmounts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevRecScheduleSearchRowBasic)) return false;
        RevRecScheduleSearchRowBasic other = (RevRecScheduleSearchRowBasic) obj;
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
            ((this.amorStatus==null && other.getAmorStatus()==null) || 
             (this.amorStatus!=null &&
              java.util.Arrays.equals(this.amorStatus, other.getAmorStatus()))) &&
            ((this.amorTemplate==null && other.getAmorTemplate()==null) || 
             (this.amorTemplate!=null &&
              java.util.Arrays.equals(this.amorTemplate, other.getAmorTemplate()))) &&
            ((this.amortizedAmount==null && other.getAmortizedAmount()==null) || 
             (this.amortizedAmount!=null &&
              java.util.Arrays.equals(this.amortizedAmount, other.getAmortizedAmount()))) &&
            ((this.amorType==null && other.getAmorType()==null) || 
             (this.amorType!=null &&
              java.util.Arrays.equals(this.amorType, other.getAmorType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              java.util.Arrays.equals(this.amount, other.getAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.deferredAmount==null && other.getDeferredAmount()==null) || 
             (this.deferredAmount!=null &&
              java.util.Arrays.equals(this.deferredAmount, other.getDeferredAmount()))) &&
            ((this.destAcct==null && other.getDestAcct()==null) || 
             (this.destAcct!=null &&
              java.util.Arrays.equals(this.destAcct, other.getDestAcct()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.initialAmt==null && other.getInitialAmt()==null) || 
             (this.initialAmt!=null &&
              java.util.Arrays.equals(this.initialAmt, other.getInitialAmt()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isRecognized==null && other.getIsRecognized()==null) || 
             (this.isRecognized!=null &&
              java.util.Arrays.equals(this.isRecognized, other.getIsRecognized()))) &&
            ((this.jeDoc==null && other.getJeDoc()==null) || 
             (this.jeDoc!=null &&
              java.util.Arrays.equals(this.jeDoc, other.getJeDoc()))) &&
            ((this.lineSequenceNumber==null && other.getLineSequenceNumber()==null) || 
             (this.lineSequenceNumber!=null &&
              java.util.Arrays.equals(this.lineSequenceNumber, other.getLineSequenceNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.nameUrl==null && other.getNameUrl()==null) || 
             (this.nameUrl!=null &&
              java.util.Arrays.equals(this.nameUrl, other.getNameUrl()))) &&
            ((this.pctComplete==null && other.getPctComplete()==null) || 
             (this.pctComplete!=null &&
              java.util.Arrays.equals(this.pctComplete, other.getPctComplete()))) &&
            ((this.pctRecognition==null && other.getPctRecognition()==null) || 
             (this.pctRecognition!=null &&
              java.util.Arrays.equals(this.pctRecognition, other.getPctRecognition()))) &&
            ((this.periodOffset==null && other.getPeriodOffset()==null) || 
             (this.periodOffset!=null &&
              java.util.Arrays.equals(this.periodOffset, other.getPeriodOffset()))) &&
            ((this.recurAmount==null && other.getRecurAmount()==null) || 
             (this.recurAmount!=null &&
              java.util.Arrays.equals(this.recurAmount, other.getRecurAmount()))) &&
            ((this.recurFxAmount==null && other.getRecurFxAmount()==null) || 
             (this.recurFxAmount!=null &&
              java.util.Arrays.equals(this.recurFxAmount, other.getRecurFxAmount()))) &&
            ((this.schedDate==null && other.getSchedDate()==null) || 
             (this.schedDate!=null &&
              java.util.Arrays.equals(this.schedDate, other.getSchedDate()))) &&
            ((this.scheduleNumber==null && other.getScheduleNumber()==null) || 
             (this.scheduleNumber!=null &&
              java.util.Arrays.equals(this.scheduleNumber, other.getScheduleNumber()))) &&
            ((this.sourceAcct==null && other.getSourceAcct()==null) || 
             (this.sourceAcct!=null &&
              java.util.Arrays.equals(this.sourceAcct, other.getSourceAcct()))) &&
            ((this.srcDocLine==null && other.getSrcDocLine()==null) || 
             (this.srcDocLine!=null &&
              java.util.Arrays.equals(this.srcDocLine, other.getSrcDocLine()))) &&
            ((this.srcTran==null && other.getSrcTran()==null) || 
             (this.srcTran!=null &&
              java.util.Arrays.equals(this.srcTran, other.getSrcTran()))) &&
            ((this.srcTranPostPeriod==null && other.getSrcTranPostPeriod()==null) || 
             (this.srcTranPostPeriod!=null &&
              java.util.Arrays.equals(this.srcTranPostPeriod, other.getSrcTranPostPeriod()))) &&
            ((this.startOffset==null && other.getStartOffset()==null) || 
             (this.startOffset!=null &&
              java.util.Arrays.equals(this.startOffset, other.getStartOffset()))) &&
            ((this.useForeignAmounts==null && other.getUseForeignAmounts()==null) || 
             (this.useForeignAmounts!=null &&
              java.util.Arrays.equals(this.useForeignAmounts, other.getUseForeignAmounts())));
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
        if (getAmorStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmorTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmortizedAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmortizedAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmortizedAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmorType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorType(), i);
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
        if (getDeferredAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferredAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferredAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDestAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestAcct(), i);
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
        if (getInitialAmt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInitialAmt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInitialAmt(), i);
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
        if (getIsRecognized() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsRecognized());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsRecognized(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJeDoc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJeDoc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJeDoc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineSequenceNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineSequenceNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineSequenceNumber(), i);
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
        if (getNameUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPctComplete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPctComplete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPctComplete(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPctRecognition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPctRecognition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPctRecognition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriodOffset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodOffset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodOffset(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurFxAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurFxAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurFxAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSchedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduleNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduleNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduleNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSourceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSrcDocLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSrcDocLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSrcDocLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSrcTran() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSrcTran());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSrcTran(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSrcTranPostPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSrcTranPostPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSrcTranPostPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartOffset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartOffset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartOffset(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseForeignAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseForeignAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseForeignAmounts(), i);
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
        new org.apache.axis.description.TypeDesc(RevRecScheduleSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RevRecScheduleSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amortizedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferredAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "destAcct"));
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
        elemField.setFieldName("initialAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "initialAmt"));
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
        elemField.setFieldName("isRecognized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isRecognized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jeDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jeDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("nameUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nameUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pctComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctRecognition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pctRecognition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurFxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurFxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "schedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sourceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcDocLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "srcDocLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcTran");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "srcTran"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcTranPostPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "srcTranPostPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useForeignAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useForeignAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
