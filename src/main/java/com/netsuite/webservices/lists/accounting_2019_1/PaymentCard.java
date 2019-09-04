/**
 * PaymentCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class PaymentCard  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String lastFourDigits;

    private java.lang.String issuerIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private java.lang.String mask;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod;

    private java.lang.String memo;

    private com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentState state;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean preserveOnFile;

    private java.lang.Boolean isDefault;

    private java.lang.String cardNumber;

    private java.util.Calendar expirationDate;

    private com.netsuite.webservices.lists.accounting_2019_1.types.PaymentCardBrand cardBrand;

    private com.netsuite.webservices.lists.accounting_2019_1.types.PaymentCardType cardType;

    private java.lang.String nameOnCard;

    private java.lang.String street;

    private java.lang.String zipCode;

    private java.util.Calendar validFromDate;

    private java.lang.String issueNumber;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public PaymentCard() {
    }

    public PaymentCard(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String lastFourDigits,
           java.lang.String issuerIdNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           java.lang.String mask,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod,
           java.lang.String memo,
           com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentState state,
           java.lang.Boolean isInactive,
           java.lang.Boolean preserveOnFile,
           java.lang.Boolean isDefault,
           java.lang.String cardNumber,
           java.util.Calendar expirationDate,
           com.netsuite.webservices.lists.accounting_2019_1.types.PaymentCardBrand cardBrand,
           com.netsuite.webservices.lists.accounting_2019_1.types.PaymentCardType cardType,
           java.lang.String nameOnCard,
           java.lang.String street,
           java.lang.String zipCode,
           java.util.Calendar validFromDate,
           java.lang.String issueNumber) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.lastFourDigits = lastFourDigits;
        this.issuerIdNumber = issuerIdNumber;
        this.entity = entity;
        this.mask = mask;
        this.paymentMethod = paymentMethod;
        this.memo = memo;
        this.state = state;
        this.isInactive = isInactive;
        this.preserveOnFile = preserveOnFile;
        this.isDefault = isDefault;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cardBrand = cardBrand;
        this.cardType = cardType;
        this.nameOnCard = nameOnCard;
        this.street = street;
        this.zipCode = zipCode;
        this.validFromDate = validFromDate;
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the lastFourDigits value for this PaymentCard.
     * 
     * @return lastFourDigits
     */
    public java.lang.String getLastFourDigits() {
        return lastFourDigits;
    }


    /**
     * Sets the lastFourDigits value for this PaymentCard.
     * 
     * @param lastFourDigits
     */
    public void setLastFourDigits(java.lang.String lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }


    /**
     * Gets the issuerIdNumber value for this PaymentCard.
     * 
     * @return issuerIdNumber
     */
    public java.lang.String getIssuerIdNumber() {
        return issuerIdNumber;
    }


    /**
     * Sets the issuerIdNumber value for this PaymentCard.
     * 
     * @param issuerIdNumber
     */
    public void setIssuerIdNumber(java.lang.String issuerIdNumber) {
        this.issuerIdNumber = issuerIdNumber;
    }


    /**
     * Gets the entity value for this PaymentCard.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this PaymentCard.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the mask value for this PaymentCard.
     * 
     * @return mask
     */
    public java.lang.String getMask() {
        return mask;
    }


    /**
     * Sets the mask value for this PaymentCard.
     * 
     * @param mask
     */
    public void setMask(java.lang.String mask) {
        this.mask = mask;
    }


    /**
     * Gets the paymentMethod value for this PaymentCard.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this PaymentCard.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the memo value for this PaymentCard.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PaymentCard.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the state value for this PaymentCard.
     * 
     * @return state
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentState getState() {
        return state;
    }


    /**
     * Sets the state value for this PaymentCard.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentState state) {
        this.state = state;
    }


    /**
     * Gets the isInactive value for this PaymentCard.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PaymentCard.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the preserveOnFile value for this PaymentCard.
     * 
     * @return preserveOnFile
     */
    public java.lang.Boolean getPreserveOnFile() {
        return preserveOnFile;
    }


    /**
     * Sets the preserveOnFile value for this PaymentCard.
     * 
     * @param preserveOnFile
     */
    public void setPreserveOnFile(java.lang.Boolean preserveOnFile) {
        this.preserveOnFile = preserveOnFile;
    }


    /**
     * Gets the isDefault value for this PaymentCard.
     * 
     * @return isDefault
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this PaymentCard.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the cardNumber value for this PaymentCard.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this PaymentCard.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the expirationDate value for this PaymentCard.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this PaymentCard.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the cardBrand value for this PaymentCard.
     * 
     * @return cardBrand
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.PaymentCardBrand getCardBrand() {
        return cardBrand;
    }


    /**
     * Sets the cardBrand value for this PaymentCard.
     * 
     * @param cardBrand
     */
    public void setCardBrand(com.netsuite.webservices.lists.accounting_2019_1.types.PaymentCardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }


    /**
     * Gets the cardType value for this PaymentCard.
     * 
     * @return cardType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.PaymentCardType getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this PaymentCard.
     * 
     * @param cardType
     */
    public void setCardType(com.netsuite.webservices.lists.accounting_2019_1.types.PaymentCardType cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the nameOnCard value for this PaymentCard.
     * 
     * @return nameOnCard
     */
    public java.lang.String getNameOnCard() {
        return nameOnCard;
    }


    /**
     * Sets the nameOnCard value for this PaymentCard.
     * 
     * @param nameOnCard
     */
    public void setNameOnCard(java.lang.String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }


    /**
     * Gets the street value for this PaymentCard.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this PaymentCard.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the zipCode value for this PaymentCard.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this PaymentCard.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the validFromDate value for this PaymentCard.
     * 
     * @return validFromDate
     */
    public java.util.Calendar getValidFromDate() {
        return validFromDate;
    }


    /**
     * Sets the validFromDate value for this PaymentCard.
     * 
     * @param validFromDate
     */
    public void setValidFromDate(java.util.Calendar validFromDate) {
        this.validFromDate = validFromDate;
    }


    /**
     * Gets the issueNumber value for this PaymentCard.
     * 
     * @return issueNumber
     */
    public java.lang.String getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this PaymentCard.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(java.lang.String issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the internalId value for this PaymentCard.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaymentCard.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this PaymentCard.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PaymentCard.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentCard)) return false;
        PaymentCard other = (PaymentCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lastFourDigits==null && other.getLastFourDigits()==null) || 
             (this.lastFourDigits!=null &&
              this.lastFourDigits.equals(other.getLastFourDigits()))) &&
            ((this.issuerIdNumber==null && other.getIssuerIdNumber()==null) || 
             (this.issuerIdNumber!=null &&
              this.issuerIdNumber.equals(other.getIssuerIdNumber()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.mask==null && other.getMask()==null) || 
             (this.mask!=null &&
              this.mask.equals(other.getMask()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.preserveOnFile==null && other.getPreserveOnFile()==null) || 
             (this.preserveOnFile!=null &&
              this.preserveOnFile.equals(other.getPreserveOnFile()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.cardBrand==null && other.getCardBrand()==null) || 
             (this.cardBrand!=null &&
              this.cardBrand.equals(other.getCardBrand()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.nameOnCard==null && other.getNameOnCard()==null) || 
             (this.nameOnCard!=null &&
              this.nameOnCard.equals(other.getNameOnCard()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.validFromDate==null && other.getValidFromDate()==null) || 
             (this.validFromDate!=null &&
              this.validFromDate.equals(other.getValidFromDate()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber()))) &&
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
        if (getLastFourDigits() != null) {
            _hashCode += getLastFourDigits().hashCode();
        }
        if (getIssuerIdNumber() != null) {
            _hashCode += getIssuerIdNumber().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getMask() != null) {
            _hashCode += getMask().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getPreserveOnFile() != null) {
            _hashCode += getPreserveOnFile().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getCardBrand() != null) {
            _hashCode += getCardBrand().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getNameOnCard() != null) {
            _hashCode += getNameOnCard().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getValidFromDate() != null) {
            _hashCode += getValidFromDate().hashCode();
        }
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
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
        new org.apache.axis.description.TypeDesc(PaymentCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "PaymentCard"));
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
        elemField.setFieldName("lastFourDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "lastFourDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "issuerIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "PaymentInstrumentState"));
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
        elemField.setFieldName("preserveOnFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "preserveOnFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "cardBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "PaymentCardBrand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "PaymentCardType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameOnCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nameOnCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "validFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
