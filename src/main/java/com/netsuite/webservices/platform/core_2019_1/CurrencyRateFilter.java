/**
 * CurrencyRateFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class CurrencyRateFilter  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef baseCurrency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef fromCurrency;

    private java.util.Calendar effectiveDate;

    public CurrencyRateFilter() {
    }

    public CurrencyRateFilter(
           com.netsuite.webservices.platform.core_2019_1.RecordRef baseCurrency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef fromCurrency,
           java.util.Calendar effectiveDate) {
           this.baseCurrency = baseCurrency;
           this.fromCurrency = fromCurrency;
           this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the baseCurrency value for this CurrencyRateFilter.
     * 
     * @return baseCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBaseCurrency() {
        return baseCurrency;
    }


    /**
     * Sets the baseCurrency value for this CurrencyRateFilter.
     * 
     * @param baseCurrency
     */
    public void setBaseCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef baseCurrency) {
        this.baseCurrency = baseCurrency;
    }


    /**
     * Gets the fromCurrency value for this CurrencyRateFilter.
     * 
     * @return fromCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFromCurrency() {
        return fromCurrency;
    }


    /**
     * Sets the fromCurrency value for this CurrencyRateFilter.
     * 
     * @param fromCurrency
     */
    public void setFromCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef fromCurrency) {
        this.fromCurrency = fromCurrency;
    }


    /**
     * Gets the effectiveDate value for this CurrencyRateFilter.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this CurrencyRateFilter.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyRateFilter)) return false;
        CurrencyRateFilter other = (CurrencyRateFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseCurrency==null && other.getBaseCurrency()==null) || 
             (this.baseCurrency!=null &&
              this.baseCurrency.equals(other.getBaseCurrency()))) &&
            ((this.fromCurrency==null && other.getFromCurrency()==null) || 
             (this.fromCurrency!=null &&
              this.fromCurrency.equals(other.getFromCurrency()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBaseCurrency() != null) {
            _hashCode += getBaseCurrency().hashCode();
        }
        if (getFromCurrency() != null) {
            _hashCode += getFromCurrency().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyRateFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CurrencyRateFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "fromCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "effectiveDate"));
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
