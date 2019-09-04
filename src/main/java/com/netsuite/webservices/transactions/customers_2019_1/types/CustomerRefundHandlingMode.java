/**
 * CustomerRefundHandlingMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2019_1.types;

public class CustomerRefundHandlingMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerRefundHandlingMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __process = "_process";
    public static final java.lang.String __recordExternalEvent = "_recordExternalEvent";
    public static final java.lang.String __saveOnly = "_saveOnly";
    public static final CustomerRefundHandlingMode _process = new CustomerRefundHandlingMode(__process);
    public static final CustomerRefundHandlingMode _recordExternalEvent = new CustomerRefundHandlingMode(__recordExternalEvent);
    public static final CustomerRefundHandlingMode _saveOnly = new CustomerRefundHandlingMode(__saveOnly);
    public java.lang.String getValue() { return _value_;}
    public static CustomerRefundHandlingMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerRefundHandlingMode enumeration = (CustomerRefundHandlingMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerRefundHandlingMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerRefundHandlingMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "CustomerRefundHandlingMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
