/**
 * PriceList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class PriceList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.Price[] price;

    public PriceList() {
    }

    public PriceList(
           com.netsuite.webservices.lists.accounting_2019_1.Price[] price) {
           this.price = price;
    }


    /**
     * Gets the price value for this PriceList.
     * 
     * @return price
     */
    public com.netsuite.webservices.lists.accounting_2019_1.Price[] getPrice() {
        return price;
    }


    /**
     * Sets the price value for this PriceList.
     * 
     * @param price
     */
    public void setPrice(com.netsuite.webservices.lists.accounting_2019_1.Price[] price) {
        this.price = price;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.Price getPrice(int i) {
        return this.price[i];
    }

    public void setPrice(int i, com.netsuite.webservices.lists.accounting_2019_1.Price _value) {
        this.price[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceList)) return false;
        PriceList other = (PriceList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              java.util.Arrays.equals(this.price, other.getPrice())));
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
        if (getPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrice(), i);
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
        new org.apache.axis.description.TypeDesc(PriceList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "PriceList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "Price"));
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
