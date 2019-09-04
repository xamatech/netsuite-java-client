/**
 * SubsidiaryTaxRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class SubsidiaryTaxRegistration  implements java.io.Serializable {
    private java.lang.Long id;

    private com.netsuite.webservices.platform.common_2019_1.types.Country nexusCountry;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxAgency;

    private java.lang.String taxRegistrationNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxEngine;

    private java.util.Calendar effectiveFrom;

    private java.util.Calendar validUntil;

    public SubsidiaryTaxRegistration() {
    }

    public SubsidiaryTaxRegistration(
           java.lang.Long id,
           com.netsuite.webservices.platform.common_2019_1.types.Country nexusCountry,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nexus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxAgency,
           java.lang.String taxRegistrationNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxEngine,
           java.util.Calendar effectiveFrom,
           java.util.Calendar validUntil) {
           this.id = id;
           this.nexusCountry = nexusCountry;
           this.nexus = nexus;
           this.taxAgency = taxAgency;
           this.taxRegistrationNumber = taxRegistrationNumber;
           this.taxEngine = taxEngine;
           this.effectiveFrom = effectiveFrom;
           this.validUntil = validUntil;
    }


    /**
     * Gets the id value for this SubsidiaryTaxRegistration.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this SubsidiaryTaxRegistration.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the nexusCountry value for this SubsidiaryTaxRegistration.
     * 
     * @return nexusCountry
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Country getNexusCountry() {
        return nexusCountry;
    }


    /**
     * Sets the nexusCountry value for this SubsidiaryTaxRegistration.
     * 
     * @param nexusCountry
     */
    public void setNexusCountry(com.netsuite.webservices.platform.common_2019_1.types.Country nexusCountry) {
        this.nexusCountry = nexusCountry;
    }


    /**
     * Gets the nexus value for this SubsidiaryTaxRegistration.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this SubsidiaryTaxRegistration.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the taxAgency value for this SubsidiaryTaxRegistration.
     * 
     * @return taxAgency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxAgency() {
        return taxAgency;
    }


    /**
     * Sets the taxAgency value for this SubsidiaryTaxRegistration.
     * 
     * @param taxAgency
     */
    public void setTaxAgency(com.netsuite.webservices.platform.core_2019_1.RecordRef taxAgency) {
        this.taxAgency = taxAgency;
    }


    /**
     * Gets the taxRegistrationNumber value for this SubsidiaryTaxRegistration.
     * 
     * @return taxRegistrationNumber
     */
    public java.lang.String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }


    /**
     * Sets the taxRegistrationNumber value for this SubsidiaryTaxRegistration.
     * 
     * @param taxRegistrationNumber
     */
    public void setTaxRegistrationNumber(java.lang.String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }


    /**
     * Gets the taxEngine value for this SubsidiaryTaxRegistration.
     * 
     * @return taxEngine
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxEngine() {
        return taxEngine;
    }


    /**
     * Sets the taxEngine value for this SubsidiaryTaxRegistration.
     * 
     * @param taxEngine
     */
    public void setTaxEngine(com.netsuite.webservices.platform.core_2019_1.RecordRef taxEngine) {
        this.taxEngine = taxEngine;
    }


    /**
     * Gets the effectiveFrom value for this SubsidiaryTaxRegistration.
     * 
     * @return effectiveFrom
     */
    public java.util.Calendar getEffectiveFrom() {
        return effectiveFrom;
    }


    /**
     * Sets the effectiveFrom value for this SubsidiaryTaxRegistration.
     * 
     * @param effectiveFrom
     */
    public void setEffectiveFrom(java.util.Calendar effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }


    /**
     * Gets the validUntil value for this SubsidiaryTaxRegistration.
     * 
     * @return validUntil
     */
    public java.util.Calendar getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this SubsidiaryTaxRegistration.
     * 
     * @param validUntil
     */
    public void setValidUntil(java.util.Calendar validUntil) {
        this.validUntil = validUntil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubsidiaryTaxRegistration)) return false;
        SubsidiaryTaxRegistration other = (SubsidiaryTaxRegistration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nexusCountry==null && other.getNexusCountry()==null) || 
             (this.nexusCountry!=null &&
              this.nexusCountry.equals(other.getNexusCountry()))) &&
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              this.nexus.equals(other.getNexus()))) &&
            ((this.taxAgency==null && other.getTaxAgency()==null) || 
             (this.taxAgency!=null &&
              this.taxAgency.equals(other.getTaxAgency()))) &&
            ((this.taxRegistrationNumber==null && other.getTaxRegistrationNumber()==null) || 
             (this.taxRegistrationNumber!=null &&
              this.taxRegistrationNumber.equals(other.getTaxRegistrationNumber()))) &&
            ((this.taxEngine==null && other.getTaxEngine()==null) || 
             (this.taxEngine!=null &&
              this.taxEngine.equals(other.getTaxEngine()))) &&
            ((this.effectiveFrom==null && other.getEffectiveFrom()==null) || 
             (this.effectiveFrom!=null &&
              this.effectiveFrom.equals(other.getEffectiveFrom()))) &&
            ((this.validUntil==null && other.getValidUntil()==null) || 
             (this.validUntil!=null &&
              this.validUntil.equals(other.getValidUntil())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNexusCountry() != null) {
            _hashCode += getNexusCountry().hashCode();
        }
        if (getNexus() != null) {
            _hashCode += getNexus().hashCode();
        }
        if (getTaxAgency() != null) {
            _hashCode += getTaxAgency().hashCode();
        }
        if (getTaxRegistrationNumber() != null) {
            _hashCode += getTaxRegistrationNumber().hashCode();
        }
        if (getTaxEngine() != null) {
            _hashCode += getTaxEngine().hashCode();
        }
        if (getEffectiveFrom() != null) {
            _hashCode += getEffectiveFrom().hashCode();
        }
        if (getValidUntil() != null) {
            _hashCode += getValidUntil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubsidiaryTaxRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SubsidiaryTaxRegistration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAgency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxAgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxEngine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "effectiveFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "validUntil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
