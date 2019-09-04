/**
 * CurrencyRateList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class CurrencyRateList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.CurrencyRate[] currencyRate;

    public CurrencyRateList() {
    }

    public CurrencyRateList(
           com.netsuite.webservices.platform.core_2019_1.CurrencyRate[] currencyRate) {
           this.currencyRate = currencyRate;
    }


    /**
     * Gets the currencyRate value for this CurrencyRateList.
     * 
     * @return currencyRate
     */
    public com.netsuite.webservices.platform.core_2019_1.CurrencyRate[] getCurrencyRate() {
        return currencyRate;
    }


    /**
     * Sets the currencyRate value for this CurrencyRateList.
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(com.netsuite.webservices.platform.core_2019_1.CurrencyRate[] currencyRate) {
        this.currencyRate = currencyRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.CurrencyRate getCurrencyRate(int i) {
        return this.currencyRate[i];
    }

    public void setCurrencyRate(int i, com.netsuite.webservices.platform.core_2019_1.CurrencyRate _value) {
        this.currencyRate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyRateList)) return false;
        CurrencyRateList other = (CurrencyRateList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyRate==null && other.getCurrencyRate()==null) || 
             (this.currencyRate!=null &&
              java.util.Arrays.equals(this.currencyRate, other.getCurrencyRate())));
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
        if (getCurrencyRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencyRate(), i);
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
        new org.apache.axis.description.TypeDesc(CurrencyRateList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CurrencyRateList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "currencyRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CurrencyRate"));
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
