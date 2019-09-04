/**
 * ItemSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ItemSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accBookRevRecForecastRule;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookAmortization;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookCreatePlansOn;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookRevRecRule;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookRevRecSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField allowedShippingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField alternateDemandSourceItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField atpLeadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField atpMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoLeadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoPreferredStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoReorderPoint;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableToPartners;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField averageCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField backwardConsumptionDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField binNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField binOnHandAvail;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField binOnHandCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField bomQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField buildEntireAssembly;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField buildTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField buyItNowPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField caption;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField component;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField componentOf;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField componentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField contingentRevenueHandling;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField copyDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField correlatedItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField correlatedItemCorrelation;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField correlatedItemCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField correlatedItemLift;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField correlatedItemPurchaseRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField costAccountingStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField costCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField costEstimateType;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField costingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField countryOfManufacture;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField created;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField createJob;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField createRevenuePlansOn;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateViewed;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField daysBeforeExpiration;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField defaultReturnCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultShippingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField deferRevRec;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField demandModifier;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField demandSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField demandTimeFence;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField directRevenuePosting;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField displayIneBayStore;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField displayName;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField distributionCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField distributionNetwork;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField dontShowPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField eBayItemDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField eBayItemSubtitle;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField eBayItemTitle;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField ebayRelistingOption;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField effectiveBomControl;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField effectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField effectiveRevision;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField endAuctionsWhenOutOfStock;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField excludeFromSitemap;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField featuredDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField feedDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField feedName;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fixedLotSize;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField forwardConsumptionDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField fraudRisk;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField froogleProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField generateAccruals;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertAuthCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField giftCertExpDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertFrom;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertMsg;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertOrigAmt;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertRecipient;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField hierarchyNode;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField hierarchyVersion;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField imageUrl;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField inventoryLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField invtClassification;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField invtCountInterval;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDropShipItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isFulfillable;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoCompliant;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isLotItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isOnline;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPreferredVendor;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSerialItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSpecialOrderItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSpecialWorkOrderItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isStorePickupAllowed;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField issueProduct;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isTaxable;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isVsoeBundle;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isWip;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField itemId;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemRevenueCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField itemUrl;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastInvtCountDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lastPurchasePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastQuantityAvailableChange;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField leadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField listingDuration;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField locationAllowStorePickup;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationAtpLeadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationAverageCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationBuildTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationCostAccountingStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationDefaultReturnCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationDemandSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField locationDemandTimeFence;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationFixedLotSize;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField locationInventoryCostTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationInvtClassification;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField locationInvtCountInterval;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField locationLastInvtCountDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField locationLeadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField locationNextInvtCountDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField locationPeriodicLotSizeDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationPeriodicLotSizeType;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationPreferredStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQtyAvailForStorePickup;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityBackOrdered;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityInTransit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityOnHand;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityOnOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationReorderPoint;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField locationRescheduleInDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField locationRescheduleOutDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationSafetyStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationStorePickupBufferStock;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationSupplyLotSizingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField locationSupplyTimeFence;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationSupplyType;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationTotalValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField locBackwardConsumptionDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField locForwardConsumptionDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturer;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField manufactureraddr1;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerCity;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerState;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerTariff;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerTaxId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerZip;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField manufacturingChargeItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField matchBillToReceipt;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField matrix;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField matrixChild;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField maximumQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField metaTagHtml;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField minimumQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField mossApplies;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField mpn;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField multManufactureAddr;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField nexTagCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField nexTagProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField nextInvtCountDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField numActiveListings;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField numberAllowedDownloads;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField numCurrentlyListed;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField obsoleteDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField obsoleteRevision;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField offerSupport;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField onlineCustomerPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField onSpecial;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField otherVendor;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField outOfStockBehavior;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField overallQuantityPricingType;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField overheadType;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField pageTitle;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField periodicLotSizeDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField periodicLotSizeType;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField preferenceCriterion;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField preferredBin;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField preferredLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField preferredStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField preferredStockLevelDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField price;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField pricesIncludeTax;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField pricingGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField primaryCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField purchaseUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityBackOrdered;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnHand;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField quantityPricingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField reorderMultiple;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField reorderPoint;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField rescheduleInDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField rescheduleOutDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField reservePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revenueAllocationGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revenueRecognitionRule;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revRecForecastRule;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revRecSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField roundUpAsComponent;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField safetyStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField safetyStockLevelDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField salesDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField saleUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField sameAsPrimaryBookAmortization;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField sameAsPrimaryBookRevRec;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField scheduleBCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField scheduleBNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField scheduleBQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField searchKeywords;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField seasonalDemand;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField sellOnEBay;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField serialNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField serialNumberLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipIndividually;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipPackage;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField shippingCarrier;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField shippingRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shoppingDotComCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shoppingProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField shopzillaCategoryId;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shopzillaProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField sitemapPriority;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField softDescriptor;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField startingPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField stockDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField stockUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField storeDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField subType;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField supplyLotSizingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField supplyReplenishmentMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField supplyTimeFence;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField supplyType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField thumbnailUrl;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField totalValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField trackLandedCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unitsType;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField upcCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField urlComponent;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useBins;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useComponentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useMarginalRates;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vendor;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField vendorCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vendorCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vendorCostEntered;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField vendorName;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vendorPriceCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoeDeferral;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField vsoeDelivered;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoePermitDiscount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vsoePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoeSopGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField webSite;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField weight;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField yahooProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public ItemSearchBasic() {
    }


    /**
     * Gets the accBookRevRecForecastRule value for this ItemSearchBasic.
     * 
     * @return accBookRevRecForecastRule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccBookRevRecForecastRule() {
        return accBookRevRecForecastRule;
    }


    /**
     * Sets the accBookRevRecForecastRule value for this ItemSearchBasic.
     * 
     * @param accBookRevRecForecastRule
     */
    public void setAccBookRevRecForecastRule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accBookRevRecForecastRule) {
        this.accBookRevRecForecastRule = accBookRevRecForecastRule;
    }


    /**
     * Gets the account value for this ItemSearchBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ItemSearchBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account) {
        this.account = account;
    }


    /**
     * Gets the accountingBook value for this ItemSearchBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this ItemSearchBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the accountingBookAmortization value for this ItemSearchBasic.
     * 
     * @return accountingBookAmortization
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccountingBookAmortization() {
        return accountingBookAmortization;
    }


    /**
     * Sets the accountingBookAmortization value for this ItemSearchBasic.
     * 
     * @param accountingBookAmortization
     */
    public void setAccountingBookAmortization(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookAmortization) {
        this.accountingBookAmortization = accountingBookAmortization;
    }


    /**
     * Gets the accountingBookCreatePlansOn value for this ItemSearchBasic.
     * 
     * @return accountingBookCreatePlansOn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccountingBookCreatePlansOn() {
        return accountingBookCreatePlansOn;
    }


    /**
     * Sets the accountingBookCreatePlansOn value for this ItemSearchBasic.
     * 
     * @param accountingBookCreatePlansOn
     */
    public void setAccountingBookCreatePlansOn(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookCreatePlansOn) {
        this.accountingBookCreatePlansOn = accountingBookCreatePlansOn;
    }


    /**
     * Gets the accountingBookRevRecRule value for this ItemSearchBasic.
     * 
     * @return accountingBookRevRecRule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccountingBookRevRecRule() {
        return accountingBookRevRecRule;
    }


    /**
     * Sets the accountingBookRevRecRule value for this ItemSearchBasic.
     * 
     * @param accountingBookRevRecRule
     */
    public void setAccountingBookRevRecRule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookRevRecRule) {
        this.accountingBookRevRecRule = accountingBookRevRecRule;
    }


    /**
     * Gets the accountingBookRevRecSchedule value for this ItemSearchBasic.
     * 
     * @return accountingBookRevRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccountingBookRevRecSchedule() {
        return accountingBookRevRecSchedule;
    }


    /**
     * Sets the accountingBookRevRecSchedule value for this ItemSearchBasic.
     * 
     * @param accountingBookRevRecSchedule
     */
    public void setAccountingBookRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingBookRevRecSchedule) {
        this.accountingBookRevRecSchedule = accountingBookRevRecSchedule;
    }


    /**
     * Gets the allowedShippingMethod value for this ItemSearchBasic.
     * 
     * @return allowedShippingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAllowedShippingMethod() {
        return allowedShippingMethod;
    }


    /**
     * Sets the allowedShippingMethod value for this ItemSearchBasic.
     * 
     * @param allowedShippingMethod
     */
    public void setAllowedShippingMethod(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField allowedShippingMethod) {
        this.allowedShippingMethod = allowedShippingMethod;
    }


    /**
     * Gets the alternateDemandSourceItem value for this ItemSearchBasic.
     * 
     * @return alternateDemandSourceItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAlternateDemandSourceItem() {
        return alternateDemandSourceItem;
    }


    /**
     * Sets the alternateDemandSourceItem value for this ItemSearchBasic.
     * 
     * @param alternateDemandSourceItem
     */
    public void setAlternateDemandSourceItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField alternateDemandSourceItem) {
        this.alternateDemandSourceItem = alternateDemandSourceItem;
    }


    /**
     * Gets the atpLeadTime value for this ItemSearchBasic.
     * 
     * @return atpLeadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAtpLeadTime() {
        return atpLeadTime;
    }


    /**
     * Sets the atpLeadTime value for this ItemSearchBasic.
     * 
     * @param atpLeadTime
     */
    public void setAtpLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField atpLeadTime) {
        this.atpLeadTime = atpLeadTime;
    }


    /**
     * Gets the atpMethod value for this ItemSearchBasic.
     * 
     * @return atpMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAtpMethod() {
        return atpMethod;
    }


    /**
     * Sets the atpMethod value for this ItemSearchBasic.
     * 
     * @param atpMethod
     */
    public void setAtpMethod(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField atpMethod) {
        this.atpMethod = atpMethod;
    }


    /**
     * Gets the autoLeadTime value for this ItemSearchBasic.
     * 
     * @return autoLeadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAutoLeadTime() {
        return autoLeadTime;
    }


    /**
     * Sets the autoLeadTime value for this ItemSearchBasic.
     * 
     * @param autoLeadTime
     */
    public void setAutoLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoLeadTime) {
        this.autoLeadTime = autoLeadTime;
    }


    /**
     * Gets the autoPreferredStockLevel value for this ItemSearchBasic.
     * 
     * @return autoPreferredStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAutoPreferredStockLevel() {
        return autoPreferredStockLevel;
    }


    /**
     * Sets the autoPreferredStockLevel value for this ItemSearchBasic.
     * 
     * @param autoPreferredStockLevel
     */
    public void setAutoPreferredStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoPreferredStockLevel) {
        this.autoPreferredStockLevel = autoPreferredStockLevel;
    }


    /**
     * Gets the autoReorderPoint value for this ItemSearchBasic.
     * 
     * @return autoReorderPoint
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAutoReorderPoint() {
        return autoReorderPoint;
    }


    /**
     * Sets the autoReorderPoint value for this ItemSearchBasic.
     * 
     * @param autoReorderPoint
     */
    public void setAutoReorderPoint(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoReorderPoint) {
        this.autoReorderPoint = autoReorderPoint;
    }


    /**
     * Gets the availableToPartners value for this ItemSearchBasic.
     * 
     * @return availableToPartners
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this ItemSearchBasic.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableToPartners) {
        this.availableToPartners = availableToPartners;
    }


    /**
     * Gets the averageCost value for this ItemSearchBasic.
     * 
     * @return averageCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAverageCost() {
        return averageCost;
    }


    /**
     * Sets the averageCost value for this ItemSearchBasic.
     * 
     * @param averageCost
     */
    public void setAverageCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField averageCost) {
        this.averageCost = averageCost;
    }


    /**
     * Gets the backwardConsumptionDays value for this ItemSearchBasic.
     * 
     * @return backwardConsumptionDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getBackwardConsumptionDays() {
        return backwardConsumptionDays;
    }


    /**
     * Sets the backwardConsumptionDays value for this ItemSearchBasic.
     * 
     * @param backwardConsumptionDays
     */
    public void setBackwardConsumptionDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField backwardConsumptionDays) {
        this.backwardConsumptionDays = backwardConsumptionDays;
    }


    /**
     * Gets the binNumber value for this ItemSearchBasic.
     * 
     * @return binNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this ItemSearchBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField binNumber) {
        this.binNumber = binNumber;
    }


    /**
     * Gets the binOnHandAvail value for this ItemSearchBasic.
     * 
     * @return binOnHandAvail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBinOnHandAvail() {
        return binOnHandAvail;
    }


    /**
     * Sets the binOnHandAvail value for this ItemSearchBasic.
     * 
     * @param binOnHandAvail
     */
    public void setBinOnHandAvail(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField binOnHandAvail) {
        this.binOnHandAvail = binOnHandAvail;
    }


    /**
     * Gets the binOnHandCount value for this ItemSearchBasic.
     * 
     * @return binOnHandCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBinOnHandCount() {
        return binOnHandCount;
    }


    /**
     * Sets the binOnHandCount value for this ItemSearchBasic.
     * 
     * @param binOnHandCount
     */
    public void setBinOnHandCount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField binOnHandCount) {
        this.binOnHandCount = binOnHandCount;
    }


    /**
     * Gets the bomQuantity value for this ItemSearchBasic.
     * 
     * @return bomQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this ItemSearchBasic.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField bomQuantity) {
        this.bomQuantity = bomQuantity;
    }


    /**
     * Gets the buildEntireAssembly value for this ItemSearchBasic.
     * 
     * @return buildEntireAssembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getBuildEntireAssembly() {
        return buildEntireAssembly;
    }


    /**
     * Sets the buildEntireAssembly value for this ItemSearchBasic.
     * 
     * @param buildEntireAssembly
     */
    public void setBuildEntireAssembly(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }


    /**
     * Gets the buildTime value for this ItemSearchBasic.
     * 
     * @return buildTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBuildTime() {
        return buildTime;
    }


    /**
     * Sets the buildTime value for this ItemSearchBasic.
     * 
     * @param buildTime
     */
    public void setBuildTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField buildTime) {
        this.buildTime = buildTime;
    }


    /**
     * Gets the buyItNowPrice value for this ItemSearchBasic.
     * 
     * @return buyItNowPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBuyItNowPrice() {
        return buyItNowPrice;
    }


    /**
     * Sets the buyItNowPrice value for this ItemSearchBasic.
     * 
     * @param buyItNowPrice
     */
    public void setBuyItNowPrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField buyItNowPrice) {
        this.buyItNowPrice = buyItNowPrice;
    }


    /**
     * Gets the caption value for this ItemSearchBasic.
     * 
     * @return caption
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this ItemSearchBasic.
     * 
     * @param caption
     */
    public void setCaption(com.netsuite.webservices.platform.core_2019_1.SearchStringField caption) {
        this.caption = caption;
    }


    /**
     * Gets the category value for this ItemSearchBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ItemSearchBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the _class value for this ItemSearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ItemSearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the component value for this ItemSearchBasic.
     * 
     * @return component
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getComponent() {
        return component;
    }


    /**
     * Sets the component value for this ItemSearchBasic.
     * 
     * @param component
     */
    public void setComponent(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField component) {
        this.component = component;
    }


    /**
     * Gets the componentOf value for this ItemSearchBasic.
     * 
     * @return componentOf
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getComponentOf() {
        return componentOf;
    }


    /**
     * Sets the componentOf value for this ItemSearchBasic.
     * 
     * @param componentOf
     */
    public void setComponentOf(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField componentOf) {
        this.componentOf = componentOf;
    }


    /**
     * Gets the componentYield value for this ItemSearchBasic.
     * 
     * @return componentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getComponentYield() {
        return componentYield;
    }


    /**
     * Sets the componentYield value for this ItemSearchBasic.
     * 
     * @param componentYield
     */
    public void setComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField componentYield) {
        this.componentYield = componentYield;
    }


    /**
     * Gets the contingentRevenueHandling value for this ItemSearchBasic.
     * 
     * @return contingentRevenueHandling
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getContingentRevenueHandling() {
        return contingentRevenueHandling;
    }


    /**
     * Sets the contingentRevenueHandling value for this ItemSearchBasic.
     * 
     * @param contingentRevenueHandling
     */
    public void setContingentRevenueHandling(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField contingentRevenueHandling) {
        this.contingentRevenueHandling = contingentRevenueHandling;
    }


    /**
     * Gets the copyDescription value for this ItemSearchBasic.
     * 
     * @return copyDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getCopyDescription() {
        return copyDescription;
    }


    /**
     * Sets the copyDescription value for this ItemSearchBasic.
     * 
     * @param copyDescription
     */
    public void setCopyDescription(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField copyDescription) {
        this.copyDescription = copyDescription;
    }


    /**
     * Gets the correlatedItem value for this ItemSearchBasic.
     * 
     * @return correlatedItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCorrelatedItem() {
        return correlatedItem;
    }


    /**
     * Sets the correlatedItem value for this ItemSearchBasic.
     * 
     * @param correlatedItem
     */
    public void setCorrelatedItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField correlatedItem) {
        this.correlatedItem = correlatedItem;
    }


    /**
     * Gets the correlatedItemCorrelation value for this ItemSearchBasic.
     * 
     * @return correlatedItemCorrelation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCorrelatedItemCorrelation() {
        return correlatedItemCorrelation;
    }


    /**
     * Sets the correlatedItemCorrelation value for this ItemSearchBasic.
     * 
     * @param correlatedItemCorrelation
     */
    public void setCorrelatedItemCorrelation(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField correlatedItemCorrelation) {
        this.correlatedItemCorrelation = correlatedItemCorrelation;
    }


    /**
     * Gets the correlatedItemCount value for this ItemSearchBasic.
     * 
     * @return correlatedItemCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getCorrelatedItemCount() {
        return correlatedItemCount;
    }


    /**
     * Sets the correlatedItemCount value for this ItemSearchBasic.
     * 
     * @param correlatedItemCount
     */
    public void setCorrelatedItemCount(com.netsuite.webservices.platform.core_2019_1.SearchLongField correlatedItemCount) {
        this.correlatedItemCount = correlatedItemCount;
    }


    /**
     * Gets the correlatedItemLift value for this ItemSearchBasic.
     * 
     * @return correlatedItemLift
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCorrelatedItemLift() {
        return correlatedItemLift;
    }


    /**
     * Sets the correlatedItemLift value for this ItemSearchBasic.
     * 
     * @param correlatedItemLift
     */
    public void setCorrelatedItemLift(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField correlatedItemLift) {
        this.correlatedItemLift = correlatedItemLift;
    }


    /**
     * Gets the correlatedItemPurchaseRate value for this ItemSearchBasic.
     * 
     * @return correlatedItemPurchaseRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCorrelatedItemPurchaseRate() {
        return correlatedItemPurchaseRate;
    }


    /**
     * Sets the correlatedItemPurchaseRate value for this ItemSearchBasic.
     * 
     * @param correlatedItemPurchaseRate
     */
    public void setCorrelatedItemPurchaseRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField correlatedItemPurchaseRate) {
        this.correlatedItemPurchaseRate = correlatedItemPurchaseRate;
    }


    /**
     * Gets the cost value for this ItemSearchBasic.
     * 
     * @return cost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ItemSearchBasic.
     * 
     * @param cost
     */
    public void setCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost) {
        this.cost = cost;
    }


    /**
     * Gets the costAccountingStatus value for this ItemSearchBasic.
     * 
     * @return costAccountingStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCostAccountingStatus() {
        return costAccountingStatus;
    }


    /**
     * Sets the costAccountingStatus value for this ItemSearchBasic.
     * 
     * @param costAccountingStatus
     */
    public void setCostAccountingStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField costAccountingStatus) {
        this.costAccountingStatus = costAccountingStatus;
    }


    /**
     * Gets the costCategory value for this ItemSearchBasic.
     * 
     * @return costCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCostCategory() {
        return costCategory;
    }


    /**
     * Sets the costCategory value for this ItemSearchBasic.
     * 
     * @param costCategory
     */
    public void setCostCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField costCategory) {
        this.costCategory = costCategory;
    }


    /**
     * Gets the costEstimate value for this ItemSearchBasic.
     * 
     * @return costEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this ItemSearchBasic.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the costEstimateType value for this ItemSearchBasic.
     * 
     * @return costEstimateType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this ItemSearchBasic.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the costingMethod value for this ItemSearchBasic.
     * 
     * @return costingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCostingMethod() {
        return costingMethod;
    }


    /**
     * Sets the costingMethod value for this ItemSearchBasic.
     * 
     * @param costingMethod
     */
    public void setCostingMethod(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField costingMethod) {
        this.costingMethod = costingMethod;
    }


    /**
     * Gets the countryOfManufacture value for this ItemSearchBasic.
     * 
     * @return countryOfManufacture
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this ItemSearchBasic.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }


    /**
     * Gets the created value for this ItemSearchBasic.
     * 
     * @return created
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreated() {
        return created;
    }


    /**
     * Sets the created value for this ItemSearchBasic.
     * 
     * @param created
     */
    public void setCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField created) {
        this.created = created;
    }


    /**
     * Gets the createJob value for this ItemSearchBasic.
     * 
     * @return createJob
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getCreateJob() {
        return createJob;
    }


    /**
     * Sets the createJob value for this ItemSearchBasic.
     * 
     * @param createJob
     */
    public void setCreateJob(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField createJob) {
        this.createJob = createJob;
    }


    /**
     * Gets the createRevenuePlansOn value for this ItemSearchBasic.
     * 
     * @return createRevenuePlansOn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCreateRevenuePlansOn() {
        return createRevenuePlansOn;
    }


    /**
     * Sets the createRevenuePlansOn value for this ItemSearchBasic.
     * 
     * @param createRevenuePlansOn
     */
    public void setCreateRevenuePlansOn(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField createRevenuePlansOn) {
        this.createRevenuePlansOn = createRevenuePlansOn;
    }


    /**
     * Gets the dateViewed value for this ItemSearchBasic.
     * 
     * @return dateViewed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateViewed() {
        return dateViewed;
    }


    /**
     * Sets the dateViewed value for this ItemSearchBasic.
     * 
     * @param dateViewed
     */
    public void setDateViewed(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateViewed) {
        this.dateViewed = dateViewed;
    }


    /**
     * Gets the daysBeforeExpiration value for this ItemSearchBasic.
     * 
     * @return daysBeforeExpiration
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDaysBeforeExpiration() {
        return daysBeforeExpiration;
    }


    /**
     * Sets the daysBeforeExpiration value for this ItemSearchBasic.
     * 
     * @param daysBeforeExpiration
     */
    public void setDaysBeforeExpiration(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField daysBeforeExpiration) {
        this.daysBeforeExpiration = daysBeforeExpiration;
    }


    /**
     * Gets the defaultReturnCost value for this ItemSearchBasic.
     * 
     * @return defaultReturnCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDefaultReturnCost() {
        return defaultReturnCost;
    }


    /**
     * Sets the defaultReturnCost value for this ItemSearchBasic.
     * 
     * @param defaultReturnCost
     */
    public void setDefaultReturnCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }


    /**
     * Gets the defaultShippingMethod value for this ItemSearchBasic.
     * 
     * @return defaultShippingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDefaultShippingMethod() {
        return defaultShippingMethod;
    }


    /**
     * Sets the defaultShippingMethod value for this ItemSearchBasic.
     * 
     * @param defaultShippingMethod
     */
    public void setDefaultShippingMethod(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultShippingMethod) {
        this.defaultShippingMethod = defaultShippingMethod;
    }


    /**
     * Gets the deferRevRec value for this ItemSearchBasic.
     * 
     * @return deferRevRec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this ItemSearchBasic.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField deferRevRec) {
        this.deferRevRec = deferRevRec;
    }


    /**
     * Gets the demandModifier value for this ItemSearchBasic.
     * 
     * @return demandModifier
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDemandModifier() {
        return demandModifier;
    }


    /**
     * Sets the demandModifier value for this ItemSearchBasic.
     * 
     * @param demandModifier
     */
    public void setDemandModifier(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField demandModifier) {
        this.demandModifier = demandModifier;
    }


    /**
     * Gets the demandSource value for this ItemSearchBasic.
     * 
     * @return demandSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getDemandSource() {
        return demandSource;
    }


    /**
     * Sets the demandSource value for this ItemSearchBasic.
     * 
     * @param demandSource
     */
    public void setDemandSource(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField demandSource) {
        this.demandSource = demandSource;
    }


    /**
     * Gets the demandTimeFence value for this ItemSearchBasic.
     * 
     * @return demandTimeFence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDemandTimeFence() {
        return demandTimeFence;
    }


    /**
     * Sets the demandTimeFence value for this ItemSearchBasic.
     * 
     * @param demandTimeFence
     */
    public void setDemandTimeFence(com.netsuite.webservices.platform.core_2019_1.SearchLongField demandTimeFence) {
        this.demandTimeFence = demandTimeFence;
    }


    /**
     * Gets the department value for this ItemSearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ItemSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the directRevenuePosting value for this ItemSearchBasic.
     * 
     * @return directRevenuePosting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getDirectRevenuePosting() {
        return directRevenuePosting;
    }


    /**
     * Sets the directRevenuePosting value for this ItemSearchBasic.
     * 
     * @param directRevenuePosting
     */
    public void setDirectRevenuePosting(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField directRevenuePosting) {
        this.directRevenuePosting = directRevenuePosting;
    }


    /**
     * Gets the displayIneBayStore value for this ItemSearchBasic.
     * 
     * @return displayIneBayStore
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getDisplayIneBayStore() {
        return displayIneBayStore;
    }


    /**
     * Sets the displayIneBayStore value for this ItemSearchBasic.
     * 
     * @param displayIneBayStore
     */
    public void setDisplayIneBayStore(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField displayIneBayStore) {
        this.displayIneBayStore = displayIneBayStore;
    }


    /**
     * Gets the displayName value for this ItemSearchBasic.
     * 
     * @return displayName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ItemSearchBasic.
     * 
     * @param displayName
     */
    public void setDisplayName(com.netsuite.webservices.platform.core_2019_1.SearchStringField displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the distributionCategory value for this ItemSearchBasic.
     * 
     * @return distributionCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDistributionCategory() {
        return distributionCategory;
    }


    /**
     * Sets the distributionCategory value for this ItemSearchBasic.
     * 
     * @param distributionCategory
     */
    public void setDistributionCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField distributionCategory) {
        this.distributionCategory = distributionCategory;
    }


    /**
     * Gets the distributionNetwork value for this ItemSearchBasic.
     * 
     * @return distributionNetwork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDistributionNetwork() {
        return distributionNetwork;
    }


    /**
     * Sets the distributionNetwork value for this ItemSearchBasic.
     * 
     * @param distributionNetwork
     */
    public void setDistributionNetwork(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField distributionNetwork) {
        this.distributionNetwork = distributionNetwork;
    }


    /**
     * Gets the dontShowPrice value for this ItemSearchBasic.
     * 
     * @return dontShowPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getDontShowPrice() {
        return dontShowPrice;
    }


    /**
     * Sets the dontShowPrice value for this ItemSearchBasic.
     * 
     * @param dontShowPrice
     */
    public void setDontShowPrice(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }


    /**
     * Gets the eBayItemDescription value for this ItemSearchBasic.
     * 
     * @return eBayItemDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEBayItemDescription() {
        return eBayItemDescription;
    }


    /**
     * Sets the eBayItemDescription value for this ItemSearchBasic.
     * 
     * @param eBayItemDescription
     */
    public void setEBayItemDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField eBayItemDescription) {
        this.eBayItemDescription = eBayItemDescription;
    }


    /**
     * Gets the eBayItemSubtitle value for this ItemSearchBasic.
     * 
     * @return eBayItemSubtitle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEBayItemSubtitle() {
        return eBayItemSubtitle;
    }


    /**
     * Sets the eBayItemSubtitle value for this ItemSearchBasic.
     * 
     * @param eBayItemSubtitle
     */
    public void setEBayItemSubtitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField eBayItemSubtitle) {
        this.eBayItemSubtitle = eBayItemSubtitle;
    }


    /**
     * Gets the eBayItemTitle value for this ItemSearchBasic.
     * 
     * @return eBayItemTitle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEBayItemTitle() {
        return eBayItemTitle;
    }


    /**
     * Sets the eBayItemTitle value for this ItemSearchBasic.
     * 
     * @param eBayItemTitle
     */
    public void setEBayItemTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField eBayItemTitle) {
        this.eBayItemTitle = eBayItemTitle;
    }


    /**
     * Gets the ebayRelistingOption value for this ItemSearchBasic.
     * 
     * @return ebayRelistingOption
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getEbayRelistingOption() {
        return ebayRelistingOption;
    }


    /**
     * Sets the ebayRelistingOption value for this ItemSearchBasic.
     * 
     * @param ebayRelistingOption
     */
    public void setEbayRelistingOption(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField ebayRelistingOption) {
        this.ebayRelistingOption = ebayRelistingOption;
    }


    /**
     * Gets the effectiveBomControl value for this ItemSearchBasic.
     * 
     * @return effectiveBomControl
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getEffectiveBomControl() {
        return effectiveBomControl;
    }


    /**
     * Sets the effectiveBomControl value for this ItemSearchBasic.
     * 
     * @param effectiveBomControl
     */
    public void setEffectiveBomControl(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField effectiveBomControl) {
        this.effectiveBomControl = effectiveBomControl;
    }


    /**
     * Gets the effectiveDate value for this ItemSearchBasic.
     * 
     * @return effectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ItemSearchBasic.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the effectiveRevision value for this ItemSearchBasic.
     * 
     * @return effectiveRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEffectiveRevision() {
        return effectiveRevision;
    }


    /**
     * Sets the effectiveRevision value for this ItemSearchBasic.
     * 
     * @param effectiveRevision
     */
    public void setEffectiveRevision(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField effectiveRevision) {
        this.effectiveRevision = effectiveRevision;
    }


    /**
     * Gets the endAuctionsWhenOutOfStock value for this ItemSearchBasic.
     * 
     * @return endAuctionsWhenOutOfStock
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getEndAuctionsWhenOutOfStock() {
        return endAuctionsWhenOutOfStock;
    }


    /**
     * Sets the endAuctionsWhenOutOfStock value for this ItemSearchBasic.
     * 
     * @param endAuctionsWhenOutOfStock
     */
    public void setEndAuctionsWhenOutOfStock(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField endAuctionsWhenOutOfStock) {
        this.endAuctionsWhenOutOfStock = endAuctionsWhenOutOfStock;
    }


    /**
     * Gets the excludeFromSitemap value for this ItemSearchBasic.
     * 
     * @return excludeFromSitemap
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this ItemSearchBasic.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }


    /**
     * Gets the externalId value for this ItemSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ItemSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ItemSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ItemSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the featuredDescription value for this ItemSearchBasic.
     * 
     * @return featuredDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this ItemSearchBasic.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField featuredDescription) {
        this.featuredDescription = featuredDescription;
    }


    /**
     * Gets the feedDescription value for this ItemSearchBasic.
     * 
     * @return feedDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getFeedDescription() {
        return feedDescription;
    }


    /**
     * Sets the feedDescription value for this ItemSearchBasic.
     * 
     * @param feedDescription
     */
    public void setFeedDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField feedDescription) {
        this.feedDescription = feedDescription;
    }


    /**
     * Gets the feedName value for this ItemSearchBasic.
     * 
     * @return feedName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getFeedName() {
        return feedName;
    }


    /**
     * Sets the feedName value for this ItemSearchBasic.
     * 
     * @param feedName
     */
    public void setFeedName(com.netsuite.webservices.platform.core_2019_1.SearchStringField feedName) {
        this.feedName = feedName;
    }


    /**
     * Gets the fixedLotSize value for this ItemSearchBasic.
     * 
     * @return fixedLotSize
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFixedLotSize() {
        return fixedLotSize;
    }


    /**
     * Sets the fixedLotSize value for this ItemSearchBasic.
     * 
     * @param fixedLotSize
     */
    public void setFixedLotSize(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fixedLotSize) {
        this.fixedLotSize = fixedLotSize;
    }


    /**
     * Gets the forwardConsumptionDays value for this ItemSearchBasic.
     * 
     * @return forwardConsumptionDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getForwardConsumptionDays() {
        return forwardConsumptionDays;
    }


    /**
     * Sets the forwardConsumptionDays value for this ItemSearchBasic.
     * 
     * @param forwardConsumptionDays
     */
    public void setForwardConsumptionDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField forwardConsumptionDays) {
        this.forwardConsumptionDays = forwardConsumptionDays;
    }


    /**
     * Gets the fraudRisk value for this ItemSearchBasic.
     * 
     * @return fraudRisk
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getFraudRisk() {
        return fraudRisk;
    }


    /**
     * Sets the fraudRisk value for this ItemSearchBasic.
     * 
     * @param fraudRisk
     */
    public void setFraudRisk(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField fraudRisk) {
        this.fraudRisk = fraudRisk;
    }


    /**
     * Gets the froogleProductFeed value for this ItemSearchBasic.
     * 
     * @return froogleProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getFroogleProductFeed() {
        return froogleProductFeed;
    }


    /**
     * Sets the froogleProductFeed value for this ItemSearchBasic.
     * 
     * @param froogleProductFeed
     */
    public void setFroogleProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField froogleProductFeed) {
        this.froogleProductFeed = froogleProductFeed;
    }


    /**
     * Gets the fxCost value for this ItemSearchBasic.
     * 
     * @return fxCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxCost() {
        return fxCost;
    }


    /**
     * Sets the fxCost value for this ItemSearchBasic.
     * 
     * @param fxCost
     */
    public void setFxCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxCost) {
        this.fxCost = fxCost;
    }


    /**
     * Gets the generateAccruals value for this ItemSearchBasic.
     * 
     * @return generateAccruals
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getGenerateAccruals() {
        return generateAccruals;
    }


    /**
     * Sets the generateAccruals value for this ItemSearchBasic.
     * 
     * @param generateAccruals
     */
    public void setGenerateAccruals(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField generateAccruals) {
        this.generateAccruals = generateAccruals;
    }


    /**
     * Gets the giftCertAuthCode value for this ItemSearchBasic.
     * 
     * @return giftCertAuthCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGiftCertAuthCode() {
        return giftCertAuthCode;
    }


    /**
     * Sets the giftCertAuthCode value for this ItemSearchBasic.
     * 
     * @param giftCertAuthCode
     */
    public void setGiftCertAuthCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertAuthCode) {
        this.giftCertAuthCode = giftCertAuthCode;
    }


    /**
     * Gets the giftCertEmail value for this ItemSearchBasic.
     * 
     * @return giftCertEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGiftCertEmail() {
        return giftCertEmail;
    }


    /**
     * Sets the giftCertEmail value for this ItemSearchBasic.
     * 
     * @param giftCertEmail
     */
    public void setGiftCertEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertEmail) {
        this.giftCertEmail = giftCertEmail;
    }


    /**
     * Gets the giftCertExpDate value for this ItemSearchBasic.
     * 
     * @return giftCertExpDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getGiftCertExpDate() {
        return giftCertExpDate;
    }


    /**
     * Sets the giftCertExpDate value for this ItemSearchBasic.
     * 
     * @param giftCertExpDate
     */
    public void setGiftCertExpDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField giftCertExpDate) {
        this.giftCertExpDate = giftCertExpDate;
    }


    /**
     * Gets the giftCertFrom value for this ItemSearchBasic.
     * 
     * @return giftCertFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGiftCertFrom() {
        return giftCertFrom;
    }


    /**
     * Sets the giftCertFrom value for this ItemSearchBasic.
     * 
     * @param giftCertFrom
     */
    public void setGiftCertFrom(com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }


    /**
     * Gets the giftCertMsg value for this ItemSearchBasic.
     * 
     * @return giftCertMsg
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGiftCertMsg() {
        return giftCertMsg;
    }


    /**
     * Sets the giftCertMsg value for this ItemSearchBasic.
     * 
     * @param giftCertMsg
     */
    public void setGiftCertMsg(com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertMsg) {
        this.giftCertMsg = giftCertMsg;
    }


    /**
     * Gets the giftCertOrigAmt value for this ItemSearchBasic.
     * 
     * @return giftCertOrigAmt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGiftCertOrigAmt() {
        return giftCertOrigAmt;
    }


    /**
     * Sets the giftCertOrigAmt value for this ItemSearchBasic.
     * 
     * @param giftCertOrigAmt
     */
    public void setGiftCertOrigAmt(com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertOrigAmt) {
        this.giftCertOrigAmt = giftCertOrigAmt;
    }


    /**
     * Gets the giftCertRecipient value for this ItemSearchBasic.
     * 
     * @return giftCertRecipient
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGiftCertRecipient() {
        return giftCertRecipient;
    }


    /**
     * Sets the giftCertRecipient value for this ItemSearchBasic.
     * 
     * @param giftCertRecipient
     */
    public void setGiftCertRecipient(com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertRecipient) {
        this.giftCertRecipient = giftCertRecipient;
    }


    /**
     * Gets the hierarchyNode value for this ItemSearchBasic.
     * 
     * @return hierarchyNode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getHierarchyNode() {
        return hierarchyNode;
    }


    /**
     * Sets the hierarchyNode value for this ItemSearchBasic.
     * 
     * @param hierarchyNode
     */
    public void setHierarchyNode(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField hierarchyNode) {
        this.hierarchyNode = hierarchyNode;
    }


    /**
     * Gets the hierarchyVersion value for this ItemSearchBasic.
     * 
     * @return hierarchyVersion
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getHierarchyVersion() {
        return hierarchyVersion;
    }


    /**
     * Sets the hierarchyVersion value for this ItemSearchBasic.
     * 
     * @param hierarchyVersion
     */
    public void setHierarchyVersion(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField hierarchyVersion) {
        this.hierarchyVersion = hierarchyVersion;
    }


    /**
     * Gets the imageUrl value for this ItemSearchBasic.
     * 
     * @return imageUrl
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this ItemSearchBasic.
     * 
     * @param imageUrl
     */
    public void setImageUrl(com.netsuite.webservices.platform.core_2019_1.SearchStringField imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * Gets the includeChildren value for this ItemSearchBasic.
     * 
     * @return includeChildren
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this ItemSearchBasic.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the internalId value for this ItemSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ItemSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ItemSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the inventoryLocation value for this ItemSearchBasic.
     * 
     * @return inventoryLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInventoryLocation() {
        return inventoryLocation;
    }


    /**
     * Sets the inventoryLocation value for this ItemSearchBasic.
     * 
     * @param inventoryLocation
     */
    public void setInventoryLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }


    /**
     * Gets the invtClassification value for this ItemSearchBasic.
     * 
     * @return invtClassification
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getInvtClassification() {
        return invtClassification;
    }


    /**
     * Sets the invtClassification value for this ItemSearchBasic.
     * 
     * @param invtClassification
     */
    public void setInvtClassification(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField invtClassification) {
        this.invtClassification = invtClassification;
    }


    /**
     * Gets the invtCountInterval value for this ItemSearchBasic.
     * 
     * @return invtCountInterval
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInvtCountInterval() {
        return invtCountInterval;
    }


    /**
     * Sets the invtCountInterval value for this ItemSearchBasic.
     * 
     * @param invtCountInterval
     */
    public void setInvtCountInterval(com.netsuite.webservices.platform.core_2019_1.SearchLongField invtCountInterval) {
        this.invtCountInterval = invtCountInterval;
    }


    /**
     * Gets the isAvailable value for this ItemSearchBasic.
     * 
     * @return isAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this ItemSearchBasic.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isAvailable) {
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the isDropShipItem value for this ItemSearchBasic.
     * 
     * @return isDropShipItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDropShipItem() {
        return isDropShipItem;
    }


    /**
     * Sets the isDropShipItem value for this ItemSearchBasic.
     * 
     * @param isDropShipItem
     */
    public void setIsDropShipItem(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDropShipItem) {
        this.isDropShipItem = isDropShipItem;
    }


    /**
     * Gets the isFulfillable value for this ItemSearchBasic.
     * 
     * @return isFulfillable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this ItemSearchBasic.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isFulfillable) {
        this.isFulfillable = isFulfillable;
    }


    /**
     * Gets the isGcoCompliant value for this ItemSearchBasic.
     * 
     * @return isGcoCompliant
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsGcoCompliant() {
        return isGcoCompliant;
    }


    /**
     * Sets the isGcoCompliant value for this ItemSearchBasic.
     * 
     * @param isGcoCompliant
     */
    public void setIsGcoCompliant(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }


    /**
     * Gets the isInactive value for this ItemSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this ItemSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isLotItem value for this ItemSearchBasic.
     * 
     * @return isLotItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsLotItem() {
        return isLotItem;
    }


    /**
     * Sets the isLotItem value for this ItemSearchBasic.
     * 
     * @param isLotItem
     */
    public void setIsLotItem(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isLotItem) {
        this.isLotItem = isLotItem;
    }


    /**
     * Gets the isOnline value for this ItemSearchBasic.
     * 
     * @return isOnline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this ItemSearchBasic.
     * 
     * @param isOnline
     */
    public void setIsOnline(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isPreferredVendor value for this ItemSearchBasic.
     * 
     * @return isPreferredVendor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsPreferredVendor() {
        return isPreferredVendor;
    }


    /**
     * Sets the isPreferredVendor value for this ItemSearchBasic.
     * 
     * @param isPreferredVendor
     */
    public void setIsPreferredVendor(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPreferredVendor) {
        this.isPreferredVendor = isPreferredVendor;
    }


    /**
     * Gets the isSerialItem value for this ItemSearchBasic.
     * 
     * @return isSerialItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsSerialItem() {
        return isSerialItem;
    }


    /**
     * Sets the isSerialItem value for this ItemSearchBasic.
     * 
     * @param isSerialItem
     */
    public void setIsSerialItem(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSerialItem) {
        this.isSerialItem = isSerialItem;
    }


    /**
     * Gets the isSpecialOrderItem value for this ItemSearchBasic.
     * 
     * @return isSpecialOrderItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsSpecialOrderItem() {
        return isSpecialOrderItem;
    }


    /**
     * Sets the isSpecialOrderItem value for this ItemSearchBasic.
     * 
     * @param isSpecialOrderItem
     */
    public void setIsSpecialOrderItem(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSpecialOrderItem) {
        this.isSpecialOrderItem = isSpecialOrderItem;
    }


    /**
     * Gets the isSpecialWorkOrderItem value for this ItemSearchBasic.
     * 
     * @return isSpecialWorkOrderItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsSpecialWorkOrderItem() {
        return isSpecialWorkOrderItem;
    }


    /**
     * Sets the isSpecialWorkOrderItem value for this ItemSearchBasic.
     * 
     * @param isSpecialWorkOrderItem
     */
    public void setIsSpecialWorkOrderItem(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSpecialWorkOrderItem) {
        this.isSpecialWorkOrderItem = isSpecialWorkOrderItem;
    }


    /**
     * Gets the isStorePickupAllowed value for this ItemSearchBasic.
     * 
     * @return isStorePickupAllowed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsStorePickupAllowed() {
        return isStorePickupAllowed;
    }


    /**
     * Sets the isStorePickupAllowed value for this ItemSearchBasic.
     * 
     * @param isStorePickupAllowed
     */
    public void setIsStorePickupAllowed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isStorePickupAllowed) {
        this.isStorePickupAllowed = isStorePickupAllowed;
    }


    /**
     * Gets the issueProduct value for this ItemSearchBasic.
     * 
     * @return issueProduct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this ItemSearchBasic.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField issueProduct) {
        this.issueProduct = issueProduct;
    }


    /**
     * Gets the isTaxable value for this ItemSearchBasic.
     * 
     * @return isTaxable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this ItemSearchBasic.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the isVsoeBundle value for this ItemSearchBasic.
     * 
     * @return isVsoeBundle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsVsoeBundle() {
        return isVsoeBundle;
    }


    /**
     * Sets the isVsoeBundle value for this ItemSearchBasic.
     * 
     * @param isVsoeBundle
     */
    public void setIsVsoeBundle(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isVsoeBundle) {
        this.isVsoeBundle = isVsoeBundle;
    }


    /**
     * Gets the isWip value for this ItemSearchBasic.
     * 
     * @return isWip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsWip() {
        return isWip;
    }


    /**
     * Sets the isWip value for this ItemSearchBasic.
     * 
     * @param isWip
     */
    public void setIsWip(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isWip) {
        this.isWip = isWip;
    }


    /**
     * Gets the itemId value for this ItemSearchBasic.
     * 
     * @return itemId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemSearchBasic.
     * 
     * @param itemId
     */
    public void setItemId(com.netsuite.webservices.platform.core_2019_1.SearchStringField itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemRevenueCategory value for this ItemSearchBasic.
     * 
     * @return itemRevenueCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItemRevenueCategory() {
        return itemRevenueCategory;
    }


    /**
     * Sets the itemRevenueCategory value for this ItemSearchBasic.
     * 
     * @param itemRevenueCategory
     */
    public void setItemRevenueCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }


    /**
     * Gets the itemUrl value for this ItemSearchBasic.
     * 
     * @return itemUrl
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getItemUrl() {
        return itemUrl;
    }


    /**
     * Sets the itemUrl value for this ItemSearchBasic.
     * 
     * @param itemUrl
     */
    public void setItemUrl(com.netsuite.webservices.platform.core_2019_1.SearchStringField itemUrl) {
        this.itemUrl = itemUrl;
    }


    /**
     * Gets the lastInvtCountDate value for this ItemSearchBasic.
     * 
     * @return lastInvtCountDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastInvtCountDate() {
        return lastInvtCountDate;
    }


    /**
     * Sets the lastInvtCountDate value for this ItemSearchBasic.
     * 
     * @param lastInvtCountDate
     */
    public void setLastInvtCountDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastInvtCountDate) {
        this.lastInvtCountDate = lastInvtCountDate;
    }


    /**
     * Gets the lastModifiedDate value for this ItemSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ItemSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastPurchasePrice value for this ItemSearchBasic.
     * 
     * @return lastPurchasePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLastPurchasePrice() {
        return lastPurchasePrice;
    }


    /**
     * Sets the lastPurchasePrice value for this ItemSearchBasic.
     * 
     * @param lastPurchasePrice
     */
    public void setLastPurchasePrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }


    /**
     * Gets the lastQuantityAvailableChange value for this ItemSearchBasic.
     * 
     * @return lastQuantityAvailableChange
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastQuantityAvailableChange() {
        return lastQuantityAvailableChange;
    }


    /**
     * Sets the lastQuantityAvailableChange value for this ItemSearchBasic.
     * 
     * @param lastQuantityAvailableChange
     */
    public void setLastQuantityAvailableChange(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastQuantityAvailableChange) {
        this.lastQuantityAvailableChange = lastQuantityAvailableChange;
    }


    /**
     * Gets the leadTime value for this ItemSearchBasic.
     * 
     * @return leadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLeadTime() {
        return leadTime;
    }


    /**
     * Sets the leadTime value for this ItemSearchBasic.
     * 
     * @param leadTime
     */
    public void setLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchLongField leadTime) {
        this.leadTime = leadTime;
    }


    /**
     * Gets the listingDuration value for this ItemSearchBasic.
     * 
     * @return listingDuration
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getListingDuration() {
        return listingDuration;
    }


    /**
     * Sets the listingDuration value for this ItemSearchBasic.
     * 
     * @param listingDuration
     */
    public void setListingDuration(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField listingDuration) {
        this.listingDuration = listingDuration;
    }


    /**
     * Gets the location value for this ItemSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the locationAllowStorePickup value for this ItemSearchBasic.
     * 
     * @return locationAllowStorePickup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getLocationAllowStorePickup() {
        return locationAllowStorePickup;
    }


    /**
     * Sets the locationAllowStorePickup value for this ItemSearchBasic.
     * 
     * @param locationAllowStorePickup
     */
    public void setLocationAllowStorePickup(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField locationAllowStorePickup) {
        this.locationAllowStorePickup = locationAllowStorePickup;
    }


    /**
     * Gets the locationAtpLeadTime value for this ItemSearchBasic.
     * 
     * @return locationAtpLeadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationAtpLeadTime() {
        return locationAtpLeadTime;
    }


    /**
     * Sets the locationAtpLeadTime value for this ItemSearchBasic.
     * 
     * @param locationAtpLeadTime
     */
    public void setLocationAtpLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationAtpLeadTime) {
        this.locationAtpLeadTime = locationAtpLeadTime;
    }


    /**
     * Gets the locationAverageCost value for this ItemSearchBasic.
     * 
     * @return locationAverageCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationAverageCost() {
        return locationAverageCost;
    }


    /**
     * Sets the locationAverageCost value for this ItemSearchBasic.
     * 
     * @param locationAverageCost
     */
    public void setLocationAverageCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationAverageCost) {
        this.locationAverageCost = locationAverageCost;
    }


    /**
     * Gets the locationBuildTime value for this ItemSearchBasic.
     * 
     * @return locationBuildTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationBuildTime() {
        return locationBuildTime;
    }


    /**
     * Sets the locationBuildTime value for this ItemSearchBasic.
     * 
     * @param locationBuildTime
     */
    public void setLocationBuildTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationBuildTime) {
        this.locationBuildTime = locationBuildTime;
    }


    /**
     * Gets the locationCost value for this ItemSearchBasic.
     * 
     * @return locationCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationCost() {
        return locationCost;
    }


    /**
     * Sets the locationCost value for this ItemSearchBasic.
     * 
     * @param locationCost
     */
    public void setLocationCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationCost) {
        this.locationCost = locationCost;
    }


    /**
     * Gets the locationCostAccountingStatus value for this ItemSearchBasic.
     * 
     * @return locationCostAccountingStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLocationCostAccountingStatus() {
        return locationCostAccountingStatus;
    }


    /**
     * Sets the locationCostAccountingStatus value for this ItemSearchBasic.
     * 
     * @param locationCostAccountingStatus
     */
    public void setLocationCostAccountingStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationCostAccountingStatus) {
        this.locationCostAccountingStatus = locationCostAccountingStatus;
    }


    /**
     * Gets the locationDefaultReturnCost value for this ItemSearchBasic.
     * 
     * @return locationDefaultReturnCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationDefaultReturnCost() {
        return locationDefaultReturnCost;
    }


    /**
     * Sets the locationDefaultReturnCost value for this ItemSearchBasic.
     * 
     * @param locationDefaultReturnCost
     */
    public void setLocationDefaultReturnCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationDefaultReturnCost) {
        this.locationDefaultReturnCost = locationDefaultReturnCost;
    }


    /**
     * Gets the locationDemandSource value for this ItemSearchBasic.
     * 
     * @return locationDemandSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLocationDemandSource() {
        return locationDemandSource;
    }


    /**
     * Sets the locationDemandSource value for this ItemSearchBasic.
     * 
     * @param locationDemandSource
     */
    public void setLocationDemandSource(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationDemandSource) {
        this.locationDemandSource = locationDemandSource;
    }


    /**
     * Gets the locationDemandTimeFence value for this ItemSearchBasic.
     * 
     * @return locationDemandTimeFence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLocationDemandTimeFence() {
        return locationDemandTimeFence;
    }


    /**
     * Sets the locationDemandTimeFence value for this ItemSearchBasic.
     * 
     * @param locationDemandTimeFence
     */
    public void setLocationDemandTimeFence(com.netsuite.webservices.platform.core_2019_1.SearchLongField locationDemandTimeFence) {
        this.locationDemandTimeFence = locationDemandTimeFence;
    }


    /**
     * Gets the locationFixedLotSize value for this ItemSearchBasic.
     * 
     * @return locationFixedLotSize
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationFixedLotSize() {
        return locationFixedLotSize;
    }


    /**
     * Sets the locationFixedLotSize value for this ItemSearchBasic.
     * 
     * @param locationFixedLotSize
     */
    public void setLocationFixedLotSize(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationFixedLotSize) {
        this.locationFixedLotSize = locationFixedLotSize;
    }


    /**
     * Gets the locationInventoryCostTemplate value for this ItemSearchBasic.
     * 
     * @return locationInventoryCostTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocationInventoryCostTemplate() {
        return locationInventoryCostTemplate;
    }


    /**
     * Sets the locationInventoryCostTemplate value for this ItemSearchBasic.
     * 
     * @param locationInventoryCostTemplate
     */
    public void setLocationInventoryCostTemplate(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField locationInventoryCostTemplate) {
        this.locationInventoryCostTemplate = locationInventoryCostTemplate;
    }


    /**
     * Gets the locationInvtClassification value for this ItemSearchBasic.
     * 
     * @return locationInvtClassification
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLocationInvtClassification() {
        return locationInvtClassification;
    }


    /**
     * Sets the locationInvtClassification value for this ItemSearchBasic.
     * 
     * @param locationInvtClassification
     */
    public void setLocationInvtClassification(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationInvtClassification) {
        this.locationInvtClassification = locationInvtClassification;
    }


    /**
     * Gets the locationInvtCountInterval value for this ItemSearchBasic.
     * 
     * @return locationInvtCountInterval
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLocationInvtCountInterval() {
        return locationInvtCountInterval;
    }


    /**
     * Sets the locationInvtCountInterval value for this ItemSearchBasic.
     * 
     * @param locationInvtCountInterval
     */
    public void setLocationInvtCountInterval(com.netsuite.webservices.platform.core_2019_1.SearchLongField locationInvtCountInterval) {
        this.locationInvtCountInterval = locationInvtCountInterval;
    }


    /**
     * Gets the locationLastInvtCountDate value for this ItemSearchBasic.
     * 
     * @return locationLastInvtCountDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLocationLastInvtCountDate() {
        return locationLastInvtCountDate;
    }


    /**
     * Sets the locationLastInvtCountDate value for this ItemSearchBasic.
     * 
     * @param locationLastInvtCountDate
     */
    public void setLocationLastInvtCountDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField locationLastInvtCountDate) {
        this.locationLastInvtCountDate = locationLastInvtCountDate;
    }


    /**
     * Gets the locationLeadTime value for this ItemSearchBasic.
     * 
     * @return locationLeadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLocationLeadTime() {
        return locationLeadTime;
    }


    /**
     * Sets the locationLeadTime value for this ItemSearchBasic.
     * 
     * @param locationLeadTime
     */
    public void setLocationLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchLongField locationLeadTime) {
        this.locationLeadTime = locationLeadTime;
    }


    /**
     * Gets the locationNextInvtCountDate value for this ItemSearchBasic.
     * 
     * @return locationNextInvtCountDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLocationNextInvtCountDate() {
        return locationNextInvtCountDate;
    }


    /**
     * Sets the locationNextInvtCountDate value for this ItemSearchBasic.
     * 
     * @param locationNextInvtCountDate
     */
    public void setLocationNextInvtCountDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField locationNextInvtCountDate) {
        this.locationNextInvtCountDate = locationNextInvtCountDate;
    }


    /**
     * Gets the locationPeriodicLotSizeDays value for this ItemSearchBasic.
     * 
     * @return locationPeriodicLotSizeDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLocationPeriodicLotSizeDays() {
        return locationPeriodicLotSizeDays;
    }


    /**
     * Sets the locationPeriodicLotSizeDays value for this ItemSearchBasic.
     * 
     * @param locationPeriodicLotSizeDays
     */
    public void setLocationPeriodicLotSizeDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField locationPeriodicLotSizeDays) {
        this.locationPeriodicLotSizeDays = locationPeriodicLotSizeDays;
    }


    /**
     * Gets the locationPeriodicLotSizeType value for this ItemSearchBasic.
     * 
     * @return locationPeriodicLotSizeType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLocationPeriodicLotSizeType() {
        return locationPeriodicLotSizeType;
    }


    /**
     * Sets the locationPeriodicLotSizeType value for this ItemSearchBasic.
     * 
     * @param locationPeriodicLotSizeType
     */
    public void setLocationPeriodicLotSizeType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationPeriodicLotSizeType) {
        this.locationPeriodicLotSizeType = locationPeriodicLotSizeType;
    }


    /**
     * Gets the locationPreferredStockLevel value for this ItemSearchBasic.
     * 
     * @return locationPreferredStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationPreferredStockLevel() {
        return locationPreferredStockLevel;
    }


    /**
     * Sets the locationPreferredStockLevel value for this ItemSearchBasic.
     * 
     * @param locationPreferredStockLevel
     */
    public void setLocationPreferredStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationPreferredStockLevel) {
        this.locationPreferredStockLevel = locationPreferredStockLevel;
    }


    /**
     * Gets the locationQtyAvailForStorePickup value for this ItemSearchBasic.
     * 
     * @return locationQtyAvailForStorePickup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationQtyAvailForStorePickup() {
        return locationQtyAvailForStorePickup;
    }


    /**
     * Sets the locationQtyAvailForStorePickup value for this ItemSearchBasic.
     * 
     * @param locationQtyAvailForStorePickup
     */
    public void setLocationQtyAvailForStorePickup(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQtyAvailForStorePickup) {
        this.locationQtyAvailForStorePickup = locationQtyAvailForStorePickup;
    }


    /**
     * Gets the locationQuantityAvailable value for this ItemSearchBasic.
     * 
     * @return locationQuantityAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationQuantityAvailable() {
        return locationQuantityAvailable;
    }


    /**
     * Sets the locationQuantityAvailable value for this ItemSearchBasic.
     * 
     * @param locationQuantityAvailable
     */
    public void setLocationQuantityAvailable(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityAvailable) {
        this.locationQuantityAvailable = locationQuantityAvailable;
    }


    /**
     * Gets the locationQuantityBackOrdered value for this ItemSearchBasic.
     * 
     * @return locationQuantityBackOrdered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationQuantityBackOrdered() {
        return locationQuantityBackOrdered;
    }


    /**
     * Sets the locationQuantityBackOrdered value for this ItemSearchBasic.
     * 
     * @param locationQuantityBackOrdered
     */
    public void setLocationQuantityBackOrdered(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityBackOrdered) {
        this.locationQuantityBackOrdered = locationQuantityBackOrdered;
    }


    /**
     * Gets the locationQuantityCommitted value for this ItemSearchBasic.
     * 
     * @return locationQuantityCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationQuantityCommitted() {
        return locationQuantityCommitted;
    }


    /**
     * Sets the locationQuantityCommitted value for this ItemSearchBasic.
     * 
     * @param locationQuantityCommitted
     */
    public void setLocationQuantityCommitted(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityCommitted) {
        this.locationQuantityCommitted = locationQuantityCommitted;
    }


    /**
     * Gets the locationQuantityInTransit value for this ItemSearchBasic.
     * 
     * @return locationQuantityInTransit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationQuantityInTransit() {
        return locationQuantityInTransit;
    }


    /**
     * Sets the locationQuantityInTransit value for this ItemSearchBasic.
     * 
     * @param locationQuantityInTransit
     */
    public void setLocationQuantityInTransit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityInTransit) {
        this.locationQuantityInTransit = locationQuantityInTransit;
    }


    /**
     * Gets the locationQuantityOnHand value for this ItemSearchBasic.
     * 
     * @return locationQuantityOnHand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationQuantityOnHand() {
        return locationQuantityOnHand;
    }


    /**
     * Sets the locationQuantityOnHand value for this ItemSearchBasic.
     * 
     * @param locationQuantityOnHand
     */
    public void setLocationQuantityOnHand(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityOnHand) {
        this.locationQuantityOnHand = locationQuantityOnHand;
    }


    /**
     * Gets the locationQuantityOnOrder value for this ItemSearchBasic.
     * 
     * @return locationQuantityOnOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationQuantityOnOrder() {
        return locationQuantityOnOrder;
    }


    /**
     * Sets the locationQuantityOnOrder value for this ItemSearchBasic.
     * 
     * @param locationQuantityOnOrder
     */
    public void setLocationQuantityOnOrder(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationQuantityOnOrder) {
        this.locationQuantityOnOrder = locationQuantityOnOrder;
    }


    /**
     * Gets the locationReorderPoint value for this ItemSearchBasic.
     * 
     * @return locationReorderPoint
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationReorderPoint() {
        return locationReorderPoint;
    }


    /**
     * Sets the locationReorderPoint value for this ItemSearchBasic.
     * 
     * @param locationReorderPoint
     */
    public void setLocationReorderPoint(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationReorderPoint) {
        this.locationReorderPoint = locationReorderPoint;
    }


    /**
     * Gets the locationRescheduleInDays value for this ItemSearchBasic.
     * 
     * @return locationRescheduleInDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLocationRescheduleInDays() {
        return locationRescheduleInDays;
    }


    /**
     * Sets the locationRescheduleInDays value for this ItemSearchBasic.
     * 
     * @param locationRescheduleInDays
     */
    public void setLocationRescheduleInDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField locationRescheduleInDays) {
        this.locationRescheduleInDays = locationRescheduleInDays;
    }


    /**
     * Gets the locationRescheduleOutDays value for this ItemSearchBasic.
     * 
     * @return locationRescheduleOutDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLocationRescheduleOutDays() {
        return locationRescheduleOutDays;
    }


    /**
     * Sets the locationRescheduleOutDays value for this ItemSearchBasic.
     * 
     * @param locationRescheduleOutDays
     */
    public void setLocationRescheduleOutDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField locationRescheduleOutDays) {
        this.locationRescheduleOutDays = locationRescheduleOutDays;
    }


    /**
     * Gets the locationSafetyStockLevel value for this ItemSearchBasic.
     * 
     * @return locationSafetyStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationSafetyStockLevel() {
        return locationSafetyStockLevel;
    }


    /**
     * Sets the locationSafetyStockLevel value for this ItemSearchBasic.
     * 
     * @param locationSafetyStockLevel
     */
    public void setLocationSafetyStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationSafetyStockLevel) {
        this.locationSafetyStockLevel = locationSafetyStockLevel;
    }


    /**
     * Gets the locationStorePickupBufferStock value for this ItemSearchBasic.
     * 
     * @return locationStorePickupBufferStock
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationStorePickupBufferStock() {
        return locationStorePickupBufferStock;
    }


    /**
     * Sets the locationStorePickupBufferStock value for this ItemSearchBasic.
     * 
     * @param locationStorePickupBufferStock
     */
    public void setLocationStorePickupBufferStock(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationStorePickupBufferStock) {
        this.locationStorePickupBufferStock = locationStorePickupBufferStock;
    }


    /**
     * Gets the locationSupplyLotSizingMethod value for this ItemSearchBasic.
     * 
     * @return locationSupplyLotSizingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLocationSupplyLotSizingMethod() {
        return locationSupplyLotSizingMethod;
    }


    /**
     * Sets the locationSupplyLotSizingMethod value for this ItemSearchBasic.
     * 
     * @param locationSupplyLotSizingMethod
     */
    public void setLocationSupplyLotSizingMethod(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationSupplyLotSizingMethod) {
        this.locationSupplyLotSizingMethod = locationSupplyLotSizingMethod;
    }


    /**
     * Gets the locationSupplyTimeFence value for this ItemSearchBasic.
     * 
     * @return locationSupplyTimeFence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLocationSupplyTimeFence() {
        return locationSupplyTimeFence;
    }


    /**
     * Sets the locationSupplyTimeFence value for this ItemSearchBasic.
     * 
     * @param locationSupplyTimeFence
     */
    public void setLocationSupplyTimeFence(com.netsuite.webservices.platform.core_2019_1.SearchLongField locationSupplyTimeFence) {
        this.locationSupplyTimeFence = locationSupplyTimeFence;
    }


    /**
     * Gets the locationSupplyType value for this ItemSearchBasic.
     * 
     * @return locationSupplyType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLocationSupplyType() {
        return locationSupplyType;
    }


    /**
     * Sets the locationSupplyType value for this ItemSearchBasic.
     * 
     * @param locationSupplyType
     */
    public void setLocationSupplyType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationSupplyType) {
        this.locationSupplyType = locationSupplyType;
    }


    /**
     * Gets the locationTotalValue value for this ItemSearchBasic.
     * 
     * @return locationTotalValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLocationTotalValue() {
        return locationTotalValue;
    }


    /**
     * Sets the locationTotalValue value for this ItemSearchBasic.
     * 
     * @param locationTotalValue
     */
    public void setLocationTotalValue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField locationTotalValue) {
        this.locationTotalValue = locationTotalValue;
    }


    /**
     * Gets the locBackwardConsumptionDays value for this ItemSearchBasic.
     * 
     * @return locBackwardConsumptionDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLocBackwardConsumptionDays() {
        return locBackwardConsumptionDays;
    }


    /**
     * Sets the locBackwardConsumptionDays value for this ItemSearchBasic.
     * 
     * @param locBackwardConsumptionDays
     */
    public void setLocBackwardConsumptionDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField locBackwardConsumptionDays) {
        this.locBackwardConsumptionDays = locBackwardConsumptionDays;
    }


    /**
     * Gets the locForwardConsumptionDays value for this ItemSearchBasic.
     * 
     * @return locForwardConsumptionDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLocForwardConsumptionDays() {
        return locForwardConsumptionDays;
    }


    /**
     * Sets the locForwardConsumptionDays value for this ItemSearchBasic.
     * 
     * @param locForwardConsumptionDays
     */
    public void setLocForwardConsumptionDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField locForwardConsumptionDays) {
        this.locForwardConsumptionDays = locForwardConsumptionDays;
    }


    /**
     * Gets the manufacturer value for this ItemSearchBasic.
     * 
     * @return manufacturer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this ItemSearchBasic.
     * 
     * @param manufacturer
     */
    public void setManufacturer(com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the manufactureraddr1 value for this ItemSearchBasic.
     * 
     * @return manufactureraddr1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getManufactureraddr1() {
        return manufactureraddr1;
    }


    /**
     * Sets the manufactureraddr1 value for this ItemSearchBasic.
     * 
     * @param manufactureraddr1
     */
    public void setManufactureraddr1(com.netsuite.webservices.platform.core_2019_1.SearchStringField manufactureraddr1) {
        this.manufactureraddr1 = manufactureraddr1;
    }


    /**
     * Gets the manufacturerCity value for this ItemSearchBasic.
     * 
     * @return manufacturerCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getManufacturerCity() {
        return manufacturerCity;
    }


    /**
     * Sets the manufacturerCity value for this ItemSearchBasic.
     * 
     * @param manufacturerCity
     */
    public void setManufacturerCity(com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }


    /**
     * Gets the manufacturerState value for this ItemSearchBasic.
     * 
     * @return manufacturerState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getManufacturerState() {
        return manufacturerState;
    }


    /**
     * Sets the manufacturerState value for this ItemSearchBasic.
     * 
     * @param manufacturerState
     */
    public void setManufacturerState(com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerState) {
        this.manufacturerState = manufacturerState;
    }


    /**
     * Gets the manufacturerTariff value for this ItemSearchBasic.
     * 
     * @return manufacturerTariff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getManufacturerTariff() {
        return manufacturerTariff;
    }


    /**
     * Sets the manufacturerTariff value for this ItemSearchBasic.
     * 
     * @param manufacturerTariff
     */
    public void setManufacturerTariff(com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }


    /**
     * Gets the manufacturerTaxId value for this ItemSearchBasic.
     * 
     * @return manufacturerTaxId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getManufacturerTaxId() {
        return manufacturerTaxId;
    }


    /**
     * Sets the manufacturerTaxId value for this ItemSearchBasic.
     * 
     * @param manufacturerTaxId
     */
    public void setManufacturerTaxId(com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }


    /**
     * Gets the manufacturerZip value for this ItemSearchBasic.
     * 
     * @return manufacturerZip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getManufacturerZip() {
        return manufacturerZip;
    }


    /**
     * Sets the manufacturerZip value for this ItemSearchBasic.
     * 
     * @param manufacturerZip
     */
    public void setManufacturerZip(com.netsuite.webservices.platform.core_2019_1.SearchStringField manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }


    /**
     * Gets the manufacturingChargeItem value for this ItemSearchBasic.
     * 
     * @return manufacturingChargeItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getManufacturingChargeItem() {
        return manufacturingChargeItem;
    }


    /**
     * Sets the manufacturingChargeItem value for this ItemSearchBasic.
     * 
     * @param manufacturingChargeItem
     */
    public void setManufacturingChargeItem(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField manufacturingChargeItem) {
        this.manufacturingChargeItem = manufacturingChargeItem;
    }


    /**
     * Gets the matchBillToReceipt value for this ItemSearchBasic.
     * 
     * @return matchBillToReceipt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMatchBillToReceipt() {
        return matchBillToReceipt;
    }


    /**
     * Sets the matchBillToReceipt value for this ItemSearchBasic.
     * 
     * @param matchBillToReceipt
     */
    public void setMatchBillToReceipt(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }


    /**
     * Gets the matrix value for this ItemSearchBasic.
     * 
     * @return matrix
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMatrix() {
        return matrix;
    }


    /**
     * Sets the matrix value for this ItemSearchBasic.
     * 
     * @param matrix
     */
    public void setMatrix(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField matrix) {
        this.matrix = matrix;
    }


    /**
     * Gets the matrixChild value for this ItemSearchBasic.
     * 
     * @return matrixChild
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMatrixChild() {
        return matrixChild;
    }


    /**
     * Sets the matrixChild value for this ItemSearchBasic.
     * 
     * @param matrixChild
     */
    public void setMatrixChild(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField matrixChild) {
        this.matrixChild = matrixChild;
    }


    /**
     * Gets the maximumQuantity value for this ItemSearchBasic.
     * 
     * @return maximumQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getMaximumQuantity() {
        return maximumQuantity;
    }


    /**
     * Sets the maximumQuantity value for this ItemSearchBasic.
     * 
     * @param maximumQuantity
     */
    public void setMaximumQuantity(com.netsuite.webservices.platform.core_2019_1.SearchLongField maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }


    /**
     * Gets the metaTagHtml value for this ItemSearchBasic.
     * 
     * @return metaTagHtml
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this ItemSearchBasic.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(com.netsuite.webservices.platform.core_2019_1.SearchStringField metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }


    /**
     * Gets the minimumQuantity value for this ItemSearchBasic.
     * 
     * @return minimumQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this ItemSearchBasic.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(com.netsuite.webservices.platform.core_2019_1.SearchLongField minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }


    /**
     * Gets the mossApplies value for this ItemSearchBasic.
     * 
     * @return mossApplies
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMossApplies() {
        return mossApplies;
    }


    /**
     * Sets the mossApplies value for this ItemSearchBasic.
     * 
     * @param mossApplies
     */
    public void setMossApplies(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField mossApplies) {
        this.mossApplies = mossApplies;
    }


    /**
     * Gets the mpn value for this ItemSearchBasic.
     * 
     * @return mpn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMpn() {
        return mpn;
    }


    /**
     * Sets the mpn value for this ItemSearchBasic.
     * 
     * @param mpn
     */
    public void setMpn(com.netsuite.webservices.platform.core_2019_1.SearchStringField mpn) {
        this.mpn = mpn;
    }


    /**
     * Gets the multManufactureAddr value for this ItemSearchBasic.
     * 
     * @return multManufactureAddr
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMultManufactureAddr() {
        return multManufactureAddr;
    }


    /**
     * Sets the multManufactureAddr value for this ItemSearchBasic.
     * 
     * @param multManufactureAddr
     */
    public void setMultManufactureAddr(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }


    /**
     * Gets the nexTagCategory value for this ItemSearchBasic.
     * 
     * @return nexTagCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getNexTagCategory() {
        return nexTagCategory;
    }


    /**
     * Sets the nexTagCategory value for this ItemSearchBasic.
     * 
     * @param nexTagCategory
     */
    public void setNexTagCategory(com.netsuite.webservices.platform.core_2019_1.SearchStringField nexTagCategory) {
        this.nexTagCategory = nexTagCategory;
    }


    /**
     * Gets the nexTagProductFeed value for this ItemSearchBasic.
     * 
     * @return nexTagProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getNexTagProductFeed() {
        return nexTagProductFeed;
    }


    /**
     * Sets the nexTagProductFeed value for this ItemSearchBasic.
     * 
     * @param nexTagProductFeed
     */
    public void setNexTagProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField nexTagProductFeed) {
        this.nexTagProductFeed = nexTagProductFeed;
    }


    /**
     * Gets the nextInvtCountDate value for this ItemSearchBasic.
     * 
     * @return nextInvtCountDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getNextInvtCountDate() {
        return nextInvtCountDate;
    }


    /**
     * Sets the nextInvtCountDate value for this ItemSearchBasic.
     * 
     * @param nextInvtCountDate
     */
    public void setNextInvtCountDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField nextInvtCountDate) {
        this.nextInvtCountDate = nextInvtCountDate;
    }


    /**
     * Gets the numActiveListings value for this ItemSearchBasic.
     * 
     * @return numActiveListings
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getNumActiveListings() {
        return numActiveListings;
    }


    /**
     * Sets the numActiveListings value for this ItemSearchBasic.
     * 
     * @param numActiveListings
     */
    public void setNumActiveListings(com.netsuite.webservices.platform.core_2019_1.SearchLongField numActiveListings) {
        this.numActiveListings = numActiveListings;
    }


    /**
     * Gets the numberAllowedDownloads value for this ItemSearchBasic.
     * 
     * @return numberAllowedDownloads
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getNumberAllowedDownloads() {
        return numberAllowedDownloads;
    }


    /**
     * Sets the numberAllowedDownloads value for this ItemSearchBasic.
     * 
     * @param numberAllowedDownloads
     */
    public void setNumberAllowedDownloads(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField numberAllowedDownloads) {
        this.numberAllowedDownloads = numberAllowedDownloads;
    }


    /**
     * Gets the numCurrentlyListed value for this ItemSearchBasic.
     * 
     * @return numCurrentlyListed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getNumCurrentlyListed() {
        return numCurrentlyListed;
    }


    /**
     * Sets the numCurrentlyListed value for this ItemSearchBasic.
     * 
     * @param numCurrentlyListed
     */
    public void setNumCurrentlyListed(com.netsuite.webservices.platform.core_2019_1.SearchLongField numCurrentlyListed) {
        this.numCurrentlyListed = numCurrentlyListed;
    }


    /**
     * Gets the obsoleteDate value for this ItemSearchBasic.
     * 
     * @return obsoleteDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getObsoleteDate() {
        return obsoleteDate;
    }


    /**
     * Sets the obsoleteDate value for this ItemSearchBasic.
     * 
     * @param obsoleteDate
     */
    public void setObsoleteDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField obsoleteDate) {
        this.obsoleteDate = obsoleteDate;
    }


    /**
     * Gets the obsoleteRevision value for this ItemSearchBasic.
     * 
     * @return obsoleteRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getObsoleteRevision() {
        return obsoleteRevision;
    }


    /**
     * Sets the obsoleteRevision value for this ItemSearchBasic.
     * 
     * @param obsoleteRevision
     */
    public void setObsoleteRevision(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField obsoleteRevision) {
        this.obsoleteRevision = obsoleteRevision;
    }


    /**
     * Gets the offerSupport value for this ItemSearchBasic.
     * 
     * @return offerSupport
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getOfferSupport() {
        return offerSupport;
    }


    /**
     * Sets the offerSupport value for this ItemSearchBasic.
     * 
     * @param offerSupport
     */
    public void setOfferSupport(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField offerSupport) {
        this.offerSupport = offerSupport;
    }


    /**
     * Gets the onlineCustomerPrice value for this ItemSearchBasic.
     * 
     * @return onlineCustomerPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getOnlineCustomerPrice() {
        return onlineCustomerPrice;
    }


    /**
     * Sets the onlineCustomerPrice value for this ItemSearchBasic.
     * 
     * @param onlineCustomerPrice
     */
    public void setOnlineCustomerPrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField onlineCustomerPrice) {
        this.onlineCustomerPrice = onlineCustomerPrice;
    }


    /**
     * Gets the onSpecial value for this ItemSearchBasic.
     * 
     * @return onSpecial
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getOnSpecial() {
        return onSpecial;
    }


    /**
     * Sets the onSpecial value for this ItemSearchBasic.
     * 
     * @param onSpecial
     */
    public void setOnSpecial(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField onSpecial) {
        this.onSpecial = onSpecial;
    }


    /**
     * Gets the otherVendor value for this ItemSearchBasic.
     * 
     * @return otherVendor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getOtherVendor() {
        return otherVendor;
    }


    /**
     * Sets the otherVendor value for this ItemSearchBasic.
     * 
     * @param otherVendor
     */
    public void setOtherVendor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField otherVendor) {
        this.otherVendor = otherVendor;
    }


    /**
     * Gets the outOfStockBehavior value for this ItemSearchBasic.
     * 
     * @return outOfStockBehavior
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getOutOfStockBehavior() {
        return outOfStockBehavior;
    }


    /**
     * Sets the outOfStockBehavior value for this ItemSearchBasic.
     * 
     * @param outOfStockBehavior
     */
    public void setOutOfStockBehavior(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }


    /**
     * Gets the overallQuantityPricingType value for this ItemSearchBasic.
     * 
     * @return overallQuantityPricingType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }


    /**
     * Sets the overallQuantityPricingType value for this ItemSearchBasic.
     * 
     * @param overallQuantityPricingType
     */
    public void setOverallQuantityPricingType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }


    /**
     * Gets the overheadType value for this ItemSearchBasic.
     * 
     * @return overheadType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getOverheadType() {
        return overheadType;
    }


    /**
     * Sets the overheadType value for this ItemSearchBasic.
     * 
     * @param overheadType
     */
    public void setOverheadType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField overheadType) {
        this.overheadType = overheadType;
    }


    /**
     * Gets the pageTitle value for this ItemSearchBasic.
     * 
     * @return pageTitle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this ItemSearchBasic.
     * 
     * @param pageTitle
     */
    public void setPageTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField pageTitle) {
        this.pageTitle = pageTitle;
    }


    /**
     * Gets the parent value for this ItemSearchBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ItemSearchBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the periodicLotSizeDays value for this ItemSearchBasic.
     * 
     * @return periodicLotSizeDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPeriodicLotSizeDays() {
        return periodicLotSizeDays;
    }


    /**
     * Sets the periodicLotSizeDays value for this ItemSearchBasic.
     * 
     * @param periodicLotSizeDays
     */
    public void setPeriodicLotSizeDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField periodicLotSizeDays) {
        this.periodicLotSizeDays = periodicLotSizeDays;
    }


    /**
     * Gets the periodicLotSizeType value for this ItemSearchBasic.
     * 
     * @return periodicLotSizeType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getPeriodicLotSizeType() {
        return periodicLotSizeType;
    }


    /**
     * Sets the periodicLotSizeType value for this ItemSearchBasic.
     * 
     * @param periodicLotSizeType
     */
    public void setPeriodicLotSizeType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField periodicLotSizeType) {
        this.periodicLotSizeType = periodicLotSizeType;
    }


    /**
     * Gets the preferenceCriterion value for this ItemSearchBasic.
     * 
     * @return preferenceCriterion
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPreferenceCriterion() {
        return preferenceCriterion;
    }


    /**
     * Sets the preferenceCriterion value for this ItemSearchBasic.
     * 
     * @param preferenceCriterion
     */
    public void setPreferenceCriterion(com.netsuite.webservices.platform.core_2019_1.SearchStringField preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }


    /**
     * Gets the preferredBin value for this ItemSearchBasic.
     * 
     * @return preferredBin
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPreferredBin() {
        return preferredBin;
    }


    /**
     * Sets the preferredBin value for this ItemSearchBasic.
     * 
     * @param preferredBin
     */
    public void setPreferredBin(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField preferredBin) {
        this.preferredBin = preferredBin;
    }


    /**
     * Gets the preferredLocation value for this ItemSearchBasic.
     * 
     * @return preferredLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPreferredLocation() {
        return preferredLocation;
    }


    /**
     * Sets the preferredLocation value for this ItemSearchBasic.
     * 
     * @param preferredLocation
     */
    public void setPreferredLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField preferredLocation) {
        this.preferredLocation = preferredLocation;
    }


    /**
     * Gets the preferredStockLevel value for this ItemSearchBasic.
     * 
     * @return preferredStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPreferredStockLevel() {
        return preferredStockLevel;
    }


    /**
     * Sets the preferredStockLevel value for this ItemSearchBasic.
     * 
     * @param preferredStockLevel
     */
    public void setPreferredStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }


    /**
     * Gets the preferredStockLevelDays value for this ItemSearchBasic.
     * 
     * @return preferredStockLevelDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPreferredStockLevelDays() {
        return preferredStockLevelDays;
    }


    /**
     * Sets the preferredStockLevelDays value for this ItemSearchBasic.
     * 
     * @param preferredStockLevelDays
     */
    public void setPreferredStockLevelDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField preferredStockLevelDays) {
        this.preferredStockLevelDays = preferredStockLevelDays;
    }


    /**
     * Gets the price value for this ItemSearchBasic.
     * 
     * @return price
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ItemSearchBasic.
     * 
     * @param price
     */
    public void setPrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField price) {
        this.price = price;
    }


    /**
     * Gets the pricesIncludeTax value for this ItemSearchBasic.
     * 
     * @return pricesIncludeTax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPricesIncludeTax() {
        return pricesIncludeTax;
    }


    /**
     * Sets the pricesIncludeTax value for this ItemSearchBasic.
     * 
     * @param pricesIncludeTax
     */
    public void setPricesIncludeTax(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }


    /**
     * Gets the pricingGroup value for this ItemSearchBasic.
     * 
     * @return pricingGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this ItemSearchBasic.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField pricingGroup) {
        this.pricingGroup = pricingGroup;
    }


    /**
     * Gets the primaryCategory value for this ItemSearchBasic.
     * 
     * @return primaryCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPrimaryCategory() {
        return primaryCategory;
    }


    /**
     * Sets the primaryCategory value for this ItemSearchBasic.
     * 
     * @param primaryCategory
     */
    public void setPrimaryCategory(com.netsuite.webservices.platform.core_2019_1.SearchLongField primaryCategory) {
        this.primaryCategory = primaryCategory;
    }


    /**
     * Gets the purchaseOrderAmount value for this ItemSearchBasic.
     * 
     * @return purchaseOrderAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this ItemSearchBasic.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }


    /**
     * Gets the purchaseOrderQuantity value for this ItemSearchBasic.
     * 
     * @return purchaseOrderQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this ItemSearchBasic.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this ItemSearchBasic.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this ItemSearchBasic.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }


    /**
     * Gets the purchaseUnit value for this ItemSearchBasic.
     * 
     * @return purchaseUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPurchaseUnit() {
        return purchaseUnit;
    }


    /**
     * Sets the purchaseUnit value for this ItemSearchBasic.
     * 
     * @param purchaseUnit
     */
    public void setPurchaseUnit(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }


    /**
     * Gets the quantityAvailable value for this ItemSearchBasic.
     * 
     * @return quantityAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this ItemSearchBasic.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the quantityBackOrdered value for this ItemSearchBasic.
     * 
     * @return quantityBackOrdered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this ItemSearchBasic.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the quantityCommitted value for this ItemSearchBasic.
     * 
     * @return quantityCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this ItemSearchBasic.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityOnHand value for this ItemSearchBasic.
     * 
     * @return quantityOnHand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this ItemSearchBasic.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the quantityOnOrder value for this ItemSearchBasic.
     * 
     * @return quantityOnOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityOnOrder() {
        return quantityOnOrder;
    }


    /**
     * Sets the quantityOnOrder value for this ItemSearchBasic.
     * 
     * @param quantityOnOrder
     */
    public void setQuantityOnOrder(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }


    /**
     * Gets the quantityPricingSchedule value for this ItemSearchBasic.
     * 
     * @return quantityPricingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }


    /**
     * Sets the quantityPricingSchedule value for this ItemSearchBasic.
     * 
     * @param quantityPricingSchedule
     */
    public void setQuantityPricingSchedule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }


    /**
     * Gets the receiptAmount value for this ItemSearchBasic.
     * 
     * @return receiptAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this ItemSearchBasic.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the receiptQuantity value for this ItemSearchBasic.
     * 
     * @return receiptQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this ItemSearchBasic.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }


    /**
     * Gets the receiptQuantityDiff value for this ItemSearchBasic.
     * 
     * @return receiptQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this ItemSearchBasic.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }


    /**
     * Gets the reorderMultiple value for this ItemSearchBasic.
     * 
     * @return reorderMultiple
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getReorderMultiple() {
        return reorderMultiple;
    }


    /**
     * Sets the reorderMultiple value for this ItemSearchBasic.
     * 
     * @param reorderMultiple
     */
    public void setReorderMultiple(com.netsuite.webservices.platform.core_2019_1.SearchLongField reorderMultiple) {
        this.reorderMultiple = reorderMultiple;
    }


    /**
     * Gets the reorderPoint value for this ItemSearchBasic.
     * 
     * @return reorderPoint
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReorderPoint() {
        return reorderPoint;
    }


    /**
     * Sets the reorderPoint value for this ItemSearchBasic.
     * 
     * @param reorderPoint
     */
    public void setReorderPoint(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField reorderPoint) {
        this.reorderPoint = reorderPoint;
    }


    /**
     * Gets the rescheduleInDays value for this ItemSearchBasic.
     * 
     * @return rescheduleInDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getRescheduleInDays() {
        return rescheduleInDays;
    }


    /**
     * Sets the rescheduleInDays value for this ItemSearchBasic.
     * 
     * @param rescheduleInDays
     */
    public void setRescheduleInDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField rescheduleInDays) {
        this.rescheduleInDays = rescheduleInDays;
    }


    /**
     * Gets the rescheduleOutDays value for this ItemSearchBasic.
     * 
     * @return rescheduleOutDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getRescheduleOutDays() {
        return rescheduleOutDays;
    }


    /**
     * Sets the rescheduleOutDays value for this ItemSearchBasic.
     * 
     * @param rescheduleOutDays
     */
    public void setRescheduleOutDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField rescheduleOutDays) {
        this.rescheduleOutDays = rescheduleOutDays;
    }


    /**
     * Gets the reservePrice value for this ItemSearchBasic.
     * 
     * @return reservePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getReservePrice() {
        return reservePrice;
    }


    /**
     * Sets the reservePrice value for this ItemSearchBasic.
     * 
     * @param reservePrice
     */
    public void setReservePrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField reservePrice) {
        this.reservePrice = reservePrice;
    }


    /**
     * Gets the revenueAllocationGroup value for this ItemSearchBasic.
     * 
     * @return revenueAllocationGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRevenueAllocationGroup() {
        return revenueAllocationGroup;
    }


    /**
     * Sets the revenueAllocationGroup value for this ItemSearchBasic.
     * 
     * @param revenueAllocationGroup
     */
    public void setRevenueAllocationGroup(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revenueAllocationGroup) {
        this.revenueAllocationGroup = revenueAllocationGroup;
    }


    /**
     * Gets the revenueRecognitionRule value for this ItemSearchBasic.
     * 
     * @return revenueRecognitionRule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }


    /**
     * Sets the revenueRecognitionRule value for this ItemSearchBasic.
     * 
     * @param revenueRecognitionRule
     */
    public void setRevenueRecognitionRule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }


    /**
     * Gets the revRecForecastRule value for this ItemSearchBasic.
     * 
     * @return revRecForecastRule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRevRecForecastRule() {
        return revRecForecastRule;
    }


    /**
     * Sets the revRecForecastRule value for this ItemSearchBasic.
     * 
     * @param revRecForecastRule
     */
    public void setRevRecForecastRule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }


    /**
     * Gets the revRecSchedule value for this ItemSearchBasic.
     * 
     * @return revRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this ItemSearchBasic.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the roundUpAsComponent value for this ItemSearchBasic.
     * 
     * @return roundUpAsComponent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getRoundUpAsComponent() {
        return roundUpAsComponent;
    }


    /**
     * Sets the roundUpAsComponent value for this ItemSearchBasic.
     * 
     * @param roundUpAsComponent
     */
    public void setRoundUpAsComponent(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField roundUpAsComponent) {
        this.roundUpAsComponent = roundUpAsComponent;
    }


    /**
     * Gets the safetyStockLevel value for this ItemSearchBasic.
     * 
     * @return safetyStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getSafetyStockLevel() {
        return safetyStockLevel;
    }


    /**
     * Sets the safetyStockLevel value for this ItemSearchBasic.
     * 
     * @param safetyStockLevel
     */
    public void setSafetyStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }


    /**
     * Gets the safetyStockLevelDays value for this ItemSearchBasic.
     * 
     * @return safetyStockLevelDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getSafetyStockLevelDays() {
        return safetyStockLevelDays;
    }


    /**
     * Sets the safetyStockLevelDays value for this ItemSearchBasic.
     * 
     * @param safetyStockLevelDays
     */
    public void setSafetyStockLevelDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField safetyStockLevelDays) {
        this.safetyStockLevelDays = safetyStockLevelDays;
    }


    /**
     * Gets the salesDescription value for this ItemSearchBasic.
     * 
     * @return salesDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSalesDescription() {
        return salesDescription;
    }


    /**
     * Sets the salesDescription value for this ItemSearchBasic.
     * 
     * @param salesDescription
     */
    public void setSalesDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField salesDescription) {
        this.salesDescription = salesDescription;
    }


    /**
     * Gets the saleUnit value for this ItemSearchBasic.
     * 
     * @return saleUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSaleUnit() {
        return saleUnit;
    }


    /**
     * Sets the saleUnit value for this ItemSearchBasic.
     * 
     * @param saleUnit
     */
    public void setSaleUnit(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField saleUnit) {
        this.saleUnit = saleUnit;
    }


    /**
     * Gets the sameAsPrimaryBookAmortization value for this ItemSearchBasic.
     * 
     * @return sameAsPrimaryBookAmortization
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getSameAsPrimaryBookAmortization() {
        return sameAsPrimaryBookAmortization;
    }


    /**
     * Sets the sameAsPrimaryBookAmortization value for this ItemSearchBasic.
     * 
     * @param sameAsPrimaryBookAmortization
     */
    public void setSameAsPrimaryBookAmortization(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField sameAsPrimaryBookAmortization) {
        this.sameAsPrimaryBookAmortization = sameAsPrimaryBookAmortization;
    }


    /**
     * Gets the sameAsPrimaryBookRevRec value for this ItemSearchBasic.
     * 
     * @return sameAsPrimaryBookRevRec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getSameAsPrimaryBookRevRec() {
        return sameAsPrimaryBookRevRec;
    }


    /**
     * Sets the sameAsPrimaryBookRevRec value for this ItemSearchBasic.
     * 
     * @param sameAsPrimaryBookRevRec
     */
    public void setSameAsPrimaryBookRevRec(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField sameAsPrimaryBookRevRec) {
        this.sameAsPrimaryBookRevRec = sameAsPrimaryBookRevRec;
    }


    /**
     * Gets the scheduleBCode value for this ItemSearchBasic.
     * 
     * @return scheduleBCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getScheduleBCode() {
        return scheduleBCode;
    }


    /**
     * Sets the scheduleBCode value for this ItemSearchBasic.
     * 
     * @param scheduleBCode
     */
    public void setScheduleBCode(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }


    /**
     * Gets the scheduleBNumber value for this ItemSearchBasic.
     * 
     * @return scheduleBNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getScheduleBNumber() {
        return scheduleBNumber;
    }


    /**
     * Sets the scheduleBNumber value for this ItemSearchBasic.
     * 
     * @param scheduleBNumber
     */
    public void setScheduleBNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }


    /**
     * Gets the scheduleBQuantity value for this ItemSearchBasic.
     * 
     * @return scheduleBQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getScheduleBQuantity() {
        return scheduleBQuantity;
    }


    /**
     * Sets the scheduleBQuantity value for this ItemSearchBasic.
     * 
     * @param scheduleBQuantity
     */
    public void setScheduleBQuantity(com.netsuite.webservices.platform.core_2019_1.SearchStringField scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }


    /**
     * Gets the searchKeywords value for this ItemSearchBasic.
     * 
     * @return searchKeywords
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this ItemSearchBasic.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(com.netsuite.webservices.platform.core_2019_1.SearchStringField searchKeywords) {
        this.searchKeywords = searchKeywords;
    }


    /**
     * Gets the seasonalDemand value for this ItemSearchBasic.
     * 
     * @return seasonalDemand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getSeasonalDemand() {
        return seasonalDemand;
    }


    /**
     * Sets the seasonalDemand value for this ItemSearchBasic.
     * 
     * @param seasonalDemand
     */
    public void setSeasonalDemand(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField seasonalDemand) {
        this.seasonalDemand = seasonalDemand;
    }


    /**
     * Gets the sellOnEBay value for this ItemSearchBasic.
     * 
     * @return sellOnEBay
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getSellOnEBay() {
        return sellOnEBay;
    }


    /**
     * Sets the sellOnEBay value for this ItemSearchBasic.
     * 
     * @param sellOnEBay
     */
    public void setSellOnEBay(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField sellOnEBay) {
        this.sellOnEBay = sellOnEBay;
    }


    /**
     * Gets the serialNumber value for this ItemSearchBasic.
     * 
     * @return serialNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ItemSearchBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the serialNumberLocation value for this ItemSearchBasic.
     * 
     * @return serialNumberLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSerialNumberLocation() {
        return serialNumberLocation;
    }


    /**
     * Sets the serialNumberLocation value for this ItemSearchBasic.
     * 
     * @param serialNumberLocation
     */
    public void setSerialNumberLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField serialNumberLocation) {
        this.serialNumberLocation = serialNumberLocation;
    }


    /**
     * Gets the shipIndividually value for this ItemSearchBasic.
     * 
     * @return shipIndividually
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getShipIndividually() {
        return shipIndividually;
    }


    /**
     * Sets the shipIndividually value for this ItemSearchBasic.
     * 
     * @param shipIndividually
     */
    public void setShipIndividually(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipIndividually) {
        this.shipIndividually = shipIndividually;
    }


    /**
     * Gets the shipPackage value for this ItemSearchBasic.
     * 
     * @return shipPackage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getShipPackage() {
        return shipPackage;
    }


    /**
     * Sets the shipPackage value for this ItemSearchBasic.
     * 
     * @param shipPackage
     */
    public void setShipPackage(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipPackage) {
        this.shipPackage = shipPackage;
    }


    /**
     * Gets the shippingCarrier value for this ItemSearchBasic.
     * 
     * @return shippingCarrier
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getShippingCarrier() {
        return shippingCarrier;
    }


    /**
     * Sets the shippingCarrier value for this ItemSearchBasic.
     * 
     * @param shippingCarrier
     */
    public void setShippingCarrier(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
    }


    /**
     * Gets the shippingRate value for this ItemSearchBasic.
     * 
     * @return shippingRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getShippingRate() {
        return shippingRate;
    }


    /**
     * Sets the shippingRate value for this ItemSearchBasic.
     * 
     * @param shippingRate
     */
    public void setShippingRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField shippingRate) {
        this.shippingRate = shippingRate;
    }


    /**
     * Gets the shoppingDotComCategory value for this ItemSearchBasic.
     * 
     * @return shoppingDotComCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }


    /**
     * Sets the shoppingDotComCategory value for this ItemSearchBasic.
     * 
     * @param shoppingDotComCategory
     */
    public void setShoppingDotComCategory(com.netsuite.webservices.platform.core_2019_1.SearchStringField shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }


    /**
     * Gets the shoppingProductFeed value for this ItemSearchBasic.
     * 
     * @return shoppingProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getShoppingProductFeed() {
        return shoppingProductFeed;
    }


    /**
     * Sets the shoppingProductFeed value for this ItemSearchBasic.
     * 
     * @param shoppingProductFeed
     */
    public void setShoppingProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shoppingProductFeed) {
        this.shoppingProductFeed = shoppingProductFeed;
    }


    /**
     * Gets the shopzillaCategoryId value for this ItemSearchBasic.
     * 
     * @return shopzillaCategoryId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }


    /**
     * Sets the shopzillaCategoryId value for this ItemSearchBasic.
     * 
     * @param shopzillaCategoryId
     */
    public void setShopzillaCategoryId(com.netsuite.webservices.platform.core_2019_1.SearchLongField shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }


    /**
     * Gets the shopzillaProductFeed value for this ItemSearchBasic.
     * 
     * @return shopzillaProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getShopzillaProductFeed() {
        return shopzillaProductFeed;
    }


    /**
     * Sets the shopzillaProductFeed value for this ItemSearchBasic.
     * 
     * @param shopzillaProductFeed
     */
    public void setShopzillaProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shopzillaProductFeed) {
        this.shopzillaProductFeed = shopzillaProductFeed;
    }


    /**
     * Gets the sitemapPriority value for this ItemSearchBasic.
     * 
     * @return sitemapPriority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this ItemSearchBasic.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }


    /**
     * Gets the softDescriptor value for this ItemSearchBasic.
     * 
     * @return softDescriptor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this ItemSearchBasic.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the startingPrice value for this ItemSearchBasic.
     * 
     * @return startingPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getStartingPrice() {
        return startingPrice;
    }


    /**
     * Sets the startingPrice value for this ItemSearchBasic.
     * 
     * @param startingPrice
     */
    public void setStartingPrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField startingPrice) {
        this.startingPrice = startingPrice;
    }


    /**
     * Gets the stockDescription value for this ItemSearchBasic.
     * 
     * @return stockDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getStockDescription() {
        return stockDescription;
    }


    /**
     * Sets the stockDescription value for this ItemSearchBasic.
     * 
     * @param stockDescription
     */
    public void setStockDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField stockDescription) {
        this.stockDescription = stockDescription;
    }


    /**
     * Gets the stockUnit value for this ItemSearchBasic.
     * 
     * @return stockUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getStockUnit() {
        return stockUnit;
    }


    /**
     * Sets the stockUnit value for this ItemSearchBasic.
     * 
     * @param stockUnit
     */
    public void setStockUnit(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField stockUnit) {
        this.stockUnit = stockUnit;
    }


    /**
     * Gets the storeDescription value for this ItemSearchBasic.
     * 
     * @return storeDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getStoreDescription() {
        return storeDescription;
    }


    /**
     * Sets the storeDescription value for this ItemSearchBasic.
     * 
     * @param storeDescription
     */
    public void setStoreDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField storeDescription) {
        this.storeDescription = storeDescription;
    }


    /**
     * Gets the subsidiary value for this ItemSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ItemSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the subType value for this ItemSearchBasic.
     * 
     * @return subType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this ItemSearchBasic.
     * 
     * @param subType
     */
    public void setSubType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField subType) {
        this.subType = subType;
    }


    /**
     * Gets the supplyLotSizingMethod value for this ItemSearchBasic.
     * 
     * @return supplyLotSizingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getSupplyLotSizingMethod() {
        return supplyLotSizingMethod;
    }


    /**
     * Sets the supplyLotSizingMethod value for this ItemSearchBasic.
     * 
     * @param supplyLotSizingMethod
     */
    public void setSupplyLotSizingMethod(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField supplyLotSizingMethod) {
        this.supplyLotSizingMethod = supplyLotSizingMethod;
    }


    /**
     * Gets the supplyReplenishmentMethod value for this ItemSearchBasic.
     * 
     * @return supplyReplenishmentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getSupplyReplenishmentMethod() {
        return supplyReplenishmentMethod;
    }


    /**
     * Sets the supplyReplenishmentMethod value for this ItemSearchBasic.
     * 
     * @param supplyReplenishmentMethod
     */
    public void setSupplyReplenishmentMethod(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField supplyReplenishmentMethod) {
        this.supplyReplenishmentMethod = supplyReplenishmentMethod;
    }


    /**
     * Gets the supplyTimeFence value for this ItemSearchBasic.
     * 
     * @return supplyTimeFence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getSupplyTimeFence() {
        return supplyTimeFence;
    }


    /**
     * Sets the supplyTimeFence value for this ItemSearchBasic.
     * 
     * @param supplyTimeFence
     */
    public void setSupplyTimeFence(com.netsuite.webservices.platform.core_2019_1.SearchLongField supplyTimeFence) {
        this.supplyTimeFence = supplyTimeFence;
    }


    /**
     * Gets the supplyType value for this ItemSearchBasic.
     * 
     * @return supplyType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getSupplyType() {
        return supplyType;
    }


    /**
     * Sets the supplyType value for this ItemSearchBasic.
     * 
     * @param supplyType
     */
    public void setSupplyType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField supplyType) {
        this.supplyType = supplyType;
    }


    /**
     * Gets the taxCode value for this ItemSearchBasic.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this ItemSearchBasic.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxSchedule value for this ItemSearchBasic.
     * 
     * @return taxSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this ItemSearchBasic.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the thumbnailUrl value for this ItemSearchBasic.
     * 
     * @return thumbnailUrl
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getThumbnailUrl() {
        return thumbnailUrl;
    }


    /**
     * Sets the thumbnailUrl value for this ItemSearchBasic.
     * 
     * @param thumbnailUrl
     */
    public void setThumbnailUrl(com.netsuite.webservices.platform.core_2019_1.SearchStringField thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }


    /**
     * Gets the totalValue value for this ItemSearchBasic.
     * 
     * @return totalValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTotalValue() {
        return totalValue;
    }


    /**
     * Sets the totalValue value for this ItemSearchBasic.
     * 
     * @param totalValue
     */
    public void setTotalValue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField totalValue) {
        this.totalValue = totalValue;
    }


    /**
     * Gets the trackLandedCost value for this ItemSearchBasic.
     * 
     * @return trackLandedCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getTrackLandedCost() {
        return trackLandedCost;
    }


    /**
     * Sets the trackLandedCost value for this ItemSearchBasic.
     * 
     * @param trackLandedCost
     */
    public void setTrackLandedCost(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField trackLandedCost) {
        this.trackLandedCost = trackLandedCost;
    }


    /**
     * Gets the transferPrice value for this ItemSearchBasic.
     * 
     * @return transferPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTransferPrice() {
        return transferPrice;
    }


    /**
     * Sets the transferPrice value for this ItemSearchBasic.
     * 
     * @param transferPrice
     */
    public void setTransferPrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferPrice) {
        this.transferPrice = transferPrice;
    }


    /**
     * Gets the type value for this ItemSearchBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this ItemSearchBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the unitsType value for this ItemSearchBasic.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this ItemSearchBasic.
     * 
     * @param unitsType
     */
    public void setUnitsType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unitsType) {
        this.unitsType = unitsType;
    }


    /**
     * Gets the upcCode value for this ItemSearchBasic.
     * 
     * @return upcCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this ItemSearchBasic.
     * 
     * @param upcCode
     */
    public void setUpcCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField upcCode) {
        this.upcCode = upcCode;
    }


    /**
     * Gets the urlComponent value for this ItemSearchBasic.
     * 
     * @return urlComponent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this ItemSearchBasic.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(com.netsuite.webservices.platform.core_2019_1.SearchStringField urlComponent) {
        this.urlComponent = urlComponent;
    }


    /**
     * Gets the useBins value for this ItemSearchBasic.
     * 
     * @return useBins
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUseBins() {
        return useBins;
    }


    /**
     * Sets the useBins value for this ItemSearchBasic.
     * 
     * @param useBins
     */
    public void setUseBins(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useBins) {
        this.useBins = useBins;
    }


    /**
     * Gets the useComponentYield value for this ItemSearchBasic.
     * 
     * @return useComponentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUseComponentYield() {
        return useComponentYield;
    }


    /**
     * Sets the useComponentYield value for this ItemSearchBasic.
     * 
     * @param useComponentYield
     */
    public void setUseComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useComponentYield) {
        this.useComponentYield = useComponentYield;
    }


    /**
     * Gets the useMarginalRates value for this ItemSearchBasic.
     * 
     * @return useMarginalRates
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUseMarginalRates() {
        return useMarginalRates;
    }


    /**
     * Sets the useMarginalRates value for this ItemSearchBasic.
     * 
     * @param useMarginalRates
     */
    public void setUseMarginalRates(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }


    /**
     * Gets the vendor value for this ItemSearchBasic.
     * 
     * @return vendor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this ItemSearchBasic.
     * 
     * @param vendor
     */
    public void setVendor(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the vendorCode value for this ItemSearchBasic.
     * 
     * @return vendorCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getVendorCode() {
        return vendorCode;
    }


    /**
     * Sets the vendorCode value for this ItemSearchBasic.
     * 
     * @param vendorCode
     */
    public void setVendorCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField vendorCode) {
        this.vendorCode = vendorCode;
    }


    /**
     * Gets the vendorCost value for this ItemSearchBasic.
     * 
     * @return vendorCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getVendorCost() {
        return vendorCost;
    }


    /**
     * Sets the vendorCost value for this ItemSearchBasic.
     * 
     * @param vendorCost
     */
    public void setVendorCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vendorCost) {
        this.vendorCost = vendorCost;
    }


    /**
     * Gets the vendorCostEntered value for this ItemSearchBasic.
     * 
     * @return vendorCostEntered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getVendorCostEntered() {
        return vendorCostEntered;
    }


    /**
     * Sets the vendorCostEntered value for this ItemSearchBasic.
     * 
     * @param vendorCostEntered
     */
    public void setVendorCostEntered(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vendorCostEntered) {
        this.vendorCostEntered = vendorCostEntered;
    }


    /**
     * Gets the vendorName value for this ItemSearchBasic.
     * 
     * @return vendorName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this ItemSearchBasic.
     * 
     * @param vendorName
     */
    public void setVendorName(com.netsuite.webservices.platform.core_2019_1.SearchStringField vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the vendorPriceCurrency value for this ItemSearchBasic.
     * 
     * @return vendorPriceCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getVendorPriceCurrency() {
        return vendorPriceCurrency;
    }


    /**
     * Sets the vendorPriceCurrency value for this ItemSearchBasic.
     * 
     * @param vendorPriceCurrency
     */
    public void setVendorPriceCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vendorPriceCurrency) {
        this.vendorPriceCurrency = vendorPriceCurrency;
    }


    /**
     * Gets the vsoeDeferral value for this ItemSearchBasic.
     * 
     * @return vsoeDeferral
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this ItemSearchBasic.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoeDelivered value for this ItemSearchBasic.
     * 
     * @return vsoeDelivered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this ItemSearchBasic.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the vsoePermitDiscount value for this ItemSearchBasic.
     * 
     * @return vsoePermitDiscount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this ItemSearchBasic.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoePrice value for this ItemSearchBasic.
     * 
     * @return vsoePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this ItemSearchBasic.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the vsoeSopGroup value for this ItemSearchBasic.
     * 
     * @return vsoeSopGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getVsoeSopGroup() {
        return vsoeSopGroup;
    }


    /**
     * Sets the vsoeSopGroup value for this ItemSearchBasic.
     * 
     * @param vsoeSopGroup
     */
    public void setVsoeSopGroup(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoeSopGroup) {
        this.vsoeSopGroup = vsoeSopGroup;
    }


    /**
     * Gets the webSite value for this ItemSearchBasic.
     * 
     * @return webSite
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getWebSite() {
        return webSite;
    }


    /**
     * Sets the webSite value for this ItemSearchBasic.
     * 
     * @param webSite
     */
    public void setWebSite(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField webSite) {
        this.webSite = webSite;
    }


    /**
     * Gets the weight value for this ItemSearchBasic.
     * 
     * @return weight
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ItemSearchBasic.
     * 
     * @param weight
     */
    public void setWeight(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField weight) {
        this.weight = weight;
    }


    /**
     * Gets the yahooProductFeed value for this ItemSearchBasic.
     * 
     * @return yahooProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getYahooProductFeed() {
        return yahooProductFeed;
    }


    /**
     * Sets the yahooProductFeed value for this ItemSearchBasic.
     * 
     * @param yahooProductFeed
     */
    public void setYahooProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField yahooProductFeed) {
        this.yahooProductFeed = yahooProductFeed;
    }


    /**
     * Gets the customFieldList value for this ItemSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSearchBasic)) return false;
        ItemSearchBasic other = (ItemSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accBookRevRecForecastRule==null && other.getAccBookRevRecForecastRule()==null) || 
             (this.accBookRevRecForecastRule!=null &&
              this.accBookRevRecForecastRule.equals(other.getAccBookRevRecForecastRule()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              this.accountingBook.equals(other.getAccountingBook()))) &&
            ((this.accountingBookAmortization==null && other.getAccountingBookAmortization()==null) || 
             (this.accountingBookAmortization!=null &&
              this.accountingBookAmortization.equals(other.getAccountingBookAmortization()))) &&
            ((this.accountingBookCreatePlansOn==null && other.getAccountingBookCreatePlansOn()==null) || 
             (this.accountingBookCreatePlansOn!=null &&
              this.accountingBookCreatePlansOn.equals(other.getAccountingBookCreatePlansOn()))) &&
            ((this.accountingBookRevRecRule==null && other.getAccountingBookRevRecRule()==null) || 
             (this.accountingBookRevRecRule!=null &&
              this.accountingBookRevRecRule.equals(other.getAccountingBookRevRecRule()))) &&
            ((this.accountingBookRevRecSchedule==null && other.getAccountingBookRevRecSchedule()==null) || 
             (this.accountingBookRevRecSchedule!=null &&
              this.accountingBookRevRecSchedule.equals(other.getAccountingBookRevRecSchedule()))) &&
            ((this.allowedShippingMethod==null && other.getAllowedShippingMethod()==null) || 
             (this.allowedShippingMethod!=null &&
              this.allowedShippingMethod.equals(other.getAllowedShippingMethod()))) &&
            ((this.alternateDemandSourceItem==null && other.getAlternateDemandSourceItem()==null) || 
             (this.alternateDemandSourceItem!=null &&
              this.alternateDemandSourceItem.equals(other.getAlternateDemandSourceItem()))) &&
            ((this.atpLeadTime==null && other.getAtpLeadTime()==null) || 
             (this.atpLeadTime!=null &&
              this.atpLeadTime.equals(other.getAtpLeadTime()))) &&
            ((this.atpMethod==null && other.getAtpMethod()==null) || 
             (this.atpMethod!=null &&
              this.atpMethod.equals(other.getAtpMethod()))) &&
            ((this.autoLeadTime==null && other.getAutoLeadTime()==null) || 
             (this.autoLeadTime!=null &&
              this.autoLeadTime.equals(other.getAutoLeadTime()))) &&
            ((this.autoPreferredStockLevel==null && other.getAutoPreferredStockLevel()==null) || 
             (this.autoPreferredStockLevel!=null &&
              this.autoPreferredStockLevel.equals(other.getAutoPreferredStockLevel()))) &&
            ((this.autoReorderPoint==null && other.getAutoReorderPoint()==null) || 
             (this.autoReorderPoint!=null &&
              this.autoReorderPoint.equals(other.getAutoReorderPoint()))) &&
            ((this.availableToPartners==null && other.getAvailableToPartners()==null) || 
             (this.availableToPartners!=null &&
              this.availableToPartners.equals(other.getAvailableToPartners()))) &&
            ((this.averageCost==null && other.getAverageCost()==null) || 
             (this.averageCost!=null &&
              this.averageCost.equals(other.getAverageCost()))) &&
            ((this.backwardConsumptionDays==null && other.getBackwardConsumptionDays()==null) || 
             (this.backwardConsumptionDays!=null &&
              this.backwardConsumptionDays.equals(other.getBackwardConsumptionDays()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              this.binNumber.equals(other.getBinNumber()))) &&
            ((this.binOnHandAvail==null && other.getBinOnHandAvail()==null) || 
             (this.binOnHandAvail!=null &&
              this.binOnHandAvail.equals(other.getBinOnHandAvail()))) &&
            ((this.binOnHandCount==null && other.getBinOnHandCount()==null) || 
             (this.binOnHandCount!=null &&
              this.binOnHandCount.equals(other.getBinOnHandCount()))) &&
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              this.bomQuantity.equals(other.getBomQuantity()))) &&
            ((this.buildEntireAssembly==null && other.getBuildEntireAssembly()==null) || 
             (this.buildEntireAssembly!=null &&
              this.buildEntireAssembly.equals(other.getBuildEntireAssembly()))) &&
            ((this.buildTime==null && other.getBuildTime()==null) || 
             (this.buildTime!=null &&
              this.buildTime.equals(other.getBuildTime()))) &&
            ((this.buyItNowPrice==null && other.getBuyItNowPrice()==null) || 
             (this.buyItNowPrice!=null &&
              this.buyItNowPrice.equals(other.getBuyItNowPrice()))) &&
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.component==null && other.getComponent()==null) || 
             (this.component!=null &&
              this.component.equals(other.getComponent()))) &&
            ((this.componentOf==null && other.getComponentOf()==null) || 
             (this.componentOf!=null &&
              this.componentOf.equals(other.getComponentOf()))) &&
            ((this.componentYield==null && other.getComponentYield()==null) || 
             (this.componentYield!=null &&
              this.componentYield.equals(other.getComponentYield()))) &&
            ((this.contingentRevenueHandling==null && other.getContingentRevenueHandling()==null) || 
             (this.contingentRevenueHandling!=null &&
              this.contingentRevenueHandling.equals(other.getContingentRevenueHandling()))) &&
            ((this.copyDescription==null && other.getCopyDescription()==null) || 
             (this.copyDescription!=null &&
              this.copyDescription.equals(other.getCopyDescription()))) &&
            ((this.correlatedItem==null && other.getCorrelatedItem()==null) || 
             (this.correlatedItem!=null &&
              this.correlatedItem.equals(other.getCorrelatedItem()))) &&
            ((this.correlatedItemCorrelation==null && other.getCorrelatedItemCorrelation()==null) || 
             (this.correlatedItemCorrelation!=null &&
              this.correlatedItemCorrelation.equals(other.getCorrelatedItemCorrelation()))) &&
            ((this.correlatedItemCount==null && other.getCorrelatedItemCount()==null) || 
             (this.correlatedItemCount!=null &&
              this.correlatedItemCount.equals(other.getCorrelatedItemCount()))) &&
            ((this.correlatedItemLift==null && other.getCorrelatedItemLift()==null) || 
             (this.correlatedItemLift!=null &&
              this.correlatedItemLift.equals(other.getCorrelatedItemLift()))) &&
            ((this.correlatedItemPurchaseRate==null && other.getCorrelatedItemPurchaseRate()==null) || 
             (this.correlatedItemPurchaseRate!=null &&
              this.correlatedItemPurchaseRate.equals(other.getCorrelatedItemPurchaseRate()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.costAccountingStatus==null && other.getCostAccountingStatus()==null) || 
             (this.costAccountingStatus!=null &&
              this.costAccountingStatus.equals(other.getCostAccountingStatus()))) &&
            ((this.costCategory==null && other.getCostCategory()==null) || 
             (this.costCategory!=null &&
              this.costCategory.equals(other.getCostCategory()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.costingMethod==null && other.getCostingMethod()==null) || 
             (this.costingMethod!=null &&
              this.costingMethod.equals(other.getCostingMethod()))) &&
            ((this.countryOfManufacture==null && other.getCountryOfManufacture()==null) || 
             (this.countryOfManufacture!=null &&
              this.countryOfManufacture.equals(other.getCountryOfManufacture()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.createJob==null && other.getCreateJob()==null) || 
             (this.createJob!=null &&
              this.createJob.equals(other.getCreateJob()))) &&
            ((this.createRevenuePlansOn==null && other.getCreateRevenuePlansOn()==null) || 
             (this.createRevenuePlansOn!=null &&
              this.createRevenuePlansOn.equals(other.getCreateRevenuePlansOn()))) &&
            ((this.dateViewed==null && other.getDateViewed()==null) || 
             (this.dateViewed!=null &&
              this.dateViewed.equals(other.getDateViewed()))) &&
            ((this.daysBeforeExpiration==null && other.getDaysBeforeExpiration()==null) || 
             (this.daysBeforeExpiration!=null &&
              this.daysBeforeExpiration.equals(other.getDaysBeforeExpiration()))) &&
            ((this.defaultReturnCost==null && other.getDefaultReturnCost()==null) || 
             (this.defaultReturnCost!=null &&
              this.defaultReturnCost.equals(other.getDefaultReturnCost()))) &&
            ((this.defaultShippingMethod==null && other.getDefaultShippingMethod()==null) || 
             (this.defaultShippingMethod!=null &&
              this.defaultShippingMethod.equals(other.getDefaultShippingMethod()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              this.deferRevRec.equals(other.getDeferRevRec()))) &&
            ((this.demandModifier==null && other.getDemandModifier()==null) || 
             (this.demandModifier!=null &&
              this.demandModifier.equals(other.getDemandModifier()))) &&
            ((this.demandSource==null && other.getDemandSource()==null) || 
             (this.demandSource!=null &&
              this.demandSource.equals(other.getDemandSource()))) &&
            ((this.demandTimeFence==null && other.getDemandTimeFence()==null) || 
             (this.demandTimeFence!=null &&
              this.demandTimeFence.equals(other.getDemandTimeFence()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.directRevenuePosting==null && other.getDirectRevenuePosting()==null) || 
             (this.directRevenuePosting!=null &&
              this.directRevenuePosting.equals(other.getDirectRevenuePosting()))) &&
            ((this.displayIneBayStore==null && other.getDisplayIneBayStore()==null) || 
             (this.displayIneBayStore!=null &&
              this.displayIneBayStore.equals(other.getDisplayIneBayStore()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.distributionCategory==null && other.getDistributionCategory()==null) || 
             (this.distributionCategory!=null &&
              this.distributionCategory.equals(other.getDistributionCategory()))) &&
            ((this.distributionNetwork==null && other.getDistributionNetwork()==null) || 
             (this.distributionNetwork!=null &&
              this.distributionNetwork.equals(other.getDistributionNetwork()))) &&
            ((this.dontShowPrice==null && other.getDontShowPrice()==null) || 
             (this.dontShowPrice!=null &&
              this.dontShowPrice.equals(other.getDontShowPrice()))) &&
            ((this.eBayItemDescription==null && other.getEBayItemDescription()==null) || 
             (this.eBayItemDescription!=null &&
              this.eBayItemDescription.equals(other.getEBayItemDescription()))) &&
            ((this.eBayItemSubtitle==null && other.getEBayItemSubtitle()==null) || 
             (this.eBayItemSubtitle!=null &&
              this.eBayItemSubtitle.equals(other.getEBayItemSubtitle()))) &&
            ((this.eBayItemTitle==null && other.getEBayItemTitle()==null) || 
             (this.eBayItemTitle!=null &&
              this.eBayItemTitle.equals(other.getEBayItemTitle()))) &&
            ((this.ebayRelistingOption==null && other.getEbayRelistingOption()==null) || 
             (this.ebayRelistingOption!=null &&
              this.ebayRelistingOption.equals(other.getEbayRelistingOption()))) &&
            ((this.effectiveBomControl==null && other.getEffectiveBomControl()==null) || 
             (this.effectiveBomControl!=null &&
              this.effectiveBomControl.equals(other.getEffectiveBomControl()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.effectiveRevision==null && other.getEffectiveRevision()==null) || 
             (this.effectiveRevision!=null &&
              this.effectiveRevision.equals(other.getEffectiveRevision()))) &&
            ((this.endAuctionsWhenOutOfStock==null && other.getEndAuctionsWhenOutOfStock()==null) || 
             (this.endAuctionsWhenOutOfStock!=null &&
              this.endAuctionsWhenOutOfStock.equals(other.getEndAuctionsWhenOutOfStock()))) &&
            ((this.excludeFromSitemap==null && other.getExcludeFromSitemap()==null) || 
             (this.excludeFromSitemap!=null &&
              this.excludeFromSitemap.equals(other.getExcludeFromSitemap()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              this.featuredDescription.equals(other.getFeaturedDescription()))) &&
            ((this.feedDescription==null && other.getFeedDescription()==null) || 
             (this.feedDescription!=null &&
              this.feedDescription.equals(other.getFeedDescription()))) &&
            ((this.feedName==null && other.getFeedName()==null) || 
             (this.feedName!=null &&
              this.feedName.equals(other.getFeedName()))) &&
            ((this.fixedLotSize==null && other.getFixedLotSize()==null) || 
             (this.fixedLotSize!=null &&
              this.fixedLotSize.equals(other.getFixedLotSize()))) &&
            ((this.forwardConsumptionDays==null && other.getForwardConsumptionDays()==null) || 
             (this.forwardConsumptionDays!=null &&
              this.forwardConsumptionDays.equals(other.getForwardConsumptionDays()))) &&
            ((this.fraudRisk==null && other.getFraudRisk()==null) || 
             (this.fraudRisk!=null &&
              this.fraudRisk.equals(other.getFraudRisk()))) &&
            ((this.froogleProductFeed==null && other.getFroogleProductFeed()==null) || 
             (this.froogleProductFeed!=null &&
              this.froogleProductFeed.equals(other.getFroogleProductFeed()))) &&
            ((this.fxCost==null && other.getFxCost()==null) || 
             (this.fxCost!=null &&
              this.fxCost.equals(other.getFxCost()))) &&
            ((this.generateAccruals==null && other.getGenerateAccruals()==null) || 
             (this.generateAccruals!=null &&
              this.generateAccruals.equals(other.getGenerateAccruals()))) &&
            ((this.giftCertAuthCode==null && other.getGiftCertAuthCode()==null) || 
             (this.giftCertAuthCode!=null &&
              this.giftCertAuthCode.equals(other.getGiftCertAuthCode()))) &&
            ((this.giftCertEmail==null && other.getGiftCertEmail()==null) || 
             (this.giftCertEmail!=null &&
              this.giftCertEmail.equals(other.getGiftCertEmail()))) &&
            ((this.giftCertExpDate==null && other.getGiftCertExpDate()==null) || 
             (this.giftCertExpDate!=null &&
              this.giftCertExpDate.equals(other.getGiftCertExpDate()))) &&
            ((this.giftCertFrom==null && other.getGiftCertFrom()==null) || 
             (this.giftCertFrom!=null &&
              this.giftCertFrom.equals(other.getGiftCertFrom()))) &&
            ((this.giftCertMsg==null && other.getGiftCertMsg()==null) || 
             (this.giftCertMsg!=null &&
              this.giftCertMsg.equals(other.getGiftCertMsg()))) &&
            ((this.giftCertOrigAmt==null && other.getGiftCertOrigAmt()==null) || 
             (this.giftCertOrigAmt!=null &&
              this.giftCertOrigAmt.equals(other.getGiftCertOrigAmt()))) &&
            ((this.giftCertRecipient==null && other.getGiftCertRecipient()==null) || 
             (this.giftCertRecipient!=null &&
              this.giftCertRecipient.equals(other.getGiftCertRecipient()))) &&
            ((this.hierarchyNode==null && other.getHierarchyNode()==null) || 
             (this.hierarchyNode!=null &&
              this.hierarchyNode.equals(other.getHierarchyNode()))) &&
            ((this.hierarchyVersion==null && other.getHierarchyVersion()==null) || 
             (this.hierarchyVersion!=null &&
              this.hierarchyVersion.equals(other.getHierarchyVersion()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.inventoryLocation==null && other.getInventoryLocation()==null) || 
             (this.inventoryLocation!=null &&
              this.inventoryLocation.equals(other.getInventoryLocation()))) &&
            ((this.invtClassification==null && other.getInvtClassification()==null) || 
             (this.invtClassification!=null &&
              this.invtClassification.equals(other.getInvtClassification()))) &&
            ((this.invtCountInterval==null && other.getInvtCountInterval()==null) || 
             (this.invtCountInterval!=null &&
              this.invtCountInterval.equals(other.getInvtCountInterval()))) &&
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              this.isAvailable.equals(other.getIsAvailable()))) &&
            ((this.isDropShipItem==null && other.getIsDropShipItem()==null) || 
             (this.isDropShipItem!=null &&
              this.isDropShipItem.equals(other.getIsDropShipItem()))) &&
            ((this.isFulfillable==null && other.getIsFulfillable()==null) || 
             (this.isFulfillable!=null &&
              this.isFulfillable.equals(other.getIsFulfillable()))) &&
            ((this.isGcoCompliant==null && other.getIsGcoCompliant()==null) || 
             (this.isGcoCompliant!=null &&
              this.isGcoCompliant.equals(other.getIsGcoCompliant()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isLotItem==null && other.getIsLotItem()==null) || 
             (this.isLotItem!=null &&
              this.isLotItem.equals(other.getIsLotItem()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.isPreferredVendor==null && other.getIsPreferredVendor()==null) || 
             (this.isPreferredVendor!=null &&
              this.isPreferredVendor.equals(other.getIsPreferredVendor()))) &&
            ((this.isSerialItem==null && other.getIsSerialItem()==null) || 
             (this.isSerialItem!=null &&
              this.isSerialItem.equals(other.getIsSerialItem()))) &&
            ((this.isSpecialOrderItem==null && other.getIsSpecialOrderItem()==null) || 
             (this.isSpecialOrderItem!=null &&
              this.isSpecialOrderItem.equals(other.getIsSpecialOrderItem()))) &&
            ((this.isSpecialWorkOrderItem==null && other.getIsSpecialWorkOrderItem()==null) || 
             (this.isSpecialWorkOrderItem!=null &&
              this.isSpecialWorkOrderItem.equals(other.getIsSpecialWorkOrderItem()))) &&
            ((this.isStorePickupAllowed==null && other.getIsStorePickupAllowed()==null) || 
             (this.isStorePickupAllowed!=null &&
              this.isStorePickupAllowed.equals(other.getIsStorePickupAllowed()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              this.issueProduct.equals(other.getIssueProduct()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.isVsoeBundle==null && other.getIsVsoeBundle()==null) || 
             (this.isVsoeBundle!=null &&
              this.isVsoeBundle.equals(other.getIsVsoeBundle()))) &&
            ((this.isWip==null && other.getIsWip()==null) || 
             (this.isWip!=null &&
              this.isWip.equals(other.getIsWip()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.itemRevenueCategory==null && other.getItemRevenueCategory()==null) || 
             (this.itemRevenueCategory!=null &&
              this.itemRevenueCategory.equals(other.getItemRevenueCategory()))) &&
            ((this.itemUrl==null && other.getItemUrl()==null) || 
             (this.itemUrl!=null &&
              this.itemUrl.equals(other.getItemUrl()))) &&
            ((this.lastInvtCountDate==null && other.getLastInvtCountDate()==null) || 
             (this.lastInvtCountDate!=null &&
              this.lastInvtCountDate.equals(other.getLastInvtCountDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastPurchasePrice==null && other.getLastPurchasePrice()==null) || 
             (this.lastPurchasePrice!=null &&
              this.lastPurchasePrice.equals(other.getLastPurchasePrice()))) &&
            ((this.lastQuantityAvailableChange==null && other.getLastQuantityAvailableChange()==null) || 
             (this.lastQuantityAvailableChange!=null &&
              this.lastQuantityAvailableChange.equals(other.getLastQuantityAvailableChange()))) &&
            ((this.leadTime==null && other.getLeadTime()==null) || 
             (this.leadTime!=null &&
              this.leadTime.equals(other.getLeadTime()))) &&
            ((this.listingDuration==null && other.getListingDuration()==null) || 
             (this.listingDuration!=null &&
              this.listingDuration.equals(other.getListingDuration()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.locationAllowStorePickup==null && other.getLocationAllowStorePickup()==null) || 
             (this.locationAllowStorePickup!=null &&
              this.locationAllowStorePickup.equals(other.getLocationAllowStorePickup()))) &&
            ((this.locationAtpLeadTime==null && other.getLocationAtpLeadTime()==null) || 
             (this.locationAtpLeadTime!=null &&
              this.locationAtpLeadTime.equals(other.getLocationAtpLeadTime()))) &&
            ((this.locationAverageCost==null && other.getLocationAverageCost()==null) || 
             (this.locationAverageCost!=null &&
              this.locationAverageCost.equals(other.getLocationAverageCost()))) &&
            ((this.locationBuildTime==null && other.getLocationBuildTime()==null) || 
             (this.locationBuildTime!=null &&
              this.locationBuildTime.equals(other.getLocationBuildTime()))) &&
            ((this.locationCost==null && other.getLocationCost()==null) || 
             (this.locationCost!=null &&
              this.locationCost.equals(other.getLocationCost()))) &&
            ((this.locationCostAccountingStatus==null && other.getLocationCostAccountingStatus()==null) || 
             (this.locationCostAccountingStatus!=null &&
              this.locationCostAccountingStatus.equals(other.getLocationCostAccountingStatus()))) &&
            ((this.locationDefaultReturnCost==null && other.getLocationDefaultReturnCost()==null) || 
             (this.locationDefaultReturnCost!=null &&
              this.locationDefaultReturnCost.equals(other.getLocationDefaultReturnCost()))) &&
            ((this.locationDemandSource==null && other.getLocationDemandSource()==null) || 
             (this.locationDemandSource!=null &&
              this.locationDemandSource.equals(other.getLocationDemandSource()))) &&
            ((this.locationDemandTimeFence==null && other.getLocationDemandTimeFence()==null) || 
             (this.locationDemandTimeFence!=null &&
              this.locationDemandTimeFence.equals(other.getLocationDemandTimeFence()))) &&
            ((this.locationFixedLotSize==null && other.getLocationFixedLotSize()==null) || 
             (this.locationFixedLotSize!=null &&
              this.locationFixedLotSize.equals(other.getLocationFixedLotSize()))) &&
            ((this.locationInventoryCostTemplate==null && other.getLocationInventoryCostTemplate()==null) || 
             (this.locationInventoryCostTemplate!=null &&
              this.locationInventoryCostTemplate.equals(other.getLocationInventoryCostTemplate()))) &&
            ((this.locationInvtClassification==null && other.getLocationInvtClassification()==null) || 
             (this.locationInvtClassification!=null &&
              this.locationInvtClassification.equals(other.getLocationInvtClassification()))) &&
            ((this.locationInvtCountInterval==null && other.getLocationInvtCountInterval()==null) || 
             (this.locationInvtCountInterval!=null &&
              this.locationInvtCountInterval.equals(other.getLocationInvtCountInterval()))) &&
            ((this.locationLastInvtCountDate==null && other.getLocationLastInvtCountDate()==null) || 
             (this.locationLastInvtCountDate!=null &&
              this.locationLastInvtCountDate.equals(other.getLocationLastInvtCountDate()))) &&
            ((this.locationLeadTime==null && other.getLocationLeadTime()==null) || 
             (this.locationLeadTime!=null &&
              this.locationLeadTime.equals(other.getLocationLeadTime()))) &&
            ((this.locationNextInvtCountDate==null && other.getLocationNextInvtCountDate()==null) || 
             (this.locationNextInvtCountDate!=null &&
              this.locationNextInvtCountDate.equals(other.getLocationNextInvtCountDate()))) &&
            ((this.locationPeriodicLotSizeDays==null && other.getLocationPeriodicLotSizeDays()==null) || 
             (this.locationPeriodicLotSizeDays!=null &&
              this.locationPeriodicLotSizeDays.equals(other.getLocationPeriodicLotSizeDays()))) &&
            ((this.locationPeriodicLotSizeType==null && other.getLocationPeriodicLotSizeType()==null) || 
             (this.locationPeriodicLotSizeType!=null &&
              this.locationPeriodicLotSizeType.equals(other.getLocationPeriodicLotSizeType()))) &&
            ((this.locationPreferredStockLevel==null && other.getLocationPreferredStockLevel()==null) || 
             (this.locationPreferredStockLevel!=null &&
              this.locationPreferredStockLevel.equals(other.getLocationPreferredStockLevel()))) &&
            ((this.locationQtyAvailForStorePickup==null && other.getLocationQtyAvailForStorePickup()==null) || 
             (this.locationQtyAvailForStorePickup!=null &&
              this.locationQtyAvailForStorePickup.equals(other.getLocationQtyAvailForStorePickup()))) &&
            ((this.locationQuantityAvailable==null && other.getLocationQuantityAvailable()==null) || 
             (this.locationQuantityAvailable!=null &&
              this.locationQuantityAvailable.equals(other.getLocationQuantityAvailable()))) &&
            ((this.locationQuantityBackOrdered==null && other.getLocationQuantityBackOrdered()==null) || 
             (this.locationQuantityBackOrdered!=null &&
              this.locationQuantityBackOrdered.equals(other.getLocationQuantityBackOrdered()))) &&
            ((this.locationQuantityCommitted==null && other.getLocationQuantityCommitted()==null) || 
             (this.locationQuantityCommitted!=null &&
              this.locationQuantityCommitted.equals(other.getLocationQuantityCommitted()))) &&
            ((this.locationQuantityInTransit==null && other.getLocationQuantityInTransit()==null) || 
             (this.locationQuantityInTransit!=null &&
              this.locationQuantityInTransit.equals(other.getLocationQuantityInTransit()))) &&
            ((this.locationQuantityOnHand==null && other.getLocationQuantityOnHand()==null) || 
             (this.locationQuantityOnHand!=null &&
              this.locationQuantityOnHand.equals(other.getLocationQuantityOnHand()))) &&
            ((this.locationQuantityOnOrder==null && other.getLocationQuantityOnOrder()==null) || 
             (this.locationQuantityOnOrder!=null &&
              this.locationQuantityOnOrder.equals(other.getLocationQuantityOnOrder()))) &&
            ((this.locationReorderPoint==null && other.getLocationReorderPoint()==null) || 
             (this.locationReorderPoint!=null &&
              this.locationReorderPoint.equals(other.getLocationReorderPoint()))) &&
            ((this.locationRescheduleInDays==null && other.getLocationRescheduleInDays()==null) || 
             (this.locationRescheduleInDays!=null &&
              this.locationRescheduleInDays.equals(other.getLocationRescheduleInDays()))) &&
            ((this.locationRescheduleOutDays==null && other.getLocationRescheduleOutDays()==null) || 
             (this.locationRescheduleOutDays!=null &&
              this.locationRescheduleOutDays.equals(other.getLocationRescheduleOutDays()))) &&
            ((this.locationSafetyStockLevel==null && other.getLocationSafetyStockLevel()==null) || 
             (this.locationSafetyStockLevel!=null &&
              this.locationSafetyStockLevel.equals(other.getLocationSafetyStockLevel()))) &&
            ((this.locationStorePickupBufferStock==null && other.getLocationStorePickupBufferStock()==null) || 
             (this.locationStorePickupBufferStock!=null &&
              this.locationStorePickupBufferStock.equals(other.getLocationStorePickupBufferStock()))) &&
            ((this.locationSupplyLotSizingMethod==null && other.getLocationSupplyLotSizingMethod()==null) || 
             (this.locationSupplyLotSizingMethod!=null &&
              this.locationSupplyLotSizingMethod.equals(other.getLocationSupplyLotSizingMethod()))) &&
            ((this.locationSupplyTimeFence==null && other.getLocationSupplyTimeFence()==null) || 
             (this.locationSupplyTimeFence!=null &&
              this.locationSupplyTimeFence.equals(other.getLocationSupplyTimeFence()))) &&
            ((this.locationSupplyType==null && other.getLocationSupplyType()==null) || 
             (this.locationSupplyType!=null &&
              this.locationSupplyType.equals(other.getLocationSupplyType()))) &&
            ((this.locationTotalValue==null && other.getLocationTotalValue()==null) || 
             (this.locationTotalValue!=null &&
              this.locationTotalValue.equals(other.getLocationTotalValue()))) &&
            ((this.locBackwardConsumptionDays==null && other.getLocBackwardConsumptionDays()==null) || 
             (this.locBackwardConsumptionDays!=null &&
              this.locBackwardConsumptionDays.equals(other.getLocBackwardConsumptionDays()))) &&
            ((this.locForwardConsumptionDays==null && other.getLocForwardConsumptionDays()==null) || 
             (this.locForwardConsumptionDays!=null &&
              this.locForwardConsumptionDays.equals(other.getLocForwardConsumptionDays()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.manufactureraddr1==null && other.getManufactureraddr1()==null) || 
             (this.manufactureraddr1!=null &&
              this.manufactureraddr1.equals(other.getManufactureraddr1()))) &&
            ((this.manufacturerCity==null && other.getManufacturerCity()==null) || 
             (this.manufacturerCity!=null &&
              this.manufacturerCity.equals(other.getManufacturerCity()))) &&
            ((this.manufacturerState==null && other.getManufacturerState()==null) || 
             (this.manufacturerState!=null &&
              this.manufacturerState.equals(other.getManufacturerState()))) &&
            ((this.manufacturerTariff==null && other.getManufacturerTariff()==null) || 
             (this.manufacturerTariff!=null &&
              this.manufacturerTariff.equals(other.getManufacturerTariff()))) &&
            ((this.manufacturerTaxId==null && other.getManufacturerTaxId()==null) || 
             (this.manufacturerTaxId!=null &&
              this.manufacturerTaxId.equals(other.getManufacturerTaxId()))) &&
            ((this.manufacturerZip==null && other.getManufacturerZip()==null) || 
             (this.manufacturerZip!=null &&
              this.manufacturerZip.equals(other.getManufacturerZip()))) &&
            ((this.manufacturingChargeItem==null && other.getManufacturingChargeItem()==null) || 
             (this.manufacturingChargeItem!=null &&
              this.manufacturingChargeItem.equals(other.getManufacturingChargeItem()))) &&
            ((this.matchBillToReceipt==null && other.getMatchBillToReceipt()==null) || 
             (this.matchBillToReceipt!=null &&
              this.matchBillToReceipt.equals(other.getMatchBillToReceipt()))) &&
            ((this.matrix==null && other.getMatrix()==null) || 
             (this.matrix!=null &&
              this.matrix.equals(other.getMatrix()))) &&
            ((this.matrixChild==null && other.getMatrixChild()==null) || 
             (this.matrixChild!=null &&
              this.matrixChild.equals(other.getMatrixChild()))) &&
            ((this.maximumQuantity==null && other.getMaximumQuantity()==null) || 
             (this.maximumQuantity!=null &&
              this.maximumQuantity.equals(other.getMaximumQuantity()))) &&
            ((this.metaTagHtml==null && other.getMetaTagHtml()==null) || 
             (this.metaTagHtml!=null &&
              this.metaTagHtml.equals(other.getMetaTagHtml()))) &&
            ((this.minimumQuantity==null && other.getMinimumQuantity()==null) || 
             (this.minimumQuantity!=null &&
              this.minimumQuantity.equals(other.getMinimumQuantity()))) &&
            ((this.mossApplies==null && other.getMossApplies()==null) || 
             (this.mossApplies!=null &&
              this.mossApplies.equals(other.getMossApplies()))) &&
            ((this.mpn==null && other.getMpn()==null) || 
             (this.mpn!=null &&
              this.mpn.equals(other.getMpn()))) &&
            ((this.multManufactureAddr==null && other.getMultManufactureAddr()==null) || 
             (this.multManufactureAddr!=null &&
              this.multManufactureAddr.equals(other.getMultManufactureAddr()))) &&
            ((this.nexTagCategory==null && other.getNexTagCategory()==null) || 
             (this.nexTagCategory!=null &&
              this.nexTagCategory.equals(other.getNexTagCategory()))) &&
            ((this.nexTagProductFeed==null && other.getNexTagProductFeed()==null) || 
             (this.nexTagProductFeed!=null &&
              this.nexTagProductFeed.equals(other.getNexTagProductFeed()))) &&
            ((this.nextInvtCountDate==null && other.getNextInvtCountDate()==null) || 
             (this.nextInvtCountDate!=null &&
              this.nextInvtCountDate.equals(other.getNextInvtCountDate()))) &&
            ((this.numActiveListings==null && other.getNumActiveListings()==null) || 
             (this.numActiveListings!=null &&
              this.numActiveListings.equals(other.getNumActiveListings()))) &&
            ((this.numberAllowedDownloads==null && other.getNumberAllowedDownloads()==null) || 
             (this.numberAllowedDownloads!=null &&
              this.numberAllowedDownloads.equals(other.getNumberAllowedDownloads()))) &&
            ((this.numCurrentlyListed==null && other.getNumCurrentlyListed()==null) || 
             (this.numCurrentlyListed!=null &&
              this.numCurrentlyListed.equals(other.getNumCurrentlyListed()))) &&
            ((this.obsoleteDate==null && other.getObsoleteDate()==null) || 
             (this.obsoleteDate!=null &&
              this.obsoleteDate.equals(other.getObsoleteDate()))) &&
            ((this.obsoleteRevision==null && other.getObsoleteRevision()==null) || 
             (this.obsoleteRevision!=null &&
              this.obsoleteRevision.equals(other.getObsoleteRevision()))) &&
            ((this.offerSupport==null && other.getOfferSupport()==null) || 
             (this.offerSupport!=null &&
              this.offerSupport.equals(other.getOfferSupport()))) &&
            ((this.onlineCustomerPrice==null && other.getOnlineCustomerPrice()==null) || 
             (this.onlineCustomerPrice!=null &&
              this.onlineCustomerPrice.equals(other.getOnlineCustomerPrice()))) &&
            ((this.onSpecial==null && other.getOnSpecial()==null) || 
             (this.onSpecial!=null &&
              this.onSpecial.equals(other.getOnSpecial()))) &&
            ((this.otherVendor==null && other.getOtherVendor()==null) || 
             (this.otherVendor!=null &&
              this.otherVendor.equals(other.getOtherVendor()))) &&
            ((this.outOfStockBehavior==null && other.getOutOfStockBehavior()==null) || 
             (this.outOfStockBehavior!=null &&
              this.outOfStockBehavior.equals(other.getOutOfStockBehavior()))) &&
            ((this.overallQuantityPricingType==null && other.getOverallQuantityPricingType()==null) || 
             (this.overallQuantityPricingType!=null &&
              this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType()))) &&
            ((this.overheadType==null && other.getOverheadType()==null) || 
             (this.overheadType!=null &&
              this.overheadType.equals(other.getOverheadType()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              this.pageTitle.equals(other.getPageTitle()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.periodicLotSizeDays==null && other.getPeriodicLotSizeDays()==null) || 
             (this.periodicLotSizeDays!=null &&
              this.periodicLotSizeDays.equals(other.getPeriodicLotSizeDays()))) &&
            ((this.periodicLotSizeType==null && other.getPeriodicLotSizeType()==null) || 
             (this.periodicLotSizeType!=null &&
              this.periodicLotSizeType.equals(other.getPeriodicLotSizeType()))) &&
            ((this.preferenceCriterion==null && other.getPreferenceCriterion()==null) || 
             (this.preferenceCriterion!=null &&
              this.preferenceCriterion.equals(other.getPreferenceCriterion()))) &&
            ((this.preferredBin==null && other.getPreferredBin()==null) || 
             (this.preferredBin!=null &&
              this.preferredBin.equals(other.getPreferredBin()))) &&
            ((this.preferredLocation==null && other.getPreferredLocation()==null) || 
             (this.preferredLocation!=null &&
              this.preferredLocation.equals(other.getPreferredLocation()))) &&
            ((this.preferredStockLevel==null && other.getPreferredStockLevel()==null) || 
             (this.preferredStockLevel!=null &&
              this.preferredStockLevel.equals(other.getPreferredStockLevel()))) &&
            ((this.preferredStockLevelDays==null && other.getPreferredStockLevelDays()==null) || 
             (this.preferredStockLevelDays!=null &&
              this.preferredStockLevelDays.equals(other.getPreferredStockLevelDays()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.pricesIncludeTax==null && other.getPricesIncludeTax()==null) || 
             (this.pricesIncludeTax!=null &&
              this.pricesIncludeTax.equals(other.getPricesIncludeTax()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              this.pricingGroup.equals(other.getPricingGroup()))) &&
            ((this.primaryCategory==null && other.getPrimaryCategory()==null) || 
             (this.primaryCategory!=null &&
              this.primaryCategory.equals(other.getPrimaryCategory()))) &&
            ((this.purchaseOrderAmount==null && other.getPurchaseOrderAmount()==null) || 
             (this.purchaseOrderAmount!=null &&
              this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount()))) &&
            ((this.purchaseOrderQuantity==null && other.getPurchaseOrderQuantity()==null) || 
             (this.purchaseOrderQuantity!=null &&
              this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity()))) &&
            ((this.purchaseOrderQuantityDiff==null && other.getPurchaseOrderQuantityDiff()==null) || 
             (this.purchaseOrderQuantityDiff!=null &&
              this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff()))) &&
            ((this.purchaseUnit==null && other.getPurchaseUnit()==null) || 
             (this.purchaseUnit!=null &&
              this.purchaseUnit.equals(other.getPurchaseUnit()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.quantityOnOrder==null && other.getQuantityOnOrder()==null) || 
             (this.quantityOnOrder!=null &&
              this.quantityOnOrder.equals(other.getQuantityOnOrder()))) &&
            ((this.quantityPricingSchedule==null && other.getQuantityPricingSchedule()==null) || 
             (this.quantityPricingSchedule!=null &&
              this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule()))) &&
            ((this.receiptAmount==null && other.getReceiptAmount()==null) || 
             (this.receiptAmount!=null &&
              this.receiptAmount.equals(other.getReceiptAmount()))) &&
            ((this.receiptQuantity==null && other.getReceiptQuantity()==null) || 
             (this.receiptQuantity!=null &&
              this.receiptQuantity.equals(other.getReceiptQuantity()))) &&
            ((this.receiptQuantityDiff==null && other.getReceiptQuantityDiff()==null) || 
             (this.receiptQuantityDiff!=null &&
              this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff()))) &&
            ((this.reorderMultiple==null && other.getReorderMultiple()==null) || 
             (this.reorderMultiple!=null &&
              this.reorderMultiple.equals(other.getReorderMultiple()))) &&
            ((this.reorderPoint==null && other.getReorderPoint()==null) || 
             (this.reorderPoint!=null &&
              this.reorderPoint.equals(other.getReorderPoint()))) &&
            ((this.rescheduleInDays==null && other.getRescheduleInDays()==null) || 
             (this.rescheduleInDays!=null &&
              this.rescheduleInDays.equals(other.getRescheduleInDays()))) &&
            ((this.rescheduleOutDays==null && other.getRescheduleOutDays()==null) || 
             (this.rescheduleOutDays!=null &&
              this.rescheduleOutDays.equals(other.getRescheduleOutDays()))) &&
            ((this.reservePrice==null && other.getReservePrice()==null) || 
             (this.reservePrice!=null &&
              this.reservePrice.equals(other.getReservePrice()))) &&
            ((this.revenueAllocationGroup==null && other.getRevenueAllocationGroup()==null) || 
             (this.revenueAllocationGroup!=null &&
              this.revenueAllocationGroup.equals(other.getRevenueAllocationGroup()))) &&
            ((this.revenueRecognitionRule==null && other.getRevenueRecognitionRule()==null) || 
             (this.revenueRecognitionRule!=null &&
              this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule()))) &&
            ((this.revRecForecastRule==null && other.getRevRecForecastRule()==null) || 
             (this.revRecForecastRule!=null &&
              this.revRecForecastRule.equals(other.getRevRecForecastRule()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.roundUpAsComponent==null && other.getRoundUpAsComponent()==null) || 
             (this.roundUpAsComponent!=null &&
              this.roundUpAsComponent.equals(other.getRoundUpAsComponent()))) &&
            ((this.safetyStockLevel==null && other.getSafetyStockLevel()==null) || 
             (this.safetyStockLevel!=null &&
              this.safetyStockLevel.equals(other.getSafetyStockLevel()))) &&
            ((this.safetyStockLevelDays==null && other.getSafetyStockLevelDays()==null) || 
             (this.safetyStockLevelDays!=null &&
              this.safetyStockLevelDays.equals(other.getSafetyStockLevelDays()))) &&
            ((this.salesDescription==null && other.getSalesDescription()==null) || 
             (this.salesDescription!=null &&
              this.salesDescription.equals(other.getSalesDescription()))) &&
            ((this.saleUnit==null && other.getSaleUnit()==null) || 
             (this.saleUnit!=null &&
              this.saleUnit.equals(other.getSaleUnit()))) &&
            ((this.sameAsPrimaryBookAmortization==null && other.getSameAsPrimaryBookAmortization()==null) || 
             (this.sameAsPrimaryBookAmortization!=null &&
              this.sameAsPrimaryBookAmortization.equals(other.getSameAsPrimaryBookAmortization()))) &&
            ((this.sameAsPrimaryBookRevRec==null && other.getSameAsPrimaryBookRevRec()==null) || 
             (this.sameAsPrimaryBookRevRec!=null &&
              this.sameAsPrimaryBookRevRec.equals(other.getSameAsPrimaryBookRevRec()))) &&
            ((this.scheduleBCode==null && other.getScheduleBCode()==null) || 
             (this.scheduleBCode!=null &&
              this.scheduleBCode.equals(other.getScheduleBCode()))) &&
            ((this.scheduleBNumber==null && other.getScheduleBNumber()==null) || 
             (this.scheduleBNumber!=null &&
              this.scheduleBNumber.equals(other.getScheduleBNumber()))) &&
            ((this.scheduleBQuantity==null && other.getScheduleBQuantity()==null) || 
             (this.scheduleBQuantity!=null &&
              this.scheduleBQuantity.equals(other.getScheduleBQuantity()))) &&
            ((this.searchKeywords==null && other.getSearchKeywords()==null) || 
             (this.searchKeywords!=null &&
              this.searchKeywords.equals(other.getSearchKeywords()))) &&
            ((this.seasonalDemand==null && other.getSeasonalDemand()==null) || 
             (this.seasonalDemand!=null &&
              this.seasonalDemand.equals(other.getSeasonalDemand()))) &&
            ((this.sellOnEBay==null && other.getSellOnEBay()==null) || 
             (this.sellOnEBay!=null &&
              this.sellOnEBay.equals(other.getSellOnEBay()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.serialNumberLocation==null && other.getSerialNumberLocation()==null) || 
             (this.serialNumberLocation!=null &&
              this.serialNumberLocation.equals(other.getSerialNumberLocation()))) &&
            ((this.shipIndividually==null && other.getShipIndividually()==null) || 
             (this.shipIndividually!=null &&
              this.shipIndividually.equals(other.getShipIndividually()))) &&
            ((this.shipPackage==null && other.getShipPackage()==null) || 
             (this.shipPackage!=null &&
              this.shipPackage.equals(other.getShipPackage()))) &&
            ((this.shippingCarrier==null && other.getShippingCarrier()==null) || 
             (this.shippingCarrier!=null &&
              this.shippingCarrier.equals(other.getShippingCarrier()))) &&
            ((this.shippingRate==null && other.getShippingRate()==null) || 
             (this.shippingRate!=null &&
              this.shippingRate.equals(other.getShippingRate()))) &&
            ((this.shoppingDotComCategory==null && other.getShoppingDotComCategory()==null) || 
             (this.shoppingDotComCategory!=null &&
              this.shoppingDotComCategory.equals(other.getShoppingDotComCategory()))) &&
            ((this.shoppingProductFeed==null && other.getShoppingProductFeed()==null) || 
             (this.shoppingProductFeed!=null &&
              this.shoppingProductFeed.equals(other.getShoppingProductFeed()))) &&
            ((this.shopzillaCategoryId==null && other.getShopzillaCategoryId()==null) || 
             (this.shopzillaCategoryId!=null &&
              this.shopzillaCategoryId.equals(other.getShopzillaCategoryId()))) &&
            ((this.shopzillaProductFeed==null && other.getShopzillaProductFeed()==null) || 
             (this.shopzillaProductFeed!=null &&
              this.shopzillaProductFeed.equals(other.getShopzillaProductFeed()))) &&
            ((this.sitemapPriority==null && other.getSitemapPriority()==null) || 
             (this.sitemapPriority!=null &&
              this.sitemapPriority.equals(other.getSitemapPriority()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor()))) &&
            ((this.startingPrice==null && other.getStartingPrice()==null) || 
             (this.startingPrice!=null &&
              this.startingPrice.equals(other.getStartingPrice()))) &&
            ((this.stockDescription==null && other.getStockDescription()==null) || 
             (this.stockDescription!=null &&
              this.stockDescription.equals(other.getStockDescription()))) &&
            ((this.stockUnit==null && other.getStockUnit()==null) || 
             (this.stockUnit!=null &&
              this.stockUnit.equals(other.getStockUnit()))) &&
            ((this.storeDescription==null && other.getStoreDescription()==null) || 
             (this.storeDescription!=null &&
              this.storeDescription.equals(other.getStoreDescription()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              this.subType.equals(other.getSubType()))) &&
            ((this.supplyLotSizingMethod==null && other.getSupplyLotSizingMethod()==null) || 
             (this.supplyLotSizingMethod!=null &&
              this.supplyLotSizingMethod.equals(other.getSupplyLotSizingMethod()))) &&
            ((this.supplyReplenishmentMethod==null && other.getSupplyReplenishmentMethod()==null) || 
             (this.supplyReplenishmentMethod!=null &&
              this.supplyReplenishmentMethod.equals(other.getSupplyReplenishmentMethod()))) &&
            ((this.supplyTimeFence==null && other.getSupplyTimeFence()==null) || 
             (this.supplyTimeFence!=null &&
              this.supplyTimeFence.equals(other.getSupplyTimeFence()))) &&
            ((this.supplyType==null && other.getSupplyType()==null) || 
             (this.supplyType!=null &&
              this.supplyType.equals(other.getSupplyType()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
            ((this.thumbnailUrl==null && other.getThumbnailUrl()==null) || 
             (this.thumbnailUrl!=null &&
              this.thumbnailUrl.equals(other.getThumbnailUrl()))) &&
            ((this.totalValue==null && other.getTotalValue()==null) || 
             (this.totalValue!=null &&
              this.totalValue.equals(other.getTotalValue()))) &&
            ((this.trackLandedCost==null && other.getTrackLandedCost()==null) || 
             (this.trackLandedCost!=null &&
              this.trackLandedCost.equals(other.getTrackLandedCost()))) &&
            ((this.transferPrice==null && other.getTransferPrice()==null) || 
             (this.transferPrice!=null &&
              this.transferPrice.equals(other.getTransferPrice()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType()))) &&
            ((this.upcCode==null && other.getUpcCode()==null) || 
             (this.upcCode!=null &&
              this.upcCode.equals(other.getUpcCode()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              this.urlComponent.equals(other.getUrlComponent()))) &&
            ((this.useBins==null && other.getUseBins()==null) || 
             (this.useBins!=null &&
              this.useBins.equals(other.getUseBins()))) &&
            ((this.useComponentYield==null && other.getUseComponentYield()==null) || 
             (this.useComponentYield!=null &&
              this.useComponentYield.equals(other.getUseComponentYield()))) &&
            ((this.useMarginalRates==null && other.getUseMarginalRates()==null) || 
             (this.useMarginalRates!=null &&
              this.useMarginalRates.equals(other.getUseMarginalRates()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.vendorCode==null && other.getVendorCode()==null) || 
             (this.vendorCode!=null &&
              this.vendorCode.equals(other.getVendorCode()))) &&
            ((this.vendorCost==null && other.getVendorCost()==null) || 
             (this.vendorCost!=null &&
              this.vendorCost.equals(other.getVendorCost()))) &&
            ((this.vendorCostEntered==null && other.getVendorCostEntered()==null) || 
             (this.vendorCostEntered!=null &&
              this.vendorCostEntered.equals(other.getVendorCostEntered()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName()))) &&
            ((this.vendorPriceCurrency==null && other.getVendorPriceCurrency()==null) || 
             (this.vendorPriceCurrency!=null &&
              this.vendorPriceCurrency.equals(other.getVendorPriceCurrency()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.vsoeSopGroup==null && other.getVsoeSopGroup()==null) || 
             (this.vsoeSopGroup!=null &&
              this.vsoeSopGroup.equals(other.getVsoeSopGroup()))) &&
            ((this.webSite==null && other.getWebSite()==null) || 
             (this.webSite!=null &&
              this.webSite.equals(other.getWebSite()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.yahooProductFeed==null && other.getYahooProductFeed()==null) || 
             (this.yahooProductFeed!=null &&
              this.yahooProductFeed.equals(other.getYahooProductFeed()))) &&
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
        if (getAccBookRevRecForecastRule() != null) {
            _hashCode += getAccBookRevRecForecastRule().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountingBook() != null) {
            _hashCode += getAccountingBook().hashCode();
        }
        if (getAccountingBookAmortization() != null) {
            _hashCode += getAccountingBookAmortization().hashCode();
        }
        if (getAccountingBookCreatePlansOn() != null) {
            _hashCode += getAccountingBookCreatePlansOn().hashCode();
        }
        if (getAccountingBookRevRecRule() != null) {
            _hashCode += getAccountingBookRevRecRule().hashCode();
        }
        if (getAccountingBookRevRecSchedule() != null) {
            _hashCode += getAccountingBookRevRecSchedule().hashCode();
        }
        if (getAllowedShippingMethod() != null) {
            _hashCode += getAllowedShippingMethod().hashCode();
        }
        if (getAlternateDemandSourceItem() != null) {
            _hashCode += getAlternateDemandSourceItem().hashCode();
        }
        if (getAtpLeadTime() != null) {
            _hashCode += getAtpLeadTime().hashCode();
        }
        if (getAtpMethod() != null) {
            _hashCode += getAtpMethod().hashCode();
        }
        if (getAutoLeadTime() != null) {
            _hashCode += getAutoLeadTime().hashCode();
        }
        if (getAutoPreferredStockLevel() != null) {
            _hashCode += getAutoPreferredStockLevel().hashCode();
        }
        if (getAutoReorderPoint() != null) {
            _hashCode += getAutoReorderPoint().hashCode();
        }
        if (getAvailableToPartners() != null) {
            _hashCode += getAvailableToPartners().hashCode();
        }
        if (getAverageCost() != null) {
            _hashCode += getAverageCost().hashCode();
        }
        if (getBackwardConsumptionDays() != null) {
            _hashCode += getBackwardConsumptionDays().hashCode();
        }
        if (getBinNumber() != null) {
            _hashCode += getBinNumber().hashCode();
        }
        if (getBinOnHandAvail() != null) {
            _hashCode += getBinOnHandAvail().hashCode();
        }
        if (getBinOnHandCount() != null) {
            _hashCode += getBinOnHandCount().hashCode();
        }
        if (getBomQuantity() != null) {
            _hashCode += getBomQuantity().hashCode();
        }
        if (getBuildEntireAssembly() != null) {
            _hashCode += getBuildEntireAssembly().hashCode();
        }
        if (getBuildTime() != null) {
            _hashCode += getBuildTime().hashCode();
        }
        if (getBuyItNowPrice() != null) {
            _hashCode += getBuyItNowPrice().hashCode();
        }
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getComponent() != null) {
            _hashCode += getComponent().hashCode();
        }
        if (getComponentOf() != null) {
            _hashCode += getComponentOf().hashCode();
        }
        if (getComponentYield() != null) {
            _hashCode += getComponentYield().hashCode();
        }
        if (getContingentRevenueHandling() != null) {
            _hashCode += getContingentRevenueHandling().hashCode();
        }
        if (getCopyDescription() != null) {
            _hashCode += getCopyDescription().hashCode();
        }
        if (getCorrelatedItem() != null) {
            _hashCode += getCorrelatedItem().hashCode();
        }
        if (getCorrelatedItemCorrelation() != null) {
            _hashCode += getCorrelatedItemCorrelation().hashCode();
        }
        if (getCorrelatedItemCount() != null) {
            _hashCode += getCorrelatedItemCount().hashCode();
        }
        if (getCorrelatedItemLift() != null) {
            _hashCode += getCorrelatedItemLift().hashCode();
        }
        if (getCorrelatedItemPurchaseRate() != null) {
            _hashCode += getCorrelatedItemPurchaseRate().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCostAccountingStatus() != null) {
            _hashCode += getCostAccountingStatus().hashCode();
        }
        if (getCostCategory() != null) {
            _hashCode += getCostCategory().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCostingMethod() != null) {
            _hashCode += getCostingMethod().hashCode();
        }
        if (getCountryOfManufacture() != null) {
            _hashCode += getCountryOfManufacture().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCreateJob() != null) {
            _hashCode += getCreateJob().hashCode();
        }
        if (getCreateRevenuePlansOn() != null) {
            _hashCode += getCreateRevenuePlansOn().hashCode();
        }
        if (getDateViewed() != null) {
            _hashCode += getDateViewed().hashCode();
        }
        if (getDaysBeforeExpiration() != null) {
            _hashCode += getDaysBeforeExpiration().hashCode();
        }
        if (getDefaultReturnCost() != null) {
            _hashCode += getDefaultReturnCost().hashCode();
        }
        if (getDefaultShippingMethod() != null) {
            _hashCode += getDefaultShippingMethod().hashCode();
        }
        if (getDeferRevRec() != null) {
            _hashCode += getDeferRevRec().hashCode();
        }
        if (getDemandModifier() != null) {
            _hashCode += getDemandModifier().hashCode();
        }
        if (getDemandSource() != null) {
            _hashCode += getDemandSource().hashCode();
        }
        if (getDemandTimeFence() != null) {
            _hashCode += getDemandTimeFence().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDirectRevenuePosting() != null) {
            _hashCode += getDirectRevenuePosting().hashCode();
        }
        if (getDisplayIneBayStore() != null) {
            _hashCode += getDisplayIneBayStore().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDistributionCategory() != null) {
            _hashCode += getDistributionCategory().hashCode();
        }
        if (getDistributionNetwork() != null) {
            _hashCode += getDistributionNetwork().hashCode();
        }
        if (getDontShowPrice() != null) {
            _hashCode += getDontShowPrice().hashCode();
        }
        if (getEBayItemDescription() != null) {
            _hashCode += getEBayItemDescription().hashCode();
        }
        if (getEBayItemSubtitle() != null) {
            _hashCode += getEBayItemSubtitle().hashCode();
        }
        if (getEBayItemTitle() != null) {
            _hashCode += getEBayItemTitle().hashCode();
        }
        if (getEbayRelistingOption() != null) {
            _hashCode += getEbayRelistingOption().hashCode();
        }
        if (getEffectiveBomControl() != null) {
            _hashCode += getEffectiveBomControl().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getEffectiveRevision() != null) {
            _hashCode += getEffectiveRevision().hashCode();
        }
        if (getEndAuctionsWhenOutOfStock() != null) {
            _hashCode += getEndAuctionsWhenOutOfStock().hashCode();
        }
        if (getExcludeFromSitemap() != null) {
            _hashCode += getExcludeFromSitemap().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFeaturedDescription() != null) {
            _hashCode += getFeaturedDescription().hashCode();
        }
        if (getFeedDescription() != null) {
            _hashCode += getFeedDescription().hashCode();
        }
        if (getFeedName() != null) {
            _hashCode += getFeedName().hashCode();
        }
        if (getFixedLotSize() != null) {
            _hashCode += getFixedLotSize().hashCode();
        }
        if (getForwardConsumptionDays() != null) {
            _hashCode += getForwardConsumptionDays().hashCode();
        }
        if (getFraudRisk() != null) {
            _hashCode += getFraudRisk().hashCode();
        }
        if (getFroogleProductFeed() != null) {
            _hashCode += getFroogleProductFeed().hashCode();
        }
        if (getFxCost() != null) {
            _hashCode += getFxCost().hashCode();
        }
        if (getGenerateAccruals() != null) {
            _hashCode += getGenerateAccruals().hashCode();
        }
        if (getGiftCertAuthCode() != null) {
            _hashCode += getGiftCertAuthCode().hashCode();
        }
        if (getGiftCertEmail() != null) {
            _hashCode += getGiftCertEmail().hashCode();
        }
        if (getGiftCertExpDate() != null) {
            _hashCode += getGiftCertExpDate().hashCode();
        }
        if (getGiftCertFrom() != null) {
            _hashCode += getGiftCertFrom().hashCode();
        }
        if (getGiftCertMsg() != null) {
            _hashCode += getGiftCertMsg().hashCode();
        }
        if (getGiftCertOrigAmt() != null) {
            _hashCode += getGiftCertOrigAmt().hashCode();
        }
        if (getGiftCertRecipient() != null) {
            _hashCode += getGiftCertRecipient().hashCode();
        }
        if (getHierarchyNode() != null) {
            _hashCode += getHierarchyNode().hashCode();
        }
        if (getHierarchyVersion() != null) {
            _hashCode += getHierarchyVersion().hashCode();
        }
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getInventoryLocation() != null) {
            _hashCode += getInventoryLocation().hashCode();
        }
        if (getInvtClassification() != null) {
            _hashCode += getInvtClassification().hashCode();
        }
        if (getInvtCountInterval() != null) {
            _hashCode += getInvtCountInterval().hashCode();
        }
        if (getIsAvailable() != null) {
            _hashCode += getIsAvailable().hashCode();
        }
        if (getIsDropShipItem() != null) {
            _hashCode += getIsDropShipItem().hashCode();
        }
        if (getIsFulfillable() != null) {
            _hashCode += getIsFulfillable().hashCode();
        }
        if (getIsGcoCompliant() != null) {
            _hashCode += getIsGcoCompliant().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsLotItem() != null) {
            _hashCode += getIsLotItem().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getIsPreferredVendor() != null) {
            _hashCode += getIsPreferredVendor().hashCode();
        }
        if (getIsSerialItem() != null) {
            _hashCode += getIsSerialItem().hashCode();
        }
        if (getIsSpecialOrderItem() != null) {
            _hashCode += getIsSpecialOrderItem().hashCode();
        }
        if (getIsSpecialWorkOrderItem() != null) {
            _hashCode += getIsSpecialWorkOrderItem().hashCode();
        }
        if (getIsStorePickupAllowed() != null) {
            _hashCode += getIsStorePickupAllowed().hashCode();
        }
        if (getIssueProduct() != null) {
            _hashCode += getIssueProduct().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getIsVsoeBundle() != null) {
            _hashCode += getIsVsoeBundle().hashCode();
        }
        if (getIsWip() != null) {
            _hashCode += getIsWip().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getItemRevenueCategory() != null) {
            _hashCode += getItemRevenueCategory().hashCode();
        }
        if (getItemUrl() != null) {
            _hashCode += getItemUrl().hashCode();
        }
        if (getLastInvtCountDate() != null) {
            _hashCode += getLastInvtCountDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastPurchasePrice() != null) {
            _hashCode += getLastPurchasePrice().hashCode();
        }
        if (getLastQuantityAvailableChange() != null) {
            _hashCode += getLastQuantityAvailableChange().hashCode();
        }
        if (getLeadTime() != null) {
            _hashCode += getLeadTime().hashCode();
        }
        if (getListingDuration() != null) {
            _hashCode += getListingDuration().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLocationAllowStorePickup() != null) {
            _hashCode += getLocationAllowStorePickup().hashCode();
        }
        if (getLocationAtpLeadTime() != null) {
            _hashCode += getLocationAtpLeadTime().hashCode();
        }
        if (getLocationAverageCost() != null) {
            _hashCode += getLocationAverageCost().hashCode();
        }
        if (getLocationBuildTime() != null) {
            _hashCode += getLocationBuildTime().hashCode();
        }
        if (getLocationCost() != null) {
            _hashCode += getLocationCost().hashCode();
        }
        if (getLocationCostAccountingStatus() != null) {
            _hashCode += getLocationCostAccountingStatus().hashCode();
        }
        if (getLocationDefaultReturnCost() != null) {
            _hashCode += getLocationDefaultReturnCost().hashCode();
        }
        if (getLocationDemandSource() != null) {
            _hashCode += getLocationDemandSource().hashCode();
        }
        if (getLocationDemandTimeFence() != null) {
            _hashCode += getLocationDemandTimeFence().hashCode();
        }
        if (getLocationFixedLotSize() != null) {
            _hashCode += getLocationFixedLotSize().hashCode();
        }
        if (getLocationInventoryCostTemplate() != null) {
            _hashCode += getLocationInventoryCostTemplate().hashCode();
        }
        if (getLocationInvtClassification() != null) {
            _hashCode += getLocationInvtClassification().hashCode();
        }
        if (getLocationInvtCountInterval() != null) {
            _hashCode += getLocationInvtCountInterval().hashCode();
        }
        if (getLocationLastInvtCountDate() != null) {
            _hashCode += getLocationLastInvtCountDate().hashCode();
        }
        if (getLocationLeadTime() != null) {
            _hashCode += getLocationLeadTime().hashCode();
        }
        if (getLocationNextInvtCountDate() != null) {
            _hashCode += getLocationNextInvtCountDate().hashCode();
        }
        if (getLocationPeriodicLotSizeDays() != null) {
            _hashCode += getLocationPeriodicLotSizeDays().hashCode();
        }
        if (getLocationPeriodicLotSizeType() != null) {
            _hashCode += getLocationPeriodicLotSizeType().hashCode();
        }
        if (getLocationPreferredStockLevel() != null) {
            _hashCode += getLocationPreferredStockLevel().hashCode();
        }
        if (getLocationQtyAvailForStorePickup() != null) {
            _hashCode += getLocationQtyAvailForStorePickup().hashCode();
        }
        if (getLocationQuantityAvailable() != null) {
            _hashCode += getLocationQuantityAvailable().hashCode();
        }
        if (getLocationQuantityBackOrdered() != null) {
            _hashCode += getLocationQuantityBackOrdered().hashCode();
        }
        if (getLocationQuantityCommitted() != null) {
            _hashCode += getLocationQuantityCommitted().hashCode();
        }
        if (getLocationQuantityInTransit() != null) {
            _hashCode += getLocationQuantityInTransit().hashCode();
        }
        if (getLocationQuantityOnHand() != null) {
            _hashCode += getLocationQuantityOnHand().hashCode();
        }
        if (getLocationQuantityOnOrder() != null) {
            _hashCode += getLocationQuantityOnOrder().hashCode();
        }
        if (getLocationReorderPoint() != null) {
            _hashCode += getLocationReorderPoint().hashCode();
        }
        if (getLocationRescheduleInDays() != null) {
            _hashCode += getLocationRescheduleInDays().hashCode();
        }
        if (getLocationRescheduleOutDays() != null) {
            _hashCode += getLocationRescheduleOutDays().hashCode();
        }
        if (getLocationSafetyStockLevel() != null) {
            _hashCode += getLocationSafetyStockLevel().hashCode();
        }
        if (getLocationStorePickupBufferStock() != null) {
            _hashCode += getLocationStorePickupBufferStock().hashCode();
        }
        if (getLocationSupplyLotSizingMethod() != null) {
            _hashCode += getLocationSupplyLotSizingMethod().hashCode();
        }
        if (getLocationSupplyTimeFence() != null) {
            _hashCode += getLocationSupplyTimeFence().hashCode();
        }
        if (getLocationSupplyType() != null) {
            _hashCode += getLocationSupplyType().hashCode();
        }
        if (getLocationTotalValue() != null) {
            _hashCode += getLocationTotalValue().hashCode();
        }
        if (getLocBackwardConsumptionDays() != null) {
            _hashCode += getLocBackwardConsumptionDays().hashCode();
        }
        if (getLocForwardConsumptionDays() != null) {
            _hashCode += getLocForwardConsumptionDays().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getManufactureraddr1() != null) {
            _hashCode += getManufactureraddr1().hashCode();
        }
        if (getManufacturerCity() != null) {
            _hashCode += getManufacturerCity().hashCode();
        }
        if (getManufacturerState() != null) {
            _hashCode += getManufacturerState().hashCode();
        }
        if (getManufacturerTariff() != null) {
            _hashCode += getManufacturerTariff().hashCode();
        }
        if (getManufacturerTaxId() != null) {
            _hashCode += getManufacturerTaxId().hashCode();
        }
        if (getManufacturerZip() != null) {
            _hashCode += getManufacturerZip().hashCode();
        }
        if (getManufacturingChargeItem() != null) {
            _hashCode += getManufacturingChargeItem().hashCode();
        }
        if (getMatchBillToReceipt() != null) {
            _hashCode += getMatchBillToReceipt().hashCode();
        }
        if (getMatrix() != null) {
            _hashCode += getMatrix().hashCode();
        }
        if (getMatrixChild() != null) {
            _hashCode += getMatrixChild().hashCode();
        }
        if (getMaximumQuantity() != null) {
            _hashCode += getMaximumQuantity().hashCode();
        }
        if (getMetaTagHtml() != null) {
            _hashCode += getMetaTagHtml().hashCode();
        }
        if (getMinimumQuantity() != null) {
            _hashCode += getMinimumQuantity().hashCode();
        }
        if (getMossApplies() != null) {
            _hashCode += getMossApplies().hashCode();
        }
        if (getMpn() != null) {
            _hashCode += getMpn().hashCode();
        }
        if (getMultManufactureAddr() != null) {
            _hashCode += getMultManufactureAddr().hashCode();
        }
        if (getNexTagCategory() != null) {
            _hashCode += getNexTagCategory().hashCode();
        }
        if (getNexTagProductFeed() != null) {
            _hashCode += getNexTagProductFeed().hashCode();
        }
        if (getNextInvtCountDate() != null) {
            _hashCode += getNextInvtCountDate().hashCode();
        }
        if (getNumActiveListings() != null) {
            _hashCode += getNumActiveListings().hashCode();
        }
        if (getNumberAllowedDownloads() != null) {
            _hashCode += getNumberAllowedDownloads().hashCode();
        }
        if (getNumCurrentlyListed() != null) {
            _hashCode += getNumCurrentlyListed().hashCode();
        }
        if (getObsoleteDate() != null) {
            _hashCode += getObsoleteDate().hashCode();
        }
        if (getObsoleteRevision() != null) {
            _hashCode += getObsoleteRevision().hashCode();
        }
        if (getOfferSupport() != null) {
            _hashCode += getOfferSupport().hashCode();
        }
        if (getOnlineCustomerPrice() != null) {
            _hashCode += getOnlineCustomerPrice().hashCode();
        }
        if (getOnSpecial() != null) {
            _hashCode += getOnSpecial().hashCode();
        }
        if (getOtherVendor() != null) {
            _hashCode += getOtherVendor().hashCode();
        }
        if (getOutOfStockBehavior() != null) {
            _hashCode += getOutOfStockBehavior().hashCode();
        }
        if (getOverallQuantityPricingType() != null) {
            _hashCode += getOverallQuantityPricingType().hashCode();
        }
        if (getOverheadType() != null) {
            _hashCode += getOverheadType().hashCode();
        }
        if (getPageTitle() != null) {
            _hashCode += getPageTitle().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPeriodicLotSizeDays() != null) {
            _hashCode += getPeriodicLotSizeDays().hashCode();
        }
        if (getPeriodicLotSizeType() != null) {
            _hashCode += getPeriodicLotSizeType().hashCode();
        }
        if (getPreferenceCriterion() != null) {
            _hashCode += getPreferenceCriterion().hashCode();
        }
        if (getPreferredBin() != null) {
            _hashCode += getPreferredBin().hashCode();
        }
        if (getPreferredLocation() != null) {
            _hashCode += getPreferredLocation().hashCode();
        }
        if (getPreferredStockLevel() != null) {
            _hashCode += getPreferredStockLevel().hashCode();
        }
        if (getPreferredStockLevelDays() != null) {
            _hashCode += getPreferredStockLevelDays().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPricesIncludeTax() != null) {
            _hashCode += getPricesIncludeTax().hashCode();
        }
        if (getPricingGroup() != null) {
            _hashCode += getPricingGroup().hashCode();
        }
        if (getPrimaryCategory() != null) {
            _hashCode += getPrimaryCategory().hashCode();
        }
        if (getPurchaseOrderAmount() != null) {
            _hashCode += getPurchaseOrderAmount().hashCode();
        }
        if (getPurchaseOrderQuantity() != null) {
            _hashCode += getPurchaseOrderQuantity().hashCode();
        }
        if (getPurchaseOrderQuantityDiff() != null) {
            _hashCode += getPurchaseOrderQuantityDiff().hashCode();
        }
        if (getPurchaseUnit() != null) {
            _hashCode += getPurchaseUnit().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getQuantityOnOrder() != null) {
            _hashCode += getQuantityOnOrder().hashCode();
        }
        if (getQuantityPricingSchedule() != null) {
            _hashCode += getQuantityPricingSchedule().hashCode();
        }
        if (getReceiptAmount() != null) {
            _hashCode += getReceiptAmount().hashCode();
        }
        if (getReceiptQuantity() != null) {
            _hashCode += getReceiptQuantity().hashCode();
        }
        if (getReceiptQuantityDiff() != null) {
            _hashCode += getReceiptQuantityDiff().hashCode();
        }
        if (getReorderMultiple() != null) {
            _hashCode += getReorderMultiple().hashCode();
        }
        if (getReorderPoint() != null) {
            _hashCode += getReorderPoint().hashCode();
        }
        if (getRescheduleInDays() != null) {
            _hashCode += getRescheduleInDays().hashCode();
        }
        if (getRescheduleOutDays() != null) {
            _hashCode += getRescheduleOutDays().hashCode();
        }
        if (getReservePrice() != null) {
            _hashCode += getReservePrice().hashCode();
        }
        if (getRevenueAllocationGroup() != null) {
            _hashCode += getRevenueAllocationGroup().hashCode();
        }
        if (getRevenueRecognitionRule() != null) {
            _hashCode += getRevenueRecognitionRule().hashCode();
        }
        if (getRevRecForecastRule() != null) {
            _hashCode += getRevRecForecastRule().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getRoundUpAsComponent() != null) {
            _hashCode += getRoundUpAsComponent().hashCode();
        }
        if (getSafetyStockLevel() != null) {
            _hashCode += getSafetyStockLevel().hashCode();
        }
        if (getSafetyStockLevelDays() != null) {
            _hashCode += getSafetyStockLevelDays().hashCode();
        }
        if (getSalesDescription() != null) {
            _hashCode += getSalesDescription().hashCode();
        }
        if (getSaleUnit() != null) {
            _hashCode += getSaleUnit().hashCode();
        }
        if (getSameAsPrimaryBookAmortization() != null) {
            _hashCode += getSameAsPrimaryBookAmortization().hashCode();
        }
        if (getSameAsPrimaryBookRevRec() != null) {
            _hashCode += getSameAsPrimaryBookRevRec().hashCode();
        }
        if (getScheduleBCode() != null) {
            _hashCode += getScheduleBCode().hashCode();
        }
        if (getScheduleBNumber() != null) {
            _hashCode += getScheduleBNumber().hashCode();
        }
        if (getScheduleBQuantity() != null) {
            _hashCode += getScheduleBQuantity().hashCode();
        }
        if (getSearchKeywords() != null) {
            _hashCode += getSearchKeywords().hashCode();
        }
        if (getSeasonalDemand() != null) {
            _hashCode += getSeasonalDemand().hashCode();
        }
        if (getSellOnEBay() != null) {
            _hashCode += getSellOnEBay().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSerialNumberLocation() != null) {
            _hashCode += getSerialNumberLocation().hashCode();
        }
        if (getShipIndividually() != null) {
            _hashCode += getShipIndividually().hashCode();
        }
        if (getShipPackage() != null) {
            _hashCode += getShipPackage().hashCode();
        }
        if (getShippingCarrier() != null) {
            _hashCode += getShippingCarrier().hashCode();
        }
        if (getShippingRate() != null) {
            _hashCode += getShippingRate().hashCode();
        }
        if (getShoppingDotComCategory() != null) {
            _hashCode += getShoppingDotComCategory().hashCode();
        }
        if (getShoppingProductFeed() != null) {
            _hashCode += getShoppingProductFeed().hashCode();
        }
        if (getShopzillaCategoryId() != null) {
            _hashCode += getShopzillaCategoryId().hashCode();
        }
        if (getShopzillaProductFeed() != null) {
            _hashCode += getShopzillaProductFeed().hashCode();
        }
        if (getSitemapPriority() != null) {
            _hashCode += getSitemapPriority().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        if (getStartingPrice() != null) {
            _hashCode += getStartingPrice().hashCode();
        }
        if (getStockDescription() != null) {
            _hashCode += getStockDescription().hashCode();
        }
        if (getStockUnit() != null) {
            _hashCode += getStockUnit().hashCode();
        }
        if (getStoreDescription() != null) {
            _hashCode += getStoreDescription().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getSubType() != null) {
            _hashCode += getSubType().hashCode();
        }
        if (getSupplyLotSizingMethod() != null) {
            _hashCode += getSupplyLotSizingMethod().hashCode();
        }
        if (getSupplyReplenishmentMethod() != null) {
            _hashCode += getSupplyReplenishmentMethod().hashCode();
        }
        if (getSupplyTimeFence() != null) {
            _hashCode += getSupplyTimeFence().hashCode();
        }
        if (getSupplyType() != null) {
            _hashCode += getSupplyType().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
        }
        if (getThumbnailUrl() != null) {
            _hashCode += getThumbnailUrl().hashCode();
        }
        if (getTotalValue() != null) {
            _hashCode += getTotalValue().hashCode();
        }
        if (getTrackLandedCost() != null) {
            _hashCode += getTrackLandedCost().hashCode();
        }
        if (getTransferPrice() != null) {
            _hashCode += getTransferPrice().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        if (getUpcCode() != null) {
            _hashCode += getUpcCode().hashCode();
        }
        if (getUrlComponent() != null) {
            _hashCode += getUrlComponent().hashCode();
        }
        if (getUseBins() != null) {
            _hashCode += getUseBins().hashCode();
        }
        if (getUseComponentYield() != null) {
            _hashCode += getUseComponentYield().hashCode();
        }
        if (getUseMarginalRates() != null) {
            _hashCode += getUseMarginalRates().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getVendorCode() != null) {
            _hashCode += getVendorCode().hashCode();
        }
        if (getVendorCost() != null) {
            _hashCode += getVendorCost().hashCode();
        }
        if (getVendorCostEntered() != null) {
            _hashCode += getVendorCostEntered().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        if (getVendorPriceCurrency() != null) {
            _hashCode += getVendorPriceCurrency().hashCode();
        }
        if (getVsoeDeferral() != null) {
            _hashCode += getVsoeDeferral().hashCode();
        }
        if (getVsoeDelivered() != null) {
            _hashCode += getVsoeDelivered().hashCode();
        }
        if (getVsoePermitDiscount() != null) {
            _hashCode += getVsoePermitDiscount().hashCode();
        }
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getVsoeSopGroup() != null) {
            _hashCode += getVsoeSopGroup().hashCode();
        }
        if (getWebSite() != null) {
            _hashCode += getWebSite().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getYahooProductFeed() != null) {
            _hashCode += getYahooProductFeed().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accBookRevRecForecastRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accBookRevRecForecastRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookAmortization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookAmortization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookCreatePlansOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookCreatePlansOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookRevRecRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookRevRecRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookRevRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookRevRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedShippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allowedShippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateDemandSourceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "alternateDemandSourceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "atpLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "atpMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPreferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoPreferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoReorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoReorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "backwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binOnHandAvail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binOnHandAvail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binOnHandCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binOnHandCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyItNowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyItNowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
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
        elemField.setFieldName("component");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "component"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "componentOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contingentRevenueHandling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contingentRevenueHandling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "copyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemCorrelation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItemCorrelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItemCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemLift");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItemLift"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemPurchaseRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItemPurchaseRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costAccountingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costAccountingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createRevenuePlansOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createRevenuePlansOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysBeforeExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysBeforeExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultShippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultShippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "demandModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "demandSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "demandTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("directRevenuePosting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "directRevenuePosting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayIneBayStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "displayIneBayStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributionCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "distributionCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributionNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "distributionNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eBayItemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemSubtitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eBayItemSubtitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eBayItemTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ebayRelistingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ebayRelistingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveBomControl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveBomControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAuctionsWhenOutOfStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endAuctionsWhenOutOfStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "feedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "feedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedLotSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fixedLotSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "forwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudRisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fraudRisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("froogleProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "froogleProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateAccruals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "generateAccruals"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertAuthCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertAuthCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertOrigAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertOrigAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertRecipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyNode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hierarchyNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hierarchyVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "imageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invtClassification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "invtClassification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invtCountInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "invtCountInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDropShipItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDropShipItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLotItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isLotItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPreferredVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPreferredVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSerialItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSerialItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSpecialOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialWorkOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSpecialWorkOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isStorePickupAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isStorePickupAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isWip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastQuantityAvailableChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastQuantityAvailableChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "listingDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("locationAllowStorePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationAllowStorePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAtpLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationAtpLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAverageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationAverageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationBuildTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationBuildTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCostAccountingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationCostAccountingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationDefaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationDefaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationDemandSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationDemandSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationDemandTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationDemandTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationFixedLotSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationFixedLotSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationInventoryCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationInventoryCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationInvtClassification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationInvtClassification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationInvtCountInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationInvtCountInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationLastInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationLastInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNextInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationNextInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationPeriodicLotSizeDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationPeriodicLotSizeDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationPeriodicLotSizeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationPeriodicLotSizeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationPreferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationPreferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQtyAvailForStorePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQtyAvailForStorePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityInTransit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityInTransit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationReorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationReorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationRescheduleInDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationRescheduleInDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationRescheduleOutDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationRescheduleOutDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationSafetyStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationSafetyStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationStorePickupBufferStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationStorePickupBufferStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationSupplyLotSizingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationSupplyLotSizingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationSupplyTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationSupplyTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationSupplyType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationSupplyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationTotalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationTotalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locBackwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locBackwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locForwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locForwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufactureraddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufactureraddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingChargeItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingChargeItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "matrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrixChild");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "matrixChild"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "maximumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mossApplies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mossApplies"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexTagCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nexTagCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexTagProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nexTagProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveListings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "numActiveListings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberAllowedDownloads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "numberAllowedDownloads"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCurrentlyListed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "numCurrentlyListed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsoleteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "obsoleteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsoleteRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "obsoleteRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineCustomerPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "onlineCustomerPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "otherVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overheadType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "overheadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicLotSizeDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodicLotSizeDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicLotSizeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodicLotSizeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferredBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferredLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferredStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricesIncludeTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pricesIncludeTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "primaryCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderMultiple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reorderMultiple"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rescheduleInDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rescheduleInDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rescheduleOutDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rescheduleOutDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reservePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueAllocationGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revenueAllocationGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueRecognitionRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revenueRecognitionRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundUpAsComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "roundUpAsComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "safetyStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameAsPrimaryBookAmortization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sameAsPrimaryBookAmortization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameAsPrimaryBookRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sameAsPrimaryBookRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seasonalDemand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "seasonalDemand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellOnEBay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sellOnEBay"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumberLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shippingCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shoppingProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shopzillaProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stockUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyLotSizingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "supplyLotSizingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyReplenishmentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "supplyReplenishmentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "supplyTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "supplyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbnailUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "thumbnailUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "totalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackLandedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "trackLandedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCostEntered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorCostEntered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPriceCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorPriceCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeSopGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeSopGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "webSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yahooProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "yahooProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
