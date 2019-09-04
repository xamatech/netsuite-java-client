/**
 * ContactAccessRoles.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class ContactAccessRoles  implements java.io.Serializable {
    private java.lang.Boolean giveAccess;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef contact;

    private java.lang.String email;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef role;

    private java.lang.String password;

    private java.lang.String password2;

    private java.lang.Boolean sendEmail;

    public ContactAccessRoles() {
    }

    public ContactAccessRoles(
           java.lang.Boolean giveAccess,
           com.netsuite.webservices.platform.core_2019_1.RecordRef contact,
           java.lang.String email,
           com.netsuite.webservices.platform.core_2019_1.RecordRef role,
           java.lang.String password,
           java.lang.String password2,
           java.lang.Boolean sendEmail) {
           this.giveAccess = giveAccess;
           this.contact = contact;
           this.email = email;
           this.role = role;
           this.password = password;
           this.password2 = password2;
           this.sendEmail = sendEmail;
    }


    /**
     * Gets the giveAccess value for this ContactAccessRoles.
     * 
     * @return giveAccess
     */
    public java.lang.Boolean getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this ContactAccessRoles.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(java.lang.Boolean giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the contact value for this ContactAccessRoles.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ContactAccessRoles.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.RecordRef contact) {
        this.contact = contact;
    }


    /**
     * Gets the email value for this ContactAccessRoles.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ContactAccessRoles.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the role value for this ContactAccessRoles.
     * 
     * @return role
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRole() {
        return role;
    }


    /**
     * Sets the role value for this ContactAccessRoles.
     * 
     * @param role
     */
    public void setRole(com.netsuite.webservices.platform.core_2019_1.RecordRef role) {
        this.role = role;
    }


    /**
     * Gets the password value for this ContactAccessRoles.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ContactAccessRoles.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the password2 value for this ContactAccessRoles.
     * 
     * @return password2
     */
    public java.lang.String getPassword2() {
        return password2;
    }


    /**
     * Sets the password2 value for this ContactAccessRoles.
     * 
     * @param password2
     */
    public void setPassword2(java.lang.String password2) {
        this.password2 = password2;
    }


    /**
     * Gets the sendEmail value for this ContactAccessRoles.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this ContactAccessRoles.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactAccessRoles)) return false;
        ContactAccessRoles other = (ContactAccessRoles) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.password2==null && other.getPassword2()==null) || 
             (this.password2!=null &&
              this.password2.equals(other.getPassword2()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail())));
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
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPassword2() != null) {
            _hashCode += getPassword2().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactAccessRoles.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ContactAccessRoles"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "password2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
