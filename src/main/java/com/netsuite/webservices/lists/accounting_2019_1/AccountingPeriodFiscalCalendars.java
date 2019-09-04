/**
 * AccountingPeriodFiscalCalendars.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class AccountingPeriodFiscalCalendars  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef fiscalCalendar;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    public AccountingPeriodFiscalCalendars() {
    }

    public AccountingPeriodFiscalCalendars(
           com.netsuite.webservices.platform.core_2019_1.RecordRef fiscalCalendar,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
           this.fiscalCalendar = fiscalCalendar;
           this.parent = parent;
    }


    /**
     * Gets the fiscalCalendar value for this AccountingPeriodFiscalCalendars.
     * 
     * @return fiscalCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFiscalCalendar() {
        return fiscalCalendar;
    }


    /**
     * Sets the fiscalCalendar value for this AccountingPeriodFiscalCalendars.
     * 
     * @param fiscalCalendar
     */
    public void setFiscalCalendar(com.netsuite.webservices.platform.core_2019_1.RecordRef fiscalCalendar) {
        this.fiscalCalendar = fiscalCalendar;
    }


    /**
     * Gets the parent value for this AccountingPeriodFiscalCalendars.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this AccountingPeriodFiscalCalendars.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountingPeriodFiscalCalendars)) return false;
        AccountingPeriodFiscalCalendars other = (AccountingPeriodFiscalCalendars) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fiscalCalendar==null && other.getFiscalCalendar()==null) || 
             (this.fiscalCalendar!=null &&
              this.fiscalCalendar.equals(other.getFiscalCalendar()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent())));
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
        if (getFiscalCalendar() != null) {
            _hashCode += getFiscalCalendar().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountingPeriodFiscalCalendars.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "AccountingPeriodFiscalCalendars"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fiscalCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
