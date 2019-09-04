/**
 * TimeBillSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TimeBillSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField approved;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billable;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField date;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField duration;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employee;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField exempt;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModified;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidByPayroll;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidExternally;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField productive;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField rejectionNote;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField temporaryLocalJurisdiction;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField temporaryStateJurisdiction;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField timeSheet;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField utilized;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public TimeBillSearchBasic() {
    }

    public TimeBillSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField approvalStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField approved,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billable,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField date,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField duration,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employee,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField exempt,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModified,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField memo,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidByPayroll,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidExternally,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payItem,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField productive,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField rejectionNote,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField status,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField temporaryLocalJurisdiction,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField temporaryStateJurisdiction,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField timeSheet,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField utilized,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.approvalStatus = approvalStatus;
        this.approved = approved;
        this.billable = billable;
        this._class = _class;
        this.customer = customer;
        this.date = date;
        this.dateCreated = dateCreated;
        this.department = department;
        this.duration = duration;
        this.employee = employee;
        this.exempt = exempt;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.lastModified = lastModified;
        this.location = location;
        this.memo = memo;
        this.paidByPayroll = paidByPayroll;
        this.paidExternally = paidExternally;
        this.payItem = payItem;
        this.productive = productive;
        this.rejectionNote = rejectionNote;
        this.status = status;
        this.subsidiary = subsidiary;
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
        this.timeSheet = timeSheet;
        this.type = type;
        this.utilized = utilized;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the approvalStatus value for this TimeBillSearchBasic.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this TimeBillSearchBasic.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the approved value for this TimeBillSearchBasic.
     * 
     * @return approved
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this TimeBillSearchBasic.
     * 
     * @param approved
     */
    public void setApproved(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField approved) {
        this.approved = approved;
    }


    /**
     * Gets the billable value for this TimeBillSearchBasic.
     * 
     * @return billable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this TimeBillSearchBasic.
     * 
     * @param billable
     */
    public void setBillable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billable) {
        this.billable = billable;
    }


    /**
     * Gets the _class value for this TimeBillSearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TimeBillSearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the customer value for this TimeBillSearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TimeBillSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer) {
        this.customer = customer;
    }


    /**
     * Gets the date value for this TimeBillSearchBasic.
     * 
     * @return date
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDate() {
        return date;
    }


    /**
     * Sets the date value for this TimeBillSearchBasic.
     * 
     * @param date
     */
    public void setDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField date) {
        this.date = date;
    }


    /**
     * Gets the dateCreated value for this TimeBillSearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TimeBillSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the department value for this TimeBillSearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TimeBillSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the duration value for this TimeBillSearchBasic.
     * 
     * @return duration
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this TimeBillSearchBasic.
     * 
     * @param duration
     */
    public void setDuration(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField duration) {
        this.duration = duration;
    }


    /**
     * Gets the employee value for this TimeBillSearchBasic.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TimeBillSearchBasic.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employee) {
        this.employee = employee;
    }


    /**
     * Gets the exempt value for this TimeBillSearchBasic.
     * 
     * @return exempt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getExempt() {
        return exempt;
    }


    /**
     * Sets the exempt value for this TimeBillSearchBasic.
     * 
     * @param exempt
     */
    public void setExempt(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField exempt) {
        this.exempt = exempt;
    }


    /**
     * Gets the externalId value for this TimeBillSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TimeBillSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TimeBillSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TimeBillSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this TimeBillSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TimeBillSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TimeBillSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TimeBillSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the item value for this TimeBillSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this TimeBillSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lastModified value for this TimeBillSearchBasic.
     * 
     * @return lastModified
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this TimeBillSearchBasic.
     * 
     * @param lastModified
     */
    public void setLastModified(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the location value for this TimeBillSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TimeBillSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this TimeBillSearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TimeBillSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the paidByPayroll value for this TimeBillSearchBasic.
     * 
     * @return paidByPayroll
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPaidByPayroll() {
        return paidByPayroll;
    }


    /**
     * Sets the paidByPayroll value for this TimeBillSearchBasic.
     * 
     * @param paidByPayroll
     */
    public void setPaidByPayroll(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidByPayroll) {
        this.paidByPayroll = paidByPayroll;
    }


    /**
     * Gets the paidExternally value for this TimeBillSearchBasic.
     * 
     * @return paidExternally
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPaidExternally() {
        return paidExternally;
    }


    /**
     * Sets the paidExternally value for this TimeBillSearchBasic.
     * 
     * @param paidExternally
     */
    public void setPaidExternally(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paidExternally) {
        this.paidExternally = paidExternally;
    }


    /**
     * Gets the payItem value for this TimeBillSearchBasic.
     * 
     * @return payItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this TimeBillSearchBasic.
     * 
     * @param payItem
     */
    public void setPayItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the productive value for this TimeBillSearchBasic.
     * 
     * @return productive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getProductive() {
        return productive;
    }


    /**
     * Sets the productive value for this TimeBillSearchBasic.
     * 
     * @param productive
     */
    public void setProductive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField productive) {
        this.productive = productive;
    }


    /**
     * Gets the rejectionNote value for this TimeBillSearchBasic.
     * 
     * @return rejectionNote
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getRejectionNote() {
        return rejectionNote;
    }


    /**
     * Sets the rejectionNote value for this TimeBillSearchBasic.
     * 
     * @param rejectionNote
     */
    public void setRejectionNote(com.netsuite.webservices.platform.core_2019_1.SearchStringField rejectionNote) {
        this.rejectionNote = rejectionNote;
    }


    /**
     * Gets the status value for this TimeBillSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TimeBillSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField status) {
        this.status = status;
    }


    /**
     * Gets the subsidiary value for this TimeBillSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TimeBillSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the temporaryLocalJurisdiction value for this TimeBillSearchBasic.
     * 
     * @return temporaryLocalJurisdiction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTemporaryLocalJurisdiction() {
        return temporaryLocalJurisdiction;
    }


    /**
     * Sets the temporaryLocalJurisdiction value for this TimeBillSearchBasic.
     * 
     * @param temporaryLocalJurisdiction
     */
    public void setTemporaryLocalJurisdiction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField temporaryLocalJurisdiction) {
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
    }


    /**
     * Gets the temporaryStateJurisdiction value for this TimeBillSearchBasic.
     * 
     * @return temporaryStateJurisdiction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTemporaryStateJurisdiction() {
        return temporaryStateJurisdiction;
    }


    /**
     * Sets the temporaryStateJurisdiction value for this TimeBillSearchBasic.
     * 
     * @param temporaryStateJurisdiction
     */
    public void setTemporaryStateJurisdiction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField temporaryStateJurisdiction) {
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
    }


    /**
     * Gets the timeSheet value for this TimeBillSearchBasic.
     * 
     * @return timeSheet
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTimeSheet() {
        return timeSheet;
    }


    /**
     * Sets the timeSheet value for this TimeBillSearchBasic.
     * 
     * @param timeSheet
     */
    public void setTimeSheet(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField timeSheet) {
        this.timeSheet = timeSheet;
    }


    /**
     * Gets the type value for this TimeBillSearchBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this TimeBillSearchBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the utilized value for this TimeBillSearchBasic.
     * 
     * @return utilized
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUtilized() {
        return utilized;
    }


    /**
     * Sets the utilized value for this TimeBillSearchBasic.
     * 
     * @param utilized
     */
    public void setUtilized(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField utilized) {
        this.utilized = utilized;
    }


    /**
     * Gets the customFieldList value for this TimeBillSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TimeBillSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeBillSearchBasic)) return false;
        TimeBillSearchBasic other = (TimeBillSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.approved==null && other.getApproved()==null) || 
             (this.approved!=null &&
              this.approved.equals(other.getApproved()))) &&
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              this.billable.equals(other.getBillable()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.exempt==null && other.getExempt()==null) || 
             (this.exempt!=null &&
              this.exempt.equals(other.getExempt()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              this.lastModified.equals(other.getLastModified()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.paidByPayroll==null && other.getPaidByPayroll()==null) || 
             (this.paidByPayroll!=null &&
              this.paidByPayroll.equals(other.getPaidByPayroll()))) &&
            ((this.paidExternally==null && other.getPaidExternally()==null) || 
             (this.paidExternally!=null &&
              this.paidExternally.equals(other.getPaidExternally()))) &&
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              this.payItem.equals(other.getPayItem()))) &&
            ((this.productive==null && other.getProductive()==null) || 
             (this.productive!=null &&
              this.productive.equals(other.getProductive()))) &&
            ((this.rejectionNote==null && other.getRejectionNote()==null) || 
             (this.rejectionNote!=null &&
              this.rejectionNote.equals(other.getRejectionNote()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.temporaryLocalJurisdiction==null && other.getTemporaryLocalJurisdiction()==null) || 
             (this.temporaryLocalJurisdiction!=null &&
              this.temporaryLocalJurisdiction.equals(other.getTemporaryLocalJurisdiction()))) &&
            ((this.temporaryStateJurisdiction==null && other.getTemporaryStateJurisdiction()==null) || 
             (this.temporaryStateJurisdiction!=null &&
              this.temporaryStateJurisdiction.equals(other.getTemporaryStateJurisdiction()))) &&
            ((this.timeSheet==null && other.getTimeSheet()==null) || 
             (this.timeSheet!=null &&
              this.timeSheet.equals(other.getTimeSheet()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.utilized==null && other.getUtilized()==null) || 
             (this.utilized!=null &&
              this.utilized.equals(other.getUtilized()))) &&
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
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getApproved() != null) {
            _hashCode += getApproved().hashCode();
        }
        if (getBillable() != null) {
            _hashCode += getBillable().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getExempt() != null) {
            _hashCode += getExempt().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLastModified() != null) {
            _hashCode += getLastModified().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getPaidByPayroll() != null) {
            _hashCode += getPaidByPayroll().hashCode();
        }
        if (getPaidExternally() != null) {
            _hashCode += getPaidExternally().hashCode();
        }
        if (getPayItem() != null) {
            _hashCode += getPayItem().hashCode();
        }
        if (getProductive() != null) {
            _hashCode += getProductive().hashCode();
        }
        if (getRejectionNote() != null) {
            _hashCode += getRejectionNote().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTemporaryLocalJurisdiction() != null) {
            _hashCode += getTemporaryLocalJurisdiction().hashCode();
        }
        if (getTemporaryStateJurisdiction() != null) {
            _hashCode += getTemporaryStateJurisdiction().hashCode();
        }
        if (getTimeSheet() != null) {
            _hashCode += getTimeSheet().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUtilized() != null) {
            _hashCode += getUtilized().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeBillSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "exempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidByPayroll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paidByPayroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "productive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionNote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rejectionNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryLocalJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "temporaryLocalJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryStateJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "temporaryStateJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSheet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "timeSheet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "utilized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
