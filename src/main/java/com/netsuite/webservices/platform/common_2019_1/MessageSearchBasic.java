/**
 * MessageSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class MessageSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField author;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField authorEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField bcc;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField cc;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasAttachment;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField internalOnly;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField message;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField messageDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField messageType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField recipient;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField recipientEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField subject;

    public MessageSearchBasic() {
    }

    public MessageSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField author,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField authorEmail,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField bcc,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField cc,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasAttachment,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField internalOnly,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField message,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField messageDate,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField messageType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField recipient,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField recipientEmail,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField subject) {
        this.author = author;
        this.authorEmail = authorEmail;
        this.bcc = bcc;
        this.cc = cc;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.hasAttachment = hasAttachment;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.internalOnly = internalOnly;
        this.message = message;
        this.messageDate = messageDate;
        this.messageType = messageType;
        this.recipient = recipient;
        this.recipientEmail = recipientEmail;
        this.subject = subject;
    }


    /**
     * Gets the author value for this MessageSearchBasic.
     * 
     * @return author
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this MessageSearchBasic.
     * 
     * @param author
     */
    public void setAuthor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField author) {
        this.author = author;
    }


    /**
     * Gets the authorEmail value for this MessageSearchBasic.
     * 
     * @return authorEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAuthorEmail() {
        return authorEmail;
    }


    /**
     * Sets the authorEmail value for this MessageSearchBasic.
     * 
     * @param authorEmail
     */
    public void setAuthorEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField authorEmail) {
        this.authorEmail = authorEmail;
    }


    /**
     * Gets the bcc value for this MessageSearchBasic.
     * 
     * @return bcc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBcc() {
        return bcc;
    }


    /**
     * Sets the bcc value for this MessageSearchBasic.
     * 
     * @param bcc
     */
    public void setBcc(com.netsuite.webservices.platform.core_2019_1.SearchStringField bcc) {
        this.bcc = bcc;
    }


    /**
     * Gets the cc value for this MessageSearchBasic.
     * 
     * @return cc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCc() {
        return cc;
    }


    /**
     * Sets the cc value for this MessageSearchBasic.
     * 
     * @param cc
     */
    public void setCc(com.netsuite.webservices.platform.core_2019_1.SearchStringField cc) {
        this.cc = cc;
    }


    /**
     * Gets the externalId value for this MessageSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this MessageSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this MessageSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this MessageSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the hasAttachment value for this MessageSearchBasic.
     * 
     * @return hasAttachment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getHasAttachment() {
        return hasAttachment;
    }


    /**
     * Sets the hasAttachment value for this MessageSearchBasic.
     * 
     * @param hasAttachment
     */
    public void setHasAttachment(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasAttachment) {
        this.hasAttachment = hasAttachment;
    }


    /**
     * Gets the internalId value for this MessageSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this MessageSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this MessageSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this MessageSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the internalOnly value for this MessageSearchBasic.
     * 
     * @return internalOnly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getInternalOnly() {
        return internalOnly;
    }


    /**
     * Sets the internalOnly value for this MessageSearchBasic.
     * 
     * @param internalOnly
     */
    public void setInternalOnly(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField internalOnly) {
        this.internalOnly = internalOnly;
    }


    /**
     * Gets the message value for this MessageSearchBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMessage() {
        return message;
    }


    /**
     * Sets the message value for this MessageSearchBasic.
     * 
     * @param message
     */
    public void setMessage(com.netsuite.webservices.platform.core_2019_1.SearchStringField message) {
        this.message = message;
    }


    /**
     * Gets the messageDate value for this MessageSearchBasic.
     * 
     * @return messageDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getMessageDate() {
        return messageDate;
    }


    /**
     * Sets the messageDate value for this MessageSearchBasic.
     * 
     * @param messageDate
     */
    public void setMessageDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField messageDate) {
        this.messageDate = messageDate;
    }


    /**
     * Gets the messageType value for this MessageSearchBasic.
     * 
     * @return messageType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this MessageSearchBasic.
     * 
     * @param messageType
     */
    public void setMessageType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the recipient value for this MessageSearchBasic.
     * 
     * @return recipient
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this MessageSearchBasic.
     * 
     * @param recipient
     */
    public void setRecipient(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the recipientEmail value for this MessageSearchBasic.
     * 
     * @return recipientEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getRecipientEmail() {
        return recipientEmail;
    }


    /**
     * Sets the recipientEmail value for this MessageSearchBasic.
     * 
     * @param recipientEmail
     */
    public void setRecipientEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField recipientEmail) {
        this.recipientEmail = recipientEmail;
    }


    /**
     * Gets the subject value for this MessageSearchBasic.
     * 
     * @return subject
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this MessageSearchBasic.
     * 
     * @param subject
     */
    public void setSubject(com.netsuite.webservices.platform.core_2019_1.SearchStringField subject) {
        this.subject = subject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageSearchBasic)) return false;
        MessageSearchBasic other = (MessageSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.authorEmail==null && other.getAuthorEmail()==null) || 
             (this.authorEmail!=null &&
              this.authorEmail.equals(other.getAuthorEmail()))) &&
            ((this.bcc==null && other.getBcc()==null) || 
             (this.bcc!=null &&
              this.bcc.equals(other.getBcc()))) &&
            ((this.cc==null && other.getCc()==null) || 
             (this.cc!=null &&
              this.cc.equals(other.getCc()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.hasAttachment==null && other.getHasAttachment()==null) || 
             (this.hasAttachment!=null &&
              this.hasAttachment.equals(other.getHasAttachment()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.internalOnly==null && other.getInternalOnly()==null) || 
             (this.internalOnly!=null &&
              this.internalOnly.equals(other.getInternalOnly()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.messageDate==null && other.getMessageDate()==null) || 
             (this.messageDate!=null &&
              this.messageDate.equals(other.getMessageDate()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.recipientEmail==null && other.getRecipientEmail()==null) || 
             (this.recipientEmail!=null &&
              this.recipientEmail.equals(other.getRecipientEmail()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject())));
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
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getAuthorEmail() != null) {
            _hashCode += getAuthorEmail().hashCode();
        }
        if (getBcc() != null) {
            _hashCode += getBcc().hashCode();
        }
        if (getCc() != null) {
            _hashCode += getCc().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getHasAttachment() != null) {
            _hashCode += getHasAttachment().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getInternalOnly() != null) {
            _hashCode += getInternalOnly().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMessageDate() != null) {
            _hashCode += getMessageDate().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getRecipientEmail() != null) {
            _hashCode += getRecipientEmail().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "authorEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bcc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hasAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "messageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
