/**
 * AccountingTransactionSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class AccountingTransactionSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.AccountingTransactionSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic accountJoin;

    private com.netsuite.webservices.platform.common_2019_1.RevRecScheduleSearchBasic revRecScheduleJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin;

    public AccountingTransactionSearch() {
    }

    public AccountingTransactionSearch(
           com.netsuite.webservices.platform.common_2019_1.AccountingTransactionSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic accountJoin,
           com.netsuite.webservices.platform.common_2019_1.RevRecScheduleSearchBasic revRecScheduleJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin) {
        this.basic = basic;
        this.accountJoin = accountJoin;
        this.revRecScheduleJoin = revRecScheduleJoin;
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the basic value for this AccountingTransactionSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingTransactionSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this AccountingTransactionSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.AccountingTransactionSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the accountJoin value for this AccountingTransactionSearch.
     * 
     * @return accountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic getAccountJoin() {
        return accountJoin;
    }


    /**
     * Sets the accountJoin value for this AccountingTransactionSearch.
     * 
     * @param accountJoin
     */
    public void setAccountJoin(com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic accountJoin) {
        this.accountJoin = accountJoin;
    }


    /**
     * Gets the revRecScheduleJoin value for this AccountingTransactionSearch.
     * 
     * @return revRecScheduleJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.RevRecScheduleSearchBasic getRevRecScheduleJoin() {
        return revRecScheduleJoin;
    }


    /**
     * Sets the revRecScheduleJoin value for this AccountingTransactionSearch.
     * 
     * @param revRecScheduleJoin
     */
    public void setRevRecScheduleJoin(com.netsuite.webservices.platform.common_2019_1.RevRecScheduleSearchBasic revRecScheduleJoin) {
        this.revRecScheduleJoin = revRecScheduleJoin;
    }


    /**
     * Gets the transactionJoin value for this AccountingTransactionSearch.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this AccountingTransactionSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountingTransactionSearch)) return false;
        AccountingTransactionSearch other = (AccountingTransactionSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.accountJoin==null && other.getAccountJoin()==null) || 
             (this.accountJoin!=null &&
              this.accountJoin.equals(other.getAccountJoin()))) &&
            ((this.revRecScheduleJoin==null && other.getRevRecScheduleJoin()==null) || 
             (this.revRecScheduleJoin!=null &&
              this.revRecScheduleJoin.equals(other.getRevRecScheduleJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getAccountJoin() != null) {
            _hashCode += getAccountJoin().hashCode();
        }
        if (getRevRecScheduleJoin() != null) {
            _hashCode += getRevRecScheduleJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountingTransactionSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "AccountingTransactionSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingTransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "accountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecScheduleJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecScheduleJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RevRecScheduleSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
