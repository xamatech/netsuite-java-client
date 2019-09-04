/**
 * UpdateInviteeStatusReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class UpdateInviteeStatusReference  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef eventId;

    private com.netsuite.webservices.platform.core_2019_1.types.CalendarEventAttendeeResponse responseCode;

    public UpdateInviteeStatusReference() {
    }

    public UpdateInviteeStatusReference(
           com.netsuite.webservices.platform.core_2019_1.RecordRef eventId,
           com.netsuite.webservices.platform.core_2019_1.types.CalendarEventAttendeeResponse responseCode) {
           this.eventId = eventId;
           this.responseCode = responseCode;
    }


    /**
     * Gets the eventId value for this UpdateInviteeStatusReference.
     * 
     * @return eventId
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this UpdateInviteeStatusReference.
     * 
     * @param eventId
     */
    public void setEventId(com.netsuite.webservices.platform.core_2019_1.RecordRef eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the responseCode value for this UpdateInviteeStatusReference.
     * 
     * @return responseCode
     */
    public com.netsuite.webservices.platform.core_2019_1.types.CalendarEventAttendeeResponse getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this UpdateInviteeStatusReference.
     * 
     * @param responseCode
     */
    public void setResponseCode(com.netsuite.webservices.platform.core_2019_1.types.CalendarEventAttendeeResponse responseCode) {
        this.responseCode = responseCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateInviteeStatusReference)) return false;
        UpdateInviteeStatusReference other = (UpdateInviteeStatusReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode())));
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
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateInviteeStatusReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "UpdateInviteeStatusReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2019_1.platform.webservices.netsuite.com", "CalendarEventAttendeeResponse"));
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
