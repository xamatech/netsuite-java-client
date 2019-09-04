/**
 * PaycheckPaySummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPaySummary  implements java.io.Serializable {
    private java.lang.String payItem;

    private java.lang.String payItemType;

    private java.lang.Double amount;

    private java.lang.Double ytdAmount;

    public PaycheckPaySummary() {
    }

    public PaycheckPaySummary(
           java.lang.String payItem,
           java.lang.String payItemType,
           java.lang.Double amount,
           java.lang.Double ytdAmount) {
           this.payItem = payItem;
           this.payItemType = payItemType;
           this.amount = amount;
           this.ytdAmount = ytdAmount;
    }


    /**
     * Gets the payItem value for this PaycheckPaySummary.
     * 
     * @return payItem
     */
    public java.lang.String getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this PaycheckPaySummary.
     * 
     * @param payItem
     */
    public void setPayItem(java.lang.String payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the payItemType value for this PaycheckPaySummary.
     * 
     * @return payItemType
     */
    public java.lang.String getPayItemType() {
        return payItemType;
    }


    /**
     * Sets the payItemType value for this PaycheckPaySummary.
     * 
     * @param payItemType
     */
    public void setPayItemType(java.lang.String payItemType) {
        this.payItemType = payItemType;
    }


    /**
     * Gets the amount value for this PaycheckPaySummary.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaycheckPaySummary.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the ytdAmount value for this PaycheckPaySummary.
     * 
     * @return ytdAmount
     */
    public java.lang.Double getYtdAmount() {
        return ytdAmount;
    }


    /**
     * Sets the ytdAmount value for this PaycheckPaySummary.
     * 
     * @param ytdAmount
     */
    public void setYtdAmount(java.lang.Double ytdAmount) {
        this.ytdAmount = ytdAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPaySummary)) return false;
        PaycheckPaySummary other = (PaycheckPaySummary) obj;
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
            ((this.payItemType==null && other.getPayItemType()==null) || 
             (this.payItemType!=null &&
              this.payItemType.equals(other.getPayItemType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.ytdAmount==null && other.getYtdAmount()==null) || 
             (this.ytdAmount!=null &&
              this.ytdAmount.equals(other.getYtdAmount())));
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
        if (getPayItemType() != null) {
            _hashCode += getPayItemType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getYtdAmount() != null) {
            _hashCode += getYtdAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckPaySummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPaySummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("ytdAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "ytdAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
