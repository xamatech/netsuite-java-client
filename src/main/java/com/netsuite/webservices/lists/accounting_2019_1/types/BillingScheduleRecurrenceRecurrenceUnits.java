/**
 * BillingScheduleRecurrenceRecurrenceUnits.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class BillingScheduleRecurrenceRecurrenceUnits implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingScheduleRecurrenceRecurrenceUnits(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __custom = "_custom";
    public static final java.lang.String __days = "_days";
    public static final java.lang.String __months = "_months";
    public static final java.lang.String __weeks = "_weeks";
    public static final BillingScheduleRecurrenceRecurrenceUnits _custom = new BillingScheduleRecurrenceRecurrenceUnits(__custom);
    public static final BillingScheduleRecurrenceRecurrenceUnits _days = new BillingScheduleRecurrenceRecurrenceUnits(__days);
    public static final BillingScheduleRecurrenceRecurrenceUnits _months = new BillingScheduleRecurrenceRecurrenceUnits(__months);
    public static final BillingScheduleRecurrenceRecurrenceUnits _weeks = new BillingScheduleRecurrenceRecurrenceUnits(__weeks);
    public java.lang.String getValue() { return _value_;}
    public static BillingScheduleRecurrenceRecurrenceUnits fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingScheduleRecurrenceRecurrenceUnits enumeration = (BillingScheduleRecurrenceRecurrenceUnits)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingScheduleRecurrenceRecurrenceUnits fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingScheduleRecurrenceRecurrenceUnits.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceRecurrenceUnits"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
