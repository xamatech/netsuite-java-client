/**
 * PaycheckPayDisburseList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2024_2;

public class PaycheckPayDisburseList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2024_2.PaycheckPayDisburse[] paycheckPayDisburse;

    private boolean replaceAll;  // attribute

    public PaycheckPayDisburseList() {
    }

    public PaycheckPayDisburseList(
           com.netsuite.webservices.transactions.employees_2024_2.PaycheckPayDisburse[] paycheckPayDisburse,
           boolean replaceAll) {
           this.paycheckPayDisburse = paycheckPayDisburse;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the paycheckPayDisburse value for this PaycheckPayDisburseList.
     * 
     * @return paycheckPayDisburse
     */
    public com.netsuite.webservices.transactions.employees_2024_2.PaycheckPayDisburse[] getPaycheckPayDisburse() {
        return paycheckPayDisburse;
    }


    /**
     * Sets the paycheckPayDisburse value for this PaycheckPayDisburseList.
     * 
     * @param paycheckPayDisburse
     */
    public void setPaycheckPayDisburse(com.netsuite.webservices.transactions.employees_2024_2.PaycheckPayDisburse[] paycheckPayDisburse) {
        this.paycheckPayDisburse = paycheckPayDisburse;
    }

    public com.netsuite.webservices.transactions.employees_2024_2.PaycheckPayDisburse getPaycheckPayDisburse(int i) {
        return this.paycheckPayDisburse[i];
    }

    public void setPaycheckPayDisburse(int i, com.netsuite.webservices.transactions.employees_2024_2.PaycheckPayDisburse _value) {
        this.paycheckPayDisburse[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PaycheckPayDisburseList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PaycheckPayDisburseList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayDisburseList)) return false;
        PaycheckPayDisburseList other = (PaycheckPayDisburseList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paycheckPayDisburse==null && other.getPaycheckPayDisburse()==null) || 
             (this.paycheckPayDisburse!=null &&
              java.util.Arrays.equals(this.paycheckPayDisburse, other.getPaycheckPayDisburse()))) &&
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
        if (getPaycheckPayDisburse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaycheckPayDisburse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaycheckPayDisburse(), i);
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
        new org.apache.axis.description.TypeDesc(PaycheckPayDisburseList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "PaycheckPayDisburseList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paycheckPayDisburse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "paycheckPayDisburse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "PaycheckPayDisburse"));
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
