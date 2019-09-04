/**
 * AccountingBookDetailList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class AccountingBookDetailList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetail[] accountingBookDetail;

    private boolean replaceAll;  // attribute

    public AccountingBookDetailList() {
    }

    public AccountingBookDetailList(
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetail[] accountingBookDetail,
           boolean replaceAll) {
           this.accountingBookDetail = accountingBookDetail;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the accountingBookDetail value for this AccountingBookDetailList.
     * 
     * @return accountingBookDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetail[] getAccountingBookDetail() {
        return accountingBookDetail;
    }


    /**
     * Sets the accountingBookDetail value for this AccountingBookDetailList.
     * 
     * @param accountingBookDetail
     */
    public void setAccountingBookDetail(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetail[] accountingBookDetail) {
        this.accountingBookDetail = accountingBookDetail;
    }

    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetail getAccountingBookDetail(int i) {
        return this.accountingBookDetail[i];
    }

    public void setAccountingBookDetail(int i, com.netsuite.webservices.platform.common_2019_1.AccountingBookDetail _value) {
        this.accountingBookDetail[i] = _value;
    }


    /**
     * Gets the replaceAll value for this AccountingBookDetailList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this AccountingBookDetailList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountingBookDetailList)) return false;
        AccountingBookDetailList other = (AccountingBookDetailList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountingBookDetail==null && other.getAccountingBookDetail()==null) || 
             (this.accountingBookDetail!=null &&
              java.util.Arrays.equals(this.accountingBookDetail, other.getAccountingBookDetail()))) &&
            this.replaceAll == other.isReplaceAll();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountingBookDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBookDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBookDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountingBookDetailList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingBookDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
