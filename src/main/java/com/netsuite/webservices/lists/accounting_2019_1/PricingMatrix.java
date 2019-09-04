/**
 * PricingMatrix.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class PricingMatrix  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.Pricing[] pricing;

    private boolean replaceAll;  // attribute

    public PricingMatrix() {
    }

    public PricingMatrix(
           com.netsuite.webservices.lists.accounting_2019_1.Pricing[] pricing,
           boolean replaceAll) {
           this.pricing = pricing;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the pricing value for this PricingMatrix.
     * 
     * @return pricing
     */
    public com.netsuite.webservices.lists.accounting_2019_1.Pricing[] getPricing() {
        return pricing;
    }


    /**
     * Sets the pricing value for this PricingMatrix.
     * 
     * @param pricing
     */
    public void setPricing(com.netsuite.webservices.lists.accounting_2019_1.Pricing[] pricing) {
        this.pricing = pricing;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.Pricing getPricing(int i) {
        return this.pricing[i];
    }

    public void setPricing(int i, com.netsuite.webservices.lists.accounting_2019_1.Pricing _value) {
        this.pricing[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PricingMatrix.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PricingMatrix.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricingMatrix)) return false;
        PricingMatrix other = (PricingMatrix) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pricing==null && other.getPricing()==null) || 
             (this.pricing!=null &&
              java.util.Arrays.equals(this.pricing, other.getPricing()))) &&
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
        if (getPricing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricing(), i);
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
        new org.apache.axis.description.TypeDesc(PricingMatrix.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "PricingMatrix"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "pricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "Pricing"));
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
