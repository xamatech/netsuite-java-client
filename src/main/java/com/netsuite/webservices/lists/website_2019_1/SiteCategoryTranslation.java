/**
 * SiteCategoryTranslation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.website_2019_1;

public class SiteCategoryTranslation  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.types.Language locale;

    private java.lang.String language;

    private java.lang.String displayName;

    private java.lang.String description;

    private java.lang.String storeDetailedDescription;

    private java.lang.String pageTitle;

    public SiteCategoryTranslation() {
    }

    public SiteCategoryTranslation(
           com.netsuite.webservices.platform.common_2019_1.types.Language locale,
           java.lang.String language,
           java.lang.String displayName,
           java.lang.String description,
           java.lang.String storeDetailedDescription,
           java.lang.String pageTitle) {
           this.locale = locale;
           this.language = language;
           this.displayName = displayName;
           this.description = description;
           this.storeDetailedDescription = storeDetailedDescription;
           this.pageTitle = pageTitle;
    }


    /**
     * Gets the locale value for this SiteCategoryTranslation.
     * 
     * @return locale
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Language getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this SiteCategoryTranslation.
     * 
     * @param locale
     */
    public void setLocale(com.netsuite.webservices.platform.common_2019_1.types.Language locale) {
        this.locale = locale;
    }


    /**
     * Gets the language value for this SiteCategoryTranslation.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this SiteCategoryTranslation.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the displayName value for this SiteCategoryTranslation.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this SiteCategoryTranslation.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the description value for this SiteCategoryTranslation.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SiteCategoryTranslation.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the storeDetailedDescription value for this SiteCategoryTranslation.
     * 
     * @return storeDetailedDescription
     */
    public java.lang.String getStoreDetailedDescription() {
        return storeDetailedDescription;
    }


    /**
     * Sets the storeDetailedDescription value for this SiteCategoryTranslation.
     * 
     * @param storeDetailedDescription
     */
    public void setStoreDetailedDescription(java.lang.String storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }


    /**
     * Gets the pageTitle value for this SiteCategoryTranslation.
     * 
     * @return pageTitle
     */
    public java.lang.String getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this SiteCategoryTranslation.
     * 
     * @param pageTitle
     */
    public void setPageTitle(java.lang.String pageTitle) {
        this.pageTitle = pageTitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteCategoryTranslation)) return false;
        SiteCategoryTranslation other = (SiteCategoryTranslation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.storeDetailedDescription==null && other.getStoreDetailedDescription()==null) || 
             (this.storeDetailedDescription!=null &&
              this.storeDetailedDescription.equals(other.getStoreDetailedDescription()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              this.pageTitle.equals(other.getPageTitle())));
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
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStoreDetailedDescription() != null) {
            _hashCode += getStoreDetailedDescription().hashCode();
        }
        if (getPageTitle() != null) {
            _hashCode += getPageTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteCategoryTranslation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "SiteCategoryTranslation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDetailedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "storeDetailedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "pageTitle"));
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
