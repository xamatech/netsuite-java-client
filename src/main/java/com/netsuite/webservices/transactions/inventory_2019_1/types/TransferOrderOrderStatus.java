/**
 * TransferOrderOrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1.types;

public class TransferOrderOrderStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransferOrderOrderStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __pendingApproval = "_pendingApproval";
    public static final java.lang.String __pendingFulfillment = "_pendingFulfillment";
    public static final java.lang.String __rejected = "_rejected";
    public static final java.lang.String __partiallyFulfilled = "_partiallyFulfilled";
    public static final java.lang.String __pendingReceiptPartFulfilled = "_pendingReceiptPartFulfilled";
    public static final java.lang.String __pendingReceipt = "_pendingReceipt";
    public static final java.lang.String __received = "_received";
    public static final java.lang.String __closed = "_closed";
    public static final java.lang.String __undefined = "_undefined";
    public static final TransferOrderOrderStatus _pendingApproval = new TransferOrderOrderStatus(__pendingApproval);
    public static final TransferOrderOrderStatus _pendingFulfillment = new TransferOrderOrderStatus(__pendingFulfillment);
    public static final TransferOrderOrderStatus _rejected = new TransferOrderOrderStatus(__rejected);
    public static final TransferOrderOrderStatus _partiallyFulfilled = new TransferOrderOrderStatus(__partiallyFulfilled);
    public static final TransferOrderOrderStatus _pendingReceiptPartFulfilled = new TransferOrderOrderStatus(__pendingReceiptPartFulfilled);
    public static final TransferOrderOrderStatus _pendingReceipt = new TransferOrderOrderStatus(__pendingReceipt);
    public static final TransferOrderOrderStatus _received = new TransferOrderOrderStatus(__received);
    public static final TransferOrderOrderStatus _closed = new TransferOrderOrderStatus(__closed);
    public static final TransferOrderOrderStatus _undefined = new TransferOrderOrderStatus(__undefined);
    public java.lang.String getValue() { return _value_;}
    public static TransferOrderOrderStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransferOrderOrderStatus enumeration = (TransferOrderOrderStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransferOrderOrderStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransferOrderOrderStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.inventory_2019_1.transactions.webservices.netsuite.com", "TransferOrderOrderStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
