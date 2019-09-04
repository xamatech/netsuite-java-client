/**
 * InboundShipmentShipmentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1.types;

public class InboundShipmentShipmentStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InboundShipmentShipmentStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __closed = "_closed";
    public static final java.lang.String __inTransit = "_inTransit";
    public static final java.lang.String __partiallyReceived = "_partiallyReceived";
    public static final java.lang.String __received = "_received";
    public static final java.lang.String __toBeShipped = "_toBeShipped";
    public static final InboundShipmentShipmentStatus _closed = new InboundShipmentShipmentStatus(__closed);
    public static final InboundShipmentShipmentStatus _inTransit = new InboundShipmentShipmentStatus(__inTransit);
    public static final InboundShipmentShipmentStatus _partiallyReceived = new InboundShipmentShipmentStatus(__partiallyReceived);
    public static final InboundShipmentShipmentStatus _received = new InboundShipmentShipmentStatus(__received);
    public static final InboundShipmentShipmentStatus _toBeShipped = new InboundShipmentShipmentStatus(__toBeShipped);
    public java.lang.String getValue() { return _value_;}
    public static InboundShipmentShipmentStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InboundShipmentShipmentStatus enumeration = (InboundShipmentShipmentStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InboundShipmentShipmentStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InboundShipmentShipmentStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentShipmentStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
