/**
 * CurrencyRateSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class CurrencyRateSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] baseCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] effectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] exchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] transactionCurrency;

    public CurrencyRateSearchRowBasic() {
    }

    public CurrencyRateSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] baseCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] effectiveDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] exchangeRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] transactionCurrency) {
        this.baseCurrency = baseCurrency;
        this.effectiveDate = effectiveDate;
        this.exchangeRate = exchangeRate;
        this.internalId = internalId;
        this.transactionCurrency = transactionCurrency;
    }


    /**
     * Gets the baseCurrency value for this CurrencyRateSearchRowBasic.
     * 
     * @return baseCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBaseCurrency() {
        return baseCurrency;
    }


    /**
     * Sets the baseCurrency value for this CurrencyRateSearchRowBasic.
     * 
     * @param baseCurrency
     */
    public void setBaseCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBaseCurrency(int i) {
        return this.baseCurrency[i];
    }

    public void setBaseCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.baseCurrency[i] = _value;
    }


    /**
     * Gets the effectiveDate value for this CurrencyRateSearchRowBasic.
     * 
     * @return effectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this CurrencyRateSearchRowBasic.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEffectiveDate(int i) {
        return this.effectiveDate[i];
    }

    public void setEffectiveDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.effectiveDate[i] = _value;
    }


    /**
     * Gets the exchangeRate value for this CurrencyRateSearchRowBasic.
     * 
     * @return exchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this CurrencyRateSearchRowBasic.
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
     * Gets the internalId value for this CurrencyRateSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CurrencyRateSearchRowBasic.
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
     * Gets the transactionCurrency value for this CurrencyRateSearchRowBasic.
     * 
     * @return transactionCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTransactionCurrency() {
        return transactionCurrency;
    }


    /**
     * Sets the transactionCurrency value for this CurrencyRateSearchRowBasic.
     * 
     * @param transactionCurrency
     */
    public void setTransactionCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTransactionCurrency(int i) {
        return this.transactionCurrency[i];
    }

    public void setTransactionCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.transactionCurrency[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyRateSearchRowBasic)) return false;
        CurrencyRateSearchRowBasic other = (CurrencyRateSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.baseCurrency, other.getBaseCurrency()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              java.util.Arrays.equals(this.effectiveDate, other.getEffectiveDate()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              java.util.Arrays.equals(this.exchangeRate, other.getExchangeRate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.transactionCurrency==null && other.getTransactionCurrency()==null) || 
             (this.transactionCurrency!=null &&
              java.util.Arrays.equals(this.transactionCurrency, other.getTransactionCurrency())));
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
        if (getEffectiveDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveDate(), i);
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
        if (getTransactionCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionCurrency(), i);
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
        new org.apache.axis.description.TypeDesc(CurrencyRateSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CurrencyRateSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transactionCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
