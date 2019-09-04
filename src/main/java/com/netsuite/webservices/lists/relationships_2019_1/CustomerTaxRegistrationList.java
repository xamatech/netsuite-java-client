/**
 * CustomerTaxRegistrationList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerTaxRegistrationList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistration[] customerTaxRegistration;

    private boolean replaceAll;  // attribute

    public CustomerTaxRegistrationList() {
    }

    public CustomerTaxRegistrationList(
           com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistration[] customerTaxRegistration,
           boolean replaceAll) {
           this.customerTaxRegistration = customerTaxRegistration;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the customerTaxRegistration value for this CustomerTaxRegistrationList.
     * 
     * @return customerTaxRegistration
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistration[] getCustomerTaxRegistration() {
        return customerTaxRegistration;
    }


    /**
     * Sets the customerTaxRegistration value for this CustomerTaxRegistrationList.
     * 
     * @param customerTaxRegistration
     */
    public void setCustomerTaxRegistration(com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistration[] customerTaxRegistration) {
        this.customerTaxRegistration = customerTaxRegistration;
    }

    public com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistration getCustomerTaxRegistration(int i) {
        return this.customerTaxRegistration[i];
    }

    public void setCustomerTaxRegistration(int i, com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistration _value) {
        this.customerTaxRegistration[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomerTaxRegistrationList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomerTaxRegistrationList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerTaxRegistrationList)) return false;
        CustomerTaxRegistrationList other = (CustomerTaxRegistrationList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerTaxRegistration==null && other.getCustomerTaxRegistration()==null) || 
             (this.customerTaxRegistration!=null &&
              java.util.Arrays.equals(this.customerTaxRegistration, other.getCustomerTaxRegistration()))) &&
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
        if (getCustomerTaxRegistration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerTaxRegistration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerTaxRegistration(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerTaxRegistrationList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerTaxRegistrationList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerTaxRegistration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customerTaxRegistration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerTaxRegistration"));
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
