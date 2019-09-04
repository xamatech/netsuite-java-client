/**
 * TaxGroupTaxItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class TaxGroupTaxItem  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxName;

    private java.lang.Double rate;

    private java.lang.Double basis;

    private java.lang.String taxType;

    public TaxGroupTaxItem() {
    }

    public TaxGroupTaxItem(
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxName,
           java.lang.Double rate,
           java.lang.Double basis,
           java.lang.String taxType) {
           this.taxName = taxName;
           this.rate = rate;
           this.basis = basis;
           this.taxType = taxType;
    }


    /**
     * Gets the taxName value for this TaxGroupTaxItem.
     * 
     * @return taxName
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxName() {
        return taxName;
    }


    /**
     * Sets the taxName value for this TaxGroupTaxItem.
     * 
     * @param taxName
     */
    public void setTaxName(com.netsuite.webservices.platform.core_2019_1.RecordRef taxName) {
        this.taxName = taxName;
    }


    /**
     * Gets the rate value for this TaxGroupTaxItem.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TaxGroupTaxItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the basis value for this TaxGroupTaxItem.
     * 
     * @return basis
     */
    public java.lang.Double getBasis() {
        return basis;
    }


    /**
     * Sets the basis value for this TaxGroupTaxItem.
     * 
     * @param basis
     */
    public void setBasis(java.lang.Double basis) {
        this.basis = basis;
    }


    /**
     * Gets the taxType value for this TaxGroupTaxItem.
     * 
     * @return taxType
     */
    public java.lang.String getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this TaxGroupTaxItem.
     * 
     * @param taxType
     */
    public void setTaxType(java.lang.String taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxGroupTaxItem)) return false;
        TaxGroupTaxItem other = (TaxGroupTaxItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxName==null && other.getTaxName()==null) || 
             (this.taxName!=null &&
              this.taxName.equals(other.getTaxName()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.basis==null && other.getBasis()==null) || 
             (this.basis!=null &&
              this.basis.equals(other.getBasis()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType())));
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
        if (getTaxName() != null) {
            _hashCode += getTaxName().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getBasis() != null) {
            _hashCode += getBasis().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxGroupTaxItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "TaxGroupTaxItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basis");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "basis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxType"));
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
