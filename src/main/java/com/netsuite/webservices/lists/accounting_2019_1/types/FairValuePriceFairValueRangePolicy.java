/**
 * FairValuePriceFairValueRangePolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class FairValuePriceFairValueRangePolicy implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FairValuePriceFairValueRangePolicy(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __boundary = "_boundary";
    public static final java.lang.String __fairValue = "_fairValue";
    public static final java.lang.String __high = "_high";
    public static final java.lang.String __low = "_low";
    public static final FairValuePriceFairValueRangePolicy _boundary = new FairValuePriceFairValueRangePolicy(__boundary);
    public static final FairValuePriceFairValueRangePolicy _fairValue = new FairValuePriceFairValueRangePolicy(__fairValue);
    public static final FairValuePriceFairValueRangePolicy _high = new FairValuePriceFairValueRangePolicy(__high);
    public static final FairValuePriceFairValueRangePolicy _low = new FairValuePriceFairValueRangePolicy(__low);
    public java.lang.String getValue() { return _value_;}
    public static FairValuePriceFairValueRangePolicy fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FairValuePriceFairValueRangePolicy enumeration = (FairValuePriceFairValueRangePolicy)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FairValuePriceFairValueRangePolicy fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FairValuePriceFairValueRangePolicy.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "FairValuePriceFairValueRangePolicy"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
