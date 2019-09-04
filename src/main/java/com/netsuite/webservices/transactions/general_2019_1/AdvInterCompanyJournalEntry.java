/**
 * AdvInterCompanyJournalEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.general_2019_1;

public class AdvInterCompanyJournalEntry  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.String tranId;

    private java.util.Calendar reversalDate;

    private java.lang.Boolean reversalDefer;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parentExpenseAlloc;

    private java.lang.Boolean isBookSpecific;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef accountingBook;

    private java.lang.String reversalEntry;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private java.lang.String memo;

    private java.lang.Boolean approved;

    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Boolean performAutoBalance;

    private com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLineList lineList;

    private com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryAccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public AdvInterCompanyJournalEntry() {
    }

    public AdvInterCompanyJournalEntry(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.util.Calendar tranDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.String tranId,
           java.util.Calendar reversalDate,
           java.lang.Boolean reversalDefer,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parentExpenseAlloc,
           java.lang.Boolean isBookSpecific,
           com.netsuite.webservices.platform.core_2019_1.RecordRef accountingBook,
           java.lang.String reversalEntry,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           java.lang.String memo,
           java.lang.Boolean approved,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           java.lang.Boolean performAutoBalance,
           com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLineList lineList,
           com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryAccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.postingPeriod = postingPeriod;
        this.customForm = customForm;
        this.tranDate = tranDate;
        this.currency = currency;
        this.tranId = tranId;
        this.reversalDate = reversalDate;
        this.reversalDefer = reversalDefer;
        this.parentExpenseAlloc = parentExpenseAlloc;
        this.isBookSpecific = isBookSpecific;
        this.accountingBook = accountingBook;
        this.reversalEntry = reversalEntry;
        this.createdFrom = createdFrom;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiary = subsidiary;
        this.memo = memo;
        this.approved = approved;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.performAutoBalance = performAutoBalance;
        this.lineList = lineList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the postingPeriod value for this AdvInterCompanyJournalEntry.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this AdvInterCompanyJournalEntry.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the customForm value for this AdvInterCompanyJournalEntry.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this AdvInterCompanyJournalEntry.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the tranDate value for this AdvInterCompanyJournalEntry.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this AdvInterCompanyJournalEntry.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the currency value for this AdvInterCompanyJournalEntry.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AdvInterCompanyJournalEntry.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the tranId value for this AdvInterCompanyJournalEntry.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this AdvInterCompanyJournalEntry.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the reversalDate value for this AdvInterCompanyJournalEntry.
     * 
     * @return reversalDate
     */
    public java.util.Calendar getReversalDate() {
        return reversalDate;
    }


    /**
     * Sets the reversalDate value for this AdvInterCompanyJournalEntry.
     * 
     * @param reversalDate
     */
    public void setReversalDate(java.util.Calendar reversalDate) {
        this.reversalDate = reversalDate;
    }


    /**
     * Gets the reversalDefer value for this AdvInterCompanyJournalEntry.
     * 
     * @return reversalDefer
     */
    public java.lang.Boolean getReversalDefer() {
        return reversalDefer;
    }


    /**
     * Sets the reversalDefer value for this AdvInterCompanyJournalEntry.
     * 
     * @param reversalDefer
     */
    public void setReversalDefer(java.lang.Boolean reversalDefer) {
        this.reversalDefer = reversalDefer;
    }


    /**
     * Gets the parentExpenseAlloc value for this AdvInterCompanyJournalEntry.
     * 
     * @return parentExpenseAlloc
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParentExpenseAlloc() {
        return parentExpenseAlloc;
    }


    /**
     * Sets the parentExpenseAlloc value for this AdvInterCompanyJournalEntry.
     * 
     * @param parentExpenseAlloc
     */
    public void setParentExpenseAlloc(com.netsuite.webservices.platform.core_2019_1.RecordRef parentExpenseAlloc) {
        this.parentExpenseAlloc = parentExpenseAlloc;
    }


    /**
     * Gets the isBookSpecific value for this AdvInterCompanyJournalEntry.
     * 
     * @return isBookSpecific
     */
    public java.lang.Boolean getIsBookSpecific() {
        return isBookSpecific;
    }


    /**
     * Sets the isBookSpecific value for this AdvInterCompanyJournalEntry.
     * 
     * @param isBookSpecific
     */
    public void setIsBookSpecific(java.lang.Boolean isBookSpecific) {
        this.isBookSpecific = isBookSpecific;
    }


    /**
     * Gets the accountingBook value for this AdvInterCompanyJournalEntry.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this AdvInterCompanyJournalEntry.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2019_1.RecordRef accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the reversalEntry value for this AdvInterCompanyJournalEntry.
     * 
     * @return reversalEntry
     */
    public java.lang.String getReversalEntry() {
        return reversalEntry;
    }


    /**
     * Sets the reversalEntry value for this AdvInterCompanyJournalEntry.
     * 
     * @param reversalEntry
     */
    public void setReversalEntry(java.lang.String reversalEntry) {
        this.reversalEntry = reversalEntry;
    }


    /**
     * Gets the createdFrom value for this AdvInterCompanyJournalEntry.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this AdvInterCompanyJournalEntry.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the department value for this AdvInterCompanyJournalEntry.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this AdvInterCompanyJournalEntry.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this AdvInterCompanyJournalEntry.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this AdvInterCompanyJournalEntry.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this AdvInterCompanyJournalEntry.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this AdvInterCompanyJournalEntry.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this AdvInterCompanyJournalEntry.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this AdvInterCompanyJournalEntry.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the memo value for this AdvInterCompanyJournalEntry.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this AdvInterCompanyJournalEntry.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the approved value for this AdvInterCompanyJournalEntry.
     * 
     * @return approved
     */
    public java.lang.Boolean getApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this AdvInterCompanyJournalEntry.
     * 
     * @param approved
     */
    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }


    /**
     * Gets the createdDate value for this AdvInterCompanyJournalEntry.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this AdvInterCompanyJournalEntry.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this AdvInterCompanyJournalEntry.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this AdvInterCompanyJournalEntry.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the performAutoBalance value for this AdvInterCompanyJournalEntry.
     * 
     * @return performAutoBalance
     */
    public java.lang.Boolean getPerformAutoBalance() {
        return performAutoBalance;
    }


    /**
     * Sets the performAutoBalance value for this AdvInterCompanyJournalEntry.
     * 
     * @param performAutoBalance
     */
    public void setPerformAutoBalance(java.lang.Boolean performAutoBalance) {
        this.performAutoBalance = performAutoBalance;
    }


    /**
     * Gets the lineList value for this AdvInterCompanyJournalEntry.
     * 
     * @return lineList
     */
    public com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLineList getLineList() {
        return lineList;
    }


    /**
     * Sets the lineList value for this AdvInterCompanyJournalEntry.
     * 
     * @param lineList
     */
    public void setLineList(com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryLineList lineList) {
        this.lineList = lineList;
    }


    /**
     * Gets the accountingBookDetailList value for this AdvInterCompanyJournalEntry.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryAccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this AdvInterCompanyJournalEntry.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.transactions.general_2019_1.AdvInterCompanyJournalEntryAccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the customFieldList value for this AdvInterCompanyJournalEntry.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this AdvInterCompanyJournalEntry.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this AdvInterCompanyJournalEntry.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AdvInterCompanyJournalEntry.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this AdvInterCompanyJournalEntry.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this AdvInterCompanyJournalEntry.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvInterCompanyJournalEntry)) return false;
        AdvInterCompanyJournalEntry other = (AdvInterCompanyJournalEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.reversalDate==null && other.getReversalDate()==null) || 
             (this.reversalDate!=null &&
              this.reversalDate.equals(other.getReversalDate()))) &&
            ((this.reversalDefer==null && other.getReversalDefer()==null) || 
             (this.reversalDefer!=null &&
              this.reversalDefer.equals(other.getReversalDefer()))) &&
            ((this.parentExpenseAlloc==null && other.getParentExpenseAlloc()==null) || 
             (this.parentExpenseAlloc!=null &&
              this.parentExpenseAlloc.equals(other.getParentExpenseAlloc()))) &&
            ((this.isBookSpecific==null && other.getIsBookSpecific()==null) || 
             (this.isBookSpecific!=null &&
              this.isBookSpecific.equals(other.getIsBookSpecific()))) &&
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              this.accountingBook.equals(other.getAccountingBook()))) &&
            ((this.reversalEntry==null && other.getReversalEntry()==null) || 
             (this.reversalEntry!=null &&
              this.reversalEntry.equals(other.getReversalEntry()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.approved==null && other.getApproved()==null) || 
             (this.approved!=null &&
              this.approved.equals(other.getApproved()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.performAutoBalance==null && other.getPerformAutoBalance()==null) || 
             (this.performAutoBalance!=null &&
              this.performAutoBalance.equals(other.getPerformAutoBalance()))) &&
            ((this.lineList==null && other.getLineList()==null) || 
             (this.lineList!=null &&
              this.lineList.equals(other.getLineList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
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
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getReversalDate() != null) {
            _hashCode += getReversalDate().hashCode();
        }
        if (getReversalDefer() != null) {
            _hashCode += getReversalDefer().hashCode();
        }
        if (getParentExpenseAlloc() != null) {
            _hashCode += getParentExpenseAlloc().hashCode();
        }
        if (getIsBookSpecific() != null) {
            _hashCode += getIsBookSpecific().hashCode();
        }
        if (getAccountingBook() != null) {
            _hashCode += getAccountingBook().hashCode();
        }
        if (getReversalEntry() != null) {
            _hashCode += getReversalEntry().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
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
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getApproved() != null) {
            _hashCode += getApproved().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getPerformAutoBalance() != null) {
            _hashCode += getPerformAutoBalance().hashCode();
        }
        if (getLineList() != null) {
            _hashCode += getLineList().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
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
        new org.apache.axis.description.TypeDesc(AdvInterCompanyJournalEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntry"));
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
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "reversalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalDefer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "reversalDefer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentExpenseAlloc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "parentExpenseAlloc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBookSpecific");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "isBookSpecific"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "reversalEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "createdFrom"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
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
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performAutoBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "performAutoBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "lineList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntryLineList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "AdvInterCompanyJournalEntryAccountingBookDetailList"));
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
