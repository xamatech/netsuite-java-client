/**
 * EntityGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1.types;

public class EntityGroupType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntityGroupType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __contact = "_contact";
    public static final java.lang.String __customer = "_customer";
    public static final java.lang.String __employee = "_employee";
    public static final java.lang.String __partner = "_partner";
    public static final java.lang.String __vendor = "_vendor";
    public static final EntityGroupType _contact = new EntityGroupType(__contact);
    public static final EntityGroupType _customer = new EntityGroupType(__customer);
    public static final EntityGroupType _employee = new EntityGroupType(__employee);
    public static final EntityGroupType _partner = new EntityGroupType(__partner);
    public static final EntityGroupType _vendor = new EntityGroupType(__vendor);
    public java.lang.String getValue() { return _value_;}
    public static EntityGroupType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EntityGroupType enumeration = (EntityGroupType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntityGroupType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EntityGroupType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "EntityGroupType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
