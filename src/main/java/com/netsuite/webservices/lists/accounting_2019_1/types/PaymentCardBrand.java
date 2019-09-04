/**
 * PaymentCardBrand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class PaymentCardBrand implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentCardBrand(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __amex = "_amex";
    public static final java.lang.String __cirrus = "_cirrus";
    public static final java.lang.String __dinersClub = "_dinersClub";
    public static final java.lang.String __discover = "_discover";
    public static final java.lang.String __jcb = "_jcb";
    public static final java.lang.String __laser = "_laser";
    public static final java.lang.String __localCard = "_localCard";
    public static final java.lang.String __maestro = "_maestro";
    public static final java.lang.String __masterCard = "_masterCard";
    public static final java.lang.String __solo = "_solo";
    public static final java.lang.String __unionPay = "_unionPay";
    public static final java.lang.String __visa = "_visa";
    public static final PaymentCardBrand _amex = new PaymentCardBrand(__amex);
    public static final PaymentCardBrand _cirrus = new PaymentCardBrand(__cirrus);
    public static final PaymentCardBrand _dinersClub = new PaymentCardBrand(__dinersClub);
    public static final PaymentCardBrand _discover = new PaymentCardBrand(__discover);
    public static final PaymentCardBrand _jcb = new PaymentCardBrand(__jcb);
    public static final PaymentCardBrand _laser = new PaymentCardBrand(__laser);
    public static final PaymentCardBrand _localCard = new PaymentCardBrand(__localCard);
    public static final PaymentCardBrand _maestro = new PaymentCardBrand(__maestro);
    public static final PaymentCardBrand _masterCard = new PaymentCardBrand(__masterCard);
    public static final PaymentCardBrand _solo = new PaymentCardBrand(__solo);
    public static final PaymentCardBrand _unionPay = new PaymentCardBrand(__unionPay);
    public static final PaymentCardBrand _visa = new PaymentCardBrand(__visa);
    public java.lang.String getValue() { return _value_;}
    public static PaymentCardBrand fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PaymentCardBrand enumeration = (PaymentCardBrand)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentCardBrand fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentCardBrand.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "PaymentCardBrand"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
