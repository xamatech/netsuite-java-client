/**
 * CampaignEventResponseList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.marketing_2024_2;

public class CampaignEventResponseList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.marketing_2024_2.CampaignEventResponse[] eventResponse;

    private boolean replaceAll;  // attribute

    public CampaignEventResponseList() {
    }

    public CampaignEventResponseList(
           com.netsuite.webservices.lists.marketing_2024_2.CampaignEventResponse[] eventResponse,
           boolean replaceAll) {
           this.eventResponse = eventResponse;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the eventResponse value for this CampaignEventResponseList.
     * 
     * @return eventResponse
     */
    public com.netsuite.webservices.lists.marketing_2024_2.CampaignEventResponse[] getEventResponse() {
        return eventResponse;
    }


    /**
     * Sets the eventResponse value for this CampaignEventResponseList.
     * 
     * @param eventResponse
     */
    public void setEventResponse(com.netsuite.webservices.lists.marketing_2024_2.CampaignEventResponse[] eventResponse) {
        this.eventResponse = eventResponse;
    }

    public com.netsuite.webservices.lists.marketing_2024_2.CampaignEventResponse getEventResponse(int i) {
        return this.eventResponse[i];
    }

    public void setEventResponse(int i, com.netsuite.webservices.lists.marketing_2024_2.CampaignEventResponse _value) {
        this.eventResponse[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CampaignEventResponseList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CampaignEventResponseList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignEventResponseList)) return false;
        CampaignEventResponseList other = (CampaignEventResponseList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventResponse==null && other.getEventResponse()==null) || 
             (this.eventResponse!=null &&
              java.util.Arrays.equals(this.eventResponse, other.getEventResponse()))) &&
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
        if (getEventResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventResponse(), i);
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
        new org.apache.axis.description.TypeDesc(CampaignEventResponseList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2024_2.lists.webservices.netsuite.com", "CampaignEventResponseList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2024_2.lists.webservices.netsuite.com", "eventResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2024_2.lists.webservices.netsuite.com", "CampaignEventResponse"));
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
