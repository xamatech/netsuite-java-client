/**
 * TimeEntrySearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class TimeEntrySearchBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField approvalStatus;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField billable;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField billingClass;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField billingStatus;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField _class;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField customer;

    private com.netsuite.webservices.platform.core_2024_2.SearchDateField date;

    private com.netsuite.webservices.platform.core_2024_2.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField department;

    private com.netsuite.webservices.platform.core_2024_2.SearchDoubleField duration;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField employee;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField exempt;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField isCharged;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2024_2.SearchDateField lastModified;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2024_2.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField nextApprover;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField paidByPayroll;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField paidExternally;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField payItem;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField productive;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField type;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField utilized;

    private com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList customFieldList;

    public TimeEntrySearchBasic() {
    }

    public TimeEntrySearchBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField approvalStatus,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField billable,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField billingClass,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField billingStatus,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField _class,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField customer,
           com.netsuite.webservices.platform.core_2024_2.SearchDateField date,
           com.netsuite.webservices.platform.core_2024_2.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField department,
           com.netsuite.webservices.platform.core_2024_2.SearchDoubleField duration,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField employee,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField exempt,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2024_2.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField isCharged,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2024_2.SearchDateField lastModified,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField location,
           com.netsuite.webservices.platform.core_2024_2.SearchStringField memo,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField nextApprover,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField paidByPayroll,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField paidExternally,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField payItem,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField productive,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField type,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField utilized,
           com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList customFieldList) {
        this.approvalStatus = approvalStatus;
        this.billable = billable;
        this.billingClass = billingClass;
        this.billingStatus = billingStatus;
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
        this.isCharged = isCharged;
        this.item = item;
        this.lastModified = lastModified;
        this.location = location;
        this.memo = memo;
        this.nextApprover = nextApprover;
        this.paidByPayroll = paidByPayroll;
        this.paidExternally = paidExternally;
        this.payItem = payItem;
        this.productive = productive;
        this.subsidiary = subsidiary;
        this.type = type;
        this.utilized = utilized;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the approvalStatus value for this TimeEntrySearchBasic.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this TimeEntrySearchBasic.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the billable value for this TimeEntrySearchBasic.
     * 
     * @return billable
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this TimeEntrySearchBasic.
     * 
     * @param billable
     */
    public void setBillable(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField billable) {
        this.billable = billable;
    }


    /**
     * Gets the billingClass value for this TimeEntrySearchBasic.
     * 
     * @return billingClass
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getBillingClass() {
        return billingClass;
    }


    /**
     * Sets the billingClass value for this TimeEntrySearchBasic.
     * 
     * @param billingClass
     */
    public void setBillingClass(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField billingClass) {
        this.billingClass = billingClass;
    }


    /**
     * Gets the billingStatus value for this TimeEntrySearchBasic.
     * 
     * @return billingStatus
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getBillingStatus() {
        return billingStatus;
    }


    /**
     * Sets the billingStatus value for this TimeEntrySearchBasic.
     * 
     * @param billingStatus
     */
    public void setBillingStatus(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField billingStatus) {
        this.billingStatus = billingStatus;
    }


    /**
     * Gets the _class value for this TimeEntrySearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TimeEntrySearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the customer value for this TimeEntrySearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TimeEntrySearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField customer) {
        this.customer = customer;
    }


    /**
     * Gets the date value for this TimeEntrySearchBasic.
     * 
     * @return date
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDateField getDate() {
        return date;
    }


    /**
     * Sets the date value for this TimeEntrySearchBasic.
     * 
     * @param date
     */
    public void setDate(com.netsuite.webservices.platform.core_2024_2.SearchDateField date) {
        this.date = date;
    }


    /**
     * Gets the dateCreated value for this TimeEntrySearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TimeEntrySearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2024_2.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the department value for this TimeEntrySearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TimeEntrySearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the duration value for this TimeEntrySearchBasic.
     * 
     * @return duration
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDoubleField getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this TimeEntrySearchBasic.
     * 
     * @param duration
     */
    public void setDuration(com.netsuite.webservices.platform.core_2024_2.SearchDoubleField duration) {
        this.duration = duration;
    }


    /**
     * Gets the employee value for this TimeEntrySearchBasic.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TimeEntrySearchBasic.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField employee) {
        this.employee = employee;
    }


    /**
     * Gets the exempt value for this TimeEntrySearchBasic.
     * 
     * @return exempt
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getExempt() {
        return exempt;
    }


    /**
     * Sets the exempt value for this TimeEntrySearchBasic.
     * 
     * @param exempt
     */
    public void setExempt(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField exempt) {
        this.exempt = exempt;
    }


    /**
     * Gets the externalId value for this TimeEntrySearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TimeEntrySearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TimeEntrySearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TimeEntrySearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2024_2.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this TimeEntrySearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TimeEntrySearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TimeEntrySearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TimeEntrySearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isCharged value for this TimeEntrySearchBasic.
     * 
     * @return isCharged
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getIsCharged() {
        return isCharged;
    }


    /**
     * Sets the isCharged value for this TimeEntrySearchBasic.
     * 
     * @param isCharged
     */
    public void setIsCharged(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField isCharged) {
        this.isCharged = isCharged;
    }


    /**
     * Gets the item value for this TimeEntrySearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this TimeEntrySearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lastModified value for this TimeEntrySearchBasic.
     * 
     * @return lastModified
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDateField getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this TimeEntrySearchBasic.
     * 
     * @param lastModified
     */
    public void setLastModified(com.netsuite.webservices.platform.core_2024_2.SearchDateField lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the location value for this TimeEntrySearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TimeEntrySearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this TimeEntrySearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TimeEntrySearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2024_2.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the nextApprover value for this TimeEntrySearchBasic.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this TimeEntrySearchBasic.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField nextApprover) {
        this.nextApprover = nextApprover;
    }


    /**
     * Gets the paidByPayroll value for this TimeEntrySearchBasic.
     * 
     * @return paidByPayroll
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getPaidByPayroll() {
        return paidByPayroll;
    }


    /**
     * Sets the paidByPayroll value for this TimeEntrySearchBasic.
     * 
     * @param paidByPayroll
     */
    public void setPaidByPayroll(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField paidByPayroll) {
        this.paidByPayroll = paidByPayroll;
    }


    /**
     * Gets the paidExternally value for this TimeEntrySearchBasic.
     * 
     * @return paidExternally
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getPaidExternally() {
        return paidExternally;
    }


    /**
     * Sets the paidExternally value for this TimeEntrySearchBasic.
     * 
     * @param paidExternally
     */
    public void setPaidExternally(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField paidExternally) {
        this.paidExternally = paidExternally;
    }


    /**
     * Gets the payItem value for this TimeEntrySearchBasic.
     * 
     * @return payItem
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this TimeEntrySearchBasic.
     * 
     * @param payItem
     */
    public void setPayItem(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the productive value for this TimeEntrySearchBasic.
     * 
     * @return productive
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getProductive() {
        return productive;
    }


    /**
     * Sets the productive value for this TimeEntrySearchBasic.
     * 
     * @param productive
     */
    public void setProductive(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField productive) {
        this.productive = productive;
    }


    /**
     * Gets the subsidiary value for this TimeEntrySearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TimeEntrySearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the type value for this TimeEntrySearchBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this TimeEntrySearchBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the utilized value for this TimeEntrySearchBasic.
     * 
     * @return utilized
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getUtilized() {
        return utilized;
    }


    /**
     * Sets the utilized value for this TimeEntrySearchBasic.
     * 
     * @param utilized
     */
    public void setUtilized(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField utilized) {
        this.utilized = utilized;
    }


    /**
     * Gets the customFieldList value for this TimeEntrySearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TimeEntrySearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeEntrySearchBasic)) return false;
        TimeEntrySearchBasic other = (TimeEntrySearchBasic) obj;
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
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              this.billable.equals(other.getBillable()))) &&
            ((this.billingClass==null && other.getBillingClass()==null) || 
             (this.billingClass!=null &&
              this.billingClass.equals(other.getBillingClass()))) &&
            ((this.billingStatus==null && other.getBillingStatus()==null) || 
             (this.billingStatus!=null &&
              this.billingStatus.equals(other.getBillingStatus()))) &&
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
            ((this.isCharged==null && other.getIsCharged()==null) || 
             (this.isCharged!=null &&
              this.isCharged.equals(other.getIsCharged()))) &&
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
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              this.nextApprover.equals(other.getNextApprover()))) &&
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
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
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
        if (getBillable() != null) {
            _hashCode += getBillable().hashCode();
        }
        if (getBillingClass() != null) {
            _hashCode += getBillingClass().hashCode();
        }
        if (getBillingStatus() != null) {
            _hashCode += getBillingStatus().hashCode();
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
        if (getIsCharged() != null) {
            _hashCode += getIsCharged().hashCode();
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
        if (getNextApprover() != null) {
            _hashCode += getNextApprover().hashCode();
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
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
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
        new org.apache.axis.description.TypeDesc(TimeEntrySearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "TimeEntrySearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "billingClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "billingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "exempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCharged");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "isCharged"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidByPayroll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "paidByPayroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "productive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "utilized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
