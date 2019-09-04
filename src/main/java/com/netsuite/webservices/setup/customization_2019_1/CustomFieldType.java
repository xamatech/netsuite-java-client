/**
 * CustomFieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public abstract class CustomFieldType  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType fieldType;

    private java.lang.String scriptId;

    public CustomFieldType() {
    }

    public CustomFieldType(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType fieldType,
           java.lang.String scriptId) {
        super(
            nullFieldList);
        this.fieldType = fieldType;
        this.scriptId = scriptId;
    }


    /**
     * Gets the fieldType value for this CustomFieldType.
     * 
     * @return fieldType
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this CustomFieldType.
     * 
     * @param fieldType
     */
    public void setFieldType(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the scriptId value for this CustomFieldType.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this CustomFieldType.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomFieldType)) return false;
        CustomFieldType other = (CustomFieldType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomFieldType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomFieldType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomizationFieldType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "scriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
