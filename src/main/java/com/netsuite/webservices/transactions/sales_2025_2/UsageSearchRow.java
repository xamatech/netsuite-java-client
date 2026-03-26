/**
 * UsageSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2025_2;

public class UsageSearchRow  extends com.netsuite.webservices.platform.core_2025_2.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2025_2.UsageSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2025_2.ChargeSearchRowBasic chargeJoin;

    private com.netsuite.webservices.platform.common_2025_2.CustomerSearchRowBasic customerJoin;

    private com.netsuite.webservices.platform.common_2025_2.ItemSearchRowBasic itemJoin;

    private com.netsuite.webservices.platform.common_2025_2.ItemSearchRowBasic subscriptionPlanJoin;

    private com.netsuite.webservices.platform.common_2025_2.CustomSearchRowBasic[] customSearchJoin;

    public UsageSearchRow() {
    }

    public UsageSearchRow(
           com.netsuite.webservices.platform.common_2025_2.UsageSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2025_2.ChargeSearchRowBasic chargeJoin,
           com.netsuite.webservices.platform.common_2025_2.CustomerSearchRowBasic customerJoin,
           com.netsuite.webservices.platform.common_2025_2.ItemSearchRowBasic itemJoin,
           com.netsuite.webservices.platform.common_2025_2.ItemSearchRowBasic subscriptionPlanJoin,
           com.netsuite.webservices.platform.common_2025_2.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.chargeJoin = chargeJoin;
        this.customerJoin = customerJoin;
        this.itemJoin = itemJoin;
        this.subscriptionPlanJoin = subscriptionPlanJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this UsageSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2025_2.UsageSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this UsageSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2025_2.UsageSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the chargeJoin value for this UsageSearchRow.
     * 
     * @return chargeJoin
     */
    public com.netsuite.webservices.platform.common_2025_2.ChargeSearchRowBasic getChargeJoin() {
        return chargeJoin;
    }


    /**
     * Sets the chargeJoin value for this UsageSearchRow.
     * 
     * @param chargeJoin
     */
    public void setChargeJoin(com.netsuite.webservices.platform.common_2025_2.ChargeSearchRowBasic chargeJoin) {
        this.chargeJoin = chargeJoin;
    }


    /**
     * Gets the customerJoin value for this UsageSearchRow.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2025_2.CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this UsageSearchRow.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2025_2.CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the itemJoin value for this UsageSearchRow.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2025_2.ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this UsageSearchRow.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2025_2.ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the subscriptionPlanJoin value for this UsageSearchRow.
     * 
     * @return subscriptionPlanJoin
     */
    public com.netsuite.webservices.platform.common_2025_2.ItemSearchRowBasic getSubscriptionPlanJoin() {
        return subscriptionPlanJoin;
    }


    /**
     * Sets the subscriptionPlanJoin value for this UsageSearchRow.
     * 
     * @param subscriptionPlanJoin
     */
    public void setSubscriptionPlanJoin(com.netsuite.webservices.platform.common_2025_2.ItemSearchRowBasic subscriptionPlanJoin) {
        this.subscriptionPlanJoin = subscriptionPlanJoin;
    }


    /**
     * Gets the customSearchJoin value for this UsageSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2025_2.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this UsageSearchRow.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2025_2.CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2025_2.CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2025_2.CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageSearchRow)) return false;
        UsageSearchRow other = (UsageSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.chargeJoin==null && other.getChargeJoin()==null) || 
             (this.chargeJoin!=null &&
              this.chargeJoin.equals(other.getChargeJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.subscriptionPlanJoin==null && other.getSubscriptionPlanJoin()==null) || 
             (this.subscriptionPlanJoin!=null &&
              this.subscriptionPlanJoin.equals(other.getSubscriptionPlanJoin()))) &&
            ((this.customSearchJoin==null && other.getCustomSearchJoin()==null) || 
             (this.customSearchJoin!=null &&
              java.util.Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getChargeJoin() != null) {
            _hashCode += getChargeJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getSubscriptionPlanJoin() != null) {
            _hashCode += getSubscriptionPlanJoin().hashCode();
        }
        if (getCustomSearchJoin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSearchJoin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSearchJoin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2025_2.transactions.webservices.netsuite.com", "UsageSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2025_2.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2025_2.platform.webservices.netsuite.com", "UsageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2025_2.transactions.webservices.netsuite.com", "chargeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2025_2.platform.webservices.netsuite.com", "ChargeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2025_2.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2025_2.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2025_2.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2025_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionPlanJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2025_2.transactions.webservices.netsuite.com", "subscriptionPlanJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2025_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2025_2.transactions.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2025_2.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
