/**
 * GetSelectValueFilterOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2024_2.types;

public class GetSelectValueFilterOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetSelectValueFilterOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _contains = "contains";
    public static final java.lang.String _is = "is";
    public static final java.lang.String _startsWith = "startsWith";
    public static final GetSelectValueFilterOperator contains = new GetSelectValueFilterOperator(_contains);
    public static final GetSelectValueFilterOperator is = new GetSelectValueFilterOperator(_is);
    public static final GetSelectValueFilterOperator startsWith = new GetSelectValueFilterOperator(_startsWith);
    public java.lang.String getValue() { return _value_;}
    public static GetSelectValueFilterOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetSelectValueFilterOperator enumeration = (GetSelectValueFilterOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetSelectValueFilterOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetSelectValueFilterOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2024_2.platform.webservices.netsuite.com", "GetSelectValueFilterOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
