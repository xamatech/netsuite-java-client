/**
 * BillingScheduleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class BillingScheduleType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingScheduleType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __chargeBased = "_chargeBased";
    public static final java.lang.String __fixedBidInterval = "_fixedBidInterval";
    public static final java.lang.String __fixedBidMilestone = "_fixedBidMilestone";
    public static final java.lang.String __standard = "_standard";
    public static final java.lang.String __timeAndMaterials = "_timeAndMaterials";
    public static final BillingScheduleType _chargeBased = new BillingScheduleType(__chargeBased);
    public static final BillingScheduleType _fixedBidInterval = new BillingScheduleType(__fixedBidInterval);
    public static final BillingScheduleType _fixedBidMilestone = new BillingScheduleType(__fixedBidMilestone);
    public static final BillingScheduleType _standard = new BillingScheduleType(__standard);
    public static final BillingScheduleType _timeAndMaterials = new BillingScheduleType(__timeAndMaterials);
    public java.lang.String getValue() { return _value_;}
    public static BillingScheduleType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingScheduleType enumeration = (BillingScheduleType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingScheduleType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingScheduleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
