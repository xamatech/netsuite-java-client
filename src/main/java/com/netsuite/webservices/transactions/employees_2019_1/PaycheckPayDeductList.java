/**
 * PaycheckPayDeductList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPayDeductList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeduct[] paycheckPayDeduct;

    private boolean replaceAll;  // attribute

    public PaycheckPayDeductList() {
    }

    public PaycheckPayDeductList(
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeduct[] paycheckPayDeduct,
           boolean replaceAll) {
           this.paycheckPayDeduct = paycheckPayDeduct;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the paycheckPayDeduct value for this PaycheckPayDeductList.
     * 
     * @return paycheckPayDeduct
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeduct[] getPaycheckPayDeduct() {
        return paycheckPayDeduct;
    }


    /**
     * Sets the paycheckPayDeduct value for this PaycheckPayDeductList.
     * 
     * @param paycheckPayDeduct
     */
    public void setPaycheckPayDeduct(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeduct[] paycheckPayDeduct) {
        this.paycheckPayDeduct = paycheckPayDeduct;
    }

    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeduct getPaycheckPayDeduct(int i) {
        return this.paycheckPayDeduct[i];
    }

    public void setPaycheckPayDeduct(int i, com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeduct _value) {
        this.paycheckPayDeduct[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PaycheckPayDeductList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PaycheckPayDeductList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayDeductList)) return false;
        PaycheckPayDeductList other = (PaycheckPayDeductList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paycheckPayDeduct==null && other.getPaycheckPayDeduct()==null) || 
             (this.paycheckPayDeduct!=null &&
              java.util.Arrays.equals(this.paycheckPayDeduct, other.getPaycheckPayDeduct()))) &&
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
        if (getPaycheckPayDeduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaycheckPayDeduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaycheckPayDeduct(), i);
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
        new org.apache.axis.description.TypeDesc(PaycheckPayDeductList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayDeductList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paycheckPayDeduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "paycheckPayDeduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayDeduct"));
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
