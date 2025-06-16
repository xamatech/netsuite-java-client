/**
 * PaymentInstrumentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2.types;

public class PaymentInstrumentType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentInstrumentType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __paymentCard = "_paymentCard";
    public static final java.lang.String __generalToken = "_generalToken";
    public static final java.lang.String __paymentCardToken = "_paymentCardToken";
    public static final java.lang.String __paymentCardSwipe = "_paymentCardSwipe";
    public static final java.lang.String __emv = "_emv";
    public static final java.lang.String __externalCheckout = "_externalCheckout";
    public static final java.lang.String __cash = "_cash";
    public static final java.lang.String __check = "_check";
    public static final java.lang.String __offline = "_offline";
    public static final java.lang.String __payByReference = "_payByReference";
    public static final java.lang.String __ach = "_ach";
    public static final java.lang.String __payPal = "_payPal";
    public static final PaymentInstrumentType _paymentCard = new PaymentInstrumentType(__paymentCard);
    public static final PaymentInstrumentType _generalToken = new PaymentInstrumentType(__generalToken);
    public static final PaymentInstrumentType _paymentCardToken = new PaymentInstrumentType(__paymentCardToken);
    public static final PaymentInstrumentType _paymentCardSwipe = new PaymentInstrumentType(__paymentCardSwipe);
    public static final PaymentInstrumentType _emv = new PaymentInstrumentType(__emv);
    public static final PaymentInstrumentType _externalCheckout = new PaymentInstrumentType(__externalCheckout);
    public static final PaymentInstrumentType _cash = new PaymentInstrumentType(__cash);
    public static final PaymentInstrumentType _check = new PaymentInstrumentType(__check);
    public static final PaymentInstrumentType _offline = new PaymentInstrumentType(__offline);
    public static final PaymentInstrumentType _payByReference = new PaymentInstrumentType(__payByReference);
    public static final PaymentInstrumentType _ach = new PaymentInstrumentType(__ach);
    public static final PaymentInstrumentType _payPal = new PaymentInstrumentType(__payPal);
    public java.lang.String getValue() { return _value_;}
    public static PaymentInstrumentType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PaymentInstrumentType enumeration = (PaymentInstrumentType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentInstrumentType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentInstrumentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2024_2.lists.webservices.netsuite.com", "PaymentInstrumentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
