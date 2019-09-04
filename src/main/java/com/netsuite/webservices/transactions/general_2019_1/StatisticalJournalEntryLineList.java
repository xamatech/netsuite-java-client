/**
 * StatisticalJournalEntryLineList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.general_2019_1;

public class StatisticalJournalEntryLineList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.general_2019_1.StatisticalJournalEntryLine[] statisticalJournalEntryLine;

    private boolean replaceAll;  // attribute

    public StatisticalJournalEntryLineList() {
    }

    public StatisticalJournalEntryLineList(
           com.netsuite.webservices.transactions.general_2019_1.StatisticalJournalEntryLine[] statisticalJournalEntryLine,
           boolean replaceAll) {
           this.statisticalJournalEntryLine = statisticalJournalEntryLine;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the statisticalJournalEntryLine value for this StatisticalJournalEntryLineList.
     * 
     * @return statisticalJournalEntryLine
     */
    public com.netsuite.webservices.transactions.general_2019_1.StatisticalJournalEntryLine[] getStatisticalJournalEntryLine() {
        return statisticalJournalEntryLine;
    }


    /**
     * Sets the statisticalJournalEntryLine value for this StatisticalJournalEntryLineList.
     * 
     * @param statisticalJournalEntryLine
     */
    public void setStatisticalJournalEntryLine(com.netsuite.webservices.transactions.general_2019_1.StatisticalJournalEntryLine[] statisticalJournalEntryLine) {
        this.statisticalJournalEntryLine = statisticalJournalEntryLine;
    }

    public com.netsuite.webservices.transactions.general_2019_1.StatisticalJournalEntryLine getStatisticalJournalEntryLine(int i) {
        return this.statisticalJournalEntryLine[i];
    }

    public void setStatisticalJournalEntryLine(int i, com.netsuite.webservices.transactions.general_2019_1.StatisticalJournalEntryLine _value) {
        this.statisticalJournalEntryLine[i] = _value;
    }


    /**
     * Gets the replaceAll value for this StatisticalJournalEntryLineList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this StatisticalJournalEntryLineList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatisticalJournalEntryLineList)) return false;
        StatisticalJournalEntryLineList other = (StatisticalJournalEntryLineList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statisticalJournalEntryLine==null && other.getStatisticalJournalEntryLine()==null) || 
             (this.statisticalJournalEntryLine!=null &&
              java.util.Arrays.equals(this.statisticalJournalEntryLine, other.getStatisticalJournalEntryLine()))) &&
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
        if (getStatisticalJournalEntryLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatisticalJournalEntryLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatisticalJournalEntryLine(), i);
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
        new org.apache.axis.description.TypeDesc(StatisticalJournalEntryLineList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "StatisticalJournalEntryLineList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statisticalJournalEntryLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "statisticalJournalEntryLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "StatisticalJournalEntryLine"));
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
