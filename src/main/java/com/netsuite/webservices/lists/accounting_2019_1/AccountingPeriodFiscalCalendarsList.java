/**
 * AccountingPeriodFiscalCalendarsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class AccountingPeriodFiscalCalendarsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.AccountingPeriodFiscalCalendars[] accountingPeriodFiscalCalendars;

    private boolean replaceAll;  // attribute

    public AccountingPeriodFiscalCalendarsList() {
    }

    public AccountingPeriodFiscalCalendarsList(
           com.netsuite.webservices.lists.accounting_2019_1.AccountingPeriodFiscalCalendars[] accountingPeriodFiscalCalendars,
           boolean replaceAll) {
           this.accountingPeriodFiscalCalendars = accountingPeriodFiscalCalendars;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the accountingPeriodFiscalCalendars value for this AccountingPeriodFiscalCalendarsList.
     * 
     * @return accountingPeriodFiscalCalendars
     */
    public com.netsuite.webservices.lists.accounting_2019_1.AccountingPeriodFiscalCalendars[] getAccountingPeriodFiscalCalendars() {
        return accountingPeriodFiscalCalendars;
    }


    /**
     * Sets the accountingPeriodFiscalCalendars value for this AccountingPeriodFiscalCalendarsList.
     * 
     * @param accountingPeriodFiscalCalendars
     */
    public void setAccountingPeriodFiscalCalendars(com.netsuite.webservices.lists.accounting_2019_1.AccountingPeriodFiscalCalendars[] accountingPeriodFiscalCalendars) {
        this.accountingPeriodFiscalCalendars = accountingPeriodFiscalCalendars;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.AccountingPeriodFiscalCalendars getAccountingPeriodFiscalCalendars(int i) {
        return this.accountingPeriodFiscalCalendars[i];
    }

    public void setAccountingPeriodFiscalCalendars(int i, com.netsuite.webservices.lists.accounting_2019_1.AccountingPeriodFiscalCalendars _value) {
        this.accountingPeriodFiscalCalendars[i] = _value;
    }


    /**
     * Gets the replaceAll value for this AccountingPeriodFiscalCalendarsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this AccountingPeriodFiscalCalendarsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountingPeriodFiscalCalendarsList)) return false;
        AccountingPeriodFiscalCalendarsList other = (AccountingPeriodFiscalCalendarsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountingPeriodFiscalCalendars==null && other.getAccountingPeriodFiscalCalendars()==null) || 
             (this.accountingPeriodFiscalCalendars!=null &&
              java.util.Arrays.equals(this.accountingPeriodFiscalCalendars, other.getAccountingPeriodFiscalCalendars()))) &&
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
        if (getAccountingPeriodFiscalCalendars() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingPeriodFiscalCalendars());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingPeriodFiscalCalendars(), i);
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
        new org.apache.axis.description.TypeDesc(AccountingPeriodFiscalCalendarsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "AccountingPeriodFiscalCalendarsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingPeriodFiscalCalendars");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "accountingPeriodFiscalCalendars"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "AccountingPeriodFiscalCalendars"));
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
