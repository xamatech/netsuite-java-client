/**
 * SalesOrderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class SalesOrderItem  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef job;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subscription;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.Double quantityAvailable;

    private java.lang.Boolean expandItemGroup;

    private java.lang.Long lineUniqueKey;

    private java.lang.Double quantityOnHand;

    private java.lang.Double quantity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef units;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail;

    private java.lang.String description;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef price;

    private java.lang.String rate;

    private java.lang.String serialNumbers;

    private java.lang.Double amount;

    private java.lang.Boolean isTaxable;

    private com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemCommitInventory commitInventory;

    private java.lang.Double orderPriority;

    private java.lang.String licenseCode;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList options;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemCreatePo createPo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createdPo;

    private java.lang.Double altSalesAmt;

    private java.lang.Boolean createWo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef poVendor;

    private java.lang.String poCurrency;

    private java.lang.Double poRate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule;

    private java.util.Calendar revRecStartDate;

    private java.lang.Long revRecTermInMonths;

    private java.util.Calendar revRecEndDate;

    private java.lang.Boolean deferRevRec;

    private java.lang.Boolean isClosed;

    private com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemFulfillmentChoice itemFulfillmentChoice;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef catchUpPeriod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule;

    private java.lang.Boolean fromJob;

    private java.lang.Double grossAmt;

    private java.lang.Double taxAmount;

    private java.lang.Boolean excludeFromRateRequest;

    private java.lang.Boolean isEstimate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef inventoryLocation;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef inventorySubsidiary;

    private java.lang.Long line;

    private java.lang.Double percentComplete;

    private com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType costEstimateType;

    private java.lang.Double costEstimate;

    private java.lang.Double quantityBackOrdered;

    private java.lang.Double quantityBilled;

    private java.lang.Double quantityCommitted;

    private java.lang.Double quantityFulfilled;

    private java.lang.Double quantityPacked;

    private java.lang.Double quantityPicked;

    private java.lang.Double tax1Amt;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode;

    private java.lang.Double taxRate1;

    private java.lang.Double taxRate2;

    private java.lang.String giftCertFrom;

    private java.lang.String giftCertRecipientName;

    private java.lang.String giftCertRecipientEmail;

    private java.lang.String giftCertMessage;

    private java.lang.String giftCertNumber;

    private java.lang.Long shipGroup;

    private java.lang.Boolean itemIsFulfilled;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddress;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup vsoeSopGroup;

    private java.lang.Boolean vsoeIsEstimate;

    private java.lang.Double vsoePrice;

    private java.lang.Double vsoeAmount;

    private java.lang.Double vsoeAllocation;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount;

    private java.lang.Boolean vsoeDelivered;

    private java.util.Calendar expectedShipDate;

    private java.lang.Boolean noAutoAssignLocation;

    private java.lang.Boolean locationAutoAssigned;

    private java.lang.String taxDetailsReference;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef chargeType;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    public SalesOrderItem() {
    }

    public SalesOrderItem(
           com.netsuite.webservices.platform.core_2019_1.RecordRef job,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subscription,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.Double quantityAvailable,
           java.lang.Boolean expandItemGroup,
           java.lang.Long lineUniqueKey,
           java.lang.Double quantityOnHand,
           java.lang.Double quantity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef units,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail,
           java.lang.String description,
           com.netsuite.webservices.platform.core_2019_1.RecordRef price,
           java.lang.String rate,
           java.lang.String serialNumbers,
           java.lang.Double amount,
           java.lang.Boolean isTaxable,
           com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemCommitInventory commitInventory,
           java.lang.Double orderPriority,
           java.lang.String licenseCode,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList options,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemCreatePo createPo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createdPo,
           java.lang.Double altSalesAmt,
           java.lang.Boolean createWo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef poVendor,
           java.lang.String poCurrency,
           java.lang.Double poRate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule,
           java.util.Calendar revRecStartDate,
           java.lang.Long revRecTermInMonths,
           java.util.Calendar revRecEndDate,
           java.lang.Boolean deferRevRec,
           java.lang.Boolean isClosed,
           com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemFulfillmentChoice itemFulfillmentChoice,
           com.netsuite.webservices.platform.core_2019_1.RecordRef catchUpPeriod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule,
           java.lang.Boolean fromJob,
           java.lang.Double grossAmt,
           java.lang.Double taxAmount,
           java.lang.Boolean excludeFromRateRequest,
           java.lang.Boolean isEstimate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef inventoryLocation,
           com.netsuite.webservices.platform.core_2019_1.RecordRef inventorySubsidiary,
           java.lang.Long line,
           java.lang.Double percentComplete,
           com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType costEstimateType,
           java.lang.Double costEstimate,
           java.lang.Double quantityBackOrdered,
           java.lang.Double quantityBilled,
           java.lang.Double quantityCommitted,
           java.lang.Double quantityFulfilled,
           java.lang.Double quantityPacked,
           java.lang.Double quantityPicked,
           java.lang.Double tax1Amt,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode,
           java.lang.Double taxRate1,
           java.lang.Double taxRate2,
           java.lang.String giftCertFrom,
           java.lang.String giftCertRecipientName,
           java.lang.String giftCertRecipientEmail,
           java.lang.String giftCertMessage,
           java.lang.String giftCertNumber,
           java.lang.Long shipGroup,
           java.lang.Boolean itemIsFulfilled,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddress,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod,
           com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup vsoeSopGroup,
           java.lang.Boolean vsoeIsEstimate,
           java.lang.Double vsoePrice,
           java.lang.Double vsoeAmount,
           java.lang.Double vsoeAllocation,
           com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral,
           com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount,
           java.lang.Boolean vsoeDelivered,
           java.util.Calendar expectedShipDate,
           java.lang.Boolean noAutoAssignLocation,
           java.lang.Boolean locationAutoAssigned,
           java.lang.String taxDetailsReference,
           com.netsuite.webservices.platform.core_2019_1.RecordRef chargeType,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
           this.job = job;
           this.subscription = subscription;
           this.item = item;
           this.quantityAvailable = quantityAvailable;
           this.expandItemGroup = expandItemGroup;
           this.lineUniqueKey = lineUniqueKey;
           this.quantityOnHand = quantityOnHand;
           this.quantity = quantity;
           this.units = units;
           this.inventoryDetail = inventoryDetail;
           this.description = description;
           this.price = price;
           this.rate = rate;
           this.serialNumbers = serialNumbers;
           this.amount = amount;
           this.isTaxable = isTaxable;
           this.commitInventory = commitInventory;
           this.orderPriority = orderPriority;
           this.licenseCode = licenseCode;
           this.options = options;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.createPo = createPo;
           this.createdPo = createdPo;
           this.altSalesAmt = altSalesAmt;
           this.createWo = createWo;
           this.poVendor = poVendor;
           this.poCurrency = poCurrency;
           this.poRate = poRate;
           this.revRecSchedule = revRecSchedule;
           this.revRecStartDate = revRecStartDate;
           this.revRecTermInMonths = revRecTermInMonths;
           this.revRecEndDate = revRecEndDate;
           this.deferRevRec = deferRevRec;
           this.isClosed = isClosed;
           this.itemFulfillmentChoice = itemFulfillmentChoice;
           this.catchUpPeriod = catchUpPeriod;
           this.billingSchedule = billingSchedule;
           this.fromJob = fromJob;
           this.grossAmt = grossAmt;
           this.taxAmount = taxAmount;
           this.excludeFromRateRequest = excludeFromRateRequest;
           this.isEstimate = isEstimate;
           this.inventoryLocation = inventoryLocation;
           this.inventorySubsidiary = inventorySubsidiary;
           this.line = line;
           this.percentComplete = percentComplete;
           this.costEstimateType = costEstimateType;
           this.costEstimate = costEstimate;
           this.quantityBackOrdered = quantityBackOrdered;
           this.quantityBilled = quantityBilled;
           this.quantityCommitted = quantityCommitted;
           this.quantityFulfilled = quantityFulfilled;
           this.quantityPacked = quantityPacked;
           this.quantityPicked = quantityPicked;
           this.tax1Amt = tax1Amt;
           this.taxCode = taxCode;
           this.taxRate1 = taxRate1;
           this.taxRate2 = taxRate2;
           this.giftCertFrom = giftCertFrom;
           this.giftCertRecipientName = giftCertRecipientName;
           this.giftCertRecipientEmail = giftCertRecipientEmail;
           this.giftCertMessage = giftCertMessage;
           this.giftCertNumber = giftCertNumber;
           this.shipGroup = shipGroup;
           this.itemIsFulfilled = itemIsFulfilled;
           this.shipAddress = shipAddress;
           this.shipMethod = shipMethod;
           this.vsoeSopGroup = vsoeSopGroup;
           this.vsoeIsEstimate = vsoeIsEstimate;
           this.vsoePrice = vsoePrice;
           this.vsoeAmount = vsoeAmount;
           this.vsoeAllocation = vsoeAllocation;
           this.vsoeDeferral = vsoeDeferral;
           this.vsoePermitDiscount = vsoePermitDiscount;
           this.vsoeDelivered = vsoeDelivered;
           this.expectedShipDate = expectedShipDate;
           this.noAutoAssignLocation = noAutoAssignLocation;
           this.locationAutoAssigned = locationAutoAssigned;
           this.taxDetailsReference = taxDetailsReference;
           this.chargeType = chargeType;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the job value for this SalesOrderItem.
     * 
     * @return job
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this SalesOrderItem.
     * 
     * @param job
     */
    public void setJob(com.netsuite.webservices.platform.core_2019_1.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the subscription value for this SalesOrderItem.
     * 
     * @return subscription
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this SalesOrderItem.
     * 
     * @param subscription
     */
    public void setSubscription(com.netsuite.webservices.platform.core_2019_1.RecordRef subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the item value for this SalesOrderItem.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this SalesOrderItem.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the quantityAvailable value for this SalesOrderItem.
     * 
     * @return quantityAvailable
     */
    public java.lang.Double getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this SalesOrderItem.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(java.lang.Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the expandItemGroup value for this SalesOrderItem.
     * 
     * @return expandItemGroup
     */
    public java.lang.Boolean getExpandItemGroup() {
        return expandItemGroup;
    }


    /**
     * Sets the expandItemGroup value for this SalesOrderItem.
     * 
     * @param expandItemGroup
     */
    public void setExpandItemGroup(java.lang.Boolean expandItemGroup) {
        this.expandItemGroup = expandItemGroup;
    }


    /**
     * Gets the lineUniqueKey value for this SalesOrderItem.
     * 
     * @return lineUniqueKey
     */
    public java.lang.Long getLineUniqueKey() {
        return lineUniqueKey;
    }


    /**
     * Sets the lineUniqueKey value for this SalesOrderItem.
     * 
     * @param lineUniqueKey
     */
    public void setLineUniqueKey(java.lang.Long lineUniqueKey) {
        this.lineUniqueKey = lineUniqueKey;
    }


    /**
     * Gets the quantityOnHand value for this SalesOrderItem.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this SalesOrderItem.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the quantity value for this SalesOrderItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this SalesOrderItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this SalesOrderItem.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this SalesOrderItem.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the inventoryDetail value for this SalesOrderItem.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this SalesOrderItem.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the description value for this SalesOrderItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SalesOrderItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the price value for this SalesOrderItem.
     * 
     * @return price
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPrice() {
        return price;
    }


    /**
     * Sets the price value for this SalesOrderItem.
     * 
     * @param price
     */
    public void setPrice(com.netsuite.webservices.platform.core_2019_1.RecordRef price) {
        this.price = price;
    }


    /**
     * Gets the rate value for this SalesOrderItem.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this SalesOrderItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the serialNumbers value for this SalesOrderItem.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this SalesOrderItem.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the amount value for this SalesOrderItem.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SalesOrderItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the isTaxable value for this SalesOrderItem.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this SalesOrderItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the commitInventory value for this SalesOrderItem.
     * 
     * @return commitInventory
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemCommitInventory getCommitInventory() {
        return commitInventory;
    }


    /**
     * Sets the commitInventory value for this SalesOrderItem.
     * 
     * @param commitInventory
     */
    public void setCommitInventory(com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemCommitInventory commitInventory) {
        this.commitInventory = commitInventory;
    }


    /**
     * Gets the orderPriority value for this SalesOrderItem.
     * 
     * @return orderPriority
     */
    public java.lang.Double getOrderPriority() {
        return orderPriority;
    }


    /**
     * Sets the orderPriority value for this SalesOrderItem.
     * 
     * @param orderPriority
     */
    public void setOrderPriority(java.lang.Double orderPriority) {
        this.orderPriority = orderPriority;
    }


    /**
     * Gets the licenseCode value for this SalesOrderItem.
     * 
     * @return licenseCode
     */
    public java.lang.String getLicenseCode() {
        return licenseCode;
    }


    /**
     * Sets the licenseCode value for this SalesOrderItem.
     * 
     * @param licenseCode
     */
    public void setLicenseCode(java.lang.String licenseCode) {
        this.licenseCode = licenseCode;
    }


    /**
     * Gets the options value for this SalesOrderItem.
     * 
     * @return options
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this SalesOrderItem.
     * 
     * @param options
     */
    public void setOptions(com.netsuite.webservices.platform.core_2019_1.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the department value for this SalesOrderItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this SalesOrderItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this SalesOrderItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this SalesOrderItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this SalesOrderItem.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this SalesOrderItem.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the createPo value for this SalesOrderItem.
     * 
     * @return createPo
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemCreatePo getCreatePo() {
        return createPo;
    }


    /**
     * Sets the createPo value for this SalesOrderItem.
     * 
     * @param createPo
     */
    public void setCreatePo(com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemCreatePo createPo) {
        this.createPo = createPo;
    }


    /**
     * Gets the createdPo value for this SalesOrderItem.
     * 
     * @return createdPo
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreatedPo() {
        return createdPo;
    }


    /**
     * Sets the createdPo value for this SalesOrderItem.
     * 
     * @param createdPo
     */
    public void setCreatedPo(com.netsuite.webservices.platform.core_2019_1.RecordRef createdPo) {
        this.createdPo = createdPo;
    }


    /**
     * Gets the altSalesAmt value for this SalesOrderItem.
     * 
     * @return altSalesAmt
     */
    public java.lang.Double getAltSalesAmt() {
        return altSalesAmt;
    }


    /**
     * Sets the altSalesAmt value for this SalesOrderItem.
     * 
     * @param altSalesAmt
     */
    public void setAltSalesAmt(java.lang.Double altSalesAmt) {
        this.altSalesAmt = altSalesAmt;
    }


    /**
     * Gets the createWo value for this SalesOrderItem.
     * 
     * @return createWo
     */
    public java.lang.Boolean getCreateWo() {
        return createWo;
    }


    /**
     * Sets the createWo value for this SalesOrderItem.
     * 
     * @param createWo
     */
    public void setCreateWo(java.lang.Boolean createWo) {
        this.createWo = createWo;
    }


    /**
     * Gets the poVendor value for this SalesOrderItem.
     * 
     * @return poVendor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPoVendor() {
        return poVendor;
    }


    /**
     * Sets the poVendor value for this SalesOrderItem.
     * 
     * @param poVendor
     */
    public void setPoVendor(com.netsuite.webservices.platform.core_2019_1.RecordRef poVendor) {
        this.poVendor = poVendor;
    }


    /**
     * Gets the poCurrency value for this SalesOrderItem.
     * 
     * @return poCurrency
     */
    public java.lang.String getPoCurrency() {
        return poCurrency;
    }


    /**
     * Sets the poCurrency value for this SalesOrderItem.
     * 
     * @param poCurrency
     */
    public void setPoCurrency(java.lang.String poCurrency) {
        this.poCurrency = poCurrency;
    }


    /**
     * Gets the poRate value for this SalesOrderItem.
     * 
     * @return poRate
     */
    public java.lang.Double getPoRate() {
        return poRate;
    }


    /**
     * Sets the poRate value for this SalesOrderItem.
     * 
     * @param poRate
     */
    public void setPoRate(java.lang.Double poRate) {
        this.poRate = poRate;
    }


    /**
     * Gets the revRecSchedule value for this SalesOrderItem.
     * 
     * @return revRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this SalesOrderItem.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the revRecStartDate value for this SalesOrderItem.
     * 
     * @return revRecStartDate
     */
    public java.util.Calendar getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this SalesOrderItem.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(java.util.Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the revRecTermInMonths value for this SalesOrderItem.
     * 
     * @return revRecTermInMonths
     */
    public java.lang.Long getRevRecTermInMonths() {
        return revRecTermInMonths;
    }


    /**
     * Sets the revRecTermInMonths value for this SalesOrderItem.
     * 
     * @param revRecTermInMonths
     */
    public void setRevRecTermInMonths(java.lang.Long revRecTermInMonths) {
        this.revRecTermInMonths = revRecTermInMonths;
    }


    /**
     * Gets the revRecEndDate value for this SalesOrderItem.
     * 
     * @return revRecEndDate
     */
    public java.util.Calendar getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this SalesOrderItem.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(java.util.Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }


    /**
     * Gets the deferRevRec value for this SalesOrderItem.
     * 
     * @return deferRevRec
     */
    public java.lang.Boolean getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this SalesOrderItem.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(java.lang.Boolean deferRevRec) {
        this.deferRevRec = deferRevRec;
    }


    /**
     * Gets the isClosed value for this SalesOrderItem.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this SalesOrderItem.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the itemFulfillmentChoice value for this SalesOrderItem.
     * 
     * @return itemFulfillmentChoice
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemFulfillmentChoice getItemFulfillmentChoice() {
        return itemFulfillmentChoice;
    }


    /**
     * Sets the itemFulfillmentChoice value for this SalesOrderItem.
     * 
     * @param itemFulfillmentChoice
     */
    public void setItemFulfillmentChoice(com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderItemFulfillmentChoice itemFulfillmentChoice) {
        this.itemFulfillmentChoice = itemFulfillmentChoice;
    }


    /**
     * Gets the catchUpPeriod value for this SalesOrderItem.
     * 
     * @return catchUpPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCatchUpPeriod() {
        return catchUpPeriod;
    }


    /**
     * Sets the catchUpPeriod value for this SalesOrderItem.
     * 
     * @param catchUpPeriod
     */
    public void setCatchUpPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }


    /**
     * Gets the billingSchedule value for this SalesOrderItem.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this SalesOrderItem.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the fromJob value for this SalesOrderItem.
     * 
     * @return fromJob
     */
    public java.lang.Boolean getFromJob() {
        return fromJob;
    }


    /**
     * Sets the fromJob value for this SalesOrderItem.
     * 
     * @param fromJob
     */
    public void setFromJob(java.lang.Boolean fromJob) {
        this.fromJob = fromJob;
    }


    /**
     * Gets the grossAmt value for this SalesOrderItem.
     * 
     * @return grossAmt
     */
    public java.lang.Double getGrossAmt() {
        return grossAmt;
    }


    /**
     * Sets the grossAmt value for this SalesOrderItem.
     * 
     * @param grossAmt
     */
    public void setGrossAmt(java.lang.Double grossAmt) {
        this.grossAmt = grossAmt;
    }


    /**
     * Gets the taxAmount value for this SalesOrderItem.
     * 
     * @return taxAmount
     */
    public java.lang.Double getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this SalesOrderItem.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Double taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the excludeFromRateRequest value for this SalesOrderItem.
     * 
     * @return excludeFromRateRequest
     */
    public java.lang.Boolean getExcludeFromRateRequest() {
        return excludeFromRateRequest;
    }


    /**
     * Sets the excludeFromRateRequest value for this SalesOrderItem.
     * 
     * @param excludeFromRateRequest
     */
    public void setExcludeFromRateRequest(java.lang.Boolean excludeFromRateRequest) {
        this.excludeFromRateRequest = excludeFromRateRequest;
    }


    /**
     * Gets the isEstimate value for this SalesOrderItem.
     * 
     * @return isEstimate
     */
    public java.lang.Boolean getIsEstimate() {
        return isEstimate;
    }


    /**
     * Sets the isEstimate value for this SalesOrderItem.
     * 
     * @param isEstimate
     */
    public void setIsEstimate(java.lang.Boolean isEstimate) {
        this.isEstimate = isEstimate;
    }


    /**
     * Gets the inventoryLocation value for this SalesOrderItem.
     * 
     * @return inventoryLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInventoryLocation() {
        return inventoryLocation;
    }


    /**
     * Sets the inventoryLocation value for this SalesOrderItem.
     * 
     * @param inventoryLocation
     */
    public void setInventoryLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }


    /**
     * Gets the inventorySubsidiary value for this SalesOrderItem.
     * 
     * @return inventorySubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInventorySubsidiary() {
        return inventorySubsidiary;
    }


    /**
     * Sets the inventorySubsidiary value for this SalesOrderItem.
     * 
     * @param inventorySubsidiary
     */
    public void setInventorySubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef inventorySubsidiary) {
        this.inventorySubsidiary = inventorySubsidiary;
    }


    /**
     * Gets the line value for this SalesOrderItem.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this SalesOrderItem.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the percentComplete value for this SalesOrderItem.
     * 
     * @return percentComplete
     */
    public java.lang.Double getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this SalesOrderItem.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(java.lang.Double percentComplete) {
        this.percentComplete = percentComplete;
    }


    /**
     * Gets the costEstimateType value for this SalesOrderItem.
     * 
     * @return costEstimateType
     */
    public com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this SalesOrderItem.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the costEstimate value for this SalesOrderItem.
     * 
     * @return costEstimate
     */
    public java.lang.Double getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this SalesOrderItem.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(java.lang.Double costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the quantityBackOrdered value for this SalesOrderItem.
     * 
     * @return quantityBackOrdered
     */
    public java.lang.Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this SalesOrderItem.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.lang.Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the quantityBilled value for this SalesOrderItem.
     * 
     * @return quantityBilled
     */
    public java.lang.Double getQuantityBilled() {
        return quantityBilled;
    }


    /**
     * Sets the quantityBilled value for this SalesOrderItem.
     * 
     * @param quantityBilled
     */
    public void setQuantityBilled(java.lang.Double quantityBilled) {
        this.quantityBilled = quantityBilled;
    }


    /**
     * Gets the quantityCommitted value for this SalesOrderItem.
     * 
     * @return quantityCommitted
     */
    public java.lang.Double getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this SalesOrderItem.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(java.lang.Double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityFulfilled value for this SalesOrderItem.
     * 
     * @return quantityFulfilled
     */
    public java.lang.Double getQuantityFulfilled() {
        return quantityFulfilled;
    }


    /**
     * Sets the quantityFulfilled value for this SalesOrderItem.
     * 
     * @param quantityFulfilled
     */
    public void setQuantityFulfilled(java.lang.Double quantityFulfilled) {
        this.quantityFulfilled = quantityFulfilled;
    }


    /**
     * Gets the quantityPacked value for this SalesOrderItem.
     * 
     * @return quantityPacked
     */
    public java.lang.Double getQuantityPacked() {
        return quantityPacked;
    }


    /**
     * Sets the quantityPacked value for this SalesOrderItem.
     * 
     * @param quantityPacked
     */
    public void setQuantityPacked(java.lang.Double quantityPacked) {
        this.quantityPacked = quantityPacked;
    }


    /**
     * Gets the quantityPicked value for this SalesOrderItem.
     * 
     * @return quantityPicked
     */
    public java.lang.Double getQuantityPicked() {
        return quantityPicked;
    }


    /**
     * Sets the quantityPicked value for this SalesOrderItem.
     * 
     * @param quantityPicked
     */
    public void setQuantityPicked(java.lang.Double quantityPicked) {
        this.quantityPicked = quantityPicked;
    }


    /**
     * Gets the tax1Amt value for this SalesOrderItem.
     * 
     * @return tax1Amt
     */
    public java.lang.Double getTax1Amt() {
        return tax1Amt;
    }


    /**
     * Sets the tax1Amt value for this SalesOrderItem.
     * 
     * @param tax1Amt
     */
    public void setTax1Amt(java.lang.Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }


    /**
     * Gets the taxCode value for this SalesOrderItem.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this SalesOrderItem.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxRate1 value for this SalesOrderItem.
     * 
     * @return taxRate1
     */
    public java.lang.Double getTaxRate1() {
        return taxRate1;
    }


    /**
     * Sets the taxRate1 value for this SalesOrderItem.
     * 
     * @param taxRate1
     */
    public void setTaxRate1(java.lang.Double taxRate1) {
        this.taxRate1 = taxRate1;
    }


    /**
     * Gets the taxRate2 value for this SalesOrderItem.
     * 
     * @return taxRate2
     */
    public java.lang.Double getTaxRate2() {
        return taxRate2;
    }


    /**
     * Sets the taxRate2 value for this SalesOrderItem.
     * 
     * @param taxRate2
     */
    public void setTaxRate2(java.lang.Double taxRate2) {
        this.taxRate2 = taxRate2;
    }


    /**
     * Gets the giftCertFrom value for this SalesOrderItem.
     * 
     * @return giftCertFrom
     */
    public java.lang.String getGiftCertFrom() {
        return giftCertFrom;
    }


    /**
     * Sets the giftCertFrom value for this SalesOrderItem.
     * 
     * @param giftCertFrom
     */
    public void setGiftCertFrom(java.lang.String giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }


    /**
     * Gets the giftCertRecipientName value for this SalesOrderItem.
     * 
     * @return giftCertRecipientName
     */
    public java.lang.String getGiftCertRecipientName() {
        return giftCertRecipientName;
    }


    /**
     * Sets the giftCertRecipientName value for this SalesOrderItem.
     * 
     * @param giftCertRecipientName
     */
    public void setGiftCertRecipientName(java.lang.String giftCertRecipientName) {
        this.giftCertRecipientName = giftCertRecipientName;
    }


    /**
     * Gets the giftCertRecipientEmail value for this SalesOrderItem.
     * 
     * @return giftCertRecipientEmail
     */
    public java.lang.String getGiftCertRecipientEmail() {
        return giftCertRecipientEmail;
    }


    /**
     * Sets the giftCertRecipientEmail value for this SalesOrderItem.
     * 
     * @param giftCertRecipientEmail
     */
    public void setGiftCertRecipientEmail(java.lang.String giftCertRecipientEmail) {
        this.giftCertRecipientEmail = giftCertRecipientEmail;
    }


    /**
     * Gets the giftCertMessage value for this SalesOrderItem.
     * 
     * @return giftCertMessage
     */
    public java.lang.String getGiftCertMessage() {
        return giftCertMessage;
    }


    /**
     * Sets the giftCertMessage value for this SalesOrderItem.
     * 
     * @param giftCertMessage
     */
    public void setGiftCertMessage(java.lang.String giftCertMessage) {
        this.giftCertMessage = giftCertMessage;
    }


    /**
     * Gets the giftCertNumber value for this SalesOrderItem.
     * 
     * @return giftCertNumber
     */
    public java.lang.String getGiftCertNumber() {
        return giftCertNumber;
    }


    /**
     * Sets the giftCertNumber value for this SalesOrderItem.
     * 
     * @param giftCertNumber
     */
    public void setGiftCertNumber(java.lang.String giftCertNumber) {
        this.giftCertNumber = giftCertNumber;
    }


    /**
     * Gets the shipGroup value for this SalesOrderItem.
     * 
     * @return shipGroup
     */
    public java.lang.Long getShipGroup() {
        return shipGroup;
    }


    /**
     * Sets the shipGroup value for this SalesOrderItem.
     * 
     * @param shipGroup
     */
    public void setShipGroup(java.lang.Long shipGroup) {
        this.shipGroup = shipGroup;
    }


    /**
     * Gets the itemIsFulfilled value for this SalesOrderItem.
     * 
     * @return itemIsFulfilled
     */
    public java.lang.Boolean getItemIsFulfilled() {
        return itemIsFulfilled;
    }


    /**
     * Sets the itemIsFulfilled value for this SalesOrderItem.
     * 
     * @param itemIsFulfilled
     */
    public void setItemIsFulfilled(java.lang.Boolean itemIsFulfilled) {
        this.itemIsFulfilled = itemIsFulfilled;
    }


    /**
     * Gets the shipAddress value for this SalesOrderItem.
     * 
     * @return shipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this SalesOrderItem.
     * 
     * @param shipAddress
     */
    public void setShipAddress(com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the shipMethod value for this SalesOrderItem.
     * 
     * @return shipMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this SalesOrderItem.
     * 
     * @param shipMethod
     */
    public void setShipMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the vsoeSopGroup value for this SalesOrderItem.
     * 
     * @return vsoeSopGroup
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup getVsoeSopGroup() {
        return vsoeSopGroup;
    }


    /**
     * Sets the vsoeSopGroup value for this SalesOrderItem.
     * 
     * @param vsoeSopGroup
     */
    public void setVsoeSopGroup(com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup vsoeSopGroup) {
        this.vsoeSopGroup = vsoeSopGroup;
    }


    /**
     * Gets the vsoeIsEstimate value for this SalesOrderItem.
     * 
     * @return vsoeIsEstimate
     */
    public java.lang.Boolean getVsoeIsEstimate() {
        return vsoeIsEstimate;
    }


    /**
     * Sets the vsoeIsEstimate value for this SalesOrderItem.
     * 
     * @param vsoeIsEstimate
     */
    public void setVsoeIsEstimate(java.lang.Boolean vsoeIsEstimate) {
        this.vsoeIsEstimate = vsoeIsEstimate;
    }


    /**
     * Gets the vsoePrice value for this SalesOrderItem.
     * 
     * @return vsoePrice
     */
    public java.lang.Double getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this SalesOrderItem.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(java.lang.Double vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the vsoeAmount value for this SalesOrderItem.
     * 
     * @return vsoeAmount
     */
    public java.lang.Double getVsoeAmount() {
        return vsoeAmount;
    }


    /**
     * Sets the vsoeAmount value for this SalesOrderItem.
     * 
     * @param vsoeAmount
     */
    public void setVsoeAmount(java.lang.Double vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }


    /**
     * Gets the vsoeAllocation value for this SalesOrderItem.
     * 
     * @return vsoeAllocation
     */
    public java.lang.Double getVsoeAllocation() {
        return vsoeAllocation;
    }


    /**
     * Sets the vsoeAllocation value for this SalesOrderItem.
     * 
     * @param vsoeAllocation
     */
    public void setVsoeAllocation(java.lang.Double vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }


    /**
     * Gets the vsoeDeferral value for this SalesOrderItem.
     * 
     * @return vsoeDeferral
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this SalesOrderItem.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoePermitDiscount value for this SalesOrderItem.
     * 
     * @return vsoePermitDiscount
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this SalesOrderItem.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoeDelivered value for this SalesOrderItem.
     * 
     * @return vsoeDelivered
     */
    public java.lang.Boolean getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this SalesOrderItem.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(java.lang.Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the expectedShipDate value for this SalesOrderItem.
     * 
     * @return expectedShipDate
     */
    public java.util.Calendar getExpectedShipDate() {
        return expectedShipDate;
    }


    /**
     * Sets the expectedShipDate value for this SalesOrderItem.
     * 
     * @param expectedShipDate
     */
    public void setExpectedShipDate(java.util.Calendar expectedShipDate) {
        this.expectedShipDate = expectedShipDate;
    }


    /**
     * Gets the noAutoAssignLocation value for this SalesOrderItem.
     * 
     * @return noAutoAssignLocation
     */
    public java.lang.Boolean getNoAutoAssignLocation() {
        return noAutoAssignLocation;
    }


    /**
     * Sets the noAutoAssignLocation value for this SalesOrderItem.
     * 
     * @param noAutoAssignLocation
     */
    public void setNoAutoAssignLocation(java.lang.Boolean noAutoAssignLocation) {
        this.noAutoAssignLocation = noAutoAssignLocation;
    }


    /**
     * Gets the locationAutoAssigned value for this SalesOrderItem.
     * 
     * @return locationAutoAssigned
     */
    public java.lang.Boolean getLocationAutoAssigned() {
        return locationAutoAssigned;
    }


    /**
     * Sets the locationAutoAssigned value for this SalesOrderItem.
     * 
     * @param locationAutoAssigned
     */
    public void setLocationAutoAssigned(java.lang.Boolean locationAutoAssigned) {
        this.locationAutoAssigned = locationAutoAssigned;
    }


    /**
     * Gets the taxDetailsReference value for this SalesOrderItem.
     * 
     * @return taxDetailsReference
     */
    public java.lang.String getTaxDetailsReference() {
        return taxDetailsReference;
    }


    /**
     * Sets the taxDetailsReference value for this SalesOrderItem.
     * 
     * @param taxDetailsReference
     */
    public void setTaxDetailsReference(java.lang.String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }


    /**
     * Gets the chargeType value for this SalesOrderItem.
     * 
     * @return chargeType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this SalesOrderItem.
     * 
     * @param chargeType
     */
    public void setChargeType(com.netsuite.webservices.platform.core_2019_1.RecordRef chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the customFieldList value for this SalesOrderItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SalesOrderItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrderItem)) return false;
        SalesOrderItem other = (SalesOrderItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.expandItemGroup==null && other.getExpandItemGroup()==null) || 
             (this.expandItemGroup!=null &&
              this.expandItemGroup.equals(other.getExpandItemGroup()))) &&
            ((this.lineUniqueKey==null && other.getLineUniqueKey()==null) || 
             (this.lineUniqueKey!=null &&
              this.lineUniqueKey.equals(other.getLineUniqueKey()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.commitInventory==null && other.getCommitInventory()==null) || 
             (this.commitInventory!=null &&
              this.commitInventory.equals(other.getCommitInventory()))) &&
            ((this.orderPriority==null && other.getOrderPriority()==null) || 
             (this.orderPriority!=null &&
              this.orderPriority.equals(other.getOrderPriority()))) &&
            ((this.licenseCode==null && other.getLicenseCode()==null) || 
             (this.licenseCode!=null &&
              this.licenseCode.equals(other.getLicenseCode()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.createPo==null && other.getCreatePo()==null) || 
             (this.createPo!=null &&
              this.createPo.equals(other.getCreatePo()))) &&
            ((this.createdPo==null && other.getCreatedPo()==null) || 
             (this.createdPo!=null &&
              this.createdPo.equals(other.getCreatedPo()))) &&
            ((this.altSalesAmt==null && other.getAltSalesAmt()==null) || 
             (this.altSalesAmt!=null &&
              this.altSalesAmt.equals(other.getAltSalesAmt()))) &&
            ((this.createWo==null && other.getCreateWo()==null) || 
             (this.createWo!=null &&
              this.createWo.equals(other.getCreateWo()))) &&
            ((this.poVendor==null && other.getPoVendor()==null) || 
             (this.poVendor!=null &&
              this.poVendor.equals(other.getPoVendor()))) &&
            ((this.poCurrency==null && other.getPoCurrency()==null) || 
             (this.poCurrency!=null &&
              this.poCurrency.equals(other.getPoCurrency()))) &&
            ((this.poRate==null && other.getPoRate()==null) || 
             (this.poRate!=null &&
              this.poRate.equals(other.getPoRate()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              this.revRecStartDate.equals(other.getRevRecStartDate()))) &&
            ((this.revRecTermInMonths==null && other.getRevRecTermInMonths()==null) || 
             (this.revRecTermInMonths!=null &&
              this.revRecTermInMonths.equals(other.getRevRecTermInMonths()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              this.revRecEndDate.equals(other.getRevRecEndDate()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              this.deferRevRec.equals(other.getDeferRevRec()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.itemFulfillmentChoice==null && other.getItemFulfillmentChoice()==null) || 
             (this.itemFulfillmentChoice!=null &&
              this.itemFulfillmentChoice.equals(other.getItemFulfillmentChoice()))) &&
            ((this.catchUpPeriod==null && other.getCatchUpPeriod()==null) || 
             (this.catchUpPeriod!=null &&
              this.catchUpPeriod.equals(other.getCatchUpPeriod()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.fromJob==null && other.getFromJob()==null) || 
             (this.fromJob!=null &&
              this.fromJob.equals(other.getFromJob()))) &&
            ((this.grossAmt==null && other.getGrossAmt()==null) || 
             (this.grossAmt!=null &&
              this.grossAmt.equals(other.getGrossAmt()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.excludeFromRateRequest==null && other.getExcludeFromRateRequest()==null) || 
             (this.excludeFromRateRequest!=null &&
              this.excludeFromRateRequest.equals(other.getExcludeFromRateRequest()))) &&
            ((this.isEstimate==null && other.getIsEstimate()==null) || 
             (this.isEstimate!=null &&
              this.isEstimate.equals(other.getIsEstimate()))) &&
            ((this.inventoryLocation==null && other.getInventoryLocation()==null) || 
             (this.inventoryLocation!=null &&
              this.inventoryLocation.equals(other.getInventoryLocation()))) &&
            ((this.inventorySubsidiary==null && other.getInventorySubsidiary()==null) || 
             (this.inventorySubsidiary!=null &&
              this.inventorySubsidiary.equals(other.getInventorySubsidiary()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              this.percentComplete.equals(other.getPercentComplete()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.quantityBilled==null && other.getQuantityBilled()==null) || 
             (this.quantityBilled!=null &&
              this.quantityBilled.equals(other.getQuantityBilled()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityFulfilled==null && other.getQuantityFulfilled()==null) || 
             (this.quantityFulfilled!=null &&
              this.quantityFulfilled.equals(other.getQuantityFulfilled()))) &&
            ((this.quantityPacked==null && other.getQuantityPacked()==null) || 
             (this.quantityPacked!=null &&
              this.quantityPacked.equals(other.getQuantityPacked()))) &&
            ((this.quantityPicked==null && other.getQuantityPicked()==null) || 
             (this.quantityPicked!=null &&
              this.quantityPicked.equals(other.getQuantityPicked()))) &&
            ((this.tax1Amt==null && other.getTax1Amt()==null) || 
             (this.tax1Amt!=null &&
              this.tax1Amt.equals(other.getTax1Amt()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxRate1==null && other.getTaxRate1()==null) || 
             (this.taxRate1!=null &&
              this.taxRate1.equals(other.getTaxRate1()))) &&
            ((this.taxRate2==null && other.getTaxRate2()==null) || 
             (this.taxRate2!=null &&
              this.taxRate2.equals(other.getTaxRate2()))) &&
            ((this.giftCertFrom==null && other.getGiftCertFrom()==null) || 
             (this.giftCertFrom!=null &&
              this.giftCertFrom.equals(other.getGiftCertFrom()))) &&
            ((this.giftCertRecipientName==null && other.getGiftCertRecipientName()==null) || 
             (this.giftCertRecipientName!=null &&
              this.giftCertRecipientName.equals(other.getGiftCertRecipientName()))) &&
            ((this.giftCertRecipientEmail==null && other.getGiftCertRecipientEmail()==null) || 
             (this.giftCertRecipientEmail!=null &&
              this.giftCertRecipientEmail.equals(other.getGiftCertRecipientEmail()))) &&
            ((this.giftCertMessage==null && other.getGiftCertMessage()==null) || 
             (this.giftCertMessage!=null &&
              this.giftCertMessage.equals(other.getGiftCertMessage()))) &&
            ((this.giftCertNumber==null && other.getGiftCertNumber()==null) || 
             (this.giftCertNumber!=null &&
              this.giftCertNumber.equals(other.getGiftCertNumber()))) &&
            ((this.shipGroup==null && other.getShipGroup()==null) || 
             (this.shipGroup!=null &&
              this.shipGroup.equals(other.getShipGroup()))) &&
            ((this.itemIsFulfilled==null && other.getItemIsFulfilled()==null) || 
             (this.itemIsFulfilled!=null &&
              this.itemIsFulfilled.equals(other.getItemIsFulfilled()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.vsoeSopGroup==null && other.getVsoeSopGroup()==null) || 
             (this.vsoeSopGroup!=null &&
              this.vsoeSopGroup.equals(other.getVsoeSopGroup()))) &&
            ((this.vsoeIsEstimate==null && other.getVsoeIsEstimate()==null) || 
             (this.vsoeIsEstimate!=null &&
              this.vsoeIsEstimate.equals(other.getVsoeIsEstimate()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.vsoeAmount==null && other.getVsoeAmount()==null) || 
             (this.vsoeAmount!=null &&
              this.vsoeAmount.equals(other.getVsoeAmount()))) &&
            ((this.vsoeAllocation==null && other.getVsoeAllocation()==null) || 
             (this.vsoeAllocation!=null &&
              this.vsoeAllocation.equals(other.getVsoeAllocation()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
            ((this.expectedShipDate==null && other.getExpectedShipDate()==null) || 
             (this.expectedShipDate!=null &&
              this.expectedShipDate.equals(other.getExpectedShipDate()))) &&
            ((this.noAutoAssignLocation==null && other.getNoAutoAssignLocation()==null) || 
             (this.noAutoAssignLocation!=null &&
              this.noAutoAssignLocation.equals(other.getNoAutoAssignLocation()))) &&
            ((this.locationAutoAssigned==null && other.getLocationAutoAssigned()==null) || 
             (this.locationAutoAssigned!=null &&
              this.locationAutoAssigned.equals(other.getLocationAutoAssigned()))) &&
            ((this.taxDetailsReference==null && other.getTaxDetailsReference()==null) || 
             (this.taxDetailsReference!=null &&
              this.taxDetailsReference.equals(other.getTaxDetailsReference()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
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
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getExpandItemGroup() != null) {
            _hashCode += getExpandItemGroup().hashCode();
        }
        if (getLineUniqueKey() != null) {
            _hashCode += getLineUniqueKey().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getInventoryDetail() != null) {
            _hashCode += getInventoryDetail().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getCommitInventory() != null) {
            _hashCode += getCommitInventory().hashCode();
        }
        if (getOrderPriority() != null) {
            _hashCode += getOrderPriority().hashCode();
        }
        if (getLicenseCode() != null) {
            _hashCode += getLicenseCode().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
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
        if (getCreatePo() != null) {
            _hashCode += getCreatePo().hashCode();
        }
        if (getCreatedPo() != null) {
            _hashCode += getCreatedPo().hashCode();
        }
        if (getAltSalesAmt() != null) {
            _hashCode += getAltSalesAmt().hashCode();
        }
        if (getCreateWo() != null) {
            _hashCode += getCreateWo().hashCode();
        }
        if (getPoVendor() != null) {
            _hashCode += getPoVendor().hashCode();
        }
        if (getPoCurrency() != null) {
            _hashCode += getPoCurrency().hashCode();
        }
        if (getPoRate() != null) {
            _hashCode += getPoRate().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getRevRecStartDate() != null) {
            _hashCode += getRevRecStartDate().hashCode();
        }
        if (getRevRecTermInMonths() != null) {
            _hashCode += getRevRecTermInMonths().hashCode();
        }
        if (getRevRecEndDate() != null) {
            _hashCode += getRevRecEndDate().hashCode();
        }
        if (getDeferRevRec() != null) {
            _hashCode += getDeferRevRec().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getItemFulfillmentChoice() != null) {
            _hashCode += getItemFulfillmentChoice().hashCode();
        }
        if (getCatchUpPeriod() != null) {
            _hashCode += getCatchUpPeriod().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getFromJob() != null) {
            _hashCode += getFromJob().hashCode();
        }
        if (getGrossAmt() != null) {
            _hashCode += getGrossAmt().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getExcludeFromRateRequest() != null) {
            _hashCode += getExcludeFromRateRequest().hashCode();
        }
        if (getIsEstimate() != null) {
            _hashCode += getIsEstimate().hashCode();
        }
        if (getInventoryLocation() != null) {
            _hashCode += getInventoryLocation().hashCode();
        }
        if (getInventorySubsidiary() != null) {
            _hashCode += getInventorySubsidiary().hashCode();
        }
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getPercentComplete() != null) {
            _hashCode += getPercentComplete().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getQuantityBilled() != null) {
            _hashCode += getQuantityBilled().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityFulfilled() != null) {
            _hashCode += getQuantityFulfilled().hashCode();
        }
        if (getQuantityPacked() != null) {
            _hashCode += getQuantityPacked().hashCode();
        }
        if (getQuantityPicked() != null) {
            _hashCode += getQuantityPicked().hashCode();
        }
        if (getTax1Amt() != null) {
            _hashCode += getTax1Amt().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxRate1() != null) {
            _hashCode += getTaxRate1().hashCode();
        }
        if (getTaxRate2() != null) {
            _hashCode += getTaxRate2().hashCode();
        }
        if (getGiftCertFrom() != null) {
            _hashCode += getGiftCertFrom().hashCode();
        }
        if (getGiftCertRecipientName() != null) {
            _hashCode += getGiftCertRecipientName().hashCode();
        }
        if (getGiftCertRecipientEmail() != null) {
            _hashCode += getGiftCertRecipientEmail().hashCode();
        }
        if (getGiftCertMessage() != null) {
            _hashCode += getGiftCertMessage().hashCode();
        }
        if (getGiftCertNumber() != null) {
            _hashCode += getGiftCertNumber().hashCode();
        }
        if (getShipGroup() != null) {
            _hashCode += getShipGroup().hashCode();
        }
        if (getItemIsFulfilled() != null) {
            _hashCode += getItemIsFulfilled().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getVsoeSopGroup() != null) {
            _hashCode += getVsoeSopGroup().hashCode();
        }
        if (getVsoeIsEstimate() != null) {
            _hashCode += getVsoeIsEstimate().hashCode();
        }
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getVsoeAmount() != null) {
            _hashCode += getVsoeAmount().hashCode();
        }
        if (getVsoeAllocation() != null) {
            _hashCode += getVsoeAllocation().hashCode();
        }
        if (getVsoeDeferral() != null) {
            _hashCode += getVsoeDeferral().hashCode();
        }
        if (getVsoePermitDiscount() != null) {
            _hashCode += getVsoePermitDiscount().hashCode();
        }
        if (getVsoeDelivered() != null) {
            _hashCode += getVsoeDelivered().hashCode();
        }
        if (getExpectedShipDate() != null) {
            _hashCode += getExpectedShipDate().hashCode();
        }
        if (getNoAutoAssignLocation() != null) {
            _hashCode += getNoAutoAssignLocation().hashCode();
        }
        if (getLocationAutoAssigned() != null) {
            _hashCode += getLocationAutoAssigned().hashCode();
        }
        if (getTaxDetailsReference() != null) {
            _hashCode += getTaxDetailsReference().hashCode();
        }
        if (getChargeType() != null) {
            _hashCode += getChargeType().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesOrderItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandItemGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expandItemGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineUniqueKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "lineUniqueKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitInventory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "commitInventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderItemCommitInventory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "orderPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "licenseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createPo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "createPo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderItemCreatePo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdPo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "createdPo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "altSalesAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createWo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "createWo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "poVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "poCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecTermInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecTermInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFulfillmentChoice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemFulfillmentChoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderItemFulfillmentChoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fromJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromRateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "excludeFromRateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventorySubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "inventorySubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "ItemCostEstimateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityFulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantityFulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxRate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipientName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "giftCertRecipientName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "giftCertRecipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "giftCertMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "giftCertNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemIsFulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemIsFulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeSopGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vsoeSopGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "VsoeSopGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeIsEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vsoeIsEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expectedShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noAutoAssignLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "noAutoAssignLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAutoAssigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "locationAutoAssigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "chargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
