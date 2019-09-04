/**
 * ItemEbayAuctionDuration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class ItemEbayAuctionDuration implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemEbayAuctionDuration(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __10days = "_10days";
    public static final java.lang.String __120days = "_120days";
    public static final java.lang.String __1day = "_1day";
    public static final java.lang.String __30days = "_30days";
    public static final java.lang.String __3days = "_3days";
    public static final java.lang.String __5days = "_5days";
    public static final java.lang.String __60days = "_60days";
    public static final java.lang.String __7days = "_7days";
    public static final java.lang.String __90days = "_90days";
    public static final java.lang.String __goodUntilCancelled = "_goodUntilCancelled";
    public static final ItemEbayAuctionDuration _10days = new ItemEbayAuctionDuration(__10days);
    public static final ItemEbayAuctionDuration _120days = new ItemEbayAuctionDuration(__120days);
    public static final ItemEbayAuctionDuration _1day = new ItemEbayAuctionDuration(__1day);
    public static final ItemEbayAuctionDuration _30days = new ItemEbayAuctionDuration(__30days);
    public static final ItemEbayAuctionDuration _3days = new ItemEbayAuctionDuration(__3days);
    public static final ItemEbayAuctionDuration _5days = new ItemEbayAuctionDuration(__5days);
    public static final ItemEbayAuctionDuration _60days = new ItemEbayAuctionDuration(__60days);
    public static final ItemEbayAuctionDuration _7days = new ItemEbayAuctionDuration(__7days);
    public static final ItemEbayAuctionDuration _90days = new ItemEbayAuctionDuration(__90days);
    public static final ItemEbayAuctionDuration _goodUntilCancelled = new ItemEbayAuctionDuration(__goodUntilCancelled);
    public java.lang.String getValue() { return _value_;}
    public static ItemEbayAuctionDuration fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemEbayAuctionDuration enumeration = (ItemEbayAuctionDuration)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemEbayAuctionDuration fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemEbayAuctionDuration.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemEbayAuctionDuration"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
