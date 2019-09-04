/**
 * VendorTaxRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class VendorTaxRegistration  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.types.Country nexusCountry;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef address;

    private java.lang.String taxRegistrationNumber;

    private java.lang.Long id;

    public VendorTaxRegistration() {
    }

    public VendorTaxRegistration(
           com.netsuite.webservices.platform.common_2019_1.types.Country nexusCountry,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nexus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef address,
           java.lang.String taxRegistrationNumber,
           java.lang.Long id) {
           this.nexusCountry = nexusCountry;
           this.nexus = nexus;
           this.address = address;
           this.taxRegistrationNumber = taxRegistrationNumber;
           this.id = id;
    }


    /**
     * Gets the nexusCountry value for this VendorTaxRegistration.
     * 
     * @return nexusCountry
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Country getNexusCountry() {
        return nexusCountry;
    }


    /**
     * Sets the nexusCountry value for this VendorTaxRegistration.
     * 
     * @param nexusCountry
     */
    public void setNexusCountry(com.netsuite.webservices.platform.common_2019_1.types.Country nexusCountry) {
        this.nexusCountry = nexusCountry;
    }


    /**
     * Gets the nexus value for this VendorTaxRegistration.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this VendorTaxRegistration.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the address value for this VendorTaxRegistration.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAddress() {
        return address;
    }


    /**
     * Sets the address value for this VendorTaxRegistration.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.RecordRef address) {
        this.address = address;
    }


    /**
     * Gets the taxRegistrationNumber value for this VendorTaxRegistration.
     * 
     * @return taxRegistrationNumber
     */
    public java.lang.String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }


    /**
     * Sets the taxRegistrationNumber value for this VendorTaxRegistration.
     * 
     * @param taxRegistrationNumber
     */
    public void setTaxRegistrationNumber(java.lang.String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }


    /**
     * Gets the id value for this VendorTaxRegistration.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this VendorTaxRegistration.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorTaxRegistration)) return false;
        VendorTaxRegistration other = (VendorTaxRegistration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nexusCountry==null && other.getNexusCountry()==null) || 
             (this.nexusCountry!=null &&
              this.nexusCountry.equals(other.getNexusCountry()))) &&
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              this.nexus.equals(other.getNexus()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.taxRegistrationNumber==null && other.getTaxRegistrationNumber()==null) || 
             (this.taxRegistrationNumber!=null &&
              this.taxRegistrationNumber.equals(other.getTaxRegistrationNumber()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getNexusCountry() != null) {
            _hashCode += getNexusCountry().hashCode();
        }
        if (getNexus() != null) {
            _hashCode += getNexus().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getTaxRegistrationNumber() != null) {
            _hashCode += getTaxRegistrationNumber().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorTaxRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorTaxRegistration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
