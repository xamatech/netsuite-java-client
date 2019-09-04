/**
 * CustomRecordTypePermissionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class CustomRecordTypePermissionsList  implements java.io.Serializable {
    private com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypePermissions[] permissions;

    private boolean replaceAll;  // attribute

    public CustomRecordTypePermissionsList() {
    }

    public CustomRecordTypePermissionsList(
           com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypePermissions[] permissions,
           boolean replaceAll) {
           this.permissions = permissions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the permissions value for this CustomRecordTypePermissionsList.
     * 
     * @return permissions
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypePermissions[] getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this CustomRecordTypePermissionsList.
     * 
     * @param permissions
     */
    public void setPermissions(com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypePermissions[] permissions) {
        this.permissions = permissions;
    }

    public com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypePermissions getPermissions(int i) {
        return this.permissions[i];
    }

    public void setPermissions(int i, com.netsuite.webservices.setup.customization_2019_1.CustomRecordTypePermissions _value) {
        this.permissions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomRecordTypePermissionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomRecordTypePermissionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypePermissionsList)) return false;
        CustomRecordTypePermissionsList other = (CustomRecordTypePermissionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              java.util.Arrays.equals(this.permissions, other.getPermissions()))) &&
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
        if (getPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissions(), i);
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
        new org.apache.axis.description.TypeDesc(CustomRecordTypePermissionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTypePermissions"));
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
