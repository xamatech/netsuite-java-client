/**
 * EmployeeAddressbookList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeAddressbookList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbook[] addressbook;

    private boolean replaceAll;  // attribute

    public EmployeeAddressbookList() {
    }

    public EmployeeAddressbookList(
           com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbook[] addressbook,
           boolean replaceAll) {
           this.addressbook = addressbook;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the addressbook value for this EmployeeAddressbookList.
     * 
     * @return addressbook
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbook[] getAddressbook() {
        return addressbook;
    }


    /**
     * Sets the addressbook value for this EmployeeAddressbookList.
     * 
     * @param addressbook
     */
    public void setAddressbook(com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbook[] addressbook) {
        this.addressbook = addressbook;
    }

    public com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbook getAddressbook(int i) {
        return this.addressbook[i];
    }

    public void setAddressbook(int i, com.netsuite.webservices.lists.employees_2019_1.EmployeeAddressbook _value) {
        this.addressbook[i] = _value;
    }


    /**
     * Gets the replaceAll value for this EmployeeAddressbookList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this EmployeeAddressbookList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeAddressbookList)) return false;
        EmployeeAddressbookList other = (EmployeeAddressbookList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressbook==null && other.getAddressbook()==null) || 
             (this.addressbook!=null &&
              java.util.Arrays.equals(this.addressbook, other.getAddressbook()))) &&
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
        if (getAddressbook() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressbook());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressbook(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeAddressbookList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeAddressbookList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressbook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "addressbook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeAddressbook"));
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
