/**
 * CustomerMonthlyClosing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1.types;

public class CustomerMonthlyClosing implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerMonthlyClosing(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __one = "_one";
    public static final java.lang.String __five = "_five";
    public static final java.lang.String __ten = "_ten";
    public static final java.lang.String __fifteen = "_fifteen";
    public static final java.lang.String __twenty = "_twenty";
    public static final java.lang.String __twentyFive = "_twentyFive";
    public static final java.lang.String __endOfTheMonth = "_endOfTheMonth";
    public static final CustomerMonthlyClosing _one = new CustomerMonthlyClosing(__one);
    public static final CustomerMonthlyClosing _five = new CustomerMonthlyClosing(__five);
    public static final CustomerMonthlyClosing _ten = new CustomerMonthlyClosing(__ten);
    public static final CustomerMonthlyClosing _fifteen = new CustomerMonthlyClosing(__fifteen);
    public static final CustomerMonthlyClosing _twenty = new CustomerMonthlyClosing(__twenty);
    public static final CustomerMonthlyClosing _twentyFive = new CustomerMonthlyClosing(__twentyFive);
    public static final CustomerMonthlyClosing _endOfTheMonth = new CustomerMonthlyClosing(__endOfTheMonth);
    public java.lang.String getValue() { return _value_;}
    public static CustomerMonthlyClosing fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerMonthlyClosing enumeration = (CustomerMonthlyClosing)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerMonthlyClosing fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerMonthlyClosing.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "CustomerMonthlyClosing"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
