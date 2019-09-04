/**
 * PaymentInstrumentSupportedOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class PaymentInstrumentSupportedOperation implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentInstrumentSupportedOperation(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __authorization = "_authorization";
    public static final java.lang.String __capture = "_capture";
    public static final java.lang.String __sale = "_sale";
    public static final java.lang.String __credit = "_credit";
    public static final java.lang.String __refund = "_refund";
    public static final java.lang.String __override = "_override";
    public static final java.lang.String __void = "_void";
    public static final java.lang.String __refresh = "_refresh";
    public static final PaymentInstrumentSupportedOperation _authorization = new PaymentInstrumentSupportedOperation(__authorization);
    public static final PaymentInstrumentSupportedOperation _capture = new PaymentInstrumentSupportedOperation(__capture);
    public static final PaymentInstrumentSupportedOperation _sale = new PaymentInstrumentSupportedOperation(__sale);
    public static final PaymentInstrumentSupportedOperation _credit = new PaymentInstrumentSupportedOperation(__credit);
    public static final PaymentInstrumentSupportedOperation _refund = new PaymentInstrumentSupportedOperation(__refund);
    public static final PaymentInstrumentSupportedOperation _override = new PaymentInstrumentSupportedOperation(__override);
    public static final PaymentInstrumentSupportedOperation _void = new PaymentInstrumentSupportedOperation(__void);
    public static final PaymentInstrumentSupportedOperation _refresh = new PaymentInstrumentSupportedOperation(__refresh);
    public java.lang.String getValue() { return _value_;}
    public static PaymentInstrumentSupportedOperation fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PaymentInstrumentSupportedOperation enumeration = (PaymentInstrumentSupportedOperation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentInstrumentSupportedOperation fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentInstrumentSupportedOperation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "PaymentInstrumentSupportedOperation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
