/**
 * PaymentCardToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class PaymentCardToken  extends com.netsuite.webservices.platform.core_2024_2.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.RecordRef entity;

    private java.lang.String mask;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef paymentMethod;

    private java.lang.String memo;

    private com.netsuite.webservices.lists.accounting_2024_2.types.PaymentInstrumentState state;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean preserveOnFile;

    private java.lang.Boolean isDefault;

    private java.lang.String token;

    private java.util.Calendar tokenExpirationDate;

    private com.netsuite.webservices.lists.accounting_2024_2.types.TokenFamily tokenFamily;

    private java.lang.String tokenNamespace;

    private java.lang.String cardIssuerIdNumber;

    private com.netsuite.webservices.lists.accounting_2024_2.types.PaymentCardBrand cardBrand;

    private com.netsuite.webservices.lists.accounting_2024_2.types.PaymentCardType cardType;

    private java.lang.String cardNameOnCard;

    private java.lang.String cardLastFourDigits;

    private java.util.Calendar cardExpirationDate;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public PaymentCardToken() {
    }

    public PaymentCardToken(
           com.netsuite.webservices.platform.core_2024_2.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2024_2.RecordRef entity,
           java.lang.String mask,
           com.netsuite.webservices.platform.core_2024_2.RecordRef paymentMethod,
           java.lang.String memo,
           com.netsuite.webservices.lists.accounting_2024_2.types.PaymentInstrumentState state,
           java.lang.Boolean isInactive,
           java.lang.Boolean preserveOnFile,
           java.lang.Boolean isDefault,
           java.lang.String token,
           java.util.Calendar tokenExpirationDate,
           com.netsuite.webservices.lists.accounting_2024_2.types.TokenFamily tokenFamily,
           java.lang.String tokenNamespace,
           java.lang.String cardIssuerIdNumber,
           com.netsuite.webservices.lists.accounting_2024_2.types.PaymentCardBrand cardBrand,
           com.netsuite.webservices.lists.accounting_2024_2.types.PaymentCardType cardType,
           java.lang.String cardNameOnCard,
           java.lang.String cardLastFourDigits,
           java.util.Calendar cardExpirationDate) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.entity = entity;
        this.mask = mask;
        this.paymentMethod = paymentMethod;
        this.memo = memo;
        this.state = state;
        this.isInactive = isInactive;
        this.preserveOnFile = preserveOnFile;
        this.isDefault = isDefault;
        this.token = token;
        this.tokenExpirationDate = tokenExpirationDate;
        this.tokenFamily = tokenFamily;
        this.tokenNamespace = tokenNamespace;
        this.cardIssuerIdNumber = cardIssuerIdNumber;
        this.cardBrand = cardBrand;
        this.cardType = cardType;
        this.cardNameOnCard = cardNameOnCard;
        this.cardLastFourDigits = cardLastFourDigits;
        this.cardExpirationDate = cardExpirationDate;
    }


    /**
     * Gets the entity value for this PaymentCardToken.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this PaymentCardToken.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2024_2.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the mask value for this PaymentCardToken.
     * 
     * @return mask
     */
    public java.lang.String getMask() {
        return mask;
    }


    /**
     * Sets the mask value for this PaymentCardToken.
     * 
     * @param mask
     */
    public void setMask(java.lang.String mask) {
        this.mask = mask;
    }


    /**
     * Gets the paymentMethod value for this PaymentCardToken.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this PaymentCardToken.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2024_2.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the memo value for this PaymentCardToken.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PaymentCardToken.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the state value for this PaymentCardToken.
     * 
     * @return state
     */
    public com.netsuite.webservices.lists.accounting_2024_2.types.PaymentInstrumentState getState() {
        return state;
    }


    /**
     * Sets the state value for this PaymentCardToken.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.lists.accounting_2024_2.types.PaymentInstrumentState state) {
        this.state = state;
    }


    /**
     * Gets the isInactive value for this PaymentCardToken.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PaymentCardToken.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the preserveOnFile value for this PaymentCardToken.
     * 
     * @return preserveOnFile
     */
    public java.lang.Boolean getPreserveOnFile() {
        return preserveOnFile;
    }


    /**
     * Sets the preserveOnFile value for this PaymentCardToken.
     * 
     * @param preserveOnFile
     */
    public void setPreserveOnFile(java.lang.Boolean preserveOnFile) {
        this.preserveOnFile = preserveOnFile;
    }


    /**
     * Gets the isDefault value for this PaymentCardToken.
     * 
     * @return isDefault
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this PaymentCardToken.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the token value for this PaymentCardToken.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this PaymentCardToken.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the tokenExpirationDate value for this PaymentCardToken.
     * 
     * @return tokenExpirationDate
     */
    public java.util.Calendar getTokenExpirationDate() {
        return tokenExpirationDate;
    }


    /**
     * Sets the tokenExpirationDate value for this PaymentCardToken.
     * 
     * @param tokenExpirationDate
     */
    public void setTokenExpirationDate(java.util.Calendar tokenExpirationDate) {
        this.tokenExpirationDate = tokenExpirationDate;
    }


    /**
     * Gets the tokenFamily value for this PaymentCardToken.
     * 
     * @return tokenFamily
     */
    public com.netsuite.webservices.lists.accounting_2024_2.types.TokenFamily getTokenFamily() {
        return tokenFamily;
    }


    /**
     * Sets the tokenFamily value for this PaymentCardToken.
     * 
     * @param tokenFamily
     */
    public void setTokenFamily(com.netsuite.webservices.lists.accounting_2024_2.types.TokenFamily tokenFamily) {
        this.tokenFamily = tokenFamily;
    }


    /**
     * Gets the tokenNamespace value for this PaymentCardToken.
     * 
     * @return tokenNamespace
     */
    public java.lang.String getTokenNamespace() {
        return tokenNamespace;
    }


    /**
     * Sets the tokenNamespace value for this PaymentCardToken.
     * 
     * @param tokenNamespace
     */
    public void setTokenNamespace(java.lang.String tokenNamespace) {
        this.tokenNamespace = tokenNamespace;
    }


    /**
     * Gets the cardIssuerIdNumber value for this PaymentCardToken.
     * 
     * @return cardIssuerIdNumber
     */
    public java.lang.String getCardIssuerIdNumber() {
        return cardIssuerIdNumber;
    }


    /**
     * Sets the cardIssuerIdNumber value for this PaymentCardToken.
     * 
     * @param cardIssuerIdNumber
     */
    public void setCardIssuerIdNumber(java.lang.String cardIssuerIdNumber) {
        this.cardIssuerIdNumber = cardIssuerIdNumber;
    }


    /**
     * Gets the cardBrand value for this PaymentCardToken.
     * 
     * @return cardBrand
     */
    public com.netsuite.webservices.lists.accounting_2024_2.types.PaymentCardBrand getCardBrand() {
        return cardBrand;
    }


    /**
     * Sets the cardBrand value for this PaymentCardToken.
     * 
     * @param cardBrand
     */
    public void setCardBrand(com.netsuite.webservices.lists.accounting_2024_2.types.PaymentCardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }


    /**
     * Gets the cardType value for this PaymentCardToken.
     * 
     * @return cardType
     */
    public com.netsuite.webservices.lists.accounting_2024_2.types.PaymentCardType getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this PaymentCardToken.
     * 
     * @param cardType
     */
    public void setCardType(com.netsuite.webservices.lists.accounting_2024_2.types.PaymentCardType cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the cardNameOnCard value for this PaymentCardToken.
     * 
     * @return cardNameOnCard
     */
    public java.lang.String getCardNameOnCard() {
        return cardNameOnCard;
    }


    /**
     * Sets the cardNameOnCard value for this PaymentCardToken.
     * 
     * @param cardNameOnCard
     */
    public void setCardNameOnCard(java.lang.String cardNameOnCard) {
        this.cardNameOnCard = cardNameOnCard;
    }


    /**
     * Gets the cardLastFourDigits value for this PaymentCardToken.
     * 
     * @return cardLastFourDigits
     */
    public java.lang.String getCardLastFourDigits() {
        return cardLastFourDigits;
    }


    /**
     * Sets the cardLastFourDigits value for this PaymentCardToken.
     * 
     * @param cardLastFourDigits
     */
    public void setCardLastFourDigits(java.lang.String cardLastFourDigits) {
        this.cardLastFourDigits = cardLastFourDigits;
    }


    /**
     * Gets the cardExpirationDate value for this PaymentCardToken.
     * 
     * @return cardExpirationDate
     */
    public java.util.Calendar getCardExpirationDate() {
        return cardExpirationDate;
    }


    /**
     * Sets the cardExpirationDate value for this PaymentCardToken.
     * 
     * @param cardExpirationDate
     */
    public void setCardExpirationDate(java.util.Calendar cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }


    /**
     * Gets the internalId value for this PaymentCardToken.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaymentCardToken.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this PaymentCardToken.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PaymentCardToken.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentCardToken)) return false;
        PaymentCardToken other = (PaymentCardToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.tokenExpirationDate==null && other.getTokenExpirationDate()==null) || 
             (this.tokenExpirationDate!=null &&
              this.tokenExpirationDate.equals(other.getTokenExpirationDate()))) &&
            ((this.tokenFamily==null && other.getTokenFamily()==null) || 
             (this.tokenFamily!=null &&
              this.tokenFamily.equals(other.getTokenFamily()))) &&
            ((this.tokenNamespace==null && other.getTokenNamespace()==null) || 
             (this.tokenNamespace!=null &&
              this.tokenNamespace.equals(other.getTokenNamespace()))) &&
            ((this.cardIssuerIdNumber==null && other.getCardIssuerIdNumber()==null) || 
             (this.cardIssuerIdNumber!=null &&
              this.cardIssuerIdNumber.equals(other.getCardIssuerIdNumber()))) &&
            ((this.cardBrand==null && other.getCardBrand()==null) || 
             (this.cardBrand!=null &&
              this.cardBrand.equals(other.getCardBrand()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.cardNameOnCard==null && other.getCardNameOnCard()==null) || 
             (this.cardNameOnCard!=null &&
              this.cardNameOnCard.equals(other.getCardNameOnCard()))) &&
            ((this.cardLastFourDigits==null && other.getCardLastFourDigits()==null) || 
             (this.cardLastFourDigits!=null &&
              this.cardLastFourDigits.equals(other.getCardLastFourDigits()))) &&
            ((this.cardExpirationDate==null && other.getCardExpirationDate()==null) || 
             (this.cardExpirationDate!=null &&
              this.cardExpirationDate.equals(other.getCardExpirationDate()))) &&
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getTokenExpirationDate() != null) {
            _hashCode += getTokenExpirationDate().hashCode();
        }
        if (getTokenFamily() != null) {
            _hashCode += getTokenFamily().hashCode();
        }
        if (getTokenNamespace() != null) {
            _hashCode += getTokenNamespace().hashCode();
        }
        if (getCardIssuerIdNumber() != null) {
            _hashCode += getCardIssuerIdNumber().hashCode();
        }
        if (getCardBrand() != null) {
            _hashCode += getCardBrand().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCardNameOnCard() != null) {
            _hashCode += getCardNameOnCard().hashCode();
        }
        if (getCardLastFourDigits() != null) {
            _hashCode += getCardLastFourDigits().hashCode();
        }
        if (getCardExpirationDate() != null) {
            _hashCode += getCardExpirationDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(PaymentCardToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "PaymentCardToken"));
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
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2024_2.lists.webservices.netsuite.com", "PaymentInstrumentState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveOnFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "preserveOnFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "tokenExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "tokenFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2024_2.lists.webservices.netsuite.com", "TokenFamily"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "tokenNamespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardIssuerIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "cardIssuerIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "cardBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2024_2.lists.webservices.netsuite.com", "PaymentCardBrand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2024_2.lists.webservices.netsuite.com", "PaymentCardType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNameOnCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "cardNameOnCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardLastFourDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "cardLastFourDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "cardExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
