/**
 * TaxFractionUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1.types;

public class TaxFractionUnit implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TaxFractionUnit(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __001andBelow = "_001andBelow";
    public static final java.lang.String __01andBelow = "_01andBelow";
    public static final java.lang.String __100andBelow = "_100andBelow";
    public static final java.lang.String __10andBelow = "_10andBelow";
    public static final java.lang.String __1andBelow = "_1andBelow";
    public static final TaxFractionUnit _001andBelow = new TaxFractionUnit(__001andBelow);
    public static final TaxFractionUnit _01andBelow = new TaxFractionUnit(__01andBelow);
    public static final TaxFractionUnit _100andBelow = new TaxFractionUnit(__100andBelow);
    public static final TaxFractionUnit _10andBelow = new TaxFractionUnit(__10andBelow);
    public static final TaxFractionUnit _1andBelow = new TaxFractionUnit(__1andBelow);
    public java.lang.String getValue() { return _value_;}
    public static TaxFractionUnit fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TaxFractionUnit enumeration = (TaxFractionUnit)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TaxFractionUnit fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TaxFractionUnit.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "TaxFractionUnit"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
