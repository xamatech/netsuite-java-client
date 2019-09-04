/**
 * PromotionCodeCurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.marketing_2019_1;

public class PromotionCodeCurrency  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.Double minimumOrderAmount;

    public PromotionCodeCurrency() {
    }

    public PromotionCodeCurrency(
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.Double minimumOrderAmount) {
           this.currency = currency;
           this.minimumOrderAmount = minimumOrderAmount;
    }


    /**
     * Gets the currency value for this PromotionCodeCurrency.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PromotionCodeCurrency.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the minimumOrderAmount value for this PromotionCodeCurrency.
     * 
     * @return minimumOrderAmount
     */
    public java.lang.Double getMinimumOrderAmount() {
        return minimumOrderAmount;
    }


    /**
     * Sets the minimumOrderAmount value for this PromotionCodeCurrency.
     * 
     * @param minimumOrderAmount
     */
    public void setMinimumOrderAmount(java.lang.Double minimumOrderAmount) {
        this.minimumOrderAmount = minimumOrderAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionCodeCurrency)) return false;
        PromotionCodeCurrency other = (PromotionCodeCurrency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.minimumOrderAmount==null && other.getMinimumOrderAmount()==null) || 
             (this.minimumOrderAmount!=null &&
              this.minimumOrderAmount.equals(other.getMinimumOrderAmount())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getMinimumOrderAmount() != null) {
            _hashCode += getMinimumOrderAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionCodeCurrency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "PromotionCodeCurrency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "minimumOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
