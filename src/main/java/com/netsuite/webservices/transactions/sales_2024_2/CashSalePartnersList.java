/**
 * CashSalePartnersList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2024_2;

public class CashSalePartnersList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2024_2.Partners[] partners;

    private boolean replaceAll;  // attribute

    public CashSalePartnersList() {
    }

    public CashSalePartnersList(
           com.netsuite.webservices.platform.common_2024_2.Partners[] partners,
           boolean replaceAll) {
           this.partners = partners;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the partners value for this CashSalePartnersList.
     * 
     * @return partners
     */
    public com.netsuite.webservices.platform.common_2024_2.Partners[] getPartners() {
        return partners;
    }


    /**
     * Sets the partners value for this CashSalePartnersList.
     * 
     * @param partners
     */
    public void setPartners(com.netsuite.webservices.platform.common_2024_2.Partners[] partners) {
        this.partners = partners;
    }

    public com.netsuite.webservices.platform.common_2024_2.Partners getPartners(int i) {
        return this.partners[i];
    }

    public void setPartners(int i, com.netsuite.webservices.platform.common_2024_2.Partners _value) {
        this.partners[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CashSalePartnersList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CashSalePartnersList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CashSalePartnersList)) return false;
        CashSalePartnersList other = (CashSalePartnersList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partners==null && other.getPartners()==null) || 
             (this.partners!=null &&
              java.util.Arrays.equals(this.partners, other.getPartners()))) &&
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
        if (getPartners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartners(), i);
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
        new org.apache.axis.description.TypeDesc(CashSalePartnersList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "CashSalePartnersList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "partners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "Partners"));
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
