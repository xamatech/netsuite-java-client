/**
 * PaycheckPayEarn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPayEarn  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef payItem;

    private java.lang.Long line;

    private java.lang.Double count;

    private java.lang.String rate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef serviceItem;

    private java.lang.Double grossAmount;

    private java.lang.Boolean manualEntry;

    public PaycheckPayEarn() {
    }

    public PaycheckPayEarn(
           com.netsuite.webservices.platform.core_2019_1.RecordRef payItem,
           java.lang.Long line,
           java.lang.Double count,
           java.lang.String rate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef serviceItem,
           java.lang.Double grossAmount,
           java.lang.Boolean manualEntry) {
           this.payItem = payItem;
           this.line = line;
           this.count = count;
           this.rate = rate;
           this.serviceItem = serviceItem;
           this.grossAmount = grossAmount;
           this.manualEntry = manualEntry;
    }


    /**
     * Gets the payItem value for this PaycheckPayEarn.
     * 
     * @return payItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this PaycheckPayEarn.
     * 
     * @param payItem
     */
    public void setPayItem(com.netsuite.webservices.platform.core_2019_1.RecordRef payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the line value for this PaycheckPayEarn.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this PaycheckPayEarn.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the count value for this PaycheckPayEarn.
     * 
     * @return count
     */
    public java.lang.Double getCount() {
        return count;
    }


    /**
     * Sets the count value for this PaycheckPayEarn.
     * 
     * @param count
     */
    public void setCount(java.lang.Double count) {
        this.count = count;
    }


    /**
     * Gets the rate value for this PaycheckPayEarn.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this PaycheckPayEarn.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the serviceItem value for this PaycheckPayEarn.
     * 
     * @return serviceItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getServiceItem() {
        return serviceItem;
    }


    /**
     * Sets the serviceItem value for this PaycheckPayEarn.
     * 
     * @param serviceItem
     */
    public void setServiceItem(com.netsuite.webservices.platform.core_2019_1.RecordRef serviceItem) {
        this.serviceItem = serviceItem;
    }


    /**
     * Gets the grossAmount value for this PaycheckPayEarn.
     * 
     * @return grossAmount
     */
    public java.lang.Double getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this PaycheckPayEarn.
     * 
     * @param grossAmount
     */
    public void setGrossAmount(java.lang.Double grossAmount) {
        this.grossAmount = grossAmount;
    }


    /**
     * Gets the manualEntry value for this PaycheckPayEarn.
     * 
     * @return manualEntry
     */
    public java.lang.Boolean getManualEntry() {
        return manualEntry;
    }


    /**
     * Sets the manualEntry value for this PaycheckPayEarn.
     * 
     * @param manualEntry
     */
    public void setManualEntry(java.lang.Boolean manualEntry) {
        this.manualEntry = manualEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayEarn)) return false;
        PaycheckPayEarn other = (PaycheckPayEarn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              this.payItem.equals(other.getPayItem()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.serviceItem==null && other.getServiceItem()==null) || 
             (this.serviceItem!=null &&
              this.serviceItem.equals(other.getServiceItem()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              this.grossAmount.equals(other.getGrossAmount()))) &&
            ((this.manualEntry==null && other.getManualEntry()==null) || 
             (this.manualEntry!=null &&
              this.manualEntry.equals(other.getManualEntry())));
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
        if (getPayItem() != null) {
            _hashCode += getPayItem().hashCode();
        }
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getServiceItem() != null) {
            _hashCode += getServiceItem().hashCode();
        }
        if (getGrossAmount() != null) {
            _hashCode += getGrossAmount().hashCode();
        }
        if (getManualEntry() != null) {
            _hashCode += getManualEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckPayEarn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayEarn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "manualEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
