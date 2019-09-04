/**
 * ItemCustomFieldItemSubType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1.types;

public class ItemCustomFieldItemSubType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemCustomFieldItemSubType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __both = "_both";
    public static final java.lang.String __purchase = "_purchase";
    public static final java.lang.String __sale = "_sale";
    public static final ItemCustomFieldItemSubType _both = new ItemCustomFieldItemSubType(__both);
    public static final ItemCustomFieldItemSubType _purchase = new ItemCustomFieldItemSubType(__purchase);
    public static final ItemCustomFieldItemSubType _sale = new ItemCustomFieldItemSubType(__sale);
    public java.lang.String getValue() { return _value_;}
    public static ItemCustomFieldItemSubType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemCustomFieldItemSubType enumeration = (ItemCustomFieldItemSubType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemCustomFieldItemSubType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemCustomFieldItemSubType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "ItemCustomFieldItemSubType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
