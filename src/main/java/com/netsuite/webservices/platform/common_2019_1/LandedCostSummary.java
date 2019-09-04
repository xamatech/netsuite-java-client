/**
 * LandedCostSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class LandedCostSummary  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef category;

    private java.lang.Double amount;

    private com.netsuite.webservices.platform.common_2019_1.types.LandedCostSource source;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef transaction;

    public LandedCostSummary() {
    }

    public LandedCostSummary(
           com.netsuite.webservices.platform.core_2019_1.RecordRef category,
           java.lang.Double amount,
           com.netsuite.webservices.platform.common_2019_1.types.LandedCostSource source,
           com.netsuite.webservices.platform.core_2019_1.RecordRef transaction) {
           this.category = category;
           this.amount = amount;
           this.source = source;
           this.transaction = transaction;
    }


    /**
     * Gets the category value for this LandedCostSummary.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this LandedCostSummary.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the amount value for this LandedCostSummary.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this LandedCostSummary.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the source value for this LandedCostSummary.
     * 
     * @return source
     */
    public com.netsuite.webservices.platform.common_2019_1.types.LandedCostSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this LandedCostSummary.
     * 
     * @param source
     */
    public void setSource(com.netsuite.webservices.platform.common_2019_1.types.LandedCostSource source) {
        this.source = source;
    }


    /**
     * Gets the transaction value for this LandedCostSummary.
     * 
     * @return transaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this LandedCostSummary.
     * 
     * @param transaction
     */
    public void setTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef transaction) {
        this.transaction = transaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LandedCostSummary)) return false;
        LandedCostSummary other = (LandedCostSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LandedCostSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LandedCostSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "LandedCostSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
