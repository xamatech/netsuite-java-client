/**
 * Source.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1.types;

public class Source implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Source(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __adp = "_adp";
    public static final java.lang.String __automatedMemorizedTransaction = "_automatedMemorizedTransaction";
    public static final java.lang.String __csv = "_csv";
    public static final java.lang.String __customerCenter = "_customerCenter";
    public static final java.lang.String __ebay = "_ebay";
    public static final java.lang.String __mobile = "_mobile";
    public static final java.lang.String __offlineClient = "_offlineClient";
    public static final java.lang.String __perquest = "_perquest";
    public static final java.lang.String __qif = "_qif";
    public static final java.lang.String __quickbooks = "_quickbooks";
    public static final java.lang.String __scis = "_scis";
    public static final java.lang.String __smbxml = "_smbxml";
    public static final java.lang.String __sync = "_sync";
    public static final java.lang.String __web = "_web";
    public static final java.lang.String __webServices = "_webServices";
    public static final java.lang.String __yahoo = "_yahoo";
    public static final Source _adp = new Source(__adp);
    public static final Source _automatedMemorizedTransaction = new Source(__automatedMemorizedTransaction);
    public static final Source _csv = new Source(__csv);
    public static final Source _customerCenter = new Source(__customerCenter);
    public static final Source _ebay = new Source(__ebay);
    public static final Source _mobile = new Source(__mobile);
    public static final Source _offlineClient = new Source(__offlineClient);
    public static final Source _perquest = new Source(__perquest);
    public static final Source _qif = new Source(__qif);
    public static final Source _quickbooks = new Source(__quickbooks);
    public static final Source _scis = new Source(__scis);
    public static final Source _smbxml = new Source(__smbxml);
    public static final Source _sync = new Source(__sync);
    public static final Source _web = new Source(__web);
    public static final Source _webServices = new Source(__webServices);
    public static final Source _yahoo = new Source(__yahoo);
    public java.lang.String getValue() { return _value_;}
    public static Source fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Source enumeration = (Source)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Source fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Source.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Source"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
