/**
 * PaycheckPaySummaryList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPaySummaryList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummary[] paycheckPaySummary;

    private boolean replaceAll;  // attribute

    public PaycheckPaySummaryList() {
    }

    public PaycheckPaySummaryList(
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummary[] paycheckPaySummary,
           boolean replaceAll) {
           this.paycheckPaySummary = paycheckPaySummary;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the paycheckPaySummary value for this PaycheckPaySummaryList.
     * 
     * @return paycheckPaySummary
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummary[] getPaycheckPaySummary() {
        return paycheckPaySummary;
    }


    /**
     * Sets the paycheckPaySummary value for this PaycheckPaySummaryList.
     * 
     * @param paycheckPaySummary
     */
    public void setPaycheckPaySummary(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummary[] paycheckPaySummary) {
        this.paycheckPaySummary = paycheckPaySummary;
    }

    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummary getPaycheckPaySummary(int i) {
        return this.paycheckPaySummary[i];
    }

    public void setPaycheckPaySummary(int i, com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummary _value) {
        this.paycheckPaySummary[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PaycheckPaySummaryList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PaycheckPaySummaryList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPaySummaryList)) return false;
        PaycheckPaySummaryList other = (PaycheckPaySummaryList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paycheckPaySummary==null && other.getPaycheckPaySummary()==null) || 
             (this.paycheckPaySummary!=null &&
              java.util.Arrays.equals(this.paycheckPaySummary, other.getPaycheckPaySummary()))) &&
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
        if (getPaycheckPaySummary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaycheckPaySummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaycheckPaySummary(), i);
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
        new org.apache.axis.description.TypeDesc(PaycheckPaySummaryList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPaySummaryList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paycheckPaySummary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "paycheckPaySummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPaySummary"));
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
