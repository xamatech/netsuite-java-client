/**
 * StatusDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class StatusDetail  implements java.io.Serializable {
    private com.netsuite.webservices.platform.faults_2019_1.types.StatusDetailCodeType code;

    private java.lang.String message;

    private java.lang.Boolean afterSubmitFailed;

    private com.netsuite.webservices.platform.faults_2019_1.types.StatusDetailType type;  // attribute

    public StatusDetail() {
    }

    public StatusDetail(
           com.netsuite.webservices.platform.faults_2019_1.types.StatusDetailCodeType code,
           java.lang.String message,
           java.lang.Boolean afterSubmitFailed,
           com.netsuite.webservices.platform.faults_2019_1.types.StatusDetailType type) {
           this.code = code;
           this.message = message;
           this.afterSubmitFailed = afterSubmitFailed;
           this.type = type;
    }


    /**
     * Gets the code value for this StatusDetail.
     * 
     * @return code
     */
    public com.netsuite.webservices.platform.faults_2019_1.types.StatusDetailCodeType getCode() {
        return code;
    }


    /**
     * Sets the code value for this StatusDetail.
     * 
     * @param code
     */
    public void setCode(com.netsuite.webservices.platform.faults_2019_1.types.StatusDetailCodeType code) {
        this.code = code;
    }


    /**
     * Gets the message value for this StatusDetail.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this StatusDetail.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the afterSubmitFailed value for this StatusDetail.
     * 
     * @return afterSubmitFailed
     */
    public java.lang.Boolean getAfterSubmitFailed() {
        return afterSubmitFailed;
    }


    /**
     * Sets the afterSubmitFailed value for this StatusDetail.
     * 
     * @param afterSubmitFailed
     */
    public void setAfterSubmitFailed(java.lang.Boolean afterSubmitFailed) {
        this.afterSubmitFailed = afterSubmitFailed;
    }


    /**
     * Gets the type value for this StatusDetail.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.faults_2019_1.types.StatusDetailType getType() {
        return type;
    }


    /**
     * Sets the type value for this StatusDetail.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.faults_2019_1.types.StatusDetailType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusDetail)) return false;
        StatusDetail other = (StatusDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.afterSubmitFailed==null && other.getAfterSubmitFailed()==null) || 
             (this.afterSubmitFailed!=null &&
              this.afterSubmitFailed.equals(other.getAfterSubmitFailed()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getAfterSubmitFailed() != null) {
            _hashCode += getAfterSubmitFailed().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "StatusDetail"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:types.faults_2019_1.platform.webservices.netsuite.com", "StatusDetailType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.faults_2019_1.platform.webservices.netsuite.com", "StatusDetailCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afterSubmitFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "afterSubmitFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
