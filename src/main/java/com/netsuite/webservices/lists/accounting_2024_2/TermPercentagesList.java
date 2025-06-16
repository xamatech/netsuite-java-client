/**
 * TermPercentagesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class TermPercentagesList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.TermPercentages[] termPercentages;

    private boolean replaceAll;  // attribute

    public TermPercentagesList() {
    }

    public TermPercentagesList(
           com.netsuite.webservices.lists.accounting_2024_2.TermPercentages[] termPercentages,
           boolean replaceAll) {
           this.termPercentages = termPercentages;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the termPercentages value for this TermPercentagesList.
     * 
     * @return termPercentages
     */
    public com.netsuite.webservices.lists.accounting_2024_2.TermPercentages[] getTermPercentages() {
        return termPercentages;
    }


    /**
     * Sets the termPercentages value for this TermPercentagesList.
     * 
     * @param termPercentages
     */
    public void setTermPercentages(com.netsuite.webservices.lists.accounting_2024_2.TermPercentages[] termPercentages) {
        this.termPercentages = termPercentages;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.TermPercentages getTermPercentages(int i) {
        return this.termPercentages[i];
    }

    public void setTermPercentages(int i, com.netsuite.webservices.lists.accounting_2024_2.TermPercentages _value) {
        this.termPercentages[i] = _value;
    }


    /**
     * Gets the replaceAll value for this TermPercentagesList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this TermPercentagesList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TermPercentagesList)) return false;
        TermPercentagesList other = (TermPercentagesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.termPercentages==null && other.getTermPercentages()==null) || 
             (this.termPercentages!=null &&
              java.util.Arrays.equals(this.termPercentages, other.getTermPercentages()))) &&
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
        if (getTermPercentages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTermPercentages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTermPercentages(), i);
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
        new org.apache.axis.description.TypeDesc(TermPercentagesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "TermPercentagesList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termPercentages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "termPercentages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "TermPercentages"));
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
