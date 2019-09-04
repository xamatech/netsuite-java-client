/**
 * MessageSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class MessageSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] author;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] authorEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] bcc;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] cc;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasAttachment;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] internalOnly;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isEmailed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isIncoming;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] messageDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] messageType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] recipient;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recipientEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subject;

    public MessageSearchRowBasic() {
    }

    public MessageSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] author,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] authorEmail,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] bcc,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] cc,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasAttachment,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] internalOnly,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isEmailed,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isIncoming,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] messageDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] messageType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] recipient,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recipientEmail,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subject) {
        this.author = author;
        this.authorEmail = authorEmail;
        this.bcc = bcc;
        this.cc = cc;
        this.externalId = externalId;
        this.hasAttachment = hasAttachment;
        this.internalId = internalId;
        this.internalOnly = internalOnly;
        this.isEmailed = isEmailed;
        this.isIncoming = isIncoming;
        this.message = message;
        this.messageDate = messageDate;
        this.messageType = messageType;
        this.recipient = recipient;
        this.recipientEmail = recipientEmail;
        this.subject = subject;
    }


    /**
     * Gets the author value for this MessageSearchRowBasic.
     * 
     * @return author
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this MessageSearchRowBasic.
     * 
     * @param author
     */
    public void setAuthor(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] author) {
        this.author = author;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAuthor(int i) {
        return this.author[i];
    }

    public void setAuthor(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.author[i] = _value;
    }


    /**
     * Gets the authorEmail value for this MessageSearchRowBasic.
     * 
     * @return authorEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAuthorEmail() {
        return authorEmail;
    }


    /**
     * Sets the authorEmail value for this MessageSearchRowBasic.
     * 
     * @param authorEmail
     */
    public void setAuthorEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] authorEmail) {
        this.authorEmail = authorEmail;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAuthorEmail(int i) {
        return this.authorEmail[i];
    }

    public void setAuthorEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.authorEmail[i] = _value;
    }


    /**
     * Gets the bcc value for this MessageSearchRowBasic.
     * 
     * @return bcc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBcc() {
        return bcc;
    }


    /**
     * Sets the bcc value for this MessageSearchRowBasic.
     * 
     * @param bcc
     */
    public void setBcc(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] bcc) {
        this.bcc = bcc;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBcc(int i) {
        return this.bcc[i];
    }

    public void setBcc(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.bcc[i] = _value;
    }


    /**
     * Gets the cc value for this MessageSearchRowBasic.
     * 
     * @return cc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCc() {
        return cc;
    }


    /**
     * Sets the cc value for this MessageSearchRowBasic.
     * 
     * @param cc
     */
    public void setCc(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] cc) {
        this.cc = cc;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCc(int i) {
        return this.cc[i];
    }

    public void setCc(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.cc[i] = _value;
    }


    /**
     * Gets the externalId value for this MessageSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this MessageSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the hasAttachment value for this MessageSearchRowBasic.
     * 
     * @return hasAttachment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getHasAttachment() {
        return hasAttachment;
    }


    /**
     * Sets the hasAttachment value for this MessageSearchRowBasic.
     * 
     * @param hasAttachment
     */
    public void setHasAttachment(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getHasAttachment(int i) {
        return this.hasAttachment[i];
    }

    public void setHasAttachment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.hasAttachment[i] = _value;
    }


    /**
     * Gets the internalId value for this MessageSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this MessageSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the internalOnly value for this MessageSearchRowBasic.
     * 
     * @return internalOnly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getInternalOnly() {
        return internalOnly;
    }


    /**
     * Sets the internalOnly value for this MessageSearchRowBasic.
     * 
     * @param internalOnly
     */
    public void setInternalOnly(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] internalOnly) {
        this.internalOnly = internalOnly;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getInternalOnly(int i) {
        return this.internalOnly[i];
    }

    public void setInternalOnly(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.internalOnly[i] = _value;
    }


    /**
     * Gets the isEmailed value for this MessageSearchRowBasic.
     * 
     * @return isEmailed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsEmailed() {
        return isEmailed;
    }


    /**
     * Sets the isEmailed value for this MessageSearchRowBasic.
     * 
     * @param isEmailed
     */
    public void setIsEmailed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isEmailed) {
        this.isEmailed = isEmailed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsEmailed(int i) {
        return this.isEmailed[i];
    }

    public void setIsEmailed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isEmailed[i] = _value;
    }


    /**
     * Gets the isIncoming value for this MessageSearchRowBasic.
     * 
     * @return isIncoming
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsIncoming() {
        return isIncoming;
    }


    /**
     * Sets the isIncoming value for this MessageSearchRowBasic.
     * 
     * @param isIncoming
     */
    public void setIsIncoming(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isIncoming) {
        this.isIncoming = isIncoming;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsIncoming(int i) {
        return this.isIncoming[i];
    }

    public void setIsIncoming(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isIncoming[i] = _value;
    }


    /**
     * Gets the message value for this MessageSearchRowBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this MessageSearchRowBasic.
     * 
     * @param message
     */
    public void setMessage(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message) {
        this.message = message;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.message[i] = _value;
    }


    /**
     * Gets the messageDate value for this MessageSearchRowBasic.
     * 
     * @return messageDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getMessageDate() {
        return messageDate;
    }


    /**
     * Sets the messageDate value for this MessageSearchRowBasic.
     * 
     * @param messageDate
     */
    public void setMessageDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] messageDate) {
        this.messageDate = messageDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getMessageDate(int i) {
        return this.messageDate[i];
    }

    public void setMessageDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.messageDate[i] = _value;
    }


    /**
     * Gets the messageType value for this MessageSearchRowBasic.
     * 
     * @return messageType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this MessageSearchRowBasic.
     * 
     * @param messageType
     */
    public void setMessageType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] messageType) {
        this.messageType = messageType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getMessageType(int i) {
        return this.messageType[i];
    }

    public void setMessageType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.messageType[i] = _value;
    }


    /**
     * Gets the recipient value for this MessageSearchRowBasic.
     * 
     * @return recipient
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this MessageSearchRowBasic.
     * 
     * @param recipient
     */
    public void setRecipient(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] recipient) {
        this.recipient = recipient;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRecipient(int i) {
        return this.recipient[i];
    }

    public void setRecipient(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.recipient[i] = _value;
    }


    /**
     * Gets the recipientEmail value for this MessageSearchRowBasic.
     * 
     * @return recipientEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRecipientEmail() {
        return recipientEmail;
    }


    /**
     * Sets the recipientEmail value for this MessageSearchRowBasic.
     * 
     * @param recipientEmail
     */
    public void setRecipientEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRecipientEmail(int i) {
        return this.recipientEmail[i];
    }

    public void setRecipientEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.recipientEmail[i] = _value;
    }


    /**
     * Gets the subject value for this MessageSearchRowBasic.
     * 
     * @return subject
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this MessageSearchRowBasic.
     * 
     * @param subject
     */
    public void setSubject(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subject) {
        this.subject = subject;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSubject(int i) {
        return this.subject[i];
    }

    public void setSubject(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.subject[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageSearchRowBasic)) return false;
        MessageSearchRowBasic other = (MessageSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.author, other.getAuthor()))) &&
            ((this.authorEmail==null && other.getAuthorEmail()==null) || 
             (this.authorEmail!=null &&
              java.util.Arrays.equals(this.authorEmail, other.getAuthorEmail()))) &&
            ((this.bcc==null && other.getBcc()==null) || 
             (this.bcc!=null &&
              java.util.Arrays.equals(this.bcc, other.getBcc()))) &&
            ((this.cc==null && other.getCc()==null) || 
             (this.cc!=null &&
              java.util.Arrays.equals(this.cc, other.getCc()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.hasAttachment==null && other.getHasAttachment()==null) || 
             (this.hasAttachment!=null &&
              java.util.Arrays.equals(this.hasAttachment, other.getHasAttachment()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalOnly==null && other.getInternalOnly()==null) || 
             (this.internalOnly!=null &&
              java.util.Arrays.equals(this.internalOnly, other.getInternalOnly()))) &&
            ((this.isEmailed==null && other.getIsEmailed()==null) || 
             (this.isEmailed!=null &&
              java.util.Arrays.equals(this.isEmailed, other.getIsEmailed()))) &&
            ((this.isIncoming==null && other.getIsIncoming()==null) || 
             (this.isIncoming!=null &&
              java.util.Arrays.equals(this.isIncoming, other.getIsIncoming()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.messageDate==null && other.getMessageDate()==null) || 
             (this.messageDate!=null &&
              java.util.Arrays.equals(this.messageDate, other.getMessageDate()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              java.util.Arrays.equals(this.messageType, other.getMessageType()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              java.util.Arrays.equals(this.recipient, other.getRecipient()))) &&
            ((this.recipientEmail==null && other.getRecipientEmail()==null) || 
             (this.recipientEmail!=null &&
              java.util.Arrays.equals(this.recipientEmail, other.getRecipientEmail()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              java.util.Arrays.equals(this.subject, other.getSubject())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBcc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBcc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBcc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHasAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHasAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHasAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalOnly() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalOnly());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalOnly(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsEmailed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsEmailed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsEmailed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsIncoming() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsIncoming());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsIncoming(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessageDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessageDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessageDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessageType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessageType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessageType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipient() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipient());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipient(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipientEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubject(), i);
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
        new org.apache.axis.description.TypeDesc(MessageSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "authorEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bcc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hasAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIncoming");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isIncoming"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "messageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
