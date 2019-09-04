/**
 * DocumentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.messages_2019_1;

public class DocumentInfo  implements java.io.Serializable {
    private java.lang.String nsId;

    public DocumentInfo() {
    }

    public DocumentInfo(
           java.lang.String nsId) {
           this.nsId = nsId;
    }


    /**
     * Gets the nsId value for this DocumentInfo.
     * 
     * @return nsId
     */
    public java.lang.String getNsId() {
        return nsId;
    }


    /**
     * Sets the nsId value for this DocumentInfo.
     * 
     * @param nsId
     */
    public void setNsId(java.lang.String nsId) {
        this.nsId = nsId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentInfo)) return false;
        DocumentInfo other = (DocumentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nsId==null && other.getNsId()==null) || 
             (this.nsId!=null &&
              this.nsId.equals(other.getNsId())));
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
        if (getNsId() != null) {
            _hashCode += getNsId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "DocumentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nsId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "nsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
