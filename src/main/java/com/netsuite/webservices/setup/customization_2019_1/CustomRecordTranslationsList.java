/**
 * CustomRecordTranslationsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class CustomRecordTranslationsList  implements java.io.Serializable {
    private com.netsuite.webservices.setup.customization_2019_1.CustomRecordTranslations[] customRecordTranslations;

    private boolean replaceAll;  // attribute

    public CustomRecordTranslationsList() {
    }

    public CustomRecordTranslationsList(
           com.netsuite.webservices.setup.customization_2019_1.CustomRecordTranslations[] customRecordTranslations,
           boolean replaceAll) {
           this.customRecordTranslations = customRecordTranslations;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the customRecordTranslations value for this CustomRecordTranslationsList.
     * 
     * @return customRecordTranslations
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomRecordTranslations[] getCustomRecordTranslations() {
        return customRecordTranslations;
    }


    /**
     * Sets the customRecordTranslations value for this CustomRecordTranslationsList.
     * 
     * @param customRecordTranslations
     */
    public void setCustomRecordTranslations(com.netsuite.webservices.setup.customization_2019_1.CustomRecordTranslations[] customRecordTranslations) {
        this.customRecordTranslations = customRecordTranslations;
    }

    public com.netsuite.webservices.setup.customization_2019_1.CustomRecordTranslations getCustomRecordTranslations(int i) {
        return this.customRecordTranslations[i];
    }

    public void setCustomRecordTranslations(int i, com.netsuite.webservices.setup.customization_2019_1.CustomRecordTranslations _value) {
        this.customRecordTranslations[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomRecordTranslationsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomRecordTranslationsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTranslationsList)) return false;
        CustomRecordTranslationsList other = (CustomRecordTranslationsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customRecordTranslations==null && other.getCustomRecordTranslations()==null) || 
             (this.customRecordTranslations!=null &&
              java.util.Arrays.equals(this.customRecordTranslations, other.getCustomRecordTranslations()))) &&
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
        if (getCustomRecordTranslations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomRecordTranslations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomRecordTranslations(), i);
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
        new org.apache.axis.description.TypeDesc(CustomRecordTranslationsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTranslationsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customRecordTranslations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "customRecordTranslations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTranslations"));
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
