/**
 * CustomerItemPricingList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerItemPricingList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricing[] itemPricing;

    private boolean replaceAll;  // attribute

    public CustomerItemPricingList() {
    }

    public CustomerItemPricingList(
           com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricing[] itemPricing,
           boolean replaceAll) {
           this.itemPricing = itemPricing;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the itemPricing value for this CustomerItemPricingList.
     * 
     * @return itemPricing
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricing[] getItemPricing() {
        return itemPricing;
    }


    /**
     * Sets the itemPricing value for this CustomerItemPricingList.
     * 
     * @param itemPricing
     */
    public void setItemPricing(com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricing[] itemPricing) {
        this.itemPricing = itemPricing;
    }

    public com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricing getItemPricing(int i) {
        return this.itemPricing[i];
    }

    public void setItemPricing(int i, com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricing _value) {
        this.itemPricing[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomerItemPricingList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomerItemPricingList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerItemPricingList)) return false;
        CustomerItemPricingList other = (CustomerItemPricingList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemPricing==null && other.getItemPricing()==null) || 
             (this.itemPricing!=null &&
              java.util.Arrays.equals(this.itemPricing, other.getItemPricing()))) &&
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
        if (getItemPricing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPricing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPricing(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerItemPricingList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerItemPricingList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPricing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "itemPricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerItemPricing"));
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
