/**
 * InterCompanyJournalEntryLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.general_2019_1;

public class InterCompanyJournalEntryLine  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef lineSubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef account;

    private java.lang.Long line;

    private java.lang.Double debit;

    private java.lang.Double credit;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode;

    private java.lang.String memo;

    private java.lang.Double taxRate1;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private java.lang.Double grossAmt;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef schedule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private java.util.Calendar startDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private java.util.Calendar endDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revenueRecognitionRule;

    private java.lang.Boolean eliminate;

    private java.lang.String residual;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationSched;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef scheduleNum;

    private java.util.Calendar amortizStartDate;

    private java.util.Calendar amortizationEndDate;

    private java.lang.String amortizationResidual;

    private java.lang.Double tax1Amt;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef tax1Acct;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    public InterCompanyJournalEntryLine() {
    }

    public InterCompanyJournalEntryLine(
           com.netsuite.webservices.platform.core_2019_1.RecordRef lineSubsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef account,
           java.lang.Long line,
           java.lang.Double debit,
           java.lang.Double credit,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode,
           java.lang.String memo,
           java.lang.Double taxRate1,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           java.lang.Double grossAmt,
           com.netsuite.webservices.platform.core_2019_1.RecordRef schedule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           java.util.Calendar startDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           java.util.Calendar endDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revenueRecognitionRule,
           java.lang.Boolean eliminate,
           java.lang.String residual,
           com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationSched,
           com.netsuite.webservices.platform.core_2019_1.RecordRef scheduleNum,
           java.util.Calendar amortizStartDate,
           java.util.Calendar amortizationEndDate,
           java.lang.String amortizationResidual,
           java.lang.Double tax1Amt,
           com.netsuite.webservices.platform.core_2019_1.RecordRef tax1Acct,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
           this.lineSubsidiary = lineSubsidiary;
           this.account = account;
           this.line = line;
           this.debit = debit;
           this.credit = credit;
           this.taxCode = taxCode;
           this.memo = memo;
           this.taxRate1 = taxRate1;
           this.entity = entity;
           this.grossAmt = grossAmt;
           this.schedule = schedule;
           this.department = department;
           this.startDate = startDate;
           this._class = _class;
           this.endDate = endDate;
           this.location = location;
           this.revenueRecognitionRule = revenueRecognitionRule;
           this.eliminate = eliminate;
           this.residual = residual;
           this.amortizationSched = amortizationSched;
           this.scheduleNum = scheduleNum;
           this.amortizStartDate = amortizStartDate;
           this.amortizationEndDate = amortizationEndDate;
           this.amortizationResidual = amortizationResidual;
           this.tax1Amt = tax1Amt;
           this.tax1Acct = tax1Acct;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the lineSubsidiary value for this InterCompanyJournalEntryLine.
     * 
     * @return lineSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLineSubsidiary() {
        return lineSubsidiary;
    }


    /**
     * Sets the lineSubsidiary value for this InterCompanyJournalEntryLine.
     * 
     * @param lineSubsidiary
     */
    public void setLineSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef lineSubsidiary) {
        this.lineSubsidiary = lineSubsidiary;
    }


    /**
     * Gets the account value for this InterCompanyJournalEntryLine.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this InterCompanyJournalEntryLine.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the line value for this InterCompanyJournalEntryLine.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this InterCompanyJournalEntryLine.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the debit value for this InterCompanyJournalEntryLine.
     * 
     * @return debit
     */
    public java.lang.Double getDebit() {
        return debit;
    }


    /**
     * Sets the debit value for this InterCompanyJournalEntryLine.
     * 
     * @param debit
     */
    public void setDebit(java.lang.Double debit) {
        this.debit = debit;
    }


    /**
     * Gets the credit value for this InterCompanyJournalEntryLine.
     * 
     * @return credit
     */
    public java.lang.Double getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this InterCompanyJournalEntryLine.
     * 
     * @param credit
     */
    public void setCredit(java.lang.Double credit) {
        this.credit = credit;
    }


    /**
     * Gets the taxCode value for this InterCompanyJournalEntryLine.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this InterCompanyJournalEntryLine.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the memo value for this InterCompanyJournalEntryLine.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this InterCompanyJournalEntryLine.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the taxRate1 value for this InterCompanyJournalEntryLine.
     * 
     * @return taxRate1
     */
    public java.lang.Double getTaxRate1() {
        return taxRate1;
    }


    /**
     * Sets the taxRate1 value for this InterCompanyJournalEntryLine.
     * 
     * @param taxRate1
     */
    public void setTaxRate1(java.lang.Double taxRate1) {
        this.taxRate1 = taxRate1;
    }


    /**
     * Gets the entity value for this InterCompanyJournalEntryLine.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this InterCompanyJournalEntryLine.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the grossAmt value for this InterCompanyJournalEntryLine.
     * 
     * @return grossAmt
     */
    public java.lang.Double getGrossAmt() {
        return grossAmt;
    }


    /**
     * Sets the grossAmt value for this InterCompanyJournalEntryLine.
     * 
     * @param grossAmt
     */
    public void setGrossAmt(java.lang.Double grossAmt) {
        this.grossAmt = grossAmt;
    }


    /**
     * Gets the schedule value for this InterCompanyJournalEntryLine.
     * 
     * @return schedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this InterCompanyJournalEntryLine.
     * 
     * @param schedule
     */
    public void setSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef schedule) {
        this.schedule = schedule;
    }


    /**
     * Gets the department value for this InterCompanyJournalEntryLine.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this InterCompanyJournalEntryLine.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the startDate value for this InterCompanyJournalEntryLine.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this InterCompanyJournalEntryLine.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the _class value for this InterCompanyJournalEntryLine.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this InterCompanyJournalEntryLine.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the endDate value for this InterCompanyJournalEntryLine.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this InterCompanyJournalEntryLine.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the location value for this InterCompanyJournalEntryLine.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InterCompanyJournalEntryLine.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the revenueRecognitionRule value for this InterCompanyJournalEntryLine.
     * 
     * @return revenueRecognitionRule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }


    /**
     * Sets the revenueRecognitionRule value for this InterCompanyJournalEntryLine.
     * 
     * @param revenueRecognitionRule
     */
    public void setRevenueRecognitionRule(com.netsuite.webservices.platform.core_2019_1.RecordRef revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }


    /**
     * Gets the eliminate value for this InterCompanyJournalEntryLine.
     * 
     * @return eliminate
     */
    public java.lang.Boolean getEliminate() {
        return eliminate;
    }


    /**
     * Sets the eliminate value for this InterCompanyJournalEntryLine.
     * 
     * @param eliminate
     */
    public void setEliminate(java.lang.Boolean eliminate) {
        this.eliminate = eliminate;
    }


    /**
     * Gets the residual value for this InterCompanyJournalEntryLine.
     * 
     * @return residual
     */
    public java.lang.String getResidual() {
        return residual;
    }


    /**
     * Sets the residual value for this InterCompanyJournalEntryLine.
     * 
     * @param residual
     */
    public void setResidual(java.lang.String residual) {
        this.residual = residual;
    }


    /**
     * Gets the amortizationSched value for this InterCompanyJournalEntryLine.
     * 
     * @return amortizationSched
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAmortizationSched() {
        return amortizationSched;
    }


    /**
     * Sets the amortizationSched value for this InterCompanyJournalEntryLine.
     * 
     * @param amortizationSched
     */
    public void setAmortizationSched(com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationSched) {
        this.amortizationSched = amortizationSched;
    }


    /**
     * Gets the scheduleNum value for this InterCompanyJournalEntryLine.
     * 
     * @return scheduleNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getScheduleNum() {
        return scheduleNum;
    }


    /**
     * Sets the scheduleNum value for this InterCompanyJournalEntryLine.
     * 
     * @param scheduleNum
     */
    public void setScheduleNum(com.netsuite.webservices.platform.core_2019_1.RecordRef scheduleNum) {
        this.scheduleNum = scheduleNum;
    }


    /**
     * Gets the amortizStartDate value for this InterCompanyJournalEntryLine.
     * 
     * @return amortizStartDate
     */
    public java.util.Calendar getAmortizStartDate() {
        return amortizStartDate;
    }


    /**
     * Sets the amortizStartDate value for this InterCompanyJournalEntryLine.
     * 
     * @param amortizStartDate
     */
    public void setAmortizStartDate(java.util.Calendar amortizStartDate) {
        this.amortizStartDate = amortizStartDate;
    }


    /**
     * Gets the amortizationEndDate value for this InterCompanyJournalEntryLine.
     * 
     * @return amortizationEndDate
     */
    public java.util.Calendar getAmortizationEndDate() {
        return amortizationEndDate;
    }


    /**
     * Sets the amortizationEndDate value for this InterCompanyJournalEntryLine.
     * 
     * @param amortizationEndDate
     */
    public void setAmortizationEndDate(java.util.Calendar amortizationEndDate) {
        this.amortizationEndDate = amortizationEndDate;
    }


    /**
     * Gets the amortizationResidual value for this InterCompanyJournalEntryLine.
     * 
     * @return amortizationResidual
     */
    public java.lang.String getAmortizationResidual() {
        return amortizationResidual;
    }


    /**
     * Sets the amortizationResidual value for this InterCompanyJournalEntryLine.
     * 
     * @param amortizationResidual
     */
    public void setAmortizationResidual(java.lang.String amortizationResidual) {
        this.amortizationResidual = amortizationResidual;
    }


    /**
     * Gets the tax1Amt value for this InterCompanyJournalEntryLine.
     * 
     * @return tax1Amt
     */
    public java.lang.Double getTax1Amt() {
        return tax1Amt;
    }


    /**
     * Sets the tax1Amt value for this InterCompanyJournalEntryLine.
     * 
     * @param tax1Amt
     */
    public void setTax1Amt(java.lang.Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }


    /**
     * Gets the tax1Acct value for this InterCompanyJournalEntryLine.
     * 
     * @return tax1Acct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTax1Acct() {
        return tax1Acct;
    }


    /**
     * Sets the tax1Acct value for this InterCompanyJournalEntryLine.
     * 
     * @param tax1Acct
     */
    public void setTax1Acct(com.netsuite.webservices.platform.core_2019_1.RecordRef tax1Acct) {
        this.tax1Acct = tax1Acct;
    }


    /**
     * Gets the customFieldList value for this InterCompanyJournalEntryLine.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InterCompanyJournalEntryLine.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterCompanyJournalEntryLine)) return false;
        InterCompanyJournalEntryLine other = (InterCompanyJournalEntryLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineSubsidiary==null && other.getLineSubsidiary()==null) || 
             (this.lineSubsidiary!=null &&
              this.lineSubsidiary.equals(other.getLineSubsidiary()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.debit==null && other.getDebit()==null) || 
             (this.debit!=null &&
              this.debit.equals(other.getDebit()))) &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.taxRate1==null && other.getTaxRate1()==null) || 
             (this.taxRate1!=null &&
              this.taxRate1.equals(other.getTaxRate1()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.grossAmt==null && other.getGrossAmt()==null) || 
             (this.grossAmt!=null &&
              this.grossAmt.equals(other.getGrossAmt()))) &&
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              this.schedule.equals(other.getSchedule()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.revenueRecognitionRule==null && other.getRevenueRecognitionRule()==null) || 
             (this.revenueRecognitionRule!=null &&
              this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule()))) &&
            ((this.eliminate==null && other.getEliminate()==null) || 
             (this.eliminate!=null &&
              this.eliminate.equals(other.getEliminate()))) &&
            ((this.residual==null && other.getResidual()==null) || 
             (this.residual!=null &&
              this.residual.equals(other.getResidual()))) &&
            ((this.amortizationSched==null && other.getAmortizationSched()==null) || 
             (this.amortizationSched!=null &&
              this.amortizationSched.equals(other.getAmortizationSched()))) &&
            ((this.scheduleNum==null && other.getScheduleNum()==null) || 
             (this.scheduleNum!=null &&
              this.scheduleNum.equals(other.getScheduleNum()))) &&
            ((this.amortizStartDate==null && other.getAmortizStartDate()==null) || 
             (this.amortizStartDate!=null &&
              this.amortizStartDate.equals(other.getAmortizStartDate()))) &&
            ((this.amortizationEndDate==null && other.getAmortizationEndDate()==null) || 
             (this.amortizationEndDate!=null &&
              this.amortizationEndDate.equals(other.getAmortizationEndDate()))) &&
            ((this.amortizationResidual==null && other.getAmortizationResidual()==null) || 
             (this.amortizationResidual!=null &&
              this.amortizationResidual.equals(other.getAmortizationResidual()))) &&
            ((this.tax1Amt==null && other.getTax1Amt()==null) || 
             (this.tax1Amt!=null &&
              this.tax1Amt.equals(other.getTax1Amt()))) &&
            ((this.tax1Acct==null && other.getTax1Acct()==null) || 
             (this.tax1Acct!=null &&
              this.tax1Acct.equals(other.getTax1Acct()))) &&
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
        int _hashCode = 1;
        if (getLineSubsidiary() != null) {
            _hashCode += getLineSubsidiary().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getDebit() != null) {
            _hashCode += getDebit().hashCode();
        }
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getTaxRate1() != null) {
            _hashCode += getTaxRate1().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getGrossAmt() != null) {
            _hashCode += getGrossAmt().hashCode();
        }
        if (getSchedule() != null) {
            _hashCode += getSchedule().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getRevenueRecognitionRule() != null) {
            _hashCode += getRevenueRecognitionRule().hashCode();
        }
        if (getEliminate() != null) {
            _hashCode += getEliminate().hashCode();
        }
        if (getResidual() != null) {
            _hashCode += getResidual().hashCode();
        }
        if (getAmortizationSched() != null) {
            _hashCode += getAmortizationSched().hashCode();
        }
        if (getScheduleNum() != null) {
            _hashCode += getScheduleNum().hashCode();
        }
        if (getAmortizStartDate() != null) {
            _hashCode += getAmortizStartDate().hashCode();
        }
        if (getAmortizationEndDate() != null) {
            _hashCode += getAmortizationEndDate().hashCode();
        }
        if (getAmortizationResidual() != null) {
            _hashCode += getAmortizationResidual().hashCode();
        }
        if (getTax1Amt() != null) {
            _hashCode += getTax1Amt().hashCode();
        }
        if (getTax1Acct() != null) {
            _hashCode += getTax1Acct().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterCompanyJournalEntryLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "InterCompanyJournalEntryLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "lineSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "debit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueRecognitionRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "revenueRecognitionRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eliminate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "eliminate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residual");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "residual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationSched");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "amortizationSched"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "scheduleNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "amortizStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "amortizationEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationResidual");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "amortizationResidual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax1Acct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "tax1Acct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
