/**
 * ContactAccessRolesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class ContactAccessRolesList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRoles[] contactRoles;

    private boolean replaceAll;  // attribute

    public ContactAccessRolesList() {
    }

    public ContactAccessRolesList(
           com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRoles[] contactRoles,
           boolean replaceAll) {
           this.contactRoles = contactRoles;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the contactRoles value for this ContactAccessRolesList.
     * 
     * @return contactRoles
     */
    public com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRoles[] getContactRoles() {
        return contactRoles;
    }


    /**
     * Sets the contactRoles value for this ContactAccessRolesList.
     * 
     * @param contactRoles
     */
    public void setContactRoles(com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRoles[] contactRoles) {
        this.contactRoles = contactRoles;
    }

    public com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRoles getContactRoles(int i) {
        return this.contactRoles[i];
    }

    public void setContactRoles(int i, com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRoles _value) {
        this.contactRoles[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ContactAccessRolesList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ContactAccessRolesList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactAccessRolesList)) return false;
        ContactAccessRolesList other = (ContactAccessRolesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactRoles==null && other.getContactRoles()==null) || 
             (this.contactRoles!=null &&
              java.util.Arrays.equals(this.contactRoles, other.getContactRoles()))) &&
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
        if (getContactRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactRoles(), i);
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
        new org.apache.axis.description.TypeDesc(ContactAccessRolesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ContactAccessRolesList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ContactAccessRoles"));
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
