/**
 * BillingAccountFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1.types;

public class BillingAccountFrequency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingAccountFrequency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __annually = "_annually";
    public static final java.lang.String __custom = "_custom";
    public static final java.lang.String __daily = "_daily";
    public static final java.lang.String __endOfPeriod = "_endOfPeriod";
    public static final java.lang.String __everyFourWeeks = "_everyFourWeeks";
    public static final java.lang.String __everyThreeYears = "_everyThreeYears";
    public static final java.lang.String __everyTwoMonths = "_everyTwoMonths";
    public static final java.lang.String __everyTwoWeeks = "_everyTwoWeeks";
    public static final java.lang.String __everyTwoYears = "_everyTwoYears";
    public static final java.lang.String __hourly = "_hourly";
    public static final java.lang.String __monthly = "_monthly";
    public static final java.lang.String __never = "_never";
    public static final java.lang.String __oneTime = "_oneTime";
    public static final java.lang.String __quarterly = "_quarterly";
    public static final java.lang.String __startOfPeriod = "_startOfPeriod";
    public static final java.lang.String __twiceAMonth = "_twiceAMonth";
    public static final java.lang.String __twiceAYear = "_twiceAYear";
    public static final java.lang.String __weekly = "_weekly";
    public static final BillingAccountFrequency _annually = new BillingAccountFrequency(__annually);
    public static final BillingAccountFrequency _custom = new BillingAccountFrequency(__custom);
    public static final BillingAccountFrequency _daily = new BillingAccountFrequency(__daily);
    public static final BillingAccountFrequency _endOfPeriod = new BillingAccountFrequency(__endOfPeriod);
    public static final BillingAccountFrequency _everyFourWeeks = new BillingAccountFrequency(__everyFourWeeks);
    public static final BillingAccountFrequency _everyThreeYears = new BillingAccountFrequency(__everyThreeYears);
    public static final BillingAccountFrequency _everyTwoMonths = new BillingAccountFrequency(__everyTwoMonths);
    public static final BillingAccountFrequency _everyTwoWeeks = new BillingAccountFrequency(__everyTwoWeeks);
    public static final BillingAccountFrequency _everyTwoYears = new BillingAccountFrequency(__everyTwoYears);
    public static final BillingAccountFrequency _hourly = new BillingAccountFrequency(__hourly);
    public static final BillingAccountFrequency _monthly = new BillingAccountFrequency(__monthly);
    public static final BillingAccountFrequency _never = new BillingAccountFrequency(__never);
    public static final BillingAccountFrequency _oneTime = new BillingAccountFrequency(__oneTime);
    public static final BillingAccountFrequency _quarterly = new BillingAccountFrequency(__quarterly);
    public static final BillingAccountFrequency _startOfPeriod = new BillingAccountFrequency(__startOfPeriod);
    public static final BillingAccountFrequency _twiceAMonth = new BillingAccountFrequency(__twiceAMonth);
    public static final BillingAccountFrequency _twiceAYear = new BillingAccountFrequency(__twiceAYear);
    public static final BillingAccountFrequency _weekly = new BillingAccountFrequency(__weekly);
    public java.lang.String getValue() { return _value_;}
    public static BillingAccountFrequency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingAccountFrequency enumeration = (BillingAccountFrequency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingAccountFrequency fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingAccountFrequency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "BillingAccountFrequency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
