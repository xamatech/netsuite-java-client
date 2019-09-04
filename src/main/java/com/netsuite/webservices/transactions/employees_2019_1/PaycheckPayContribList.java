/**
 * PaycheckPayContribList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPayContribList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContrib[] paycheckPayContrib;

    private boolean replaceAll;  // attribute

    public PaycheckPayContribList() {
    }

    public PaycheckPayContribList(
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContrib[] paycheckPayContrib,
           boolean replaceAll) {
           this.paycheckPayContrib = paycheckPayContrib;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the paycheckPayContrib value for this PaycheckPayContribList.
     * 
     * @return paycheckPayContrib
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContrib[] getPaycheckPayContrib() {
        return paycheckPayContrib;
    }


    /**
     * Sets the paycheckPayContrib value for this PaycheckPayContribList.
     * 
     * @param paycheckPayContrib
     */
    public void setPaycheckPayContrib(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContrib[] paycheckPayContrib) {
        this.paycheckPayContrib = paycheckPayContrib;
    }

    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContrib getPaycheckPayContrib(int i) {
        return this.paycheckPayContrib[i];
    }

    public void setPaycheckPayContrib(int i, com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContrib _value) {
        this.paycheckPayContrib[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PaycheckPayContribList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PaycheckPayContribList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayContribList)) return false;
        PaycheckPayContribList other = (PaycheckPayContribList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paycheckPayContrib==null && other.getPaycheckPayContrib()==null) || 
             (this.paycheckPayContrib!=null &&
              java.util.Arrays.equals(this.paycheckPayContrib, other.getPaycheckPayContrib()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (getPaycheckPayContrib() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaycheckPayContrib());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaycheckPayContrib(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckPayContribList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayContribList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paycheckPayContrib");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "paycheckPayContrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayContrib"));
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
