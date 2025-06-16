/**
 * GetIntegrationGovernanceInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2024_2;

public class GetIntegrationGovernanceInfoResult  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.Status status;

    private java.lang.Long integrationConcurrencyLimit;

    private com.netsuite.webservices.platform.core_2024_2.types.GetIntegrationGovernanceInfoLimitType limitType;

    public GetIntegrationGovernanceInfoResult() {
    }

    public GetIntegrationGovernanceInfoResult(
           com.netsuite.webservices.platform.core_2024_2.Status status,
           java.lang.Long integrationConcurrencyLimit,
           com.netsuite.webservices.platform.core_2024_2.types.GetIntegrationGovernanceInfoLimitType limitType) {
           this.status = status;
           this.integrationConcurrencyLimit = integrationConcurrencyLimit;
           this.limitType = limitType;
    }


    /**
     * Gets the status value for this GetIntegrationGovernanceInfoResult.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2024_2.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetIntegrationGovernanceInfoResult.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2024_2.Status status) {
        this.status = status;
    }


    /**
     * Gets the integrationConcurrencyLimit value for this GetIntegrationGovernanceInfoResult.
     * 
     * @return integrationConcurrencyLimit
     */
    public java.lang.Long getIntegrationConcurrencyLimit() {
        return integrationConcurrencyLimit;
    }


    /**
     * Sets the integrationConcurrencyLimit value for this GetIntegrationGovernanceInfoResult.
     * 
     * @param integrationConcurrencyLimit
     */
    public void setIntegrationConcurrencyLimit(java.lang.Long integrationConcurrencyLimit) {
        this.integrationConcurrencyLimit = integrationConcurrencyLimit;
    }


    /**
     * Gets the limitType value for this GetIntegrationGovernanceInfoResult.
     * 
     * @return limitType
     */
    public com.netsuite.webservices.platform.core_2024_2.types.GetIntegrationGovernanceInfoLimitType getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this GetIntegrationGovernanceInfoResult.
     * 
     * @param limitType
     */
    public void setLimitType(com.netsuite.webservices.platform.core_2024_2.types.GetIntegrationGovernanceInfoLimitType limitType) {
        this.limitType = limitType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetIntegrationGovernanceInfoResult)) return false;
        GetIntegrationGovernanceInfoResult other = (GetIntegrationGovernanceInfoResult) obj;
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
            ((this.integrationConcurrencyLimit==null && other.getIntegrationConcurrencyLimit()==null) || 
             (this.integrationConcurrencyLimit!=null &&
              this.integrationConcurrencyLimit.equals(other.getIntegrationConcurrencyLimit()))) &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType())));
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
        if (getIntegrationConcurrencyLimit() != null) {
            _hashCode += getIntegrationConcurrencyLimit().hashCode();
        }
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetIntegrationGovernanceInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "GetIntegrationGovernanceInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrationConcurrencyLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "integrationConcurrencyLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "limitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2024_2.platform.webservices.netsuite.com", "GetIntegrationGovernanceInfoLimitType"));
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
