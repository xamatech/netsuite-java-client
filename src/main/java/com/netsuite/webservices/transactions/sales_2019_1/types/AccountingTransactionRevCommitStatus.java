/**
 * AccountingTransactionRevCommitStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class AccountingTransactionRevCommitStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountingTransactionRevCommitStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __committed = "_committed";
    public static final java.lang.String __partiallyCommitted = "_partiallyCommitted";
    public static final java.lang.String __pendingCommitment = "_pendingCommitment";
    public static final AccountingTransactionRevCommitStatus _committed = new AccountingTransactionRevCommitStatus(__committed);
    public static final AccountingTransactionRevCommitStatus _partiallyCommitted = new AccountingTransactionRevCommitStatus(__partiallyCommitted);
    public static final AccountingTransactionRevCommitStatus _pendingCommitment = new AccountingTransactionRevCommitStatus(__pendingCommitment);
    public java.lang.String getValue() { return _value_;}
    public static AccountingTransactionRevCommitStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountingTransactionRevCommitStatus enumeration = (AccountingTransactionRevCommitStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountingTransactionRevCommitStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AccountingTransactionRevCommitStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "AccountingTransactionRevCommitStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
