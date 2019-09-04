/**
 * Charge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2019_1;

public class Charge  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesOrder;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billTo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingAccount;

    private com.netsuite.webservices.transactions.customers_2019_1.types.ChargeStage stage;

    private java.util.Calendar chargeDate;

    private com.netsuite.webservices.transactions.customers_2019_1.types.ChargeUse use;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef chargeType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef projectTask;

    private java.lang.String description;

    private java.util.Calendar createdDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef timeRecord;

    private java.lang.String rate;

    private java.lang.Double quantity;

    private java.lang.Double amount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingItem;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef transaction;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef transactionLine;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesOrderLine;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subscriptionLine;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef invoice;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef invoiceLine;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef rule;

    private java.lang.String runId;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Charge() {
    }

    public Charge(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesOrder,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billTo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingAccount,
           com.netsuite.webservices.transactions.customers_2019_1.types.ChargeStage stage,
           java.util.Calendar chargeDate,
           com.netsuite.webservices.transactions.customers_2019_1.types.ChargeUse use,
           com.netsuite.webservices.platform.core_2019_1.RecordRef chargeType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef projectTask,
           java.lang.String description,
           java.util.Calendar createdDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef timeRecord,
           java.lang.String rate,
           java.lang.Double quantity,
           java.lang.Double amount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingItem,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef transaction,
           com.netsuite.webservices.platform.core_2019_1.RecordRef transactionLine,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesOrderLine,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subscriptionLine,
           com.netsuite.webservices.platform.core_2019_1.RecordRef invoice,
           com.netsuite.webservices.platform.core_2019_1.RecordRef invoiceLine,
           com.netsuite.webservices.platform.core_2019_1.RecordRef rule,
           java.lang.String runId) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.salesOrder = salesOrder;
        this.billTo = billTo;
        this.billingAccount = billingAccount;
        this.stage = stage;
        this.chargeDate = chargeDate;
        this.use = use;
        this.chargeType = chargeType;
        this.projectTask = projectTask;
        this.description = description;
        this.createdDate = createdDate;
        this.timeRecord = timeRecord;
        this.rate = rate;
        this.quantity = quantity;
        this.amount = amount;
        this.billingItem = billingItem;
        this.currency = currency;
        this.transaction = transaction;
        this.transactionLine = transactionLine;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.salesOrderLine = salesOrderLine;
        this.subscriptionLine = subscriptionLine;
        this.invoice = invoice;
        this.invoiceLine = invoiceLine;
        this.rule = rule;
        this.runId = runId;
    }


    /**
     * Gets the customForm value for this Charge.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Charge.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the salesOrder value for this Charge.
     * 
     * @return salesOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesOrder() {
        return salesOrder;
    }


    /**
     * Sets the salesOrder value for this Charge.
     * 
     * @param salesOrder
     */
    public void setSalesOrder(com.netsuite.webservices.platform.core_2019_1.RecordRef salesOrder) {
        this.salesOrder = salesOrder;
    }


    /**
     * Gets the billTo value for this Charge.
     * 
     * @return billTo
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillTo() {
        return billTo;
    }


    /**
     * Sets the billTo value for this Charge.
     * 
     * @param billTo
     */
    public void setBillTo(com.netsuite.webservices.platform.core_2019_1.RecordRef billTo) {
        this.billTo = billTo;
    }


    /**
     * Gets the billingAccount value for this Charge.
     * 
     * @return billingAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this Charge.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the stage value for this Charge.
     * 
     * @return stage
     */
    public com.netsuite.webservices.transactions.customers_2019_1.types.ChargeStage getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this Charge.
     * 
     * @param stage
     */
    public void setStage(com.netsuite.webservices.transactions.customers_2019_1.types.ChargeStage stage) {
        this.stage = stage;
    }


    /**
     * Gets the chargeDate value for this Charge.
     * 
     * @return chargeDate
     */
    public java.util.Calendar getChargeDate() {
        return chargeDate;
    }


    /**
     * Sets the chargeDate value for this Charge.
     * 
     * @param chargeDate
     */
    public void setChargeDate(java.util.Calendar chargeDate) {
        this.chargeDate = chargeDate;
    }


    /**
     * Gets the use value for this Charge.
     * 
     * @return use
     */
    public com.netsuite.webservices.transactions.customers_2019_1.types.ChargeUse getUse() {
        return use;
    }


    /**
     * Sets the use value for this Charge.
     * 
     * @param use
     */
    public void setUse(com.netsuite.webservices.transactions.customers_2019_1.types.ChargeUse use) {
        this.use = use;
    }


    /**
     * Gets the chargeType value for this Charge.
     * 
     * @return chargeType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this Charge.
     * 
     * @param chargeType
     */
    public void setChargeType(com.netsuite.webservices.platform.core_2019_1.RecordRef chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the projectTask value for this Charge.
     * 
     * @return projectTask
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getProjectTask() {
        return projectTask;
    }


    /**
     * Sets the projectTask value for this Charge.
     * 
     * @param projectTask
     */
    public void setProjectTask(com.netsuite.webservices.platform.core_2019_1.RecordRef projectTask) {
        this.projectTask = projectTask;
    }


    /**
     * Gets the description value for this Charge.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Charge.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the createdDate value for this Charge.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Charge.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the timeRecord value for this Charge.
     * 
     * @return timeRecord
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTimeRecord() {
        return timeRecord;
    }


    /**
     * Sets the timeRecord value for this Charge.
     * 
     * @param timeRecord
     */
    public void setTimeRecord(com.netsuite.webservices.platform.core_2019_1.RecordRef timeRecord) {
        this.timeRecord = timeRecord;
    }


    /**
     * Gets the rate value for this Charge.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this Charge.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the quantity value for this Charge.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Charge.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the amount value for this Charge.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Charge.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the billingItem value for this Charge.
     * 
     * @return billingItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingItem() {
        return billingItem;
    }


    /**
     * Sets the billingItem value for this Charge.
     * 
     * @param billingItem
     */
    public void setBillingItem(com.netsuite.webservices.platform.core_2019_1.RecordRef billingItem) {
        this.billingItem = billingItem;
    }


    /**
     * Gets the currency value for this Charge.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Charge.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the transaction value for this Charge.
     * 
     * @return transaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this Charge.
     * 
     * @param transaction
     */
    public void setTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef transaction) {
        this.transaction = transaction;
    }


    /**
     * Gets the transactionLine value for this Charge.
     * 
     * @return transactionLine
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTransactionLine() {
        return transactionLine;
    }


    /**
     * Sets the transactionLine value for this Charge.
     * 
     * @param transactionLine
     */
    public void setTransactionLine(com.netsuite.webservices.platform.core_2019_1.RecordRef transactionLine) {
        this.transactionLine = transactionLine;
    }


    /**
     * Gets the _class value for this Charge.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Charge.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the department value for this Charge.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Charge.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this Charge.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Charge.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the salesOrderLine value for this Charge.
     * 
     * @return salesOrderLine
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesOrderLine() {
        return salesOrderLine;
    }


    /**
     * Sets the salesOrderLine value for this Charge.
     * 
     * @param salesOrderLine
     */
    public void setSalesOrderLine(com.netsuite.webservices.platform.core_2019_1.RecordRef salesOrderLine) {
        this.salesOrderLine = salesOrderLine;
    }


    /**
     * Gets the subscriptionLine value for this Charge.
     * 
     * @return subscriptionLine
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubscriptionLine() {
        return subscriptionLine;
    }


    /**
     * Sets the subscriptionLine value for this Charge.
     * 
     * @param subscriptionLine
     */
    public void setSubscriptionLine(com.netsuite.webservices.platform.core_2019_1.RecordRef subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }


    /**
     * Gets the invoice value for this Charge.
     * 
     * @return invoice
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInvoice() {
        return invoice;
    }


    /**
     * Sets the invoice value for this Charge.
     * 
     * @param invoice
     */
    public void setInvoice(com.netsuite.webservices.platform.core_2019_1.RecordRef invoice) {
        this.invoice = invoice;
    }


    /**
     * Gets the invoiceLine value for this Charge.
     * 
     * @return invoiceLine
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInvoiceLine() {
        return invoiceLine;
    }


    /**
     * Sets the invoiceLine value for this Charge.
     * 
     * @param invoiceLine
     */
    public void setInvoiceLine(com.netsuite.webservices.platform.core_2019_1.RecordRef invoiceLine) {
        this.invoiceLine = invoiceLine;
    }


    /**
     * Gets the rule value for this Charge.
     * 
     * @return rule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Charge.
     * 
     * @param rule
     */
    public void setRule(com.netsuite.webservices.platform.core_2019_1.RecordRef rule) {
        this.rule = rule;
    }


    /**
     * Gets the runId value for this Charge.
     * 
     * @return runId
     */
    public java.lang.String getRunId() {
        return runId;
    }


    /**
     * Sets the runId value for this Charge.
     * 
     * @param runId
     */
    public void setRunId(java.lang.String runId) {
        this.runId = runId;
    }


    /**
     * Gets the internalId value for this Charge.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Charge.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Charge.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Charge.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Charge)) return false;
        Charge other = (Charge) obj;
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
            ((this.salesOrder==null && other.getSalesOrder()==null) || 
             (this.salesOrder!=null &&
              this.salesOrder.equals(other.getSalesOrder()))) &&
            ((this.billTo==null && other.getBillTo()==null) || 
             (this.billTo!=null &&
              this.billTo.equals(other.getBillTo()))) &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              this.stage.equals(other.getStage()))) &&
            ((this.chargeDate==null && other.getChargeDate()==null) || 
             (this.chargeDate!=null &&
              this.chargeDate.equals(other.getChargeDate()))) &&
            ((this.use==null && other.getUse()==null) || 
             (this.use!=null &&
              this.use.equals(other.getUse()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
            ((this.projectTask==null && other.getProjectTask()==null) || 
             (this.projectTask!=null &&
              this.projectTask.equals(other.getProjectTask()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.timeRecord==null && other.getTimeRecord()==null) || 
             (this.timeRecord!=null &&
              this.timeRecord.equals(other.getTimeRecord()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.billingItem==null && other.getBillingItem()==null) || 
             (this.billingItem!=null &&
              this.billingItem.equals(other.getBillingItem()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction()))) &&
            ((this.transactionLine==null && other.getTransactionLine()==null) || 
             (this.transactionLine!=null &&
              this.transactionLine.equals(other.getTransactionLine()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.salesOrderLine==null && other.getSalesOrderLine()==null) || 
             (this.salesOrderLine!=null &&
              this.salesOrderLine.equals(other.getSalesOrderLine()))) &&
            ((this.subscriptionLine==null && other.getSubscriptionLine()==null) || 
             (this.subscriptionLine!=null &&
              this.subscriptionLine.equals(other.getSubscriptionLine()))) &&
            ((this.invoice==null && other.getInvoice()==null) || 
             (this.invoice!=null &&
              this.invoice.equals(other.getInvoice()))) &&
            ((this.invoiceLine==null && other.getInvoiceLine()==null) || 
             (this.invoiceLine!=null &&
              this.invoiceLine.equals(other.getInvoiceLine()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.runId==null && other.getRunId()==null) || 
             (this.runId!=null &&
              this.runId.equals(other.getRunId()))) &&
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
        if (getSalesOrder() != null) {
            _hashCode += getSalesOrder().hashCode();
        }
        if (getBillTo() != null) {
            _hashCode += getBillTo().hashCode();
        }
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getStage() != null) {
            _hashCode += getStage().hashCode();
        }
        if (getChargeDate() != null) {
            _hashCode += getChargeDate().hashCode();
        }
        if (getUse() != null) {
            _hashCode += getUse().hashCode();
        }
        if (getChargeType() != null) {
            _hashCode += getChargeType().hashCode();
        }
        if (getProjectTask() != null) {
            _hashCode += getProjectTask().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getTimeRecord() != null) {
            _hashCode += getTimeRecord().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBillingItem() != null) {
            _hashCode += getBillingItem().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        if (getTransactionLine() != null) {
            _hashCode += getTransactionLine().hashCode();
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
        if (getSalesOrderLine() != null) {
            _hashCode += getSalesOrderLine().hashCode();
        }
        if (getSubscriptionLine() != null) {
            _hashCode += getSubscriptionLine().hashCode();
        }
        if (getInvoice() != null) {
            _hashCode += getInvoice().hashCode();
        }
        if (getInvoiceLine() != null) {
            _hashCode += getInvoiceLine().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getRunId() != null) {
            _hashCode += getRunId().hashCode();
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
        new org.apache.axis.description.TypeDesc(Charge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "Charge"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "billTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "ChargeStage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "chargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "use"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customers_2019_1.transactions.webservices.netsuite.com", "ChargeUse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "chargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "projectTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "timeRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "billingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "transactionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrderLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "salesOrderLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "invoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "invoiceLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "runId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
