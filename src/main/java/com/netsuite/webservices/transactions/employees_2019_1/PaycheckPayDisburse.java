/**
 * PaycheckPayDisburse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPayDisburse  implements java.io.Serializable {
    private java.lang.String method;

    private java.lang.String bankName;

    private java.lang.String bankAccountDecrypt;

    private java.lang.String statusName;

    private java.lang.Double amount;

    public PaycheckPayDisburse() {
    }

    public PaycheckPayDisburse(
           java.lang.String method,
           java.lang.String bankName,
           java.lang.String bankAccountDecrypt,
           java.lang.String statusName,
           java.lang.Double amount) {
           this.method = method;
           this.bankName = bankName;
           this.bankAccountDecrypt = bankAccountDecrypt;
           this.statusName = statusName;
           this.amount = amount;
    }


    /**
     * Gets the method value for this PaycheckPayDisburse.
     * 
     * @return method
     */
    public java.lang.String getMethod() {
        return method;
    }


    /**
     * Sets the method value for this PaycheckPayDisburse.
     * 
     * @param method
     */
    public void setMethod(java.lang.String method) {
        this.method = method;
    }


    /**
     * Gets the bankName value for this PaycheckPayDisburse.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this PaycheckPayDisburse.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the bankAccountDecrypt value for this PaycheckPayDisburse.
     * 
     * @return bankAccountDecrypt
     */
    public java.lang.String getBankAccountDecrypt() {
        return bankAccountDecrypt;
    }


    /**
     * Sets the bankAccountDecrypt value for this PaycheckPayDisburse.
     * 
     * @param bankAccountDecrypt
     */
    public void setBankAccountDecrypt(java.lang.String bankAccountDecrypt) {
        this.bankAccountDecrypt = bankAccountDecrypt;
    }


    /**
     * Gets the statusName value for this PaycheckPayDisburse.
     * 
     * @return statusName
     */
    public java.lang.String getStatusName() {
        return statusName;
    }


    /**
     * Sets the statusName value for this PaycheckPayDisburse.
     * 
     * @param statusName
     */
    public void setStatusName(java.lang.String statusName) {
        this.statusName = statusName;
    }


    /**
     * Gets the amount value for this PaycheckPayDisburse.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaycheckPayDisburse.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayDisburse)) return false;
        PaycheckPayDisburse other = (PaycheckPayDisburse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.bankAccountDecrypt==null && other.getBankAccountDecrypt()==null) || 
             (this.bankAccountDecrypt!=null &&
              this.bankAccountDecrypt.equals(other.getBankAccountDecrypt()))) &&
            ((this.statusName==null && other.getStatusName()==null) || 
             (this.statusName!=null &&
              this.statusName.equals(other.getStatusName()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getBankAccountDecrypt() != null) {
            _hashCode += getBankAccountDecrypt().hashCode();
        }
        if (getStatusName() != null) {
            _hashCode += getStatusName().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckPayDisburse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayDisburse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountDecrypt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "bankAccountDecrypt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "statusName"));
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
