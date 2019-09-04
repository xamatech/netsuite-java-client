/**
 * PaycheckPayTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPayTime  implements java.io.Serializable {
    private java.lang.Boolean apply;

    private java.lang.Long line;

    private java.lang.Long payItem;

    private java.lang.String payItemName;

    private java.util.Calendar ddate;

    private java.lang.String custJob;

    private java.lang.String serviceItem;

    private java.lang.Double count;

    private java.lang.Double rate;

    private java.lang.Double amount;

    public PaycheckPayTime() {
    }

    public PaycheckPayTime(
           java.lang.Boolean apply,
           java.lang.Long line,
           java.lang.Long payItem,
           java.lang.String payItemName,
           java.util.Calendar ddate,
           java.lang.String custJob,
           java.lang.String serviceItem,
           java.lang.Double count,
           java.lang.Double rate,
           java.lang.Double amount) {
           this.apply = apply;
           this.line = line;
           this.payItem = payItem;
           this.payItemName = payItemName;
           this.ddate = ddate;
           this.custJob = custJob;
           this.serviceItem = serviceItem;
           this.count = count;
           this.rate = rate;
           this.amount = amount;
    }


    /**
     * Gets the apply value for this PaycheckPayTime.
     * 
     * @return apply
     */
    public java.lang.Boolean getApply() {
        return apply;
    }


    /**
     * Sets the apply value for this PaycheckPayTime.
     * 
     * @param apply
     */
    public void setApply(java.lang.Boolean apply) {
        this.apply = apply;
    }


    /**
     * Gets the line value for this PaycheckPayTime.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this PaycheckPayTime.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the payItem value for this PaycheckPayTime.
     * 
     * @return payItem
     */
    public java.lang.Long getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this PaycheckPayTime.
     * 
     * @param payItem
     */
    public void setPayItem(java.lang.Long payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the payItemName value for this PaycheckPayTime.
     * 
     * @return payItemName
     */
    public java.lang.String getPayItemName() {
        return payItemName;
    }


    /**
     * Sets the payItemName value for this PaycheckPayTime.
     * 
     * @param payItemName
     */
    public void setPayItemName(java.lang.String payItemName) {
        this.payItemName = payItemName;
    }


    /**
     * Gets the ddate value for this PaycheckPayTime.
     * 
     * @return ddate
     */
    public java.util.Calendar getDdate() {
        return ddate;
    }


    /**
     * Sets the ddate value for this PaycheckPayTime.
     * 
     * @param ddate
     */
    public void setDdate(java.util.Calendar ddate) {
        this.ddate = ddate;
    }


    /**
     * Gets the custJob value for this PaycheckPayTime.
     * 
     * @return custJob
     */
    public java.lang.String getCustJob() {
        return custJob;
    }


    /**
     * Sets the custJob value for this PaycheckPayTime.
     * 
     * @param custJob
     */
    public void setCustJob(java.lang.String custJob) {
        this.custJob = custJob;
    }


    /**
     * Gets the serviceItem value for this PaycheckPayTime.
     * 
     * @return serviceItem
     */
    public java.lang.String getServiceItem() {
        return serviceItem;
    }


    /**
     * Sets the serviceItem value for this PaycheckPayTime.
     * 
     * @param serviceItem
     */
    public void setServiceItem(java.lang.String serviceItem) {
        this.serviceItem = serviceItem;
    }


    /**
     * Gets the count value for this PaycheckPayTime.
     * 
     * @return count
     */
    public java.lang.Double getCount() {
        return count;
    }


    /**
     * Sets the count value for this PaycheckPayTime.
     * 
     * @param count
     */
    public void setCount(java.lang.Double count) {
        this.count = count;
    }


    /**
     * Gets the rate value for this PaycheckPayTime.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this PaycheckPayTime.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the amount value for this PaycheckPayTime.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaycheckPayTime.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayTime)) return false;
        PaycheckPayTime other = (PaycheckPayTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apply==null && other.getApply()==null) || 
             (this.apply!=null &&
              this.apply.equals(other.getApply()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              this.payItem.equals(other.getPayItem()))) &&
            ((this.payItemName==null && other.getPayItemName()==null) || 
             (this.payItemName!=null &&
              this.payItemName.equals(other.getPayItemName()))) &&
            ((this.ddate==null && other.getDdate()==null) || 
             (this.ddate!=null &&
              this.ddate.equals(other.getDdate()))) &&
            ((this.custJob==null && other.getCustJob()==null) || 
             (this.custJob!=null &&
              this.custJob.equals(other.getCustJob()))) &&
            ((this.serviceItem==null && other.getServiceItem()==null) || 
             (this.serviceItem!=null &&
              this.serviceItem.equals(other.getServiceItem()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
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
        if (getApply() != null) {
            _hashCode += getApply().hashCode();
        }
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getPayItem() != null) {
            _hashCode += getPayItem().hashCode();
        }
        if (getPayItemName() != null) {
            _hashCode += getPayItemName().hashCode();
        }
        if (getDdate() != null) {
            _hashCode += getDdate().hashCode();
        }
        if (getCustJob() != null) {
            _hashCode += getCustJob().hashCode();
        }
        if (getServiceItem() != null) {
            _hashCode += getServiceItem().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckPayTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "apply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "ddate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "custJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
