/**
 * CustomFieldRoleAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class CustomFieldRoleAccess  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef role;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel accessLevel;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel searchLevel;

    public CustomFieldRoleAccess() {
    }

    public CustomFieldRoleAccess(
           com.netsuite.webservices.platform.core_2019_1.RecordRef role,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel accessLevel,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel searchLevel) {
           this.role = role;
           this.accessLevel = accessLevel;
           this.searchLevel = searchLevel;
    }


    /**
     * Gets the role value for this CustomFieldRoleAccess.
     * 
     * @return role
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRole() {
        return role;
    }


    /**
     * Sets the role value for this CustomFieldRoleAccess.
     * 
     * @param role
     */
    public void setRole(com.netsuite.webservices.platform.core_2019_1.RecordRef role) {
        this.role = role;
    }


    /**
     * Gets the accessLevel value for this CustomFieldRoleAccess.
     * 
     * @return accessLevel
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this CustomFieldRoleAccess.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the searchLevel value for this CustomFieldRoleAccess.
     * 
     * @return searchLevel
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel getSearchLevel() {
        return searchLevel;
    }


    /**
     * Sets the searchLevel value for this CustomFieldRoleAccess.
     * 
     * @param searchLevel
     */
    public void setSearchLevel(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel searchLevel) {
        this.searchLevel = searchLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomFieldRoleAccess)) return false;
        CustomFieldRoleAccess other = (CustomFieldRoleAccess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel()))) &&
            ((this.searchLevel==null && other.getSearchLevel()==null) || 
             (this.searchLevel!=null &&
              this.searchLevel.equals(other.getSearchLevel())));
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
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        if (getSearchLevel() != null) {
            _hashCode += getSearchLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomFieldRoleAccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomFieldRoleAccess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomizationAccessLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "searchLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomizationSearchLevel"));
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
