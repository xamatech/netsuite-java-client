/**
 * CustomTransactionLineList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class CustomTransactionLineList  implements java.io.Serializable {
    private com.netsuite.webservices.setup.customization_2019_1.CustomTransactionLine[] customTransactionLine;

    private boolean replaceAll;  // attribute

    public CustomTransactionLineList() {
    }

    public CustomTransactionLineList(
           com.netsuite.webservices.setup.customization_2019_1.CustomTransactionLine[] customTransactionLine,
           boolean replaceAll) {
           this.customTransactionLine = customTransactionLine;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the customTransactionLine value for this CustomTransactionLineList.
     * 
     * @return customTransactionLine
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomTransactionLine[] getCustomTransactionLine() {
        return customTransactionLine;
    }


    /**
     * Sets the customTransactionLine value for this CustomTransactionLineList.
     * 
     * @param customTransactionLine
     */
    public void setCustomTransactionLine(com.netsuite.webservices.setup.customization_2019_1.CustomTransactionLine[] customTransactionLine) {
        this.customTransactionLine = customTransactionLine;
    }

    public com.netsuite.webservices.setup.customization_2019_1.CustomTransactionLine getCustomTransactionLine(int i) {
        return this.customTransactionLine[i];
    }

    public void setCustomTransactionLine(int i, com.netsuite.webservices.setup.customization_2019_1.CustomTransactionLine _value) {
        this.customTransactionLine[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomTransactionLineList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomTransactionLineList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomTransactionLineList)) return false;
        CustomTransactionLineList other = (CustomTransactionLineList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customTransactionLine==null && other.getCustomTransactionLine()==null) || 
             (this.customTransactionLine!=null &&
              java.util.Arrays.equals(this.customTransactionLine, other.getCustomTransactionLine()))) &&
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
        if (getCustomTransactionLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomTransactionLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomTransactionLine(), i);
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
        new org.apache.axis.description.TypeDesc(CustomTransactionLineList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomTransactionLineList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTransactionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "customTransactionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomTransactionLine"));
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
