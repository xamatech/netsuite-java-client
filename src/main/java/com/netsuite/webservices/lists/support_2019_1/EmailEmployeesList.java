/**
 * EmailEmployeesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class EmailEmployeesList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] emailEmployees;

    public EmailEmployeesList() {
    }

    public EmailEmployeesList(
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] emailEmployees) {
           this.emailEmployees = emailEmployees;
    }


    /**
     * Gets the emailEmployees value for this EmailEmployeesList.
     * 
     * @return emailEmployees
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getEmailEmployees() {
        return emailEmployees;
    }


    /**
     * Sets the emailEmployees value for this EmailEmployeesList.
     * 
     * @param emailEmployees
     */
    public void setEmailEmployees(com.netsuite.webservices.platform.core_2019_1.RecordRef[] emailEmployees) {
        this.emailEmployees = emailEmployees;
    }

    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEmailEmployees(int i) {
        return this.emailEmployees[i];
    }

    public void setEmailEmployees(int i, com.netsuite.webservices.platform.core_2019_1.RecordRef _value) {
        this.emailEmployees[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailEmployeesList)) return false;
        EmailEmployeesList other = (EmailEmployeesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailEmployees==null && other.getEmailEmployees()==null) || 
             (this.emailEmployees!=null &&
              java.util.Arrays.equals(this.emailEmployees, other.getEmailEmployees())));
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
        if (getEmailEmployees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailEmployees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailEmployees(), i);
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
        new org.apache.axis.description.TypeDesc(EmailEmployeesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "EmailEmployeesList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "emailEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
