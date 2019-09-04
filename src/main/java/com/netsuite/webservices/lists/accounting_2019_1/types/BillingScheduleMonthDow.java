/**
 * BillingScheduleMonthDow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class BillingScheduleMonthDow implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingScheduleMonthDow(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __sunday = "_sunday";
    public static final java.lang.String __monday = "_monday";
    public static final java.lang.String __tuesday = "_tuesday";
    public static final java.lang.String __wednesday = "_wednesday";
    public static final java.lang.String __thursday = "_thursday";
    public static final java.lang.String __friday = "_friday";
    public static final java.lang.String __saturday = "_saturday";
    public static final java.lang.String __day = "_day";
    public static final BillingScheduleMonthDow _sunday = new BillingScheduleMonthDow(__sunday);
    public static final BillingScheduleMonthDow _monday = new BillingScheduleMonthDow(__monday);
    public static final BillingScheduleMonthDow _tuesday = new BillingScheduleMonthDow(__tuesday);
    public static final BillingScheduleMonthDow _wednesday = new BillingScheduleMonthDow(__wednesday);
    public static final BillingScheduleMonthDow _thursday = new BillingScheduleMonthDow(__thursday);
    public static final BillingScheduleMonthDow _friday = new BillingScheduleMonthDow(__friday);
    public static final BillingScheduleMonthDow _saturday = new BillingScheduleMonthDow(__saturday);
    public static final BillingScheduleMonthDow _day = new BillingScheduleMonthDow(__day);
    public java.lang.String getValue() { return _value_;}
    public static BillingScheduleMonthDow fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingScheduleMonthDow enumeration = (BillingScheduleMonthDow)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingScheduleMonthDow fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingScheduleMonthDow.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleMonthDow"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
