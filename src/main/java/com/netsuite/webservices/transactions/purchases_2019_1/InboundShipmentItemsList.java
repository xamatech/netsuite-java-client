/**
 * InboundShipmentItemsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class InboundShipmentItemsList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItems[] inboundShipmentItems;

    private boolean replaceAll;  // attribute

    public InboundShipmentItemsList() {
    }

    public InboundShipmentItemsList(
           com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItems[] inboundShipmentItems,
           boolean replaceAll) {
           this.inboundShipmentItems = inboundShipmentItems;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the inboundShipmentItems value for this InboundShipmentItemsList.
     * 
     * @return inboundShipmentItems
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItems[] getInboundShipmentItems() {
        return inboundShipmentItems;
    }


    /**
     * Sets the inboundShipmentItems value for this InboundShipmentItemsList.
     * 
     * @param inboundShipmentItems
     */
    public void setInboundShipmentItems(com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItems[] inboundShipmentItems) {
        this.inboundShipmentItems = inboundShipmentItems;
    }

    public com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItems getInboundShipmentItems(int i) {
        return this.inboundShipmentItems[i];
    }

    public void setInboundShipmentItems(int i, com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItems _value) {
        this.inboundShipmentItems[i] = _value;
    }


    /**
     * Gets the replaceAll value for this InboundShipmentItemsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this InboundShipmentItemsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundShipmentItemsList)) return false;
        InboundShipmentItemsList other = (InboundShipmentItemsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inboundShipmentItems==null && other.getInboundShipmentItems()==null) || 
             (this.inboundShipmentItems!=null &&
              java.util.Arrays.equals(this.inboundShipmentItems, other.getInboundShipmentItems()))) &&
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
        if (getInboundShipmentItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInboundShipmentItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInboundShipmentItems(), i);
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
        new org.apache.axis.description.TypeDesc(InboundShipmentItemsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentItemsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundShipmentItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "inboundShipmentItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentItems"));
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
