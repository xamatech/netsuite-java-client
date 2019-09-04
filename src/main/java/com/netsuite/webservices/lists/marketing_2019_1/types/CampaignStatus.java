/**
 * CampaignStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.marketing_2019_1.types;

public class CampaignStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __closed = "_closed";
    public static final java.lang.String __completed = "_completed";
    public static final java.lang.String __execute = "_execute";
    public static final java.lang.String __inProgress = "_inProgress";
    public static final java.lang.String __scheduled = "_scheduled";
    public static final java.lang.String __sent = "_sent";
    public static final java.lang.String __toPrint = "_toPrint";
    public static final CampaignStatus _closed = new CampaignStatus(__closed);
    public static final CampaignStatus _completed = new CampaignStatus(__completed);
    public static final CampaignStatus _execute = new CampaignStatus(__execute);
    public static final CampaignStatus _inProgress = new CampaignStatus(__inProgress);
    public static final CampaignStatus _scheduled = new CampaignStatus(__scheduled);
    public static final CampaignStatus _sent = new CampaignStatus(__sent);
    public static final CampaignStatus _toPrint = new CampaignStatus(__toPrint);
    public java.lang.String getValue() { return _value_;}
    public static CampaignStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignStatus enumeration = (CampaignStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.marketing_2019_1.lists.webservices.netsuite.com", "CampaignStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
