/**
 * ItemBinNumberSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ItemBinNumberSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField binNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnHand;

    public ItemBinNumberSearchBasic() {
    }

    public ItemBinNumberSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField binNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityAvailable,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnHand) {
        this.binNumber = binNumber;
        this.location = location;
        this.quantityAvailable = quantityAvailable;
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the binNumber value for this ItemBinNumberSearchBasic.
     * 
     * @return binNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this ItemBinNumberSearchBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField binNumber) {
        this.binNumber = binNumber;
    }


    /**
     * Gets the location value for this ItemBinNumberSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemBinNumberSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the quantityAvailable value for this ItemBinNumberSearchBasic.
     * 
     * @return quantityAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this ItemBinNumberSearchBasic.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the quantityOnHand value for this ItemBinNumberSearchBasic.
     * 
     * @return quantityOnHand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this ItemBinNumberSearchBasic.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemBinNumberSearchBasic)) return false;
        ItemBinNumberSearchBasic other = (ItemBinNumberSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              this.binNumber.equals(other.getBinNumber()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand())));
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
        if (getBinNumber() != null) {
            _hashCode += getBinNumber().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemBinNumberSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemBinNumberSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
