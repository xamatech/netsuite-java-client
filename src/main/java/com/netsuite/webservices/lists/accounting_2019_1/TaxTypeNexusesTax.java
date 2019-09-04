/**
 * TaxTypeNexusesTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class TaxTypeNexusesTax  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private java.lang.String description;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef saleTaxAcct;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef purchTaxAcct;

    public TaxTypeNexusesTax() {
    }

    public TaxTypeNexusesTax(
           com.netsuite.webservices.platform.core_2019_1.RecordRef nexus,
           java.lang.String description,
           com.netsuite.webservices.platform.core_2019_1.RecordRef saleTaxAcct,
           com.netsuite.webservices.platform.core_2019_1.RecordRef purchTaxAcct) {
           this.nexus = nexus;
           this.description = description;
           this.saleTaxAcct = saleTaxAcct;
           this.purchTaxAcct = purchTaxAcct;
    }


    /**
     * Gets the nexus value for this TaxTypeNexusesTax.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this TaxTypeNexusesTax.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the description value for this TaxTypeNexusesTax.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaxTypeNexusesTax.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the saleTaxAcct value for this TaxTypeNexusesTax.
     * 
     * @return saleTaxAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSaleTaxAcct() {
        return saleTaxAcct;
    }


    /**
     * Sets the saleTaxAcct value for this TaxTypeNexusesTax.
     * 
     * @param saleTaxAcct
     */
    public void setSaleTaxAcct(com.netsuite.webservices.platform.core_2019_1.RecordRef saleTaxAcct) {
        this.saleTaxAcct = saleTaxAcct;
    }


    /**
     * Gets the purchTaxAcct value for this TaxTypeNexusesTax.
     * 
     * @return purchTaxAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchTaxAcct() {
        return purchTaxAcct;
    }


    /**
     * Sets the purchTaxAcct value for this TaxTypeNexusesTax.
     * 
     * @param purchTaxAcct
     */
    public void setPurchTaxAcct(com.netsuite.webservices.platform.core_2019_1.RecordRef purchTaxAcct) {
        this.purchTaxAcct = purchTaxAcct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxTypeNexusesTax)) return false;
        TaxTypeNexusesTax other = (TaxTypeNexusesTax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              this.nexus.equals(other.getNexus()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.saleTaxAcct==null && other.getSaleTaxAcct()==null) || 
             (this.saleTaxAcct!=null &&
              this.saleTaxAcct.equals(other.getSaleTaxAcct()))) &&
            ((this.purchTaxAcct==null && other.getPurchTaxAcct()==null) || 
             (this.purchTaxAcct!=null &&
              this.purchTaxAcct.equals(other.getPurchTaxAcct())));
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
        if (getNexus() != null) {
            _hashCode += getNexus().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSaleTaxAcct() != null) {
            _hashCode += getSaleTaxAcct().hashCode();
        }
        if (getPurchTaxAcct() != null) {
            _hashCode += getPurchTaxAcct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxTypeNexusesTax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "TaxTypeNexusesTax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleTaxAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "saleTaxAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchTaxAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchTaxAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
