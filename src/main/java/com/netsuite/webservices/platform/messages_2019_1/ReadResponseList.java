/**
 * ReadResponseList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.messages_2019_1;

public class ReadResponseList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.Status status;

    private com.netsuite.webservices.platform.messages_2019_1.ReadResponse[] readResponse;

    public ReadResponseList() {
    }

    public ReadResponseList(
           com.netsuite.webservices.platform.core_2019_1.Status status,
           com.netsuite.webservices.platform.messages_2019_1.ReadResponse[] readResponse) {
           this.status = status;
           this.readResponse = readResponse;
    }


    /**
     * Gets the status value for this ReadResponseList.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReadResponseList.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.Status status) {
        this.status = status;
    }


    /**
     * Gets the readResponse value for this ReadResponseList.
     * 
     * @return readResponse
     */
    public com.netsuite.webservices.platform.messages_2019_1.ReadResponse[] getReadResponse() {
        return readResponse;
    }


    /**
     * Sets the readResponse value for this ReadResponseList.
     * 
     * @param readResponse
     */
    public void setReadResponse(com.netsuite.webservices.platform.messages_2019_1.ReadResponse[] readResponse) {
        this.readResponse = readResponse;
    }

    public com.netsuite.webservices.platform.messages_2019_1.ReadResponse getReadResponse(int i) {
        return this.readResponse[i];
    }

    public void setReadResponse(int i, com.netsuite.webservices.platform.messages_2019_1.ReadResponse _value) {
        this.readResponse[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadResponseList)) return false;
        ReadResponseList other = (ReadResponseList) obj;
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
            ((this.readResponse==null && other.getReadResponse()==null) || 
             (this.readResponse!=null &&
              java.util.Arrays.equals(this.readResponse, other.getReadResponse())));
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
        if (getReadResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadResponseList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "ReadResponseList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "readResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "ReadResponse"));
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
