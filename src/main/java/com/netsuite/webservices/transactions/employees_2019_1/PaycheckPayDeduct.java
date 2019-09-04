/**
 * PaycheckPayDeduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPayDeduct  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef payItem;

    private java.lang.Long line;

    private java.lang.Double wageBase;

    private java.lang.Double amount;

    private java.lang.Boolean manualEntry;

    public PaycheckPayDeduct() {
    }

    public PaycheckPayDeduct(
           com.netsuite.webservices.platform.core_2019_1.RecordRef payItem,
           java.lang.Long line,
           java.lang.Double wageBase,
           java.lang.Double amount,
           java.lang.Boolean manualEntry) {
           this.payItem = payItem;
           this.line = line;
           this.wageBase = wageBase;
           this.amount = amount;
           this.manualEntry = manualEntry;
    }


    /**
     * Gets the payItem value for this PaycheckPayDeduct.
     * 
     * @return payItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this PaycheckPayDeduct.
     * 
     * @param payItem
     */
    public void setPayItem(com.netsuite.webservices.platform.core_2019_1.RecordRef payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the line value for this PaycheckPayDeduct.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this PaycheckPayDeduct.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the wageBase value for this PaycheckPayDeduct.
     * 
     * @return wageBase
     */
    public java.lang.Double getWageBase() {
        return wageBase;
    }


    /**
     * Sets the wageBase value for this PaycheckPayDeduct.
     * 
     * @param wageBase
     */
    public void setWageBase(java.lang.Double wageBase) {
        this.wageBase = wageBase;
    }


    /**
     * Gets the amount value for this PaycheckPayDeduct.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaycheckPayDeduct.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the manualEntry value for this PaycheckPayDeduct.
     * 
     * @return manualEntry
     */
    public java.lang.Boolean getManualEntry() {
        return manualEntry;
    }


    /**
     * Sets the manualEntry value for this PaycheckPayDeduct.
     * 
     * @param manualEntry
     */
    public void setManualEntry(java.lang.Boolean manualEntry) {
        this.manualEntry = manualEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayDeduct)) return false;
        PaycheckPayDeduct other = (PaycheckPayDeduct) obj;
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
            ((this.wageBase==null && other.getWageBase()==null) || 
             (this.wageBase!=null &&
              this.wageBase.equals(other.getWageBase()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
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
        if (getWageBase() != null) {
            _hashCode += getWageBase().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getManualEntry() != null) {
            _hashCode += getManualEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckPayDeduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayDeduct"));
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
        elemField.setFieldName("wageBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "wageBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "amount"));
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
