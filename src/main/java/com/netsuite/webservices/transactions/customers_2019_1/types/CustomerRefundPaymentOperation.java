/**
 * CustomerRefundPaymentOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2019_1.types;

public class CustomerRefundPaymentOperation implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerRefundPaymentOperation(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __authorization = "_authorization";
    public static final java.lang.String __capture = "_capture";
    public static final java.lang.String __sale = "_sale";
    public static final java.lang.String __refund = "_refund";
    public static final java.lang.String __credit = "_credit";
    public static final java.lang.String __refresh = "_refresh";
    public static final java.lang.String __void = "_void";
    public static final CustomerRefundPaymentOperation _authorization = new CustomerRefundPaymentOperation(__authorization);
    public static final CustomerRefundPaymentOperation _capture = new CustomerRefundPaymentOperation(__capture);
    public static final CustomerRefundPaymentOperation _sale = new CustomerRefundPaymentOperation(__sale);
    public static final CustomerRefundPaymentOperation _refund = new CustomerRefundPaymentOperation(__refund);
    public static final CustomerRefundPaymentOperation _credit = new CustomerRefundPaymentOperation(__credit);
    public static final CustomerRefundPaymentOperation _refresh = new CustomerRefundPaymentOperation(__refresh);
    public static final CustomerRefundPaymentOperation _void = new CustomerRefundPaymentOperation(__void);
    public java.lang.String getValue() { return _value_;}
    public static CustomerRefundPaymentOperation fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerRefundPaymentOperation enumeration = (CustomerRefundPaymentOperation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerRefundPaymentOperation fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerRefundPaymentOperation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "CustomerRefundPaymentOperation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
