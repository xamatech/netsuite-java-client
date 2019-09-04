/**
 * RateList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class RateList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.Rate[] rate;

    public RateList() {
    }

    public RateList(
           com.netsuite.webservices.lists.accounting_2019_1.Rate[] rate) {
           this.rate = rate;
    }


    /**
     * Gets the rate value for this RateList.
     * 
     * @return rate
     */
    public com.netsuite.webservices.lists.accounting_2019_1.Rate[] getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this RateList.
     * 
     * @param rate
     */
    public void setRate(com.netsuite.webservices.lists.accounting_2019_1.Rate[] rate) {
        this.rate = rate;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.Rate getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, com.netsuite.webservices.lists.accounting_2019_1.Rate _value) {
        this.rate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RateList)) return false;
        RateList other = (RateList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              java.util.Arrays.equals(this.rate, other.getRate())));
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
        if (getRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRate(), i);
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
        new org.apache.axis.description.TypeDesc(RateList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "RateList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "Rate"));
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
