/**
 * PaycheckJournal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckJournal  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.Double exchangeRate;

    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef employee;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef account;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalCompanyContributionList companyContributionList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeductionList deductionList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEmployeeTaxList employeeTaxList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalCompanyTaxList companyTaxList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarningList earningList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public PaycheckJournal() {
    }

    public PaycheckJournal(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.Double exchangeRate,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef employee,
           java.util.Calendar tranDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef account,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalCompanyContributionList companyContributionList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeductionList deductionList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEmployeeTaxList employeeTaxList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalCompanyTaxList companyTaxList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarningList earningList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.subsidiary = subsidiary;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.tranId = tranId;
        this.employee = employee;
        this.tranDate = tranDate;
        this.postingPeriod = postingPeriod;
        this.account = account;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.companyContributionList = companyContributionList;
        this.deductionList = deductionList;
        this.employeeTaxList = employeeTaxList;
        this.companyTaxList = companyTaxList;
        this.earningList = earningList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the subsidiary value for this PaycheckJournal.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PaycheckJournal.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the currency value for this PaycheckJournal.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PaycheckJournal.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the exchangeRate value for this PaycheckJournal.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this PaycheckJournal.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the createdDate value for this PaycheckJournal.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this PaycheckJournal.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this PaycheckJournal.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PaycheckJournal.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this PaycheckJournal.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this PaycheckJournal.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the tranId value for this PaycheckJournal.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this PaycheckJournal.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the employee value for this PaycheckJournal.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this PaycheckJournal.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.RecordRef employee) {
        this.employee = employee;
    }


    /**
     * Gets the tranDate value for this PaycheckJournal.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this PaycheckJournal.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the postingPeriod value for this PaycheckJournal.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this PaycheckJournal.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the account value for this PaycheckJournal.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PaycheckJournal.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the department value for this PaycheckJournal.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PaycheckJournal.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this PaycheckJournal.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PaycheckJournal.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this PaycheckJournal.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PaycheckJournal.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the companyContributionList value for this PaycheckJournal.
     * 
     * @return companyContributionList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalCompanyContributionList getCompanyContributionList() {
        return companyContributionList;
    }


    /**
     * Sets the companyContributionList value for this PaycheckJournal.
     * 
     * @param companyContributionList
     */
    public void setCompanyContributionList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalCompanyContributionList companyContributionList) {
        this.companyContributionList = companyContributionList;
    }


    /**
     * Gets the deductionList value for this PaycheckJournal.
     * 
     * @return deductionList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeductionList getDeductionList() {
        return deductionList;
    }


    /**
     * Sets the deductionList value for this PaycheckJournal.
     * 
     * @param deductionList
     */
    public void setDeductionList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalDeductionList deductionList) {
        this.deductionList = deductionList;
    }


    /**
     * Gets the employeeTaxList value for this PaycheckJournal.
     * 
     * @return employeeTaxList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEmployeeTaxList getEmployeeTaxList() {
        return employeeTaxList;
    }


    /**
     * Sets the employeeTaxList value for this PaycheckJournal.
     * 
     * @param employeeTaxList
     */
    public void setEmployeeTaxList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEmployeeTaxList employeeTaxList) {
        this.employeeTaxList = employeeTaxList;
    }


    /**
     * Gets the companyTaxList value for this PaycheckJournal.
     * 
     * @return companyTaxList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalCompanyTaxList getCompanyTaxList() {
        return companyTaxList;
    }


    /**
     * Sets the companyTaxList value for this PaycheckJournal.
     * 
     * @param companyTaxList
     */
    public void setCompanyTaxList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalCompanyTaxList companyTaxList) {
        this.companyTaxList = companyTaxList;
    }


    /**
     * Gets the earningList value for this PaycheckJournal.
     * 
     * @return earningList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarningList getEarningList() {
        return earningList;
    }


    /**
     * Sets the earningList value for this PaycheckJournal.
     * 
     * @param earningList
     */
    public void setEarningList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckJournalEarningList earningList) {
        this.earningList = earningList;
    }


    /**
     * Gets the customFieldList value for this PaycheckJournal.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this PaycheckJournal.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this PaycheckJournal.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaycheckJournal.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this PaycheckJournal.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PaycheckJournal.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckJournal)) return false;
        PaycheckJournal other = (PaycheckJournal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.companyContributionList==null && other.getCompanyContributionList()==null) || 
             (this.companyContributionList!=null &&
              this.companyContributionList.equals(other.getCompanyContributionList()))) &&
            ((this.deductionList==null && other.getDeductionList()==null) || 
             (this.deductionList!=null &&
              this.deductionList.equals(other.getDeductionList()))) &&
            ((this.employeeTaxList==null && other.getEmployeeTaxList()==null) || 
             (this.employeeTaxList!=null &&
              this.employeeTaxList.equals(other.getEmployeeTaxList()))) &&
            ((this.companyTaxList==null && other.getCompanyTaxList()==null) || 
             (this.companyTaxList!=null &&
              this.companyTaxList.equals(other.getCompanyTaxList()))) &&
            ((this.earningList==null && other.getEarningList()==null) || 
             (this.earningList!=null &&
              this.earningList.equals(other.getEarningList()))) &&
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
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
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
        if (getCompanyContributionList() != null) {
            _hashCode += getCompanyContributionList().hashCode();
        }
        if (getDeductionList() != null) {
            _hashCode += getDeductionList().hashCode();
        }
        if (getEmployeeTaxList() != null) {
            _hashCode += getEmployeeTaxList().hashCode();
        }
        if (getCompanyTaxList() != null) {
            _hashCode += getCompanyTaxList().hashCode();
        }
        if (getEarningList() != null) {
            _hashCode += getEarningList().hashCode();
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
        new org.apache.axis.description.TypeDesc(PaycheckJournal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournal"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "account"));
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
        elemField.setFieldName("companyContributionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "companyContributionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournalCompanyContributionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "deductionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournalDeductionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeTaxList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "employeeTaxList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournalEmployeeTaxList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyTaxList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "companyTaxList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournalCompanyTaxList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earningList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "earningList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckJournalEarningList"));
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
