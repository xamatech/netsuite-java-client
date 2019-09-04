/**
 * VendorAddressbook.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class VendorAddressbook  implements java.io.Serializable {
    private java.lang.Boolean defaultShipping;

    private java.lang.Boolean defaultBilling;

    private java.lang.String label;

    private java.lang.String internalId;

    private com.netsuite.webservices.platform.common_2019_1.Address addressbookAddress;

    public VendorAddressbook() {
    }

    public VendorAddressbook(
           java.lang.Boolean defaultShipping,
           java.lang.Boolean defaultBilling,
           java.lang.String label,
           java.lang.String internalId,
           com.netsuite.webservices.platform.common_2019_1.Address addressbookAddress) {
           this.defaultShipping = defaultShipping;
           this.defaultBilling = defaultBilling;
           this.label = label;
           this.internalId = internalId;
           this.addressbookAddress = addressbookAddress;
    }


    /**
     * Gets the defaultShipping value for this VendorAddressbook.
     * 
     * @return defaultShipping
     */
    public java.lang.Boolean getDefaultShipping() {
        return defaultShipping;
    }


    /**
     * Sets the defaultShipping value for this VendorAddressbook.
     * 
     * @param defaultShipping
     */
    public void setDefaultShipping(java.lang.Boolean defaultShipping) {
        this.defaultShipping = defaultShipping;
    }


    /**
     * Gets the defaultBilling value for this VendorAddressbook.
     * 
     * @return defaultBilling
     */
    public java.lang.Boolean getDefaultBilling() {
        return defaultBilling;
    }


    /**
     * Sets the defaultBilling value for this VendorAddressbook.
     * 
     * @param defaultBilling
     */
    public void setDefaultBilling(java.lang.Boolean defaultBilling) {
        this.defaultBilling = defaultBilling;
    }


    /**
     * Gets the label value for this VendorAddressbook.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this VendorAddressbook.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the internalId value for this VendorAddressbook.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this VendorAddressbook.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the addressbookAddress value for this VendorAddressbook.
     * 
     * @return addressbookAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getAddressbookAddress() {
        return addressbookAddress;
    }


    /**
     * Sets the addressbookAddress value for this VendorAddressbook.
     * 
     * @param addressbookAddress
     */
    public void setAddressbookAddress(com.netsuite.webservices.platform.common_2019_1.Address addressbookAddress) {
        this.addressbookAddress = addressbookAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorAddressbook)) return false;
        VendorAddressbook other = (VendorAddressbook) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defaultShipping==null && other.getDefaultShipping()==null) || 
             (this.defaultShipping!=null &&
              this.defaultShipping.equals(other.getDefaultShipping()))) &&
            ((this.defaultBilling==null && other.getDefaultBilling()==null) || 
             (this.defaultBilling!=null &&
              this.defaultBilling.equals(other.getDefaultBilling()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.addressbookAddress==null && other.getAddressbookAddress()==null) || 
             (this.addressbookAddress!=null &&
              this.addressbookAddress.equals(other.getAddressbookAddress())));
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
        if (getDefaultShipping() != null) {
            _hashCode += getDefaultShipping().hashCode();
        }
        if (getDefaultBilling() != null) {
            _hashCode += getDefaultBilling().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getAddressbookAddress() != null) {
            _hashCode += getAddressbookAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorAddressbook.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorAddressbook"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "defaultShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "defaultBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressbookAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "addressbookAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
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
