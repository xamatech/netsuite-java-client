/**
 * PaycheckPayTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPayTax  implements java.io.Serializable {
    private java.lang.Long line;

    private java.lang.Boolean apply;

    private java.lang.String payTax;

    private java.lang.Long payItem;

    private java.lang.Double taxableWageBase;

    private java.lang.Double taxedWageBase;

    private java.lang.Double reportableWageBase;

    private java.lang.Boolean isExempt;

    private java.lang.Boolean isResidentTax;

    private java.lang.Double amount;

    public PaycheckPayTax() {
    }

    public PaycheckPayTax(
           java.lang.Long line,
           java.lang.Boolean apply,
           java.lang.String payTax,
           java.lang.Long payItem,
           java.lang.Double taxableWageBase,
           java.lang.Double taxedWageBase,
           java.lang.Double reportableWageBase,
           java.lang.Boolean isExempt,
           java.lang.Boolean isResidentTax,
           java.lang.Double amount) {
           this.line = line;
           this.apply = apply;
           this.payTax = payTax;
           this.payItem = payItem;
           this.taxableWageBase = taxableWageBase;
           this.taxedWageBase = taxedWageBase;
           this.reportableWageBase = reportableWageBase;
           this.isExempt = isExempt;
           this.isResidentTax = isResidentTax;
           this.amount = amount;
    }


    /**
     * Gets the line value for this PaycheckPayTax.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this PaycheckPayTax.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the apply value for this PaycheckPayTax.
     * 
     * @return apply
     */
    public java.lang.Boolean getApply() {
        return apply;
    }


    /**
     * Sets the apply value for this PaycheckPayTax.
     * 
     * @param apply
     */
    public void setApply(java.lang.Boolean apply) {
        this.apply = apply;
    }


    /**
     * Gets the payTax value for this PaycheckPayTax.
     * 
     * @return payTax
     */
    public java.lang.String getPayTax() {
        return payTax;
    }


    /**
     * Sets the payTax value for this PaycheckPayTax.
     * 
     * @param payTax
     */
    public void setPayTax(java.lang.String payTax) {
        this.payTax = payTax;
    }


    /**
     * Gets the payItem value for this PaycheckPayTax.
     * 
     * @return payItem
     */
    public java.lang.Long getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this PaycheckPayTax.
     * 
     * @param payItem
     */
    public void setPayItem(java.lang.Long payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the taxableWageBase value for this PaycheckPayTax.
     * 
     * @return taxableWageBase
     */
    public java.lang.Double getTaxableWageBase() {
        return taxableWageBase;
    }


    /**
     * Sets the taxableWageBase value for this PaycheckPayTax.
     * 
     * @param taxableWageBase
     */
    public void setTaxableWageBase(java.lang.Double taxableWageBase) {
        this.taxableWageBase = taxableWageBase;
    }


    /**
     * Gets the taxedWageBase value for this PaycheckPayTax.
     * 
     * @return taxedWageBase
     */
    public java.lang.Double getTaxedWageBase() {
        return taxedWageBase;
    }


    /**
     * Sets the taxedWageBase value for this PaycheckPayTax.
     * 
     * @param taxedWageBase
     */
    public void setTaxedWageBase(java.lang.Double taxedWageBase) {
        this.taxedWageBase = taxedWageBase;
    }


    /**
     * Gets the reportableWageBase value for this PaycheckPayTax.
     * 
     * @return reportableWageBase
     */
    public java.lang.Double getReportableWageBase() {
        return reportableWageBase;
    }


    /**
     * Sets the reportableWageBase value for this PaycheckPayTax.
     * 
     * @param reportableWageBase
     */
    public void setReportableWageBase(java.lang.Double reportableWageBase) {
        this.reportableWageBase = reportableWageBase;
    }


    /**
     * Gets the isExempt value for this PaycheckPayTax.
     * 
     * @return isExempt
     */
    public java.lang.Boolean getIsExempt() {
        return isExempt;
    }


    /**
     * Sets the isExempt value for this PaycheckPayTax.
     * 
     * @param isExempt
     */
    public void setIsExempt(java.lang.Boolean isExempt) {
        this.isExempt = isExempt;
    }


    /**
     * Gets the isResidentTax value for this PaycheckPayTax.
     * 
     * @return isResidentTax
     */
    public java.lang.Boolean getIsResidentTax() {
        return isResidentTax;
    }


    /**
     * Sets the isResidentTax value for this PaycheckPayTax.
     * 
     * @param isResidentTax
     */
    public void setIsResidentTax(java.lang.Boolean isResidentTax) {
        this.isResidentTax = isResidentTax;
    }


    /**
     * Gets the amount value for this PaycheckPayTax.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaycheckPayTax.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayTax)) return false;
        PaycheckPayTax other = (PaycheckPayTax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.apply==null && other.getApply()==null) || 
             (this.apply!=null &&
              this.apply.equals(other.getApply()))) &&
            ((this.payTax==null && other.getPayTax()==null) || 
             (this.payTax!=null &&
              this.payTax.equals(other.getPayTax()))) &&
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              this.payItem.equals(other.getPayItem()))) &&
            ((this.taxableWageBase==null && other.getTaxableWageBase()==null) || 
             (this.taxableWageBase!=null &&
              this.taxableWageBase.equals(other.getTaxableWageBase()))) &&
            ((this.taxedWageBase==null && other.getTaxedWageBase()==null) || 
             (this.taxedWageBase!=null &&
              this.taxedWageBase.equals(other.getTaxedWageBase()))) &&
            ((this.reportableWageBase==null && other.getReportableWageBase()==null) || 
             (this.reportableWageBase!=null &&
              this.reportableWageBase.equals(other.getReportableWageBase()))) &&
            ((this.isExempt==null && other.getIsExempt()==null) || 
             (this.isExempt!=null &&
              this.isExempt.equals(other.getIsExempt()))) &&
            ((this.isResidentTax==null && other.getIsResidentTax()==null) || 
             (this.isResidentTax!=null &&
              this.isResidentTax.equals(other.getIsResidentTax()))) &&
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
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getApply() != null) {
            _hashCode += getApply().hashCode();
        }
        if (getPayTax() != null) {
            _hashCode += getPayTax().hashCode();
        }
        if (getPayItem() != null) {
            _hashCode += getPayItem().hashCode();
        }
        if (getTaxableWageBase() != null) {
            _hashCode += getTaxableWageBase().hashCode();
        }
        if (getTaxedWageBase() != null) {
            _hashCode += getTaxedWageBase().hashCode();
        }
        if (getReportableWageBase() != null) {
            _hashCode += getReportableWageBase().hashCode();
        }
        if (getIsExempt() != null) {
            _hashCode += getIsExempt().hashCode();
        }
        if (getIsResidentTax() != null) {
            _hashCode += getIsResidentTax().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckPayTax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayTax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "apply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxableWageBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "taxableWageBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedWageBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "taxedWageBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportableWageBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "reportableWageBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "isExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isResidentTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "isResidentTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
