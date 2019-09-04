/**
 * RevRecScheduleRecogIntervalSrc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class RevRecScheduleRecogIntervalSrc implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RevRecScheduleRecogIntervalSrc(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __revRecDatesSpecifiedOnTransaction = "_revRecDatesSpecifiedOnTransaction";
    public static final java.lang.String __billingScheduleTranDateOnSalesOrder = "_billingScheduleTranDateOnSalesOrder";
    public static final java.lang.String __billingScheduleRevRecDateOnSalesOrder = "_billingScheduleRevRecDateOnSalesOrder";
    public static final java.lang.String __revRecDatesSpecifiedOnSalesOrder = "_revRecDatesSpecifiedOnSalesOrder";
    public static final RevRecScheduleRecogIntervalSrc _revRecDatesSpecifiedOnTransaction = new RevRecScheduleRecogIntervalSrc(__revRecDatesSpecifiedOnTransaction);
    public static final RevRecScheduleRecogIntervalSrc _billingScheduleTranDateOnSalesOrder = new RevRecScheduleRecogIntervalSrc(__billingScheduleTranDateOnSalesOrder);
    public static final RevRecScheduleRecogIntervalSrc _billingScheduleRevRecDateOnSalesOrder = new RevRecScheduleRecogIntervalSrc(__billingScheduleRevRecDateOnSalesOrder);
    public static final RevRecScheduleRecogIntervalSrc _revRecDatesSpecifiedOnSalesOrder = new RevRecScheduleRecogIntervalSrc(__revRecDatesSpecifiedOnSalesOrder);
    public java.lang.String getValue() { return _value_;}
    public static RevRecScheduleRecogIntervalSrc fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RevRecScheduleRecogIntervalSrc enumeration = (RevRecScheduleRecogIntervalSrc)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RevRecScheduleRecogIntervalSrc fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RevRecScheduleRecogIntervalSrc.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "RevRecScheduleRecogIntervalSrc"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
