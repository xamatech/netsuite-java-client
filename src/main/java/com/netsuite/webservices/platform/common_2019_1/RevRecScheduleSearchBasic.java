/**
 * RevRecScheduleSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class RevRecScheduleSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amortizedAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorType;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField deferredAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField destAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField initialAmt;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isRecognized;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jeDoc;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField pctComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField pctRecognition;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField periodOffset;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField postPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField schedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField scheduleNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField scheduleNumberText;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField sourceAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField srcTranPostPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField srcTranType;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField startOffset;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField templateName;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useForeignAmounts;

    public RevRecScheduleSearchBasic() {
    }

    public RevRecScheduleSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBook,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amortizedAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorType,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField deferredAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField destAcct,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField initialAmt,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isRecognized,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jeDoc,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField pctComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField pctRecognition,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField periodOffset,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField postPeriod,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField schedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField scheduleNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField scheduleNumberText,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField sourceAcct,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField srcTranPostPeriod,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField srcTranType,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField startOffset,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField templateName,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useForeignAmounts) {
        this.accountingBook = accountingBook;
        this.amorStatus = amorStatus;
        this.amortizedAmount = amortizedAmount;
        this.amorType = amorType;
        this.amount = amount;
        this.currency = currency;
        this.deferredAmount = deferredAmount;
        this.destAcct = destAcct;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.initialAmt = initialAmt;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isRecognized = isRecognized;
        this.jeDoc = jeDoc;
        this.name = name;
        this.pctComplete = pctComplete;
        this.pctRecognition = pctRecognition;
        this.periodOffset = periodOffset;
        this.postPeriod = postPeriod;
        this.schedDate = schedDate;
        this.scheduleNumber = scheduleNumber;
        this.scheduleNumberText = scheduleNumberText;
        this.sourceAcct = sourceAcct;
        this.srcTranPostPeriod = srcTranPostPeriod;
        this.srcTranType = srcTranType;
        this.startOffset = startOffset;
        this.templateName = templateName;
        this.useForeignAmounts = useForeignAmounts;
    }


    /**
     * Gets the accountingBook value for this RevRecScheduleSearchBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this RevRecScheduleSearchBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the amorStatus value for this RevRecScheduleSearchBasic.
     * 
     * @return amorStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAmorStatus() {
        return amorStatus;
    }


    /**
     * Sets the amorStatus value for this RevRecScheduleSearchBasic.
     * 
     * @param amorStatus
     */
    public void setAmorStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorStatus) {
        this.amorStatus = amorStatus;
    }


    /**
     * Gets the amortizedAmount value for this RevRecScheduleSearchBasic.
     * 
     * @return amortizedAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmortizedAmount() {
        return amortizedAmount;
    }


    /**
     * Sets the amortizedAmount value for this RevRecScheduleSearchBasic.
     * 
     * @param amortizedAmount
     */
    public void setAmortizedAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amortizedAmount) {
        this.amortizedAmount = amortizedAmount;
    }


    /**
     * Gets the amorType value for this RevRecScheduleSearchBasic.
     * 
     * @return amorType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAmorType() {
        return amorType;
    }


    /**
     * Sets the amorType value for this RevRecScheduleSearchBasic.
     * 
     * @param amorType
     */
    public void setAmorType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorType) {
        this.amorType = amorType;
    }


    /**
     * Gets the amount value for this RevRecScheduleSearchBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RevRecScheduleSearchBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this RevRecScheduleSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this RevRecScheduleSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the deferredAmount value for this RevRecScheduleSearchBasic.
     * 
     * @return deferredAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDeferredAmount() {
        return deferredAmount;
    }


    /**
     * Sets the deferredAmount value for this RevRecScheduleSearchBasic.
     * 
     * @param deferredAmount
     */
    public void setDeferredAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField deferredAmount) {
        this.deferredAmount = deferredAmount;
    }


    /**
     * Gets the destAcct value for this RevRecScheduleSearchBasic.
     * 
     * @return destAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDestAcct() {
        return destAcct;
    }


    /**
     * Sets the destAcct value for this RevRecScheduleSearchBasic.
     * 
     * @param destAcct
     */
    public void setDestAcct(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField destAcct) {
        this.destAcct = destAcct;
    }


    /**
     * Gets the externalId value for this RevRecScheduleSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this RevRecScheduleSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this RevRecScheduleSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this RevRecScheduleSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the initialAmt value for this RevRecScheduleSearchBasic.
     * 
     * @return initialAmt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getInitialAmt() {
        return initialAmt;
    }


    /**
     * Sets the initialAmt value for this RevRecScheduleSearchBasic.
     * 
     * @param initialAmt
     */
    public void setInitialAmt(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField initialAmt) {
        this.initialAmt = initialAmt;
    }


    /**
     * Gets the internalId value for this RevRecScheduleSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this RevRecScheduleSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this RevRecScheduleSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this RevRecScheduleSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isRecognized value for this RevRecScheduleSearchBasic.
     * 
     * @return isRecognized
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsRecognized() {
        return isRecognized;
    }


    /**
     * Sets the isRecognized value for this RevRecScheduleSearchBasic.
     * 
     * @param isRecognized
     */
    public void setIsRecognized(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isRecognized) {
        this.isRecognized = isRecognized;
    }


    /**
     * Gets the jeDoc value for this RevRecScheduleSearchBasic.
     * 
     * @return jeDoc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getJeDoc() {
        return jeDoc;
    }


    /**
     * Sets the jeDoc value for this RevRecScheduleSearchBasic.
     * 
     * @param jeDoc
     */
    public void setJeDoc(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField jeDoc) {
        this.jeDoc = jeDoc;
    }


    /**
     * Gets the name value for this RevRecScheduleSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this RevRecScheduleSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the pctComplete value for this RevRecScheduleSearchBasic.
     * 
     * @return pctComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPctComplete() {
        return pctComplete;
    }


    /**
     * Sets the pctComplete value for this RevRecScheduleSearchBasic.
     * 
     * @param pctComplete
     */
    public void setPctComplete(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField pctComplete) {
        this.pctComplete = pctComplete;
    }


    /**
     * Gets the pctRecognition value for this RevRecScheduleSearchBasic.
     * 
     * @return pctRecognition
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPctRecognition() {
        return pctRecognition;
    }


    /**
     * Sets the pctRecognition value for this RevRecScheduleSearchBasic.
     * 
     * @param pctRecognition
     */
    public void setPctRecognition(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField pctRecognition) {
        this.pctRecognition = pctRecognition;
    }


    /**
     * Gets the periodOffset value for this RevRecScheduleSearchBasic.
     * 
     * @return periodOffset
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPeriodOffset() {
        return periodOffset;
    }


    /**
     * Sets the periodOffset value for this RevRecScheduleSearchBasic.
     * 
     * @param periodOffset
     */
    public void setPeriodOffset(com.netsuite.webservices.platform.core_2019_1.SearchLongField periodOffset) {
        this.periodOffset = periodOffset;
    }


    /**
     * Gets the postPeriod value for this RevRecScheduleSearchBasic.
     * 
     * @return postPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPostPeriod() {
        return postPeriod;
    }


    /**
     * Sets the postPeriod value for this RevRecScheduleSearchBasic.
     * 
     * @param postPeriod
     */
    public void setPostPeriod(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField postPeriod) {
        this.postPeriod = postPeriod;
    }


    /**
     * Gets the schedDate value for this RevRecScheduleSearchBasic.
     * 
     * @return schedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getSchedDate() {
        return schedDate;
    }


    /**
     * Sets the schedDate value for this RevRecScheduleSearchBasic.
     * 
     * @param schedDate
     */
    public void setSchedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField schedDate) {
        this.schedDate = schedDate;
    }


    /**
     * Gets the scheduleNumber value for this RevRecScheduleSearchBasic.
     * 
     * @return scheduleNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getScheduleNumber() {
        return scheduleNumber;
    }


    /**
     * Sets the scheduleNumber value for this RevRecScheduleSearchBasic.
     * 
     * @param scheduleNumber
     */
    public void setScheduleNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }


    /**
     * Gets the scheduleNumberText value for this RevRecScheduleSearchBasic.
     * 
     * @return scheduleNumberText
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getScheduleNumberText() {
        return scheduleNumberText;
    }


    /**
     * Sets the scheduleNumberText value for this RevRecScheduleSearchBasic.
     * 
     * @param scheduleNumberText
     */
    public void setScheduleNumberText(com.netsuite.webservices.platform.core_2019_1.SearchStringField scheduleNumberText) {
        this.scheduleNumberText = scheduleNumberText;
    }


    /**
     * Gets the sourceAcct value for this RevRecScheduleSearchBasic.
     * 
     * @return sourceAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSourceAcct() {
        return sourceAcct;
    }


    /**
     * Sets the sourceAcct value for this RevRecScheduleSearchBasic.
     * 
     * @param sourceAcct
     */
    public void setSourceAcct(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField sourceAcct) {
        this.sourceAcct = sourceAcct;
    }


    /**
     * Gets the srcTranPostPeriod value for this RevRecScheduleSearchBasic.
     * 
     * @return srcTranPostPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSrcTranPostPeriod() {
        return srcTranPostPeriod;
    }


    /**
     * Sets the srcTranPostPeriod value for this RevRecScheduleSearchBasic.
     * 
     * @param srcTranPostPeriod
     */
    public void setSrcTranPostPeriod(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField srcTranPostPeriod) {
        this.srcTranPostPeriod = srcTranPostPeriod;
    }


    /**
     * Gets the srcTranType value for this RevRecScheduleSearchBasic.
     * 
     * @return srcTranType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSrcTranType() {
        return srcTranType;
    }


    /**
     * Sets the srcTranType value for this RevRecScheduleSearchBasic.
     * 
     * @param srcTranType
     */
    public void setSrcTranType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField srcTranType) {
        this.srcTranType = srcTranType;
    }


    /**
     * Gets the startOffset value for this RevRecScheduleSearchBasic.
     * 
     * @return startOffset
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getStartOffset() {
        return startOffset;
    }


    /**
     * Sets the startOffset value for this RevRecScheduleSearchBasic.
     * 
     * @param startOffset
     */
    public void setStartOffset(com.netsuite.webservices.platform.core_2019_1.SearchLongField startOffset) {
        this.startOffset = startOffset;
    }


    /**
     * Gets the templateName value for this RevRecScheduleSearchBasic.
     * 
     * @return templateName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTemplateName() {
        return templateName;
    }


    /**
     * Sets the templateName value for this RevRecScheduleSearchBasic.
     * 
     * @param templateName
     */
    public void setTemplateName(com.netsuite.webservices.platform.core_2019_1.SearchStringField templateName) {
        this.templateName = templateName;
    }


    /**
     * Gets the useForeignAmounts value for this RevRecScheduleSearchBasic.
     * 
     * @return useForeignAmounts
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUseForeignAmounts() {
        return useForeignAmounts;
    }


    /**
     * Sets the useForeignAmounts value for this RevRecScheduleSearchBasic.
     * 
     * @param useForeignAmounts
     */
    public void setUseForeignAmounts(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useForeignAmounts) {
        this.useForeignAmounts = useForeignAmounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevRecScheduleSearchBasic)) return false;
        RevRecScheduleSearchBasic other = (RevRecScheduleSearchBasic) obj;
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
            ((this.amorStatus==null && other.getAmorStatus()==null) || 
             (this.amorStatus!=null &&
              this.amorStatus.equals(other.getAmorStatus()))) &&
            ((this.amortizedAmount==null && other.getAmortizedAmount()==null) || 
             (this.amortizedAmount!=null &&
              this.amortizedAmount.equals(other.getAmortizedAmount()))) &&
            ((this.amorType==null && other.getAmorType()==null) || 
             (this.amorType!=null &&
              this.amorType.equals(other.getAmorType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.deferredAmount==null && other.getDeferredAmount()==null) || 
             (this.deferredAmount!=null &&
              this.deferredAmount.equals(other.getDeferredAmount()))) &&
            ((this.destAcct==null && other.getDestAcct()==null) || 
             (this.destAcct!=null &&
              this.destAcct.equals(other.getDestAcct()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.initialAmt==null && other.getInitialAmt()==null) || 
             (this.initialAmt!=null &&
              this.initialAmt.equals(other.getInitialAmt()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isRecognized==null && other.getIsRecognized()==null) || 
             (this.isRecognized!=null &&
              this.isRecognized.equals(other.getIsRecognized()))) &&
            ((this.jeDoc==null && other.getJeDoc()==null) || 
             (this.jeDoc!=null &&
              this.jeDoc.equals(other.getJeDoc()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.pctComplete==null && other.getPctComplete()==null) || 
             (this.pctComplete!=null &&
              this.pctComplete.equals(other.getPctComplete()))) &&
            ((this.pctRecognition==null && other.getPctRecognition()==null) || 
             (this.pctRecognition!=null &&
              this.pctRecognition.equals(other.getPctRecognition()))) &&
            ((this.periodOffset==null && other.getPeriodOffset()==null) || 
             (this.periodOffset!=null &&
              this.periodOffset.equals(other.getPeriodOffset()))) &&
            ((this.postPeriod==null && other.getPostPeriod()==null) || 
             (this.postPeriod!=null &&
              this.postPeriod.equals(other.getPostPeriod()))) &&
            ((this.schedDate==null && other.getSchedDate()==null) || 
             (this.schedDate!=null &&
              this.schedDate.equals(other.getSchedDate()))) &&
            ((this.scheduleNumber==null && other.getScheduleNumber()==null) || 
             (this.scheduleNumber!=null &&
              this.scheduleNumber.equals(other.getScheduleNumber()))) &&
            ((this.scheduleNumberText==null && other.getScheduleNumberText()==null) || 
             (this.scheduleNumberText!=null &&
              this.scheduleNumberText.equals(other.getScheduleNumberText()))) &&
            ((this.sourceAcct==null && other.getSourceAcct()==null) || 
             (this.sourceAcct!=null &&
              this.sourceAcct.equals(other.getSourceAcct()))) &&
            ((this.srcTranPostPeriod==null && other.getSrcTranPostPeriod()==null) || 
             (this.srcTranPostPeriod!=null &&
              this.srcTranPostPeriod.equals(other.getSrcTranPostPeriod()))) &&
            ((this.srcTranType==null && other.getSrcTranType()==null) || 
             (this.srcTranType!=null &&
              this.srcTranType.equals(other.getSrcTranType()))) &&
            ((this.startOffset==null && other.getStartOffset()==null) || 
             (this.startOffset!=null &&
              this.startOffset.equals(other.getStartOffset()))) &&
            ((this.templateName==null && other.getTemplateName()==null) || 
             (this.templateName!=null &&
              this.templateName.equals(other.getTemplateName()))) &&
            ((this.useForeignAmounts==null && other.getUseForeignAmounts()==null) || 
             (this.useForeignAmounts!=null &&
              this.useForeignAmounts.equals(other.getUseForeignAmounts())));
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
        if (getAmorStatus() != null) {
            _hashCode += getAmorStatus().hashCode();
        }
        if (getAmortizedAmount() != null) {
            _hashCode += getAmortizedAmount().hashCode();
        }
        if (getAmorType() != null) {
            _hashCode += getAmorType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDeferredAmount() != null) {
            _hashCode += getDeferredAmount().hashCode();
        }
        if (getDestAcct() != null) {
            _hashCode += getDestAcct().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInitialAmt() != null) {
            _hashCode += getInitialAmt().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsRecognized() != null) {
            _hashCode += getIsRecognized().hashCode();
        }
        if (getJeDoc() != null) {
            _hashCode += getJeDoc().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPctComplete() != null) {
            _hashCode += getPctComplete().hashCode();
        }
        if (getPctRecognition() != null) {
            _hashCode += getPctRecognition().hashCode();
        }
        if (getPeriodOffset() != null) {
            _hashCode += getPeriodOffset().hashCode();
        }
        if (getPostPeriod() != null) {
            _hashCode += getPostPeriod().hashCode();
        }
        if (getSchedDate() != null) {
            _hashCode += getSchedDate().hashCode();
        }
        if (getScheduleNumber() != null) {
            _hashCode += getScheduleNumber().hashCode();
        }
        if (getScheduleNumberText() != null) {
            _hashCode += getScheduleNumberText().hashCode();
        }
        if (getSourceAcct() != null) {
            _hashCode += getSourceAcct().hashCode();
        }
        if (getSrcTranPostPeriod() != null) {
            _hashCode += getSrcTranPostPeriod().hashCode();
        }
        if (getSrcTranType() != null) {
            _hashCode += getSrcTranType().hashCode();
        }
        if (getStartOffset() != null) {
            _hashCode += getStartOffset().hashCode();
        }
        if (getTemplateName() != null) {
            _hashCode += getTemplateName().hashCode();
        }
        if (getUseForeignAmounts() != null) {
            _hashCode += getUseForeignAmounts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RevRecScheduleSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RevRecScheduleSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amortizedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
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
        elemField.setFieldName("deferredAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferredAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "destAcct"));
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
        elemField.setFieldName("initialAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "initialAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("isRecognized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isRecognized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jeDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jeDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("pctComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pctComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctRecognition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pctRecognition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "schedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleNumberText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleNumberText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sourceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcTranPostPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "srcTranPostPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcTranType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "srcTranType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "templateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useForeignAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useForeignAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
