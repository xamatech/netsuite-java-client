/**
 * LandedCostData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class LandedCostData  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory;

    private java.lang.Double amount;

    public LandedCostData() {
    }

    public LandedCostData(
           com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory,
           java.lang.Double amount) {
           this.costCategory = costCategory;
           this.amount = amount;
    }


    /**
     * Gets the costCategory value for this LandedCostData.
     * 
     * @return costCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCostCategory() {
        return costCategory;
    }


    /**
     * Sets the costCategory value for this LandedCostData.
     * 
     * @param costCategory
     */
    public void setCostCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory) {
        this.costCategory = costCategory;
    }


    /**
     * Gets the amount value for this LandedCostData.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this LandedCostData.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LandedCostData)) return false;
        LandedCostData other = (LandedCostData) obj;
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
        if (getCostCategory() != null) {
            _hashCode += getCostCategory().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LandedCostData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LandedCostData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
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
