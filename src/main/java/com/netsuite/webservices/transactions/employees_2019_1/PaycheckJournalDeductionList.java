/**
 * PaycheckJournalDeductionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckJournalDeductionList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeduction[] paycheckJournalDeduction;

    private boolean replaceAll;  // attribute

    public PaycheckJournalDeductionList() {
    }

    public PaycheckJournalDeductionList(
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeduction[] paycheckJournalDeduction,
           boolean replaceAll) {
           this.paycheckJournalDeduction = paycheckJournalDeduction;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the paycheckJournalDeduction value for this PaycheckJournalDeductionList.
     * 
     * @return paycheckJournalDeduction
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeduction[] getPaycheckJournalDeduction() {
        return paycheckJournalDeduction;
    }


    /**
     * Sets the paycheckJournalDeduction value for this PaycheckJournalDeductionList.
     * 
     * @param paycheckJournalDeduction
     */
    public void setPaycheckJournalDeduction(com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeduction[] paycheckJournalDeduction) {
        this.paycheckJournalDeduction = paycheckJournalDeduction;
    }

    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeduction getPaycheckJournalDeduction(int i) {
        return this.paycheckJournalDeduction[i];
    }

    public void setPaycheckJournalDeduction(int i, com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeduction _value) {
        this.paycheckJournalDeduction[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PaycheckJournalDeductionList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PaycheckJournalDeductionList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckJournalDeductionList)) return false;
        PaycheckJournalDeductionList other = (PaycheckJournalDeductionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paycheckJournalDeduction==null && other.getPaycheckJournalDeduction()==null) || 
             (this.paycheckJournalDeduction!=null &&
              java.util.Arrays.equals(this.paycheckJournalDeduction, other.getPaycheckJournalDeduction()))) &&
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
        if (getPaycheckJournalDeduction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaycheckJournalDeduction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaycheckJournalDeduction(), i);
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
        new org.apache.axis.description.TypeDesc(PaycheckJournalDeductionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournalDeductionList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paycheckJournalDeduction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "paycheckJournalDeduction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournalDeduction"));
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
