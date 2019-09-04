/**
 * ChangePassword.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class ChangePassword  implements java.io.Serializable {
    private java.lang.String currentPassword;

    private java.lang.String newPassword;

    private java.lang.String newPassword2;

    public ChangePassword() {
    }

    public ChangePassword(
           java.lang.String currentPassword,
           java.lang.String newPassword,
           java.lang.String newPassword2) {
           this.currentPassword = currentPassword;
           this.newPassword = newPassword;
           this.newPassword2 = newPassword2;
    }


    /**
     * Gets the currentPassword value for this ChangePassword.
     * 
     * @return currentPassword
     */
    public java.lang.String getCurrentPassword() {
        return currentPassword;
    }


    /**
     * Sets the currentPassword value for this ChangePassword.
     * 
     * @param currentPassword
     */
    public void setCurrentPassword(java.lang.String currentPassword) {
        this.currentPassword = currentPassword;
    }


    /**
     * Gets the newPassword value for this ChangePassword.
     * 
     * @return newPassword
     */
    public java.lang.String getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this ChangePassword.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String newPassword) {
        this.newPassword = newPassword;
    }


    /**
     * Gets the newPassword2 value for this ChangePassword.
     * 
     * @return newPassword2
     */
    public java.lang.String getNewPassword2() {
        return newPassword2;
    }


    /**
     * Sets the newPassword2 value for this ChangePassword.
     * 
     * @param newPassword2
     */
    public void setNewPassword2(java.lang.String newPassword2) {
        this.newPassword2 = newPassword2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePassword)) return false;
        ChangePassword other = (ChangePassword) obj;
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
            ((this.newPassword==null && other.getNewPassword()==null) || 
             (this.newPassword!=null &&
              this.newPassword.equals(other.getNewPassword()))) &&
            ((this.newPassword2==null && other.getNewPassword2()==null) || 
             (this.newPassword2!=null &&
              this.newPassword2.equals(other.getNewPassword2())));
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
        if (getNewPassword() != null) {
            _hashCode += getNewPassword().hashCode();
        }
        if (getNewPassword2() != null) {
            _hashCode += getNewPassword2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePassword.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "ChangePassword"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "currentPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "newPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "newPassword2"));
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
