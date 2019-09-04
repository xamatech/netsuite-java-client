/**
 * SelectCustomFieldRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class SelectCustomFieldRef  extends com.netsuite.webservices.platform.core_2019_1.CustomFieldRef  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.ListOrRecordRef value;

    public SelectCustomFieldRef() {
    }

    public SelectCustomFieldRef(
           java.lang.String internalId,
           java.lang.String scriptId,
           com.netsuite.webservices.platform.core_2019_1.ListOrRecordRef value) {
        super(
            internalId,
            scriptId);
        this.value = value;
    }


    /**
     * Gets the value value for this SelectCustomFieldRef.
     * 
     * @return value
     */
    public com.netsuite.webservices.platform.core_2019_1.ListOrRecordRef getValue() {
        return value;
    }


    /**
     * Sets the value value for this SelectCustomFieldRef.
     * 
     * @param value
     */
    public void setValue(com.netsuite.webservices.platform.core_2019_1.ListOrRecordRef value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SelectCustomFieldRef)) return false;
        SelectCustomFieldRef other = (SelectCustomFieldRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SelectCustomFieldRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SelectCustomFieldRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "ListOrRecordRef"));
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
