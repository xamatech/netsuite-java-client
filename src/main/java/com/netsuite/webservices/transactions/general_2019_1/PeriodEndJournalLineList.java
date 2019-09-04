/**
 * PeriodEndJournalLineList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.general_2019_1;

public class PeriodEndJournalLineList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.general_2019_1.PeriodEndJournalLine[] periodEndJournalLine;

    private boolean replaceAll;  // attribute

    public PeriodEndJournalLineList() {
    }

    public PeriodEndJournalLineList(
           com.netsuite.webservices.transactions.general_2019_1.PeriodEndJournalLine[] periodEndJournalLine,
           boolean replaceAll) {
           this.periodEndJournalLine = periodEndJournalLine;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the periodEndJournalLine value for this PeriodEndJournalLineList.
     * 
     * @return periodEndJournalLine
     */
    public com.netsuite.webservices.transactions.general_2019_1.PeriodEndJournalLine[] getPeriodEndJournalLine() {
        return periodEndJournalLine;
    }


    /**
     * Sets the periodEndJournalLine value for this PeriodEndJournalLineList.
     * 
     * @param periodEndJournalLine
     */
    public void setPeriodEndJournalLine(com.netsuite.webservices.transactions.general_2019_1.PeriodEndJournalLine[] periodEndJournalLine) {
        this.periodEndJournalLine = periodEndJournalLine;
    }

    public com.netsuite.webservices.transactions.general_2019_1.PeriodEndJournalLine getPeriodEndJournalLine(int i) {
        return this.periodEndJournalLine[i];
    }

    public void setPeriodEndJournalLine(int i, com.netsuite.webservices.transactions.general_2019_1.PeriodEndJournalLine _value) {
        this.periodEndJournalLine[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PeriodEndJournalLineList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PeriodEndJournalLineList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PeriodEndJournalLineList)) return false;
        PeriodEndJournalLineList other = (PeriodEndJournalLineList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.periodEndJournalLine==null && other.getPeriodEndJournalLine()==null) || 
             (this.periodEndJournalLine!=null &&
              java.util.Arrays.equals(this.periodEndJournalLine, other.getPeriodEndJournalLine()))) &&
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
        if (getPeriodEndJournalLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodEndJournalLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodEndJournalLine(), i);
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
        new org.apache.axis.description.TypeDesc(PeriodEndJournalLineList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "PeriodEndJournalLineList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodEndJournalLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "periodEndJournalLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "PeriodEndJournalLine"));
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
