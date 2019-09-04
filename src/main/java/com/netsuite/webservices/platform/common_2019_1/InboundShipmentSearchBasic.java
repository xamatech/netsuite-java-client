/**
 * InboundShipmentSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class InboundShipmentSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDateField actualDeliveryDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField actualShippingDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billOfLading;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField description;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedDeliveryDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField expectedRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedShippingDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalDocumentNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incoterm;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField itemEffectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField itemExchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField landedCostAllocationMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField landedCostAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField landedCostCostCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField landedCostCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField landedCostEffectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField landedCostExchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField poAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField poRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField purchaseOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityBilled;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityExpected;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityReceived;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityRemaining;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField receivingLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipmentBaseCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipmentNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField totalUnitCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitLandedCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vendor;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField vesselNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public InboundShipmentSearchBasic() {
    }

    public InboundShipmentSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDateField actualDeliveryDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField actualShippingDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField billOfLading,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField description,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedDeliveryDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField expectedRate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedShippingDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalDocumentNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incoterm,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField itemEffectiveDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField itemExchangeRate,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField landedCostAllocationMethod,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField landedCostAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField landedCostCostCategory,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField landedCostCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField landedCostEffectiveDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField landedCostExchangeRate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField memo,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField poAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField poRate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField purchaseOrder,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityBilled,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityExpected,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityReceived,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityRemaining,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField receivingLocation,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipmentBaseCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipmentNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField totalUnitCost,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unit,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitLandedCost,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vendor,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField vesselNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.actualDeliveryDate = actualDeliveryDate;
        this.actualShippingDate = actualShippingDate;
        this.billOfLading = billOfLading;
        this.createdDate = createdDate;
        this.currency = currency;
        this.description = description;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.expectedRate = expectedRate;
        this.expectedShippingDate = expectedShippingDate;
        this.externalDocumentNumber = externalDocumentNumber;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.incoterm = incoterm;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.itemEffectiveDate = itemEffectiveDate;
        this.itemExchangeRate = itemExchangeRate;
        this.landedCostAllocationMethod = landedCostAllocationMethod;
        this.landedCostAmount = landedCostAmount;
        this.landedCostCostCategory = landedCostCostCategory;
        this.landedCostCurrency = landedCostCurrency;
        this.landedCostEffectiveDate = landedCostEffectiveDate;
        this.landedCostExchangeRate = landedCostExchangeRate;
        this.memo = memo;
        this.poAmount = poAmount;
        this.poRate = poRate;
        this.purchaseOrder = purchaseOrder;
        this.quantityBilled = quantityBilled;
        this.quantityExpected = quantityExpected;
        this.quantityReceived = quantityReceived;
        this.quantityRemaining = quantityRemaining;
        this.receivingLocation = receivingLocation;
        this.shipmentBaseCurrency = shipmentBaseCurrency;
        this.shipmentNumber = shipmentNumber;
        this.status = status;
        this.totalUnitCost = totalUnitCost;
        this.unit = unit;
        this.unitLandedCost = unitLandedCost;
        this.vendor = vendor;
        this.vesselNumber = vesselNumber;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the actualDeliveryDate value for this InboundShipmentSearchBasic.
     * 
     * @return actualDeliveryDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getActualDeliveryDate() {
        return actualDeliveryDate;
    }


    /**
     * Sets the actualDeliveryDate value for this InboundShipmentSearchBasic.
     * 
     * @param actualDeliveryDate
     */
    public void setActualDeliveryDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }


    /**
     * Gets the actualShippingDate value for this InboundShipmentSearchBasic.
     * 
     * @return actualShippingDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getActualShippingDate() {
        return actualShippingDate;
    }


    /**
     * Sets the actualShippingDate value for this InboundShipmentSearchBasic.
     * 
     * @param actualShippingDate
     */
    public void setActualShippingDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField actualShippingDate) {
        this.actualShippingDate = actualShippingDate;
    }


    /**
     * Gets the billOfLading value for this InboundShipmentSearchBasic.
     * 
     * @return billOfLading
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillOfLading() {
        return billOfLading;
    }


    /**
     * Sets the billOfLading value for this InboundShipmentSearchBasic.
     * 
     * @param billOfLading
     */
    public void setBillOfLading(com.netsuite.webservices.platform.core_2019_1.SearchStringField billOfLading) {
        this.billOfLading = billOfLading;
    }


    /**
     * Gets the createdDate value for this InboundShipmentSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this InboundShipmentSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currency value for this InboundShipmentSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InboundShipmentSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the description value for this InboundShipmentSearchBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InboundShipmentSearchBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField description) {
        this.description = description;
    }


    /**
     * Gets the expectedDeliveryDate value for this InboundShipmentSearchBasic.
     * 
     * @return expectedDeliveryDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }


    /**
     * Sets the expectedDeliveryDate value for this InboundShipmentSearchBasic.
     * 
     * @param expectedDeliveryDate
     */
    public void setExpectedDeliveryDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }


    /**
     * Gets the expectedRate value for this InboundShipmentSearchBasic.
     * 
     * @return expectedRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getExpectedRate() {
        return expectedRate;
    }


    /**
     * Sets the expectedRate value for this InboundShipmentSearchBasic.
     * 
     * @param expectedRate
     */
    public void setExpectedRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField expectedRate) {
        this.expectedRate = expectedRate;
    }


    /**
     * Gets the expectedShippingDate value for this InboundShipmentSearchBasic.
     * 
     * @return expectedShippingDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getExpectedShippingDate() {
        return expectedShippingDate;
    }


    /**
     * Sets the expectedShippingDate value for this InboundShipmentSearchBasic.
     * 
     * @param expectedShippingDate
     */
    public void setExpectedShippingDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedShippingDate) {
        this.expectedShippingDate = expectedShippingDate;
    }


    /**
     * Gets the externalDocumentNumber value for this InboundShipmentSearchBasic.
     * 
     * @return externalDocumentNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalDocumentNumber() {
        return externalDocumentNumber;
    }


    /**
     * Sets the externalDocumentNumber value for this InboundShipmentSearchBasic.
     * 
     * @param externalDocumentNumber
     */
    public void setExternalDocumentNumber(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalDocumentNumber) {
        this.externalDocumentNumber = externalDocumentNumber;
    }


    /**
     * Gets the externalId value for this InboundShipmentSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this InboundShipmentSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this InboundShipmentSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this InboundShipmentSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the incoterm value for this InboundShipmentSearchBasic.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this InboundShipmentSearchBasic.
     * 
     * @param incoterm
     */
    public void setIncoterm(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incoterm) {
        this.incoterm = incoterm;
    }


    /**
     * Gets the internalId value for this InboundShipmentSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this InboundShipmentSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this InboundShipmentSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this InboundShipmentSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the item value for this InboundShipmentSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this InboundShipmentSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the itemEffectiveDate value for this InboundShipmentSearchBasic.
     * 
     * @return itemEffectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getItemEffectiveDate() {
        return itemEffectiveDate;
    }


    /**
     * Sets the itemEffectiveDate value for this InboundShipmentSearchBasic.
     * 
     * @param itemEffectiveDate
     */
    public void setItemEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField itemEffectiveDate) {
        this.itemEffectiveDate = itemEffectiveDate;
    }


    /**
     * Gets the itemExchangeRate value for this InboundShipmentSearchBasic.
     * 
     * @return itemExchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getItemExchangeRate() {
        return itemExchangeRate;
    }


    /**
     * Sets the itemExchangeRate value for this InboundShipmentSearchBasic.
     * 
     * @param itemExchangeRate
     */
    public void setItemExchangeRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField itemExchangeRate) {
        this.itemExchangeRate = itemExchangeRate;
    }


    /**
     * Gets the landedCostAllocationMethod value for this InboundShipmentSearchBasic.
     * 
     * @return landedCostAllocationMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLandedCostAllocationMethod() {
        return landedCostAllocationMethod;
    }


    /**
     * Sets the landedCostAllocationMethod value for this InboundShipmentSearchBasic.
     * 
     * @param landedCostAllocationMethod
     */
    public void setLandedCostAllocationMethod(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField landedCostAllocationMethod) {
        this.landedCostAllocationMethod = landedCostAllocationMethod;
    }


    /**
     * Gets the landedCostAmount value for this InboundShipmentSearchBasic.
     * 
     * @return landedCostAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLandedCostAmount() {
        return landedCostAmount;
    }


    /**
     * Sets the landedCostAmount value for this InboundShipmentSearchBasic.
     * 
     * @param landedCostAmount
     */
    public void setLandedCostAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField landedCostAmount) {
        this.landedCostAmount = landedCostAmount;
    }


    /**
     * Gets the landedCostCostCategory value for this InboundShipmentSearchBasic.
     * 
     * @return landedCostCostCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLandedCostCostCategory() {
        return landedCostCostCategory;
    }


    /**
     * Sets the landedCostCostCategory value for this InboundShipmentSearchBasic.
     * 
     * @param landedCostCostCategory
     */
    public void setLandedCostCostCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField landedCostCostCategory) {
        this.landedCostCostCategory = landedCostCostCategory;
    }


    /**
     * Gets the landedCostCurrency value for this InboundShipmentSearchBasic.
     * 
     * @return landedCostCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLandedCostCurrency() {
        return landedCostCurrency;
    }


    /**
     * Sets the landedCostCurrency value for this InboundShipmentSearchBasic.
     * 
     * @param landedCostCurrency
     */
    public void setLandedCostCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField landedCostCurrency) {
        this.landedCostCurrency = landedCostCurrency;
    }


    /**
     * Gets the landedCostEffectiveDate value for this InboundShipmentSearchBasic.
     * 
     * @return landedCostEffectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLandedCostEffectiveDate() {
        return landedCostEffectiveDate;
    }


    /**
     * Sets the landedCostEffectiveDate value for this InboundShipmentSearchBasic.
     * 
     * @param landedCostEffectiveDate
     */
    public void setLandedCostEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField landedCostEffectiveDate) {
        this.landedCostEffectiveDate = landedCostEffectiveDate;
    }


    /**
     * Gets the landedCostExchangeRate value for this InboundShipmentSearchBasic.
     * 
     * @return landedCostExchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLandedCostExchangeRate() {
        return landedCostExchangeRate;
    }


    /**
     * Sets the landedCostExchangeRate value for this InboundShipmentSearchBasic.
     * 
     * @param landedCostExchangeRate
     */
    public void setLandedCostExchangeRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField landedCostExchangeRate) {
        this.landedCostExchangeRate = landedCostExchangeRate;
    }


    /**
     * Gets the memo value for this InboundShipmentSearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this InboundShipmentSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the poAmount value for this InboundShipmentSearchBasic.
     * 
     * @return poAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPoAmount() {
        return poAmount;
    }


    /**
     * Sets the poAmount value for this InboundShipmentSearchBasic.
     * 
     * @param poAmount
     */
    public void setPoAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField poAmount) {
        this.poAmount = poAmount;
    }


    /**
     * Gets the poRate value for this InboundShipmentSearchBasic.
     * 
     * @return poRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPoRate() {
        return poRate;
    }


    /**
     * Sets the poRate value for this InboundShipmentSearchBasic.
     * 
     * @param poRate
     */
    public void setPoRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField poRate) {
        this.poRate = poRate;
    }


    /**
     * Gets the purchaseOrder value for this InboundShipmentSearchBasic.
     * 
     * @return purchaseOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPurchaseOrder() {
        return purchaseOrder;
    }


    /**
     * Sets the purchaseOrder value for this InboundShipmentSearchBasic.
     * 
     * @param purchaseOrder
     */
    public void setPurchaseOrder(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }


    /**
     * Gets the quantityBilled value for this InboundShipmentSearchBasic.
     * 
     * @return quantityBilled
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityBilled() {
        return quantityBilled;
    }


    /**
     * Sets the quantityBilled value for this InboundShipmentSearchBasic.
     * 
     * @param quantityBilled
     */
    public void setQuantityBilled(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityBilled) {
        this.quantityBilled = quantityBilled;
    }


    /**
     * Gets the quantityExpected value for this InboundShipmentSearchBasic.
     * 
     * @return quantityExpected
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityExpected() {
        return quantityExpected;
    }


    /**
     * Sets the quantityExpected value for this InboundShipmentSearchBasic.
     * 
     * @param quantityExpected
     */
    public void setQuantityExpected(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityExpected) {
        this.quantityExpected = quantityExpected;
    }


    /**
     * Gets the quantityReceived value for this InboundShipmentSearchBasic.
     * 
     * @return quantityReceived
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityReceived() {
        return quantityReceived;
    }


    /**
     * Sets the quantityReceived value for this InboundShipmentSearchBasic.
     * 
     * @param quantityReceived
     */
    public void setQuantityReceived(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityReceived) {
        this.quantityReceived = quantityReceived;
    }


    /**
     * Gets the quantityRemaining value for this InboundShipmentSearchBasic.
     * 
     * @return quantityRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityRemaining() {
        return quantityRemaining;
    }


    /**
     * Sets the quantityRemaining value for this InboundShipmentSearchBasic.
     * 
     * @param quantityRemaining
     */
    public void setQuantityRemaining(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }


    /**
     * Gets the receivingLocation value for this InboundShipmentSearchBasic.
     * 
     * @return receivingLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getReceivingLocation() {
        return receivingLocation;
    }


    /**
     * Sets the receivingLocation value for this InboundShipmentSearchBasic.
     * 
     * @param receivingLocation
     */
    public void setReceivingLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField receivingLocation) {
        this.receivingLocation = receivingLocation;
    }


    /**
     * Gets the shipmentBaseCurrency value for this InboundShipmentSearchBasic.
     * 
     * @return shipmentBaseCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getShipmentBaseCurrency() {
        return shipmentBaseCurrency;
    }


    /**
     * Sets the shipmentBaseCurrency value for this InboundShipmentSearchBasic.
     * 
     * @param shipmentBaseCurrency
     */
    public void setShipmentBaseCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipmentBaseCurrency) {
        this.shipmentBaseCurrency = shipmentBaseCurrency;
    }


    /**
     * Gets the shipmentNumber value for this InboundShipmentSearchBasic.
     * 
     * @return shipmentNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getShipmentNumber() {
        return shipmentNumber;
    }


    /**
     * Sets the shipmentNumber value for this InboundShipmentSearchBasic.
     * 
     * @param shipmentNumber
     */
    public void setShipmentNumber(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }


    /**
     * Gets the status value for this InboundShipmentSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InboundShipmentSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the totalUnitCost value for this InboundShipmentSearchBasic.
     * 
     * @return totalUnitCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTotalUnitCost() {
        return totalUnitCost;
    }


    /**
     * Sets the totalUnitCost value for this InboundShipmentSearchBasic.
     * 
     * @param totalUnitCost
     */
    public void setTotalUnitCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField totalUnitCost) {
        this.totalUnitCost = totalUnitCost;
    }


    /**
     * Gets the unit value for this InboundShipmentSearchBasic.
     * 
     * @return unit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this InboundShipmentSearchBasic.
     * 
     * @param unit
     */
    public void setUnit(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unit) {
        this.unit = unit;
    }


    /**
     * Gets the unitLandedCost value for this InboundShipmentSearchBasic.
     * 
     * @return unitLandedCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnitLandedCost() {
        return unitLandedCost;
    }


    /**
     * Sets the unitLandedCost value for this InboundShipmentSearchBasic.
     * 
     * @param unitLandedCost
     */
    public void setUnitLandedCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitLandedCost) {
        this.unitLandedCost = unitLandedCost;
    }


    /**
     * Gets the vendor value for this InboundShipmentSearchBasic.
     * 
     * @return vendor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this InboundShipmentSearchBasic.
     * 
     * @param vendor
     */
    public void setVendor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the vesselNumber value for this InboundShipmentSearchBasic.
     * 
     * @return vesselNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getVesselNumber() {
        return vesselNumber;
    }


    /**
     * Sets the vesselNumber value for this InboundShipmentSearchBasic.
     * 
     * @param vesselNumber
     */
    public void setVesselNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField vesselNumber) {
        this.vesselNumber = vesselNumber;
    }


    /**
     * Gets the customFieldList value for this InboundShipmentSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InboundShipmentSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundShipmentSearchBasic)) return false;
        InboundShipmentSearchBasic other = (InboundShipmentSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualDeliveryDate==null && other.getActualDeliveryDate()==null) || 
             (this.actualDeliveryDate!=null &&
              this.actualDeliveryDate.equals(other.getActualDeliveryDate()))) &&
            ((this.actualShippingDate==null && other.getActualShippingDate()==null) || 
             (this.actualShippingDate!=null &&
              this.actualShippingDate.equals(other.getActualShippingDate()))) &&
            ((this.billOfLading==null && other.getBillOfLading()==null) || 
             (this.billOfLading!=null &&
              this.billOfLading.equals(other.getBillOfLading()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.expectedDeliveryDate==null && other.getExpectedDeliveryDate()==null) || 
             (this.expectedDeliveryDate!=null &&
              this.expectedDeliveryDate.equals(other.getExpectedDeliveryDate()))) &&
            ((this.expectedRate==null && other.getExpectedRate()==null) || 
             (this.expectedRate!=null &&
              this.expectedRate.equals(other.getExpectedRate()))) &&
            ((this.expectedShippingDate==null && other.getExpectedShippingDate()==null) || 
             (this.expectedShippingDate!=null &&
              this.expectedShippingDate.equals(other.getExpectedShippingDate()))) &&
            ((this.externalDocumentNumber==null && other.getExternalDocumentNumber()==null) || 
             (this.externalDocumentNumber!=null &&
              this.externalDocumentNumber.equals(other.getExternalDocumentNumber()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              this.incoterm.equals(other.getIncoterm()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemEffectiveDate==null && other.getItemEffectiveDate()==null) || 
             (this.itemEffectiveDate!=null &&
              this.itemEffectiveDate.equals(other.getItemEffectiveDate()))) &&
            ((this.itemExchangeRate==null && other.getItemExchangeRate()==null) || 
             (this.itemExchangeRate!=null &&
              this.itemExchangeRate.equals(other.getItemExchangeRate()))) &&
            ((this.landedCostAllocationMethod==null && other.getLandedCostAllocationMethod()==null) || 
             (this.landedCostAllocationMethod!=null &&
              this.landedCostAllocationMethod.equals(other.getLandedCostAllocationMethod()))) &&
            ((this.landedCostAmount==null && other.getLandedCostAmount()==null) || 
             (this.landedCostAmount!=null &&
              this.landedCostAmount.equals(other.getLandedCostAmount()))) &&
            ((this.landedCostCostCategory==null && other.getLandedCostCostCategory()==null) || 
             (this.landedCostCostCategory!=null &&
              this.landedCostCostCategory.equals(other.getLandedCostCostCategory()))) &&
            ((this.landedCostCurrency==null && other.getLandedCostCurrency()==null) || 
             (this.landedCostCurrency!=null &&
              this.landedCostCurrency.equals(other.getLandedCostCurrency()))) &&
            ((this.landedCostEffectiveDate==null && other.getLandedCostEffectiveDate()==null) || 
             (this.landedCostEffectiveDate!=null &&
              this.landedCostEffectiveDate.equals(other.getLandedCostEffectiveDate()))) &&
            ((this.landedCostExchangeRate==null && other.getLandedCostExchangeRate()==null) || 
             (this.landedCostExchangeRate!=null &&
              this.landedCostExchangeRate.equals(other.getLandedCostExchangeRate()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.poAmount==null && other.getPoAmount()==null) || 
             (this.poAmount!=null &&
              this.poAmount.equals(other.getPoAmount()))) &&
            ((this.poRate==null && other.getPoRate()==null) || 
             (this.poRate!=null &&
              this.poRate.equals(other.getPoRate()))) &&
            ((this.purchaseOrder==null && other.getPurchaseOrder()==null) || 
             (this.purchaseOrder!=null &&
              this.purchaseOrder.equals(other.getPurchaseOrder()))) &&
            ((this.quantityBilled==null && other.getQuantityBilled()==null) || 
             (this.quantityBilled!=null &&
              this.quantityBilled.equals(other.getQuantityBilled()))) &&
            ((this.quantityExpected==null && other.getQuantityExpected()==null) || 
             (this.quantityExpected!=null &&
              this.quantityExpected.equals(other.getQuantityExpected()))) &&
            ((this.quantityReceived==null && other.getQuantityReceived()==null) || 
             (this.quantityReceived!=null &&
              this.quantityReceived.equals(other.getQuantityReceived()))) &&
            ((this.quantityRemaining==null && other.getQuantityRemaining()==null) || 
             (this.quantityRemaining!=null &&
              this.quantityRemaining.equals(other.getQuantityRemaining()))) &&
            ((this.receivingLocation==null && other.getReceivingLocation()==null) || 
             (this.receivingLocation!=null &&
              this.receivingLocation.equals(other.getReceivingLocation()))) &&
            ((this.shipmentBaseCurrency==null && other.getShipmentBaseCurrency()==null) || 
             (this.shipmentBaseCurrency!=null &&
              this.shipmentBaseCurrency.equals(other.getShipmentBaseCurrency()))) &&
            ((this.shipmentNumber==null && other.getShipmentNumber()==null) || 
             (this.shipmentNumber!=null &&
              this.shipmentNumber.equals(other.getShipmentNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.totalUnitCost==null && other.getTotalUnitCost()==null) || 
             (this.totalUnitCost!=null &&
              this.totalUnitCost.equals(other.getTotalUnitCost()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.unitLandedCost==null && other.getUnitLandedCost()==null) || 
             (this.unitLandedCost!=null &&
              this.unitLandedCost.equals(other.getUnitLandedCost()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.vesselNumber==null && other.getVesselNumber()==null) || 
             (this.vesselNumber!=null &&
              this.vesselNumber.equals(other.getVesselNumber()))) &&
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
        if (getActualDeliveryDate() != null) {
            _hashCode += getActualDeliveryDate().hashCode();
        }
        if (getActualShippingDate() != null) {
            _hashCode += getActualShippingDate().hashCode();
        }
        if (getBillOfLading() != null) {
            _hashCode += getBillOfLading().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExpectedDeliveryDate() != null) {
            _hashCode += getExpectedDeliveryDate().hashCode();
        }
        if (getExpectedRate() != null) {
            _hashCode += getExpectedRate().hashCode();
        }
        if (getExpectedShippingDate() != null) {
            _hashCode += getExpectedShippingDate().hashCode();
        }
        if (getExternalDocumentNumber() != null) {
            _hashCode += getExternalDocumentNumber().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getIncoterm() != null) {
            _hashCode += getIncoterm().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemEffectiveDate() != null) {
            _hashCode += getItemEffectiveDate().hashCode();
        }
        if (getItemExchangeRate() != null) {
            _hashCode += getItemExchangeRate().hashCode();
        }
        if (getLandedCostAllocationMethod() != null) {
            _hashCode += getLandedCostAllocationMethod().hashCode();
        }
        if (getLandedCostAmount() != null) {
            _hashCode += getLandedCostAmount().hashCode();
        }
        if (getLandedCostCostCategory() != null) {
            _hashCode += getLandedCostCostCategory().hashCode();
        }
        if (getLandedCostCurrency() != null) {
            _hashCode += getLandedCostCurrency().hashCode();
        }
        if (getLandedCostEffectiveDate() != null) {
            _hashCode += getLandedCostEffectiveDate().hashCode();
        }
        if (getLandedCostExchangeRate() != null) {
            _hashCode += getLandedCostExchangeRate().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getPoAmount() != null) {
            _hashCode += getPoAmount().hashCode();
        }
        if (getPoRate() != null) {
            _hashCode += getPoRate().hashCode();
        }
        if (getPurchaseOrder() != null) {
            _hashCode += getPurchaseOrder().hashCode();
        }
        if (getQuantityBilled() != null) {
            _hashCode += getQuantityBilled().hashCode();
        }
        if (getQuantityExpected() != null) {
            _hashCode += getQuantityExpected().hashCode();
        }
        if (getQuantityReceived() != null) {
            _hashCode += getQuantityReceived().hashCode();
        }
        if (getQuantityRemaining() != null) {
            _hashCode += getQuantityRemaining().hashCode();
        }
        if (getReceivingLocation() != null) {
            _hashCode += getReceivingLocation().hashCode();
        }
        if (getShipmentBaseCurrency() != null) {
            _hashCode += getShipmentBaseCurrency().hashCode();
        }
        if (getShipmentNumber() != null) {
            _hashCode += getShipmentNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTotalUnitCost() != null) {
            _hashCode += getTotalUnitCost().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getUnitLandedCost() != null) {
            _hashCode += getUnitLandedCost().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getVesselNumber() != null) {
            _hashCode += getVesselNumber().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundShipmentSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InboundShipmentSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualShippingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualShippingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfLading");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billOfLading"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedShippingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedShippingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDocumentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalDocumentNumber"));
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
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostAllocationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostAllocationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostCostCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostCostCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "poAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityExpected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityExpected"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receivingLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentBaseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipmentBaseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUnitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "totalUnitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitLandedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitLandedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vesselNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vesselNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
