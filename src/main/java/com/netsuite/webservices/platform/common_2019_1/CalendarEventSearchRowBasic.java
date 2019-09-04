/**
 * CalendarEventSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class CalendarEventSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] accessLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] attendee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] company;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] completedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] endTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] instanceEnd;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] instanceStart;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] markdone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] organizer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recurrence;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resource;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] response;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] startTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] transaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public CalendarEventSearchRowBasic() {
    }

    public CalendarEventSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] accessLevel,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] attendee,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] company,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] completedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] contact,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] endTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] instanceEnd,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] instanceStart,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] markdone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] organizer,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recurrence,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resource,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] response,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] startTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] transaction,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.accessLevel = accessLevel;
        this.attendee = attendee;
        this.company = company;
        this.completedDate = completedDate;
        this.contact = contact;
        this.createdDate = createdDate;
        this.endTime = endTime;
        this.externalId = externalId;
        this.instanceEnd = instanceEnd;
        this.instanceStart = instanceStart;
        this.internalId = internalId;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.markdone = markdone;
        this.message = message;
        this.organizer = organizer;
        this.owner = owner;
        this.recurrence = recurrence;
        this.resource = resource;
        this.response = response;
        this.startDate = startDate;
        this.startTime = startTime;
        this.status = status;
        this.title = title;
        this.transaction = transaction;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accessLevel value for this CalendarEventSearchRowBasic.
     * 
     * @return accessLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this CalendarEventSearchRowBasic.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] accessLevel) {
        this.accessLevel = accessLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getAccessLevel(int i) {
        return this.accessLevel[i];
    }

    public void setAccessLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.accessLevel[i] = _value;
    }


    /**
     * Gets the attendee value for this CalendarEventSearchRowBasic.
     * 
     * @return attendee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAttendee() {
        return attendee;
    }


    /**
     * Sets the attendee value for this CalendarEventSearchRowBasic.
     * 
     * @param attendee
     */
    public void setAttendee(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] attendee) {
        this.attendee = attendee;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAttendee(int i) {
        return this.attendee[i];
    }

    public void setAttendee(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.attendee[i] = _value;
    }


    /**
     * Gets the company value for this CalendarEventSearchRowBasic.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCompany() {
        return company;
    }


    /**
     * Sets the company value for this CalendarEventSearchRowBasic.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] company) {
        this.company = company;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCompany(int i) {
        return this.company[i];
    }

    public void setCompany(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.company[i] = _value;
    }


    /**
     * Gets the completedDate value for this CalendarEventSearchRowBasic.
     * 
     * @return completedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this CalendarEventSearchRowBasic.
     * 
     * @param completedDate
     */
    public void setCompletedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] completedDate) {
        this.completedDate = completedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCompletedDate(int i) {
        return this.completedDate[i];
    }

    public void setCompletedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.completedDate[i] = _value;
    }


    /**
     * Gets the contact value for this CalendarEventSearchRowBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this CalendarEventSearchRowBasic.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] contact) {
        this.contact = contact;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getContact(int i) {
        return this.contact[i];
    }

    public void setContact(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.contact[i] = _value;
    }


    /**
     * Gets the createdDate value for this CalendarEventSearchRowBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CalendarEventSearchRowBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }


    /**
     * Gets the endTime value for this CalendarEventSearchRowBasic.
     * 
     * @return endTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this CalendarEventSearchRowBasic.
     * 
     * @param endTime
     */
    public void setEndTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] endTime) {
        this.endTime = endTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEndTime(int i) {
        return this.endTime[i];
    }

    public void setEndTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.endTime[i] = _value;
    }


    /**
     * Gets the externalId value for this CalendarEventSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CalendarEventSearchRowBasic.
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
     * Gets the instanceEnd value for this CalendarEventSearchRowBasic.
     * 
     * @return instanceEnd
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getInstanceEnd() {
        return instanceEnd;
    }


    /**
     * Sets the instanceEnd value for this CalendarEventSearchRowBasic.
     * 
     * @param instanceEnd
     */
    public void setInstanceEnd(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] instanceEnd) {
        this.instanceEnd = instanceEnd;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getInstanceEnd(int i) {
        return this.instanceEnd[i];
    }

    public void setInstanceEnd(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.instanceEnd[i] = _value;
    }


    /**
     * Gets the instanceStart value for this CalendarEventSearchRowBasic.
     * 
     * @return instanceStart
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getInstanceStart() {
        return instanceStart;
    }


    /**
     * Sets the instanceStart value for this CalendarEventSearchRowBasic.
     * 
     * @param instanceStart
     */
    public void setInstanceStart(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] instanceStart) {
        this.instanceStart = instanceStart;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getInstanceStart(int i) {
        return this.instanceStart[i];
    }

    public void setInstanceStart(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.instanceStart[i] = _value;
    }


    /**
     * Gets the internalId value for this CalendarEventSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CalendarEventSearchRowBasic.
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
     * Gets the lastModifiedDate value for this CalendarEventSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CalendarEventSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the location value for this CalendarEventSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CalendarEventSearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] location) {
        this.location = location;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the markdone value for this CalendarEventSearchRowBasic.
     * 
     * @return markdone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMarkdone() {
        return markdone;
    }


    /**
     * Sets the markdone value for this CalendarEventSearchRowBasic.
     * 
     * @param markdone
     */
    public void setMarkdone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] markdone) {
        this.markdone = markdone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMarkdone(int i) {
        return this.markdone[i];
    }

    public void setMarkdone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.markdone[i] = _value;
    }


    /**
     * Gets the message value for this CalendarEventSearchRowBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CalendarEventSearchRowBasic.
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
     * Gets the organizer value for this CalendarEventSearchRowBasic.
     * 
     * @return organizer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOrganizer() {
        return organizer;
    }


    /**
     * Sets the organizer value for this CalendarEventSearchRowBasic.
     * 
     * @param organizer
     */
    public void setOrganizer(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] organizer) {
        this.organizer = organizer;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOrganizer(int i) {
        return this.organizer[i];
    }

    public void setOrganizer(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.organizer[i] = _value;
    }


    /**
     * Gets the owner value for this CalendarEventSearchRowBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CalendarEventSearchRowBasic.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }


    /**
     * Gets the recurrence value for this CalendarEventSearchRowBasic.
     * 
     * @return recurrence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRecurrence() {
        return recurrence;
    }


    /**
     * Sets the recurrence value for this CalendarEventSearchRowBasic.
     * 
     * @param recurrence
     */
    public void setRecurrence(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recurrence) {
        this.recurrence = recurrence;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRecurrence(int i) {
        return this.recurrence[i];
    }

    public void setRecurrence(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.recurrence[i] = _value;
    }


    /**
     * Gets the resource value for this CalendarEventSearchRowBasic.
     * 
     * @return resource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this CalendarEventSearchRowBasic.
     * 
     * @param resource
     */
    public void setResource(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resource) {
        this.resource = resource;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getResource(int i) {
        return this.resource[i];
    }

    public void setResource(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.resource[i] = _value;
    }


    /**
     * Gets the response value for this CalendarEventSearchRowBasic.
     * 
     * @return response
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CalendarEventSearchRowBasic.
     * 
     * @param response
     */
    public void setResponse(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] response) {
        this.response = response;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getResponse(int i) {
        return this.response[i];
    }

    public void setResponse(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.response[i] = _value;
    }


    /**
     * Gets the startDate value for this CalendarEventSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CalendarEventSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] startDate) {
        this.startDate = startDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the startTime value for this CalendarEventSearchRowBasic.
     * 
     * @return startTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this CalendarEventSearchRowBasic.
     * 
     * @param startTime
     */
    public void setStartTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] startTime) {
        this.startTime = startTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getStartTime(int i) {
        return this.startTime[i];
    }

    public void setStartTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.startTime[i] = _value;
    }


    /**
     * Gets the status value for this CalendarEventSearchRowBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CalendarEventSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status) {
        this.status = status;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the title value for this CalendarEventSearchRowBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CalendarEventSearchRowBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title) {
        this.title = title;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.title[i] = _value;
    }


    /**
     * Gets the transaction value for this CalendarEventSearchRowBasic.
     * 
     * @return transaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this CalendarEventSearchRowBasic.
     * 
     * @param transaction
     */
    public void setTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] transaction) {
        this.transaction = transaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTransaction(int i) {
        return this.transaction[i];
    }

    public void setTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.transaction[i] = _value;
    }


    /**
     * Gets the customFieldList value for this CalendarEventSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CalendarEventSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalendarEventSearchRowBasic)) return false;
        CalendarEventSearchRowBasic other = (CalendarEventSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              java.util.Arrays.equals(this.accessLevel, other.getAccessLevel()))) &&
            ((this.attendee==null && other.getAttendee()==null) || 
             (this.attendee!=null &&
              java.util.Arrays.equals(this.attendee, other.getAttendee()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              java.util.Arrays.equals(this.company, other.getCompany()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              java.util.Arrays.equals(this.completedDate, other.getCompletedDate()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              java.util.Arrays.equals(this.endTime, other.getEndTime()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.instanceEnd==null && other.getInstanceEnd()==null) || 
             (this.instanceEnd!=null &&
              java.util.Arrays.equals(this.instanceEnd, other.getInstanceEnd()))) &&
            ((this.instanceStart==null && other.getInstanceStart()==null) || 
             (this.instanceStart!=null &&
              java.util.Arrays.equals(this.instanceStart, other.getInstanceStart()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.markdone==null && other.getMarkdone()==null) || 
             (this.markdone!=null &&
              java.util.Arrays.equals(this.markdone, other.getMarkdone()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.organizer==null && other.getOrganizer()==null) || 
             (this.organizer!=null &&
              java.util.Arrays.equals(this.organizer, other.getOrganizer()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.recurrence==null && other.getRecurrence()==null) || 
             (this.recurrence!=null &&
              java.util.Arrays.equals(this.recurrence, other.getRecurrence()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              java.util.Arrays.equals(this.resource, other.getResource()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              java.util.Arrays.equals(this.response, other.getResponse()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              java.util.Arrays.equals(this.startTime, other.getStartTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              java.util.Arrays.equals(this.transaction, other.getTransaction()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
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
        if (getAccessLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttendee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttendee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttendee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompany() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompany());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompany(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompletedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompletedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompletedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndTime(), i);
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
        if (getInstanceEnd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstanceEnd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstanceEnd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInstanceStart() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstanceStart());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstanceStart(), i);
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
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarkdone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarkdone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarkdone(), i);
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
        if (getOrganizer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrganizer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrganizer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurrence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurrence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurrence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalendarEventSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "attendee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "completedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endTime"));
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
        elemField.setFieldName("instanceEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "instanceEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "instanceStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markdone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "markdone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("organizer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "organizer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
