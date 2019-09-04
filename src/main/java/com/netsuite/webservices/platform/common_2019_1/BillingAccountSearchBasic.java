/**
 * BillingAccountSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class BillingAccountSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField cashSaleForm;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField customerDefault;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField frequency;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField idNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField inactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField invoiceForm;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastBillCycleDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastBillDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField nextBillCycleDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public BillingAccountSearchBasic() {
    }

    public BillingAccountSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingSchedule,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField cashSaleForm,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField customerDefault,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField frequency,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField idNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField inactive,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField invoiceForm,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastBillCycleDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastBillDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField memo,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField nextBillCycleDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.billingSchedule = billingSchedule;
        this.cashSaleForm = cashSaleForm;
        this._class = _class;
        this.currency = currency;
        this.customer = customer;
        this.customerDefault = customerDefault;
        this.dateCreated = dateCreated;
        this.department = department;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.frequency = frequency;
        this.idNumber = idNumber;
        this.inactive = inactive;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
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
     * Gets the billingSchedule value for this BillingAccountSearchBasic.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this BillingAccountSearchBasic.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the cashSaleForm value for this BillingAccountSearchBasic.
     * 
     * @return cashSaleForm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCashSaleForm() {
        return cashSaleForm;
    }


    /**
     * Sets the cashSaleForm value for this BillingAccountSearchBasic.
     * 
     * @param cashSaleForm
     */
    public void setCashSaleForm(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField cashSaleForm) {
        this.cashSaleForm = cashSaleForm;
    }


    /**
     * Gets the _class value for this BillingAccountSearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this BillingAccountSearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the currency value for this BillingAccountSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BillingAccountSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the customer value for this BillingAccountSearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this BillingAccountSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer) {
        this.customer = customer;
    }


    /**
     * Gets the customerDefault value for this BillingAccountSearchBasic.
     * 
     * @return customerDefault
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getCustomerDefault() {
        return customerDefault;
    }


    /**
     * Sets the customerDefault value for this BillingAccountSearchBasic.
     * 
     * @param customerDefault
     */
    public void setCustomerDefault(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField customerDefault) {
        this.customerDefault = customerDefault;
    }


    /**
     * Gets the dateCreated value for this BillingAccountSearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this BillingAccountSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the department value for this BillingAccountSearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this BillingAccountSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the externalId value for this BillingAccountSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this BillingAccountSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this BillingAccountSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this BillingAccountSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the frequency value for this BillingAccountSearchBasic.
     * 
     * @return frequency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this BillingAccountSearchBasic.
     * 
     * @param frequency
     */
    public void setFrequency(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the idNumber value for this BillingAccountSearchBasic.
     * 
     * @return idNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getIdNumber() {
        return idNumber;
    }


    /**
     * Sets the idNumber value for this BillingAccountSearchBasic.
     * 
     * @param idNumber
     */
    public void setIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField idNumber) {
        this.idNumber = idNumber;
    }


    /**
     * Gets the inactive value for this BillingAccountSearchBasic.
     * 
     * @return inactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this BillingAccountSearchBasic.
     * 
     * @param inactive
     */
    public void setInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField inactive) {
        this.inactive = inactive;
    }


    /**
     * Gets the internalId value for this BillingAccountSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BillingAccountSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this BillingAccountSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this BillingAccountSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the invoiceForm value for this BillingAccountSearchBasic.
     * 
     * @return invoiceForm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInvoiceForm() {
        return invoiceForm;
    }


    /**
     * Sets the invoiceForm value for this BillingAccountSearchBasic.
     * 
     * @param invoiceForm
     */
    public void setInvoiceForm(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField invoiceForm) {
        this.invoiceForm = invoiceForm;
    }


    /**
     * Gets the lastBillCycleDate value for this BillingAccountSearchBasic.
     * 
     * @return lastBillCycleDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastBillCycleDate() {
        return lastBillCycleDate;
    }


    /**
     * Sets the lastBillCycleDate value for this BillingAccountSearchBasic.
     * 
     * @param lastBillCycleDate
     */
    public void setLastBillCycleDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastBillCycleDate) {
        this.lastBillCycleDate = lastBillCycleDate;
    }


    /**
     * Gets the lastBillDate value for this BillingAccountSearchBasic.
     * 
     * @return lastBillDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastBillDate() {
        return lastBillDate;
    }


    /**
     * Sets the lastBillDate value for this BillingAccountSearchBasic.
     * 
     * @param lastBillDate
     */
    public void setLastBillDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastBillDate) {
        this.lastBillDate = lastBillDate;
    }


    /**
     * Gets the location value for this BillingAccountSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this BillingAccountSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this BillingAccountSearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this BillingAccountSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the name value for this BillingAccountSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this BillingAccountSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the nextBillCycleDate value for this BillingAccountSearchBasic.
     * 
     * @return nextBillCycleDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getNextBillCycleDate() {
        return nextBillCycleDate;
    }


    /**
     * Sets the nextBillCycleDate value for this BillingAccountSearchBasic.
     * 
     * @param nextBillCycleDate
     */
    public void setNextBillCycleDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField nextBillCycleDate) {
        this.nextBillCycleDate = nextBillCycleDate;
    }


    /**
     * Gets the startDate value for this BillingAccountSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this BillingAccountSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the subsidiary value for this BillingAccountSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this BillingAccountSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the customFieldList value for this BillingAccountSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this BillingAccountSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingAccountSearchBasic)) return false;
        BillingAccountSearchBasic other = (BillingAccountSearchBasic) obj;
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
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.cashSaleForm==null && other.getCashSaleForm()==null) || 
             (this.cashSaleForm!=null &&
              this.cashSaleForm.equals(other.getCashSaleForm()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.customerDefault==null && other.getCustomerDefault()==null) || 
             (this.customerDefault!=null &&
              this.customerDefault.equals(other.getCustomerDefault()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.idNumber==null && other.getIdNumber()==null) || 
             (this.idNumber!=null &&
              this.idNumber.equals(other.getIdNumber()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              this.inactive.equals(other.getInactive()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.invoiceForm==null && other.getInvoiceForm()==null) || 
             (this.invoiceForm!=null &&
              this.invoiceForm.equals(other.getInvoiceForm()))) &&
            ((this.lastBillCycleDate==null && other.getLastBillCycleDate()==null) || 
             (this.lastBillCycleDate!=null &&
              this.lastBillCycleDate.equals(other.getLastBillCycleDate()))) &&
            ((this.lastBillDate==null && other.getLastBillDate()==null) || 
             (this.lastBillDate!=null &&
              this.lastBillDate.equals(other.getLastBillDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nextBillCycleDate==null && other.getNextBillCycleDate()==null) || 
             (this.nextBillCycleDate!=null &&
              this.nextBillCycleDate.equals(other.getNextBillCycleDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
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
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getCashSaleForm() != null) {
            _hashCode += getCashSaleForm().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCustomerDefault() != null) {
            _hashCode += getCustomerDefault().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getIdNumber() != null) {
            _hashCode += getIdNumber().hashCode();
        }
        if (getInactive() != null) {
            _hashCode += getInactive().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getInvoiceForm() != null) {
            _hashCode += getInvoiceForm().hashCode();
        }
        if (getLastBillCycleDate() != null) {
            _hashCode += getLastBillCycleDate().hashCode();
        }
        if (getLastBillDate() != null) {
            _hashCode += getLastBillDate().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNextBillCycleDate() != null) {
            _hashCode += getNextBillCycleDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingAccountSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingAccountSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashSaleForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cashSaleForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
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
        elemField.setFieldName("customerDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customerDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "idNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inactive"));
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
        elemField.setFieldName("invoiceForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "invoiceForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBillCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastBillCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastBillDate"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextBillCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
