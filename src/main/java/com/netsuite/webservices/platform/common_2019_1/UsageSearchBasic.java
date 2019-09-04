/**
 * UsageSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class UsageSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField date;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscription;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionPlan;

    public UsageSearchBasic() {
    }

    public UsageSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField date,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField memo,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscription,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionLine,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionPlan) {
        this.customer = customer;
        this.date = date;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.memo = memo;
        this.quantity = quantity;
        this.subscription = subscription;
        this.subscriptionLine = subscriptionLine;
        this.subscriptionPlan = subscriptionPlan;
    }


    /**
     * Gets the customer value for this UsageSearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this UsageSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer) {
        this.customer = customer;
    }


    /**
     * Gets the date value for this UsageSearchBasic.
     * 
     * @return date
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDate() {
        return date;
    }


    /**
     * Sets the date value for this UsageSearchBasic.
     * 
     * @param date
     */
    public void setDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField date) {
        this.date = date;
    }


    /**
     * Gets the externalId value for this UsageSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this UsageSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this UsageSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this UsageSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this UsageSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this UsageSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this UsageSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this UsageSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the item value for this UsageSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this UsageSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the memo value for this UsageSearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this UsageSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the quantity value for this UsageSearchBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this UsageSearchBasic.
     * 
     * @param quantity
     */
    public void setQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the subscription value for this UsageSearchBasic.
     * 
     * @return subscription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this UsageSearchBasic.
     * 
     * @param subscription
     */
    public void setSubscription(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the subscriptionLine value for this UsageSearchBasic.
     * 
     * @return subscriptionLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubscriptionLine() {
        return subscriptionLine;
    }


    /**
     * Sets the subscriptionLine value for this UsageSearchBasic.
     * 
     * @param subscriptionLine
     */
    public void setSubscriptionLine(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }


    /**
     * Gets the subscriptionPlan value for this UsageSearchBasic.
     * 
     * @return subscriptionPlan
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubscriptionPlan() {
        return subscriptionPlan;
    }


    /**
     * Sets the subscriptionPlan value for this UsageSearchBasic.
     * 
     * @param subscriptionPlan
     */
    public void setSubscriptionPlan(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageSearchBasic)) return false;
        UsageSearchBasic other = (UsageSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.subscriptionLine==null && other.getSubscriptionLine()==null) || 
             (this.subscriptionLine!=null &&
              this.subscriptionLine.equals(other.getSubscriptionLine()))) &&
            ((this.subscriptionPlan==null && other.getSubscriptionPlan()==null) || 
             (this.subscriptionPlan!=null &&
              this.subscriptionPlan.equals(other.getSubscriptionPlan())));
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getSubscriptionLine() != null) {
            _hashCode += getSubscriptionLine().hashCode();
        }
        if (getSubscriptionPlan() != null) {
            _hashCode += getSubscriptionPlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "UsageSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscriptionPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
