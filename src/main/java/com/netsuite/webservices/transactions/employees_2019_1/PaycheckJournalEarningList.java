/**
 * PaycheckJournalEarningList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckJournalEarningList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarning[] paycheckJournalEarning;

    private boolean replaceAll;  // attribute

    public PaycheckJournalEarningList() {
    }

    public PaycheckJournalEarningList(
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarning[] paycheckJournalEarning,
           boolean replaceAll) {
           this.paycheckJournalEarning = paycheckJournalEarning;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the paycheckJournalEarning value for this PaycheckJournalEarningList.
     * 
     * @return paycheckJournalEarning
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarning[] getPaycheckJournalEarning() {
        return paycheckJournalEarning;
    }


    /**
     * Sets the paycheckJournalEarning value for this PaycheckJournalEarningList.
     * 
     * @param paycheckJournalEarning
     */
    public void setPaycheckJournalEarning(com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarning[] paycheckJournalEarning) {
        this.paycheckJournalEarning = paycheckJournalEarning;
    }

    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarning getPaycheckJournalEarning(int i) {
        return this.paycheckJournalEarning[i];
    }

    public void setPaycheckJournalEarning(int i, com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarning _value) {
        this.paycheckJournalEarning[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PaycheckJournalEarningList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PaycheckJournalEarningList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckJournalEarningList)) return false;
        PaycheckJournalEarningList other = (PaycheckJournalEarningList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paycheckJournalEarning==null && other.getPaycheckJournalEarning()==null) || 
             (this.paycheckJournalEarning!=null &&
              java.util.Arrays.equals(this.paycheckJournalEarning, other.getPaycheckJournalEarning()))) &&
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
        if (getPaycheckJournalEarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaycheckJournalEarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaycheckJournalEarning(), i);
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
        new org.apache.axis.description.TypeDesc(PaycheckJournalEarningList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournalEarningList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paycheckJournalEarning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "paycheckJournalEarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournalEarning"));
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
