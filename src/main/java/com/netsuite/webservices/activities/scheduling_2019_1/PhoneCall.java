/**
 * PhoneCall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2019_1;

public class PhoneCall  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String message;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef company;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef contact;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef supportCase;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef transaction;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef milestone;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String title;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef owner;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef assigned;

    private java.lang.Boolean sendEmail;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.Boolean timedEvent;

    private java.util.Calendar completedDate;

    private java.lang.String phone;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallStatus status;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallPriority priority;

    private java.lang.Boolean accessLevel;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallReminderType reminderType;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallReminderMinutes reminderMinutes;

    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.activities.scheduling_2019_1.PhoneCallContactList contactList;

    private com.netsuite.webservices.activities.scheduling_2019_1.PhoneCallTimeItemList timeItemList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public PhoneCall() {
    }

    public PhoneCall(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String message,
           com.netsuite.webservices.platform.core_2019_1.RecordRef company,
           com.netsuite.webservices.platform.core_2019_1.RecordRef contact,
           com.netsuite.webservices.platform.core_2019_1.RecordRef supportCase,
           com.netsuite.webservices.platform.core_2019_1.RecordRef transaction,
           com.netsuite.webservices.platform.core_2019_1.RecordRef milestone,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String title,
           com.netsuite.webservices.platform.core_2019_1.RecordRef owner,
           com.netsuite.webservices.platform.core_2019_1.RecordRef assigned,
           java.lang.Boolean sendEmail,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.Boolean timedEvent,
           java.util.Calendar completedDate,
           java.lang.String phone,
           com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallStatus status,
           com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallPriority priority,
           java.lang.Boolean accessLevel,
           com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallReminderType reminderType,
           com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallReminderMinutes reminderMinutes,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.activities.scheduling_2019_1.PhoneCallContactList contactList,
           com.netsuite.webservices.activities.scheduling_2019_1.PhoneCallTimeItemList timeItemList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.message = message;
        this.company = company;
        this.contact = contact;
        this.supportCase = supportCase;
        this.transaction = transaction;
        this.milestone = milestone;
        this.customForm = customForm;
        this.title = title;
        this.owner = owner;
        this.assigned = assigned;
        this.sendEmail = sendEmail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.timedEvent = timedEvent;
        this.completedDate = completedDate;
        this.phone = phone;
        this.status = status;
        this.priority = priority;
        this.accessLevel = accessLevel;
        this.reminderType = reminderType;
        this.reminderMinutes = reminderMinutes;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.contactList = contactList;
        this.timeItemList = timeItemList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the message value for this PhoneCall.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this PhoneCall.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the company value for this PhoneCall.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCompany() {
        return company;
    }


    /**
     * Sets the company value for this PhoneCall.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.RecordRef company) {
        this.company = company;
    }


    /**
     * Gets the contact value for this PhoneCall.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this PhoneCall.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.RecordRef contact) {
        this.contact = contact;
    }


    /**
     * Gets the supportCase value for this PhoneCall.
     * 
     * @return supportCase
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSupportCase() {
        return supportCase;
    }


    /**
     * Sets the supportCase value for this PhoneCall.
     * 
     * @param supportCase
     */
    public void setSupportCase(com.netsuite.webservices.platform.core_2019_1.RecordRef supportCase) {
        this.supportCase = supportCase;
    }


    /**
     * Gets the transaction value for this PhoneCall.
     * 
     * @return transaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this PhoneCall.
     * 
     * @param transaction
     */
    public void setTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef transaction) {
        this.transaction = transaction;
    }


    /**
     * Gets the milestone value for this PhoneCall.
     * 
     * @return milestone
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getMilestone() {
        return milestone;
    }


    /**
     * Sets the milestone value for this PhoneCall.
     * 
     * @param milestone
     */
    public void setMilestone(com.netsuite.webservices.platform.core_2019_1.RecordRef milestone) {
        this.milestone = milestone;
    }


    /**
     * Gets the customForm value for this PhoneCall.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this PhoneCall.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the title value for this PhoneCall.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PhoneCall.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the owner value for this PhoneCall.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this PhoneCall.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the assigned value for this PhoneCall.
     * 
     * @return assigned
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this PhoneCall.
     * 
     * @param assigned
     */
    public void setAssigned(com.netsuite.webservices.platform.core_2019_1.RecordRef assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the sendEmail value for this PhoneCall.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this PhoneCall.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the startDate value for this PhoneCall.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PhoneCall.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PhoneCall.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PhoneCall.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the timedEvent value for this PhoneCall.
     * 
     * @return timedEvent
     */
    public java.lang.Boolean getTimedEvent() {
        return timedEvent;
    }


    /**
     * Sets the timedEvent value for this PhoneCall.
     * 
     * @param timedEvent
     */
    public void setTimedEvent(java.lang.Boolean timedEvent) {
        this.timedEvent = timedEvent;
    }


    /**
     * Gets the completedDate value for this PhoneCall.
     * 
     * @return completedDate
     */
    public java.util.Calendar getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this PhoneCall.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the phone value for this PhoneCall.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PhoneCall.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the status value for this PhoneCall.
     * 
     * @return status
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PhoneCall.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallStatus status) {
        this.status = status;
    }


    /**
     * Gets the priority value for this PhoneCall.
     * 
     * @return priority
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallPriority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PhoneCall.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallPriority priority) {
        this.priority = priority;
    }


    /**
     * Gets the accessLevel value for this PhoneCall.
     * 
     * @return accessLevel
     */
    public java.lang.Boolean getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this PhoneCall.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(java.lang.Boolean accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the reminderType value for this PhoneCall.
     * 
     * @return reminderType
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallReminderType getReminderType() {
        return reminderType;
    }


    /**
     * Sets the reminderType value for this PhoneCall.
     * 
     * @param reminderType
     */
    public void setReminderType(com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallReminderType reminderType) {
        this.reminderType = reminderType;
    }


    /**
     * Gets the reminderMinutes value for this PhoneCall.
     * 
     * @return reminderMinutes
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallReminderMinutes getReminderMinutes() {
        return reminderMinutes;
    }


    /**
     * Sets the reminderMinutes value for this PhoneCall.
     * 
     * @param reminderMinutes
     */
    public void setReminderMinutes(com.netsuite.webservices.activities.scheduling_2019_1.types.PhoneCallReminderMinutes reminderMinutes) {
        this.reminderMinutes = reminderMinutes;
    }


    /**
     * Gets the createdDate value for this PhoneCall.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this PhoneCall.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this PhoneCall.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PhoneCall.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the contactList value for this PhoneCall.
     * 
     * @return contactList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.PhoneCallContactList getContactList() {
        return contactList;
    }


    /**
     * Sets the contactList value for this PhoneCall.
     * 
     * @param contactList
     */
    public void setContactList(com.netsuite.webservices.activities.scheduling_2019_1.PhoneCallContactList contactList) {
        this.contactList = contactList;
    }


    /**
     * Gets the timeItemList value for this PhoneCall.
     * 
     * @return timeItemList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.PhoneCallTimeItemList getTimeItemList() {
        return timeItemList;
    }


    /**
     * Sets the timeItemList value for this PhoneCall.
     * 
     * @param timeItemList
     */
    public void setTimeItemList(com.netsuite.webservices.activities.scheduling_2019_1.PhoneCallTimeItemList timeItemList) {
        this.timeItemList = timeItemList;
    }


    /**
     * Gets the customFieldList value for this PhoneCall.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this PhoneCall.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this PhoneCall.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PhoneCall.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this PhoneCall.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PhoneCall.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhoneCall)) return false;
        PhoneCall other = (PhoneCall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.supportCase==null && other.getSupportCase()==null) || 
             (this.supportCase!=null &&
              this.supportCase.equals(other.getSupportCase()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction()))) &&
            ((this.milestone==null && other.getMilestone()==null) || 
             (this.milestone!=null &&
              this.milestone.equals(other.getMilestone()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.timedEvent==null && other.getTimedEvent()==null) || 
             (this.timedEvent!=null &&
              this.timedEvent.equals(other.getTimedEvent()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel()))) &&
            ((this.reminderType==null && other.getReminderType()==null) || 
             (this.reminderType!=null &&
              this.reminderType.equals(other.getReminderType()))) &&
            ((this.reminderMinutes==null && other.getReminderMinutes()==null) || 
             (this.reminderMinutes!=null &&
              this.reminderMinutes.equals(other.getReminderMinutes()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.contactList==null && other.getContactList()==null) || 
             (this.contactList!=null &&
              this.contactList.equals(other.getContactList()))) &&
            ((this.timeItemList==null && other.getTimeItemList()==null) || 
             (this.timeItemList!=null &&
              this.timeItemList.equals(other.getTimeItemList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getSupportCase() != null) {
            _hashCode += getSupportCase().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        if (getMilestone() != null) {
            _hashCode += getMilestone().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getTimedEvent() != null) {
            _hashCode += getTimedEvent().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        if (getReminderType() != null) {
            _hashCode += getReminderType().hashCode();
        }
        if (getReminderMinutes() != null) {
            _hashCode += getReminderMinutes().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getContactList() != null) {
            _hashCode += getContactList().hashCode();
        }
        if (getTimeItemList() != null) {
            _hashCode += getTimeItemList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
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
        new org.apache.axis.description.TypeDesc(PhoneCall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "PhoneCall"));
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
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportCase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "supportCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "milestone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timedEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "timedEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "completedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "PhoneCallStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "PhoneCallPriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "reminderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "PhoneCallReminderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "reminderMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "PhoneCallReminderMinutes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "contactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "PhoneCallContactList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "timeItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "PhoneCallTimeItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
