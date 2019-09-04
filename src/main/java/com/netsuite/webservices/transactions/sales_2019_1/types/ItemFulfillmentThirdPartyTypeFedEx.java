/**
 * ItemFulfillmentThirdPartyTypeFedEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class ItemFulfillmentThirdPartyTypeFedEx implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentThirdPartyTypeFedEx(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __billRecipient = "_billRecipient";
    public static final java.lang.String __billThirdParty = "_billThirdParty";
    public static final java.lang.String __noneSelected = "_noneSelected";
    public static final ItemFulfillmentThirdPartyTypeFedEx _billRecipient = new ItemFulfillmentThirdPartyTypeFedEx(__billRecipient);
    public static final ItemFulfillmentThirdPartyTypeFedEx _billThirdParty = new ItemFulfillmentThirdPartyTypeFedEx(__billThirdParty);
    public static final ItemFulfillmentThirdPartyTypeFedEx _noneSelected = new ItemFulfillmentThirdPartyTypeFedEx(__noneSelected);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentThirdPartyTypeFedEx fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentThirdPartyTypeFedEx enumeration = (ItemFulfillmentThirdPartyTypeFedEx)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentThirdPartyTypeFedEx fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentThirdPartyTypeFedEx.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeFedEx"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
