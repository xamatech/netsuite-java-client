/**
 * TimeEntrySearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TimeEntrySearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingClass;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billingStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] _break;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] caseTaskEvent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] classNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] date;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] departmentNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] durationDecimal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] employee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hours;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBillable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isExempt;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isProductive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isUtilized;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModified;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] locationNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nextApprover;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paidExternally;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] payrollDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiaryNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] timeSheet;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public TimeEntrySearchRowBasic() {
    }

    public TimeEntrySearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] approvalStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingClass,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billingStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] _break,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] caseTaskEvent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] classNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] date,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] departmentNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] durationDecimal,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] employee,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hours,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBillable,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isExempt,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isProductive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isUtilized,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModified,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] locationNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nextApprover,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paidExternally,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payItem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] payrollDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiaryNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] timeSheet,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.approvalStatus = approvalStatus;
        this.billingClass = billingClass;
        this.billingStatus = billingStatus;
        this._break = _break;
        this.caseTaskEvent = caseTaskEvent;
        this._class = _class;
        this.classNoHierarchy = classNoHierarchy;
        this.customer = customer;
        this.date = date;
        this.dateCreated = dateCreated;
        this.department = department;
        this.departmentNoHierarchy = departmentNoHierarchy;
        this.durationDecimal = durationDecimal;
        this.employee = employee;
        this.endTime = endTime;
        this.externalId = externalId;
        this.hours = hours;
        this.internalId = internalId;
        this.isBillable = isBillable;
        this.isExempt = isExempt;
        this.isProductive = isProductive;
        this.isUtilized = isUtilized;
        this.item = item;
        this.lastModified = lastModified;
        this.location = location;
        this.locationNoHierarchy = locationNoHierarchy;
        this.memo = memo;
        this.nextApprover = nextApprover;
        this.paidExternally = paidExternally;
        this.payItem = payItem;
        this.payrollDate = payrollDate;
        this.rate = rate;
        this.startTime = startTime;
        this.subsidiary = subsidiary;
        this.subsidiaryNoHierarchy = subsidiaryNoHierarchy;
        this.timeSheet = timeSheet;
        this.type = type;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the approvalStatus value for this TimeEntrySearchRowBasic.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this TimeEntrySearchRowBasic.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getApprovalStatus(int i) {
        return this.approvalStatus[i];
    }

    public void setApprovalStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.approvalStatus[i] = _value;
    }


    /**
     * Gets the billingClass value for this TimeEntrySearchRowBasic.
     * 
     * @return billingClass
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillingClass() {
        return billingClass;
    }


    /**
     * Sets the billingClass value for this TimeEntrySearchRowBasic.
     * 
     * @param billingClass
     */
    public void setBillingClass(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingClass) {
        this.billingClass = billingClass;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillingClass(int i) {
        return this.billingClass[i];
    }

    public void setBillingClass(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billingClass[i] = _value;
    }


    /**
     * Gets the billingStatus value for this TimeEntrySearchRowBasic.
     * 
     * @return billingStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillingStatus() {
        return billingStatus;
    }


    /**
     * Sets the billingStatus value for this TimeEntrySearchRowBasic.
     * 
     * @param billingStatus
     */
    public void setBillingStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billingStatus) {
        this.billingStatus = billingStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillingStatus(int i) {
        return this.billingStatus[i];
    }

    public void setBillingStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billingStatus[i] = _value;
    }


    /**
     * Gets the _break value for this TimeEntrySearchRowBasic.
     * 
     * @return _break
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] get_break() {
        return _break;
    }


    /**
     * Sets the _break value for this TimeEntrySearchRowBasic.
     * 
     * @param _break
     */
    public void set_break(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] _break) {
        this._break = _break;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField get_break(int i) {
        return this._break[i];
    }

    public void set_break(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this._break[i] = _value;
    }


    /**
     * Gets the caseTaskEvent value for this TimeEntrySearchRowBasic.
     * 
     * @return caseTaskEvent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCaseTaskEvent() {
        return caseTaskEvent;
    }


    /**
     * Sets the caseTaskEvent value for this TimeEntrySearchRowBasic.
     * 
     * @param caseTaskEvent
     */
    public void setCaseTaskEvent(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] caseTaskEvent) {
        this.caseTaskEvent = caseTaskEvent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCaseTaskEvent(int i) {
        return this.caseTaskEvent[i];
    }

    public void setCaseTaskEvent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.caseTaskEvent[i] = _value;
    }


    /**
     * Gets the _class value for this TimeEntrySearchRowBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TimeEntrySearchRowBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this._class[i] = _value;
    }


    /**
     * Gets the classNoHierarchy value for this TimeEntrySearchRowBasic.
     * 
     * @return classNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getClassNoHierarchy() {
        return classNoHierarchy;
    }


    /**
     * Sets the classNoHierarchy value for this TimeEntrySearchRowBasic.
     * 
     * @param classNoHierarchy
     */
    public void setClassNoHierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] classNoHierarchy) {
        this.classNoHierarchy = classNoHierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getClassNoHierarchy(int i) {
        return this.classNoHierarchy[i];
    }

    public void setClassNoHierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.classNoHierarchy[i] = _value;
    }


    /**
     * Gets the customer value for this TimeEntrySearchRowBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TimeEntrySearchRowBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer) {
        this.customer = customer;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.customer[i] = _value;
    }


    /**
     * Gets the date value for this TimeEntrySearchRowBasic.
     * 
     * @return date
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDate() {
        return date;
    }


    /**
     * Sets the date value for this TimeEntrySearchRowBasic.
     * 
     * @param date
     */
    public void setDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] date) {
        this.date = date;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDate(int i) {
        return this.date[i];
    }

    public void setDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.date[i] = _value;
    }


    /**
     * Gets the dateCreated value for this TimeEntrySearchRowBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TimeEntrySearchRowBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }


    /**
     * Gets the department value for this TimeEntrySearchRowBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TimeEntrySearchRowBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department) {
        this.department = department;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.department[i] = _value;
    }


    /**
     * Gets the departmentNoHierarchy value for this TimeEntrySearchRowBasic.
     * 
     * @return departmentNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDepartmentNoHierarchy() {
        return departmentNoHierarchy;
    }


    /**
     * Sets the departmentNoHierarchy value for this TimeEntrySearchRowBasic.
     * 
     * @param departmentNoHierarchy
     */
    public void setDepartmentNoHierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] departmentNoHierarchy) {
        this.departmentNoHierarchy = departmentNoHierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDepartmentNoHierarchy(int i) {
        return this.departmentNoHierarchy[i];
    }

    public void setDepartmentNoHierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.departmentNoHierarchy[i] = _value;
    }


    /**
     * Gets the durationDecimal value for this TimeEntrySearchRowBasic.
     * 
     * @return durationDecimal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDurationDecimal() {
        return durationDecimal;
    }


    /**
     * Sets the durationDecimal value for this TimeEntrySearchRowBasic.
     * 
     * @param durationDecimal
     */
    public void setDurationDecimal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] durationDecimal) {
        this.durationDecimal = durationDecimal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDurationDecimal(int i) {
        return this.durationDecimal[i];
    }

    public void setDurationDecimal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.durationDecimal[i] = _value;
    }


    /**
     * Gets the employee value for this TimeEntrySearchRowBasic.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TimeEntrySearchRowBasic.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] employee) {
        this.employee = employee;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEmployee(int i) {
        return this.employee[i];
    }

    public void setEmployee(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.employee[i] = _value;
    }


    /**
     * Gets the endTime value for this TimeEntrySearchRowBasic.
     * 
     * @return endTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this TimeEntrySearchRowBasic.
     * 
     * @param endTime
     */
    public void setEndTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endTime) {
        this.endTime = endTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEndTime(int i) {
        return this.endTime[i];
    }

    public void setEndTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.endTime[i] = _value;
    }


    /**
     * Gets the externalId value for this TimeEntrySearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TimeEntrySearchRowBasic.
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
     * Gets the hours value for this TimeEntrySearchRowBasic.
     * 
     * @return hours
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this TimeEntrySearchRowBasic.
     * 
     * @param hours
     */
    public void setHours(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hours) {
        this.hours = hours;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getHours(int i) {
        return this.hours[i];
    }

    public void setHours(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.hours[i] = _value;
    }


    /**
     * Gets the internalId value for this TimeEntrySearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TimeEntrySearchRowBasic.
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
     * Gets the isBillable value for this TimeEntrySearchRowBasic.
     * 
     * @return isBillable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsBillable() {
        return isBillable;
    }


    /**
     * Sets the isBillable value for this TimeEntrySearchRowBasic.
     * 
     * @param isBillable
     */
    public void setIsBillable(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBillable) {
        this.isBillable = isBillable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsBillable(int i) {
        return this.isBillable[i];
    }

    public void setIsBillable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isBillable[i] = _value;
    }


    /**
     * Gets the isExempt value for this TimeEntrySearchRowBasic.
     * 
     * @return isExempt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsExempt() {
        return isExempt;
    }


    /**
     * Sets the isExempt value for this TimeEntrySearchRowBasic.
     * 
     * @param isExempt
     */
    public void setIsExempt(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isExempt) {
        this.isExempt = isExempt;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsExempt(int i) {
        return this.isExempt[i];
    }

    public void setIsExempt(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isExempt[i] = _value;
    }


    /**
     * Gets the isProductive value for this TimeEntrySearchRowBasic.
     * 
     * @return isProductive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsProductive() {
        return isProductive;
    }


    /**
     * Sets the isProductive value for this TimeEntrySearchRowBasic.
     * 
     * @param isProductive
     */
    public void setIsProductive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isProductive) {
        this.isProductive = isProductive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsProductive(int i) {
        return this.isProductive[i];
    }

    public void setIsProductive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isProductive[i] = _value;
    }


    /**
     * Gets the isUtilized value for this TimeEntrySearchRowBasic.
     * 
     * @return isUtilized
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsUtilized() {
        return isUtilized;
    }


    /**
     * Sets the isUtilized value for this TimeEntrySearchRowBasic.
     * 
     * @param isUtilized
     */
    public void setIsUtilized(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isUtilized) {
        this.isUtilized = isUtilized;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsUtilized(int i) {
        return this.isUtilized[i];
    }

    public void setIsUtilized(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isUtilized[i] = _value;
    }


    /**
     * Gets the item value for this TimeEntrySearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this TimeEntrySearchRowBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] item) {
        this.item = item;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the lastModified value for this TimeEntrySearchRowBasic.
     * 
     * @return lastModified
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this TimeEntrySearchRowBasic.
     * 
     * @param lastModified
     */
    public void setLastModified(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModified) {
        this.lastModified = lastModified;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModified(int i) {
        return this.lastModified[i];
    }

    public void setLastModified(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModified[i] = _value;
    }


    /**
     * Gets the location value for this TimeEntrySearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TimeEntrySearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location) {
        this.location = location;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the locationNoHierarchy value for this TimeEntrySearchRowBasic.
     * 
     * @return locationNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocationNoHierarchy() {
        return locationNoHierarchy;
    }


    /**
     * Sets the locationNoHierarchy value for this TimeEntrySearchRowBasic.
     * 
     * @param locationNoHierarchy
     */
    public void setLocationNoHierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] locationNoHierarchy) {
        this.locationNoHierarchy = locationNoHierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLocationNoHierarchy(int i) {
        return this.locationNoHierarchy[i];
    }

    public void setLocationNoHierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.locationNoHierarchy[i] = _value;
    }


    /**
     * Gets the memo value for this TimeEntrySearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TimeEntrySearchRowBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.memo[i] = _value;
    }


    /**
     * Gets the nextApprover value for this TimeEntrySearchRowBasic.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this TimeEntrySearchRowBasic.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nextApprover) {
        this.nextApprover = nextApprover;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getNextApprover(int i) {
        return this.nextApprover[i];
    }

    public void setNextApprover(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.nextApprover[i] = _value;
    }


    /**
     * Gets the paidExternally value for this TimeEntrySearchRowBasic.
     * 
     * @return paidExternally
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPaidExternally() {
        return paidExternally;
    }


    /**
     * Sets the paidExternally value for this TimeEntrySearchRowBasic.
     * 
     * @param paidExternally
     */
    public void setPaidExternally(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paidExternally) {
        this.paidExternally = paidExternally;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPaidExternally(int i) {
        return this.paidExternally[i];
    }

    public void setPaidExternally(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.paidExternally[i] = _value;
    }


    /**
     * Gets the payItem value for this TimeEntrySearchRowBasic.
     * 
     * @return payItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this TimeEntrySearchRowBasic.
     * 
     * @param payItem
     */
    public void setPayItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payItem) {
        this.payItem = payItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPayItem(int i) {
        return this.payItem[i];
    }

    public void setPayItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.payItem[i] = _value;
    }


    /**
     * Gets the payrollDate value for this TimeEntrySearchRowBasic.
     * 
     * @return payrollDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getPayrollDate() {
        return payrollDate;
    }


    /**
     * Sets the payrollDate value for this TimeEntrySearchRowBasic.
     * 
     * @param payrollDate
     */
    public void setPayrollDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] payrollDate) {
        this.payrollDate = payrollDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getPayrollDate(int i) {
        return this.payrollDate[i];
    }

    public void setPayrollDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.payrollDate[i] = _value;
    }


    /**
     * Gets the rate value for this TimeEntrySearchRowBasic.
     * 
     * @return rate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TimeEntrySearchRowBasic.
     * 
     * @param rate
     */
    public void setRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rate) {
        this.rate = rate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.rate[i] = _value;
    }


    /**
     * Gets the startTime value for this TimeEntrySearchRowBasic.
     * 
     * @return startTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TimeEntrySearchRowBasic.
     * 
     * @param startTime
     */
    public void setStartTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startTime) {
        this.startTime = startTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getStartTime(int i) {
        return this.startTime[i];
    }

    public void setStartTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.startTime[i] = _value;
    }


    /**
     * Gets the subsidiary value for this TimeEntrySearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TimeEntrySearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the subsidiaryNoHierarchy value for this TimeEntrySearchRowBasic.
     * 
     * @return subsidiaryNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSubsidiaryNoHierarchy() {
        return subsidiaryNoHierarchy;
    }


    /**
     * Sets the subsidiaryNoHierarchy value for this TimeEntrySearchRowBasic.
     * 
     * @param subsidiaryNoHierarchy
     */
    public void setSubsidiaryNoHierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiaryNoHierarchy) {
        this.subsidiaryNoHierarchy = subsidiaryNoHierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSubsidiaryNoHierarchy(int i) {
        return this.subsidiaryNoHierarchy[i];
    }

    public void setSubsidiaryNoHierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.subsidiaryNoHierarchy[i] = _value;
    }


    /**
     * Gets the timeSheet value for this TimeEntrySearchRowBasic.
     * 
     * @return timeSheet
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTimeSheet() {
        return timeSheet;
    }


    /**
     * Sets the timeSheet value for this TimeEntrySearchRowBasic.
     * 
     * @param timeSheet
     */
    public void setTimeSheet(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] timeSheet) {
        this.timeSheet = timeSheet;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTimeSheet(int i) {
        return this.timeSheet[i];
    }

    public void setTimeSheet(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.timeSheet[i] = _value;
    }


    /**
     * Gets the type value for this TimeEntrySearchRowBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this TimeEntrySearchRowBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the customFieldList value for this TimeEntrySearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TimeEntrySearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeEntrySearchRowBasic)) return false;
        TimeEntrySearchRowBasic other = (TimeEntrySearchRowBasic) obj;
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
              java.util.Arrays.equals(this.approvalStatus, other.getApprovalStatus()))) &&
            ((this.billingClass==null && other.getBillingClass()==null) || 
             (this.billingClass!=null &&
              java.util.Arrays.equals(this.billingClass, other.getBillingClass()))) &&
            ((this.billingStatus==null && other.getBillingStatus()==null) || 
             (this.billingStatus!=null &&
              java.util.Arrays.equals(this.billingStatus, other.getBillingStatus()))) &&
            ((this._break==null && other.get_break()==null) || 
             (this._break!=null &&
              java.util.Arrays.equals(this._break, other.get_break()))) &&
            ((this.caseTaskEvent==null && other.getCaseTaskEvent()==null) || 
             (this.caseTaskEvent!=null &&
              java.util.Arrays.equals(this.caseTaskEvent, other.getCaseTaskEvent()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.classNoHierarchy==null && other.getClassNoHierarchy()==null) || 
             (this.classNoHierarchy!=null &&
              java.util.Arrays.equals(this.classNoHierarchy, other.getClassNoHierarchy()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              java.util.Arrays.equals(this.date, other.getDate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.departmentNoHierarchy==null && other.getDepartmentNoHierarchy()==null) || 
             (this.departmentNoHierarchy!=null &&
              java.util.Arrays.equals(this.departmentNoHierarchy, other.getDepartmentNoHierarchy()))) &&
            ((this.durationDecimal==null && other.getDurationDecimal()==null) || 
             (this.durationDecimal!=null &&
              java.util.Arrays.equals(this.durationDecimal, other.getDurationDecimal()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              java.util.Arrays.equals(this.employee, other.getEmployee()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              java.util.Arrays.equals(this.endTime, other.getEndTime()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              java.util.Arrays.equals(this.hours, other.getHours()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isBillable==null && other.getIsBillable()==null) || 
             (this.isBillable!=null &&
              java.util.Arrays.equals(this.isBillable, other.getIsBillable()))) &&
            ((this.isExempt==null && other.getIsExempt()==null) || 
             (this.isExempt!=null &&
              java.util.Arrays.equals(this.isExempt, other.getIsExempt()))) &&
            ((this.isProductive==null && other.getIsProductive()==null) || 
             (this.isProductive!=null &&
              java.util.Arrays.equals(this.isProductive, other.getIsProductive()))) &&
            ((this.isUtilized==null && other.getIsUtilized()==null) || 
             (this.isUtilized!=null &&
              java.util.Arrays.equals(this.isUtilized, other.getIsUtilized()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              java.util.Arrays.equals(this.lastModified, other.getLastModified()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.locationNoHierarchy==null && other.getLocationNoHierarchy()==null) || 
             (this.locationNoHierarchy!=null &&
              java.util.Arrays.equals(this.locationNoHierarchy, other.getLocationNoHierarchy()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              java.util.Arrays.equals(this.nextApprover, other.getNextApprover()))) &&
            ((this.paidExternally==null && other.getPaidExternally()==null) || 
             (this.paidExternally!=null &&
              java.util.Arrays.equals(this.paidExternally, other.getPaidExternally()))) &&
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              java.util.Arrays.equals(this.payItem, other.getPayItem()))) &&
            ((this.payrollDate==null && other.getPayrollDate()==null) || 
             (this.payrollDate!=null &&
              java.util.Arrays.equals(this.payrollDate, other.getPayrollDate()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              java.util.Arrays.equals(this.rate, other.getRate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              java.util.Arrays.equals(this.startTime, other.getStartTime()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.subsidiaryNoHierarchy==null && other.getSubsidiaryNoHierarchy()==null) || 
             (this.subsidiaryNoHierarchy!=null &&
              java.util.Arrays.equals(this.subsidiaryNoHierarchy, other.getSubsidiaryNoHierarchy()))) &&
            ((this.timeSheet==null && other.getTimeSheet()==null) || 
             (this.timeSheet!=null &&
              java.util.Arrays.equals(this.timeSheet, other.getTimeSheet()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingClass() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingClass());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingClass(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_break() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_break());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_break(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseTaskEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseTaskEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseTaskEvent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassNoHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassNoHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassNoHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartmentNoHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartmentNoHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartmentNoHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDurationDecimal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDurationDecimal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDurationDecimal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployee(), i);
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
        if (getHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHours());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHours(), i);
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
        if (getIsBillable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsBillable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsBillable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsExempt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsExempt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsExempt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsProductive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsProductive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsProductive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsUtilized() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsUtilized());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsUtilized(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModified() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModified());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModified(), i);
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
        if (getLocationNoHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationNoHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationNoHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextApprover(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaidExternally() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaidExternally());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaidExternally(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayrollDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRate(), i);
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
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiaryNoHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiaryNoHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiaryNoHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeSheet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeSheet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeSheet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
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
        new org.apache.axis.description.TypeDesc(TimeEntrySearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeEntrySearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_break");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "break"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseTaskEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseTaskEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "classNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "departmentNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationDecimal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "durationDecimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProductive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isProductive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUtilized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isUtilized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payrollDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiaryNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSheet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "timeSheet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
