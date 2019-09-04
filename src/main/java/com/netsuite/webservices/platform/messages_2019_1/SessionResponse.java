/**
 * SessionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.messages_2019_1;

public class SessionResponse  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.Status status;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef userId;

    private com.netsuite.webservices.platform.core_2019_1.WsRoleList wsRoleList;

    public SessionResponse() {
    }

    public SessionResponse(
           com.netsuite.webservices.platform.core_2019_1.Status status,
           com.netsuite.webservices.platform.core_2019_1.RecordRef userId,
           com.netsuite.webservices.platform.core_2019_1.WsRoleList wsRoleList) {
           this.status = status;
           this.userId = userId;
           this.wsRoleList = wsRoleList;
    }


    /**
     * Gets the status value for this SessionResponse.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SessionResponse.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.Status status) {
        this.status = status;
    }


    /**
     * Gets the userId value for this SessionResponse.
     * 
     * @return userId
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SessionResponse.
     * 
     * @param userId
     */
    public void setUserId(com.netsuite.webservices.platform.core_2019_1.RecordRef userId) {
        this.userId = userId;
    }


    /**
     * Gets the wsRoleList value for this SessionResponse.
     * 
     * @return wsRoleList
     */
    public com.netsuite.webservices.platform.core_2019_1.WsRoleList getWsRoleList() {
        return wsRoleList;
    }


    /**
     * Sets the wsRoleList value for this SessionResponse.
     * 
     * @param wsRoleList
     */
    public void setWsRoleList(com.netsuite.webservices.platform.core_2019_1.WsRoleList wsRoleList) {
        this.wsRoleList = wsRoleList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionResponse)) return false;
        SessionResponse other = (SessionResponse) obj;
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
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.wsRoleList==null && other.getWsRoleList()==null) || 
             (this.wsRoleList!=null &&
              this.wsRoleList.equals(other.getWsRoleList())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getWsRoleList() != null) {
            _hashCode += getWsRoleList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "SessionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsRoleList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "wsRoleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "WsRoleList"));
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
