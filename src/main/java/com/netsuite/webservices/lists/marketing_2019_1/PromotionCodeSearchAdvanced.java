/**
 * PromotionCodeSearchAdvanced.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.marketing_2019_1;

public class PromotionCodeSearchAdvanced  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.lists.marketing_2019_1.PromotionCodeSearch criteria;

    private com.netsuite.webservices.lists.marketing_2019_1.PromotionCodeSearchRow columns;

    private java.lang.String savedSearchScriptId;  // attribute

    private java.lang.String savedSearchId;  // attribute

    public PromotionCodeSearchAdvanced() {
    }

    public PromotionCodeSearchAdvanced(
           java.lang.String savedSearchScriptId,
           java.lang.String savedSearchId,
           com.netsuite.webservices.lists.marketing_2019_1.PromotionCodeSearch criteria,
           com.netsuite.webservices.lists.marketing_2019_1.PromotionCodeSearchRow columns) {
        this.savedSearchScriptId = savedSearchScriptId;
        this.savedSearchId = savedSearchId;
        this.criteria = criteria;
        this.columns = columns;
    }


    /**
     * Gets the criteria value for this PromotionCodeSearchAdvanced.
     * 
     * @return criteria
     */
    public com.netsuite.webservices.lists.marketing_2019_1.PromotionCodeSearch getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this PromotionCodeSearchAdvanced.
     * 
     * @param criteria
     */
    public void setCriteria(com.netsuite.webservices.lists.marketing_2019_1.PromotionCodeSearch criteria) {
        this.criteria = criteria;
    }


    /**
     * Gets the columns value for this PromotionCodeSearchAdvanced.
     * 
     * @return columns
     */
    public com.netsuite.webservices.lists.marketing_2019_1.PromotionCodeSearchRow getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this PromotionCodeSearchAdvanced.
     * 
     * @param columns
     */
    public void setColumns(com.netsuite.webservices.lists.marketing_2019_1.PromotionCodeSearchRow columns) {
        this.columns = columns;
    }


    /**
     * Gets the savedSearchScriptId value for this PromotionCodeSearchAdvanced.
     * 
     * @return savedSearchScriptId
     */
    public java.lang.String getSavedSearchScriptId() {
        return savedSearchScriptId;
    }


    /**
     * Sets the savedSearchScriptId value for this PromotionCodeSearchAdvanced.
     * 
     * @param savedSearchScriptId
     */
    public void setSavedSearchScriptId(java.lang.String savedSearchScriptId) {
        this.savedSearchScriptId = savedSearchScriptId;
    }


    /**
     * Gets the savedSearchId value for this PromotionCodeSearchAdvanced.
     * 
     * @return savedSearchId
     */
    public java.lang.String getSavedSearchId() {
        return savedSearchId;
    }


    /**
     * Sets the savedSearchId value for this PromotionCodeSearchAdvanced.
     * 
     * @param savedSearchId
     */
    public void setSavedSearchId(java.lang.String savedSearchId) {
        this.savedSearchId = savedSearchId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionCodeSearchAdvanced)) return false;
        PromotionCodeSearchAdvanced other = (PromotionCodeSearchAdvanced) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              this.criteria.equals(other.getCriteria()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              this.columns.equals(other.getColumns()))) &&
            ((this.savedSearchScriptId==null && other.getSavedSearchScriptId()==null) || 
             (this.savedSearchScriptId!=null &&
              this.savedSearchScriptId.equals(other.getSavedSearchScriptId()))) &&
            ((this.savedSearchId==null && other.getSavedSearchId()==null) || 
             (this.savedSearchId!=null &&
              this.savedSearchId.equals(other.getSavedSearchId())));
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
        if (getCriteria() != null) {
            _hashCode += getCriteria().hashCode();
        }
        if (getColumns() != null) {
            _hashCode += getColumns().hashCode();
        }
        if (getSavedSearchScriptId() != null) {
            _hashCode += getSavedSearchScriptId().hashCode();
        }
        if (getSavedSearchId() != null) {
            _hashCode += getSavedSearchId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionCodeSearchAdvanced.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "PromotionCodeSearchAdvanced"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("savedSearchScriptId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "savedSearchScriptId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("savedSearchId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "savedSearchId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "PromotionCodeSearch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "PromotionCodeSearchRow"));
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
