/**
 * Paycheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class Paycheck  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String batchNumber;

    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String status;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private java.lang.String address;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef workplace;

    private java.lang.String tranId;

    private java.lang.Double userAmount;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef account;

    private java.lang.String payFrequency;

    private java.lang.Double balance;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private java.util.Calendar periodEnding;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayEarnList payEarnList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayTimeList payTimeList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayExpList payExpList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayPtoList payPtoList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeductList payDeductList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContribList payContribList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayTaxList payTaxList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummaryList paySummaryList;

    private com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDisburseList payDisburseList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Paycheck() {
    }

    public Paycheck(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String batchNumber,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           java.lang.String status,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           java.lang.String address,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef workplace,
           java.lang.String tranId,
           java.lang.Double userAmount,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef account,
           java.lang.String payFrequency,
           java.lang.Double balance,
           java.util.Calendar tranDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           java.util.Calendar periodEnding,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayEarnList payEarnList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayTimeList payTimeList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayExpList payExpList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayPtoList payPtoList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeductList payDeductList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContribList payContribList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayTaxList payTaxList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummaryList paySummaryList,
           com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDisburseList payDisburseList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.batchNumber = batchNumber;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.status = status;
        this.entity = entity;
        this.address = address;
        this.department = department;
        this.location = location;
        this._class = _class;
        this.workplace = workplace;
        this.tranId = tranId;
        this.userAmount = userAmount;
        this.memo = memo;
        this.account = account;
        this.payFrequency = payFrequency;
        this.balance = balance;
        this.tranDate = tranDate;
        this.postingPeriod = postingPeriod;
        this.periodEnding = periodEnding;
        this.payEarnList = payEarnList;
        this.payTimeList = payTimeList;
        this.payExpList = payExpList;
        this.payPtoList = payPtoList;
        this.payDeductList = payDeductList;
        this.payContribList = payContribList;
        this.payTaxList = payTaxList;
        this.paySummaryList = paySummaryList;
        this.payDisburseList = payDisburseList;
    }


    /**
     * Gets the batchNumber value for this Paycheck.
     * 
     * @return batchNumber
     */
    public java.lang.String getBatchNumber() {
        return batchNumber;
    }


    /**
     * Sets the batchNumber value for this Paycheck.
     * 
     * @param batchNumber
     */
    public void setBatchNumber(java.lang.String batchNumber) {
        this.batchNumber = batchNumber;
    }


    /**
     * Gets the createdDate value for this Paycheck.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Paycheck.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this Paycheck.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Paycheck.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the status value for this Paycheck.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Paycheck.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the entity value for this Paycheck.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this Paycheck.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the address value for this Paycheck.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Paycheck.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the department value for this Paycheck.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Paycheck.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this Paycheck.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Paycheck.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the _class value for this Paycheck.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Paycheck.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the workplace value for this Paycheck.
     * 
     * @return workplace
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getWorkplace() {
        return workplace;
    }


    /**
     * Sets the workplace value for this Paycheck.
     * 
     * @param workplace
     */
    public void setWorkplace(com.netsuite.webservices.platform.core_2019_1.RecordRef workplace) {
        this.workplace = workplace;
    }


    /**
     * Gets the tranId value for this Paycheck.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this Paycheck.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the userAmount value for this Paycheck.
     * 
     * @return userAmount
     */
    public java.lang.Double getUserAmount() {
        return userAmount;
    }


    /**
     * Sets the userAmount value for this Paycheck.
     * 
     * @param userAmount
     */
    public void setUserAmount(java.lang.Double userAmount) {
        this.userAmount = userAmount;
    }


    /**
     * Gets the memo value for this Paycheck.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this Paycheck.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the account value for this Paycheck.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Paycheck.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the payFrequency value for this Paycheck.
     * 
     * @return payFrequency
     */
    public java.lang.String getPayFrequency() {
        return payFrequency;
    }


    /**
     * Sets the payFrequency value for this Paycheck.
     * 
     * @param payFrequency
     */
    public void setPayFrequency(java.lang.String payFrequency) {
        this.payFrequency = payFrequency;
    }


    /**
     * Gets the balance value for this Paycheck.
     * 
     * @return balance
     */
    public java.lang.Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Paycheck.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the tranDate value for this Paycheck.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this Paycheck.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the postingPeriod value for this Paycheck.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this Paycheck.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the periodEnding value for this Paycheck.
     * 
     * @return periodEnding
     */
    public java.util.Calendar getPeriodEnding() {
        return periodEnding;
    }


    /**
     * Sets the periodEnding value for this Paycheck.
     * 
     * @param periodEnding
     */
    public void setPeriodEnding(java.util.Calendar periodEnding) {
        this.periodEnding = periodEnding;
    }


    /**
     * Gets the payEarnList value for this Paycheck.
     * 
     * @return payEarnList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayEarnList getPayEarnList() {
        return payEarnList;
    }


    /**
     * Sets the payEarnList value for this Paycheck.
     * 
     * @param payEarnList
     */
    public void setPayEarnList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayEarnList payEarnList) {
        this.payEarnList = payEarnList;
    }


    /**
     * Gets the payTimeList value for this Paycheck.
     * 
     * @return payTimeList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayTimeList getPayTimeList() {
        return payTimeList;
    }


    /**
     * Sets the payTimeList value for this Paycheck.
     * 
     * @param payTimeList
     */
    public void setPayTimeList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayTimeList payTimeList) {
        this.payTimeList = payTimeList;
    }


    /**
     * Gets the payExpList value for this Paycheck.
     * 
     * @return payExpList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayExpList getPayExpList() {
        return payExpList;
    }


    /**
     * Sets the payExpList value for this Paycheck.
     * 
     * @param payExpList
     */
    public void setPayExpList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayExpList payExpList) {
        this.payExpList = payExpList;
    }


    /**
     * Gets the payPtoList value for this Paycheck.
     * 
     * @return payPtoList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayPtoList getPayPtoList() {
        return payPtoList;
    }


    /**
     * Sets the payPtoList value for this Paycheck.
     * 
     * @param payPtoList
     */
    public void setPayPtoList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayPtoList payPtoList) {
        this.payPtoList = payPtoList;
    }


    /**
     * Gets the payDeductList value for this Paycheck.
     * 
     * @return payDeductList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeductList getPayDeductList() {
        return payDeductList;
    }


    /**
     * Sets the payDeductList value for this Paycheck.
     * 
     * @param payDeductList
     */
    public void setPayDeductList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDeductList payDeductList) {
        this.payDeductList = payDeductList;
    }


    /**
     * Gets the payContribList value for this Paycheck.
     * 
     * @return payContribList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContribList getPayContribList() {
        return payContribList;
    }


    /**
     * Sets the payContribList value for this Paycheck.
     * 
     * @param payContribList
     */
    public void setPayContribList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayContribList payContribList) {
        this.payContribList = payContribList;
    }


    /**
     * Gets the payTaxList value for this Paycheck.
     * 
     * @return payTaxList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayTaxList getPayTaxList() {
        return payTaxList;
    }


    /**
     * Sets the payTaxList value for this Paycheck.
     * 
     * @param payTaxList
     */
    public void setPayTaxList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayTaxList payTaxList) {
        this.payTaxList = payTaxList;
    }


    /**
     * Gets the paySummaryList value for this Paycheck.
     * 
     * @return paySummaryList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummaryList getPaySummaryList() {
        return paySummaryList;
    }


    /**
     * Sets the paySummaryList value for this Paycheck.
     * 
     * @param paySummaryList
     */
    public void setPaySummaryList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPaySummaryList paySummaryList) {
        this.paySummaryList = paySummaryList;
    }


    /**
     * Gets the payDisburseList value for this Paycheck.
     * 
     * @return payDisburseList
     */
    public com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDisburseList getPayDisburseList() {
        return payDisburseList;
    }


    /**
     * Sets the payDisburseList value for this Paycheck.
     * 
     * @param payDisburseList
     */
    public void setPayDisburseList(com.netsuite.webservices.transactions.employees_2019_1.PaycheckPayDisburseList payDisburseList) {
        this.payDisburseList = payDisburseList;
    }


    /**
     * Gets the internalId value for this Paycheck.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Paycheck.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Paycheck.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Paycheck.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paycheck)) return false;
        Paycheck other = (Paycheck) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.batchNumber==null && other.getBatchNumber()==null) || 
             (this.batchNumber!=null &&
              this.batchNumber.equals(other.getBatchNumber()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.workplace==null && other.getWorkplace()==null) || 
             (this.workplace!=null &&
              this.workplace.equals(other.getWorkplace()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.userAmount==null && other.getUserAmount()==null) || 
             (this.userAmount!=null &&
              this.userAmount.equals(other.getUserAmount()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.payFrequency==null && other.getPayFrequency()==null) || 
             (this.payFrequency!=null &&
              this.payFrequency.equals(other.getPayFrequency()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.periodEnding==null && other.getPeriodEnding()==null) || 
             (this.periodEnding!=null &&
              this.periodEnding.equals(other.getPeriodEnding()))) &&
            ((this.payEarnList==null && other.getPayEarnList()==null) || 
             (this.payEarnList!=null &&
              this.payEarnList.equals(other.getPayEarnList()))) &&
            ((this.payTimeList==null && other.getPayTimeList()==null) || 
             (this.payTimeList!=null &&
              this.payTimeList.equals(other.getPayTimeList()))) &&
            ((this.payExpList==null && other.getPayExpList()==null) || 
             (this.payExpList!=null &&
              this.payExpList.equals(other.getPayExpList()))) &&
            ((this.payPtoList==null && other.getPayPtoList()==null) || 
             (this.payPtoList!=null &&
              this.payPtoList.equals(other.getPayPtoList()))) &&
            ((this.payDeductList==null && other.getPayDeductList()==null) || 
             (this.payDeductList!=null &&
              this.payDeductList.equals(other.getPayDeductList()))) &&
            ((this.payContribList==null && other.getPayContribList()==null) || 
             (this.payContribList!=null &&
              this.payContribList.equals(other.getPayContribList()))) &&
            ((this.payTaxList==null && other.getPayTaxList()==null) || 
             (this.payTaxList!=null &&
              this.payTaxList.equals(other.getPayTaxList()))) &&
            ((this.paySummaryList==null && other.getPaySummaryList()==null) || 
             (this.paySummaryList!=null &&
              this.paySummaryList.equals(other.getPaySummaryList()))) &&
            ((this.payDisburseList==null && other.getPayDisburseList()==null) || 
             (this.payDisburseList!=null &&
              this.payDisburseList.equals(other.getPayDisburseList()))) &&
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
        if (getBatchNumber() != null) {
            _hashCode += getBatchNumber().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getWorkplace() != null) {
            _hashCode += getWorkplace().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getUserAmount() != null) {
            _hashCode += getUserAmount().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getPayFrequency() != null) {
            _hashCode += getPayFrequency().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getPeriodEnding() != null) {
            _hashCode += getPeriodEnding().hashCode();
        }
        if (getPayEarnList() != null) {
            _hashCode += getPayEarnList().hashCode();
        }
        if (getPayTimeList() != null) {
            _hashCode += getPayTimeList().hashCode();
        }
        if (getPayExpList() != null) {
            _hashCode += getPayExpList().hashCode();
        }
        if (getPayPtoList() != null) {
            _hashCode += getPayPtoList().hashCode();
        }
        if (getPayDeductList() != null) {
            _hashCode += getPayDeductList().hashCode();
        }
        if (getPayContribList() != null) {
            _hashCode += getPayContribList().hashCode();
        }
        if (getPayTaxList() != null) {
            _hashCode += getPayTaxList().hashCode();
        }
        if (getPaySummaryList() != null) {
            _hashCode += getPaySummaryList().hashCode();
        }
        if (getPayDisburseList() != null) {
            _hashCode += getPayDisburseList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Paycheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "Paycheck"));
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
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "batchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "location"));
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
        elemField.setFieldName("workplace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "workplace"));
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
        elemField.setFieldName("userAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "userAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("periodEnding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "periodEnding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payEarnList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payEarnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayEarnList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTimeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payTimeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayTimeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payExpList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payExpList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayExpList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPtoList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payPtoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayPtoList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payDeductList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payDeductList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayDeductList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payContribList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payContribList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayContribList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTaxList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payTaxList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayTaxList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySummaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "paySummaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPaySummaryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payDisburseList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payDisburseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayDisburseList"));
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
