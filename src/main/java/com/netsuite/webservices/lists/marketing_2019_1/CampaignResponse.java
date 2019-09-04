/**
 * CampaignResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.marketing_2019_1;

public class CampaignResponse  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef campaignEvent;

    private java.util.Calendar campaignResponseDate;

    private java.lang.String channel;

    private com.netsuite.webservices.lists.marketing_2019_1.types.CampaignResponseResponse response;

    private java.lang.String note;

    private com.netsuite.webservices.lists.marketing_2019_1.CampaignResponseResponsesList responsesList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CampaignResponse() {
    }

    public CampaignResponse(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource,
           com.netsuite.webservices.platform.core_2019_1.RecordRef campaignEvent,
           java.util.Calendar campaignResponseDate,
           java.lang.String channel,
           com.netsuite.webservices.lists.marketing_2019_1.types.CampaignResponseResponse response,
           java.lang.String note,
           com.netsuite.webservices.lists.marketing_2019_1.CampaignResponseResponsesList responsesList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.entity = entity;
        this.leadSource = leadSource;
        this.campaignEvent = campaignEvent;
        this.campaignResponseDate = campaignResponseDate;
        this.channel = channel;
        this.response = response;
        this.note = note;
        this.responsesList = responsesList;
    }


    /**
     * Gets the entity value for this CampaignResponse.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this CampaignResponse.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the leadSource value for this CampaignResponse.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this CampaignResponse.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the campaignEvent value for this CampaignResponse.
     * 
     * @return campaignEvent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCampaignEvent() {
        return campaignEvent;
    }


    /**
     * Sets the campaignEvent value for this CampaignResponse.
     * 
     * @param campaignEvent
     */
    public void setCampaignEvent(com.netsuite.webservices.platform.core_2019_1.RecordRef campaignEvent) {
        this.campaignEvent = campaignEvent;
    }


    /**
     * Gets the campaignResponseDate value for this CampaignResponse.
     * 
     * @return campaignResponseDate
     */
    public java.util.Calendar getCampaignResponseDate() {
        return campaignResponseDate;
    }


    /**
     * Sets the campaignResponseDate value for this CampaignResponse.
     * 
     * @param campaignResponseDate
     */
    public void setCampaignResponseDate(java.util.Calendar campaignResponseDate) {
        this.campaignResponseDate = campaignResponseDate;
    }


    /**
     * Gets the channel value for this CampaignResponse.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this CampaignResponse.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the response value for this CampaignResponse.
     * 
     * @return response
     */
    public com.netsuite.webservices.lists.marketing_2019_1.types.CampaignResponseResponse getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CampaignResponse.
     * 
     * @param response
     */
    public void setResponse(com.netsuite.webservices.lists.marketing_2019_1.types.CampaignResponseResponse response) {
        this.response = response;
    }


    /**
     * Gets the note value for this CampaignResponse.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this CampaignResponse.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the responsesList value for this CampaignResponse.
     * 
     * @return responsesList
     */
    public com.netsuite.webservices.lists.marketing_2019_1.CampaignResponseResponsesList getResponsesList() {
        return responsesList;
    }


    /**
     * Sets the responsesList value for this CampaignResponse.
     * 
     * @param responsesList
     */
    public void setResponsesList(com.netsuite.webservices.lists.marketing_2019_1.CampaignResponseResponsesList responsesList) {
        this.responsesList = responsesList;
    }


    /**
     * Gets the internalId value for this CampaignResponse.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CampaignResponse.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CampaignResponse.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CampaignResponse.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignResponse)) return false;
        CampaignResponse other = (CampaignResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.campaignEvent==null && other.getCampaignEvent()==null) || 
             (this.campaignEvent!=null &&
              this.campaignEvent.equals(other.getCampaignEvent()))) &&
            ((this.campaignResponseDate==null && other.getCampaignResponseDate()==null) || 
             (this.campaignResponseDate!=null &&
              this.campaignResponseDate.equals(other.getCampaignResponseDate()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.responsesList==null && other.getResponsesList()==null) || 
             (this.responsesList!=null &&
              this.responsesList.equals(other.getResponsesList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getCampaignEvent() != null) {
            _hashCode += getCampaignEvent().hashCode();
        }
        if (getCampaignResponseDate() != null) {
            _hashCode += getCampaignResponseDate().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getResponsesList() != null) {
            _hashCode += getResponsesList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "CampaignResponse"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "campaignEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignResponseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "campaignResponseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.marketing_2019_1.lists.webservices.netsuite.com", "CampaignResponseResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "responsesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "CampaignResponseResponsesList"));
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
