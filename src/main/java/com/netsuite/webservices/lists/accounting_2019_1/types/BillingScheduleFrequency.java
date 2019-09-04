/**
 * BillingScheduleFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class BillingScheduleFrequency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingScheduleFrequency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __annually = "_annually";
    public static final java.lang.String __custom = "_custom";
    public static final java.lang.String __daily = "_daily";
    public static final java.lang.String __endOfPeriod = "_endOfPeriod";
    public static final java.lang.String __monthly = "_monthly";
    public static final java.lang.String __never = "_never";
    public static final java.lang.String __oneTime = "_oneTime";
    public static final java.lang.String __startOfPeriod = "_startOfPeriod";
    public static final java.lang.String __weekly = "_weekly";
    public static final BillingScheduleFrequency _annually = new BillingScheduleFrequency(__annually);
    public static final BillingScheduleFrequency _custom = new BillingScheduleFrequency(__custom);
    public static final BillingScheduleFrequency _daily = new BillingScheduleFrequency(__daily);
    public static final BillingScheduleFrequency _endOfPeriod = new BillingScheduleFrequency(__endOfPeriod);
    public static final BillingScheduleFrequency _monthly = new BillingScheduleFrequency(__monthly);
    public static final BillingScheduleFrequency _never = new BillingScheduleFrequency(__never);
    public static final BillingScheduleFrequency _oneTime = new BillingScheduleFrequency(__oneTime);
    public static final BillingScheduleFrequency _startOfPeriod = new BillingScheduleFrequency(__startOfPeriod);
    public static final BillingScheduleFrequency _weekly = new BillingScheduleFrequency(__weekly);
    public java.lang.String getValue() { return _value_;}
    public static BillingScheduleFrequency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingScheduleFrequency enumeration = (BillingScheduleFrequency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingScheduleFrequency fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingScheduleFrequency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleFrequency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
