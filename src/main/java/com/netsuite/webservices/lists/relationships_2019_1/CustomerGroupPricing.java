/**
 * CustomerGroupPricing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerGroupPricing  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef group;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef level;

    public CustomerGroupPricing() {
    }

    public CustomerGroupPricing(
           com.netsuite.webservices.platform.core_2019_1.RecordRef group,
           com.netsuite.webservices.platform.core_2019_1.RecordRef level) {
           this.group = group;
           this.level = level;
    }


    /**
     * Gets the group value for this CustomerGroupPricing.
     * 
     * @return group
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getGroup() {
        return group;
    }


    /**
     * Sets the group value for this CustomerGroupPricing.
     * 
     * @param group
     */
    public void setGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef group) {
        this.group = group;
    }


    /**
     * Gets the level value for this CustomerGroupPricing.
     * 
     * @return level
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLevel() {
        return level;
    }


    /**
     * Sets the level value for this CustomerGroupPricing.
     * 
     * @param level
     */
    public void setLevel(com.netsuite.webservices.platform.core_2019_1.RecordRef level) {
        this.level = level;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerGroupPricing)) return false;
        CustomerGroupPricing other = (CustomerGroupPricing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel())));
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
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerGroupPricing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerGroupPricing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
