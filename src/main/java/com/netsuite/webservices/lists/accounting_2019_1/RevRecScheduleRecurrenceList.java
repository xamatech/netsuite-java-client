/**
 * RevRecScheduleRecurrenceList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class RevRecScheduleRecurrenceList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrence[] revRecScheduleRecurrence;

    private boolean replaceAll;  // attribute

    public RevRecScheduleRecurrenceList() {
    }

    public RevRecScheduleRecurrenceList(
           com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrence[] revRecScheduleRecurrence,
           boolean replaceAll) {
           this.revRecScheduleRecurrence = revRecScheduleRecurrence;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the revRecScheduleRecurrence value for this RevRecScheduleRecurrenceList.
     * 
     * @return revRecScheduleRecurrence
     */
    public com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrence[] getRevRecScheduleRecurrence() {
        return revRecScheduleRecurrence;
    }


    /**
     * Sets the revRecScheduleRecurrence value for this RevRecScheduleRecurrenceList.
     * 
     * @param revRecScheduleRecurrence
     */
    public void setRevRecScheduleRecurrence(com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrence[] revRecScheduleRecurrence) {
        this.revRecScheduleRecurrence = revRecScheduleRecurrence;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrence getRevRecScheduleRecurrence(int i) {
        return this.revRecScheduleRecurrence[i];
    }

    public void setRevRecScheduleRecurrence(int i, com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrence _value) {
        this.revRecScheduleRecurrence[i] = _value;
    }


    /**
     * Gets the replaceAll value for this RevRecScheduleRecurrenceList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this RevRecScheduleRecurrenceList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevRecScheduleRecurrenceList)) return false;
        RevRecScheduleRecurrenceList other = (RevRecScheduleRecurrenceList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.revRecScheduleRecurrence==null && other.getRevRecScheduleRecurrence()==null) || 
             (this.revRecScheduleRecurrence!=null &&
              java.util.Arrays.equals(this.revRecScheduleRecurrence, other.getRevRecScheduleRecurrence()))) &&
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
        if (getRevRecScheduleRecurrence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecScheduleRecurrence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecScheduleRecurrence(), i);
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
        new org.apache.axis.description.TypeDesc(RevRecScheduleRecurrenceList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrenceList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecScheduleRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "revRecScheduleRecurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrence"));
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
