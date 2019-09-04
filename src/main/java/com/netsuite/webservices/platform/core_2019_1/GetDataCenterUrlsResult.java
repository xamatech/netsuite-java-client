/**
 * GetDataCenterUrlsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class GetDataCenterUrlsResult  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.Status status;

    private com.netsuite.webservices.platform.core_2019_1.DataCenterUrls dataCenterUrls;

    public GetDataCenterUrlsResult() {
    }

    public GetDataCenterUrlsResult(
           com.netsuite.webservices.platform.core_2019_1.Status status,
           com.netsuite.webservices.platform.core_2019_1.DataCenterUrls dataCenterUrls) {
           this.status = status;
           this.dataCenterUrls = dataCenterUrls;
    }


    /**
     * Gets the status value for this GetDataCenterUrlsResult.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetDataCenterUrlsResult.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.Status status) {
        this.status = status;
    }


    /**
     * Gets the dataCenterUrls value for this GetDataCenterUrlsResult.
     * 
     * @return dataCenterUrls
     */
    public com.netsuite.webservices.platform.core_2019_1.DataCenterUrls getDataCenterUrls() {
        return dataCenterUrls;
    }


    /**
     * Sets the dataCenterUrls value for this GetDataCenterUrlsResult.
     * 
     * @param dataCenterUrls
     */
    public void setDataCenterUrls(com.netsuite.webservices.platform.core_2019_1.DataCenterUrls dataCenterUrls) {
        this.dataCenterUrls = dataCenterUrls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDataCenterUrlsResult)) return false;
        GetDataCenterUrlsResult other = (GetDataCenterUrlsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.dataCenterUrls==null && other.getDataCenterUrls()==null) || 
             (this.dataCenterUrls!=null &&
              this.dataCenterUrls.equals(other.getDataCenterUrls())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDataCenterUrls() != null) {
            _hashCode += getDataCenterUrls().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDataCenterUrlsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "GetDataCenterUrlsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCenterUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "dataCenterUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DataCenterUrls"));
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
