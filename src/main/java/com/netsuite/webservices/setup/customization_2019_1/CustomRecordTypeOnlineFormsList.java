/**
 * CustomRecordTypeOnlineFormsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class CustomRecordTypeOnlineFormsList  implements java.io.Serializable {
    private com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypeOnlineForms[] onlineForms;

    private boolean replaceAll;  // attribute

    public CustomRecordTypeOnlineFormsList() {
    }

    public CustomRecordTypeOnlineFormsList(
           com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypeOnlineForms[] onlineForms,
           boolean replaceAll) {
           this.onlineForms = onlineForms;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the onlineForms value for this CustomRecordTypeOnlineFormsList.
     * 
     * @return onlineForms
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypeOnlineForms[] getOnlineForms() {
        return onlineForms;
    }


    /**
     * Sets the onlineForms value for this CustomRecordTypeOnlineFormsList.
     * 
     * @param onlineForms
     */
    public void setOnlineForms(com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypeOnlineForms[] onlineForms) {
        this.onlineForms = onlineForms;
    }

    public com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypeOnlineForms getOnlineForms(int i) {
        return this.onlineForms[i];
    }

    public void setOnlineForms(int i, com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypeOnlineForms _value) {
        this.onlineForms[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomRecordTypeOnlineFormsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomRecordTypeOnlineFormsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeOnlineFormsList)) return false;
        CustomRecordTypeOnlineFormsList other = (CustomRecordTypeOnlineFormsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.onlineForms==null && other.getOnlineForms()==null) || 
             (this.onlineForms!=null &&
              java.util.Arrays.equals(this.onlineForms, other.getOnlineForms()))) &&
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
        if (getOnlineForms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnlineForms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnlineForms(), i);
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
        new org.apache.axis.description.TypeDesc(CustomRecordTypeOnlineFormsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTypeOnlineFormsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineForms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "onlineForms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTypeOnlineForms"));
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
