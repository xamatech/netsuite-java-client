/**
 * CalendarEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2019_1;

public class CalendarEvent  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef company;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef contact;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef supportCase;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef transaction;

    private java.lang.Long period;

    private com.netsuite.webservices.platform.common_2019_1.types.RecurrenceFrequency frequency;

    private com.netsuite.webservices.platform.common_2019_1.RecurrenceDowMaskList recurrenceDowMaskList;

    private com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow recurrenceDow;

    private com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDowim recurrenceDowim;

    private java.util.Calendar seriesStartDate;

    private java.util.Calendar endByDate;

    private java.lang.Boolean noEndDate;

    private java.lang.Boolean sendEmail;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String title;

    private java.lang.String recurrence;

    private java.lang.String location;

    private java.util.Calendar startDate;

    private java.lang.Boolean allDayEvent;

    private java.lang.Boolean timedEvent;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventReminderType reminderType;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventReminderMinutes reminderMinutes;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventStatus status;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventAccessLevel accessLevel;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef organizer;

    private java.lang.String message;

    private java.util.Calendar createdDate;

    private java.util.Calendar endDate;

    private com.netsuite.webservices.activities.scheduling_2019_1.ExclusionDateList exclusionDateList;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef owner;

    private com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventAttendeeList attendeeList;

    private com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventResourceList resourceList;

    private com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventTimeItemList timeItemList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CalendarEvent() {
    }

    public CalendarEvent(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef company,
           com.netsuite.webservices.platform.core_2019_1.RecordRef contact,
           com.netsuite.webservices.platform.core_2019_1.RecordRef supportCase,
           com.netsuite.webservices.platform.core_2019_1.RecordRef transaction,
           java.lang.Long period,
           com.netsuite.webservices.platform.common_2019_1.types.RecurrenceFrequency frequency,
           com.netsuite.webservices.platform.common_2019_1.RecurrenceDowMaskList recurrenceDowMaskList,
           com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow recurrenceDow,
           com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDowim recurrenceDowim,
           java.util.Calendar seriesStartDate,
           java.util.Calendar endByDate,
           java.lang.Boolean noEndDate,
           java.lang.Boolean sendEmail,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String title,
           java.lang.String recurrence,
           java.lang.String location,
           java.util.Calendar startDate,
           java.lang.Boolean allDayEvent,
           java.lang.Boolean timedEvent,
           com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventReminderType reminderType,
           com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventReminderMinutes reminderMinutes,
           com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventStatus status,
           com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventAccessLevel accessLevel,
           com.netsuite.webservices.platform.core_2019_1.RecordRef organizer,
           java.lang.String message,
           java.util.Calendar createdDate,
           java.util.Calendar endDate,
           com.netsuite.webservices.activities.scheduling_2019_1.ExclusionDateList exclusionDateList,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef owner,
           com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventAttendeeList attendeeList,
           com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventResourceList resourceList,
           com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventTimeItemList timeItemList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.company = company;
        this.contact = contact;
        this.supportCase = supportCase;
        this.transaction = transaction;
        this.period = period;
        this.frequency = frequency;
        this.recurrenceDowMaskList = recurrenceDowMaskList;
        this.recurrenceDow = recurrenceDow;
        this.recurrenceDowim = recurrenceDowim;
        this.seriesStartDate = seriesStartDate;
        this.endByDate = endByDate;
        this.noEndDate = noEndDate;
        this.sendEmail = sendEmail;
        this.customForm = customForm;
        this.title = title;
        this.recurrence = recurrence;
        this.location = location;
        this.startDate = startDate;
        this.allDayEvent = allDayEvent;
        this.timedEvent = timedEvent;
        this.reminderType = reminderType;
        this.reminderMinutes = reminderMinutes;
        this.status = status;
        this.accessLevel = accessLevel;
        this.organizer = organizer;
        this.message = message;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.exclusionDateList = exclusionDateList;
        this.lastModifiedDate = lastModifiedDate;
        this.owner = owner;
        this.attendeeList = attendeeList;
        this.resourceList = resourceList;
        this.timeItemList = timeItemList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the company value for this CalendarEvent.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCompany() {
        return company;
    }


    /**
     * Sets the company value for this CalendarEvent.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.RecordRef company) {
        this.company = company;
    }


    /**
     * Gets the contact value for this CalendarEvent.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this CalendarEvent.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.RecordRef contact) {
        this.contact = contact;
    }


    /**
     * Gets the supportCase value for this CalendarEvent.
     * 
     * @return supportCase
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSupportCase() {
        return supportCase;
    }


    /**
     * Sets the supportCase value for this CalendarEvent.
     * 
     * @param supportCase
     */
    public void setSupportCase(com.netsuite.webservices.platform.core_2019_1.RecordRef supportCase) {
        this.supportCase = supportCase;
    }


    /**
     * Gets the transaction value for this CalendarEvent.
     * 
     * @return transaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this CalendarEvent.
     * 
     * @param transaction
     */
    public void setTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef transaction) {
        this.transaction = transaction;
    }


    /**
     * Gets the period value for this CalendarEvent.
     * 
     * @return period
     */
    public java.lang.Long getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this CalendarEvent.
     * 
     * @param period
     */
    public void setPeriod(java.lang.Long period) {
        this.period = period;
    }


    /**
     * Gets the frequency value for this CalendarEvent.
     * 
     * @return frequency
     */
    public com.netsuite.webservices.platform.common_2019_1.types.RecurrenceFrequency getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this CalendarEvent.
     * 
     * @param frequency
     */
    public void setFrequency(com.netsuite.webservices.platform.common_2019_1.types.RecurrenceFrequency frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the recurrenceDowMaskList value for this CalendarEvent.
     * 
     * @return recurrenceDowMaskList
     */
    public com.netsuite.webservices.platform.common_2019_1.RecurrenceDowMaskList getRecurrenceDowMaskList() {
        return recurrenceDowMaskList;
    }


    /**
     * Sets the recurrenceDowMaskList value for this CalendarEvent.
     * 
     * @param recurrenceDowMaskList
     */
    public void setRecurrenceDowMaskList(com.netsuite.webservices.platform.common_2019_1.RecurrenceDowMaskList recurrenceDowMaskList) {
        this.recurrenceDowMaskList = recurrenceDowMaskList;
    }


    /**
     * Gets the recurrenceDow value for this CalendarEvent.
     * 
     * @return recurrenceDow
     */
    public com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow getRecurrenceDow() {
        return recurrenceDow;
    }


    /**
     * Sets the recurrenceDow value for this CalendarEvent.
     * 
     * @param recurrenceDow
     */
    public void setRecurrenceDow(com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow recurrenceDow) {
        this.recurrenceDow = recurrenceDow;
    }


    /**
     * Gets the recurrenceDowim value for this CalendarEvent.
     * 
     * @return recurrenceDowim
     */
    public com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDowim getRecurrenceDowim() {
        return recurrenceDowim;
    }


    /**
     * Sets the recurrenceDowim value for this CalendarEvent.
     * 
     * @param recurrenceDowim
     */
    public void setRecurrenceDowim(com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDowim recurrenceDowim) {
        this.recurrenceDowim = recurrenceDowim;
    }


    /**
     * Gets the seriesStartDate value for this CalendarEvent.
     * 
     * @return seriesStartDate
     */
    public java.util.Calendar getSeriesStartDate() {
        return seriesStartDate;
    }


    /**
     * Sets the seriesStartDate value for this CalendarEvent.
     * 
     * @param seriesStartDate
     */
    public void setSeriesStartDate(java.util.Calendar seriesStartDate) {
        this.seriesStartDate = seriesStartDate;
    }


    /**
     * Gets the endByDate value for this CalendarEvent.
     * 
     * @return endByDate
     */
    public java.util.Calendar getEndByDate() {
        return endByDate;
    }


    /**
     * Sets the endByDate value for this CalendarEvent.
     * 
     * @param endByDate
     */
    public void setEndByDate(java.util.Calendar endByDate) {
        this.endByDate = endByDate;
    }


    /**
     * Gets the noEndDate value for this CalendarEvent.
     * 
     * @return noEndDate
     */
    public java.lang.Boolean getNoEndDate() {
        return noEndDate;
    }


    /**
     * Sets the noEndDate value for this CalendarEvent.
     * 
     * @param noEndDate
     */
    public void setNoEndDate(java.lang.Boolean noEndDate) {
        this.noEndDate = noEndDate;
    }


    /**
     * Gets the sendEmail value for this CalendarEvent.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this CalendarEvent.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the customForm value for this CalendarEvent.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this CalendarEvent.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the title value for this CalendarEvent.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CalendarEvent.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the recurrence value for this CalendarEvent.
     * 
     * @return recurrence
     */
    public java.lang.String getRecurrence() {
        return recurrence;
    }


    /**
     * Sets the recurrence value for this CalendarEvent.
     * 
     * @param recurrence
     */
    public void setRecurrence(java.lang.String recurrence) {
        this.recurrence = recurrence;
    }


    /**
     * Gets the location value for this CalendarEvent.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CalendarEvent.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the startDate value for this CalendarEvent.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CalendarEvent.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the allDayEvent value for this CalendarEvent.
     * 
     * @return allDayEvent
     */
    public java.lang.Boolean getAllDayEvent() {
        return allDayEvent;
    }


    /**
     * Sets the allDayEvent value for this CalendarEvent.
     * 
     * @param allDayEvent
     */
    public void setAllDayEvent(java.lang.Boolean allDayEvent) {
        this.allDayEvent = allDayEvent;
    }


    /**
     * Gets the timedEvent value for this CalendarEvent.
     * 
     * @return timedEvent
     */
    public java.lang.Boolean getTimedEvent() {
        return timedEvent;
    }


    /**
     * Sets the timedEvent value for this CalendarEvent.
     * 
     * @param timedEvent
     */
    public void setTimedEvent(java.lang.Boolean timedEvent) {
        this.timedEvent = timedEvent;
    }


    /**
     * Gets the reminderType value for this CalendarEvent.
     * 
     * @return reminderType
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventReminderType getReminderType() {
        return reminderType;
    }


    /**
     * Sets the reminderType value for this CalendarEvent.
     * 
     * @param reminderType
     */
    public void setReminderType(com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventReminderType reminderType) {
        this.reminderType = reminderType;
    }


    /**
     * Gets the reminderMinutes value for this CalendarEvent.
     * 
     * @return reminderMinutes
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventReminderMinutes getReminderMinutes() {
        return reminderMinutes;
    }


    /**
     * Sets the reminderMinutes value for this CalendarEvent.
     * 
     * @param reminderMinutes
     */
    public void setReminderMinutes(com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventReminderMinutes reminderMinutes) {
        this.reminderMinutes = reminderMinutes;
    }


    /**
     * Gets the status value for this CalendarEvent.
     * 
     * @return status
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CalendarEvent.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventStatus status) {
        this.status = status;
    }


    /**
     * Gets the accessLevel value for this CalendarEvent.
     * 
     * @return accessLevel
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventAccessLevel getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this CalendarEvent.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(com.netsuite.webservices.activities.scheduling_2019_1.types.CalendarEventAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the organizer value for this CalendarEvent.
     * 
     * @return organizer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOrganizer() {
        return organizer;
    }


    /**
     * Sets the organizer value for this CalendarEvent.
     * 
     * @param organizer
     */
    public void setOrganizer(com.netsuite.webservices.platform.core_2019_1.RecordRef organizer) {
        this.organizer = organizer;
    }


    /**
     * Gets the message value for this CalendarEvent.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CalendarEvent.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the createdDate value for this CalendarEvent.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CalendarEvent.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the endDate value for this CalendarEvent.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CalendarEvent.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the exclusionDateList value for this CalendarEvent.
     * 
     * @return exclusionDateList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.ExclusionDateList getExclusionDateList() {
        return exclusionDateList;
    }


    /**
     * Sets the exclusionDateList value for this CalendarEvent.
     * 
     * @param exclusionDateList
     */
    public void setExclusionDateList(com.netsuite.webservices.activities.scheduling_2019_1.ExclusionDateList exclusionDateList) {
        this.exclusionDateList = exclusionDateList;
    }


    /**
     * Gets the lastModifiedDate value for this CalendarEvent.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CalendarEvent.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the owner value for this CalendarEvent.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CalendarEvent.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the attendeeList value for this CalendarEvent.
     * 
     * @return attendeeList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventAttendeeList getAttendeeList() {
        return attendeeList;
    }


    /**
     * Sets the attendeeList value for this CalendarEvent.
     * 
     * @param attendeeList
     */
    public void setAttendeeList(com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventAttendeeList attendeeList) {
        this.attendeeList = attendeeList;
    }


    /**
     * Gets the resourceList value for this CalendarEvent.
     * 
     * @return resourceList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventResourceList getResourceList() {
        return resourceList;
    }


    /**
     * Sets the resourceList value for this CalendarEvent.
     * 
     * @param resourceList
     */
    public void setResourceList(com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventResourceList resourceList) {
        this.resourceList = resourceList;
    }


    /**
     * Gets the timeItemList value for this CalendarEvent.
     * 
     * @return timeItemList
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventTimeItemList getTimeItemList() {
        return timeItemList;
    }


    /**
     * Sets the timeItemList value for this CalendarEvent.
     * 
     * @param timeItemList
     */
    public void setTimeItemList(com.netsuite.webservices.activities.scheduling_2019_1.CalendarEventTimeItemList timeItemList) {
        this.timeItemList = timeItemList;
    }


    /**
     * Gets the customFieldList value for this CalendarEvent.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CalendarEvent.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this CalendarEvent.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CalendarEvent.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CalendarEvent.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CalendarEvent.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalendarEvent)) return false;
        CalendarEvent other = (CalendarEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.recurrenceDowMaskList==null && other.getRecurrenceDowMaskList()==null) || 
             (this.recurrenceDowMaskList!=null &&
              this.recurrenceDowMaskList.equals(other.getRecurrenceDowMaskList()))) &&
            ((this.recurrenceDow==null && other.getRecurrenceDow()==null) || 
             (this.recurrenceDow!=null &&
              this.recurrenceDow.equals(other.getRecurrenceDow()))) &&
            ((this.recurrenceDowim==null && other.getRecurrenceDowim()==null) || 
             (this.recurrenceDowim!=null &&
              this.recurrenceDowim.equals(other.getRecurrenceDowim()))) &&
            ((this.seriesStartDate==null && other.getSeriesStartDate()==null) || 
             (this.seriesStartDate!=null &&
              this.seriesStartDate.equals(other.getSeriesStartDate()))) &&
            ((this.endByDate==null && other.getEndByDate()==null) || 
             (this.endByDate!=null &&
              this.endByDate.equals(other.getEndByDate()))) &&
            ((this.noEndDate==null && other.getNoEndDate()==null) || 
             (this.noEndDate!=null &&
              this.noEndDate.equals(other.getNoEndDate()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.recurrence==null && other.getRecurrence()==null) || 
             (this.recurrence!=null &&
              this.recurrence.equals(other.getRecurrence()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.allDayEvent==null && other.getAllDayEvent()==null) || 
             (this.allDayEvent!=null &&
              this.allDayEvent.equals(other.getAllDayEvent()))) &&
            ((this.timedEvent==null && other.getTimedEvent()==null) || 
             (this.timedEvent!=null &&
              this.timedEvent.equals(other.getTimedEvent()))) &&
            ((this.reminderType==null && other.getReminderType()==null) || 
             (this.reminderType!=null &&
              this.reminderType.equals(other.getReminderType()))) &&
            ((this.reminderMinutes==null && other.getReminderMinutes()==null) || 
             (this.reminderMinutes!=null &&
              this.reminderMinutes.equals(other.getReminderMinutes()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel()))) &&
            ((this.organizer==null && other.getOrganizer()==null) || 
             (this.organizer!=null &&
              this.organizer.equals(other.getOrganizer()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.exclusionDateList==null && other.getExclusionDateList()==null) || 
             (this.exclusionDateList!=null &&
              this.exclusionDateList.equals(other.getExclusionDateList()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.attendeeList==null && other.getAttendeeList()==null) || 
             (this.attendeeList!=null &&
              this.attendeeList.equals(other.getAttendeeList()))) &&
            ((this.resourceList==null && other.getResourceList()==null) || 
             (this.resourceList!=null &&
              this.resourceList.equals(other.getResourceList()))) &&
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getRecurrenceDowMaskList() != null) {
            _hashCode += getRecurrenceDowMaskList().hashCode();
        }
        if (getRecurrenceDow() != null) {
            _hashCode += getRecurrenceDow().hashCode();
        }
        if (getRecurrenceDowim() != null) {
            _hashCode += getRecurrenceDowim().hashCode();
        }
        if (getSeriesStartDate() != null) {
            _hashCode += getSeriesStartDate().hashCode();
        }
        if (getEndByDate() != null) {
            _hashCode += getEndByDate().hashCode();
        }
        if (getNoEndDate() != null) {
            _hashCode += getNoEndDate().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getRecurrence() != null) {
            _hashCode += getRecurrence().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getAllDayEvent() != null) {
            _hashCode += getAllDayEvent().hashCode();
        }
        if (getTimedEvent() != null) {
            _hashCode += getTimedEvent().hashCode();
        }
        if (getReminderType() != null) {
            _hashCode += getReminderType().hashCode();
        }
        if (getReminderMinutes() != null) {
            _hashCode += getReminderMinutes().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        if (getOrganizer() != null) {
            _hashCode += getOrganizer().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getExclusionDateList() != null) {
            _hashCode += getExclusionDateList().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getAttendeeList() != null) {
            _hashCode += getAttendeeList().hashCode();
        }
        if (getResourceList() != null) {
            _hashCode += getResourceList().hashCode();
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
        new org.apache.axis.description.TypeDesc(CalendarEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "CalendarEvent"));
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
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "RecurrenceFrequency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDowMaskList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "recurrenceDowMaskList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RecurrenceDowMaskList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "recurrenceDow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "RecurrenceDow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDowim");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "recurrenceDowim"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "RecurrenceDowim"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriesStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "seriesStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "endByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "noEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("recurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "recurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("allDayEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "allDayEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("reminderType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "reminderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "CalendarEventReminderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "reminderMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "CalendarEventReminderMinutes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "CalendarEventStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "CalendarEventAccessLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "organizer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusionDateList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "exclusionDateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ExclusionDateList"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "attendeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "CalendarEventAttendeeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "resourceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "CalendarEventResourceList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "timeItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "CalendarEventTimeItemList"));
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
