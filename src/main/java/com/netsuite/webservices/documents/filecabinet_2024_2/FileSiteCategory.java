/**
 * FileSiteCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.documents.filecabinet_2024_2;

public class FileSiteCategory  implements java.io.Serializable {
    private java.lang.Boolean isDefault;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef category;

    private java.lang.String categoryDescription;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef website;

    public FileSiteCategory() {
    }

    public FileSiteCategory(
           java.lang.Boolean isDefault,
           com.netsuite.webservices.platform.core_2024_2.RecordRef category,
           java.lang.String categoryDescription,
           com.netsuite.webservices.platform.core_2024_2.RecordRef website) {
           this.isDefault = isDefault;
           this.category = category;
           this.categoryDescription = categoryDescription;
           this.website = website;
    }


    /**
     * Gets the isDefault value for this FileSiteCategory.
     * 
     * @return isDefault
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this FileSiteCategory.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the category value for this FileSiteCategory.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this FileSiteCategory.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2024_2.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the categoryDescription value for this FileSiteCategory.
     * 
     * @return categoryDescription
     */
    public java.lang.String getCategoryDescription() {
        return categoryDescription;
    }


    /**
     * Sets the categoryDescription value for this FileSiteCategory.
     * 
     * @param categoryDescription
     */
    public void setCategoryDescription(java.lang.String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    /**
     * Gets the website value for this FileSiteCategory.
     * 
     * @return website
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this FileSiteCategory.
     * 
     * @param website
     */
    public void setWebsite(com.netsuite.webservices.platform.core_2024_2.RecordRef website) {
        this.website = website;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileSiteCategory)) return false;
        FileSiteCategory other = (FileSiteCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.categoryDescription==null && other.getCategoryDescription()==null) || 
             (this.categoryDescription!=null &&
              this.categoryDescription.equals(other.getCategoryDescription()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite())));
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
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCategoryDescription() != null) {
            _hashCode += getCategoryDescription().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileSiteCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:filecabinet_2024_2.documents.webservices.netsuite.com", "FileSiteCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2024_2.documents.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2024_2.documents.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2024_2.documents.webservices.netsuite.com", "categoryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2024_2.documents.webservices.netsuite.com", "website"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
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
