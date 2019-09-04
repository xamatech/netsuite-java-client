/**
 * CustomerNumberFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1.types;

public class CustomerNumberFormat implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerNumberFormat(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __spaceAsDigitGroupSeparatorAndDecimalComma = "_spaceAsDigitGroupSeparatorAndDecimalComma";
    public static final java.lang.String __spaceAsDigitGroupSeparatorAndDecimalPoint = "_spaceAsDigitGroupSeparatorAndDecimalPoint";
    public static final java.lang.String __commaAsDigitGroupSeparatorAndDecimalPoint = "_commaAsDigitGroupSeparatorAndDecimalPoint";
    public static final java.lang.String __pointAsDigitGroupSeparatorAndDecimalComma = "_pointAsDigitGroupSeparatorAndDecimalComma";
    public static final java.lang.String __apostropheAsDigitGroupSeparatorAndDecimalComma = "_apostropheAsDigitGroupSeparatorAndDecimalComma";
    public static final java.lang.String __apostropheAsDigitGroupSeparatorAndDecimalPoint = "_apostropheAsDigitGroupSeparatorAndDecimalPoint";
    public static final CustomerNumberFormat _spaceAsDigitGroupSeparatorAndDecimalComma = new CustomerNumberFormat(__spaceAsDigitGroupSeparatorAndDecimalComma);
    public static final CustomerNumberFormat _spaceAsDigitGroupSeparatorAndDecimalPoint = new CustomerNumberFormat(__spaceAsDigitGroupSeparatorAndDecimalPoint);
    public static final CustomerNumberFormat _commaAsDigitGroupSeparatorAndDecimalPoint = new CustomerNumberFormat(__commaAsDigitGroupSeparatorAndDecimalPoint);
    public static final CustomerNumberFormat _pointAsDigitGroupSeparatorAndDecimalComma = new CustomerNumberFormat(__pointAsDigitGroupSeparatorAndDecimalComma);
    public static final CustomerNumberFormat _apostropheAsDigitGroupSeparatorAndDecimalComma = new CustomerNumberFormat(__apostropheAsDigitGroupSeparatorAndDecimalComma);
    public static final CustomerNumberFormat _apostropheAsDigitGroupSeparatorAndDecimalPoint = new CustomerNumberFormat(__apostropheAsDigitGroupSeparatorAndDecimalPoint);
    public java.lang.String getValue() { return _value_;}
    public static CustomerNumberFormat fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerNumberFormat enumeration = (CustomerNumberFormat)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerNumberFormat fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerNumberFormat.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "CustomerNumberFormat"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
