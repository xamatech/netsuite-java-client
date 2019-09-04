/**
 * SalesOrderOrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class SalesOrderOrderStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SalesOrderOrderStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __pendingApproval = "_pendingApproval";
    public static final java.lang.String __pendingFulfillment = "_pendingFulfillment";
    public static final java.lang.String __cancelled = "_cancelled";
    public static final java.lang.String __partiallyFulfilled = "_partiallyFulfilled";
    public static final java.lang.String __pendingBillingPartFulfilled = "_pendingBillingPartFulfilled";
    public static final java.lang.String __pendingBilling = "_pendingBilling";
    public static final java.lang.String __fullyBilled = "_fullyBilled";
    public static final java.lang.String __closed = "_closed";
    public static final java.lang.String __undefined = "_undefined";
    public static final SalesOrderOrderStatus _pendingApproval = new SalesOrderOrderStatus(__pendingApproval);
    public static final SalesOrderOrderStatus _pendingFulfillment = new SalesOrderOrderStatus(__pendingFulfillment);
    public static final SalesOrderOrderStatus _cancelled = new SalesOrderOrderStatus(__cancelled);
    public static final SalesOrderOrderStatus _partiallyFulfilled = new SalesOrderOrderStatus(__partiallyFulfilled);
    public static final SalesOrderOrderStatus _pendingBillingPartFulfilled = new SalesOrderOrderStatus(__pendingBillingPartFulfilled);
    public static final SalesOrderOrderStatus _pendingBilling = new SalesOrderOrderStatus(__pendingBilling);
    public static final SalesOrderOrderStatus _fullyBilled = new SalesOrderOrderStatus(__fullyBilled);
    public static final SalesOrderOrderStatus _closed = new SalesOrderOrderStatus(__closed);
    public static final SalesOrderOrderStatus _undefined = new SalesOrderOrderStatus(__undefined);
    public java.lang.String getValue() { return _value_;}
    public static SalesOrderOrderStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SalesOrderOrderStatus enumeration = (SalesOrderOrderStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SalesOrderOrderStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SalesOrderOrderStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderOrderStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
