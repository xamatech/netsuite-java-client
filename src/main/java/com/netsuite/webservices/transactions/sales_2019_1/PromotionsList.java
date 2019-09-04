/**
 * PromotionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class PromotionsList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.sales_2019_1.Promotions[] promotions;

    private boolean replaceAll;  // attribute

    public PromotionsList() {
    }

    public PromotionsList(
           com.netsuite.webservices.transactions.sales_2019_1.Promotions[] promotions,
           boolean replaceAll) {
           this.promotions = promotions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the promotions value for this PromotionsList.
     * 
     * @return promotions
     */
    public com.netsuite.webservices.transactions.sales_2019_1.Promotions[] getPromotions() {
        return promotions;
    }


    /**
     * Sets the promotions value for this PromotionsList.
     * 
     * @param promotions
     */
    public void setPromotions(com.netsuite.webservices.transactions.sales_2019_1.Promotions[] promotions) {
        this.promotions = promotions;
    }

    public com.netsuite.webservices.transactions.sales_2019_1.Promotions getPromotions(int i) {
        return this.promotions[i];
    }

    public void setPromotions(int i, com.netsuite.webservices.transactions.sales_2019_1.Promotions _value) {
        this.promotions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PromotionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PromotionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionsList)) return false;
        PromotionsList other = (PromotionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.promotions==null && other.getPromotions()==null) || 
             (this.promotions!=null &&
              java.util.Arrays.equals(this.promotions, other.getPromotions()))) &&
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
        if (getPromotions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotions(), i);
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
        new org.apache.axis.description.TypeDesc(PromotionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "PromotionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "promotions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "Promotions"));
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
