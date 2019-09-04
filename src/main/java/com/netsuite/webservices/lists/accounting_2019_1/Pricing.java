/**
 * Pricing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class Pricing  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef priceLevel;

    private java.lang.Double discount;

    private com.netsuite.webservices.lists.accounting_2019_1.PriceList priceList;

    public Pricing() {
    }

    public Pricing(
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef priceLevel,
           java.lang.Double discount,
           com.netsuite.webservices.lists.accounting_2019_1.PriceList priceList) {
           this.currency = currency;
           this.priceLevel = priceLevel;
           this.discount = discount;
           this.priceList = priceList;
    }


    /**
     * Gets the currency value for this Pricing.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Pricing.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the priceLevel value for this Pricing.
     * 
     * @return priceLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this Pricing.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(com.netsuite.webservices.platform.core_2019_1.RecordRef priceLevel) {
        this.priceLevel = priceLevel;
    }


    /**
     * Gets the discount value for this Pricing.
     * 
     * @return discount
     */
    public java.lang.Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this Pricing.
     * 
     * @param discount
     */
    public void setDiscount(java.lang.Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the priceList value for this Pricing.
     * 
     * @return priceList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.PriceList getPriceList() {
        return priceList;
    }


    /**
     * Sets the priceList value for this Pricing.
     * 
     * @param priceList
     */
    public void setPriceList(com.netsuite.webservices.lists.accounting_2019_1.PriceList priceList) {
        this.priceList = priceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pricing)) return false;
        Pricing other = (Pricing) obj;
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
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              this.priceLevel.equals(other.getPriceLevel()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.priceList==null && other.getPriceList()==null) || 
             (this.priceList!=null &&
              this.priceList.equals(other.getPriceList())));
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
        if (getPriceLevel() != null) {
            _hashCode += getPriceLevel().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getPriceList() != null) {
            _hashCode += getPriceList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pricing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "Pricing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "priceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "PriceList"));
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
