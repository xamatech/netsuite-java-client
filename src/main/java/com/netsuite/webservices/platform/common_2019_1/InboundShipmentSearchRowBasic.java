/**
 * InboundShipmentSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class InboundShipmentSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] actualDeliveryDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] actualShippingDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billOfLading;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedDeliveryDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] expectedRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedShippingDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalDocumentNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] incoterm;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] itemEffectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] itemExchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] landedCostAllocationMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] landedCostAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] landedCostCostCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] landedCostCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] landedCostEffectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] landedCostExchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] poAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] poRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] purchaseOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityBilled;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityExpected;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityReceived;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityRemaining;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] receivingLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shipmentBaseCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipmentNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] status;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] totalUnitCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] unit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitLandedCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendor;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vesselNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public InboundShipmentSearchRowBasic() {
    }

    public InboundShipmentSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] actualDeliveryDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] actualShippingDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billOfLading,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedDeliveryDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] expectedRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedShippingDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalDocumentNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] incoterm,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] itemEffectiveDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] itemExchangeRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] landedCostAllocationMethod,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] landedCostAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] landedCostCostCategory,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] landedCostCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] landedCostEffectiveDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] landedCostExchangeRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] poAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] poRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] purchaseOrder,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityBilled,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityExpected,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityReceived,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityRemaining,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] receivingLocation,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shipmentBaseCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipmentNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] status,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] totalUnitCost,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] unit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitLandedCost,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendor,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vesselNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
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
        this.incoterm = incoterm;
        this.internalId = internalId;
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
     * Gets the actualDeliveryDate value for this InboundShipmentSearchRowBasic.
     * 
     * @return actualDeliveryDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getActualDeliveryDate() {
        return actualDeliveryDate;
    }


    /**
     * Sets the actualDeliveryDate value for this InboundShipmentSearchRowBasic.
     * 
     * @param actualDeliveryDate
     */
    public void setActualDeliveryDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getActualDeliveryDate(int i) {
        return this.actualDeliveryDate[i];
    }

    public void setActualDeliveryDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.actualDeliveryDate[i] = _value;
    }


    /**
     * Gets the actualShippingDate value for this InboundShipmentSearchRowBasic.
     * 
     * @return actualShippingDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getActualShippingDate() {
        return actualShippingDate;
    }


    /**
     * Sets the actualShippingDate value for this InboundShipmentSearchRowBasic.
     * 
     * @param actualShippingDate
     */
    public void setActualShippingDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] actualShippingDate) {
        this.actualShippingDate = actualShippingDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getActualShippingDate(int i) {
        return this.actualShippingDate[i];
    }

    public void setActualShippingDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.actualShippingDate[i] = _value;
    }


    /**
     * Gets the billOfLading value for this InboundShipmentSearchRowBasic.
     * 
     * @return billOfLading
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillOfLading() {
        return billOfLading;
    }


    /**
     * Sets the billOfLading value for this InboundShipmentSearchRowBasic.
     * 
     * @param billOfLading
     */
    public void setBillOfLading(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billOfLading) {
        this.billOfLading = billOfLading;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillOfLading(int i) {
        return this.billOfLading[i];
    }

    public void setBillOfLading(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billOfLading[i] = _value;
    }


    /**
     * Gets the createdDate value for this InboundShipmentSearchRowBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this InboundShipmentSearchRowBasic.
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
     * Gets the currency value for this InboundShipmentSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InboundShipmentSearchRowBasic.
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
     * Gets the description value for this InboundShipmentSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InboundShipmentSearchRowBasic.
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
     * Gets the expectedDeliveryDate value for this InboundShipmentSearchRowBasic.
     * 
     * @return expectedDeliveryDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }


    /**
     * Sets the expectedDeliveryDate value for this InboundShipmentSearchRowBasic.
     * 
     * @param expectedDeliveryDate
     */
    public void setExpectedDeliveryDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getExpectedDeliveryDate(int i) {
        return this.expectedDeliveryDate[i];
    }

    public void setExpectedDeliveryDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.expectedDeliveryDate[i] = _value;
    }


    /**
     * Gets the expectedRate value for this InboundShipmentSearchRowBasic.
     * 
     * @return expectedRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getExpectedRate() {
        return expectedRate;
    }


    /**
     * Sets the expectedRate value for this InboundShipmentSearchRowBasic.
     * 
     * @param expectedRate
     */
    public void setExpectedRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] expectedRate) {
        this.expectedRate = expectedRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getExpectedRate(int i) {
        return this.expectedRate[i];
    }

    public void setExpectedRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.expectedRate[i] = _value;
    }


    /**
     * Gets the expectedShippingDate value for this InboundShipmentSearchRowBasic.
     * 
     * @return expectedShippingDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getExpectedShippingDate() {
        return expectedShippingDate;
    }


    /**
     * Sets the expectedShippingDate value for this InboundShipmentSearchRowBasic.
     * 
     * @param expectedShippingDate
     */
    public void setExpectedShippingDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedShippingDate) {
        this.expectedShippingDate = expectedShippingDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getExpectedShippingDate(int i) {
        return this.expectedShippingDate[i];
    }

    public void setExpectedShippingDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.expectedShippingDate[i] = _value;
    }


    /**
     * Gets the externalDocumentNumber value for this InboundShipmentSearchRowBasic.
     * 
     * @return externalDocumentNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getExternalDocumentNumber() {
        return externalDocumentNumber;
    }


    /**
     * Sets the externalDocumentNumber value for this InboundShipmentSearchRowBasic.
     * 
     * @param externalDocumentNumber
     */
    public void setExternalDocumentNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalDocumentNumber) {
        this.externalDocumentNumber = externalDocumentNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getExternalDocumentNumber(int i) {
        return this.externalDocumentNumber[i];
    }

    public void setExternalDocumentNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.externalDocumentNumber[i] = _value;
    }


    /**
     * Gets the externalId value for this InboundShipmentSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this InboundShipmentSearchRowBasic.
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
     * Gets the incoterm value for this InboundShipmentSearchRowBasic.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this InboundShipmentSearchRowBasic.
     * 
     * @param incoterm
     */
    public void setIncoterm(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] incoterm) {
        this.incoterm = incoterm;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getIncoterm(int i) {
        return this.incoterm[i];
    }

    public void setIncoterm(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.incoterm[i] = _value;
    }


    /**
     * Gets the internalId value for this InboundShipmentSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this InboundShipmentSearchRowBasic.
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
     * Gets the item value for this InboundShipmentSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this InboundShipmentSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item) {
        this.item = item;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the itemEffectiveDate value for this InboundShipmentSearchRowBasic.
     * 
     * @return itemEffectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getItemEffectiveDate() {
        return itemEffectiveDate;
    }


    /**
     * Sets the itemEffectiveDate value for this InboundShipmentSearchRowBasic.
     * 
     * @param itemEffectiveDate
     */
    public void setItemEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] itemEffectiveDate) {
        this.itemEffectiveDate = itemEffectiveDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getItemEffectiveDate(int i) {
        return this.itemEffectiveDate[i];
    }

    public void setItemEffectiveDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.itemEffectiveDate[i] = _value;
    }


    /**
     * Gets the itemExchangeRate value for this InboundShipmentSearchRowBasic.
     * 
     * @return itemExchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getItemExchangeRate() {
        return itemExchangeRate;
    }


    /**
     * Sets the itemExchangeRate value for this InboundShipmentSearchRowBasic.
     * 
     * @param itemExchangeRate
     */
    public void setItemExchangeRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] itemExchangeRate) {
        this.itemExchangeRate = itemExchangeRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getItemExchangeRate(int i) {
        return this.itemExchangeRate[i];
    }

    public void setItemExchangeRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.itemExchangeRate[i] = _value;
    }


    /**
     * Gets the landedCostAllocationMethod value for this InboundShipmentSearchRowBasic.
     * 
     * @return landedCostAllocationMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLandedCostAllocationMethod() {
        return landedCostAllocationMethod;
    }


    /**
     * Sets the landedCostAllocationMethod value for this InboundShipmentSearchRowBasic.
     * 
     * @param landedCostAllocationMethod
     */
    public void setLandedCostAllocationMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] landedCostAllocationMethod) {
        this.landedCostAllocationMethod = landedCostAllocationMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLandedCostAllocationMethod(int i) {
        return this.landedCostAllocationMethod[i];
    }

    public void setLandedCostAllocationMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.landedCostAllocationMethod[i] = _value;
    }


    /**
     * Gets the landedCostAmount value for this InboundShipmentSearchRowBasic.
     * 
     * @return landedCostAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLandedCostAmount() {
        return landedCostAmount;
    }


    /**
     * Sets the landedCostAmount value for this InboundShipmentSearchRowBasic.
     * 
     * @param landedCostAmount
     */
    public void setLandedCostAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] landedCostAmount) {
        this.landedCostAmount = landedCostAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLandedCostAmount(int i) {
        return this.landedCostAmount[i];
    }

    public void setLandedCostAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.landedCostAmount[i] = _value;
    }


    /**
     * Gets the landedCostCostCategory value for this InboundShipmentSearchRowBasic.
     * 
     * @return landedCostCostCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLandedCostCostCategory() {
        return landedCostCostCategory;
    }


    /**
     * Sets the landedCostCostCategory value for this InboundShipmentSearchRowBasic.
     * 
     * @param landedCostCostCategory
     */
    public void setLandedCostCostCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] landedCostCostCategory) {
        this.landedCostCostCategory = landedCostCostCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLandedCostCostCategory(int i) {
        return this.landedCostCostCategory[i];
    }

    public void setLandedCostCostCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.landedCostCostCategory[i] = _value;
    }


    /**
     * Gets the landedCostCurrency value for this InboundShipmentSearchRowBasic.
     * 
     * @return landedCostCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLandedCostCurrency() {
        return landedCostCurrency;
    }


    /**
     * Sets the landedCostCurrency value for this InboundShipmentSearchRowBasic.
     * 
     * @param landedCostCurrency
     */
    public void setLandedCostCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] landedCostCurrency) {
        this.landedCostCurrency = landedCostCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLandedCostCurrency(int i) {
        return this.landedCostCurrency[i];
    }

    public void setLandedCostCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.landedCostCurrency[i] = _value;
    }


    /**
     * Gets the landedCostEffectiveDate value for this InboundShipmentSearchRowBasic.
     * 
     * @return landedCostEffectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLandedCostEffectiveDate() {
        return landedCostEffectiveDate;
    }


    /**
     * Sets the landedCostEffectiveDate value for this InboundShipmentSearchRowBasic.
     * 
     * @param landedCostEffectiveDate
     */
    public void setLandedCostEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] landedCostEffectiveDate) {
        this.landedCostEffectiveDate = landedCostEffectiveDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLandedCostEffectiveDate(int i) {
        return this.landedCostEffectiveDate[i];
    }

    public void setLandedCostEffectiveDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.landedCostEffectiveDate[i] = _value;
    }


    /**
     * Gets the landedCostExchangeRate value for this InboundShipmentSearchRowBasic.
     * 
     * @return landedCostExchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLandedCostExchangeRate() {
        return landedCostExchangeRate;
    }


    /**
     * Sets the landedCostExchangeRate value for this InboundShipmentSearchRowBasic.
     * 
     * @param landedCostExchangeRate
     */
    public void setLandedCostExchangeRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] landedCostExchangeRate) {
        this.landedCostExchangeRate = landedCostExchangeRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLandedCostExchangeRate(int i) {
        return this.landedCostExchangeRate[i];
    }

    public void setLandedCostExchangeRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.landedCostExchangeRate[i] = _value;
    }


    /**
     * Gets the memo value for this InboundShipmentSearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this InboundShipmentSearchRowBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.memo[i] = _value;
    }


    /**
     * Gets the poAmount value for this InboundShipmentSearchRowBasic.
     * 
     * @return poAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPoAmount() {
        return poAmount;
    }


    /**
     * Sets the poAmount value for this InboundShipmentSearchRowBasic.
     * 
     * @param poAmount
     */
    public void setPoAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] poAmount) {
        this.poAmount = poAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPoAmount(int i) {
        return this.poAmount[i];
    }

    public void setPoAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.poAmount[i] = _value;
    }


    /**
     * Gets the poRate value for this InboundShipmentSearchRowBasic.
     * 
     * @return poRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPoRate() {
        return poRate;
    }


    /**
     * Sets the poRate value for this InboundShipmentSearchRowBasic.
     * 
     * @param poRate
     */
    public void setPoRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] poRate) {
        this.poRate = poRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPoRate(int i) {
        return this.poRate[i];
    }

    public void setPoRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.poRate[i] = _value;
    }


    /**
     * Gets the purchaseOrder value for this InboundShipmentSearchRowBasic.
     * 
     * @return purchaseOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPurchaseOrder() {
        return purchaseOrder;
    }


    /**
     * Sets the purchaseOrder value for this InboundShipmentSearchRowBasic.
     * 
     * @param purchaseOrder
     */
    public void setPurchaseOrder(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPurchaseOrder(int i) {
        return this.purchaseOrder[i];
    }

    public void setPurchaseOrder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.purchaseOrder[i] = _value;
    }


    /**
     * Gets the quantityBilled value for this InboundShipmentSearchRowBasic.
     * 
     * @return quantityBilled
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityBilled() {
        return quantityBilled;
    }


    /**
     * Sets the quantityBilled value for this InboundShipmentSearchRowBasic.
     * 
     * @param quantityBilled
     */
    public void setQuantityBilled(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityBilled) {
        this.quantityBilled = quantityBilled;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityBilled(int i) {
        return this.quantityBilled[i];
    }

    public void setQuantityBilled(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityBilled[i] = _value;
    }


    /**
     * Gets the quantityExpected value for this InboundShipmentSearchRowBasic.
     * 
     * @return quantityExpected
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityExpected() {
        return quantityExpected;
    }


    /**
     * Sets the quantityExpected value for this InboundShipmentSearchRowBasic.
     * 
     * @param quantityExpected
     */
    public void setQuantityExpected(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityExpected) {
        this.quantityExpected = quantityExpected;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityExpected(int i) {
        return this.quantityExpected[i];
    }

    public void setQuantityExpected(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityExpected[i] = _value;
    }


    /**
     * Gets the quantityReceived value for this InboundShipmentSearchRowBasic.
     * 
     * @return quantityReceived
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityReceived() {
        return quantityReceived;
    }


    /**
     * Sets the quantityReceived value for this InboundShipmentSearchRowBasic.
     * 
     * @param quantityReceived
     */
    public void setQuantityReceived(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityReceived(int i) {
        return this.quantityReceived[i];
    }

    public void setQuantityReceived(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityReceived[i] = _value;
    }


    /**
     * Gets the quantityRemaining value for this InboundShipmentSearchRowBasic.
     * 
     * @return quantityRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityRemaining() {
        return quantityRemaining;
    }


    /**
     * Sets the quantityRemaining value for this InboundShipmentSearchRowBasic.
     * 
     * @param quantityRemaining
     */
    public void setQuantityRemaining(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityRemaining(int i) {
        return this.quantityRemaining[i];
    }

    public void setQuantityRemaining(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityRemaining[i] = _value;
    }


    /**
     * Gets the receivingLocation value for this InboundShipmentSearchRowBasic.
     * 
     * @return receivingLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getReceivingLocation() {
        return receivingLocation;
    }


    /**
     * Sets the receivingLocation value for this InboundShipmentSearchRowBasic.
     * 
     * @param receivingLocation
     */
    public void setReceivingLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] receivingLocation) {
        this.receivingLocation = receivingLocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getReceivingLocation(int i) {
        return this.receivingLocation[i];
    }

    public void setReceivingLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.receivingLocation[i] = _value;
    }


    /**
     * Gets the shipmentBaseCurrency value for this InboundShipmentSearchRowBasic.
     * 
     * @return shipmentBaseCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getShipmentBaseCurrency() {
        return shipmentBaseCurrency;
    }


    /**
     * Sets the shipmentBaseCurrency value for this InboundShipmentSearchRowBasic.
     * 
     * @param shipmentBaseCurrency
     */
    public void setShipmentBaseCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shipmentBaseCurrency) {
        this.shipmentBaseCurrency = shipmentBaseCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getShipmentBaseCurrency(int i) {
        return this.shipmentBaseCurrency[i];
    }

    public void setShipmentBaseCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.shipmentBaseCurrency[i] = _value;
    }


    /**
     * Gets the shipmentNumber value for this InboundShipmentSearchRowBasic.
     * 
     * @return shipmentNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipmentNumber() {
        return shipmentNumber;
    }


    /**
     * Sets the shipmentNumber value for this InboundShipmentSearchRowBasic.
     * 
     * @param shipmentNumber
     */
    public void setShipmentNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipmentNumber(int i) {
        return this.shipmentNumber[i];
    }

    public void setShipmentNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipmentNumber[i] = _value;
    }


    /**
     * Gets the status value for this InboundShipmentSearchRowBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InboundShipmentSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] status) {
        this.status = status;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the totalUnitCost value for this InboundShipmentSearchRowBasic.
     * 
     * @return totalUnitCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTotalUnitCost() {
        return totalUnitCost;
    }


    /**
     * Sets the totalUnitCost value for this InboundShipmentSearchRowBasic.
     * 
     * @param totalUnitCost
     */
    public void setTotalUnitCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] totalUnitCost) {
        this.totalUnitCost = totalUnitCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTotalUnitCost(int i) {
        return this.totalUnitCost[i];
    }

    public void setTotalUnitCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.totalUnitCost[i] = _value;
    }


    /**
     * Gets the unit value for this InboundShipmentSearchRowBasic.
     * 
     * @return unit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this InboundShipmentSearchRowBasic.
     * 
     * @param unit
     */
    public void setUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] unit) {
        this.unit = unit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getUnit(int i) {
        return this.unit[i];
    }

    public void setUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.unit[i] = _value;
    }


    /**
     * Gets the unitLandedCost value for this InboundShipmentSearchRowBasic.
     * 
     * @return unitLandedCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnitLandedCost() {
        return unitLandedCost;
    }


    /**
     * Sets the unitLandedCost value for this InboundShipmentSearchRowBasic.
     * 
     * @param unitLandedCost
     */
    public void setUnitLandedCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitLandedCost) {
        this.unitLandedCost = unitLandedCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnitLandedCost(int i) {
        return this.unitLandedCost[i];
    }

    public void setUnitLandedCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unitLandedCost[i] = _value;
    }


    /**
     * Gets the vendor value for this InboundShipmentSearchRowBasic.
     * 
     * @return vendor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this InboundShipmentSearchRowBasic.
     * 
     * @param vendor
     */
    public void setVendor(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendor) {
        this.vendor = vendor;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getVendor(int i) {
        return this.vendor[i];
    }

    public void setVendor(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.vendor[i] = _value;
    }


    /**
     * Gets the vesselNumber value for this InboundShipmentSearchRowBasic.
     * 
     * @return vesselNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getVesselNumber() {
        return vesselNumber;
    }


    /**
     * Sets the vesselNumber value for this InboundShipmentSearchRowBasic.
     * 
     * @param vesselNumber
     */
    public void setVesselNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vesselNumber) {
        this.vesselNumber = vesselNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getVesselNumber(int i) {
        return this.vesselNumber[i];
    }

    public void setVesselNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.vesselNumber[i] = _value;
    }


    /**
     * Gets the customFieldList value for this InboundShipmentSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InboundShipmentSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundShipmentSearchRowBasic)) return false;
        InboundShipmentSearchRowBasic other = (InboundShipmentSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.actualDeliveryDate, other.getActualDeliveryDate()))) &&
            ((this.actualShippingDate==null && other.getActualShippingDate()==null) || 
             (this.actualShippingDate!=null &&
              java.util.Arrays.equals(this.actualShippingDate, other.getActualShippingDate()))) &&
            ((this.billOfLading==null && other.getBillOfLading()==null) || 
             (this.billOfLading!=null &&
              java.util.Arrays.equals(this.billOfLading, other.getBillOfLading()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.expectedDeliveryDate==null && other.getExpectedDeliveryDate()==null) || 
             (this.expectedDeliveryDate!=null &&
              java.util.Arrays.equals(this.expectedDeliveryDate, other.getExpectedDeliveryDate()))) &&
            ((this.expectedRate==null && other.getExpectedRate()==null) || 
             (this.expectedRate!=null &&
              java.util.Arrays.equals(this.expectedRate, other.getExpectedRate()))) &&
            ((this.expectedShippingDate==null && other.getExpectedShippingDate()==null) || 
             (this.expectedShippingDate!=null &&
              java.util.Arrays.equals(this.expectedShippingDate, other.getExpectedShippingDate()))) &&
            ((this.externalDocumentNumber==null && other.getExternalDocumentNumber()==null) || 
             (this.externalDocumentNumber!=null &&
              java.util.Arrays.equals(this.externalDocumentNumber, other.getExternalDocumentNumber()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              java.util.Arrays.equals(this.incoterm, other.getIncoterm()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.itemEffectiveDate==null && other.getItemEffectiveDate()==null) || 
             (this.itemEffectiveDate!=null &&
              java.util.Arrays.equals(this.itemEffectiveDate, other.getItemEffectiveDate()))) &&
            ((this.itemExchangeRate==null && other.getItemExchangeRate()==null) || 
             (this.itemExchangeRate!=null &&
              java.util.Arrays.equals(this.itemExchangeRate, other.getItemExchangeRate()))) &&
            ((this.landedCostAllocationMethod==null && other.getLandedCostAllocationMethod()==null) || 
             (this.landedCostAllocationMethod!=null &&
              java.util.Arrays.equals(this.landedCostAllocationMethod, other.getLandedCostAllocationMethod()))) &&
            ((this.landedCostAmount==null && other.getLandedCostAmount()==null) || 
             (this.landedCostAmount!=null &&
              java.util.Arrays.equals(this.landedCostAmount, other.getLandedCostAmount()))) &&
            ((this.landedCostCostCategory==null && other.getLandedCostCostCategory()==null) || 
             (this.landedCostCostCategory!=null &&
              java.util.Arrays.equals(this.landedCostCostCategory, other.getLandedCostCostCategory()))) &&
            ((this.landedCostCurrency==null && other.getLandedCostCurrency()==null) || 
             (this.landedCostCurrency!=null &&
              java.util.Arrays.equals(this.landedCostCurrency, other.getLandedCostCurrency()))) &&
            ((this.landedCostEffectiveDate==null && other.getLandedCostEffectiveDate()==null) || 
             (this.landedCostEffectiveDate!=null &&
              java.util.Arrays.equals(this.landedCostEffectiveDate, other.getLandedCostEffectiveDate()))) &&
            ((this.landedCostExchangeRate==null && other.getLandedCostExchangeRate()==null) || 
             (this.landedCostExchangeRate!=null &&
              java.util.Arrays.equals(this.landedCostExchangeRate, other.getLandedCostExchangeRate()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.poAmount==null && other.getPoAmount()==null) || 
             (this.poAmount!=null &&
              java.util.Arrays.equals(this.poAmount, other.getPoAmount()))) &&
            ((this.poRate==null && other.getPoRate()==null) || 
             (this.poRate!=null &&
              java.util.Arrays.equals(this.poRate, other.getPoRate()))) &&
            ((this.purchaseOrder==null && other.getPurchaseOrder()==null) || 
             (this.purchaseOrder!=null &&
              java.util.Arrays.equals(this.purchaseOrder, other.getPurchaseOrder()))) &&
            ((this.quantityBilled==null && other.getQuantityBilled()==null) || 
             (this.quantityBilled!=null &&
              java.util.Arrays.equals(this.quantityBilled, other.getQuantityBilled()))) &&
            ((this.quantityExpected==null && other.getQuantityExpected()==null) || 
             (this.quantityExpected!=null &&
              java.util.Arrays.equals(this.quantityExpected, other.getQuantityExpected()))) &&
            ((this.quantityReceived==null && other.getQuantityReceived()==null) || 
             (this.quantityReceived!=null &&
              java.util.Arrays.equals(this.quantityReceived, other.getQuantityReceived()))) &&
            ((this.quantityRemaining==null && other.getQuantityRemaining()==null) || 
             (this.quantityRemaining!=null &&
              java.util.Arrays.equals(this.quantityRemaining, other.getQuantityRemaining()))) &&
            ((this.receivingLocation==null && other.getReceivingLocation()==null) || 
             (this.receivingLocation!=null &&
              java.util.Arrays.equals(this.receivingLocation, other.getReceivingLocation()))) &&
            ((this.shipmentBaseCurrency==null && other.getShipmentBaseCurrency()==null) || 
             (this.shipmentBaseCurrency!=null &&
              java.util.Arrays.equals(this.shipmentBaseCurrency, other.getShipmentBaseCurrency()))) &&
            ((this.shipmentNumber==null && other.getShipmentNumber()==null) || 
             (this.shipmentNumber!=null &&
              java.util.Arrays.equals(this.shipmentNumber, other.getShipmentNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.totalUnitCost==null && other.getTotalUnitCost()==null) || 
             (this.totalUnitCost!=null &&
              java.util.Arrays.equals(this.totalUnitCost, other.getTotalUnitCost()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              java.util.Arrays.equals(this.unit, other.getUnit()))) &&
            ((this.unitLandedCost==null && other.getUnitLandedCost()==null) || 
             (this.unitLandedCost!=null &&
              java.util.Arrays.equals(this.unitLandedCost, other.getUnitLandedCost()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              java.util.Arrays.equals(this.vendor, other.getVendor()))) &&
            ((this.vesselNumber==null && other.getVesselNumber()==null) || 
             (this.vesselNumber!=null &&
              java.util.Arrays.equals(this.vesselNumber, other.getVesselNumber()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualDeliveryDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualDeliveryDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActualShippingDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualShippingDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualShippingDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillOfLading() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillOfLading());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillOfLading(), i);
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
        if (getExpectedDeliveryDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedDeliveryDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedDeliveryDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedShippingDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedShippingDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedShippingDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalDocumentNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalDocumentNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalDocumentNumber(), i);
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
        if (getIncoterm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncoterm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncoterm(), i);
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
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemEffectiveDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemEffectiveDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemEffectiveDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemExchangeRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemExchangeRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemExchangeRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLandedCostAllocationMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCostAllocationMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCostAllocationMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLandedCostAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCostAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCostAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLandedCostCostCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCostCostCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCostCostCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLandedCostCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCostCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCostCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLandedCostEffectiveDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCostEffectiveDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCostEffectiveDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLandedCostExchangeRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCostExchangeRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCostExchangeRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPoAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPoRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityBilled() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityBilled());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityBilled(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityExpected() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityExpected());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityExpected(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityReceived() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityReceived());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityReceived(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityRemaining() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityRemaining());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityRemaining(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceivingLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceivingLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceivingLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentBaseCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentBaseCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentBaseCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalUnitCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalUnitCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalUnitCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitLandedCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitLandedCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitLandedCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVesselNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVesselNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVesselNumber(), i);
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
        new org.apache.axis.description.TypeDesc(InboundShipmentSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InboundShipmentSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualShippingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualShippingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfLading");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billOfLading"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedShippingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedShippingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDocumentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalDocumentNumber"));
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
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "incoterm"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostAllocationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostAllocationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostCostCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostCostCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "poAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityExpected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityExpected"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receivingLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentBaseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipmentBaseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUnitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "totalUnitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitLandedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitLandedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vesselNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vesselNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
