/**
 * Usage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class Usage  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subscriptionPlan;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef usageSubscription;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef usageSubscriptionLine;

    private java.lang.Double usageQuantity;

    private java.util.Calendar usageDate;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Usage() {
    }

    public Usage(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subscriptionPlan,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           com.netsuite.webservices.platform.core_2019_1.RecordRef usageSubscription,
           com.netsuite.webservices.platform.core_2019_1.RecordRef usageSubscriptionLine,
           java.lang.Double usageQuantity,
           java.util.Calendar usageDate) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.memo = memo;
        this.item = item;
        this.subscriptionPlan = subscriptionPlan;
        this.customer = customer;
        this.usageSubscription = usageSubscription;
        this.usageSubscriptionLine = usageSubscriptionLine;
        this.usageQuantity = usageQuantity;
        this.usageDate = usageDate;
    }


    /**
     * Gets the customForm value for this Usage.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Usage.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the memo value for this Usage.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this Usage.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the item value for this Usage.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this Usage.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the subscriptionPlan value for this Usage.
     * 
     * @return subscriptionPlan
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubscriptionPlan() {
        return subscriptionPlan;
    }


    /**
     * Sets the subscriptionPlan value for this Usage.
     * 
     * @param subscriptionPlan
     */
    public void setSubscriptionPlan(com.netsuite.webservices.platform.core_2019_1.RecordRef subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }


    /**
     * Gets the customer value for this Usage.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this Usage.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the usageSubscription value for this Usage.
     * 
     * @return usageSubscription
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUsageSubscription() {
        return usageSubscription;
    }


    /**
     * Sets the usageSubscription value for this Usage.
     * 
     * @param usageSubscription
     */
    public void setUsageSubscription(com.netsuite.webservices.platform.core_2019_1.RecordRef usageSubscription) {
        this.usageSubscription = usageSubscription;
    }


    /**
     * Gets the usageSubscriptionLine value for this Usage.
     * 
     * @return usageSubscriptionLine
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUsageSubscriptionLine() {
        return usageSubscriptionLine;
    }


    /**
     * Sets the usageSubscriptionLine value for this Usage.
     * 
     * @param usageSubscriptionLine
     */
    public void setUsageSubscriptionLine(com.netsuite.webservices.platform.core_2019_1.RecordRef usageSubscriptionLine) {
        this.usageSubscriptionLine = usageSubscriptionLine;
    }


    /**
     * Gets the usageQuantity value for this Usage.
     * 
     * @return usageQuantity
     */
    public java.lang.Double getUsageQuantity() {
        return usageQuantity;
    }


    /**
     * Sets the usageQuantity value for this Usage.
     * 
     * @param usageQuantity
     */
    public void setUsageQuantity(java.lang.Double usageQuantity) {
        this.usageQuantity = usageQuantity;
    }


    /**
     * Gets the usageDate value for this Usage.
     * 
     * @return usageDate
     */
    public java.util.Calendar getUsageDate() {
        return usageDate;
    }


    /**
     * Sets the usageDate value for this Usage.
     * 
     * @param usageDate
     */
    public void setUsageDate(java.util.Calendar usageDate) {
        this.usageDate = usageDate;
    }


    /**
     * Gets the internalId value for this Usage.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Usage.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Usage.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Usage.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Usage)) return false;
        Usage other = (Usage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.subscriptionPlan==null && other.getSubscriptionPlan()==null) || 
             (this.subscriptionPlan!=null &&
              this.subscriptionPlan.equals(other.getSubscriptionPlan()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.usageSubscription==null && other.getUsageSubscription()==null) || 
             (this.usageSubscription!=null &&
              this.usageSubscription.equals(other.getUsageSubscription()))) &&
            ((this.usageSubscriptionLine==null && other.getUsageSubscriptionLine()==null) || 
             (this.usageSubscriptionLine!=null &&
              this.usageSubscriptionLine.equals(other.getUsageSubscriptionLine()))) &&
            ((this.usageQuantity==null && other.getUsageQuantity()==null) || 
             (this.usageQuantity!=null &&
              this.usageQuantity.equals(other.getUsageQuantity()))) &&
            ((this.usageDate==null && other.getUsageDate()==null) || 
             (this.usageDate!=null &&
              this.usageDate.equals(other.getUsageDate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getSubscriptionPlan() != null) {
            _hashCode += getSubscriptionPlan().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getUsageSubscription() != null) {
            _hashCode += getUsageSubscription().hashCode();
        }
        if (getUsageSubscriptionLine() != null) {
            _hashCode += getUsageSubscriptionLine().hashCode();
        }
        if (getUsageQuantity() != null) {
            _hashCode += getUsageQuantity().hashCode();
        }
        if (getUsageDate() != null) {
            _hashCode += getUsageDate().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Usage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "Usage"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subscriptionPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageSubscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "usageSubscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageSubscriptionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "usageSubscriptionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "usageQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "usageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
