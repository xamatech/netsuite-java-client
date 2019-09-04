/**
 * AccountingTransactionRevenueStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class AccountingTransactionRevenueStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountingTransactionRevenueStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __completed = "_completed";
    public static final java.lang.String __inProgress = "_inProgress";
    public static final java.lang.String __onRevCommitment = "_onRevCommitment";
    public static final java.lang.String __pending = "_pending";
    public static final AccountingTransactionRevenueStatus _completed = new AccountingTransactionRevenueStatus(__completed);
    public static final AccountingTransactionRevenueStatus _inProgress = new AccountingTransactionRevenueStatus(__inProgress);
    public static final AccountingTransactionRevenueStatus _onRevCommitment = new AccountingTransactionRevenueStatus(__onRevCommitment);
    public static final AccountingTransactionRevenueStatus _pending = new AccountingTransactionRevenueStatus(__pending);
    public java.lang.String getValue() { return _value_;}
    public static AccountingTransactionRevenueStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountingTransactionRevenueStatus enumeration = (AccountingTransactionRevenueStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountingTransactionRevenueStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AccountingTransactionRevenueStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "AccountingTransactionRevenueStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
