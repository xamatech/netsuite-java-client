/**
 * DataCenterUrls.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class DataCenterUrls  implements java.io.Serializable {
    private java.lang.String restDomain;

    private java.lang.String webservicesDomain;

    private java.lang.String systemDomain;

    public DataCenterUrls() {
    }

    public DataCenterUrls(
           java.lang.String restDomain,
           java.lang.String webservicesDomain,
           java.lang.String systemDomain) {
           this.restDomain = restDomain;
           this.webservicesDomain = webservicesDomain;
           this.systemDomain = systemDomain;
    }


    /**
     * Gets the restDomain value for this DataCenterUrls.
     * 
     * @return restDomain
     */
    public java.lang.String getRestDomain() {
        return restDomain;
    }


    /**
     * Sets the restDomain value for this DataCenterUrls.
     * 
     * @param restDomain
     */
    public void setRestDomain(java.lang.String restDomain) {
        this.restDomain = restDomain;
    }


    /**
     * Gets the webservicesDomain value for this DataCenterUrls.
     * 
     * @return webservicesDomain
     */
    public java.lang.String getWebservicesDomain() {
        return webservicesDomain;
    }


    /**
     * Sets the webservicesDomain value for this DataCenterUrls.
     * 
     * @param webservicesDomain
     */
    public void setWebservicesDomain(java.lang.String webservicesDomain) {
        this.webservicesDomain = webservicesDomain;
    }


    /**
     * Gets the systemDomain value for this DataCenterUrls.
     * 
     * @return systemDomain
     */
    public java.lang.String getSystemDomain() {
        return systemDomain;
    }


    /**
     * Sets the systemDomain value for this DataCenterUrls.
     * 
     * @param systemDomain
     */
    public void setSystemDomain(java.lang.String systemDomain) {
        this.systemDomain = systemDomain;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataCenterUrls)) return false;
        DataCenterUrls other = (DataCenterUrls) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.restDomain==null && other.getRestDomain()==null) || 
             (this.restDomain!=null &&
              this.restDomain.equals(other.getRestDomain()))) &&
            ((this.webservicesDomain==null && other.getWebservicesDomain()==null) || 
             (this.webservicesDomain!=null &&
              this.webservicesDomain.equals(other.getWebservicesDomain()))) &&
            ((this.systemDomain==null && other.getSystemDomain()==null) || 
             (this.systemDomain!=null &&
              this.systemDomain.equals(other.getSystemDomain())));
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
        if (getRestDomain() != null) {
            _hashCode += getRestDomain().hashCode();
        }
        if (getWebservicesDomain() != null) {
            _hashCode += getWebservicesDomain().hashCode();
        }
        if (getSystemDomain() != null) {
            _hashCode += getSystemDomain().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataCenterUrls.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DataCenterUrls"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "restDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webservicesDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "webservicesDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "systemDomain"));
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
