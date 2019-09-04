/**
 * BillingAccountSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class BillingAccountSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] cashSaleForm;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] customerDefault;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] frequency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] idNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] inactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] invoiceForm;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastBillCycleDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastBillDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextBillCycleDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public BillingAccountSearchRowBasic() {
    }

    public BillingAccountSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingSchedule,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] cashSaleForm,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] customerDefault,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] frequency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] idNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] inactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] invoiceForm,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastBillCycleDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastBillDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextBillCycleDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.billingSchedule = billingSchedule;
        this.cashSaleForm = cashSaleForm;
        this._class = _class;
        this.currency = currency;
        this.customer = customer;
        this.customerDefault = customerDefault;
        this.dateCreated = dateCreated;
        this.department = department;
        this.externalId = externalId;
        this.frequency = frequency;
        this.idNumber = idNumber;
        this.inactive = inactive;
        this.internalId = internalId;
        this.invoiceForm = invoiceForm;
        this.lastBillCycleDate = lastBillCycleDate;
        this.lastBillDate = lastBillDate;
        this.location = location;
        this.memo = memo;
        this.name = name;
        this.nextBillCycleDate = nextBillCycleDate;
        this.startDate = startDate;
        this.subsidiary = subsidiary;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the billingSchedule value for this BillingAccountSearchRowBasic.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this BillingAccountSearchRowBasic.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillingSchedule(int i) {
        return this.billingSchedule[i];
    }

    public void setBillingSchedule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billingSchedule[i] = _value;
    }


    /**
     * Gets the cashSaleForm value for this BillingAccountSearchRowBasic.
     * 
     * @return cashSaleForm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCashSaleForm() {
        return cashSaleForm;
    }


    /**
     * Sets the cashSaleForm value for this BillingAccountSearchRowBasic.
     * 
     * @param cashSaleForm
     */
    public void setCashSaleForm(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] cashSaleForm) {
        this.cashSaleForm = cashSaleForm;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCashSaleForm(int i) {
        return this.cashSaleForm[i];
    }

    public void setCashSaleForm(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.cashSaleForm[i] = _value;
    }


    /**
     * Gets the _class value for this BillingAccountSearchRowBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this BillingAccountSearchRowBasic.
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
     * Gets the currency value for this BillingAccountSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BillingAccountSearchRowBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }


    /**
     * Gets the customer value for this BillingAccountSearchRowBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this BillingAccountSearchRowBasic.
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
     * Gets the customerDefault value for this BillingAccountSearchRowBasic.
     * 
     * @return customerDefault
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getCustomerDefault() {
        return customerDefault;
    }


    /**
     * Sets the customerDefault value for this BillingAccountSearchRowBasic.
     * 
     * @param customerDefault
     */
    public void setCustomerDefault(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] customerDefault) {
        this.customerDefault = customerDefault;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getCustomerDefault(int i) {
        return this.customerDefault[i];
    }

    public void setCustomerDefault(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.customerDefault[i] = _value;
    }


    /**
     * Gets the dateCreated value for this BillingAccountSearchRowBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this BillingAccountSearchRowBasic.
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
     * Gets the department value for this BillingAccountSearchRowBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this BillingAccountSearchRowBasic.
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
     * Gets the externalId value for this BillingAccountSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this BillingAccountSearchRowBasic.
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
     * Gets the frequency value for this BillingAccountSearchRowBasic.
     * 
     * @return frequency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this BillingAccountSearchRowBasic.
     * 
     * @param frequency
     */
    public void setFrequency(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] frequency) {
        this.frequency = frequency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getFrequency(int i) {
        return this.frequency[i];
    }

    public void setFrequency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.frequency[i] = _value;
    }


    /**
     * Gets the idNumber value for this BillingAccountSearchRowBasic.
     * 
     * @return idNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getIdNumber() {
        return idNumber;
    }


    /**
     * Sets the idNumber value for this BillingAccountSearchRowBasic.
     * 
     * @param idNumber
     */
    public void setIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] idNumber) {
        this.idNumber = idNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getIdNumber(int i) {
        return this.idNumber[i];
    }

    public void setIdNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.idNumber[i] = _value;
    }


    /**
     * Gets the inactive value for this BillingAccountSearchRowBasic.
     * 
     * @return inactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this BillingAccountSearchRowBasic.
     * 
     * @param inactive
     */
    public void setInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] inactive) {
        this.inactive = inactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getInactive(int i) {
        return this.inactive[i];
    }

    public void setInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.inactive[i] = _value;
    }


    /**
     * Gets the internalId value for this BillingAccountSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BillingAccountSearchRowBasic.
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
     * Gets the invoiceForm value for this BillingAccountSearchRowBasic.
     * 
     * @return invoiceForm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInvoiceForm() {
        return invoiceForm;
    }


    /**
     * Sets the invoiceForm value for this BillingAccountSearchRowBasic.
     * 
     * @param invoiceForm
     */
    public void setInvoiceForm(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] invoiceForm) {
        this.invoiceForm = invoiceForm;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInvoiceForm(int i) {
        return this.invoiceForm[i];
    }

    public void setInvoiceForm(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.invoiceForm[i] = _value;
    }


    /**
     * Gets the lastBillCycleDate value for this BillingAccountSearchRowBasic.
     * 
     * @return lastBillCycleDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastBillCycleDate() {
        return lastBillCycleDate;
    }


    /**
     * Sets the lastBillCycleDate value for this BillingAccountSearchRowBasic.
     * 
     * @param lastBillCycleDate
     */
    public void setLastBillCycleDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastBillCycleDate) {
        this.lastBillCycleDate = lastBillCycleDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastBillCycleDate(int i) {
        return this.lastBillCycleDate[i];
    }

    public void setLastBillCycleDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastBillCycleDate[i] = _value;
    }


    /**
     * Gets the lastBillDate value for this BillingAccountSearchRowBasic.
     * 
     * @return lastBillDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastBillDate() {
        return lastBillDate;
    }


    /**
     * Sets the lastBillDate value for this BillingAccountSearchRowBasic.
     * 
     * @param lastBillDate
     */
    public void setLastBillDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastBillDate) {
        this.lastBillDate = lastBillDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastBillDate(int i) {
        return this.lastBillDate[i];
    }

    public void setLastBillDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastBillDate[i] = _value;
    }


    /**
     * Gets the location value for this BillingAccountSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this BillingAccountSearchRowBasic.
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
     * Gets the memo value for this BillingAccountSearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this BillingAccountSearchRowBasic.
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
     * Gets the name value for this BillingAccountSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this BillingAccountSearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the nextBillCycleDate value for this BillingAccountSearchRowBasic.
     * 
     * @return nextBillCycleDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getNextBillCycleDate() {
        return nextBillCycleDate;
    }


    /**
     * Sets the nextBillCycleDate value for this BillingAccountSearchRowBasic.
     * 
     * @param nextBillCycleDate
     */
    public void setNextBillCycleDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextBillCycleDate) {
        this.nextBillCycleDate = nextBillCycleDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getNextBillCycleDate(int i) {
        return this.nextBillCycleDate[i];
    }

    public void setNextBillCycleDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.nextBillCycleDate[i] = _value;
    }


    /**
     * Gets the startDate value for this BillingAccountSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this BillingAccountSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the subsidiary value for this BillingAccountSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this BillingAccountSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the customFieldList value for this BillingAccountSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this BillingAccountSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingAccountSearchRowBasic)) return false;
        BillingAccountSearchRowBasic other = (BillingAccountSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              java.util.Arrays.equals(this.billingSchedule, other.getBillingSchedule()))) &&
            ((this.cashSaleForm==null && other.getCashSaleForm()==null) || 
             (this.cashSaleForm!=null &&
              java.util.Arrays.equals(this.cashSaleForm, other.getCashSaleForm()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.customerDefault==null && other.getCustomerDefault()==null) || 
             (this.customerDefault!=null &&
              java.util.Arrays.equals(this.customerDefault, other.getCustomerDefault()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              java.util.Arrays.equals(this.frequency, other.getFrequency()))) &&
            ((this.idNumber==null && other.getIdNumber()==null) || 
             (this.idNumber!=null &&
              java.util.Arrays.equals(this.idNumber, other.getIdNumber()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              java.util.Arrays.equals(this.inactive, other.getInactive()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.invoiceForm==null && other.getInvoiceForm()==null) || 
             (this.invoiceForm!=null &&
              java.util.Arrays.equals(this.invoiceForm, other.getInvoiceForm()))) &&
            ((this.lastBillCycleDate==null && other.getLastBillCycleDate()==null) || 
             (this.lastBillCycleDate!=null &&
              java.util.Arrays.equals(this.lastBillCycleDate, other.getLastBillCycleDate()))) &&
            ((this.lastBillDate==null && other.getLastBillDate()==null) || 
             (this.lastBillDate!=null &&
              java.util.Arrays.equals(this.lastBillDate, other.getLastBillDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.nextBillCycleDate==null && other.getNextBillCycleDate()==null) || 
             (this.nextBillCycleDate!=null &&
              java.util.Arrays.equals(this.nextBillCycleDate, other.getNextBillCycleDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
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
        if (getBillingSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCashSaleForm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCashSaleForm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCashSaleForm(), i);
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
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
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
        if (getCustomerDefault() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerDefault());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerDefault(), i);
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
        if (getFrequency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInactive(), i);
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
        if (getInvoiceForm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceForm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceForm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastBillCycleDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastBillCycleDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastBillCycleDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastBillDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastBillDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastBillDate(), i);
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextBillCycleDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextBillCycleDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextBillCycleDate(), i);
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
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingAccountSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashSaleForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cashSaleForm"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
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
        elemField.setFieldName("customerDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customerDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "idNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inactive"));
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
        elemField.setFieldName("invoiceForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "invoiceForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBillCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastBillCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastBillDate"));
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
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextBillCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
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
