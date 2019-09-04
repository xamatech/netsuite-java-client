/**
 * EntityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1.types;

public class EntityType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntityType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __company = "_company";
    public static final java.lang.String __contact = "_contact";
    public static final java.lang.String __customer = "_customer";
    public static final java.lang.String __employee = "_employee";
    public static final java.lang.String __genericResource = "_genericResource";
    public static final java.lang.String __group = "_group";
    public static final java.lang.String __internal = "_internal";
    public static final java.lang.String __job = "_job";
    public static final java.lang.String __otherName = "_otherName";
    public static final java.lang.String __partner = "_partner";
    public static final java.lang.String __resourceGroup = "_resourceGroup";
    public static final java.lang.String __vendor = "_vendor";
    public static final EntityType _company = new EntityType(__company);
    public static final EntityType _contact = new EntityType(__contact);
    public static final EntityType _customer = new EntityType(__customer);
    public static final EntityType _employee = new EntityType(__employee);
    public static final EntityType _genericResource = new EntityType(__genericResource);
    public static final EntityType _group = new EntityType(__group);
    public static final EntityType _internal = new EntityType(__internal);
    public static final EntityType _job = new EntityType(__job);
    public static final EntityType _otherName = new EntityType(__otherName);
    public static final EntityType _partner = new EntityType(__partner);
    public static final EntityType _resourceGroup = new EntityType(__resourceGroup);
    public static final EntityType _vendor = new EntityType(__vendor);
    public java.lang.String getValue() { return _value_;}
    public static EntityType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EntityType enumeration = (EntityType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntityType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EntityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "EntityType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
