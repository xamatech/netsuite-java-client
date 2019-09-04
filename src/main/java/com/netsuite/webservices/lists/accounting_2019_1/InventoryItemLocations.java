/**
 * InventoryItemLocations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class InventoryItemLocations  implements java.io.Serializable {
    private java.lang.String location;

    private java.lang.Double quantityOnHand;

    private java.lang.Double onHandValueMli;

    private java.lang.Double averageCostMli;

    private java.lang.Double lastPurchasePriceMli;

    private java.lang.Double reorderPoint;

    private java.lang.Boolean locationAllowStorePickup;

    private java.lang.Double locationStorePickupBufferStock;

    private java.lang.Double locationQtyAvailForStorePickup;

    private java.lang.Double preferredStockLevel;

    private java.lang.Long leadTime;

    private java.lang.Double defaultReturnCost;

    private java.lang.Double safetyStockLevel;

    private java.lang.Double cost;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef inventoryCostTemplate;

    private java.lang.Double buildTime;

    private java.util.Calendar lastInvtCountDate;

    private java.util.Calendar nextInvtCountDate;

    private java.lang.Boolean isWip;

    private java.lang.Long invtCountInterval;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemInvtClassification invtClassification;

    private java.lang.Double costingLotSize;

    private java.lang.Double quantityOnOrder;

    private java.lang.Double quantityCommitted;

    private java.lang.Double quantityAvailable;

    private java.lang.Double quantityBackOrdered;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef locationId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef supplyReplenishmentMethod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef alternateDemandSourceItem;

    private java.lang.Double fixedLotSize;

    private com.netsuite.webservices.lists.accounting_2019_1.types.PeriodicLotSizeType periodicLotSizeType;

    private java.lang.Long periodicLotSizeDays;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef supplyType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef supplyLotSizingMethod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef demandSource;

    private java.lang.Long backwardConsumptionDays;

    private java.lang.Long forwardConsumptionDays;

    private java.lang.Long demandTimeFence;

    private java.lang.Long supplyTimeFence;

    private java.lang.Long rescheduleInDays;

    private java.lang.Long rescheduleOutDays;

    public InventoryItemLocations() {
    }

    public InventoryItemLocations(
           java.lang.String location,
           java.lang.Double quantityOnHand,
           java.lang.Double onHandValueMli,
           java.lang.Double averageCostMli,
           java.lang.Double lastPurchasePriceMli,
           java.lang.Double reorderPoint,
           java.lang.Boolean locationAllowStorePickup,
           java.lang.Double locationStorePickupBufferStock,
           java.lang.Double locationQtyAvailForStorePickup,
           java.lang.Double preferredStockLevel,
           java.lang.Long leadTime,
           java.lang.Double defaultReturnCost,
           java.lang.Double safetyStockLevel,
           java.lang.Double cost,
           com.netsuite.webservices.platform.core_2019_1.RecordRef inventoryCostTemplate,
           java.lang.Double buildTime,
           java.util.Calendar lastInvtCountDate,
           java.util.Calendar nextInvtCountDate,
           java.lang.Boolean isWip,
           java.lang.Long invtCountInterval,
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemInvtClassification invtClassification,
           java.lang.Double costingLotSize,
           java.lang.Double quantityOnOrder,
           java.lang.Double quantityCommitted,
           java.lang.Double quantityAvailable,
           java.lang.Double quantityBackOrdered,
           com.netsuite.webservices.platform.core_2019_1.RecordRef locationId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef supplyReplenishmentMethod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef alternateDemandSourceItem,
           java.lang.Double fixedLotSize,
           com.netsuite.webservices.lists.accounting_2019_1.types.PeriodicLotSizeType periodicLotSizeType,
           java.lang.Long periodicLotSizeDays,
           com.netsuite.webservices.platform.core_2019_1.RecordRef supplyType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef supplyLotSizingMethod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef demandSource,
           java.lang.Long backwardConsumptionDays,
           java.lang.Long forwardConsumptionDays,
           java.lang.Long demandTimeFence,
           java.lang.Long supplyTimeFence,
           java.lang.Long rescheduleInDays,
           java.lang.Long rescheduleOutDays) {
           this.location = location;
           this.quantityOnHand = quantityOnHand;
           this.onHandValueMli = onHandValueMli;
           this.averageCostMli = averageCostMli;
           this.lastPurchasePriceMli = lastPurchasePriceMli;
           this.reorderPoint = reorderPoint;
           this.locationAllowStorePickup = locationAllowStorePickup;
           this.locationStorePickupBufferStock = locationStorePickupBufferStock;
           this.locationQtyAvailForStorePickup = locationQtyAvailForStorePickup;
           this.preferredStockLevel = preferredStockLevel;
           this.leadTime = leadTime;
           this.defaultReturnCost = defaultReturnCost;
           this.safetyStockLevel = safetyStockLevel;
           this.cost = cost;
           this.inventoryCostTemplate = inventoryCostTemplate;
           this.buildTime = buildTime;
           this.lastInvtCountDate = lastInvtCountDate;
           this.nextInvtCountDate = nextInvtCountDate;
           this.isWip = isWip;
           this.invtCountInterval = invtCountInterval;
           this.invtClassification = invtClassification;
           this.costingLotSize = costingLotSize;
           this.quantityOnOrder = quantityOnOrder;
           this.quantityCommitted = quantityCommitted;
           this.quantityAvailable = quantityAvailable;
           this.quantityBackOrdered = quantityBackOrdered;
           this.locationId = locationId;
           this.supplyReplenishmentMethod = supplyReplenishmentMethod;
           this.alternateDemandSourceItem = alternateDemandSourceItem;
           this.fixedLotSize = fixedLotSize;
           this.periodicLotSizeType = periodicLotSizeType;
           this.periodicLotSizeDays = periodicLotSizeDays;
           this.supplyType = supplyType;
           this.supplyLotSizingMethod = supplyLotSizingMethod;
           this.demandSource = demandSource;
           this.backwardConsumptionDays = backwardConsumptionDays;
           this.forwardConsumptionDays = forwardConsumptionDays;
           this.demandTimeFence = demandTimeFence;
           this.supplyTimeFence = supplyTimeFence;
           this.rescheduleInDays = rescheduleInDays;
           this.rescheduleOutDays = rescheduleOutDays;
    }


    /**
     * Gets the location value for this InventoryItemLocations.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InventoryItemLocations.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the quantityOnHand value for this InventoryItemLocations.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this InventoryItemLocations.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the onHandValueMli value for this InventoryItemLocations.
     * 
     * @return onHandValueMli
     */
    public java.lang.Double getOnHandValueMli() {
        return onHandValueMli;
    }


    /**
     * Sets the onHandValueMli value for this InventoryItemLocations.
     * 
     * @param onHandValueMli
     */
    public void setOnHandValueMli(java.lang.Double onHandValueMli) {
        this.onHandValueMli = onHandValueMli;
    }


    /**
     * Gets the averageCostMli value for this InventoryItemLocations.
     * 
     * @return averageCostMli
     */
    public java.lang.Double getAverageCostMli() {
        return averageCostMli;
    }


    /**
     * Sets the averageCostMli value for this InventoryItemLocations.
     * 
     * @param averageCostMli
     */
    public void setAverageCostMli(java.lang.Double averageCostMli) {
        this.averageCostMli = averageCostMli;
    }


    /**
     * Gets the lastPurchasePriceMli value for this InventoryItemLocations.
     * 
     * @return lastPurchasePriceMli
     */
    public java.lang.Double getLastPurchasePriceMli() {
        return lastPurchasePriceMli;
    }


    /**
     * Sets the lastPurchasePriceMli value for this InventoryItemLocations.
     * 
     * @param lastPurchasePriceMli
     */
    public void setLastPurchasePriceMli(java.lang.Double lastPurchasePriceMli) {
        this.lastPurchasePriceMli = lastPurchasePriceMli;
    }


    /**
     * Gets the reorderPoint value for this InventoryItemLocations.
     * 
     * @return reorderPoint
     */
    public java.lang.Double getReorderPoint() {
        return reorderPoint;
    }


    /**
     * Sets the reorderPoint value for this InventoryItemLocations.
     * 
     * @param reorderPoint
     */
    public void setReorderPoint(java.lang.Double reorderPoint) {
        this.reorderPoint = reorderPoint;
    }


    /**
     * Gets the locationAllowStorePickup value for this InventoryItemLocations.
     * 
     * @return locationAllowStorePickup
     */
    public java.lang.Boolean getLocationAllowStorePickup() {
        return locationAllowStorePickup;
    }


    /**
     * Sets the locationAllowStorePickup value for this InventoryItemLocations.
     * 
     * @param locationAllowStorePickup
     */
    public void setLocationAllowStorePickup(java.lang.Boolean locationAllowStorePickup) {
        this.locationAllowStorePickup = locationAllowStorePickup;
    }


    /**
     * Gets the locationStorePickupBufferStock value for this InventoryItemLocations.
     * 
     * @return locationStorePickupBufferStock
     */
    public java.lang.Double getLocationStorePickupBufferStock() {
        return locationStorePickupBufferStock;
    }


    /**
     * Sets the locationStorePickupBufferStock value for this InventoryItemLocations.
     * 
     * @param locationStorePickupBufferStock
     */
    public void setLocationStorePickupBufferStock(java.lang.Double locationStorePickupBufferStock) {
        this.locationStorePickupBufferStock = locationStorePickupBufferStock;
    }


    /**
     * Gets the locationQtyAvailForStorePickup value for this InventoryItemLocations.
     * 
     * @return locationQtyAvailForStorePickup
     */
    public java.lang.Double getLocationQtyAvailForStorePickup() {
        return locationQtyAvailForStorePickup;
    }


    /**
     * Sets the locationQtyAvailForStorePickup value for this InventoryItemLocations.
     * 
     * @param locationQtyAvailForStorePickup
     */
    public void setLocationQtyAvailForStorePickup(java.lang.Double locationQtyAvailForStorePickup) {
        this.locationQtyAvailForStorePickup = locationQtyAvailForStorePickup;
    }


    /**
     * Gets the preferredStockLevel value for this InventoryItemLocations.
     * 
     * @return preferredStockLevel
     */
    public java.lang.Double getPreferredStockLevel() {
        return preferredStockLevel;
    }


    /**
     * Sets the preferredStockLevel value for this InventoryItemLocations.
     * 
     * @param preferredStockLevel
     */
    public void setPreferredStockLevel(java.lang.Double preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }


    /**
     * Gets the leadTime value for this InventoryItemLocations.
     * 
     * @return leadTime
     */
    public java.lang.Long getLeadTime() {
        return leadTime;
    }


    /**
     * Sets the leadTime value for this InventoryItemLocations.
     * 
     * @param leadTime
     */
    public void setLeadTime(java.lang.Long leadTime) {
        this.leadTime = leadTime;
    }


    /**
     * Gets the defaultReturnCost value for this InventoryItemLocations.
     * 
     * @return defaultReturnCost
     */
    public java.lang.Double getDefaultReturnCost() {
        return defaultReturnCost;
    }


    /**
     * Sets the defaultReturnCost value for this InventoryItemLocations.
     * 
     * @param defaultReturnCost
     */
    public void setDefaultReturnCost(java.lang.Double defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }


    /**
     * Gets the safetyStockLevel value for this InventoryItemLocations.
     * 
     * @return safetyStockLevel
     */
    public java.lang.Double getSafetyStockLevel() {
        return safetyStockLevel;
    }


    /**
     * Sets the safetyStockLevel value for this InventoryItemLocations.
     * 
     * @param safetyStockLevel
     */
    public void setSafetyStockLevel(java.lang.Double safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }


    /**
     * Gets the cost value for this InventoryItemLocations.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this InventoryItemLocations.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the inventoryCostTemplate value for this InventoryItemLocations.
     * 
     * @return inventoryCostTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInventoryCostTemplate() {
        return inventoryCostTemplate;
    }


    /**
     * Sets the inventoryCostTemplate value for this InventoryItemLocations.
     * 
     * @param inventoryCostTemplate
     */
    public void setInventoryCostTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef inventoryCostTemplate) {
        this.inventoryCostTemplate = inventoryCostTemplate;
    }


    /**
     * Gets the buildTime value for this InventoryItemLocations.
     * 
     * @return buildTime
     */
    public java.lang.Double getBuildTime() {
        return buildTime;
    }


    /**
     * Sets the buildTime value for this InventoryItemLocations.
     * 
     * @param buildTime
     */
    public void setBuildTime(java.lang.Double buildTime) {
        this.buildTime = buildTime;
    }


    /**
     * Gets the lastInvtCountDate value for this InventoryItemLocations.
     * 
     * @return lastInvtCountDate
     */
    public java.util.Calendar getLastInvtCountDate() {
        return lastInvtCountDate;
    }


    /**
     * Sets the lastInvtCountDate value for this InventoryItemLocations.
     * 
     * @param lastInvtCountDate
     */
    public void setLastInvtCountDate(java.util.Calendar lastInvtCountDate) {
        this.lastInvtCountDate = lastInvtCountDate;
    }


    /**
     * Gets the nextInvtCountDate value for this InventoryItemLocations.
     * 
     * @return nextInvtCountDate
     */
    public java.util.Calendar getNextInvtCountDate() {
        return nextInvtCountDate;
    }


    /**
     * Sets the nextInvtCountDate value for this InventoryItemLocations.
     * 
     * @param nextInvtCountDate
     */
    public void setNextInvtCountDate(java.util.Calendar nextInvtCountDate) {
        this.nextInvtCountDate = nextInvtCountDate;
    }


    /**
     * Gets the isWip value for this InventoryItemLocations.
     * 
     * @return isWip
     */
    public java.lang.Boolean getIsWip() {
        return isWip;
    }


    /**
     * Sets the isWip value for this InventoryItemLocations.
     * 
     * @param isWip
     */
    public void setIsWip(java.lang.Boolean isWip) {
        this.isWip = isWip;
    }


    /**
     * Gets the invtCountInterval value for this InventoryItemLocations.
     * 
     * @return invtCountInterval
     */
    public java.lang.Long getInvtCountInterval() {
        return invtCountInterval;
    }


    /**
     * Sets the invtCountInterval value for this InventoryItemLocations.
     * 
     * @param invtCountInterval
     */
    public void setInvtCountInterval(java.lang.Long invtCountInterval) {
        this.invtCountInterval = invtCountInterval;
    }


    /**
     * Gets the invtClassification value for this InventoryItemLocations.
     * 
     * @return invtClassification
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemInvtClassification getInvtClassification() {
        return invtClassification;
    }


    /**
     * Sets the invtClassification value for this InventoryItemLocations.
     * 
     * @param invtClassification
     */
    public void setInvtClassification(com.netsuite.webservices.lists.accounting_2019_1.types.ItemInvtClassification invtClassification) {
        this.invtClassification = invtClassification;
    }


    /**
     * Gets the costingLotSize value for this InventoryItemLocations.
     * 
     * @return costingLotSize
     */
    public java.lang.Double getCostingLotSize() {
        return costingLotSize;
    }


    /**
     * Sets the costingLotSize value for this InventoryItemLocations.
     * 
     * @param costingLotSize
     */
    public void setCostingLotSize(java.lang.Double costingLotSize) {
        this.costingLotSize = costingLotSize;
    }


    /**
     * Gets the quantityOnOrder value for this InventoryItemLocations.
     * 
     * @return quantityOnOrder
     */
    public java.lang.Double getQuantityOnOrder() {
        return quantityOnOrder;
    }


    /**
     * Sets the quantityOnOrder value for this InventoryItemLocations.
     * 
     * @param quantityOnOrder
     */
    public void setQuantityOnOrder(java.lang.Double quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }


    /**
     * Gets the quantityCommitted value for this InventoryItemLocations.
     * 
     * @return quantityCommitted
     */
    public java.lang.Double getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this InventoryItemLocations.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(java.lang.Double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityAvailable value for this InventoryItemLocations.
     * 
     * @return quantityAvailable
     */
    public java.lang.Double getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this InventoryItemLocations.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(java.lang.Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the quantityBackOrdered value for this InventoryItemLocations.
     * 
     * @return quantityBackOrdered
     */
    public java.lang.Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this InventoryItemLocations.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.lang.Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the locationId value for this InventoryItemLocations.
     * 
     * @return locationId
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this InventoryItemLocations.
     * 
     * @param locationId
     */
    public void setLocationId(com.netsuite.webservices.platform.core_2019_1.RecordRef locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the supplyReplenishmentMethod value for this InventoryItemLocations.
     * 
     * @return supplyReplenishmentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSupplyReplenishmentMethod() {
        return supplyReplenishmentMethod;
    }


    /**
     * Sets the supplyReplenishmentMethod value for this InventoryItemLocations.
     * 
     * @param supplyReplenishmentMethod
     */
    public void setSupplyReplenishmentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef supplyReplenishmentMethod) {
        this.supplyReplenishmentMethod = supplyReplenishmentMethod;
    }


    /**
     * Gets the alternateDemandSourceItem value for this InventoryItemLocations.
     * 
     * @return alternateDemandSourceItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAlternateDemandSourceItem() {
        return alternateDemandSourceItem;
    }


    /**
     * Sets the alternateDemandSourceItem value for this InventoryItemLocations.
     * 
     * @param alternateDemandSourceItem
     */
    public void setAlternateDemandSourceItem(com.netsuite.webservices.platform.core_2019_1.RecordRef alternateDemandSourceItem) {
        this.alternateDemandSourceItem = alternateDemandSourceItem;
    }


    /**
     * Gets the fixedLotSize value for this InventoryItemLocations.
     * 
     * @return fixedLotSize
     */
    public java.lang.Double getFixedLotSize() {
        return fixedLotSize;
    }


    /**
     * Sets the fixedLotSize value for this InventoryItemLocations.
     * 
     * @param fixedLotSize
     */
    public void setFixedLotSize(java.lang.Double fixedLotSize) {
        this.fixedLotSize = fixedLotSize;
    }


    /**
     * Gets the periodicLotSizeType value for this InventoryItemLocations.
     * 
     * @return periodicLotSizeType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.PeriodicLotSizeType getPeriodicLotSizeType() {
        return periodicLotSizeType;
    }


    /**
     * Sets the periodicLotSizeType value for this InventoryItemLocations.
     * 
     * @param periodicLotSizeType
     */
    public void setPeriodicLotSizeType(com.netsuite.webservices.lists.accounting_2019_1.types.PeriodicLotSizeType periodicLotSizeType) {
        this.periodicLotSizeType = periodicLotSizeType;
    }


    /**
     * Gets the periodicLotSizeDays value for this InventoryItemLocations.
     * 
     * @return periodicLotSizeDays
     */
    public java.lang.Long getPeriodicLotSizeDays() {
        return periodicLotSizeDays;
    }


    /**
     * Sets the periodicLotSizeDays value for this InventoryItemLocations.
     * 
     * @param periodicLotSizeDays
     */
    public void setPeriodicLotSizeDays(java.lang.Long periodicLotSizeDays) {
        this.periodicLotSizeDays = periodicLotSizeDays;
    }


    /**
     * Gets the supplyType value for this InventoryItemLocations.
     * 
     * @return supplyType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSupplyType() {
        return supplyType;
    }


    /**
     * Sets the supplyType value for this InventoryItemLocations.
     * 
     * @param supplyType
     */
    public void setSupplyType(com.netsuite.webservices.platform.core_2019_1.RecordRef supplyType) {
        this.supplyType = supplyType;
    }


    /**
     * Gets the supplyLotSizingMethod value for this InventoryItemLocations.
     * 
     * @return supplyLotSizingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSupplyLotSizingMethod() {
        return supplyLotSizingMethod;
    }


    /**
     * Sets the supplyLotSizingMethod value for this InventoryItemLocations.
     * 
     * @param supplyLotSizingMethod
     */
    public void setSupplyLotSizingMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef supplyLotSizingMethod) {
        this.supplyLotSizingMethod = supplyLotSizingMethod;
    }


    /**
     * Gets the demandSource value for this InventoryItemLocations.
     * 
     * @return demandSource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDemandSource() {
        return demandSource;
    }


    /**
     * Sets the demandSource value for this InventoryItemLocations.
     * 
     * @param demandSource
     */
    public void setDemandSource(com.netsuite.webservices.platform.core_2019_1.RecordRef demandSource) {
        this.demandSource = demandSource;
    }


    /**
     * Gets the backwardConsumptionDays value for this InventoryItemLocations.
     * 
     * @return backwardConsumptionDays
     */
    public java.lang.Long getBackwardConsumptionDays() {
        return backwardConsumptionDays;
    }


    /**
     * Sets the backwardConsumptionDays value for this InventoryItemLocations.
     * 
     * @param backwardConsumptionDays
     */
    public void setBackwardConsumptionDays(java.lang.Long backwardConsumptionDays) {
        this.backwardConsumptionDays = backwardConsumptionDays;
    }


    /**
     * Gets the forwardConsumptionDays value for this InventoryItemLocations.
     * 
     * @return forwardConsumptionDays
     */
    public java.lang.Long getForwardConsumptionDays() {
        return forwardConsumptionDays;
    }


    /**
     * Sets the forwardConsumptionDays value for this InventoryItemLocations.
     * 
     * @param forwardConsumptionDays
     */
    public void setForwardConsumptionDays(java.lang.Long forwardConsumptionDays) {
        this.forwardConsumptionDays = forwardConsumptionDays;
    }


    /**
     * Gets the demandTimeFence value for this InventoryItemLocations.
     * 
     * @return demandTimeFence
     */
    public java.lang.Long getDemandTimeFence() {
        return demandTimeFence;
    }


    /**
     * Sets the demandTimeFence value for this InventoryItemLocations.
     * 
     * @param demandTimeFence
     */
    public void setDemandTimeFence(java.lang.Long demandTimeFence) {
        this.demandTimeFence = demandTimeFence;
    }


    /**
     * Gets the supplyTimeFence value for this InventoryItemLocations.
     * 
     * @return supplyTimeFence
     */
    public java.lang.Long getSupplyTimeFence() {
        return supplyTimeFence;
    }


    /**
     * Sets the supplyTimeFence value for this InventoryItemLocations.
     * 
     * @param supplyTimeFence
     */
    public void setSupplyTimeFence(java.lang.Long supplyTimeFence) {
        this.supplyTimeFence = supplyTimeFence;
    }


    /**
     * Gets the rescheduleInDays value for this InventoryItemLocations.
     * 
     * @return rescheduleInDays
     */
    public java.lang.Long getRescheduleInDays() {
        return rescheduleInDays;
    }


    /**
     * Sets the rescheduleInDays value for this InventoryItemLocations.
     * 
     * @param rescheduleInDays
     */
    public void setRescheduleInDays(java.lang.Long rescheduleInDays) {
        this.rescheduleInDays = rescheduleInDays;
    }


    /**
     * Gets the rescheduleOutDays value for this InventoryItemLocations.
     * 
     * @return rescheduleOutDays
     */
    public java.lang.Long getRescheduleOutDays() {
        return rescheduleOutDays;
    }


    /**
     * Sets the rescheduleOutDays value for this InventoryItemLocations.
     * 
     * @param rescheduleOutDays
     */
    public void setRescheduleOutDays(java.lang.Long rescheduleOutDays) {
        this.rescheduleOutDays = rescheduleOutDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryItemLocations)) return false;
        InventoryItemLocations other = (InventoryItemLocations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.onHandValueMli==null && other.getOnHandValueMli()==null) || 
             (this.onHandValueMli!=null &&
              this.onHandValueMli.equals(other.getOnHandValueMli()))) &&
            ((this.averageCostMli==null && other.getAverageCostMli()==null) || 
             (this.averageCostMli!=null &&
              this.averageCostMli.equals(other.getAverageCostMli()))) &&
            ((this.lastPurchasePriceMli==null && other.getLastPurchasePriceMli()==null) || 
             (this.lastPurchasePriceMli!=null &&
              this.lastPurchasePriceMli.equals(other.getLastPurchasePriceMli()))) &&
            ((this.reorderPoint==null && other.getReorderPoint()==null) || 
             (this.reorderPoint!=null &&
              this.reorderPoint.equals(other.getReorderPoint()))) &&
            ((this.locationAllowStorePickup==null && other.getLocationAllowStorePickup()==null) || 
             (this.locationAllowStorePickup!=null &&
              this.locationAllowStorePickup.equals(other.getLocationAllowStorePickup()))) &&
            ((this.locationStorePickupBufferStock==null && other.getLocationStorePickupBufferStock()==null) || 
             (this.locationStorePickupBufferStock!=null &&
              this.locationStorePickupBufferStock.equals(other.getLocationStorePickupBufferStock()))) &&
            ((this.locationQtyAvailForStorePickup==null && other.getLocationQtyAvailForStorePickup()==null) || 
             (this.locationQtyAvailForStorePickup!=null &&
              this.locationQtyAvailForStorePickup.equals(other.getLocationQtyAvailForStorePickup()))) &&
            ((this.preferredStockLevel==null && other.getPreferredStockLevel()==null) || 
             (this.preferredStockLevel!=null &&
              this.preferredStockLevel.equals(other.getPreferredStockLevel()))) &&
            ((this.leadTime==null && other.getLeadTime()==null) || 
             (this.leadTime!=null &&
              this.leadTime.equals(other.getLeadTime()))) &&
            ((this.defaultReturnCost==null && other.getDefaultReturnCost()==null) || 
             (this.defaultReturnCost!=null &&
              this.defaultReturnCost.equals(other.getDefaultReturnCost()))) &&
            ((this.safetyStockLevel==null && other.getSafetyStockLevel()==null) || 
             (this.safetyStockLevel!=null &&
              this.safetyStockLevel.equals(other.getSafetyStockLevel()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.inventoryCostTemplate==null && other.getInventoryCostTemplate()==null) || 
             (this.inventoryCostTemplate!=null &&
              this.inventoryCostTemplate.equals(other.getInventoryCostTemplate()))) &&
            ((this.buildTime==null && other.getBuildTime()==null) || 
             (this.buildTime!=null &&
              this.buildTime.equals(other.getBuildTime()))) &&
            ((this.lastInvtCountDate==null && other.getLastInvtCountDate()==null) || 
             (this.lastInvtCountDate!=null &&
              this.lastInvtCountDate.equals(other.getLastInvtCountDate()))) &&
            ((this.nextInvtCountDate==null && other.getNextInvtCountDate()==null) || 
             (this.nextInvtCountDate!=null &&
              this.nextInvtCountDate.equals(other.getNextInvtCountDate()))) &&
            ((this.isWip==null && other.getIsWip()==null) || 
             (this.isWip!=null &&
              this.isWip.equals(other.getIsWip()))) &&
            ((this.invtCountInterval==null && other.getInvtCountInterval()==null) || 
             (this.invtCountInterval!=null &&
              this.invtCountInterval.equals(other.getInvtCountInterval()))) &&
            ((this.invtClassification==null && other.getInvtClassification()==null) || 
             (this.invtClassification!=null &&
              this.invtClassification.equals(other.getInvtClassification()))) &&
            ((this.costingLotSize==null && other.getCostingLotSize()==null) || 
             (this.costingLotSize!=null &&
              this.costingLotSize.equals(other.getCostingLotSize()))) &&
            ((this.quantityOnOrder==null && other.getQuantityOnOrder()==null) || 
             (this.quantityOnOrder!=null &&
              this.quantityOnOrder.equals(other.getQuantityOnOrder()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId()))) &&
            ((this.supplyReplenishmentMethod==null && other.getSupplyReplenishmentMethod()==null) || 
             (this.supplyReplenishmentMethod!=null &&
              this.supplyReplenishmentMethod.equals(other.getSupplyReplenishmentMethod()))) &&
            ((this.alternateDemandSourceItem==null && other.getAlternateDemandSourceItem()==null) || 
             (this.alternateDemandSourceItem!=null &&
              this.alternateDemandSourceItem.equals(other.getAlternateDemandSourceItem()))) &&
            ((this.fixedLotSize==null && other.getFixedLotSize()==null) || 
             (this.fixedLotSize!=null &&
              this.fixedLotSize.equals(other.getFixedLotSize()))) &&
            ((this.periodicLotSizeType==null && other.getPeriodicLotSizeType()==null) || 
             (this.periodicLotSizeType!=null &&
              this.periodicLotSizeType.equals(other.getPeriodicLotSizeType()))) &&
            ((this.periodicLotSizeDays==null && other.getPeriodicLotSizeDays()==null) || 
             (this.periodicLotSizeDays!=null &&
              this.periodicLotSizeDays.equals(other.getPeriodicLotSizeDays()))) &&
            ((this.supplyType==null && other.getSupplyType()==null) || 
             (this.supplyType!=null &&
              this.supplyType.equals(other.getSupplyType()))) &&
            ((this.supplyLotSizingMethod==null && other.getSupplyLotSizingMethod()==null) || 
             (this.supplyLotSizingMethod!=null &&
              this.supplyLotSizingMethod.equals(other.getSupplyLotSizingMethod()))) &&
            ((this.demandSource==null && other.getDemandSource()==null) || 
             (this.demandSource!=null &&
              this.demandSource.equals(other.getDemandSource()))) &&
            ((this.backwardConsumptionDays==null && other.getBackwardConsumptionDays()==null) || 
             (this.backwardConsumptionDays!=null &&
              this.backwardConsumptionDays.equals(other.getBackwardConsumptionDays()))) &&
            ((this.forwardConsumptionDays==null && other.getForwardConsumptionDays()==null) || 
             (this.forwardConsumptionDays!=null &&
              this.forwardConsumptionDays.equals(other.getForwardConsumptionDays()))) &&
            ((this.demandTimeFence==null && other.getDemandTimeFence()==null) || 
             (this.demandTimeFence!=null &&
              this.demandTimeFence.equals(other.getDemandTimeFence()))) &&
            ((this.supplyTimeFence==null && other.getSupplyTimeFence()==null) || 
             (this.supplyTimeFence!=null &&
              this.supplyTimeFence.equals(other.getSupplyTimeFence()))) &&
            ((this.rescheduleInDays==null && other.getRescheduleInDays()==null) || 
             (this.rescheduleInDays!=null &&
              this.rescheduleInDays.equals(other.getRescheduleInDays()))) &&
            ((this.rescheduleOutDays==null && other.getRescheduleOutDays()==null) || 
             (this.rescheduleOutDays!=null &&
              this.rescheduleOutDays.equals(other.getRescheduleOutDays())));
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getOnHandValueMli() != null) {
            _hashCode += getOnHandValueMli().hashCode();
        }
        if (getAverageCostMli() != null) {
            _hashCode += getAverageCostMli().hashCode();
        }
        if (getLastPurchasePriceMli() != null) {
            _hashCode += getLastPurchasePriceMli().hashCode();
        }
        if (getReorderPoint() != null) {
            _hashCode += getReorderPoint().hashCode();
        }
        if (getLocationAllowStorePickup() != null) {
            _hashCode += getLocationAllowStorePickup().hashCode();
        }
        if (getLocationStorePickupBufferStock() != null) {
            _hashCode += getLocationStorePickupBufferStock().hashCode();
        }
        if (getLocationQtyAvailForStorePickup() != null) {
            _hashCode += getLocationQtyAvailForStorePickup().hashCode();
        }
        if (getPreferredStockLevel() != null) {
            _hashCode += getPreferredStockLevel().hashCode();
        }
        if (getLeadTime() != null) {
            _hashCode += getLeadTime().hashCode();
        }
        if (getDefaultReturnCost() != null) {
            _hashCode += getDefaultReturnCost().hashCode();
        }
        if (getSafetyStockLevel() != null) {
            _hashCode += getSafetyStockLevel().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getInventoryCostTemplate() != null) {
            _hashCode += getInventoryCostTemplate().hashCode();
        }
        if (getBuildTime() != null) {
            _hashCode += getBuildTime().hashCode();
        }
        if (getLastInvtCountDate() != null) {
            _hashCode += getLastInvtCountDate().hashCode();
        }
        if (getNextInvtCountDate() != null) {
            _hashCode += getNextInvtCountDate().hashCode();
        }
        if (getIsWip() != null) {
            _hashCode += getIsWip().hashCode();
        }
        if (getInvtCountInterval() != null) {
            _hashCode += getInvtCountInterval().hashCode();
        }
        if (getInvtClassification() != null) {
            _hashCode += getInvtClassification().hashCode();
        }
        if (getCostingLotSize() != null) {
            _hashCode += getCostingLotSize().hashCode();
        }
        if (getQuantityOnOrder() != null) {
            _hashCode += getQuantityOnOrder().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        if (getSupplyReplenishmentMethod() != null) {
            _hashCode += getSupplyReplenishmentMethod().hashCode();
        }
        if (getAlternateDemandSourceItem() != null) {
            _hashCode += getAlternateDemandSourceItem().hashCode();
        }
        if (getFixedLotSize() != null) {
            _hashCode += getFixedLotSize().hashCode();
        }
        if (getPeriodicLotSizeType() != null) {
            _hashCode += getPeriodicLotSizeType().hashCode();
        }
        if (getPeriodicLotSizeDays() != null) {
            _hashCode += getPeriodicLotSizeDays().hashCode();
        }
        if (getSupplyType() != null) {
            _hashCode += getSupplyType().hashCode();
        }
        if (getSupplyLotSizingMethod() != null) {
            _hashCode += getSupplyLotSizingMethod().hashCode();
        }
        if (getDemandSource() != null) {
            _hashCode += getDemandSource().hashCode();
        }
        if (getBackwardConsumptionDays() != null) {
            _hashCode += getBackwardConsumptionDays().hashCode();
        }
        if (getForwardConsumptionDays() != null) {
            _hashCode += getForwardConsumptionDays().hashCode();
        }
        if (getDemandTimeFence() != null) {
            _hashCode += getDemandTimeFence().hashCode();
        }
        if (getSupplyTimeFence() != null) {
            _hashCode += getSupplyTimeFence().hashCode();
        }
        if (getRescheduleInDays() != null) {
            _hashCode += getRescheduleInDays().hashCode();
        }
        if (getRescheduleOutDays() != null) {
            _hashCode += getRescheduleOutDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryItemLocations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "InventoryItemLocations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onHandValueMli");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "onHandValueMli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCostMli");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "averageCostMli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPurchasePriceMli");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "lastPurchasePriceMli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "reorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAllowStorePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "locationAllowStorePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationStorePickupBufferStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "locationStorePickupBufferStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQtyAvailForStorePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "locationQtyAvailForStorePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inventoryCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "buildTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "lastInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nextInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isWip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invtCountInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "invtCountInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invtClassification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "invtClassification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemInvtClassification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costingLotSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "costingLotSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyReplenishmentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "supplyReplenishmentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateDemandSourceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "alternateDemandSourceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedLotSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fixedLotSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicLotSizeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "periodicLotSizeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "PeriodicLotSizeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicLotSizeDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "periodicLotSizeDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "supplyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyLotSizingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "supplyLotSizingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "demandSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "backwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "forwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "demandTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "supplyTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rescheduleInDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "rescheduleInDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rescheduleOutDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "rescheduleOutDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
