/**
 * ItemCostingMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class ItemCostingMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemCostingMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __average = "_average";
    public static final java.lang.String __fifo = "_fifo";
    public static final java.lang.String __groupAverage = "_groupAverage";
    public static final java.lang.String __lifo = "_lifo";
    public static final java.lang.String __lotNumbered = "_lotNumbered";
    public static final java.lang.String __serialized = "_serialized";
    public static final java.lang.String __standard = "_standard";
    public static final ItemCostingMethod _average = new ItemCostingMethod(__average);
    public static final ItemCostingMethod _fifo = new ItemCostingMethod(__fifo);
    public static final ItemCostingMethod _groupAverage = new ItemCostingMethod(__groupAverage);
    public static final ItemCostingMethod _lifo = new ItemCostingMethod(__lifo);
    public static final ItemCostingMethod _lotNumbered = new ItemCostingMethod(__lotNumbered);
    public static final ItemCostingMethod _serialized = new ItemCostingMethod(__serialized);
    public static final ItemCostingMethod _standard = new ItemCostingMethod(__standard);
    public java.lang.String getValue() { return _value_;}
    public static ItemCostingMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemCostingMethod enumeration = (ItemCostingMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemCostingMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemCostingMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemCostingMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
