/**
 * CustomRecordTypeTranslations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2024_2;

public class CustomRecordTypeTranslations  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2024_2.types.Language locale;

    private java.lang.String localeDescription;

    private java.lang.String name;

    public CustomRecordTypeTranslations() {
    }

    public CustomRecordTypeTranslations(
           com.netsuite.webservices.platform.common_2024_2.types.Language locale,
           java.lang.String localeDescription,
           java.lang.String name) {
           this.locale = locale;
           this.localeDescription = localeDescription;
           this.name = name;
    }


    /**
     * Gets the locale value for this CustomRecordTypeTranslations.
     * 
     * @return locale
     */
    public com.netsuite.webservices.platform.common_2024_2.types.Language getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this CustomRecordTypeTranslations.
     * 
     * @param locale
     */
    public void setLocale(com.netsuite.webservices.platform.common_2024_2.types.Language locale) {
        this.locale = locale;
    }


    /**
     * Gets the localeDescription value for this CustomRecordTypeTranslations.
     * 
     * @return localeDescription
     */
    public java.lang.String getLocaleDescription() {
        return localeDescription;
    }


    /**
     * Sets the localeDescription value for this CustomRecordTypeTranslations.
     * 
     * @param localeDescription
     */
    public void setLocaleDescription(java.lang.String localeDescription) {
        this.localeDescription = localeDescription;
    }


    /**
     * Gets the name value for this CustomRecordTypeTranslations.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomRecordTypeTranslations.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeTranslations)) return false;
        CustomRecordTypeTranslations other = (CustomRecordTypeTranslations) obj;
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
            ((this.localeDescription==null && other.getLocaleDescription()==null) || 
             (this.localeDescription!=null &&
              this.localeDescription.equals(other.getLocaleDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getLocaleDescription() != null) {
            _hashCode += getLocaleDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypeTranslations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "CustomRecordTypeTranslations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2024_2.platform.webservices.netsuite.com", "Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "localeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "name"));
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
