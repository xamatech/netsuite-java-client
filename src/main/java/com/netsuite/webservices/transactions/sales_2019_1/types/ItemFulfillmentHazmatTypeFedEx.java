/**
 * ItemFulfillmentHazmatTypeFedEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class ItemFulfillmentHazmatTypeFedEx implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentHazmatTypeFedEx(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __dangerousGoods = "_dangerousGoods";
    public static final java.lang.String __hazmat = "_hazmat";
    public static final ItemFulfillmentHazmatTypeFedEx _dangerousGoods = new ItemFulfillmentHazmatTypeFedEx(__dangerousGoods);
    public static final ItemFulfillmentHazmatTypeFedEx _hazmat = new ItemFulfillmentHazmatTypeFedEx(__hazmat);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentHazmatTypeFedEx fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentHazmatTypeFedEx enumeration = (ItemFulfillmentHazmatTypeFedEx)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentHazmatTypeFedEx fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemFulfillmentHazmatTypeFedEx.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentHazmatTypeFedEx"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
