/**
 * TransactionPaymentEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class TransactionPaymentEventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionPaymentEventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __authorization = "_authorization";
    public static final java.lang.String __captureAuthorization = "_captureAuthorization";
    public static final java.lang.String __credit = "_credit";
    public static final java.lang.String __overrideHold = "_overrideHold";
    public static final java.lang.String __refreshAuthorization = "_refreshAuthorization";
    public static final java.lang.String __refund = "_refund";
    public static final java.lang.String __sale = "_sale";
    public static final java.lang.String __voidAuthorization = "_voidAuthorization";
    public static final TransactionPaymentEventType _authorization = new TransactionPaymentEventType(__authorization);
    public static final TransactionPaymentEventType _captureAuthorization = new TransactionPaymentEventType(__captureAuthorization);
    public static final TransactionPaymentEventType _credit = new TransactionPaymentEventType(__credit);
    public static final TransactionPaymentEventType _overrideHold = new TransactionPaymentEventType(__overrideHold);
    public static final TransactionPaymentEventType _refreshAuthorization = new TransactionPaymentEventType(__refreshAuthorization);
    public static final TransactionPaymentEventType _refund = new TransactionPaymentEventType(__refund);
    public static final TransactionPaymentEventType _sale = new TransactionPaymentEventType(__sale);
    public static final TransactionPaymentEventType _voidAuthorization = new TransactionPaymentEventType(__voidAuthorization);
    public java.lang.String getValue() { return _value_;}
    public static TransactionPaymentEventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionPaymentEventType enumeration = (TransactionPaymentEventType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionPaymentEventType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionPaymentEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "TransactionPaymentEventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
