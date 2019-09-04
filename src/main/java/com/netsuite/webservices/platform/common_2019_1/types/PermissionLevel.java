/**
 * PermissionLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1.types;

public class PermissionLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PermissionLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __create = "_create";
    public static final java.lang.String __edit = "_edit";
    public static final java.lang.String __full = "_full";
    public static final java.lang.String __none = "_none";
    public static final java.lang.String __view = "_view";
    public static final PermissionLevel _create = new PermissionLevel(__create);
    public static final PermissionLevel _edit = new PermissionLevel(__edit);
    public static final PermissionLevel _full = new PermissionLevel(__full);
    public static final PermissionLevel _none = new PermissionLevel(__none);
    public static final PermissionLevel _view = new PermissionLevel(__view);
    public java.lang.String getValue() { return _value_;}
    public static PermissionLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PermissionLevel enumeration = (PermissionLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PermissionLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PermissionLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "PermissionLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
