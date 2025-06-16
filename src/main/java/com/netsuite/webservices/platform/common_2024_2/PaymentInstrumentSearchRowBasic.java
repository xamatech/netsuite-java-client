/**
 * PaymentInstrumentSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class PaymentInstrumentSearchRowBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardBrand;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] cardExpDate;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardLastFourDigits;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardTokenCardBrand;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] cardTokenCardExpDate;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] cardTokenExpDate;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardTokenNameOnCard;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] _default;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] entity;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] generalTokenExpirationDate;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] isInactive;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] lastFourDigits;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] mask;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] nameOnCard;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] paymentInstrumentStateType;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField[] paymentInstrumentType;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] paymentMethod;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] preserveOnFile;

    public PaymentInstrumentSearchRowBasic() {
    }

    public PaymentInstrumentSearchRowBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardBrand,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] cardExpDate,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardLastFourDigits,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardTokenCardBrand,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] cardTokenCardExpDate,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] cardTokenExpDate,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardTokenNameOnCard,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] _default,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] entity,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] generalTokenExpirationDate,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] isInactive,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] lastFourDigits,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] mask,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] nameOnCard,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] paymentInstrumentStateType,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField[] paymentInstrumentType,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] paymentMethod,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] preserveOnFile) {
        this.cardBrand = cardBrand;
        this.cardExpDate = cardExpDate;
        this.cardLastFourDigits = cardLastFourDigits;
        this.cardTokenCardBrand = cardTokenCardBrand;
        this.cardTokenCardExpDate = cardTokenCardExpDate;
        this.cardTokenExpDate = cardTokenExpDate;
        this.cardTokenNameOnCard = cardTokenNameOnCard;
        this._default = _default;
        this.entity = entity;
        this.generalTokenExpirationDate = generalTokenExpirationDate;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.lastFourDigits = lastFourDigits;
        this.mask = mask;
        this.nameOnCard = nameOnCard;
        this.paymentInstrumentStateType = paymentInstrumentStateType;
        this.paymentInstrumentType = paymentInstrumentType;
        this.paymentMethod = paymentMethod;
        this.preserveOnFile = preserveOnFile;
    }


    /**
     * Gets the cardBrand value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return cardBrand
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getCardBrand() {
        return cardBrand;
    }


    /**
     * Sets the cardBrand value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param cardBrand
     */
    public void setCardBrand(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardBrand) {
        this.cardBrand = cardBrand;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getCardBrand(int i) {
        return this.cardBrand[i];
    }

    public void setCardBrand(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.cardBrand[i] = _value;
    }


    /**
     * Gets the cardExpDate value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return cardExpDate
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] getCardExpDate() {
        return cardExpDate;
    }


    /**
     * Sets the cardExpDate value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param cardExpDate
     */
    public void setCardExpDate(com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField getCardExpDate(int i) {
        return this.cardExpDate[i];
    }

    public void setCardExpDate(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField _value) {
        this.cardExpDate[i] = _value;
    }


    /**
     * Gets the cardLastFourDigits value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return cardLastFourDigits
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getCardLastFourDigits() {
        return cardLastFourDigits;
    }


    /**
     * Sets the cardLastFourDigits value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param cardLastFourDigits
     */
    public void setCardLastFourDigits(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardLastFourDigits) {
        this.cardLastFourDigits = cardLastFourDigits;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getCardLastFourDigits(int i) {
        return this.cardLastFourDigits[i];
    }

    public void setCardLastFourDigits(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.cardLastFourDigits[i] = _value;
    }


    /**
     * Gets the cardTokenCardBrand value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return cardTokenCardBrand
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getCardTokenCardBrand() {
        return cardTokenCardBrand;
    }


    /**
     * Sets the cardTokenCardBrand value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param cardTokenCardBrand
     */
    public void setCardTokenCardBrand(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardTokenCardBrand) {
        this.cardTokenCardBrand = cardTokenCardBrand;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getCardTokenCardBrand(int i) {
        return this.cardTokenCardBrand[i];
    }

    public void setCardTokenCardBrand(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.cardTokenCardBrand[i] = _value;
    }


    /**
     * Gets the cardTokenCardExpDate value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return cardTokenCardExpDate
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] getCardTokenCardExpDate() {
        return cardTokenCardExpDate;
    }


    /**
     * Sets the cardTokenCardExpDate value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param cardTokenCardExpDate
     */
    public void setCardTokenCardExpDate(com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] cardTokenCardExpDate) {
        this.cardTokenCardExpDate = cardTokenCardExpDate;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField getCardTokenCardExpDate(int i) {
        return this.cardTokenCardExpDate[i];
    }

    public void setCardTokenCardExpDate(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField _value) {
        this.cardTokenCardExpDate[i] = _value;
    }


    /**
     * Gets the cardTokenExpDate value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return cardTokenExpDate
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] getCardTokenExpDate() {
        return cardTokenExpDate;
    }


    /**
     * Sets the cardTokenExpDate value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param cardTokenExpDate
     */
    public void setCardTokenExpDate(com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] cardTokenExpDate) {
        this.cardTokenExpDate = cardTokenExpDate;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField getCardTokenExpDate(int i) {
        return this.cardTokenExpDate[i];
    }

    public void setCardTokenExpDate(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField _value) {
        this.cardTokenExpDate[i] = _value;
    }


    /**
     * Gets the cardTokenNameOnCard value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return cardTokenNameOnCard
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getCardTokenNameOnCard() {
        return cardTokenNameOnCard;
    }


    /**
     * Sets the cardTokenNameOnCard value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param cardTokenNameOnCard
     */
    public void setCardTokenNameOnCard(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] cardTokenNameOnCard) {
        this.cardTokenNameOnCard = cardTokenNameOnCard;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getCardTokenNameOnCard(int i) {
        return this.cardTokenNameOnCard[i];
    }

    public void setCardTokenNameOnCard(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.cardTokenNameOnCard[i] = _value;
    }


    /**
     * Gets the _default value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return _default
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] get_default() {
        return _default;
    }


    /**
     * Sets the _default value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param _default
     */
    public void set_default(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] _default) {
        this._default = _default;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField get_default(int i) {
        return this._default[i];
    }

    public void set_default(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this._default[i] = _value;
    }


    /**
     * Gets the entity value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] entity) {
        this.entity = entity;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField _value) {
        this.entity[i] = _value;
    }


    /**
     * Gets the generalTokenExpirationDate value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return generalTokenExpirationDate
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] getGeneralTokenExpirationDate() {
        return generalTokenExpirationDate;
    }


    /**
     * Sets the generalTokenExpirationDate value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param generalTokenExpirationDate
     */
    public void setGeneralTokenExpirationDate(com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] generalTokenExpirationDate) {
        this.generalTokenExpirationDate = generalTokenExpirationDate;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField getGeneralTokenExpirationDate(int i) {
        return this.generalTokenExpirationDate[i];
    }

    public void setGeneralTokenExpirationDate(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField _value) {
        this.generalTokenExpirationDate[i] = _value;
    }


    /**
     * Gets the internalId value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the isInactive value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the lastFourDigits value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return lastFourDigits
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getLastFourDigits() {
        return lastFourDigits;
    }


    /**
     * Sets the lastFourDigits value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param lastFourDigits
     */
    public void setLastFourDigits(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getLastFourDigits(int i) {
        return this.lastFourDigits[i];
    }

    public void setLastFourDigits(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.lastFourDigits[i] = _value;
    }


    /**
     * Gets the mask value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return mask
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getMask() {
        return mask;
    }


    /**
     * Sets the mask value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param mask
     */
    public void setMask(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] mask) {
        this.mask = mask;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getMask(int i) {
        return this.mask[i];
    }

    public void setMask(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.mask[i] = _value;
    }


    /**
     * Gets the nameOnCard value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return nameOnCard
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getNameOnCard() {
        return nameOnCard;
    }


    /**
     * Sets the nameOnCard value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param nameOnCard
     */
    public void setNameOnCard(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getNameOnCard(int i) {
        return this.nameOnCard[i];
    }

    public void setNameOnCard(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.nameOnCard[i] = _value;
    }


    /**
     * Gets the paymentInstrumentStateType value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return paymentInstrumentStateType
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getPaymentInstrumentStateType() {
        return paymentInstrumentStateType;
    }


    /**
     * Sets the paymentInstrumentStateType value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param paymentInstrumentStateType
     */
    public void setPaymentInstrumentStateType(com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] paymentInstrumentStateType) {
        this.paymentInstrumentStateType = paymentInstrumentStateType;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField getPaymentInstrumentStateType(int i) {
        return this.paymentInstrumentStateType[i];
    }

    public void setPaymentInstrumentStateType(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField _value) {
        this.paymentInstrumentStateType[i] = _value;
    }


    /**
     * Gets the paymentInstrumentType value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return paymentInstrumentType
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField[] getPaymentInstrumentType() {
        return paymentInstrumentType;
    }


    /**
     * Sets the paymentInstrumentType value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param paymentInstrumentType
     */
    public void setPaymentInstrumentType(com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField[] paymentInstrumentType) {
        this.paymentInstrumentType = paymentInstrumentType;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField getPaymentInstrumentType(int i) {
        return this.paymentInstrumentType[i];
    }

    public void setPaymentInstrumentType(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField _value) {
        this.paymentInstrumentType[i] = _value;
    }


    /**
     * Gets the paymentMethod value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField getPaymentMethod(int i) {
        return this.paymentMethod[i];
    }

    public void setPaymentMethod(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField _value) {
        this.paymentMethod[i] = _value;
    }


    /**
     * Gets the preserveOnFile value for this PaymentInstrumentSearchRowBasic.
     * 
     * @return preserveOnFile
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getPreserveOnFile() {
        return preserveOnFile;
    }


    /**
     * Sets the preserveOnFile value for this PaymentInstrumentSearchRowBasic.
     * 
     * @param preserveOnFile
     */
    public void setPreserveOnFile(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] preserveOnFile) {
        this.preserveOnFile = preserveOnFile;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getPreserveOnFile(int i) {
        return this.preserveOnFile[i];
    }

    public void setPreserveOnFile(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.preserveOnFile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentInstrumentSearchRowBasic)) return false;
        PaymentInstrumentSearchRowBasic other = (PaymentInstrumentSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardBrand==null && other.getCardBrand()==null) || 
             (this.cardBrand!=null &&
              java.util.Arrays.equals(this.cardBrand, other.getCardBrand()))) &&
            ((this.cardExpDate==null && other.getCardExpDate()==null) || 
             (this.cardExpDate!=null &&
              java.util.Arrays.equals(this.cardExpDate, other.getCardExpDate()))) &&
            ((this.cardLastFourDigits==null && other.getCardLastFourDigits()==null) || 
             (this.cardLastFourDigits!=null &&
              java.util.Arrays.equals(this.cardLastFourDigits, other.getCardLastFourDigits()))) &&
            ((this.cardTokenCardBrand==null && other.getCardTokenCardBrand()==null) || 
             (this.cardTokenCardBrand!=null &&
              java.util.Arrays.equals(this.cardTokenCardBrand, other.getCardTokenCardBrand()))) &&
            ((this.cardTokenCardExpDate==null && other.getCardTokenCardExpDate()==null) || 
             (this.cardTokenCardExpDate!=null &&
              java.util.Arrays.equals(this.cardTokenCardExpDate, other.getCardTokenCardExpDate()))) &&
            ((this.cardTokenExpDate==null && other.getCardTokenExpDate()==null) || 
             (this.cardTokenExpDate!=null &&
              java.util.Arrays.equals(this.cardTokenExpDate, other.getCardTokenExpDate()))) &&
            ((this.cardTokenNameOnCard==null && other.getCardTokenNameOnCard()==null) || 
             (this.cardTokenNameOnCard!=null &&
              java.util.Arrays.equals(this.cardTokenNameOnCard, other.getCardTokenNameOnCard()))) &&
            ((this._default==null && other.get_default()==null) || 
             (this._default!=null &&
              java.util.Arrays.equals(this._default, other.get_default()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              java.util.Arrays.equals(this.entity, other.getEntity()))) &&
            ((this.generalTokenExpirationDate==null && other.getGeneralTokenExpirationDate()==null) || 
             (this.generalTokenExpirationDate!=null &&
              java.util.Arrays.equals(this.generalTokenExpirationDate, other.getGeneralTokenExpirationDate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.lastFourDigits==null && other.getLastFourDigits()==null) || 
             (this.lastFourDigits!=null &&
              java.util.Arrays.equals(this.lastFourDigits, other.getLastFourDigits()))) &&
            ((this.mask==null && other.getMask()==null) || 
             (this.mask!=null &&
              java.util.Arrays.equals(this.mask, other.getMask()))) &&
            ((this.nameOnCard==null && other.getNameOnCard()==null) || 
             (this.nameOnCard!=null &&
              java.util.Arrays.equals(this.nameOnCard, other.getNameOnCard()))) &&
            ((this.paymentInstrumentStateType==null && other.getPaymentInstrumentStateType()==null) || 
             (this.paymentInstrumentStateType!=null &&
              java.util.Arrays.equals(this.paymentInstrumentStateType, other.getPaymentInstrumentStateType()))) &&
            ((this.paymentInstrumentType==null && other.getPaymentInstrumentType()==null) || 
             (this.paymentInstrumentType!=null &&
              java.util.Arrays.equals(this.paymentInstrumentType, other.getPaymentInstrumentType()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              java.util.Arrays.equals(this.paymentMethod, other.getPaymentMethod()))) &&
            ((this.preserveOnFile==null && other.getPreserveOnFile()==null) || 
             (this.preserveOnFile!=null &&
              java.util.Arrays.equals(this.preserveOnFile, other.getPreserveOnFile())));
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
        if (getCardBrand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardBrand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardBrand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardExpDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardExpDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardExpDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardLastFourDigits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardLastFourDigits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardLastFourDigits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardTokenCardBrand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardTokenCardBrand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardTokenCardBrand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardTokenCardExpDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardTokenCardExpDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardTokenCardExpDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardTokenExpDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardTokenExpDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardTokenExpDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardTokenNameOnCard() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardTokenNameOnCard());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardTokenNameOnCard(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_default() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_default());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_default(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeneralTokenExpirationDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeneralTokenExpirationDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneralTokenExpirationDate(), i);
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
        if (getLastFourDigits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastFourDigits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastFourDigits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNameOnCard() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameOnCard());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameOnCard(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentInstrumentStateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentInstrumentStateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentInstrumentStateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentInstrumentType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentInstrumentType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentInstrumentType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreserveOnFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreserveOnFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreserveOnFile(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentInstrumentSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "PaymentInstrumentSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "cardBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "cardExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardLastFourDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "cardLastFourDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTokenCardBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "cardTokenCardBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTokenCardExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "cardTokenCardExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTokenExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "cardTokenExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTokenNameOnCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "cardTokenNameOnCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "default"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalTokenExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "generalTokenExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFourDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "lastFourDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameOnCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "nameOnCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstrumentStateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "paymentInstrumentStateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstrumentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "paymentInstrumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveOnFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "preserveOnFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
