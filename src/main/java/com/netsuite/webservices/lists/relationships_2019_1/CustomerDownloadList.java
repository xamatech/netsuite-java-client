/**
 * CustomerDownloadList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerDownloadList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.relationships_2019_1.CustomerDownload[] download;

    private boolean replaceAll;  // attribute

    public CustomerDownloadList() {
    }

    public CustomerDownloadList(
           com.netsuite.webservices.lists.relationships_2019_1.CustomerDownload[] download,
           boolean replaceAll) {
           this.download = download;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the download value for this CustomerDownloadList.
     * 
     * @return download
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerDownload[] getDownload() {
        return download;
    }


    /**
     * Sets the download value for this CustomerDownloadList.
     * 
     * @param download
     */
    public void setDownload(com.netsuite.webservices.lists.relationships_2019_1.CustomerDownload[] download) {
        this.download = download;
    }

    public com.netsuite.webservices.lists.relationships_2019_1.CustomerDownload getDownload(int i) {
        return this.download[i];
    }

    public void setDownload(int i, com.netsuite.webservices.lists.relationships_2019_1.CustomerDownload _value) {
        this.download[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomerDownloadList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomerDownloadList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerDownloadList)) return false;
        CustomerDownloadList other = (CustomerDownloadList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.download==null && other.getDownload()==null) || 
             (this.download!=null &&
              java.util.Arrays.equals(this.download, other.getDownload()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (getDownload() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDownload());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDownload(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerDownloadList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerDownloadList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("download");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "download"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerDownload"));
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
