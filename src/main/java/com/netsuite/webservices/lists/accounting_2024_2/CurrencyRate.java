/**
 * CurrencyRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class CurrencyRate  extends com.netsuite.webservices.platform.core_2024_2.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.RecordRef baseCurrency;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef transactionCurrency;

    private java.lang.Double exchangeRate;

    private java.util.Calendar effectiveDate;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef currencyRateType;

    private java.lang.String internalId;  // attribute

    public CurrencyRate() {
    }

    public CurrencyRate(
           com.netsuite.webservices.platform.core_2024_2.NullField nullFieldList,
           java.lang.String internalId,
           com.netsuite.webservices.platform.core_2024_2.RecordRef baseCurrency,
           com.netsuite.webservices.platform.core_2024_2.RecordRef transactionCurrency,
           java.lang.Double exchangeRate,
           java.util.Calendar effectiveDate,
           com.netsuite.webservices.platform.core_2024_2.RecordRef currencyRateType) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.baseCurrency = baseCurrency;
        this.transactionCurrency = transactionCurrency;
        this.exchangeRate = exchangeRate;
        this.effectiveDate = effectiveDate;
        this.currencyRateType = currencyRateType;
    }


    /**
     * Gets the baseCurrency value for this CurrencyRate.
     * 
     * @return baseCurrency
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getBaseCurrency() {
        return baseCurrency;
    }


    /**
     * Sets the baseCurrency value for this CurrencyRate.
     * 
     * @param baseCurrency
     */
    public void setBaseCurrency(com.netsuite.webservices.platform.core_2024_2.RecordRef baseCurrency) {
        this.baseCurrency = baseCurrency;
    }


    /**
     * Gets the transactionCurrency value for this CurrencyRate.
     * 
     * @return transactionCurrency
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getTransactionCurrency() {
        return transactionCurrency;
    }


    /**
     * Sets the transactionCurrency value for this CurrencyRate.
     * 
     * @param transactionCurrency
     */
    public void setTransactionCurrency(com.netsuite.webservices.platform.core_2024_2.RecordRef transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }


    /**
     * Gets the exchangeRate value for this CurrencyRate.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this CurrencyRate.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the effectiveDate value for this CurrencyRate.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this CurrencyRate.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the currencyRateType value for this CurrencyRate.
     * 
     * @return currencyRateType
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getCurrencyRateType() {
        return currencyRateType;
    }


    /**
     * Sets the currencyRateType value for this CurrencyRate.
     * 
     * @param currencyRateType
     */
    public void setCurrencyRateType(com.netsuite.webservices.platform.core_2024_2.RecordRef currencyRateType) {
        this.currencyRateType = currencyRateType;
    }


    /**
     * Gets the internalId value for this CurrencyRate.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CurrencyRate.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyRate)) return false;
        CurrencyRate other = (CurrencyRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.baseCurrency==null && other.getBaseCurrency()==null) || 
             (this.baseCurrency!=null &&
              this.baseCurrency.equals(other.getBaseCurrency()))) &&
            ((this.transactionCurrency==null && other.getTransactionCurrency()==null) || 
             (this.transactionCurrency!=null &&
              this.transactionCurrency.equals(other.getTransactionCurrency()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.currencyRateType==null && other.getCurrencyRateType()==null) || 
             (this.currencyRateType!=null &&
              this.currencyRateType.equals(other.getCurrencyRateType()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId())));
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
        if (getBaseCurrency() != null) {
            _hashCode += getBaseCurrency().hashCode();
        }
        if (getTransactionCurrency() != null) {
            _hashCode += getTransactionCurrency().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getCurrencyRateType() != null) {
            _hashCode += getCurrencyRateType().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "CurrencyRate"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "transactionCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "currencyRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
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
