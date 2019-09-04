/**
 * BillingScheduleRecurrence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class BillingScheduleRecurrence  implements java.io.Serializable {
    private java.lang.Long recurrenceId;

    private java.lang.Long count;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceRecurrenceUnits units;

    private java.lang.Boolean relativeToPrevious;

    private java.util.Calendar recurrenceDate;

    private java.lang.Double amount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentTerms;

    public BillingScheduleRecurrence() {
    }

    public BillingScheduleRecurrence(
           java.lang.Long recurrenceId,
           java.lang.Long count,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceRecurrenceUnits units,
           java.lang.Boolean relativeToPrevious,
           java.util.Calendar recurrenceDate,
           java.lang.Double amount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentTerms) {
           this.recurrenceId = recurrenceId;
           this.count = count;
           this.units = units;
           this.relativeToPrevious = relativeToPrevious;
           this.recurrenceDate = recurrenceDate;
           this.amount = amount;
           this.paymentTerms = paymentTerms;
    }


    /**
     * Gets the recurrenceId value for this BillingScheduleRecurrence.
     * 
     * @return recurrenceId
     */
    public java.lang.Long getRecurrenceId() {
        return recurrenceId;
    }


    /**
     * Sets the recurrenceId value for this BillingScheduleRecurrence.
     * 
     * @param recurrenceId
     */
    public void setRecurrenceId(java.lang.Long recurrenceId) {
        this.recurrenceId = recurrenceId;
    }


    /**
     * Gets the count value for this BillingScheduleRecurrence.
     * 
     * @return count
     */
    public java.lang.Long getCount() {
        return count;
    }


    /**
     * Sets the count value for this BillingScheduleRecurrence.
     * 
     * @param count
     */
    public void setCount(java.lang.Long count) {
        this.count = count;
    }


    /**
     * Gets the units value for this BillingScheduleRecurrence.
     * 
     * @return units
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceRecurrenceUnits getUnits() {
        return units;
    }


    /**
     * Sets the units value for this BillingScheduleRecurrence.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceRecurrenceUnits units) {
        this.units = units;
    }


    /**
     * Gets the relativeToPrevious value for this BillingScheduleRecurrence.
     * 
     * @return relativeToPrevious
     */
    public java.lang.Boolean getRelativeToPrevious() {
        return relativeToPrevious;
    }


    /**
     * Sets the relativeToPrevious value for this BillingScheduleRecurrence.
     * 
     * @param relativeToPrevious
     */
    public void setRelativeToPrevious(java.lang.Boolean relativeToPrevious) {
        this.relativeToPrevious = relativeToPrevious;
    }


    /**
     * Gets the recurrenceDate value for this BillingScheduleRecurrence.
     * 
     * @return recurrenceDate
     */
    public java.util.Calendar getRecurrenceDate() {
        return recurrenceDate;
    }


    /**
     * Sets the recurrenceDate value for this BillingScheduleRecurrence.
     * 
     * @param recurrenceDate
     */
    public void setRecurrenceDate(java.util.Calendar recurrenceDate) {
        this.recurrenceDate = recurrenceDate;
    }


    /**
     * Gets the amount value for this BillingScheduleRecurrence.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BillingScheduleRecurrence.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the paymentTerms value for this BillingScheduleRecurrence.
     * 
     * @return paymentTerms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentTerms() {
        return paymentTerms;
    }


    /**
     * Sets the paymentTerms value for this BillingScheduleRecurrence.
     * 
     * @param paymentTerms
     */
    public void setPaymentTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingScheduleRecurrence)) return false;
        BillingScheduleRecurrence other = (BillingScheduleRecurrence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recurrenceId==null && other.getRecurrenceId()==null) || 
             (this.recurrenceId!=null &&
              this.recurrenceId.equals(other.getRecurrenceId()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.relativeToPrevious==null && other.getRelativeToPrevious()==null) || 
             (this.relativeToPrevious!=null &&
              this.relativeToPrevious.equals(other.getRelativeToPrevious()))) &&
            ((this.recurrenceDate==null && other.getRecurrenceDate()==null) || 
             (this.recurrenceDate!=null &&
              this.recurrenceDate.equals(other.getRecurrenceDate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.paymentTerms==null && other.getPaymentTerms()==null) || 
             (this.paymentTerms!=null &&
              this.paymentTerms.equals(other.getPaymentTerms())));
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
        if (getRecurrenceId() != null) {
            _hashCode += getRecurrenceId().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getRelativeToPrevious() != null) {
            _hashCode += getRelativeToPrevious().hashCode();
        }
        if (getRecurrenceDate() != null) {
            _hashCode += getRecurrenceDate().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPaymentTerms() != null) {
            _hashCode += getPaymentTerms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingScheduleRecurrence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleRecurrence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recurrenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceRecurrenceUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativeToPrevious");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "relativeToPrevious"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recurrenceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "paymentTerms"));
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
