/**
 * TransactionBillVarianceStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1.types;

public class TransactionBillVarianceStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionBillVarianceStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __journalNotPosted = "_journalNotPosted";
    public static final java.lang.String __journalPosted = "_journalPosted";
    public static final java.lang.String __noVariances = "_noVariances";
    public static final TransactionBillVarianceStatus _journalNotPosted = new TransactionBillVarianceStatus(__journalNotPosted);
    public static final TransactionBillVarianceStatus _journalPosted = new TransactionBillVarianceStatus(__journalPosted);
    public static final TransactionBillVarianceStatus _noVariances = new TransactionBillVarianceStatus(__noVariances);
    public java.lang.String getValue() { return _value_;}
    public static TransactionBillVarianceStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionBillVarianceStatus enumeration = (TransactionBillVarianceStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionBillVarianceStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionBillVarianceStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.purchases_2019_1.transactions.webservices.netsuite.com", "TransactionBillVarianceStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
