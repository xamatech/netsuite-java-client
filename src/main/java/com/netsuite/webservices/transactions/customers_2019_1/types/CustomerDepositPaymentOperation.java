/**
 * CustomerDepositPaymentOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2019_1.types;

public class CustomerDepositPaymentOperation implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerDepositPaymentOperation(java.lang.String value) {
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
    public static final CustomerDepositPaymentOperation _authorization = new CustomerDepositPaymentOperation(__authorization);
    public static final CustomerDepositPaymentOperation _capture = new CustomerDepositPaymentOperation(__capture);
    public static final CustomerDepositPaymentOperation _sale = new CustomerDepositPaymentOperation(__sale);
    public static final CustomerDepositPaymentOperation _refund = new CustomerDepositPaymentOperation(__refund);
    public static final CustomerDepositPaymentOperation _credit = new CustomerDepositPaymentOperation(__credit);
    public static final CustomerDepositPaymentOperation _refresh = new CustomerDepositPaymentOperation(__refresh);
    public static final CustomerDepositPaymentOperation _void = new CustomerDepositPaymentOperation(__void);
    public java.lang.String getValue() { return _value_;}
    public static CustomerDepositPaymentOperation fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerDepositPaymentOperation enumeration = (CustomerDepositPaymentOperation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerDepositPaymentOperation fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerDepositPaymentOperation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "CustomerDepositPaymentOperation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
