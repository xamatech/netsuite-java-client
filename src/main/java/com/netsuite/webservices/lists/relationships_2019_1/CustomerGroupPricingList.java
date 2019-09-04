/**
 * CustomerGroupPricingList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerGroupPricingList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricing[] groupPricing;

    private boolean replaceAll;  // attribute

    public CustomerGroupPricingList() {
    }

    public CustomerGroupPricingList(
           com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricing[] groupPricing,
           boolean replaceAll) {
           this.groupPricing = groupPricing;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the groupPricing value for this CustomerGroupPricingList.
     * 
     * @return groupPricing
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricing[] getGroupPricing() {
        return groupPricing;
    }


    /**
     * Sets the groupPricing value for this CustomerGroupPricingList.
     * 
     * @param groupPricing
     */
    public void setGroupPricing(com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricing[] groupPricing) {
        this.groupPricing = groupPricing;
    }

    public com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricing getGroupPricing(int i) {
        return this.groupPricing[i];
    }

    public void setGroupPricing(int i, com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricing _value) {
        this.groupPricing[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomerGroupPricingList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomerGroupPricingList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerGroupPricingList)) return false;
        CustomerGroupPricingList other = (CustomerGroupPricingList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupPricing==null && other.getGroupPricing()==null) || 
             (this.groupPricing!=null &&
              java.util.Arrays.equals(this.groupPricing, other.getGroupPricing()))) &&
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
        if (getGroupPricing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupPricing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupPricing(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerGroupPricingList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerGroupPricingList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupPricing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "groupPricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerGroupPricing"));
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
