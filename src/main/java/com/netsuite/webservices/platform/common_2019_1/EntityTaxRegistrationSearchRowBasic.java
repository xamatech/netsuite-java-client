/**
 * EntityTaxRegistrationSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class EntityTaxRegistrationSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] address;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] nexusCountry;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxRegistrationNumber;

    public EntityTaxRegistrationSearchRowBasic() {
    }

    public EntityTaxRegistrationSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] address,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] nexusCountry,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxRegistrationNumber) {
        this.address = address;
        this.id = id;
        this.nexusCountry = nexusCountry;
        this.taxRegistrationNumber = taxRegistrationNumber;
    }


    /**
     * Gets the address value for this EntityTaxRegistrationSearchRowBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this EntityTaxRegistrationSearchRowBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] address) {
        this.address = address;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.address[i] = _value;
    }


    /**
     * Gets the id value for this EntityTaxRegistrationSearchRowBasic.
     * 
     * @return id
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getId() {
        return id;
    }


    /**
     * Sets the id value for this EntityTaxRegistrationSearchRowBasic.
     * 
     * @param id
     */
    public void setId(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id) {
        this.id = id;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.id[i] = _value;
    }


    /**
     * Gets the nexusCountry value for this EntityTaxRegistrationSearchRowBasic.
     * 
     * @return nexusCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getNexusCountry() {
        return nexusCountry;
    }


    /**
     * Sets the nexusCountry value for this EntityTaxRegistrationSearchRowBasic.
     * 
     * @param nexusCountry
     */
    public void setNexusCountry(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] nexusCountry) {
        this.nexusCountry = nexusCountry;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getNexusCountry(int i) {
        return this.nexusCountry[i];
    }

    public void setNexusCountry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.nexusCountry[i] = _value;
    }


    /**
     * Gets the taxRegistrationNumber value for this EntityTaxRegistrationSearchRowBasic.
     * 
     * @return taxRegistrationNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }


    /**
     * Sets the taxRegistrationNumber value for this EntityTaxRegistrationSearchRowBasic.
     * 
     * @param taxRegistrationNumber
     */
    public void setTaxRegistrationNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTaxRegistrationNumber(int i) {
        return this.taxRegistrationNumber[i];
    }

    public void setTaxRegistrationNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.taxRegistrationNumber[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityTaxRegistrationSearchRowBasic)) return false;
        EntityTaxRegistrationSearchRowBasic other = (EntityTaxRegistrationSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              java.util.Arrays.equals(this.id, other.getId()))) &&
            ((this.nexusCountry==null && other.getNexusCountry()==null) || 
             (this.nexusCountry!=null &&
              java.util.Arrays.equals(this.nexusCountry, other.getNexusCountry()))) &&
            ((this.taxRegistrationNumber==null && other.getTaxRegistrationNumber()==null) || 
             (this.taxRegistrationNumber!=null &&
              java.util.Arrays.equals(this.taxRegistrationNumber, other.getTaxRegistrationNumber())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNexusCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNexusCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNexusCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxRegistrationNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxRegistrationNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxRegistrationNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityTaxRegistrationSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntityTaxRegistrationSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
