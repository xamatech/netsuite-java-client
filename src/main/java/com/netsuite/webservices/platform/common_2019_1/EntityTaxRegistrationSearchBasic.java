/**
 * EntityTaxRegistrationSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class EntityTaxRegistrationSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField address;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField id;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField nexusCountry;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField taxRegistrationNumber;

    public EntityTaxRegistrationSearchBasic() {
    }

    public EntityTaxRegistrationSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField address,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField id,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField nexusCountry,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField taxRegistrationNumber) {
        this.address = address;
        this.id = id;
        this.nexusCountry = nexusCountry;
        this.taxRegistrationNumber = taxRegistrationNumber;
    }


    /**
     * Gets the address value for this EntityTaxRegistrationSearchBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this EntityTaxRegistrationSearchBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField address) {
        this.address = address;
    }


    /**
     * Gets the id value for this EntityTaxRegistrationSearchBasic.
     * 
     * @return id
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getId() {
        return id;
    }


    /**
     * Sets the id value for this EntityTaxRegistrationSearchBasic.
     * 
     * @param id
     */
    public void setId(com.netsuite.webservices.platform.core_2019_1.SearchLongField id) {
        this.id = id;
    }


    /**
     * Gets the nexusCountry value for this EntityTaxRegistrationSearchBasic.
     * 
     * @return nexusCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getNexusCountry() {
        return nexusCountry;
    }


    /**
     * Sets the nexusCountry value for this EntityTaxRegistrationSearchBasic.
     * 
     * @param nexusCountry
     */
    public void setNexusCountry(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField nexusCountry) {
        this.nexusCountry = nexusCountry;
    }


    /**
     * Gets the taxRegistrationNumber value for this EntityTaxRegistrationSearchBasic.
     * 
     * @return taxRegistrationNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }


    /**
     * Sets the taxRegistrationNumber value for this EntityTaxRegistrationSearchBasic.
     * 
     * @param taxRegistrationNumber
     */
    public void setTaxRegistrationNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityTaxRegistrationSearchBasic)) return false;
        EntityTaxRegistrationSearchBasic other = (EntityTaxRegistrationSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nexusCountry==null && other.getNexusCountry()==null) || 
             (this.nexusCountry!=null &&
              this.nexusCountry.equals(other.getNexusCountry()))) &&
            ((this.taxRegistrationNumber==null && other.getTaxRegistrationNumber()==null) || 
             (this.taxRegistrationNumber!=null &&
              this.taxRegistrationNumber.equals(other.getTaxRegistrationNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNexusCountry() != null) {
            _hashCode += getNexusCountry().hashCode();
        }
        if (getTaxRegistrationNumber() != null) {
            _hashCode += getTaxRegistrationNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityTaxRegistrationSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntityTaxRegistrationSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
