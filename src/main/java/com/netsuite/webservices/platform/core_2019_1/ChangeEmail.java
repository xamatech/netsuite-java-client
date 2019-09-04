/**
 * ChangeEmail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class ChangeEmail  implements java.io.Serializable {
    private java.lang.String currentPassword;

    private java.lang.String newEmail;

    private java.lang.String newEmail2;

    private java.lang.Boolean justThisAccount;

    public ChangeEmail() {
    }

    public ChangeEmail(
           java.lang.String currentPassword,
           java.lang.String newEmail,
           java.lang.String newEmail2,
           java.lang.Boolean justThisAccount) {
           this.currentPassword = currentPassword;
           this.newEmail = newEmail;
           this.newEmail2 = newEmail2;
           this.justThisAccount = justThisAccount;
    }


    /**
     * Gets the currentPassword value for this ChangeEmail.
     * 
     * @return currentPassword
     */
    public java.lang.String getCurrentPassword() {
        return currentPassword;
    }


    /**
     * Sets the currentPassword value for this ChangeEmail.
     * 
     * @param currentPassword
     */
    public void setCurrentPassword(java.lang.String currentPassword) {
        this.currentPassword = currentPassword;
    }


    /**
     * Gets the newEmail value for this ChangeEmail.
     * 
     * @return newEmail
     */
    public java.lang.String getNewEmail() {
        return newEmail;
    }


    /**
     * Sets the newEmail value for this ChangeEmail.
     * 
     * @param newEmail
     */
    public void setNewEmail(java.lang.String newEmail) {
        this.newEmail = newEmail;
    }


    /**
     * Gets the newEmail2 value for this ChangeEmail.
     * 
     * @return newEmail2
     */
    public java.lang.String getNewEmail2() {
        return newEmail2;
    }


    /**
     * Sets the newEmail2 value for this ChangeEmail.
     * 
     * @param newEmail2
     */
    public void setNewEmail2(java.lang.String newEmail2) {
        this.newEmail2 = newEmail2;
    }


    /**
     * Gets the justThisAccount value for this ChangeEmail.
     * 
     * @return justThisAccount
     */
    public java.lang.Boolean getJustThisAccount() {
        return justThisAccount;
    }


    /**
     * Sets the justThisAccount value for this ChangeEmail.
     * 
     * @param justThisAccount
     */
    public void setJustThisAccount(java.lang.Boolean justThisAccount) {
        this.justThisAccount = justThisAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeEmail)) return false;
        ChangeEmail other = (ChangeEmail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentPassword==null && other.getCurrentPassword()==null) || 
             (this.currentPassword!=null &&
              this.currentPassword.equals(other.getCurrentPassword()))) &&
            ((this.newEmail==null && other.getNewEmail()==null) || 
             (this.newEmail!=null &&
              this.newEmail.equals(other.getNewEmail()))) &&
            ((this.newEmail2==null && other.getNewEmail2()==null) || 
             (this.newEmail2!=null &&
              this.newEmail2.equals(other.getNewEmail2()))) &&
            ((this.justThisAccount==null && other.getJustThisAccount()==null) || 
             (this.justThisAccount!=null &&
              this.justThisAccount.equals(other.getJustThisAccount())));
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
        if (getCurrentPassword() != null) {
            _hashCode += getCurrentPassword().hashCode();
        }
        if (getNewEmail() != null) {
            _hashCode += getNewEmail().hashCode();
        }
        if (getNewEmail2() != null) {
            _hashCode += getNewEmail2().hashCode();
        }
        if (getJustThisAccount() != null) {
            _hashCode += getJustThisAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeEmail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "ChangeEmail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "currentPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "newEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newEmail2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "newEmail2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justThisAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "justThisAccount"));
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
