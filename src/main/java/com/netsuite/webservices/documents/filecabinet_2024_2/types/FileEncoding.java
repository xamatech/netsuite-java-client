/**
 * FileEncoding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.documents.filecabinet_2024_2.types;

public class FileEncoding implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FileEncoding(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __autoDetect = "_autoDetect";
    public static final java.lang.String __shiftJis = "_shiftJis";
    public static final java.lang.String __utf8 = "_utf8";
    public static final java.lang.String __windows1252 = "_windows1252";
    public static final FileEncoding _autoDetect = new FileEncoding(__autoDetect);
    public static final FileEncoding _shiftJis = new FileEncoding(__shiftJis);
    public static final FileEncoding _utf8 = new FileEncoding(__utf8);
    public static final FileEncoding _windows1252 = new FileEncoding(__windows1252);
    public java.lang.String getValue() { return _value_;}
    public static FileEncoding fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FileEncoding enumeration = (FileEncoding)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FileEncoding fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FileEncoding.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.filecabinet_2024_2.documents.webservices.netsuite.com", "FileEncoding"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
