/**
 * PurchaseOrderOrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1.types;

public class PurchaseOrderOrderStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PurchaseOrderOrderStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __closed = "_closed";
    public static final java.lang.String __fullyBilled = "_fullyBilled";
    public static final java.lang.String __partiallyReceived = "_partiallyReceived";
    public static final java.lang.String __pendingBillingPartiallyReceived = "_pendingBillingPartiallyReceived";
    public static final java.lang.String __pendingBilling = "_pendingBilling";
    public static final java.lang.String __pendingReceipt = "_pendingReceipt";
    public static final java.lang.String __pendingSupervisorApproval = "_pendingSupervisorApproval";
    public static final java.lang.String __rejectedBySupervisor = "_rejectedBySupervisor";
    public static final PurchaseOrderOrderStatus _closed = new PurchaseOrderOrderStatus(__closed);
    public static final PurchaseOrderOrderStatus _fullyBilled = new PurchaseOrderOrderStatus(__fullyBilled);
    public static final PurchaseOrderOrderStatus _partiallyReceived = new PurchaseOrderOrderStatus(__partiallyReceived);
    public static final PurchaseOrderOrderStatus _pendingBillingPartiallyReceived = new PurchaseOrderOrderStatus(__pendingBillingPartiallyReceived);
    public static final PurchaseOrderOrderStatus _pendingBilling = new PurchaseOrderOrderStatus(__pendingBilling);
    public static final PurchaseOrderOrderStatus _pendingReceipt = new PurchaseOrderOrderStatus(__pendingReceipt);
    public static final PurchaseOrderOrderStatus _pendingSupervisorApproval = new PurchaseOrderOrderStatus(__pendingSupervisorApproval);
    public static final PurchaseOrderOrderStatus _rejectedBySupervisor = new PurchaseOrderOrderStatus(__rejectedBySupervisor);
    public java.lang.String getValue() { return _value_;}
    public static PurchaseOrderOrderStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PurchaseOrderOrderStatus enumeration = (PurchaseOrderOrderStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PurchaseOrderOrderStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PurchaseOrderOrderStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseOrderOrderStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
