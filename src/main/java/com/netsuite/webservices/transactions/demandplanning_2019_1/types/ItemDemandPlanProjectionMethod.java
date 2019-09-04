/**
 * ItemDemandPlanProjectionMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2019_1.types;

public class ItemDemandPlanProjectionMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemDemandPlanProjectionMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __linearRegression = "_linearRegression";
    public static final java.lang.String __movingAverage = "_movingAverage";
    public static final java.lang.String __salesForecast = "_salesForecast";
    public static final java.lang.String __seasonalAverage = "_seasonalAverage";
    public static final ItemDemandPlanProjectionMethod _linearRegression = new ItemDemandPlanProjectionMethod(__linearRegression);
    public static final ItemDemandPlanProjectionMethod _movingAverage = new ItemDemandPlanProjectionMethod(__movingAverage);
    public static final ItemDemandPlanProjectionMethod _salesForecast = new ItemDemandPlanProjectionMethod(__salesForecast);
    public static final ItemDemandPlanProjectionMethod _seasonalAverage = new ItemDemandPlanProjectionMethod(__seasonalAverage);
    public java.lang.String getValue() { return _value_;}
    public static ItemDemandPlanProjectionMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemDemandPlanProjectionMethod enumeration = (ItemDemandPlanProjectionMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemDemandPlanProjectionMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemDemandPlanProjectionMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.demandplanning_2019_1.transactions.webservices.netsuite.com", "ItemDemandPlanProjectionMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
