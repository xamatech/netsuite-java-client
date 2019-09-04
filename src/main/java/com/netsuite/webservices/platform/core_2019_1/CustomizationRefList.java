/**
 * CustomizationRefList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class CustomizationRefList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.CustomizationRef[] customizationRef;

    public CustomizationRefList() {
    }

    public CustomizationRefList(
           com.netsuite.webservices.platform.core_2019_1.CustomizationRef[] customizationRef) {
           this.customizationRef = customizationRef;
    }


    /**
     * Gets the customizationRef value for this CustomizationRefList.
     * 
     * @return customizationRef
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomizationRef[] getCustomizationRef() {
        return customizationRef;
    }


    /**
     * Sets the customizationRef value for this CustomizationRefList.
     * 
     * @param customizationRef
     */
    public void setCustomizationRef(com.netsuite.webservices.platform.core_2019_1.CustomizationRef[] customizationRef) {
        this.customizationRef = customizationRef;
    }

    public com.netsuite.webservices.platform.core_2019_1.CustomizationRef getCustomizationRef(int i) {
        return this.customizationRef[i];
    }

    public void setCustomizationRef(int i, com.netsuite.webservices.platform.core_2019_1.CustomizationRef _value) {
        this.customizationRef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizationRefList)) return false;
        CustomizationRefList other = (CustomizationRefList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customizationRef==null && other.getCustomizationRef()==null) || 
             (this.customizationRef!=null &&
              java.util.Arrays.equals(this.customizationRef, other.getCustomizationRef())));
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
        if (getCustomizationRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomizationRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomizationRef(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomizationRefList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomizationRefList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizationRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "customizationRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomizationRef"));
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
