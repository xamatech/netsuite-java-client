/**
 * CampaignCampaignEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.marketing_2019_1.types;

public class CampaignCampaignEventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignCampaignEventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __default = "_default";
    public static final java.lang.String __directMail = "_directMail";
    public static final java.lang.String __email = "_email";
    public static final java.lang.String __integration = "_integration";
    public static final java.lang.String __leadNurturingEmail = "_leadNurturingEmail";
    public static final java.lang.String __other = "_other";
    public static final CampaignCampaignEventType _default = new CampaignCampaignEventType(__default);
    public static final CampaignCampaignEventType _directMail = new CampaignCampaignEventType(__directMail);
    public static final CampaignCampaignEventType _email = new CampaignCampaignEventType(__email);
    public static final CampaignCampaignEventType _integration = new CampaignCampaignEventType(__integration);
    public static final CampaignCampaignEventType _leadNurturingEmail = new CampaignCampaignEventType(__leadNurturingEmail);
    public static final CampaignCampaignEventType _other = new CampaignCampaignEventType(__other);
    public java.lang.String getValue() { return _value_;}
    public static CampaignCampaignEventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignCampaignEventType enumeration = (CampaignCampaignEventType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignCampaignEventType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignCampaignEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.marketing_2019_1.lists.webservices.netsuite.com", "CampaignCampaignEventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
