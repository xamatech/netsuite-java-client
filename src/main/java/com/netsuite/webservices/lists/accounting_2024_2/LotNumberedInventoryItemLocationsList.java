/**
 * LotNumberedInventoryItemLocationsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class LotNumberedInventoryItemLocationsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.LotNumberedInventoryItemLocations[] locations;

    private boolean replaceAll;  // attribute

    public LotNumberedInventoryItemLocationsList() {
    }

    public LotNumberedInventoryItemLocationsList(
           com.netsuite.webservices.lists.accounting_2024_2.LotNumberedInventoryItemLocations[] locations,
           boolean replaceAll) {
           this.locations = locations;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the locations value for this LotNumberedInventoryItemLocationsList.
     * 
     * @return locations
     */
    public com.netsuite.webservices.lists.accounting_2024_2.LotNumberedInventoryItemLocations[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this LotNumberedInventoryItemLocationsList.
     * 
     * @param locations
     */
    public void setLocations(com.netsuite.webservices.lists.accounting_2024_2.LotNumberedInventoryItemLocations[] locations) {
        this.locations = locations;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.LotNumberedInventoryItemLocations getLocations(int i) {
        return this.locations[i];
    }

    public void setLocations(int i, com.netsuite.webservices.lists.accounting_2024_2.LotNumberedInventoryItemLocations _value) {
        this.locations[i] = _value;
    }


    /**
     * Gets the replaceAll value for this LotNumberedInventoryItemLocationsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this LotNumberedInventoryItemLocationsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LotNumberedInventoryItemLocationsList)) return false;
        LotNumberedInventoryItemLocationsList other = (LotNumberedInventoryItemLocationsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations()))) &&
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
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
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
        new org.apache.axis.description.TypeDesc(LotNumberedInventoryItemLocationsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "LotNumberedInventoryItemLocationsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "LotNumberedInventoryItemLocations"));
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
