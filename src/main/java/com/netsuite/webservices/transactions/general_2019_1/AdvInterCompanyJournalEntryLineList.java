/**
 * AdvInterCompanyJournalEntryLineList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.general_2019_1;

public class AdvInterCompanyJournalEntryLineList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLine[] line;

    private boolean replaceAll;  // attribute

    public AdvInterCompanyJournalEntryLineList() {
    }

    public AdvInterCompanyJournalEntryLineList(
           com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLine[] line,
           boolean replaceAll) {
           this.line = line;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the line value for this AdvInterCompanyJournalEntryLineList.
     * 
     * @return line
     */
    public com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLine[] getLine() {
        return line;
    }


    /**
     * Sets the line value for this AdvInterCompanyJournalEntryLineList.
     * 
     * @param line
     */
    public void setLine(com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLine[] line) {
        this.line = line;
    }

    public com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLine getLine(int i) {
        return this.line[i];
    }

    public void setLine(int i, com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLine _value) {
        this.line[i] = _value;
    }


    /**
     * Gets the replaceAll value for this AdvInterCompanyJournalEntryLineList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this AdvInterCompanyJournalEntryLineList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvInterCompanyJournalEntryLineList)) return false;
        AdvInterCompanyJournalEntryLineList other = (AdvInterCompanyJournalEntryLineList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              java.util.Arrays.equals(this.line, other.getLine()))) &&
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
        if (getLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLine(), i);
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
        new org.apache.axis.description.TypeDesc(AdvInterCompanyJournalEntryLineList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntryLineList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntryLine"));
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
