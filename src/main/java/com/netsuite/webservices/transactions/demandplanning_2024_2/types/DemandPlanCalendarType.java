/**
 * DemandPlanCalendarType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2024_2.types;

public class DemandPlanCalendarType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DemandPlanCalendarType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __daily = "_daily";
    public static final java.lang.String __monthly = "_monthly";
    public static final java.lang.String __weekly = "_weekly";
    public static final DemandPlanCalendarType _daily = new DemandPlanCalendarType(__daily);
    public static final DemandPlanCalendarType _monthly = new DemandPlanCalendarType(__monthly);
    public static final DemandPlanCalendarType _weekly = new DemandPlanCalendarType(__weekly);
    public java.lang.String getValue() { return _value_;}
    public static DemandPlanCalendarType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DemandPlanCalendarType enumeration = (DemandPlanCalendarType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DemandPlanCalendarType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DemandPlanCalendarType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.demandplanning_2024_2.transactions.webservices.netsuite.com", "DemandPlanCalendarType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
