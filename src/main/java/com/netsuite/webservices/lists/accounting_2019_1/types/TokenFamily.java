/**
 * TokenFamily.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class TokenFamily implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TokenFamily(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __adyen = "_adyen";
    public static final java.lang.String __altaPay = "_altaPay";
    public static final java.lang.String __cyberSource = "_cyberSource";
    public static final java.lang.String __eway = "_eway";
    public static final java.lang.String __freedomPay = "_freedomPay";
    public static final java.lang.String __merchantESolutions = "_merchantESolutions";
    public static final java.lang.String __payCorp = "_payCorp";
    public static final java.lang.String __payu = "_payu";
    public static final java.lang.String __securePay = "_securePay";
    public static final java.lang.String __soluPay = "_soluPay";
    public static final java.lang.String __vantivPayments = "_vantivPayments";
    public static final TokenFamily _adyen = new TokenFamily(__adyen);
    public static final TokenFamily _altaPay = new TokenFamily(__altaPay);
    public static final TokenFamily _cyberSource = new TokenFamily(__cyberSource);
    public static final TokenFamily _eway = new TokenFamily(__eway);
    public static final TokenFamily _freedomPay = new TokenFamily(__freedomPay);
    public static final TokenFamily _merchantESolutions = new TokenFamily(__merchantESolutions);
    public static final TokenFamily _payCorp = new TokenFamily(__payCorp);
    public static final TokenFamily _payu = new TokenFamily(__payu);
    public static final TokenFamily _securePay = new TokenFamily(__securePay);
    public static final TokenFamily _soluPay = new TokenFamily(__soluPay);
    public static final TokenFamily _vantivPayments = new TokenFamily(__vantivPayments);
    public java.lang.String getValue() { return _value_;}
    public static TokenFamily fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TokenFamily enumeration = (TokenFamily)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TokenFamily fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TokenFamily.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "TokenFamily"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
