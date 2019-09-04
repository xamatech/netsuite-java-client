/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class Account  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.types.AccountType acctType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef unit;

    private java.lang.String acctNumber;

    private java.lang.String acctName;

    private java.lang.String legalName;

    private java.lang.Boolean includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.String exchangeRate;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ConsolidatedRate generalRate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ConsolidatedRate cashFlowRate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billableExpensesAcct;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAcct;

    private java.lang.String description;

    private java.lang.Long curDocNum;

    private java.lang.Boolean isInactive;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList restrictToAccountingBookList;

    private java.lang.Boolean inventory;

    private java.lang.Boolean eliminate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef category1099Misc;

    private com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizationsList localizationsList;

    private java.lang.Double openingBalance;

    private java.util.Calendar tranDate;

    private java.lang.Boolean revalue;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Account() {
    }

    public Account(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.lists.accounting_2019_1.types.AccountType acctType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef unit,
           java.lang.String acctNumber,
           java.lang.String acctName,
           java.lang.String legalName,
           java.lang.Boolean includeChildren,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.String exchangeRate,
           com.netsuite.webservices.lists.accounting_2019_1.types.ConsolidatedRate generalRate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           com.netsuite.webservices.lists.accounting_2019_1.types.ConsolidatedRate cashFlowRate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billableExpensesAcct,
           com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAcct,
           java.lang.String description,
           java.lang.Long curDocNum,
           java.lang.Boolean isInactive,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList restrictToAccountingBookList,
           java.lang.Boolean inventory,
           java.lang.Boolean eliminate,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef category1099Misc,
           com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizationsList localizationsList,
           java.lang.Double openingBalance,
           java.util.Calendar tranDate,
           java.lang.Boolean revalue,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.acctType = acctType;
        this.unitsType = unitsType;
        this.unit = unit;
        this.acctNumber = acctNumber;
        this.acctName = acctName;
        this.legalName = legalName;
        this.includeChildren = includeChildren;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.generalRate = generalRate;
        this.parent = parent;
        this.cashFlowRate = cashFlowRate;
        this.billableExpensesAcct = billableExpensesAcct;
        this.deferralAcct = deferralAcct;
        this.description = description;
        this.curDocNum = curDocNum;
        this.isInactive = isInactive;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.restrictToAccountingBookList = restrictToAccountingBookList;
        this.inventory = inventory;
        this.eliminate = eliminate;
        this.subsidiaryList = subsidiaryList;
        this.category1099Misc = category1099Misc;
        this.localizationsList = localizationsList;
        this.openingBalance = openingBalance;
        this.tranDate = tranDate;
        this.revalue = revalue;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the acctType value for this Account.
     * 
     * @return acctType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.AccountType getAcctType() {
        return acctType;
    }


    /**
     * Sets the acctType value for this Account.
     * 
     * @param acctType
     */
    public void setAcctType(com.netsuite.webservices.lists.accounting_2019_1.types.AccountType acctType) {
        this.acctType = acctType;
    }


    /**
     * Gets the unitsType value for this Account.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this Account.
     * 
     * @param unitsType
     */
    public void setUnitsType(com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType) {
        this.unitsType = unitsType;
    }


    /**
     * Gets the unit value for this Account.
     * 
     * @return unit
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this Account.
     * 
     * @param unit
     */
    public void setUnit(com.netsuite.webservices.platform.core_2019_1.RecordRef unit) {
        this.unit = unit;
    }


    /**
     * Gets the acctNumber value for this Account.
     * 
     * @return acctNumber
     */
    public java.lang.String getAcctNumber() {
        return acctNumber;
    }


    /**
     * Sets the acctNumber value for this Account.
     * 
     * @param acctNumber
     */
    public void setAcctNumber(java.lang.String acctNumber) {
        this.acctNumber = acctNumber;
    }


    /**
     * Gets the acctName value for this Account.
     * 
     * @return acctName
     */
    public java.lang.String getAcctName() {
        return acctName;
    }


    /**
     * Sets the acctName value for this Account.
     * 
     * @param acctName
     */
    public void setAcctName(java.lang.String acctName) {
        this.acctName = acctName;
    }


    /**
     * Gets the legalName value for this Account.
     * 
     * @return legalName
     */
    public java.lang.String getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this Account.
     * 
     * @param legalName
     */
    public void setLegalName(java.lang.String legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the includeChildren value for this Account.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this Account.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the currency value for this Account.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Account.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the exchangeRate value for this Account.
     * 
     * @return exchangeRate
     */
    public java.lang.String getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this Account.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the generalRate value for this Account.
     * 
     * @return generalRate
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ConsolidatedRate getGeneralRate() {
        return generalRate;
    }


    /**
     * Sets the generalRate value for this Account.
     * 
     * @param generalRate
     */
    public void setGeneralRate(com.netsuite.webservices.lists.accounting_2019_1.types.ConsolidatedRate generalRate) {
        this.generalRate = generalRate;
    }


    /**
     * Gets the parent value for this Account.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Account.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the cashFlowRate value for this Account.
     * 
     * @return cashFlowRate
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ConsolidatedRate getCashFlowRate() {
        return cashFlowRate;
    }


    /**
     * Sets the cashFlowRate value for this Account.
     * 
     * @param cashFlowRate
     */
    public void setCashFlowRate(com.netsuite.webservices.lists.accounting_2019_1.types.ConsolidatedRate cashFlowRate) {
        this.cashFlowRate = cashFlowRate;
    }


    /**
     * Gets the billableExpensesAcct value for this Account.
     * 
     * @return billableExpensesAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillableExpensesAcct() {
        return billableExpensesAcct;
    }


    /**
     * Sets the billableExpensesAcct value for this Account.
     * 
     * @param billableExpensesAcct
     */
    public void setBillableExpensesAcct(com.netsuite.webservices.platform.core_2019_1.RecordRef billableExpensesAcct) {
        this.billableExpensesAcct = billableExpensesAcct;
    }


    /**
     * Gets the deferralAcct value for this Account.
     * 
     * @return deferralAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDeferralAcct() {
        return deferralAcct;
    }


    /**
     * Sets the deferralAcct value for this Account.
     * 
     * @param deferralAcct
     */
    public void setDeferralAcct(com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAcct) {
        this.deferralAcct = deferralAcct;
    }


    /**
     * Gets the description value for this Account.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Account.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the curDocNum value for this Account.
     * 
     * @return curDocNum
     */
    public java.lang.Long getCurDocNum() {
        return curDocNum;
    }


    /**
     * Sets the curDocNum value for this Account.
     * 
     * @param curDocNum
     */
    public void setCurDocNum(java.lang.Long curDocNum) {
        this.curDocNum = curDocNum;
    }


    /**
     * Gets the isInactive value for this Account.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Account.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the department value for this Account.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Account.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this Account.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Account.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this Account.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Account.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the restrictToAccountingBookList value for this Account.
     * 
     * @return restrictToAccountingBookList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getRestrictToAccountingBookList() {
        return restrictToAccountingBookList;
    }


    /**
     * Sets the restrictToAccountingBookList value for this Account.
     * 
     * @param restrictToAccountingBookList
     */
    public void setRestrictToAccountingBookList(com.netsuite.webservices.platform.core_2019_1.RecordRefList restrictToAccountingBookList) {
        this.restrictToAccountingBookList = restrictToAccountingBookList;
    }


    /**
     * Gets the inventory value for this Account.
     * 
     * @return inventory
     */
    public java.lang.Boolean getInventory() {
        return inventory;
    }


    /**
     * Sets the inventory value for this Account.
     * 
     * @param inventory
     */
    public void setInventory(java.lang.Boolean inventory) {
        this.inventory = inventory;
    }


    /**
     * Gets the eliminate value for this Account.
     * 
     * @return eliminate
     */
    public java.lang.Boolean getEliminate() {
        return eliminate;
    }


    /**
     * Sets the eliminate value for this Account.
     * 
     * @param eliminate
     */
    public void setEliminate(java.lang.Boolean eliminate) {
        this.eliminate = eliminate;
    }


    /**
     * Gets the subsidiaryList value for this Account.
     * 
     * @return subsidiaryList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this Account.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the category1099Misc value for this Account.
     * 
     * @return category1099Misc
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCategory1099Misc() {
        return category1099Misc;
    }


    /**
     * Sets the category1099Misc value for this Account.
     * 
     * @param category1099Misc
     */
    public void setCategory1099Misc(com.netsuite.webservices.platform.core_2019_1.RecordRef category1099Misc) {
        this.category1099Misc = category1099Misc;
    }


    /**
     * Gets the localizationsList value for this Account.
     * 
     * @return localizationsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizationsList getLocalizationsList() {
        return localizationsList;
    }


    /**
     * Sets the localizationsList value for this Account.
     * 
     * @param localizationsList
     */
    public void setLocalizationsList(com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizationsList localizationsList) {
        this.localizationsList = localizationsList;
    }


    /**
     * Gets the openingBalance value for this Account.
     * 
     * @return openingBalance
     */
    public java.lang.Double getOpeningBalance() {
        return openingBalance;
    }


    /**
     * Sets the openingBalance value for this Account.
     * 
     * @param openingBalance
     */
    public void setOpeningBalance(java.lang.Double openingBalance) {
        this.openingBalance = openingBalance;
    }


    /**
     * Gets the tranDate value for this Account.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this Account.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the revalue value for this Account.
     * 
     * @return revalue
     */
    public java.lang.Boolean getRevalue() {
        return revalue;
    }


    /**
     * Sets the revalue value for this Account.
     * 
     * @param revalue
     */
    public void setRevalue(java.lang.Boolean revalue) {
        this.revalue = revalue;
    }


    /**
     * Gets the customFieldList value for this Account.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Account.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Account.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Account.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Account.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Account.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctType==null && other.getAcctType()==null) || 
             (this.acctType!=null &&
              this.acctType.equals(other.getAcctType()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.acctNumber==null && other.getAcctNumber()==null) || 
             (this.acctNumber!=null &&
              this.acctNumber.equals(other.getAcctNumber()))) &&
            ((this.acctName==null && other.getAcctName()==null) || 
             (this.acctName!=null &&
              this.acctName.equals(other.getAcctName()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.generalRate==null && other.getGeneralRate()==null) || 
             (this.generalRate!=null &&
              this.generalRate.equals(other.getGeneralRate()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.cashFlowRate==null && other.getCashFlowRate()==null) || 
             (this.cashFlowRate!=null &&
              this.cashFlowRate.equals(other.getCashFlowRate()))) &&
            ((this.billableExpensesAcct==null && other.getBillableExpensesAcct()==null) || 
             (this.billableExpensesAcct!=null &&
              this.billableExpensesAcct.equals(other.getBillableExpensesAcct()))) &&
            ((this.deferralAcct==null && other.getDeferralAcct()==null) || 
             (this.deferralAcct!=null &&
              this.deferralAcct.equals(other.getDeferralAcct()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.curDocNum==null && other.getCurDocNum()==null) || 
             (this.curDocNum!=null &&
              this.curDocNum.equals(other.getCurDocNum()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.restrictToAccountingBookList==null && other.getRestrictToAccountingBookList()==null) || 
             (this.restrictToAccountingBookList!=null &&
              this.restrictToAccountingBookList.equals(other.getRestrictToAccountingBookList()))) &&
            ((this.inventory==null && other.getInventory()==null) || 
             (this.inventory!=null &&
              this.inventory.equals(other.getInventory()))) &&
            ((this.eliminate==null && other.getEliminate()==null) || 
             (this.eliminate!=null &&
              this.eliminate.equals(other.getEliminate()))) &&
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this.category1099Misc==null && other.getCategory1099Misc()==null) || 
             (this.category1099Misc!=null &&
              this.category1099Misc.equals(other.getCategory1099Misc()))) &&
            ((this.localizationsList==null && other.getLocalizationsList()==null) || 
             (this.localizationsList!=null &&
              this.localizationsList.equals(other.getLocalizationsList()))) &&
            ((this.openingBalance==null && other.getOpeningBalance()==null) || 
             (this.openingBalance!=null &&
              this.openingBalance.equals(other.getOpeningBalance()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.revalue==null && other.getRevalue()==null) || 
             (this.revalue!=null &&
              this.revalue.equals(other.getRevalue()))) &&
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
        if (getAcctType() != null) {
            _hashCode += getAcctType().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getAcctNumber() != null) {
            _hashCode += getAcctNumber().hashCode();
        }
        if (getAcctName() != null) {
            _hashCode += getAcctName().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getGeneralRate() != null) {
            _hashCode += getGeneralRate().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getCashFlowRate() != null) {
            _hashCode += getCashFlowRate().hashCode();
        }
        if (getBillableExpensesAcct() != null) {
            _hashCode += getBillableExpensesAcct().hashCode();
        }
        if (getDeferralAcct() != null) {
            _hashCode += getDeferralAcct().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCurDocNum() != null) {
            _hashCode += getCurDocNum().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
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
        if (getRestrictToAccountingBookList() != null) {
            _hashCode += getRestrictToAccountingBookList().hashCode();
        }
        if (getInventory() != null) {
            _hashCode += getInventory().hashCode();
        }
        if (getEliminate() != null) {
            _hashCode += getEliminate().hashCode();
        }
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (getCategory1099Misc() != null) {
            _hashCode += getCategory1099Misc().hashCode();
        }
        if (getLocalizationsList() != null) {
            _hashCode += getLocalizationsList().hashCode();
        }
        if (getOpeningBalance() != null) {
            _hashCode += getOpeningBalance().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getRevalue() != null) {
            _hashCode += getRevalue().hashCode();
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
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "Account"));
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
        elemField.setFieldName("acctType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "acctType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "acctNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "acctName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "generalRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ConsolidatedRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashFlowRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "cashFlowRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ConsolidatedRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billableExpensesAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "billableExpensesAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferralAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "deferralAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curDocNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "curDocNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictToAccountingBookList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "restrictToAccountingBookList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eliminate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "eliminate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category1099Misc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "category1099misc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "localizationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "AccountLocalizationsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "openingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revalue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "revalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "customFieldList"));
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
