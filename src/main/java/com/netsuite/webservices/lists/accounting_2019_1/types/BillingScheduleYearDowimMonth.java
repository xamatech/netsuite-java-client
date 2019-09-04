/**
 * BillingScheduleYearDowimMonth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class BillingScheduleYearDowimMonth implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingScheduleYearDowimMonth(java.lang.String value) {
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
    public static final BillingScheduleYearDowimMonth _january = new BillingScheduleYearDowimMonth(__january);
    public static final BillingScheduleYearDowimMonth _february = new BillingScheduleYearDowimMonth(__february);
    public static final BillingScheduleYearDowimMonth _march = new BillingScheduleYearDowimMonth(__march);
    public static final BillingScheduleYearDowimMonth _april = new BillingScheduleYearDowimMonth(__april);
    public static final BillingScheduleYearDowimMonth _may = new BillingScheduleYearDowimMonth(__may);
    public static final BillingScheduleYearDowimMonth _june = new BillingScheduleYearDowimMonth(__june);
    public static final BillingScheduleYearDowimMonth _july = new BillingScheduleYearDowimMonth(__july);
    public static final BillingScheduleYearDowimMonth _august = new BillingScheduleYearDowimMonth(__august);
    public static final BillingScheduleYearDowimMonth _september = new BillingScheduleYearDowimMonth(__september);
    public static final BillingScheduleYearDowimMonth _october = new BillingScheduleYearDowimMonth(__october);
    public static final BillingScheduleYearDowimMonth _november = new BillingScheduleYearDowimMonth(__november);
    public static final BillingScheduleYearDowimMonth _december = new BillingScheduleYearDowimMonth(__december);
    public java.lang.String getValue() { return _value_;}
    public static BillingScheduleYearDowimMonth fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingScheduleYearDowimMonth enumeration = (BillingScheduleYearDowimMonth)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingScheduleYearDowimMonth fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingScheduleYearDowimMonth.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleYearDowimMonth"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
