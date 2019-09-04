/**
 * ChargeSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ChargeSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billTo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] chargeDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] chargeType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] modifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] postingPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] quantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] rate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] rule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] runId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] stage;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscriptionLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] use;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public ChargeSearchRowBasic() {
    }

    public ChargeSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingItem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billTo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] chargeDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] chargeType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] modifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] postingPeriod,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] quantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] rate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] rule,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] runId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesOrder,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] stage,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscriptionLine,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] use,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
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
        this.description = description;
        this.externalId = externalId;
        this.internalId = internalId;
        this.location = location;
        this.modifiedDate = modifiedDate;
        this.postingPeriod = postingPeriod;
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
     * Gets the amount value for this ChargeSearchRowBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ChargeSearchRowBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }


    /**
     * Gets the billingAccount value for this ChargeSearchRowBasic.
     * 
     * @return billingAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this ChargeSearchRowBasic.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingAccount) {
        this.billingAccount = billingAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillingAccount(int i) {
        return this.billingAccount[i];
    }

    public void setBillingAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billingAccount[i] = _value;
    }


    /**
     * Gets the billingItem value for this ChargeSearchRowBasic.
     * 
     * @return billingItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillingItem() {
        return billingItem;
    }


    /**
     * Sets the billingItem value for this ChargeSearchRowBasic.
     * 
     * @param billingItem
     */
    public void setBillingItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingItem) {
        this.billingItem = billingItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillingItem(int i) {
        return this.billingItem[i];
    }

    public void setBillingItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billingItem[i] = _value;
    }


    /**
     * Gets the billTo value for this ChargeSearchRowBasic.
     * 
     * @return billTo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillTo() {
        return billTo;
    }


    /**
     * Sets the billTo value for this ChargeSearchRowBasic.
     * 
     * @param billTo
     */
    public void setBillTo(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billTo) {
        this.billTo = billTo;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillTo(int i) {
        return this.billTo[i];
    }

    public void setBillTo(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billTo[i] = _value;
    }


    /**
     * Gets the chargeDate value for this ChargeSearchRowBasic.
     * 
     * @return chargeDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getChargeDate() {
        return chargeDate;
    }


    /**
     * Sets the chargeDate value for this ChargeSearchRowBasic.
     * 
     * @param chargeDate
     */
    public void setChargeDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] chargeDate) {
        this.chargeDate = chargeDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getChargeDate(int i) {
        return this.chargeDate[i];
    }

    public void setChargeDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.chargeDate[i] = _value;
    }


    /**
     * Gets the chargeType value for this ChargeSearchRowBasic.
     * 
     * @return chargeType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this ChargeSearchRowBasic.
     * 
     * @param chargeType
     */
    public void setChargeType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] chargeType) {
        this.chargeType = chargeType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getChargeType(int i) {
        return this.chargeType[i];
    }

    public void setChargeType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.chargeType[i] = _value;
    }


    /**
     * Gets the _class value for this ChargeSearchRowBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ChargeSearchRowBasic.
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
     * Gets the createdDate value for this ChargeSearchRowBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ChargeSearchRowBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }


    /**
     * Gets the currency value for this ChargeSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ChargeSearchRowBasic.
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
     * Gets the department value for this ChargeSearchRowBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ChargeSearchRowBasic.
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
     * Gets the description value for this ChargeSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ChargeSearchRowBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description) {
        this.description = description;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the externalId value for this ChargeSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ChargeSearchRowBasic.
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
     * Gets the internalId value for this ChargeSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ChargeSearchRowBasic.
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
     * Gets the location value for this ChargeSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ChargeSearchRowBasic.
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
     * Gets the modifiedDate value for this ChargeSearchRowBasic.
     * 
     * @return modifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this ChargeSearchRowBasic.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getModifiedDate(int i) {
        return this.modifiedDate[i];
    }

    public void setModifiedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.modifiedDate[i] = _value;
    }


    /**
     * Gets the postingPeriod value for this ChargeSearchRowBasic.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this ChargeSearchRowBasic.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPostingPeriod(int i) {
        return this.postingPeriod[i];
    }

    public void setPostingPeriod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.postingPeriod[i] = _value;
    }


    /**
     * Gets the quantity value for this ChargeSearchRowBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ChargeSearchRowBasic.
     * 
     * @param quantity
     */
    public void setQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] quantity) {
        this.quantity = quantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.quantity[i] = _value;
    }


    /**
     * Gets the rate value for this ChargeSearchRowBasic.
     * 
     * @return rate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this ChargeSearchRowBasic.
     * 
     * @param rate
     */
    public void setRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] rate) {
        this.rate = rate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.rate[i] = _value;
    }


    /**
     * Gets the rule value for this ChargeSearchRowBasic.
     * 
     * @return rule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this ChargeSearchRowBasic.
     * 
     * @param rule
     */
    public void setRule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] rule) {
        this.rule = rule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRule(int i) {
        return this.rule[i];
    }

    public void setRule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.rule[i] = _value;
    }


    /**
     * Gets the runId value for this ChargeSearchRowBasic.
     * 
     * @return runId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRunId() {
        return runId;
    }


    /**
     * Sets the runId value for this ChargeSearchRowBasic.
     * 
     * @param runId
     */
    public void setRunId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] runId) {
        this.runId = runId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRunId(int i) {
        return this.runId[i];
    }

    public void setRunId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.runId[i] = _value;
    }


    /**
     * Gets the salesOrder value for this ChargeSearchRowBasic.
     * 
     * @return salesOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSalesOrder() {
        return salesOrder;
    }


    /**
     * Sets the salesOrder value for this ChargeSearchRowBasic.
     * 
     * @param salesOrder
     */
    public void setSalesOrder(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesOrder) {
        this.salesOrder = salesOrder;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSalesOrder(int i) {
        return this.salesOrder[i];
    }

    public void setSalesOrder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.salesOrder[i] = _value;
    }


    /**
     * Gets the stage value for this ChargeSearchRowBasic.
     * 
     * @return stage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this ChargeSearchRowBasic.
     * 
     * @param stage
     */
    public void setStage(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] stage) {
        this.stage = stage;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getStage(int i) {
        return this.stage[i];
    }

    public void setStage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.stage[i] = _value;
    }


    /**
     * Gets the subscriptionLine value for this ChargeSearchRowBasic.
     * 
     * @return subscriptionLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubscriptionLine() {
        return subscriptionLine;
    }


    /**
     * Sets the subscriptionLine value for this ChargeSearchRowBasic.
     * 
     * @param subscriptionLine
     */
    public void setSubscriptionLine(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubscriptionLine(int i) {
        return this.subscriptionLine[i];
    }

    public void setSubscriptionLine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subscriptionLine[i] = _value;
    }


    /**
     * Gets the use value for this ChargeSearchRowBasic.
     * 
     * @return use
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getUse() {
        return use;
    }


    /**
     * Sets the use value for this ChargeSearchRowBasic.
     * 
     * @param use
     */
    public void setUse(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] use) {
        this.use = use;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getUse(int i) {
        return this.use[i];
    }

    public void setUse(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.use[i] = _value;
    }


    /**
     * Gets the customFieldList value for this ChargeSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ChargeSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeSearchRowBasic)) return false;
        ChargeSearchRowBasic other = (ChargeSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.amount, other.getAmount()))) &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              java.util.Arrays.equals(this.billingAccount, other.getBillingAccount()))) &&
            ((this.billingItem==null && other.getBillingItem()==null) || 
             (this.billingItem!=null &&
              java.util.Arrays.equals(this.billingItem, other.getBillingItem()))) &&
            ((this.billTo==null && other.getBillTo()==null) || 
             (this.billTo!=null &&
              java.util.Arrays.equals(this.billTo, other.getBillTo()))) &&
            ((this.chargeDate==null && other.getChargeDate()==null) || 
             (this.chargeDate!=null &&
              java.util.Arrays.equals(this.chargeDate, other.getChargeDate()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              java.util.Arrays.equals(this.chargeType, other.getChargeType()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              java.util.Arrays.equals(this.modifiedDate, other.getModifiedDate()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              java.util.Arrays.equals(this.postingPeriod, other.getPostingPeriod()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              java.util.Arrays.equals(this.quantity, other.getQuantity()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              java.util.Arrays.equals(this.rate, other.getRate()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule()))) &&
            ((this.runId==null && other.getRunId()==null) || 
             (this.runId!=null &&
              java.util.Arrays.equals(this.runId, other.getRunId()))) &&
            ((this.salesOrder==null && other.getSalesOrder()==null) || 
             (this.salesOrder!=null &&
              java.util.Arrays.equals(this.salesOrder, other.getSalesOrder()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              java.util.Arrays.equals(this.stage, other.getStage()))) &&
            ((this.subscriptionLine==null && other.getSubscriptionLine()==null) || 
             (this.subscriptionLine!=null &&
              java.util.Arrays.equals(this.subscriptionLine, other.getSubscriptionLine()))) &&
            ((this.use==null && other.getUse()==null) || 
             (this.use!=null &&
              java.util.Arrays.equals(this.use, other.getUse()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillTo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillTo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillTo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChargeDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargeDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChargeDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChargeType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargeType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChargeType(), i);
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
        if (getCreatedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedDate(), i);
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
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
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
        if (getModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifiedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostingPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostingPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostingPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantity(), i);
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
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRunId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRunId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRunId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriptionLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriptionLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriptionLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUse(), i);
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
        new org.apache.axis.description.TypeDesc(ChargeSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ChargeSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "chargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "chargeType"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "runId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "use"));
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
