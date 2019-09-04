/**
 * BillingAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class BillingAccount  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String idNumber;

    private java.lang.Boolean customerDefault;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private java.lang.String name;

    private java.lang.Boolean inactive;

    private java.lang.String memo;

    private java.util.Calendar createdDate;

    private java.lang.String createdBy;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule;

    private com.netsuite.webservices.lists.relationships_2019_1.types.BillingAccountFrequency frequency;

    private java.util.Calendar startDate;

    private java.util.Calendar lastBillDate;

    private java.util.Calendar lastBillCycleDate;

    private java.util.Calendar nextBillCycleDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef invoiceForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef cashSaleForm;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public BillingAccount() {
    }

    public BillingAccount(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String idNumber,
           java.lang.Boolean customerDefault,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           java.lang.String name,
           java.lang.Boolean inactive,
           java.lang.String memo,
           java.util.Calendar createdDate,
           java.lang.String createdBy,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule,
           com.netsuite.webservices.lists.relationships_2019_1.types.BillingAccountFrequency frequency,
           java.util.Calendar startDate,
           java.util.Calendar lastBillDate,
           java.util.Calendar lastBillCycleDate,
           java.util.Calendar nextBillCycleDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef invoiceForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef cashSaleForm,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.idNumber = idNumber;
        this.customerDefault = customerDefault;
        this.customer = customer;
        this.subsidiary = subsidiary;
        this.name = name;
        this.inactive = inactive;
        this.memo = memo;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.currency = currency;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.billingSchedule = billingSchedule;
        this.frequency = frequency;
        this.startDate = startDate;
        this.lastBillDate = lastBillDate;
        this.lastBillCycleDate = lastBillCycleDate;
        this.nextBillCycleDate = nextBillCycleDate;
        this.invoiceForm = invoiceForm;
        this.cashSaleForm = cashSaleForm;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this BillingAccount.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this BillingAccount.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the idNumber value for this BillingAccount.
     * 
     * @return idNumber
     */
    public java.lang.String getIdNumber() {
        return idNumber;
    }


    /**
     * Sets the idNumber value for this BillingAccount.
     * 
     * @param idNumber
     */
    public void setIdNumber(java.lang.String idNumber) {
        this.idNumber = idNumber;
    }


    /**
     * Gets the customerDefault value for this BillingAccount.
     * 
     * @return customerDefault
     */
    public java.lang.Boolean getCustomerDefault() {
        return customerDefault;
    }


    /**
     * Sets the customerDefault value for this BillingAccount.
     * 
     * @param customerDefault
     */
    public void setCustomerDefault(java.lang.Boolean customerDefault) {
        this.customerDefault = customerDefault;
    }


    /**
     * Gets the customer value for this BillingAccount.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this BillingAccount.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the subsidiary value for this BillingAccount.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this BillingAccount.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the name value for this BillingAccount.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BillingAccount.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the inactive value for this BillingAccount.
     * 
     * @return inactive
     */
    public java.lang.Boolean getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this BillingAccount.
     * 
     * @param inactive
     */
    public void setInactive(java.lang.Boolean inactive) {
        this.inactive = inactive;
    }


    /**
     * Gets the memo value for this BillingAccount.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this BillingAccount.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the createdDate value for this BillingAccount.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this BillingAccount.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdBy value for this BillingAccount.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this BillingAccount.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the currency value for this BillingAccount.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BillingAccount.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the _class value for this BillingAccount.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this BillingAccount.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the department value for this BillingAccount.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this BillingAccount.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this BillingAccount.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this BillingAccount.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the billingSchedule value for this BillingAccount.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this BillingAccount.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the frequency value for this BillingAccount.
     * 
     * @return frequency
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.BillingAccountFrequency getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this BillingAccount.
     * 
     * @param frequency
     */
    public void setFrequency(com.netsuite.webservices.lists.relationships_2019_1.types.BillingAccountFrequency frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the startDate value for this BillingAccount.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this BillingAccount.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the lastBillDate value for this BillingAccount.
     * 
     * @return lastBillDate
     */
    public java.util.Calendar getLastBillDate() {
        return lastBillDate;
    }


    /**
     * Sets the lastBillDate value for this BillingAccount.
     * 
     * @param lastBillDate
     */
    public void setLastBillDate(java.util.Calendar lastBillDate) {
        this.lastBillDate = lastBillDate;
    }


    /**
     * Gets the lastBillCycleDate value for this BillingAccount.
     * 
     * @return lastBillCycleDate
     */
    public java.util.Calendar getLastBillCycleDate() {
        return lastBillCycleDate;
    }


    /**
     * Sets the lastBillCycleDate value for this BillingAccount.
     * 
     * @param lastBillCycleDate
     */
    public void setLastBillCycleDate(java.util.Calendar lastBillCycleDate) {
        this.lastBillCycleDate = lastBillCycleDate;
    }


    /**
     * Gets the nextBillCycleDate value for this BillingAccount.
     * 
     * @return nextBillCycleDate
     */
    public java.util.Calendar getNextBillCycleDate() {
        return nextBillCycleDate;
    }


    /**
     * Sets the nextBillCycleDate value for this BillingAccount.
     * 
     * @param nextBillCycleDate
     */
    public void setNextBillCycleDate(java.util.Calendar nextBillCycleDate) {
        this.nextBillCycleDate = nextBillCycleDate;
    }


    /**
     * Gets the invoiceForm value for this BillingAccount.
     * 
     * @return invoiceForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInvoiceForm() {
        return invoiceForm;
    }


    /**
     * Sets the invoiceForm value for this BillingAccount.
     * 
     * @param invoiceForm
     */
    public void setInvoiceForm(com.netsuite.webservices.platform.core_2019_1.RecordRef invoiceForm) {
        this.invoiceForm = invoiceForm;
    }


    /**
     * Gets the cashSaleForm value for this BillingAccount.
     * 
     * @return cashSaleForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCashSaleForm() {
        return cashSaleForm;
    }


    /**
     * Sets the cashSaleForm value for this BillingAccount.
     * 
     * @param cashSaleForm
     */
    public void setCashSaleForm(com.netsuite.webservices.platform.core_2019_1.RecordRef cashSaleForm) {
        this.cashSaleForm = cashSaleForm;
    }


    /**
     * Gets the customFieldList value for this BillingAccount.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this BillingAccount.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this BillingAccount.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BillingAccount.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this BillingAccount.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this BillingAccount.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingAccount)) return false;
        BillingAccount other = (BillingAccount) obj;
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
            ((this.idNumber==null && other.getIdNumber()==null) || 
             (this.idNumber!=null &&
              this.idNumber.equals(other.getIdNumber()))) &&
            ((this.customerDefault==null && other.getCustomerDefault()==null) || 
             (this.customerDefault!=null &&
              this.customerDefault.equals(other.getCustomerDefault()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              this.inactive.equals(other.getInactive()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.lastBillDate==null && other.getLastBillDate()==null) || 
             (this.lastBillDate!=null &&
              this.lastBillDate.equals(other.getLastBillDate()))) &&
            ((this.lastBillCycleDate==null && other.getLastBillCycleDate()==null) || 
             (this.lastBillCycleDate!=null &&
              this.lastBillCycleDate.equals(other.getLastBillCycleDate()))) &&
            ((this.nextBillCycleDate==null && other.getNextBillCycleDate()==null) || 
             (this.nextBillCycleDate!=null &&
              this.nextBillCycleDate.equals(other.getNextBillCycleDate()))) &&
            ((this.invoiceForm==null && other.getInvoiceForm()==null) || 
             (this.invoiceForm!=null &&
              this.invoiceForm.equals(other.getInvoiceForm()))) &&
            ((this.cashSaleForm==null && other.getCashSaleForm()==null) || 
             (this.cashSaleForm!=null &&
              this.cashSaleForm.equals(other.getCashSaleForm()))) &&
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
        if (getIdNumber() != null) {
            _hashCode += getIdNumber().hashCode();
        }
        if (getCustomerDefault() != null) {
            _hashCode += getCustomerDefault().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getInactive() != null) {
            _hashCode += getInactive().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getLastBillDate() != null) {
            _hashCode += getLastBillDate().hashCode();
        }
        if (getLastBillCycleDate() != null) {
            _hashCode += getLastBillCycleDate().hashCode();
        }
        if (getNextBillCycleDate() != null) {
            _hashCode += getNextBillCycleDate().hashCode();
        }
        if (getInvoiceForm() != null) {
            _hashCode += getInvoiceForm().hashCode();
        }
        if (getCashSaleForm() != null) {
            _hashCode += getCashSaleForm().hashCode();
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
        new org.apache.axis.description.TypeDesc(BillingAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "BillingAccount"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "idNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customerDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "inactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "BillingAccountFrequency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastBillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBillCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastBillCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "nextBillCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "invoiceForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashSaleForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "cashSaleForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customFieldList"));
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
