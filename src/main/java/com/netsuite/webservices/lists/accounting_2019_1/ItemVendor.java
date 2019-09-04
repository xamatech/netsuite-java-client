/**
 * ItemVendor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ItemVendor  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef vendor;

    private java.lang.String vendorCode;

    private java.lang.String vendorCurrencyName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef vendorCurrency;

    private java.lang.Double purchasePrice;

    private java.lang.Boolean preferredVendor;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef schedule;

    private java.lang.String subsidiary;

    public ItemVendor() {
    }

    public ItemVendor(
           com.netsuite.webservices.platform.core_2019_1.RecordRef vendor,
           java.lang.String vendorCode,
           java.lang.String vendorCurrencyName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef vendorCurrency,
           java.lang.Double purchasePrice,
           java.lang.Boolean preferredVendor,
           com.netsuite.webservices.platform.core_2019_1.RecordRef schedule,
           java.lang.String subsidiary) {
           this.vendor = vendor;
           this.vendorCode = vendorCode;
           this.vendorCurrencyName = vendorCurrencyName;
           this.vendorCurrency = vendorCurrency;
           this.purchasePrice = purchasePrice;
           this.preferredVendor = preferredVendor;
           this.schedule = schedule;
           this.subsidiary = subsidiary;
    }


    /**
     * Gets the vendor value for this ItemVendor.
     * 
     * @return vendor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this ItemVendor.
     * 
     * @param vendor
     */
    public void setVendor(com.netsuite.webservices.platform.core_2019_1.RecordRef vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the vendorCode value for this ItemVendor.
     * 
     * @return vendorCode
     */
    public java.lang.String getVendorCode() {
        return vendorCode;
    }


    /**
     * Sets the vendorCode value for this ItemVendor.
     * 
     * @param vendorCode
     */
    public void setVendorCode(java.lang.String vendorCode) {
        this.vendorCode = vendorCode;
    }


    /**
     * Gets the vendorCurrencyName value for this ItemVendor.
     * 
     * @return vendorCurrencyName
     */
    public java.lang.String getVendorCurrencyName() {
        return vendorCurrencyName;
    }


    /**
     * Sets the vendorCurrencyName value for this ItemVendor.
     * 
     * @param vendorCurrencyName
     */
    public void setVendorCurrencyName(java.lang.String vendorCurrencyName) {
        this.vendorCurrencyName = vendorCurrencyName;
    }


    /**
     * Gets the vendorCurrency value for this ItemVendor.
     * 
     * @return vendorCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVendorCurrency() {
        return vendorCurrency;
    }


    /**
     * Sets the vendorCurrency value for this ItemVendor.
     * 
     * @param vendorCurrency
     */
    public void setVendorCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef vendorCurrency) {
        this.vendorCurrency = vendorCurrency;
    }


    /**
     * Gets the purchasePrice value for this ItemVendor.
     * 
     * @return purchasePrice
     */
    public java.lang.Double getPurchasePrice() {
        return purchasePrice;
    }


    /**
     * Sets the purchasePrice value for this ItemVendor.
     * 
     * @param purchasePrice
     */
    public void setPurchasePrice(java.lang.Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }


    /**
     * Gets the preferredVendor value for this ItemVendor.
     * 
     * @return preferredVendor
     */
    public java.lang.Boolean getPreferredVendor() {
        return preferredVendor;
    }


    /**
     * Sets the preferredVendor value for this ItemVendor.
     * 
     * @param preferredVendor
     */
    public void setPreferredVendor(java.lang.Boolean preferredVendor) {
        this.preferredVendor = preferredVendor;
    }


    /**
     * Gets the schedule value for this ItemVendor.
     * 
     * @return schedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this ItemVendor.
     * 
     * @param schedule
     */
    public void setSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef schedule) {
        this.schedule = schedule;
    }


    /**
     * Gets the subsidiary value for this ItemVendor.
     * 
     * @return subsidiary
     */
    public java.lang.String getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ItemVendor.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(java.lang.String subsidiary) {
        this.subsidiary = subsidiary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemVendor)) return false;
        ItemVendor other = (ItemVendor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.vendorCode==null && other.getVendorCode()==null) || 
             (this.vendorCode!=null &&
              this.vendorCode.equals(other.getVendorCode()))) &&
            ((this.vendorCurrencyName==null && other.getVendorCurrencyName()==null) || 
             (this.vendorCurrencyName!=null &&
              this.vendorCurrencyName.equals(other.getVendorCurrencyName()))) &&
            ((this.vendorCurrency==null && other.getVendorCurrency()==null) || 
             (this.vendorCurrency!=null &&
              this.vendorCurrency.equals(other.getVendorCurrency()))) &&
            ((this.purchasePrice==null && other.getPurchasePrice()==null) || 
             (this.purchasePrice!=null &&
              this.purchasePrice.equals(other.getPurchasePrice()))) &&
            ((this.preferredVendor==null && other.getPreferredVendor()==null) || 
             (this.preferredVendor!=null &&
              this.preferredVendor.equals(other.getPreferredVendor()))) &&
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              this.schedule.equals(other.getSchedule()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary())));
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
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getVendorCode() != null) {
            _hashCode += getVendorCode().hashCode();
        }
        if (getVendorCurrencyName() != null) {
            _hashCode += getVendorCurrencyName().hashCode();
        }
        if (getVendorCurrency() != null) {
            _hashCode += getVendorCurrency().hashCode();
        }
        if (getPurchasePrice() != null) {
            _hashCode += getPurchasePrice().hashCode();
        }
        if (getPreferredVendor() != null) {
            _hashCode += getPreferredVendor().hashCode();
        }
        if (getSchedule() != null) {
            _hashCode += getSchedule().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemVendor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ItemVendor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vendorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCurrencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vendorCurrencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vendorCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "preferredVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
