/**
 * JobBillingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1.types;

public class JobBillingType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected JobBillingType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __none = "_none";
    public static final java.lang.String __chargeBased = "_chargeBased";
    public static final java.lang.String __fixedBidInterval = "_fixedBidInterval";
    public static final java.lang.String __fixedBidMilestone = "_fixedBidMilestone";
    public static final java.lang.String __timeAndMaterials = "_timeAndMaterials";
    public static final JobBillingType _none = new JobBillingType(__none);
    public static final JobBillingType _chargeBased = new JobBillingType(__chargeBased);
    public static final JobBillingType _fixedBidInterval = new JobBillingType(__fixedBidInterval);
    public static final JobBillingType _fixedBidMilestone = new JobBillingType(__fixedBidMilestone);
    public static final JobBillingType _timeAndMaterials = new JobBillingType(__timeAndMaterials);
    public java.lang.String getValue() { return _value_;}
    public static JobBillingType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        JobBillingType enumeration = (JobBillingType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static JobBillingType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(JobBillingType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "JobBillingType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
