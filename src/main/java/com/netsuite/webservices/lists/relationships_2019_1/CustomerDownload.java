/**
 * CustomerDownload.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerDownload  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef file;

    private java.lang.String licenseCode;

    private java.lang.Long remainingDownloads;

    private java.util.Calendar expiration;

    public CustomerDownload() {
    }

    public CustomerDownload(
           com.netsuite.webservices.platform.core_2019_1.RecordRef file,
           java.lang.String licenseCode,
           java.lang.Long remainingDownloads,
           java.util.Calendar expiration) {
           this.file = file;
           this.licenseCode = licenseCode;
           this.remainingDownloads = remainingDownloads;
           this.expiration = expiration;
    }


    /**
     * Gets the file value for this CustomerDownload.
     * 
     * @return file
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFile() {
        return file;
    }


    /**
     * Sets the file value for this CustomerDownload.
     * 
     * @param file
     */
    public void setFile(com.netsuite.webservices.platform.core_2019_1.RecordRef file) {
        this.file = file;
    }


    /**
     * Gets the licenseCode value for this CustomerDownload.
     * 
     * @return licenseCode
     */
    public java.lang.String getLicenseCode() {
        return licenseCode;
    }


    /**
     * Sets the licenseCode value for this CustomerDownload.
     * 
     * @param licenseCode
     */
    public void setLicenseCode(java.lang.String licenseCode) {
        this.licenseCode = licenseCode;
    }


    /**
     * Gets the remainingDownloads value for this CustomerDownload.
     * 
     * @return remainingDownloads
     */
    public java.lang.Long getRemainingDownloads() {
        return remainingDownloads;
    }


    /**
     * Sets the remainingDownloads value for this CustomerDownload.
     * 
     * @param remainingDownloads
     */
    public void setRemainingDownloads(java.lang.Long remainingDownloads) {
        this.remainingDownloads = remainingDownloads;
    }


    /**
     * Gets the expiration value for this CustomerDownload.
     * 
     * @return expiration
     */
    public java.util.Calendar getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this CustomerDownload.
     * 
     * @param expiration
     */
    public void setExpiration(java.util.Calendar expiration) {
        this.expiration = expiration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerDownload)) return false;
        CustomerDownload other = (CustomerDownload) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              this.file.equals(other.getFile()))) &&
            ((this.licenseCode==null && other.getLicenseCode()==null) || 
             (this.licenseCode!=null &&
              this.licenseCode.equals(other.getLicenseCode()))) &&
            ((this.remainingDownloads==null && other.getRemainingDownloads()==null) || 
             (this.remainingDownloads!=null &&
              this.remainingDownloads.equals(other.getRemainingDownloads()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration())));
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
        if (getFile() != null) {
            _hashCode += getFile().hashCode();
        }
        if (getLicenseCode() != null) {
            _hashCode += getLicenseCode().hashCode();
        }
        if (getRemainingDownloads() != null) {
            _hashCode += getRemainingDownloads().hashCode();
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerDownload.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerDownload"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "licenseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingDownloads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "remainingDownloads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
