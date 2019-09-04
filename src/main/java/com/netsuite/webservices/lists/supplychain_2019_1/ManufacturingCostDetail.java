/**
 * ManufacturingCostDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1;

public class ManufacturingCostDetail  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.Double fixedRate;

    private java.lang.Double runRate;

    public ManufacturingCostDetail() {
    }

    public ManufacturingCostDetail(
           com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.Double fixedRate,
           java.lang.Double runRate) {
           this.costCategory = costCategory;
           this.item = item;
           this.fixedRate = fixedRate;
           this.runRate = runRate;
    }


    /**
     * Gets the costCategory value for this ManufacturingCostDetail.
     * 
     * @return costCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCostCategory() {
        return costCategory;
    }


    /**
     * Sets the costCategory value for this ManufacturingCostDetail.
     * 
     * @param costCategory
     */
    public void setCostCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory) {
        this.costCategory = costCategory;
    }


    /**
     * Gets the item value for this ManufacturingCostDetail.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this ManufacturingCostDetail.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the fixedRate value for this ManufacturingCostDetail.
     * 
     * @return fixedRate
     */
    public java.lang.Double getFixedRate() {
        return fixedRate;
    }


    /**
     * Sets the fixedRate value for this ManufacturingCostDetail.
     * 
     * @param fixedRate
     */
    public void setFixedRate(java.lang.Double fixedRate) {
        this.fixedRate = fixedRate;
    }


    /**
     * Gets the runRate value for this ManufacturingCostDetail.
     * 
     * @return runRate
     */
    public java.lang.Double getRunRate() {
        return runRate;
    }


    /**
     * Sets the runRate value for this ManufacturingCostDetail.
     * 
     * @param runRate
     */
    public void setRunRate(java.lang.Double runRate) {
        this.runRate = runRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingCostDetail)) return false;
        ManufacturingCostDetail other = (ManufacturingCostDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.costCategory==null && other.getCostCategory()==null) || 
             (this.costCategory!=null &&
              this.costCategory.equals(other.getCostCategory()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.fixedRate==null && other.getFixedRate()==null) || 
             (this.fixedRate!=null &&
              this.fixedRate.equals(other.getFixedRate()))) &&
            ((this.runRate==null && other.getRunRate()==null) || 
             (this.runRate!=null &&
              this.runRate.equals(other.getRunRate())));
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
        if (getCostCategory() != null) {
            _hashCode += getCostCategory().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getFixedRate() != null) {
            _hashCode += getFixedRate().hashCode();
        }
        if (getRunRate() != null) {
            _hashCode += getRunRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturingCostDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingCostDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "fixedRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "runRate"));
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
