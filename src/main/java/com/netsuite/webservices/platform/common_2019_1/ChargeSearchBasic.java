/**
 * ChargeSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ChargeSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billTo;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField chargeDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField chargeType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField modifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate postingPeriodRelative;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField rule;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField runId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField salesOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField stage;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField use;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public ChargeSearchBasic() {
    }

    public ChargeSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingItem,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billTo,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField chargeDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField chargeType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField modifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate postingPeriodRelative,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField rule,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField runId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField salesOrder,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField stage,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionLine,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField use,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.amount = amount;
        this.billingAccount = billingAccount;
        this.billingItem = billingItem;
        this.billTo = billTo;
        this.chargeDate = chargeDate;
        this.chargeType = chargeType;
        this._class = _class;
        this.createdDate = createdDate;
        this.currency = currency;
        this.department = department;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.location = location;
        this.modifiedDate = modifiedDate;
        this.postingPeriod = postingPeriod;
        this.postingPeriodRelative = postingPeriodRelative;
        this.quantity = quantity;
        this.rate = rate;
        this.rule = rule;
        this.runId = runId;
        this.salesOrder = salesOrder;
        this.stage = stage;
        this.subscriptionLine = subscriptionLine;
        this.use = use;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the amount value for this ChargeSearchBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ChargeSearchBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount) {
        this.amount = amount;
    }


    /**
     * Gets the billingAccount value for this ChargeSearchBasic.
     * 
     * @return billingAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this ChargeSearchBasic.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the billingItem value for this ChargeSearchBasic.
     * 
     * @return billingItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillingItem() {
        return billingItem;
    }


    /**
     * Sets the billingItem value for this ChargeSearchBasic.
     * 
     * @param billingItem
     */
    public void setBillingItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingItem) {
        this.billingItem = billingItem;
    }


    /**
     * Gets the billTo value for this ChargeSearchBasic.
     * 
     * @return billTo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillTo() {
        return billTo;
    }


    /**
     * Sets the billTo value for this ChargeSearchBasic.
     * 
     * @param billTo
     */
    public void setBillTo(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billTo) {
        this.billTo = billTo;
    }


    /**
     * Gets the chargeDate value for this ChargeSearchBasic.
     * 
     * @return chargeDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getChargeDate() {
        return chargeDate;
    }


    /**
     * Sets the chargeDate value for this ChargeSearchBasic.
     * 
     * @param chargeDate
     */
    public void setChargeDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField chargeDate) {
        this.chargeDate = chargeDate;
    }


    /**
     * Gets the chargeType value for this ChargeSearchBasic.
     * 
     * @return chargeType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this ChargeSearchBasic.
     * 
     * @param chargeType
     */
    public void setChargeType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the _class value for this ChargeSearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ChargeSearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the createdDate value for this ChargeSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ChargeSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currency value for this ChargeSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ChargeSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the department value for this ChargeSearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ChargeSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the externalId value for this ChargeSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ChargeSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ChargeSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ChargeSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this ChargeSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ChargeSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ChargeSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ChargeSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the location value for this ChargeSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ChargeSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the modifiedDate value for this ChargeSearchBasic.
     * 
     * @return modifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this ChargeSearchBasic.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the postingPeriod value for this ChargeSearchBasic.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this ChargeSearchBasic.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the postingPeriodRelative value for this ChargeSearchBasic.
     * 
     * @return postingPeriodRelative
     */
    public com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate getPostingPeriodRelative() {
        return postingPeriodRelative;
    }


    /**
     * Sets the postingPeriodRelative value for this ChargeSearchBasic.
     * 
     * @param postingPeriodRelative
     */
    public void setPostingPeriodRelative(com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate postingPeriodRelative) {
        this.postingPeriodRelative = postingPeriodRelative;
    }


    /**
     * Gets the quantity value for this ChargeSearchBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ChargeSearchBasic.
     * 
     * @param quantity
     */
    public void setQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the rate value for this ChargeSearchBasic.
     * 
     * @return rate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this ChargeSearchBasic.
     * 
     * @param rate
     */
    public void setRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rate) {
        this.rate = rate;
    }


    /**
     * Gets the rule value for this ChargeSearchBasic.
     * 
     * @return rule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this ChargeSearchBasic.
     * 
     * @param rule
     */
    public void setRule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField rule) {
        this.rule = rule;
    }


    /**
     * Gets the runId value for this ChargeSearchBasic.
     * 
     * @return runId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getRunId() {
        return runId;
    }


    /**
     * Sets the runId value for this ChargeSearchBasic.
     * 
     * @param runId
     */
    public void setRunId(com.netsuite.webservices.platform.core_2019_1.SearchStringField runId) {
        this.runId = runId;
    }


    /**
     * Gets the salesOrder value for this ChargeSearchBasic.
     * 
     * @return salesOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getSalesOrder() {
        return salesOrder;
    }


    /**
     * Sets the salesOrder value for this ChargeSearchBasic.
     * 
     * @param salesOrder
     */
    public void setSalesOrder(com.netsuite.webservices.platform.core_2019_1.SearchLongField salesOrder) {
        this.salesOrder = salesOrder;
    }


    /**
     * Gets the stage value for this ChargeSearchBasic.
     * 
     * @return stage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this ChargeSearchBasic.
     * 
     * @param stage
     */
    public void setStage(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField stage) {
        this.stage = stage;
    }


    /**
     * Gets the subscriptionLine value for this ChargeSearchBasic.
     * 
     * @return subscriptionLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubscriptionLine() {
        return subscriptionLine;
    }


    /**
     * Sets the subscriptionLine value for this ChargeSearchBasic.
     * 
     * @param subscriptionLine
     */
    public void setSubscriptionLine(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }


    /**
     * Gets the use value for this ChargeSearchBasic.
     * 
     * @return use
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getUse() {
        return use;
    }


    /**
     * Sets the use value for this ChargeSearchBasic.
     * 
     * @param use
     */
    public void setUse(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField use) {
        this.use = use;
    }


    /**
     * Gets the customFieldList value for this ChargeSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ChargeSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeSearchBasic)) return false;
        ChargeSearchBasic other = (ChargeSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.billingItem==null && other.getBillingItem()==null) || 
             (this.billingItem!=null &&
              this.billingItem.equals(other.getBillingItem()))) &&
            ((this.billTo==null && other.getBillTo()==null) || 
             (this.billTo!=null &&
              this.billTo.equals(other.getBillTo()))) &&
            ((this.chargeDate==null && other.getChargeDate()==null) || 
             (this.chargeDate!=null &&
              this.chargeDate.equals(other.getChargeDate()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.postingPeriodRelative==null && other.getPostingPeriodRelative()==null) || 
             (this.postingPeriodRelative!=null &&
              this.postingPeriodRelative.equals(other.getPostingPeriodRelative()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.runId==null && other.getRunId()==null) || 
             (this.runId!=null &&
              this.runId.equals(other.getRunId()))) &&
            ((this.salesOrder==null && other.getSalesOrder()==null) || 
             (this.salesOrder!=null &&
              this.salesOrder.equals(other.getSalesOrder()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              this.stage.equals(other.getStage()))) &&
            ((this.subscriptionLine==null && other.getSubscriptionLine()==null) || 
             (this.subscriptionLine!=null &&
              this.subscriptionLine.equals(other.getSubscriptionLine()))) &&
            ((this.use==null && other.getUse()==null) || 
             (this.use!=null &&
              this.use.equals(other.getUse()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getBillingItem() != null) {
            _hashCode += getBillingItem().hashCode();
        }
        if (getBillTo() != null) {
            _hashCode += getBillTo().hashCode();
        }
        if (getChargeDate() != null) {
            _hashCode += getChargeDate().hashCode();
        }
        if (getChargeType() != null) {
            _hashCode += getChargeType().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getPostingPeriodRelative() != null) {
            _hashCode += getPostingPeriodRelative().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getRunId() != null) {
            _hashCode += getRunId().hashCode();
        }
        if (getSalesOrder() != null) {
            _hashCode += getSalesOrder().hashCode();
        }
        if (getStage() != null) {
            _hashCode += getStage().hashCode();
        }
        if (getSubscriptionLine() != null) {
            _hashCode += getSubscriptionLine().hashCode();
        }
        if (getUse() != null) {
            _hashCode += getUse().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ChargeSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "chargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "chargeType"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriodRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postingPeriodRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "PostingPeriodDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "runId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "use"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
