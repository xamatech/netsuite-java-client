/**
 * TimeBill.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class TimeBill  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef employee;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef caseTaskEvent;

    private java.lang.Boolean isBillable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem;

    private java.lang.Boolean paidExternally;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef workplace;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.Duration hours;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef price;

    private com.netsuite.webservices.transactions.employees_2019_1.types.TimeBillTimeType timeType;

    private java.lang.Double rate;

    private java.lang.Boolean overrideRate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryLocalJurisdiction;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryStateJurisdiction;

    private java.lang.String memo;

    private java.lang.String rejectionNote;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private java.lang.Boolean supervisorApproval;

    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef timeSheet;

    private java.lang.String status;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public TimeBill() {
    }

    public TimeBill(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef employee,
           java.util.Calendar tranDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           com.netsuite.webservices.platform.core_2019_1.RecordRef caseTaskEvent,
           java.lang.Boolean isBillable,
           com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem,
           java.lang.Boolean paidExternally,
           com.netsuite.webservices.platform.core_2019_1.RecordRef workplace,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.Duration hours,
           com.netsuite.webservices.platform.core_2019_1.RecordRef price,
           com.netsuite.webservices.transactions.employees_2019_1.types.TimeBillTimeType timeType,
           java.lang.Double rate,
           java.lang.Boolean overrideRate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryLocalJurisdiction,
           com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryStateJurisdiction,
           java.lang.String memo,
           java.lang.String rejectionNote,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           java.lang.Boolean supervisorApproval,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef timeSheet,
           java.lang.String status,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.employee = employee;
        this.tranDate = tranDate;
        this.approvalStatus = approvalStatus;
        this.customer = customer;
        this.caseTaskEvent = caseTaskEvent;
        this.isBillable = isBillable;
        this.payrollItem = payrollItem;
        this.paidExternally = paidExternally;
        this.workplace = workplace;
        this.item = item;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.hours = hours;
        this.price = price;
        this.timeType = timeType;
        this.rate = rate;
        this.overrideRate = overrideRate;
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
        this.memo = memo;
        this.rejectionNote = rejectionNote;
        this.subsidiary = subsidiary;
        this.supervisorApproval = supervisorApproval;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.timeSheet = timeSheet;
        this.status = status;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this TimeBill.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this TimeBill.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the employee value for this TimeBill.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TimeBill.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.RecordRef employee) {
        this.employee = employee;
    }


    /**
     * Gets the tranDate value for this TimeBill.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this TimeBill.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the approvalStatus value for this TimeBill.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this TimeBill.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the customer value for this TimeBill.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TimeBill.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the caseTaskEvent value for this TimeBill.
     * 
     * @return caseTaskEvent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCaseTaskEvent() {
        return caseTaskEvent;
    }


    /**
     * Sets the caseTaskEvent value for this TimeBill.
     * 
     * @param caseTaskEvent
     */
    public void setCaseTaskEvent(com.netsuite.webservices.platform.core_2019_1.RecordRef caseTaskEvent) {
        this.caseTaskEvent = caseTaskEvent;
    }


    /**
     * Gets the isBillable value for this TimeBill.
     * 
     * @return isBillable
     */
    public java.lang.Boolean getIsBillable() {
        return isBillable;
    }


    /**
     * Sets the isBillable value for this TimeBill.
     * 
     * @param isBillable
     */
    public void setIsBillable(java.lang.Boolean isBillable) {
        this.isBillable = isBillable;
    }


    /**
     * Gets the payrollItem value for this TimeBill.
     * 
     * @return payrollItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPayrollItem() {
        return payrollItem;
    }


    /**
     * Sets the payrollItem value for this TimeBill.
     * 
     * @param payrollItem
     */
    public void setPayrollItem(com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem) {
        this.payrollItem = payrollItem;
    }


    /**
     * Gets the paidExternally value for this TimeBill.
     * 
     * @return paidExternally
     */
    public java.lang.Boolean getPaidExternally() {
        return paidExternally;
    }


    /**
     * Sets the paidExternally value for this TimeBill.
     * 
     * @param paidExternally
     */
    public void setPaidExternally(java.lang.Boolean paidExternally) {
        this.paidExternally = paidExternally;
    }


    /**
     * Gets the workplace value for this TimeBill.
     * 
     * @return workplace
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getWorkplace() {
        return workplace;
    }


    /**
     * Sets the workplace value for this TimeBill.
     * 
     * @param workplace
     */
    public void setWorkplace(com.netsuite.webservices.platform.core_2019_1.RecordRef workplace) {
        this.workplace = workplace;
    }


    /**
     * Gets the item value for this TimeBill.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this TimeBill.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the department value for this TimeBill.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TimeBill.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this TimeBill.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TimeBill.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this TimeBill.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TimeBill.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the hours value for this TimeBill.
     * 
     * @return hours
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this TimeBill.
     * 
     * @param hours
     */
    public void setHours(com.netsuite.webservices.platform.core_2019_1.Duration hours) {
        this.hours = hours;
    }


    /**
     * Gets the price value for this TimeBill.
     * 
     * @return price
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPrice() {
        return price;
    }


    /**
     * Sets the price value for this TimeBill.
     * 
     * @param price
     */
    public void setPrice(com.netsuite.webservices.platform.core_2019_1.RecordRef price) {
        this.price = price;
    }


    /**
     * Gets the timeType value for this TimeBill.
     * 
     * @return timeType
     */
    public com.netsuite.webservices.transactions.employees_2019_1.types.TimeBillTimeType getTimeType() {
        return timeType;
    }


    /**
     * Sets the timeType value for this TimeBill.
     * 
     * @param timeType
     */
    public void setTimeType(com.netsuite.webservices.transactions.employees_2019_1.types.TimeBillTimeType timeType) {
        this.timeType = timeType;
    }


    /**
     * Gets the rate value for this TimeBill.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TimeBill.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the overrideRate value for this TimeBill.
     * 
     * @return overrideRate
     */
    public java.lang.Boolean getOverrideRate() {
        return overrideRate;
    }


    /**
     * Sets the overrideRate value for this TimeBill.
     * 
     * @param overrideRate
     */
    public void setOverrideRate(java.lang.Boolean overrideRate) {
        this.overrideRate = overrideRate;
    }


    /**
     * Gets the temporaryLocalJurisdiction value for this TimeBill.
     * 
     * @return temporaryLocalJurisdiction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTemporaryLocalJurisdiction() {
        return temporaryLocalJurisdiction;
    }


    /**
     * Sets the temporaryLocalJurisdiction value for this TimeBill.
     * 
     * @param temporaryLocalJurisdiction
     */
    public void setTemporaryLocalJurisdiction(com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryLocalJurisdiction) {
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
    }


    /**
     * Gets the temporaryStateJurisdiction value for this TimeBill.
     * 
     * @return temporaryStateJurisdiction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTemporaryStateJurisdiction() {
        return temporaryStateJurisdiction;
    }


    /**
     * Sets the temporaryStateJurisdiction value for this TimeBill.
     * 
     * @param temporaryStateJurisdiction
     */
    public void setTemporaryStateJurisdiction(com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryStateJurisdiction) {
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
    }


    /**
     * Gets the memo value for this TimeBill.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TimeBill.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the rejectionNote value for this TimeBill.
     * 
     * @return rejectionNote
     */
    public java.lang.String getRejectionNote() {
        return rejectionNote;
    }


    /**
     * Sets the rejectionNote value for this TimeBill.
     * 
     * @param rejectionNote
     */
    public void setRejectionNote(java.lang.String rejectionNote) {
        this.rejectionNote = rejectionNote;
    }


    /**
     * Gets the subsidiary value for this TimeBill.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TimeBill.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the supervisorApproval value for this TimeBill.
     * 
     * @return supervisorApproval
     */
    public java.lang.Boolean getSupervisorApproval() {
        return supervisorApproval;
    }


    /**
     * Sets the supervisorApproval value for this TimeBill.
     * 
     * @param supervisorApproval
     */
    public void setSupervisorApproval(java.lang.Boolean supervisorApproval) {
        this.supervisorApproval = supervisorApproval;
    }


    /**
     * Gets the createdDate value for this TimeBill.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TimeBill.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this TimeBill.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this TimeBill.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the timeSheet value for this TimeBill.
     * 
     * @return timeSheet
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTimeSheet() {
        return timeSheet;
    }


    /**
     * Sets the timeSheet value for this TimeBill.
     * 
     * @param timeSheet
     */
    public void setTimeSheet(com.netsuite.webservices.platform.core_2019_1.RecordRef timeSheet) {
        this.timeSheet = timeSheet;
    }


    /**
     * Gets the status value for this TimeBill.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TimeBill.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the customFieldList value for this TimeBill.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TimeBill.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this TimeBill.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TimeBill.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this TimeBill.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TimeBill.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeBill)) return false;
        TimeBill other = (TimeBill) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.caseTaskEvent==null && other.getCaseTaskEvent()==null) || 
             (this.caseTaskEvent!=null &&
              this.caseTaskEvent.equals(other.getCaseTaskEvent()))) &&
            ((this.isBillable==null && other.getIsBillable()==null) || 
             (this.isBillable!=null &&
              this.isBillable.equals(other.getIsBillable()))) &&
            ((this.payrollItem==null && other.getPayrollItem()==null) || 
             (this.payrollItem!=null &&
              this.payrollItem.equals(other.getPayrollItem()))) &&
            ((this.paidExternally==null && other.getPaidExternally()==null) || 
             (this.paidExternally!=null &&
              this.paidExternally.equals(other.getPaidExternally()))) &&
            ((this.workplace==null && other.getWorkplace()==null) || 
             (this.workplace!=null &&
              this.workplace.equals(other.getWorkplace()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              this.hours.equals(other.getHours()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.timeType==null && other.getTimeType()==null) || 
             (this.timeType!=null &&
              this.timeType.equals(other.getTimeType()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.overrideRate==null && other.getOverrideRate()==null) || 
             (this.overrideRate!=null &&
              this.overrideRate.equals(other.getOverrideRate()))) &&
            ((this.temporaryLocalJurisdiction==null && other.getTemporaryLocalJurisdiction()==null) || 
             (this.temporaryLocalJurisdiction!=null &&
              this.temporaryLocalJurisdiction.equals(other.getTemporaryLocalJurisdiction()))) &&
            ((this.temporaryStateJurisdiction==null && other.getTemporaryStateJurisdiction()==null) || 
             (this.temporaryStateJurisdiction!=null &&
              this.temporaryStateJurisdiction.equals(other.getTemporaryStateJurisdiction()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.rejectionNote==null && other.getRejectionNote()==null) || 
             (this.rejectionNote!=null &&
              this.rejectionNote.equals(other.getRejectionNote()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.supervisorApproval==null && other.getSupervisorApproval()==null) || 
             (this.supervisorApproval!=null &&
              this.supervisorApproval.equals(other.getSupervisorApproval()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.timeSheet==null && other.getTimeSheet()==null) || 
             (this.timeSheet!=null &&
              this.timeSheet.equals(other.getTimeSheet()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCaseTaskEvent() != null) {
            _hashCode += getCaseTaskEvent().hashCode();
        }
        if (getIsBillable() != null) {
            _hashCode += getIsBillable().hashCode();
        }
        if (getPayrollItem() != null) {
            _hashCode += getPayrollItem().hashCode();
        }
        if (getPaidExternally() != null) {
            _hashCode += getPaidExternally().hashCode();
        }
        if (getWorkplace() != null) {
            _hashCode += getWorkplace().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getHours() != null) {
            _hashCode += getHours().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getTimeType() != null) {
            _hashCode += getTimeType().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getOverrideRate() != null) {
            _hashCode += getOverrideRate().hashCode();
        }
        if (getTemporaryLocalJurisdiction() != null) {
            _hashCode += getTemporaryLocalJurisdiction().hashCode();
        }
        if (getTemporaryStateJurisdiction() != null) {
            _hashCode += getTemporaryStateJurisdiction().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getRejectionNote() != null) {
            _hashCode += getRejectionNote().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getSupervisorApproval() != null) {
            _hashCode += getSupervisorApproval().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getTimeSheet() != null) {
            _hashCode += getTimeSheet().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(TimeBill.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeBill"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseTaskEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "caseTaskEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "timeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.transactions.webservices.netsuite.com", "TimeBillTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "overrideRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryLocalJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "temporaryLocalJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryStateJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "temporaryStateJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionNote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "rejectionNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorApproval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "supervisorApproval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSheet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "timeSheet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
