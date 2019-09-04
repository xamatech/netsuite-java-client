/**
 * BillingScheduleYearMonth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class BillingScheduleYearMonth implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingScheduleYearMonth(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __january = "_january";
    public static final java.lang.String __february = "_february";
    public static final java.lang.String __march = "_march";
    public static final java.lang.String __april = "_april";
    public static final java.lang.String __may = "_may";
    public static final java.lang.String __june = "_june";
    public static final java.lang.String __july = "_july";
    public static final java.lang.String __august = "_august";
    public static final java.lang.String __september = "_september";
    public static final java.lang.String __october = "_october";
    public static final java.lang.String __november = "_november";
    public static final java.lang.String __december = "_december";
    public static final BillingScheduleYearMonth _january = new BillingScheduleYearMonth(__january);
    public static final BillingScheduleYearMonth _february = new BillingScheduleYearMonth(__february);
    public static final BillingScheduleYearMonth _march = new BillingScheduleYearMonth(__march);
    public static final BillingScheduleYearMonth _april = new BillingScheduleYearMonth(__april);
    public static final BillingScheduleYearMonth _may = new BillingScheduleYearMonth(__may);
    public static final BillingScheduleYearMonth _june = new BillingScheduleYearMonth(__june);
    public static final BillingScheduleYearMonth _july = new BillingScheduleYearMonth(__july);
    public static final BillingScheduleYearMonth _august = new BillingScheduleYearMonth(__august);
    public static final BillingScheduleYearMonth _september = new BillingScheduleYearMonth(__september);
    public static final BillingScheduleYearMonth _october = new BillingScheduleYearMonth(__october);
    public static final BillingScheduleYearMonth _november = new BillingScheduleYearMonth(__november);
    public static final BillingScheduleYearMonth _december = new BillingScheduleYearMonth(__december);
    public java.lang.String getValue() { return _value_;}
    public static BillingScheduleYearMonth fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingScheduleYearMonth enumeration = (BillingScheduleYearMonth)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingScheduleYearMonth fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingScheduleYearMonth.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleYearMonth"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
