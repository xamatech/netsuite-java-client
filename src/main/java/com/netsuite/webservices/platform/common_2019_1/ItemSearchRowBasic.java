/**
 * ItemSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ItemSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accBookRevRecForecastRule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookAmortization;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookCreatePlansOn;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookRevRecRule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookRevRecSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] allowedShippingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] alternateDemandSourceItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assetAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] atpLeadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] atpMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoLeadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoPreferredStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoReorderPoint;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableToPartners;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] averageCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] backwardConsumptionDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] basePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billExchRateVarianceAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billPriceVarianceAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billQtyVarianceAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] binNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] binOnHandAvail;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] binOnHandCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] bomQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] buildEntireAssembly;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] buildTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] buyItNowPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] category;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] categoryPreferred;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] componentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] contingentRevenueHandling;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] copyDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] correlatedItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] correlatedItemCorrelation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] correlatedItemCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] correlatedItemLift;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] correlatedItemPurchaseRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] costAccountingStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] costCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] costEstimateType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] costingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] countryOfManufacture;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] created;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] createJob;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] createRevenuePlansOn;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] custReturnVarianceAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateViewed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] daysBeforeExpiration;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] defaultReturnCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] defaultShippingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] deferredExpenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] deferredRevenueAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] deferRevRec;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] demandModifier;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] demandSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] demandTimeFence;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] departmentnohierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] directRevenuePosting;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] displayIneBayStore;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] displayName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] distributionCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] distributionNetwork;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] dontShowPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] eBayItemDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] eBayItemSubtitle;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] eBayItemTitle;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] ebayRelistingOption;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] effectiveBomControl;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] effectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] effectiveRevision;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] endAuctionsWhenOutOfStock;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] excludeFromSitemap;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] expenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] featuredDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] feedDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] feedName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fixedLotSize;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] forwardConsumptionDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] fraudRisk;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] froogleProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] gainLossAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] generateAccruals;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertAuthCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertExpirationDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertFrom;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertMessage;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertOriginalAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertRecipient;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hierarchyNode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hierarchyVersion;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] hits;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] imageUrl;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] incomeAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] intercoDefRevAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] intercoExpenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] intercoIncomeAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] inventoryLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] invtClassification;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] invtCountInterval;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDropShipItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isFulfillable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoCompliant;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isLotItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isOnline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSerialItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSpecialOrderItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSpecialWorkOrderItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isStorePickupAllowed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] issueProduct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isTaxable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isVsoeBundle;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isWip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] itemRevenueCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemUrl;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastInvtCountDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lastPurchasePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastQuantityAvailableChange;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] leadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] liabilityAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] listingDuration;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] locationAllowStorePickup;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationAtpLeadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationAverageCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locationBinQuantityAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationBuildTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationCostAccountingStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationDefaultReturnCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationDemandSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationDemandTimeFence;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationFixedLotSize;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locationInventoryCostTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationInvtClassification;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationInvtCountInterval;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] locationLastInvtCountDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationLeadTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] locationNextInvtCountDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationPeriodicLotSizeDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationPeriodicLotSizeType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationPreferredStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQtyAvailForStorePickup;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityBackOrdered;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityInTransit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityOnHand;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityOnOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationReOrderPoint;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationRescheduleInDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationRescheduleOutDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationSafetyStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationStorePickupBufferStock;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationSupplyLotSizingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationSupplyTimeFence;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationSupplyType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationTotalValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locBackwardConsumptionDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locForwardConsumptionDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerAddr1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerCity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerState;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerTariff;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerTaxId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerZip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] manufacturingChargeItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] matchBillToReceipt;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] maximumQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] memberItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] memberQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] metaTagHtml;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] minimumQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] modified;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] mossApplies;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mpn;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] multManufactureAddr;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nextagCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] nextagProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextInvtCountDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] noPriceMessage;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] numActiveListings;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] numberAllowedDownloads;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] numCurrentlyListed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] obsoleteDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] obsoleteRevision;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] offerSupport;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] onlineCustomerPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] onlinePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] onSpecial;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] otherPrices;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] otherVendor;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] outOfStockBehavior;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] outOfStockMessage;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] overallQuantityPricingType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] overheadType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pageTitle;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] periodicLotSizeDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] periodicLotSizeType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] preferenceCriterion;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] preferredBin;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] preferredLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] preferredStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] preferredStockLevelDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] pricesIncludeTax;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] pricingGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] primaryCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] prodPriceVarianceAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] prodQtyVarianceAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] purchaseDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] purchasePriceVarianceAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] purchaseUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityBackOrdered;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityOnHand;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityOnOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] quantityPricingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] reorderMultiple;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] reOrderPoint;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] rescheduleInDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] rescheduleOutDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] reservePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revenueAllocationGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revenueRecognitionRule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revRecForecastRule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revReclassFXAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revRecSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] roundUpAsComponent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] safetyStockLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] safetyStockLevelDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTaxCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] saleUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] sameAsPrimaryBookAmortization;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] sameAsPrimaryBookRevRec;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] scheduleBCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] scheduleBNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] scheduleBQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] scrapAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] searchKeywords;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] seasonalDemand;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] sellOnEBay;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumberLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shipIndividually;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shipPackage;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shippingCarrier;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] shippingRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shoppingDotComCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shoppingProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] shopzillaCategoryId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shopzillaProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] sitemapPriority;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] softDescriptor;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] startingPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] stockDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] stockUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] storeDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] storeDetailedDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] storeDisplayImage;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] storeDisplayName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] storeDisplayThumbnail;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] subType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] supplyLotSizingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] supplyReplenishmentMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] supplyTimeFence;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] supplyType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] thumbNailUrl;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] totalValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] trackLandedCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] unbuildVarianceAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] unitsType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] upcCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] urlComponent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useBins;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useComponentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useMarginalRates;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendor;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vendorCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vendorCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vendorCostEntered;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vendorName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vendorPriceCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendorSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendReturnVarianceAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoeDeferral;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] vsoeDelivered;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoePermitDiscount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoeSopGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] webSite;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] weight;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] weightUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] wipAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] wipVarianceAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] yahooProductFeed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public ItemSearchRowBasic() {
    }


    /**
     * Gets the accBookRevRecForecastRule value for this ItemSearchRowBasic.
     * 
     * @return accBookRevRecForecastRule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccBookRevRecForecastRule() {
        return accBookRevRecForecastRule;
    }


    /**
     * Sets the accBookRevRecForecastRule value for this ItemSearchRowBasic.
     * 
     * @param accBookRevRecForecastRule
     */
    public void setAccBookRevRecForecastRule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accBookRevRecForecastRule) {
        this.accBookRevRecForecastRule = accBookRevRecForecastRule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccBookRevRecForecastRule(int i) {
        return this.accBookRevRecForecastRule[i];
    }

    public void setAccBookRevRecForecastRule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.accBookRevRecForecastRule[i] = _value;
    }


    /**
     * Gets the accountingBook value for this ItemSearchRowBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this ItemSearchRowBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBook) {
        this.accountingBook = accountingBook;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccountingBook(int i) {
        return this.accountingBook[i];
    }

    public void setAccountingBook(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.accountingBook[i] = _value;
    }


    /**
     * Gets the accountingBookAmortization value for this ItemSearchRowBasic.
     * 
     * @return accountingBookAmortization
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccountingBookAmortization() {
        return accountingBookAmortization;
    }


    /**
     * Sets the accountingBookAmortization value for this ItemSearchRowBasic.
     * 
     * @param accountingBookAmortization
     */
    public void setAccountingBookAmortization(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookAmortization) {
        this.accountingBookAmortization = accountingBookAmortization;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccountingBookAmortization(int i) {
        return this.accountingBookAmortization[i];
    }

    public void setAccountingBookAmortization(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.accountingBookAmortization[i] = _value;
    }


    /**
     * Gets the accountingBookCreatePlansOn value for this ItemSearchRowBasic.
     * 
     * @return accountingBookCreatePlansOn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccountingBookCreatePlansOn() {
        return accountingBookCreatePlansOn;
    }


    /**
     * Sets the accountingBookCreatePlansOn value for this ItemSearchRowBasic.
     * 
     * @param accountingBookCreatePlansOn
     */
    public void setAccountingBookCreatePlansOn(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookCreatePlansOn) {
        this.accountingBookCreatePlansOn = accountingBookCreatePlansOn;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccountingBookCreatePlansOn(int i) {
        return this.accountingBookCreatePlansOn[i];
    }

    public void setAccountingBookCreatePlansOn(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.accountingBookCreatePlansOn[i] = _value;
    }


    /**
     * Gets the accountingBookRevRecRule value for this ItemSearchRowBasic.
     * 
     * @return accountingBookRevRecRule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccountingBookRevRecRule() {
        return accountingBookRevRecRule;
    }


    /**
     * Sets the accountingBookRevRecRule value for this ItemSearchRowBasic.
     * 
     * @param accountingBookRevRecRule
     */
    public void setAccountingBookRevRecRule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookRevRecRule) {
        this.accountingBookRevRecRule = accountingBookRevRecRule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccountingBookRevRecRule(int i) {
        return this.accountingBookRevRecRule[i];
    }

    public void setAccountingBookRevRecRule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.accountingBookRevRecRule[i] = _value;
    }


    /**
     * Gets the accountingBookRevRecSchedule value for this ItemSearchRowBasic.
     * 
     * @return accountingBookRevRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccountingBookRevRecSchedule() {
        return accountingBookRevRecSchedule;
    }


    /**
     * Sets the accountingBookRevRecSchedule value for this ItemSearchRowBasic.
     * 
     * @param accountingBookRevRecSchedule
     */
    public void setAccountingBookRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] accountingBookRevRecSchedule) {
        this.accountingBookRevRecSchedule = accountingBookRevRecSchedule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccountingBookRevRecSchedule(int i) {
        return this.accountingBookRevRecSchedule[i];
    }

    public void setAccountingBookRevRecSchedule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.accountingBookRevRecSchedule[i] = _value;
    }


    /**
     * Gets the allowedShippingMethod value for this ItemSearchRowBasic.
     * 
     * @return allowedShippingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAllowedShippingMethod() {
        return allowedShippingMethod;
    }


    /**
     * Sets the allowedShippingMethod value for this ItemSearchRowBasic.
     * 
     * @param allowedShippingMethod
     */
    public void setAllowedShippingMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] allowedShippingMethod) {
        this.allowedShippingMethod = allowedShippingMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAllowedShippingMethod(int i) {
        return this.allowedShippingMethod[i];
    }

    public void setAllowedShippingMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.allowedShippingMethod[i] = _value;
    }


    /**
     * Gets the alternateDemandSourceItem value for this ItemSearchRowBasic.
     * 
     * @return alternateDemandSourceItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAlternateDemandSourceItem() {
        return alternateDemandSourceItem;
    }


    /**
     * Sets the alternateDemandSourceItem value for this ItemSearchRowBasic.
     * 
     * @param alternateDemandSourceItem
     */
    public void setAlternateDemandSourceItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] alternateDemandSourceItem) {
        this.alternateDemandSourceItem = alternateDemandSourceItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAlternateDemandSourceItem(int i) {
        return this.alternateDemandSourceItem[i];
    }

    public void setAlternateDemandSourceItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.alternateDemandSourceItem[i] = _value;
    }


    /**
     * Gets the assetAccount value for this ItemSearchRowBasic.
     * 
     * @return assetAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAssetAccount() {
        return assetAccount;
    }


    /**
     * Sets the assetAccount value for this ItemSearchRowBasic.
     * 
     * @param assetAccount
     */
    public void setAssetAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assetAccount) {
        this.assetAccount = assetAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAssetAccount(int i) {
        return this.assetAccount[i];
    }

    public void setAssetAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.assetAccount[i] = _value;
    }


    /**
     * Gets the atpLeadTime value for this ItemSearchRowBasic.
     * 
     * @return atpLeadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAtpLeadTime() {
        return atpLeadTime;
    }


    /**
     * Sets the atpLeadTime value for this ItemSearchRowBasic.
     * 
     * @param atpLeadTime
     */
    public void setAtpLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] atpLeadTime) {
        this.atpLeadTime = atpLeadTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAtpLeadTime(int i) {
        return this.atpLeadTime[i];
    }

    public void setAtpLeadTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.atpLeadTime[i] = _value;
    }


    /**
     * Gets the atpMethod value for this ItemSearchRowBasic.
     * 
     * @return atpMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getAtpMethod() {
        return atpMethod;
    }


    /**
     * Sets the atpMethod value for this ItemSearchRowBasic.
     * 
     * @param atpMethod
     */
    public void setAtpMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] atpMethod) {
        this.atpMethod = atpMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getAtpMethod(int i) {
        return this.atpMethod[i];
    }

    public void setAtpMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.atpMethod[i] = _value;
    }


    /**
     * Gets the autoLeadTime value for this ItemSearchRowBasic.
     * 
     * @return autoLeadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAutoLeadTime() {
        return autoLeadTime;
    }


    /**
     * Sets the autoLeadTime value for this ItemSearchRowBasic.
     * 
     * @param autoLeadTime
     */
    public void setAutoLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoLeadTime) {
        this.autoLeadTime = autoLeadTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAutoLeadTime(int i) {
        return this.autoLeadTime[i];
    }

    public void setAutoLeadTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.autoLeadTime[i] = _value;
    }


    /**
     * Gets the autoPreferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @return autoPreferredStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAutoPreferredStockLevel() {
        return autoPreferredStockLevel;
    }


    /**
     * Sets the autoPreferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @param autoPreferredStockLevel
     */
    public void setAutoPreferredStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoPreferredStockLevel) {
        this.autoPreferredStockLevel = autoPreferredStockLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAutoPreferredStockLevel(int i) {
        return this.autoPreferredStockLevel[i];
    }

    public void setAutoPreferredStockLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.autoPreferredStockLevel[i] = _value;
    }


    /**
     * Gets the autoReorderPoint value for this ItemSearchRowBasic.
     * 
     * @return autoReorderPoint
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAutoReorderPoint() {
        return autoReorderPoint;
    }


    /**
     * Sets the autoReorderPoint value for this ItemSearchRowBasic.
     * 
     * @param autoReorderPoint
     */
    public void setAutoReorderPoint(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoReorderPoint) {
        this.autoReorderPoint = autoReorderPoint;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAutoReorderPoint(int i) {
        return this.autoReorderPoint[i];
    }

    public void setAutoReorderPoint(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.autoReorderPoint[i] = _value;
    }


    /**
     * Gets the availableToPartners value for this ItemSearchRowBasic.
     * 
     * @return availableToPartners
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this ItemSearchRowBasic.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableToPartners) {
        this.availableToPartners = availableToPartners;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAvailableToPartners(int i) {
        return this.availableToPartners[i];
    }

    public void setAvailableToPartners(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.availableToPartners[i] = _value;
    }


    /**
     * Gets the averageCost value for this ItemSearchRowBasic.
     * 
     * @return averageCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAverageCost() {
        return averageCost;
    }


    /**
     * Sets the averageCost value for this ItemSearchRowBasic.
     * 
     * @param averageCost
     */
    public void setAverageCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] averageCost) {
        this.averageCost = averageCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAverageCost(int i) {
        return this.averageCost[i];
    }

    public void setAverageCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.averageCost[i] = _value;
    }


    /**
     * Gets the backwardConsumptionDays value for this ItemSearchRowBasic.
     * 
     * @return backwardConsumptionDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getBackwardConsumptionDays() {
        return backwardConsumptionDays;
    }


    /**
     * Sets the backwardConsumptionDays value for this ItemSearchRowBasic.
     * 
     * @param backwardConsumptionDays
     */
    public void setBackwardConsumptionDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] backwardConsumptionDays) {
        this.backwardConsumptionDays = backwardConsumptionDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getBackwardConsumptionDays(int i) {
        return this.backwardConsumptionDays[i];
    }

    public void setBackwardConsumptionDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.backwardConsumptionDays[i] = _value;
    }


    /**
     * Gets the basePrice value for this ItemSearchRowBasic.
     * 
     * @return basePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBasePrice() {
        return basePrice;
    }


    /**
     * Sets the basePrice value for this ItemSearchRowBasic.
     * 
     * @param basePrice
     */
    public void setBasePrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] basePrice) {
        this.basePrice = basePrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBasePrice(int i) {
        return this.basePrice[i];
    }

    public void setBasePrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.basePrice[i] = _value;
    }


    /**
     * Gets the billExchRateVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return billExchRateVarianceAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillExchRateVarianceAcct() {
        return billExchRateVarianceAcct;
    }


    /**
     * Sets the billExchRateVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param billExchRateVarianceAcct
     */
    public void setBillExchRateVarianceAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billExchRateVarianceAcct) {
        this.billExchRateVarianceAcct = billExchRateVarianceAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillExchRateVarianceAcct(int i) {
        return this.billExchRateVarianceAcct[i];
    }

    public void setBillExchRateVarianceAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billExchRateVarianceAcct[i] = _value;
    }


    /**
     * Gets the billPriceVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return billPriceVarianceAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillPriceVarianceAcct() {
        return billPriceVarianceAcct;
    }


    /**
     * Sets the billPriceVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param billPriceVarianceAcct
     */
    public void setBillPriceVarianceAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billPriceVarianceAcct) {
        this.billPriceVarianceAcct = billPriceVarianceAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillPriceVarianceAcct(int i) {
        return this.billPriceVarianceAcct[i];
    }

    public void setBillPriceVarianceAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billPriceVarianceAcct[i] = _value;
    }


    /**
     * Gets the billQtyVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return billQtyVarianceAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillQtyVarianceAcct() {
        return billQtyVarianceAcct;
    }


    /**
     * Sets the billQtyVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param billQtyVarianceAcct
     */
    public void setBillQtyVarianceAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billQtyVarianceAcct) {
        this.billQtyVarianceAcct = billQtyVarianceAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillQtyVarianceAcct(int i) {
        return this.billQtyVarianceAcct[i];
    }

    public void setBillQtyVarianceAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billQtyVarianceAcct[i] = _value;
    }


    /**
     * Gets the binNumber value for this ItemSearchRowBasic.
     * 
     * @return binNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this ItemSearchRowBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] binNumber) {
        this.binNumber = binNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBinNumber(int i) {
        return this.binNumber[i];
    }

    public void setBinNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.binNumber[i] = _value;
    }


    /**
     * Gets the binOnHandAvail value for this ItemSearchRowBasic.
     * 
     * @return binOnHandAvail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBinOnHandAvail() {
        return binOnHandAvail;
    }


    /**
     * Sets the binOnHandAvail value for this ItemSearchRowBasic.
     * 
     * @param binOnHandAvail
     */
    public void setBinOnHandAvail(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] binOnHandAvail) {
        this.binOnHandAvail = binOnHandAvail;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBinOnHandAvail(int i) {
        return this.binOnHandAvail[i];
    }

    public void setBinOnHandAvail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.binOnHandAvail[i] = _value;
    }


    /**
     * Gets the binOnHandCount value for this ItemSearchRowBasic.
     * 
     * @return binOnHandCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBinOnHandCount() {
        return binOnHandCount;
    }


    /**
     * Sets the binOnHandCount value for this ItemSearchRowBasic.
     * 
     * @param binOnHandCount
     */
    public void setBinOnHandCount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] binOnHandCount) {
        this.binOnHandCount = binOnHandCount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBinOnHandCount(int i) {
        return this.binOnHandCount[i];
    }

    public void setBinOnHandCount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.binOnHandCount[i] = _value;
    }


    /**
     * Gets the bomQuantity value for this ItemSearchRowBasic.
     * 
     * @return bomQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this ItemSearchRowBasic.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBomQuantity(int i) {
        return this.bomQuantity[i];
    }

    public void setBomQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.bomQuantity[i] = _value;
    }


    /**
     * Gets the buildEntireAssembly value for this ItemSearchRowBasic.
     * 
     * @return buildEntireAssembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getBuildEntireAssembly() {
        return buildEntireAssembly;
    }


    /**
     * Sets the buildEntireAssembly value for this ItemSearchRowBasic.
     * 
     * @param buildEntireAssembly
     */
    public void setBuildEntireAssembly(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getBuildEntireAssembly(int i) {
        return this.buildEntireAssembly[i];
    }

    public void setBuildEntireAssembly(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.buildEntireAssembly[i] = _value;
    }


    /**
     * Gets the buildTime value for this ItemSearchRowBasic.
     * 
     * @return buildTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBuildTime() {
        return buildTime;
    }


    /**
     * Sets the buildTime value for this ItemSearchRowBasic.
     * 
     * @param buildTime
     */
    public void setBuildTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] buildTime) {
        this.buildTime = buildTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBuildTime(int i) {
        return this.buildTime[i];
    }

    public void setBuildTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.buildTime[i] = _value;
    }


    /**
     * Gets the buyItNowPrice value for this ItemSearchRowBasic.
     * 
     * @return buyItNowPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBuyItNowPrice() {
        return buyItNowPrice;
    }


    /**
     * Sets the buyItNowPrice value for this ItemSearchRowBasic.
     * 
     * @param buyItNowPrice
     */
    public void setBuyItNowPrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] buyItNowPrice) {
        this.buyItNowPrice = buyItNowPrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBuyItNowPrice(int i) {
        return this.buyItNowPrice[i];
    }

    public void setBuyItNowPrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.buyItNowPrice[i] = _value;
    }


    /**
     * Gets the category value for this ItemSearchRowBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ItemSearchRowBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] category) {
        this.category = category;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the categoryPreferred value for this ItemSearchRowBasic.
     * 
     * @return categoryPreferred
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCategoryPreferred() {
        return categoryPreferred;
    }


    /**
     * Sets the categoryPreferred value for this ItemSearchRowBasic.
     * 
     * @param categoryPreferred
     */
    public void setCategoryPreferred(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] categoryPreferred) {
        this.categoryPreferred = categoryPreferred;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCategoryPreferred(int i) {
        return this.categoryPreferred[i];
    }

    public void setCategoryPreferred(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.categoryPreferred[i] = _value;
    }


    /**
     * Gets the _class value for this ItemSearchRowBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ItemSearchRowBasic.
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
     * Gets the componentYield value for this ItemSearchRowBasic.
     * 
     * @return componentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getComponentYield() {
        return componentYield;
    }


    /**
     * Sets the componentYield value for this ItemSearchRowBasic.
     * 
     * @param componentYield
     */
    public void setComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] componentYield) {
        this.componentYield = componentYield;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getComponentYield(int i) {
        return this.componentYield[i];
    }

    public void setComponentYield(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.componentYield[i] = _value;
    }


    /**
     * Gets the contingentRevenueHandling value for this ItemSearchRowBasic.
     * 
     * @return contingentRevenueHandling
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getContingentRevenueHandling() {
        return contingentRevenueHandling;
    }


    /**
     * Sets the contingentRevenueHandling value for this ItemSearchRowBasic.
     * 
     * @param contingentRevenueHandling
     */
    public void setContingentRevenueHandling(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] contingentRevenueHandling) {
        this.contingentRevenueHandling = contingentRevenueHandling;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getContingentRevenueHandling(int i) {
        return this.contingentRevenueHandling[i];
    }

    public void setContingentRevenueHandling(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.contingentRevenueHandling[i] = _value;
    }


    /**
     * Gets the copyDescription value for this ItemSearchRowBasic.
     * 
     * @return copyDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getCopyDescription() {
        return copyDescription;
    }


    /**
     * Sets the copyDescription value for this ItemSearchRowBasic.
     * 
     * @param copyDescription
     */
    public void setCopyDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] copyDescription) {
        this.copyDescription = copyDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getCopyDescription(int i) {
        return this.copyDescription[i];
    }

    public void setCopyDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.copyDescription[i] = _value;
    }


    /**
     * Gets the correlatedItem value for this ItemSearchRowBasic.
     * 
     * @return correlatedItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCorrelatedItem() {
        return correlatedItem;
    }


    /**
     * Sets the correlatedItem value for this ItemSearchRowBasic.
     * 
     * @param correlatedItem
     */
    public void setCorrelatedItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] correlatedItem) {
        this.correlatedItem = correlatedItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCorrelatedItem(int i) {
        return this.correlatedItem[i];
    }

    public void setCorrelatedItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.correlatedItem[i] = _value;
    }


    /**
     * Gets the correlatedItemCorrelation value for this ItemSearchRowBasic.
     * 
     * @return correlatedItemCorrelation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCorrelatedItemCorrelation() {
        return correlatedItemCorrelation;
    }


    /**
     * Sets the correlatedItemCorrelation value for this ItemSearchRowBasic.
     * 
     * @param correlatedItemCorrelation
     */
    public void setCorrelatedItemCorrelation(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] correlatedItemCorrelation) {
        this.correlatedItemCorrelation = correlatedItemCorrelation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCorrelatedItemCorrelation(int i) {
        return this.correlatedItemCorrelation[i];
    }

    public void setCorrelatedItemCorrelation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.correlatedItemCorrelation[i] = _value;
    }


    /**
     * Gets the correlatedItemCount value for this ItemSearchRowBasic.
     * 
     * @return correlatedItemCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getCorrelatedItemCount() {
        return correlatedItemCount;
    }


    /**
     * Sets the correlatedItemCount value for this ItemSearchRowBasic.
     * 
     * @param correlatedItemCount
     */
    public void setCorrelatedItemCount(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] correlatedItemCount) {
        this.correlatedItemCount = correlatedItemCount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getCorrelatedItemCount(int i) {
        return this.correlatedItemCount[i];
    }

    public void setCorrelatedItemCount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.correlatedItemCount[i] = _value;
    }


    /**
     * Gets the correlatedItemLift value for this ItemSearchRowBasic.
     * 
     * @return correlatedItemLift
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCorrelatedItemLift() {
        return correlatedItemLift;
    }


    /**
     * Sets the correlatedItemLift value for this ItemSearchRowBasic.
     * 
     * @param correlatedItemLift
     */
    public void setCorrelatedItemLift(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] correlatedItemLift) {
        this.correlatedItemLift = correlatedItemLift;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCorrelatedItemLift(int i) {
        return this.correlatedItemLift[i];
    }

    public void setCorrelatedItemLift(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.correlatedItemLift[i] = _value;
    }


    /**
     * Gets the correlatedItemPurchaseRate value for this ItemSearchRowBasic.
     * 
     * @return correlatedItemPurchaseRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCorrelatedItemPurchaseRate() {
        return correlatedItemPurchaseRate;
    }


    /**
     * Sets the correlatedItemPurchaseRate value for this ItemSearchRowBasic.
     * 
     * @param correlatedItemPurchaseRate
     */
    public void setCorrelatedItemPurchaseRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] correlatedItemPurchaseRate) {
        this.correlatedItemPurchaseRate = correlatedItemPurchaseRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCorrelatedItemPurchaseRate(int i) {
        return this.correlatedItemPurchaseRate[i];
    }

    public void setCorrelatedItemPurchaseRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.correlatedItemPurchaseRate[i] = _value;
    }


    /**
     * Gets the cost value for this ItemSearchRowBasic.
     * 
     * @return cost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ItemSearchRowBasic.
     * 
     * @param cost
     */
    public void setCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost) {
        this.cost = cost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCost(int i) {
        return this.cost[i];
    }

    public void setCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.cost[i] = _value;
    }


    /**
     * Gets the costAccountingStatus value for this ItemSearchRowBasic.
     * 
     * @return costAccountingStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCostAccountingStatus() {
        return costAccountingStatus;
    }


    /**
     * Sets the costAccountingStatus value for this ItemSearchRowBasic.
     * 
     * @param costAccountingStatus
     */
    public void setCostAccountingStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] costAccountingStatus) {
        this.costAccountingStatus = costAccountingStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCostAccountingStatus(int i) {
        return this.costAccountingStatus[i];
    }

    public void setCostAccountingStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.costAccountingStatus[i] = _value;
    }


    /**
     * Gets the costCategory value for this ItemSearchRowBasic.
     * 
     * @return costCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCostCategory() {
        return costCategory;
    }


    /**
     * Sets the costCategory value for this ItemSearchRowBasic.
     * 
     * @param costCategory
     */
    public void setCostCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] costCategory) {
        this.costCategory = costCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCostCategory(int i) {
        return this.costCategory[i];
    }

    public void setCostCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.costCategory[i] = _value;
    }


    /**
     * Gets the costEstimate value for this ItemSearchRowBasic.
     * 
     * @return costEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this ItemSearchRowBasic.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costEstimate) {
        this.costEstimate = costEstimate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostEstimate(int i) {
        return this.costEstimate[i];
    }

    public void setCostEstimate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costEstimate[i] = _value;
    }


    /**
     * Gets the costEstimateType value for this ItemSearchRowBasic.
     * 
     * @return costEstimateType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this ItemSearchRowBasic.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCostEstimateType(int i) {
        return this.costEstimateType[i];
    }

    public void setCostEstimateType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.costEstimateType[i] = _value;
    }


    /**
     * Gets the costingMethod value for this ItemSearchRowBasic.
     * 
     * @return costingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCostingMethod() {
        return costingMethod;
    }


    /**
     * Sets the costingMethod value for this ItemSearchRowBasic.
     * 
     * @param costingMethod
     */
    public void setCostingMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] costingMethod) {
        this.costingMethod = costingMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCostingMethod(int i) {
        return this.costingMethod[i];
    }

    public void setCostingMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.costingMethod[i] = _value;
    }


    /**
     * Gets the countryOfManufacture value for this ItemSearchRowBasic.
     * 
     * @return countryOfManufacture
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this ItemSearchRowBasic.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCountryOfManufacture(int i) {
        return this.countryOfManufacture[i];
    }

    public void setCountryOfManufacture(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.countryOfManufacture[i] = _value;
    }


    /**
     * Gets the created value for this ItemSearchRowBasic.
     * 
     * @return created
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreated() {
        return created;
    }


    /**
     * Sets the created value for this ItemSearchRowBasic.
     * 
     * @param created
     */
    public void setCreated(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] created) {
        this.created = created;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCreated(int i) {
        return this.created[i];
    }

    public void setCreated(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.created[i] = _value;
    }


    /**
     * Gets the createJob value for this ItemSearchRowBasic.
     * 
     * @return createJob
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getCreateJob() {
        return createJob;
    }


    /**
     * Sets the createJob value for this ItemSearchRowBasic.
     * 
     * @param createJob
     */
    public void setCreateJob(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] createJob) {
        this.createJob = createJob;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getCreateJob(int i) {
        return this.createJob[i];
    }

    public void setCreateJob(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.createJob[i] = _value;
    }


    /**
     * Gets the createRevenuePlansOn value for this ItemSearchRowBasic.
     * 
     * @return createRevenuePlansOn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCreateRevenuePlansOn() {
        return createRevenuePlansOn;
    }


    /**
     * Sets the createRevenuePlansOn value for this ItemSearchRowBasic.
     * 
     * @param createRevenuePlansOn
     */
    public void setCreateRevenuePlansOn(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] createRevenuePlansOn) {
        this.createRevenuePlansOn = createRevenuePlansOn;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCreateRevenuePlansOn(int i) {
        return this.createRevenuePlansOn[i];
    }

    public void setCreateRevenuePlansOn(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.createRevenuePlansOn[i] = _value;
    }


    /**
     * Gets the custReturnVarianceAccount value for this ItemSearchRowBasic.
     * 
     * @return custReturnVarianceAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCustReturnVarianceAccount() {
        return custReturnVarianceAccount;
    }


    /**
     * Sets the custReturnVarianceAccount value for this ItemSearchRowBasic.
     * 
     * @param custReturnVarianceAccount
     */
    public void setCustReturnVarianceAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] custReturnVarianceAccount) {
        this.custReturnVarianceAccount = custReturnVarianceAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCustReturnVarianceAccount(int i) {
        return this.custReturnVarianceAccount[i];
    }

    public void setCustReturnVarianceAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.custReturnVarianceAccount[i] = _value;
    }


    /**
     * Gets the dateViewed value for this ItemSearchRowBasic.
     * 
     * @return dateViewed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateViewed() {
        return dateViewed;
    }


    /**
     * Sets the dateViewed value for this ItemSearchRowBasic.
     * 
     * @param dateViewed
     */
    public void setDateViewed(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateViewed) {
        this.dateViewed = dateViewed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDateViewed(int i) {
        return this.dateViewed[i];
    }

    public void setDateViewed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dateViewed[i] = _value;
    }


    /**
     * Gets the daysBeforeExpiration value for this ItemSearchRowBasic.
     * 
     * @return daysBeforeExpiration
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDaysBeforeExpiration() {
        return daysBeforeExpiration;
    }


    /**
     * Sets the daysBeforeExpiration value for this ItemSearchRowBasic.
     * 
     * @param daysBeforeExpiration
     */
    public void setDaysBeforeExpiration(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] daysBeforeExpiration) {
        this.daysBeforeExpiration = daysBeforeExpiration;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDaysBeforeExpiration(int i) {
        return this.daysBeforeExpiration[i];
    }

    public void setDaysBeforeExpiration(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.daysBeforeExpiration[i] = _value;
    }


    /**
     * Gets the defaultReturnCost value for this ItemSearchRowBasic.
     * 
     * @return defaultReturnCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDefaultReturnCost() {
        return defaultReturnCost;
    }


    /**
     * Sets the defaultReturnCost value for this ItemSearchRowBasic.
     * 
     * @param defaultReturnCost
     */
    public void setDefaultReturnCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDefaultReturnCost(int i) {
        return this.defaultReturnCost[i];
    }

    public void setDefaultReturnCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.defaultReturnCost[i] = _value;
    }


    /**
     * Gets the defaultShippingMethod value for this ItemSearchRowBasic.
     * 
     * @return defaultShippingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDefaultShippingMethod() {
        return defaultShippingMethod;
    }


    /**
     * Sets the defaultShippingMethod value for this ItemSearchRowBasic.
     * 
     * @param defaultShippingMethod
     */
    public void setDefaultShippingMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] defaultShippingMethod) {
        this.defaultShippingMethod = defaultShippingMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDefaultShippingMethod(int i) {
        return this.defaultShippingMethod[i];
    }

    public void setDefaultShippingMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.defaultShippingMethod[i] = _value;
    }


    /**
     * Gets the deferredExpenseAccount value for this ItemSearchRowBasic.
     * 
     * @return deferredExpenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDeferredExpenseAccount() {
        return deferredExpenseAccount;
    }


    /**
     * Sets the deferredExpenseAccount value for this ItemSearchRowBasic.
     * 
     * @param deferredExpenseAccount
     */
    public void setDeferredExpenseAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] deferredExpenseAccount) {
        this.deferredExpenseAccount = deferredExpenseAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDeferredExpenseAccount(int i) {
        return this.deferredExpenseAccount[i];
    }

    public void setDeferredExpenseAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.deferredExpenseAccount[i] = _value;
    }


    /**
     * Gets the deferredRevenueAccount value for this ItemSearchRowBasic.
     * 
     * @return deferredRevenueAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDeferredRevenueAccount() {
        return deferredRevenueAccount;
    }


    /**
     * Sets the deferredRevenueAccount value for this ItemSearchRowBasic.
     * 
     * @param deferredRevenueAccount
     */
    public void setDeferredRevenueAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDeferredRevenueAccount(int i) {
        return this.deferredRevenueAccount[i];
    }

    public void setDeferredRevenueAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.deferredRevenueAccount[i] = _value;
    }


    /**
     * Gets the deferRevRec value for this ItemSearchRowBasic.
     * 
     * @return deferRevRec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this ItemSearchRowBasic.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getDeferRevRec(int i) {
        return this.deferRevRec[i];
    }

    public void setDeferRevRec(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.deferRevRec[i] = _value;
    }


    /**
     * Gets the demandModifier value for this ItemSearchRowBasic.
     * 
     * @return demandModifier
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDemandModifier() {
        return demandModifier;
    }


    /**
     * Sets the demandModifier value for this ItemSearchRowBasic.
     * 
     * @param demandModifier
     */
    public void setDemandModifier(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] demandModifier) {
        this.demandModifier = demandModifier;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDemandModifier(int i) {
        return this.demandModifier[i];
    }

    public void setDemandModifier(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.demandModifier[i] = _value;
    }


    /**
     * Gets the demandSource value for this ItemSearchRowBasic.
     * 
     * @return demandSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getDemandSource() {
        return demandSource;
    }


    /**
     * Sets the demandSource value for this ItemSearchRowBasic.
     * 
     * @param demandSource
     */
    public void setDemandSource(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] demandSource) {
        this.demandSource = demandSource;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getDemandSource(int i) {
        return this.demandSource[i];
    }

    public void setDemandSource(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.demandSource[i] = _value;
    }


    /**
     * Gets the demandTimeFence value for this ItemSearchRowBasic.
     * 
     * @return demandTimeFence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDemandTimeFence() {
        return demandTimeFence;
    }


    /**
     * Sets the demandTimeFence value for this ItemSearchRowBasic.
     * 
     * @param demandTimeFence
     */
    public void setDemandTimeFence(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] demandTimeFence) {
        this.demandTimeFence = demandTimeFence;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDemandTimeFence(int i) {
        return this.demandTimeFence[i];
    }

    public void setDemandTimeFence(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.demandTimeFence[i] = _value;
    }


    /**
     * Gets the department value for this ItemSearchRowBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ItemSearchRowBasic.
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
     * Gets the departmentnohierarchy value for this ItemSearchRowBasic.
     * 
     * @return departmentnohierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDepartmentnohierarchy() {
        return departmentnohierarchy;
    }


    /**
     * Sets the departmentnohierarchy value for this ItemSearchRowBasic.
     * 
     * @param departmentnohierarchy
     */
    public void setDepartmentnohierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] departmentnohierarchy) {
        this.departmentnohierarchy = departmentnohierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDepartmentnohierarchy(int i) {
        return this.departmentnohierarchy[i];
    }

    public void setDepartmentnohierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.departmentnohierarchy[i] = _value;
    }


    /**
     * Gets the directRevenuePosting value for this ItemSearchRowBasic.
     * 
     * @return directRevenuePosting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getDirectRevenuePosting() {
        return directRevenuePosting;
    }


    /**
     * Sets the directRevenuePosting value for this ItemSearchRowBasic.
     * 
     * @param directRevenuePosting
     */
    public void setDirectRevenuePosting(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] directRevenuePosting) {
        this.directRevenuePosting = directRevenuePosting;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getDirectRevenuePosting(int i) {
        return this.directRevenuePosting[i];
    }

    public void setDirectRevenuePosting(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.directRevenuePosting[i] = _value;
    }


    /**
     * Gets the displayIneBayStore value for this ItemSearchRowBasic.
     * 
     * @return displayIneBayStore
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getDisplayIneBayStore() {
        return displayIneBayStore;
    }


    /**
     * Sets the displayIneBayStore value for this ItemSearchRowBasic.
     * 
     * @param displayIneBayStore
     */
    public void setDisplayIneBayStore(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] displayIneBayStore) {
        this.displayIneBayStore = displayIneBayStore;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getDisplayIneBayStore(int i) {
        return this.displayIneBayStore[i];
    }

    public void setDisplayIneBayStore(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.displayIneBayStore[i] = _value;
    }


    /**
     * Gets the displayName value for this ItemSearchRowBasic.
     * 
     * @return displayName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ItemSearchRowBasic.
     * 
     * @param displayName
     */
    public void setDisplayName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] displayName) {
        this.displayName = displayName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDisplayName(int i) {
        return this.displayName[i];
    }

    public void setDisplayName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.displayName[i] = _value;
    }


    /**
     * Gets the distributionCategory value for this ItemSearchRowBasic.
     * 
     * @return distributionCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDistributionCategory() {
        return distributionCategory;
    }


    /**
     * Sets the distributionCategory value for this ItemSearchRowBasic.
     * 
     * @param distributionCategory
     */
    public void setDistributionCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] distributionCategory) {
        this.distributionCategory = distributionCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDistributionCategory(int i) {
        return this.distributionCategory[i];
    }

    public void setDistributionCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.distributionCategory[i] = _value;
    }


    /**
     * Gets the distributionNetwork value for this ItemSearchRowBasic.
     * 
     * @return distributionNetwork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDistributionNetwork() {
        return distributionNetwork;
    }


    /**
     * Sets the distributionNetwork value for this ItemSearchRowBasic.
     * 
     * @param distributionNetwork
     */
    public void setDistributionNetwork(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] distributionNetwork) {
        this.distributionNetwork = distributionNetwork;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDistributionNetwork(int i) {
        return this.distributionNetwork[i];
    }

    public void setDistributionNetwork(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.distributionNetwork[i] = _value;
    }


    /**
     * Gets the dontShowPrice value for this ItemSearchRowBasic.
     * 
     * @return dontShowPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getDontShowPrice() {
        return dontShowPrice;
    }


    /**
     * Sets the dontShowPrice value for this ItemSearchRowBasic.
     * 
     * @param dontShowPrice
     */
    public void setDontShowPrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getDontShowPrice(int i) {
        return this.dontShowPrice[i];
    }

    public void setDontShowPrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.dontShowPrice[i] = _value;
    }


    /**
     * Gets the eBayItemDescription value for this ItemSearchRowBasic.
     * 
     * @return eBayItemDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEBayItemDescription() {
        return eBayItemDescription;
    }


    /**
     * Sets the eBayItemDescription value for this ItemSearchRowBasic.
     * 
     * @param eBayItemDescription
     */
    public void setEBayItemDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] eBayItemDescription) {
        this.eBayItemDescription = eBayItemDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEBayItemDescription(int i) {
        return this.eBayItemDescription[i];
    }

    public void setEBayItemDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.eBayItemDescription[i] = _value;
    }


    /**
     * Gets the eBayItemSubtitle value for this ItemSearchRowBasic.
     * 
     * @return eBayItemSubtitle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEBayItemSubtitle() {
        return eBayItemSubtitle;
    }


    /**
     * Sets the eBayItemSubtitle value for this ItemSearchRowBasic.
     * 
     * @param eBayItemSubtitle
     */
    public void setEBayItemSubtitle(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] eBayItemSubtitle) {
        this.eBayItemSubtitle = eBayItemSubtitle;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEBayItemSubtitle(int i) {
        return this.eBayItemSubtitle[i];
    }

    public void setEBayItemSubtitle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.eBayItemSubtitle[i] = _value;
    }


    /**
     * Gets the eBayItemTitle value for this ItemSearchRowBasic.
     * 
     * @return eBayItemTitle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEBayItemTitle() {
        return eBayItemTitle;
    }


    /**
     * Sets the eBayItemTitle value for this ItemSearchRowBasic.
     * 
     * @param eBayItemTitle
     */
    public void setEBayItemTitle(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] eBayItemTitle) {
        this.eBayItemTitle = eBayItemTitle;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEBayItemTitle(int i) {
        return this.eBayItemTitle[i];
    }

    public void setEBayItemTitle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.eBayItemTitle[i] = _value;
    }


    /**
     * Gets the ebayRelistingOption value for this ItemSearchRowBasic.
     * 
     * @return ebayRelistingOption
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getEbayRelistingOption() {
        return ebayRelistingOption;
    }


    /**
     * Sets the ebayRelistingOption value for this ItemSearchRowBasic.
     * 
     * @param ebayRelistingOption
     */
    public void setEbayRelistingOption(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] ebayRelistingOption) {
        this.ebayRelistingOption = ebayRelistingOption;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getEbayRelistingOption(int i) {
        return this.ebayRelistingOption[i];
    }

    public void setEbayRelistingOption(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.ebayRelistingOption[i] = _value;
    }


    /**
     * Gets the effectiveBomControl value for this ItemSearchRowBasic.
     * 
     * @return effectiveBomControl
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getEffectiveBomControl() {
        return effectiveBomControl;
    }


    /**
     * Sets the effectiveBomControl value for this ItemSearchRowBasic.
     * 
     * @param effectiveBomControl
     */
    public void setEffectiveBomControl(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] effectiveBomControl) {
        this.effectiveBomControl = effectiveBomControl;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getEffectiveBomControl(int i) {
        return this.effectiveBomControl[i];
    }

    public void setEffectiveBomControl(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.effectiveBomControl[i] = _value;
    }


    /**
     * Gets the effectiveDate value for this ItemSearchRowBasic.
     * 
     * @return effectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ItemSearchRowBasic.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEffectiveDate(int i) {
        return this.effectiveDate[i];
    }

    public void setEffectiveDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.effectiveDate[i] = _value;
    }


    /**
     * Gets the effectiveRevision value for this ItemSearchRowBasic.
     * 
     * @return effectiveRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEffectiveRevision() {
        return effectiveRevision;
    }


    /**
     * Sets the effectiveRevision value for this ItemSearchRowBasic.
     * 
     * @param effectiveRevision
     */
    public void setEffectiveRevision(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] effectiveRevision) {
        this.effectiveRevision = effectiveRevision;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEffectiveRevision(int i) {
        return this.effectiveRevision[i];
    }

    public void setEffectiveRevision(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.effectiveRevision[i] = _value;
    }


    /**
     * Gets the endAuctionsWhenOutOfStock value for this ItemSearchRowBasic.
     * 
     * @return endAuctionsWhenOutOfStock
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getEndAuctionsWhenOutOfStock() {
        return endAuctionsWhenOutOfStock;
    }


    /**
     * Sets the endAuctionsWhenOutOfStock value for this ItemSearchRowBasic.
     * 
     * @param endAuctionsWhenOutOfStock
     */
    public void setEndAuctionsWhenOutOfStock(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] endAuctionsWhenOutOfStock) {
        this.endAuctionsWhenOutOfStock = endAuctionsWhenOutOfStock;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getEndAuctionsWhenOutOfStock(int i) {
        return this.endAuctionsWhenOutOfStock[i];
    }

    public void setEndAuctionsWhenOutOfStock(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.endAuctionsWhenOutOfStock[i] = _value;
    }


    /**
     * Gets the excludeFromSitemap value for this ItemSearchRowBasic.
     * 
     * @return excludeFromSitemap
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this ItemSearchRowBasic.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getExcludeFromSitemap(int i) {
        return this.excludeFromSitemap[i];
    }

    public void setExcludeFromSitemap(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.excludeFromSitemap[i] = _value;
    }


    /**
     * Gets the expenseAccount value for this ItemSearchRowBasic.
     * 
     * @return expenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this ItemSearchRowBasic.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExpenseAccount(int i) {
        return this.expenseAccount[i];
    }

    public void setExpenseAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.expenseAccount[i] = _value;
    }


    /**
     * Gets the externalId value for this ItemSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ItemSearchRowBasic.
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
     * Gets the featuredDescription value for this ItemSearchRowBasic.
     * 
     * @return featuredDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this ItemSearchRowBasic.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] featuredDescription) {
        this.featuredDescription = featuredDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFeaturedDescription(int i) {
        return this.featuredDescription[i];
    }

    public void setFeaturedDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.featuredDescription[i] = _value;
    }


    /**
     * Gets the feedDescription value for this ItemSearchRowBasic.
     * 
     * @return feedDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFeedDescription() {
        return feedDescription;
    }


    /**
     * Sets the feedDescription value for this ItemSearchRowBasic.
     * 
     * @param feedDescription
     */
    public void setFeedDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] feedDescription) {
        this.feedDescription = feedDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFeedDescription(int i) {
        return this.feedDescription[i];
    }

    public void setFeedDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.feedDescription[i] = _value;
    }


    /**
     * Gets the feedName value for this ItemSearchRowBasic.
     * 
     * @return feedName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFeedName() {
        return feedName;
    }


    /**
     * Sets the feedName value for this ItemSearchRowBasic.
     * 
     * @param feedName
     */
    public void setFeedName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] feedName) {
        this.feedName = feedName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFeedName(int i) {
        return this.feedName[i];
    }

    public void setFeedName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.feedName[i] = _value;
    }


    /**
     * Gets the fixedLotSize value for this ItemSearchRowBasic.
     * 
     * @return fixedLotSize
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFixedLotSize() {
        return fixedLotSize;
    }


    /**
     * Sets the fixedLotSize value for this ItemSearchRowBasic.
     * 
     * @param fixedLotSize
     */
    public void setFixedLotSize(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fixedLotSize) {
        this.fixedLotSize = fixedLotSize;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFixedLotSize(int i) {
        return this.fixedLotSize[i];
    }

    public void setFixedLotSize(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fixedLotSize[i] = _value;
    }


    /**
     * Gets the forwardConsumptionDays value for this ItemSearchRowBasic.
     * 
     * @return forwardConsumptionDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getForwardConsumptionDays() {
        return forwardConsumptionDays;
    }


    /**
     * Sets the forwardConsumptionDays value for this ItemSearchRowBasic.
     * 
     * @param forwardConsumptionDays
     */
    public void setForwardConsumptionDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] forwardConsumptionDays) {
        this.forwardConsumptionDays = forwardConsumptionDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getForwardConsumptionDays(int i) {
        return this.forwardConsumptionDays[i];
    }

    public void setForwardConsumptionDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.forwardConsumptionDays[i] = _value;
    }


    /**
     * Gets the fraudRisk value for this ItemSearchRowBasic.
     * 
     * @return fraudRisk
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getFraudRisk() {
        return fraudRisk;
    }


    /**
     * Sets the fraudRisk value for this ItemSearchRowBasic.
     * 
     * @param fraudRisk
     */
    public void setFraudRisk(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] fraudRisk) {
        this.fraudRisk = fraudRisk;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getFraudRisk(int i) {
        return this.fraudRisk[i];
    }

    public void setFraudRisk(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.fraudRisk[i] = _value;
    }


    /**
     * Gets the froogleProductFeed value for this ItemSearchRowBasic.
     * 
     * @return froogleProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getFroogleProductFeed() {
        return froogleProductFeed;
    }


    /**
     * Sets the froogleProductFeed value for this ItemSearchRowBasic.
     * 
     * @param froogleProductFeed
     */
    public void setFroogleProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] froogleProductFeed) {
        this.froogleProductFeed = froogleProductFeed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getFroogleProductFeed(int i) {
        return this.froogleProductFeed[i];
    }

    public void setFroogleProductFeed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.froogleProductFeed[i] = _value;
    }


    /**
     * Gets the fxCost value for this ItemSearchRowBasic.
     * 
     * @return fxCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxCost() {
        return fxCost;
    }


    /**
     * Sets the fxCost value for this ItemSearchRowBasic.
     * 
     * @param fxCost
     */
    public void setFxCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxCost) {
        this.fxCost = fxCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxCost(int i) {
        return this.fxCost[i];
    }

    public void setFxCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxCost[i] = _value;
    }


    /**
     * Gets the gainLossAccount value for this ItemSearchRowBasic.
     * 
     * @return gainLossAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getGainLossAccount() {
        return gainLossAccount;
    }


    /**
     * Sets the gainLossAccount value for this ItemSearchRowBasic.
     * 
     * @param gainLossAccount
     */
    public void setGainLossAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] gainLossAccount) {
        this.gainLossAccount = gainLossAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getGainLossAccount(int i) {
        return this.gainLossAccount[i];
    }

    public void setGainLossAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.gainLossAccount[i] = _value;
    }


    /**
     * Gets the generateAccruals value for this ItemSearchRowBasic.
     * 
     * @return generateAccruals
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getGenerateAccruals() {
        return generateAccruals;
    }


    /**
     * Sets the generateAccruals value for this ItemSearchRowBasic.
     * 
     * @param generateAccruals
     */
    public void setGenerateAccruals(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] generateAccruals) {
        this.generateAccruals = generateAccruals;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getGenerateAccruals(int i) {
        return this.generateAccruals[i];
    }

    public void setGenerateAccruals(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.generateAccruals[i] = _value;
    }


    /**
     * Gets the giftCertAuthCode value for this ItemSearchRowBasic.
     * 
     * @return giftCertAuthCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGiftCertAuthCode() {
        return giftCertAuthCode;
    }


    /**
     * Sets the giftCertAuthCode value for this ItemSearchRowBasic.
     * 
     * @param giftCertAuthCode
     */
    public void setGiftCertAuthCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertAuthCode) {
        this.giftCertAuthCode = giftCertAuthCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGiftCertAuthCode(int i) {
        return this.giftCertAuthCode[i];
    }

    public void setGiftCertAuthCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.giftCertAuthCode[i] = _value;
    }


    /**
     * Gets the giftCertEmail value for this ItemSearchRowBasic.
     * 
     * @return giftCertEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGiftCertEmail() {
        return giftCertEmail;
    }


    /**
     * Sets the giftCertEmail value for this ItemSearchRowBasic.
     * 
     * @param giftCertEmail
     */
    public void setGiftCertEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertEmail) {
        this.giftCertEmail = giftCertEmail;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGiftCertEmail(int i) {
        return this.giftCertEmail[i];
    }

    public void setGiftCertEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.giftCertEmail[i] = _value;
    }


    /**
     * Gets the giftCertExpirationDate value for this ItemSearchRowBasic.
     * 
     * @return giftCertExpirationDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGiftCertExpirationDate() {
        return giftCertExpirationDate;
    }


    /**
     * Sets the giftCertExpirationDate value for this ItemSearchRowBasic.
     * 
     * @param giftCertExpirationDate
     */
    public void setGiftCertExpirationDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertExpirationDate) {
        this.giftCertExpirationDate = giftCertExpirationDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGiftCertExpirationDate(int i) {
        return this.giftCertExpirationDate[i];
    }

    public void setGiftCertExpirationDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.giftCertExpirationDate[i] = _value;
    }


    /**
     * Gets the giftCertFrom value for this ItemSearchRowBasic.
     * 
     * @return giftCertFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGiftCertFrom() {
        return giftCertFrom;
    }


    /**
     * Sets the giftCertFrom value for this ItemSearchRowBasic.
     * 
     * @param giftCertFrom
     */
    public void setGiftCertFrom(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGiftCertFrom(int i) {
        return this.giftCertFrom[i];
    }

    public void setGiftCertFrom(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.giftCertFrom[i] = _value;
    }


    /**
     * Gets the giftCertMessage value for this ItemSearchRowBasic.
     * 
     * @return giftCertMessage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGiftCertMessage() {
        return giftCertMessage;
    }


    /**
     * Sets the giftCertMessage value for this ItemSearchRowBasic.
     * 
     * @param giftCertMessage
     */
    public void setGiftCertMessage(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertMessage) {
        this.giftCertMessage = giftCertMessage;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGiftCertMessage(int i) {
        return this.giftCertMessage[i];
    }

    public void setGiftCertMessage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.giftCertMessage[i] = _value;
    }


    /**
     * Gets the giftCertOriginalAmount value for this ItemSearchRowBasic.
     * 
     * @return giftCertOriginalAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGiftCertOriginalAmount() {
        return giftCertOriginalAmount;
    }


    /**
     * Sets the giftCertOriginalAmount value for this ItemSearchRowBasic.
     * 
     * @param giftCertOriginalAmount
     */
    public void setGiftCertOriginalAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertOriginalAmount) {
        this.giftCertOriginalAmount = giftCertOriginalAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGiftCertOriginalAmount(int i) {
        return this.giftCertOriginalAmount[i];
    }

    public void setGiftCertOriginalAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.giftCertOriginalAmount[i] = _value;
    }


    /**
     * Gets the giftCertRecipient value for this ItemSearchRowBasic.
     * 
     * @return giftCertRecipient
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGiftCertRecipient() {
        return giftCertRecipient;
    }


    /**
     * Sets the giftCertRecipient value for this ItemSearchRowBasic.
     * 
     * @param giftCertRecipient
     */
    public void setGiftCertRecipient(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertRecipient) {
        this.giftCertRecipient = giftCertRecipient;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGiftCertRecipient(int i) {
        return this.giftCertRecipient[i];
    }

    public void setGiftCertRecipient(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.giftCertRecipient[i] = _value;
    }


    /**
     * Gets the hierarchyNode value for this ItemSearchRowBasic.
     * 
     * @return hierarchyNode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getHierarchyNode() {
        return hierarchyNode;
    }


    /**
     * Sets the hierarchyNode value for this ItemSearchRowBasic.
     * 
     * @param hierarchyNode
     */
    public void setHierarchyNode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hierarchyNode) {
        this.hierarchyNode = hierarchyNode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getHierarchyNode(int i) {
        return this.hierarchyNode[i];
    }

    public void setHierarchyNode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.hierarchyNode[i] = _value;
    }


    /**
     * Gets the hierarchyVersion value for this ItemSearchRowBasic.
     * 
     * @return hierarchyVersion
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getHierarchyVersion() {
        return hierarchyVersion;
    }


    /**
     * Sets the hierarchyVersion value for this ItemSearchRowBasic.
     * 
     * @param hierarchyVersion
     */
    public void setHierarchyVersion(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hierarchyVersion) {
        this.hierarchyVersion = hierarchyVersion;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getHierarchyVersion(int i) {
        return this.hierarchyVersion[i];
    }

    public void setHierarchyVersion(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.hierarchyVersion[i] = _value;
    }


    /**
     * Gets the hits value for this ItemSearchRowBasic.
     * 
     * @return hits
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this ItemSearchRowBasic.
     * 
     * @param hits
     */
    public void setHits(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] hits) {
        this.hits = hits;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getHits(int i) {
        return this.hits[i];
    }

    public void setHits(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.hits[i] = _value;
    }


    /**
     * Gets the imageUrl value for this ItemSearchRowBasic.
     * 
     * @return imageUrl
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this ItemSearchRowBasic.
     * 
     * @param imageUrl
     */
    public void setImageUrl(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] imageUrl) {
        this.imageUrl = imageUrl;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getImageUrl(int i) {
        return this.imageUrl[i];
    }

    public void setImageUrl(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.imageUrl[i] = _value;
    }


    /**
     * Gets the includeChildren value for this ItemSearchRowBasic.
     * 
     * @return includeChildren
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this ItemSearchRowBasic.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] includeChildren) {
        this.includeChildren = includeChildren;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIncludeChildren(int i) {
        return this.includeChildren[i];
    }

    public void setIncludeChildren(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.includeChildren[i] = _value;
    }


    /**
     * Gets the incomeAccount value for this ItemSearchRowBasic.
     * 
     * @return incomeAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIncomeAccount() {
        return incomeAccount;
    }


    /**
     * Sets the incomeAccount value for this ItemSearchRowBasic.
     * 
     * @param incomeAccount
     */
    public void setIncomeAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] incomeAccount) {
        this.incomeAccount = incomeAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getIncomeAccount(int i) {
        return this.incomeAccount[i];
    }

    public void setIncomeAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.incomeAccount[i] = _value;
    }


    /**
     * Gets the intercoDefRevAccount value for this ItemSearchRowBasic.
     * 
     * @return intercoDefRevAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIntercoDefRevAccount() {
        return intercoDefRevAccount;
    }


    /**
     * Sets the intercoDefRevAccount value for this ItemSearchRowBasic.
     * 
     * @param intercoDefRevAccount
     */
    public void setIntercoDefRevAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] intercoDefRevAccount) {
        this.intercoDefRevAccount = intercoDefRevAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getIntercoDefRevAccount(int i) {
        return this.intercoDefRevAccount[i];
    }

    public void setIntercoDefRevAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.intercoDefRevAccount[i] = _value;
    }


    /**
     * Gets the intercoExpenseAccount value for this ItemSearchRowBasic.
     * 
     * @return intercoExpenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIntercoExpenseAccount() {
        return intercoExpenseAccount;
    }


    /**
     * Sets the intercoExpenseAccount value for this ItemSearchRowBasic.
     * 
     * @param intercoExpenseAccount
     */
    public void setIntercoExpenseAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] intercoExpenseAccount) {
        this.intercoExpenseAccount = intercoExpenseAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getIntercoExpenseAccount(int i) {
        return this.intercoExpenseAccount[i];
    }

    public void setIntercoExpenseAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.intercoExpenseAccount[i] = _value;
    }


    /**
     * Gets the intercoIncomeAccount value for this ItemSearchRowBasic.
     * 
     * @return intercoIncomeAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIntercoIncomeAccount() {
        return intercoIncomeAccount;
    }


    /**
     * Sets the intercoIncomeAccount value for this ItemSearchRowBasic.
     * 
     * @param intercoIncomeAccount
     */
    public void setIntercoIncomeAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] intercoIncomeAccount) {
        this.intercoIncomeAccount = intercoIncomeAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getIntercoIncomeAccount(int i) {
        return this.intercoIncomeAccount[i];
    }

    public void setIntercoIncomeAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.intercoIncomeAccount[i] = _value;
    }


    /**
     * Gets the internalId value for this ItemSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemSearchRowBasic.
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
     * Gets the inventoryLocation value for this ItemSearchRowBasic.
     * 
     * @return inventoryLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInventoryLocation() {
        return inventoryLocation;
    }


    /**
     * Sets the inventoryLocation value for this ItemSearchRowBasic.
     * 
     * @param inventoryLocation
     */
    public void setInventoryLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInventoryLocation(int i) {
        return this.inventoryLocation[i];
    }

    public void setInventoryLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.inventoryLocation[i] = _value;
    }


    /**
     * Gets the invtClassification value for this ItemSearchRowBasic.
     * 
     * @return invtClassification
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getInvtClassification() {
        return invtClassification;
    }


    /**
     * Sets the invtClassification value for this ItemSearchRowBasic.
     * 
     * @param invtClassification
     */
    public void setInvtClassification(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] invtClassification) {
        this.invtClassification = invtClassification;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getInvtClassification(int i) {
        return this.invtClassification[i];
    }

    public void setInvtClassification(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.invtClassification[i] = _value;
    }


    /**
     * Gets the invtCountInterval value for this ItemSearchRowBasic.
     * 
     * @return invtCountInterval
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getInvtCountInterval() {
        return invtCountInterval;
    }


    /**
     * Sets the invtCountInterval value for this ItemSearchRowBasic.
     * 
     * @param invtCountInterval
     */
    public void setInvtCountInterval(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] invtCountInterval) {
        this.invtCountInterval = invtCountInterval;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getInvtCountInterval(int i) {
        return this.invtCountInterval[i];
    }

    public void setInvtCountInterval(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.invtCountInterval[i] = _value;
    }


    /**
     * Gets the isAvailable value for this ItemSearchRowBasic.
     * 
     * @return isAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this ItemSearchRowBasic.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isAvailable) {
        this.isAvailable = isAvailable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsAvailable(int i) {
        return this.isAvailable[i];
    }

    public void setIsAvailable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isAvailable[i] = _value;
    }


    /**
     * Gets the isDropShipItem value for this ItemSearchRowBasic.
     * 
     * @return isDropShipItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsDropShipItem() {
        return isDropShipItem;
    }


    /**
     * Sets the isDropShipItem value for this ItemSearchRowBasic.
     * 
     * @param isDropShipItem
     */
    public void setIsDropShipItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDropShipItem) {
        this.isDropShipItem = isDropShipItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsDropShipItem(int i) {
        return this.isDropShipItem[i];
    }

    public void setIsDropShipItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isDropShipItem[i] = _value;
    }


    /**
     * Gets the isFulfillable value for this ItemSearchRowBasic.
     * 
     * @return isFulfillable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this ItemSearchRowBasic.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isFulfillable) {
        this.isFulfillable = isFulfillable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsFulfillable(int i) {
        return this.isFulfillable[i];
    }

    public void setIsFulfillable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isFulfillable[i] = _value;
    }


    /**
     * Gets the isGcoCompliant value for this ItemSearchRowBasic.
     * 
     * @return isGcoCompliant
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsGcoCompliant() {
        return isGcoCompliant;
    }


    /**
     * Sets the isGcoCompliant value for this ItemSearchRowBasic.
     * 
     * @param isGcoCompliant
     */
    public void setIsGcoCompliant(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsGcoCompliant(int i) {
        return this.isGcoCompliant[i];
    }

    public void setIsGcoCompliant(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isGcoCompliant[i] = _value;
    }


    /**
     * Gets the isInactive value for this ItemSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this ItemSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the isLotItem value for this ItemSearchRowBasic.
     * 
     * @return isLotItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsLotItem() {
        return isLotItem;
    }


    /**
     * Sets the isLotItem value for this ItemSearchRowBasic.
     * 
     * @param isLotItem
     */
    public void setIsLotItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isLotItem) {
        this.isLotItem = isLotItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsLotItem(int i) {
        return this.isLotItem[i];
    }

    public void setIsLotItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isLotItem[i] = _value;
    }


    /**
     * Gets the isOnline value for this ItemSearchRowBasic.
     * 
     * @return isOnline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this ItemSearchRowBasic.
     * 
     * @param isOnline
     */
    public void setIsOnline(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isOnline) {
        this.isOnline = isOnline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsOnline(int i) {
        return this.isOnline[i];
    }

    public void setIsOnline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isOnline[i] = _value;
    }


    /**
     * Gets the isSerialItem value for this ItemSearchRowBasic.
     * 
     * @return isSerialItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsSerialItem() {
        return isSerialItem;
    }


    /**
     * Sets the isSerialItem value for this ItemSearchRowBasic.
     * 
     * @param isSerialItem
     */
    public void setIsSerialItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSerialItem) {
        this.isSerialItem = isSerialItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsSerialItem(int i) {
        return this.isSerialItem[i];
    }

    public void setIsSerialItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isSerialItem[i] = _value;
    }


    /**
     * Gets the isSpecialOrderItem value for this ItemSearchRowBasic.
     * 
     * @return isSpecialOrderItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsSpecialOrderItem() {
        return isSpecialOrderItem;
    }


    /**
     * Sets the isSpecialOrderItem value for this ItemSearchRowBasic.
     * 
     * @param isSpecialOrderItem
     */
    public void setIsSpecialOrderItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSpecialOrderItem) {
        this.isSpecialOrderItem = isSpecialOrderItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsSpecialOrderItem(int i) {
        return this.isSpecialOrderItem[i];
    }

    public void setIsSpecialOrderItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isSpecialOrderItem[i] = _value;
    }


    /**
     * Gets the isSpecialWorkOrderItem value for this ItemSearchRowBasic.
     * 
     * @return isSpecialWorkOrderItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsSpecialWorkOrderItem() {
        return isSpecialWorkOrderItem;
    }


    /**
     * Sets the isSpecialWorkOrderItem value for this ItemSearchRowBasic.
     * 
     * @param isSpecialWorkOrderItem
     */
    public void setIsSpecialWorkOrderItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSpecialWorkOrderItem) {
        this.isSpecialWorkOrderItem = isSpecialWorkOrderItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsSpecialWorkOrderItem(int i) {
        return this.isSpecialWorkOrderItem[i];
    }

    public void setIsSpecialWorkOrderItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isSpecialWorkOrderItem[i] = _value;
    }


    /**
     * Gets the isStorePickupAllowed value for this ItemSearchRowBasic.
     * 
     * @return isStorePickupAllowed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsStorePickupAllowed() {
        return isStorePickupAllowed;
    }


    /**
     * Sets the isStorePickupAllowed value for this ItemSearchRowBasic.
     * 
     * @param isStorePickupAllowed
     */
    public void setIsStorePickupAllowed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isStorePickupAllowed) {
        this.isStorePickupAllowed = isStorePickupAllowed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsStorePickupAllowed(int i) {
        return this.isStorePickupAllowed[i];
    }

    public void setIsStorePickupAllowed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isStorePickupAllowed[i] = _value;
    }


    /**
     * Gets the issueProduct value for this ItemSearchRowBasic.
     * 
     * @return issueProduct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this ItemSearchRowBasic.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] issueProduct) {
        this.issueProduct = issueProduct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getIssueProduct(int i) {
        return this.issueProduct[i];
    }

    public void setIssueProduct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.issueProduct[i] = _value;
    }


    /**
     * Gets the isTaxable value for this ItemSearchRowBasic.
     * 
     * @return isTaxable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this ItemSearchRowBasic.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isTaxable) {
        this.isTaxable = isTaxable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsTaxable(int i) {
        return this.isTaxable[i];
    }

    public void setIsTaxable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isTaxable[i] = _value;
    }


    /**
     * Gets the isVsoeBundle value for this ItemSearchRowBasic.
     * 
     * @return isVsoeBundle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsVsoeBundle() {
        return isVsoeBundle;
    }


    /**
     * Sets the isVsoeBundle value for this ItemSearchRowBasic.
     * 
     * @param isVsoeBundle
     */
    public void setIsVsoeBundle(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isVsoeBundle) {
        this.isVsoeBundle = isVsoeBundle;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsVsoeBundle(int i) {
        return this.isVsoeBundle[i];
    }

    public void setIsVsoeBundle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isVsoeBundle[i] = _value;
    }


    /**
     * Gets the isWip value for this ItemSearchRowBasic.
     * 
     * @return isWip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsWip() {
        return isWip;
    }


    /**
     * Sets the isWip value for this ItemSearchRowBasic.
     * 
     * @param isWip
     */
    public void setIsWip(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isWip) {
        this.isWip = isWip;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsWip(int i) {
        return this.isWip[i];
    }

    public void setIsWip(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isWip[i] = _value;
    }


    /**
     * Gets the itemId value for this ItemSearchRowBasic.
     * 
     * @return itemId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemSearchRowBasic.
     * 
     * @param itemId
     */
    public void setItemId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemId) {
        this.itemId = itemId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getItemId(int i) {
        return this.itemId[i];
    }

    public void setItemId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.itemId[i] = _value;
    }


    /**
     * Gets the itemRevenueCategory value for this ItemSearchRowBasic.
     * 
     * @return itemRevenueCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItemRevenueCategory() {
        return itemRevenueCategory;
    }


    /**
     * Sets the itemRevenueCategory value for this ItemSearchRowBasic.
     * 
     * @param itemRevenueCategory
     */
    public void setItemRevenueCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getItemRevenueCategory(int i) {
        return this.itemRevenueCategory[i];
    }

    public void setItemRevenueCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.itemRevenueCategory[i] = _value;
    }


    /**
     * Gets the itemUrl value for this ItemSearchRowBasic.
     * 
     * @return itemUrl
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getItemUrl() {
        return itemUrl;
    }


    /**
     * Sets the itemUrl value for this ItemSearchRowBasic.
     * 
     * @param itemUrl
     */
    public void setItemUrl(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemUrl) {
        this.itemUrl = itemUrl;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getItemUrl(int i) {
        return this.itemUrl[i];
    }

    public void setItemUrl(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.itemUrl[i] = _value;
    }


    /**
     * Gets the lastInvtCountDate value for this ItemSearchRowBasic.
     * 
     * @return lastInvtCountDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastInvtCountDate() {
        return lastInvtCountDate;
    }


    /**
     * Sets the lastInvtCountDate value for this ItemSearchRowBasic.
     * 
     * @param lastInvtCountDate
     */
    public void setLastInvtCountDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastInvtCountDate) {
        this.lastInvtCountDate = lastInvtCountDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastInvtCountDate(int i) {
        return this.lastInvtCountDate[i];
    }

    public void setLastInvtCountDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastInvtCountDate[i] = _value;
    }


    /**
     * Gets the lastPurchasePrice value for this ItemSearchRowBasic.
     * 
     * @return lastPurchasePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLastPurchasePrice() {
        return lastPurchasePrice;
    }


    /**
     * Sets the lastPurchasePrice value for this ItemSearchRowBasic.
     * 
     * @param lastPurchasePrice
     */
    public void setLastPurchasePrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLastPurchasePrice(int i) {
        return this.lastPurchasePrice[i];
    }

    public void setLastPurchasePrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.lastPurchasePrice[i] = _value;
    }


    /**
     * Gets the lastQuantityAvailableChange value for this ItemSearchRowBasic.
     * 
     * @return lastQuantityAvailableChange
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastQuantityAvailableChange() {
        return lastQuantityAvailableChange;
    }


    /**
     * Sets the lastQuantityAvailableChange value for this ItemSearchRowBasic.
     * 
     * @param lastQuantityAvailableChange
     */
    public void setLastQuantityAvailableChange(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastQuantityAvailableChange) {
        this.lastQuantityAvailableChange = lastQuantityAvailableChange;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastQuantityAvailableChange(int i) {
        return this.lastQuantityAvailableChange[i];
    }

    public void setLastQuantityAvailableChange(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastQuantityAvailableChange[i] = _value;
    }


    /**
     * Gets the leadTime value for this ItemSearchRowBasic.
     * 
     * @return leadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLeadTime() {
        return leadTime;
    }


    /**
     * Sets the leadTime value for this ItemSearchRowBasic.
     * 
     * @param leadTime
     */
    public void setLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] leadTime) {
        this.leadTime = leadTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLeadTime(int i) {
        return this.leadTime[i];
    }

    public void setLeadTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.leadTime[i] = _value;
    }


    /**
     * Gets the liabilityAccount value for this ItemSearchRowBasic.
     * 
     * @return liabilityAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLiabilityAccount() {
        return liabilityAccount;
    }


    /**
     * Sets the liabilityAccount value for this ItemSearchRowBasic.
     * 
     * @param liabilityAccount
     */
    public void setLiabilityAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] liabilityAccount) {
        this.liabilityAccount = liabilityAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLiabilityAccount(int i) {
        return this.liabilityAccount[i];
    }

    public void setLiabilityAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.liabilityAccount[i] = _value;
    }


    /**
     * Gets the listingDuration value for this ItemSearchRowBasic.
     * 
     * @return listingDuration
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getListingDuration() {
        return listingDuration;
    }


    /**
     * Sets the listingDuration value for this ItemSearchRowBasic.
     * 
     * @param listingDuration
     */
    public void setListingDuration(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] listingDuration) {
        this.listingDuration = listingDuration;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getListingDuration(int i) {
        return this.listingDuration[i];
    }

    public void setListingDuration(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.listingDuration[i] = _value;
    }


    /**
     * Gets the location value for this ItemSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemSearchRowBasic.
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
     * Gets the locationAllowStorePickup value for this ItemSearchRowBasic.
     * 
     * @return locationAllowStorePickup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getLocationAllowStorePickup() {
        return locationAllowStorePickup;
    }


    /**
     * Sets the locationAllowStorePickup value for this ItemSearchRowBasic.
     * 
     * @param locationAllowStorePickup
     */
    public void setLocationAllowStorePickup(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] locationAllowStorePickup) {
        this.locationAllowStorePickup = locationAllowStorePickup;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getLocationAllowStorePickup(int i) {
        return this.locationAllowStorePickup[i];
    }

    public void setLocationAllowStorePickup(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.locationAllowStorePickup[i] = _value;
    }


    /**
     * Gets the locationAtpLeadTime value for this ItemSearchRowBasic.
     * 
     * @return locationAtpLeadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationAtpLeadTime() {
        return locationAtpLeadTime;
    }


    /**
     * Sets the locationAtpLeadTime value for this ItemSearchRowBasic.
     * 
     * @param locationAtpLeadTime
     */
    public void setLocationAtpLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationAtpLeadTime) {
        this.locationAtpLeadTime = locationAtpLeadTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationAtpLeadTime(int i) {
        return this.locationAtpLeadTime[i];
    }

    public void setLocationAtpLeadTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationAtpLeadTime[i] = _value;
    }


    /**
     * Gets the locationAverageCost value for this ItemSearchRowBasic.
     * 
     * @return locationAverageCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationAverageCost() {
        return locationAverageCost;
    }


    /**
     * Sets the locationAverageCost value for this ItemSearchRowBasic.
     * 
     * @param locationAverageCost
     */
    public void setLocationAverageCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationAverageCost) {
        this.locationAverageCost = locationAverageCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationAverageCost(int i) {
        return this.locationAverageCost[i];
    }

    public void setLocationAverageCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationAverageCost[i] = _value;
    }


    /**
     * Gets the locationBinQuantityAvailable value for this ItemSearchRowBasic.
     * 
     * @return locationBinQuantityAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLocationBinQuantityAvailable() {
        return locationBinQuantityAvailable;
    }


    /**
     * Sets the locationBinQuantityAvailable value for this ItemSearchRowBasic.
     * 
     * @param locationBinQuantityAvailable
     */
    public void setLocationBinQuantityAvailable(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locationBinQuantityAvailable) {
        this.locationBinQuantityAvailable = locationBinQuantityAvailable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLocationBinQuantityAvailable(int i) {
        return this.locationBinQuantityAvailable[i];
    }

    public void setLocationBinQuantityAvailable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.locationBinQuantityAvailable[i] = _value;
    }


    /**
     * Gets the locationBuildTime value for this ItemSearchRowBasic.
     * 
     * @return locationBuildTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationBuildTime() {
        return locationBuildTime;
    }


    /**
     * Sets the locationBuildTime value for this ItemSearchRowBasic.
     * 
     * @param locationBuildTime
     */
    public void setLocationBuildTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationBuildTime) {
        this.locationBuildTime = locationBuildTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationBuildTime(int i) {
        return this.locationBuildTime[i];
    }

    public void setLocationBuildTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationBuildTime[i] = _value;
    }


    /**
     * Gets the locationCost value for this ItemSearchRowBasic.
     * 
     * @return locationCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationCost() {
        return locationCost;
    }


    /**
     * Sets the locationCost value for this ItemSearchRowBasic.
     * 
     * @param locationCost
     */
    public void setLocationCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationCost) {
        this.locationCost = locationCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationCost(int i) {
        return this.locationCost[i];
    }

    public void setLocationCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationCost[i] = _value;
    }


    /**
     * Gets the locationCostAccountingStatus value for this ItemSearchRowBasic.
     * 
     * @return locationCostAccountingStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLocationCostAccountingStatus() {
        return locationCostAccountingStatus;
    }


    /**
     * Sets the locationCostAccountingStatus value for this ItemSearchRowBasic.
     * 
     * @param locationCostAccountingStatus
     */
    public void setLocationCostAccountingStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationCostAccountingStatus) {
        this.locationCostAccountingStatus = locationCostAccountingStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLocationCostAccountingStatus(int i) {
        return this.locationCostAccountingStatus[i];
    }

    public void setLocationCostAccountingStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.locationCostAccountingStatus[i] = _value;
    }


    /**
     * Gets the locationDefaultReturnCost value for this ItemSearchRowBasic.
     * 
     * @return locationDefaultReturnCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationDefaultReturnCost() {
        return locationDefaultReturnCost;
    }


    /**
     * Sets the locationDefaultReturnCost value for this ItemSearchRowBasic.
     * 
     * @param locationDefaultReturnCost
     */
    public void setLocationDefaultReturnCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationDefaultReturnCost) {
        this.locationDefaultReturnCost = locationDefaultReturnCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationDefaultReturnCost(int i) {
        return this.locationDefaultReturnCost[i];
    }

    public void setLocationDefaultReturnCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationDefaultReturnCost[i] = _value;
    }


    /**
     * Gets the locationDemandSource value for this ItemSearchRowBasic.
     * 
     * @return locationDemandSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLocationDemandSource() {
        return locationDemandSource;
    }


    /**
     * Sets the locationDemandSource value for this ItemSearchRowBasic.
     * 
     * @param locationDemandSource
     */
    public void setLocationDemandSource(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationDemandSource) {
        this.locationDemandSource = locationDemandSource;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLocationDemandSource(int i) {
        return this.locationDemandSource[i];
    }

    public void setLocationDemandSource(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.locationDemandSource[i] = _value;
    }


    /**
     * Gets the locationDemandTimeFence value for this ItemSearchRowBasic.
     * 
     * @return locationDemandTimeFence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLocationDemandTimeFence() {
        return locationDemandTimeFence;
    }


    /**
     * Sets the locationDemandTimeFence value for this ItemSearchRowBasic.
     * 
     * @param locationDemandTimeFence
     */
    public void setLocationDemandTimeFence(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationDemandTimeFence) {
        this.locationDemandTimeFence = locationDemandTimeFence;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLocationDemandTimeFence(int i) {
        return this.locationDemandTimeFence[i];
    }

    public void setLocationDemandTimeFence(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.locationDemandTimeFence[i] = _value;
    }


    /**
     * Gets the locationFixedLotSize value for this ItemSearchRowBasic.
     * 
     * @return locationFixedLotSize
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationFixedLotSize() {
        return locationFixedLotSize;
    }


    /**
     * Sets the locationFixedLotSize value for this ItemSearchRowBasic.
     * 
     * @param locationFixedLotSize
     */
    public void setLocationFixedLotSize(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationFixedLotSize) {
        this.locationFixedLotSize = locationFixedLotSize;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationFixedLotSize(int i) {
        return this.locationFixedLotSize[i];
    }

    public void setLocationFixedLotSize(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationFixedLotSize[i] = _value;
    }


    /**
     * Gets the locationInventoryCostTemplate value for this ItemSearchRowBasic.
     * 
     * @return locationInventoryCostTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLocationInventoryCostTemplate() {
        return locationInventoryCostTemplate;
    }


    /**
     * Sets the locationInventoryCostTemplate value for this ItemSearchRowBasic.
     * 
     * @param locationInventoryCostTemplate
     */
    public void setLocationInventoryCostTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locationInventoryCostTemplate) {
        this.locationInventoryCostTemplate = locationInventoryCostTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLocationInventoryCostTemplate(int i) {
        return this.locationInventoryCostTemplate[i];
    }

    public void setLocationInventoryCostTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.locationInventoryCostTemplate[i] = _value;
    }


    /**
     * Gets the locationInvtClassification value for this ItemSearchRowBasic.
     * 
     * @return locationInvtClassification
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLocationInvtClassification() {
        return locationInvtClassification;
    }


    /**
     * Sets the locationInvtClassification value for this ItemSearchRowBasic.
     * 
     * @param locationInvtClassification
     */
    public void setLocationInvtClassification(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationInvtClassification) {
        this.locationInvtClassification = locationInvtClassification;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLocationInvtClassification(int i) {
        return this.locationInvtClassification[i];
    }

    public void setLocationInvtClassification(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.locationInvtClassification[i] = _value;
    }


    /**
     * Gets the locationInvtCountInterval value for this ItemSearchRowBasic.
     * 
     * @return locationInvtCountInterval
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLocationInvtCountInterval() {
        return locationInvtCountInterval;
    }


    /**
     * Sets the locationInvtCountInterval value for this ItemSearchRowBasic.
     * 
     * @param locationInvtCountInterval
     */
    public void setLocationInvtCountInterval(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationInvtCountInterval) {
        this.locationInvtCountInterval = locationInvtCountInterval;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLocationInvtCountInterval(int i) {
        return this.locationInvtCountInterval[i];
    }

    public void setLocationInvtCountInterval(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.locationInvtCountInterval[i] = _value;
    }


    /**
     * Gets the locationLastInvtCountDate value for this ItemSearchRowBasic.
     * 
     * @return locationLastInvtCountDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLocationLastInvtCountDate() {
        return locationLastInvtCountDate;
    }


    /**
     * Sets the locationLastInvtCountDate value for this ItemSearchRowBasic.
     * 
     * @param locationLastInvtCountDate
     */
    public void setLocationLastInvtCountDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] locationLastInvtCountDate) {
        this.locationLastInvtCountDate = locationLastInvtCountDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLocationLastInvtCountDate(int i) {
        return this.locationLastInvtCountDate[i];
    }

    public void setLocationLastInvtCountDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.locationLastInvtCountDate[i] = _value;
    }


    /**
     * Gets the locationLeadTime value for this ItemSearchRowBasic.
     * 
     * @return locationLeadTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLocationLeadTime() {
        return locationLeadTime;
    }


    /**
     * Sets the locationLeadTime value for this ItemSearchRowBasic.
     * 
     * @param locationLeadTime
     */
    public void setLocationLeadTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationLeadTime) {
        this.locationLeadTime = locationLeadTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLocationLeadTime(int i) {
        return this.locationLeadTime[i];
    }

    public void setLocationLeadTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.locationLeadTime[i] = _value;
    }


    /**
     * Gets the locationNextInvtCountDate value for this ItemSearchRowBasic.
     * 
     * @return locationNextInvtCountDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLocationNextInvtCountDate() {
        return locationNextInvtCountDate;
    }


    /**
     * Sets the locationNextInvtCountDate value for this ItemSearchRowBasic.
     * 
     * @param locationNextInvtCountDate
     */
    public void setLocationNextInvtCountDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] locationNextInvtCountDate) {
        this.locationNextInvtCountDate = locationNextInvtCountDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLocationNextInvtCountDate(int i) {
        return this.locationNextInvtCountDate[i];
    }

    public void setLocationNextInvtCountDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.locationNextInvtCountDate[i] = _value;
    }


    /**
     * Gets the locationPeriodicLotSizeDays value for this ItemSearchRowBasic.
     * 
     * @return locationPeriodicLotSizeDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLocationPeriodicLotSizeDays() {
        return locationPeriodicLotSizeDays;
    }


    /**
     * Sets the locationPeriodicLotSizeDays value for this ItemSearchRowBasic.
     * 
     * @param locationPeriodicLotSizeDays
     */
    public void setLocationPeriodicLotSizeDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationPeriodicLotSizeDays) {
        this.locationPeriodicLotSizeDays = locationPeriodicLotSizeDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLocationPeriodicLotSizeDays(int i) {
        return this.locationPeriodicLotSizeDays[i];
    }

    public void setLocationPeriodicLotSizeDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.locationPeriodicLotSizeDays[i] = _value;
    }


    /**
     * Gets the locationPeriodicLotSizeType value for this ItemSearchRowBasic.
     * 
     * @return locationPeriodicLotSizeType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLocationPeriodicLotSizeType() {
        return locationPeriodicLotSizeType;
    }


    /**
     * Sets the locationPeriodicLotSizeType value for this ItemSearchRowBasic.
     * 
     * @param locationPeriodicLotSizeType
     */
    public void setLocationPeriodicLotSizeType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationPeriodicLotSizeType) {
        this.locationPeriodicLotSizeType = locationPeriodicLotSizeType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLocationPeriodicLotSizeType(int i) {
        return this.locationPeriodicLotSizeType[i];
    }

    public void setLocationPeriodicLotSizeType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.locationPeriodicLotSizeType[i] = _value;
    }


    /**
     * Gets the locationPreferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @return locationPreferredStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationPreferredStockLevel() {
        return locationPreferredStockLevel;
    }


    /**
     * Sets the locationPreferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @param locationPreferredStockLevel
     */
    public void setLocationPreferredStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationPreferredStockLevel) {
        this.locationPreferredStockLevel = locationPreferredStockLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationPreferredStockLevel(int i) {
        return this.locationPreferredStockLevel[i];
    }

    public void setLocationPreferredStockLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationPreferredStockLevel[i] = _value;
    }


    /**
     * Gets the locationQtyAvailForStorePickup value for this ItemSearchRowBasic.
     * 
     * @return locationQtyAvailForStorePickup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationQtyAvailForStorePickup() {
        return locationQtyAvailForStorePickup;
    }


    /**
     * Sets the locationQtyAvailForStorePickup value for this ItemSearchRowBasic.
     * 
     * @param locationQtyAvailForStorePickup
     */
    public void setLocationQtyAvailForStorePickup(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQtyAvailForStorePickup) {
        this.locationQtyAvailForStorePickup = locationQtyAvailForStorePickup;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationQtyAvailForStorePickup(int i) {
        return this.locationQtyAvailForStorePickup[i];
    }

    public void setLocationQtyAvailForStorePickup(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationQtyAvailForStorePickup[i] = _value;
    }


    /**
     * Gets the locationQuantityAvailable value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationQuantityAvailable() {
        return locationQuantityAvailable;
    }


    /**
     * Sets the locationQuantityAvailable value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityAvailable
     */
    public void setLocationQuantityAvailable(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityAvailable) {
        this.locationQuantityAvailable = locationQuantityAvailable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationQuantityAvailable(int i) {
        return this.locationQuantityAvailable[i];
    }

    public void setLocationQuantityAvailable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationQuantityAvailable[i] = _value;
    }


    /**
     * Gets the locationQuantityBackOrdered value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityBackOrdered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationQuantityBackOrdered() {
        return locationQuantityBackOrdered;
    }


    /**
     * Sets the locationQuantityBackOrdered value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityBackOrdered
     */
    public void setLocationQuantityBackOrdered(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityBackOrdered) {
        this.locationQuantityBackOrdered = locationQuantityBackOrdered;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationQuantityBackOrdered(int i) {
        return this.locationQuantityBackOrdered[i];
    }

    public void setLocationQuantityBackOrdered(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationQuantityBackOrdered[i] = _value;
    }


    /**
     * Gets the locationQuantityCommitted value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationQuantityCommitted() {
        return locationQuantityCommitted;
    }


    /**
     * Sets the locationQuantityCommitted value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityCommitted
     */
    public void setLocationQuantityCommitted(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityCommitted) {
        this.locationQuantityCommitted = locationQuantityCommitted;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationQuantityCommitted(int i) {
        return this.locationQuantityCommitted[i];
    }

    public void setLocationQuantityCommitted(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationQuantityCommitted[i] = _value;
    }


    /**
     * Gets the locationQuantityInTransit value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityInTransit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationQuantityInTransit() {
        return locationQuantityInTransit;
    }


    /**
     * Sets the locationQuantityInTransit value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityInTransit
     */
    public void setLocationQuantityInTransit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityInTransit) {
        this.locationQuantityInTransit = locationQuantityInTransit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationQuantityInTransit(int i) {
        return this.locationQuantityInTransit[i];
    }

    public void setLocationQuantityInTransit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationQuantityInTransit[i] = _value;
    }


    /**
     * Gets the locationQuantityOnHand value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityOnHand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationQuantityOnHand() {
        return locationQuantityOnHand;
    }


    /**
     * Sets the locationQuantityOnHand value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityOnHand
     */
    public void setLocationQuantityOnHand(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityOnHand) {
        this.locationQuantityOnHand = locationQuantityOnHand;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationQuantityOnHand(int i) {
        return this.locationQuantityOnHand[i];
    }

    public void setLocationQuantityOnHand(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationQuantityOnHand[i] = _value;
    }


    /**
     * Gets the locationQuantityOnOrder value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityOnOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationQuantityOnOrder() {
        return locationQuantityOnOrder;
    }


    /**
     * Sets the locationQuantityOnOrder value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityOnOrder
     */
    public void setLocationQuantityOnOrder(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationQuantityOnOrder) {
        this.locationQuantityOnOrder = locationQuantityOnOrder;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationQuantityOnOrder(int i) {
        return this.locationQuantityOnOrder[i];
    }

    public void setLocationQuantityOnOrder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationQuantityOnOrder[i] = _value;
    }


    /**
     * Gets the locationReOrderPoint value for this ItemSearchRowBasic.
     * 
     * @return locationReOrderPoint
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationReOrderPoint() {
        return locationReOrderPoint;
    }


    /**
     * Sets the locationReOrderPoint value for this ItemSearchRowBasic.
     * 
     * @param locationReOrderPoint
     */
    public void setLocationReOrderPoint(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationReOrderPoint) {
        this.locationReOrderPoint = locationReOrderPoint;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationReOrderPoint(int i) {
        return this.locationReOrderPoint[i];
    }

    public void setLocationReOrderPoint(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationReOrderPoint[i] = _value;
    }


    /**
     * Gets the locationRescheduleInDays value for this ItemSearchRowBasic.
     * 
     * @return locationRescheduleInDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLocationRescheduleInDays() {
        return locationRescheduleInDays;
    }


    /**
     * Sets the locationRescheduleInDays value for this ItemSearchRowBasic.
     * 
     * @param locationRescheduleInDays
     */
    public void setLocationRescheduleInDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationRescheduleInDays) {
        this.locationRescheduleInDays = locationRescheduleInDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLocationRescheduleInDays(int i) {
        return this.locationRescheduleInDays[i];
    }

    public void setLocationRescheduleInDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.locationRescheduleInDays[i] = _value;
    }


    /**
     * Gets the locationRescheduleOutDays value for this ItemSearchRowBasic.
     * 
     * @return locationRescheduleOutDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLocationRescheduleOutDays() {
        return locationRescheduleOutDays;
    }


    /**
     * Sets the locationRescheduleOutDays value for this ItemSearchRowBasic.
     * 
     * @param locationRescheduleOutDays
     */
    public void setLocationRescheduleOutDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationRescheduleOutDays) {
        this.locationRescheduleOutDays = locationRescheduleOutDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLocationRescheduleOutDays(int i) {
        return this.locationRescheduleOutDays[i];
    }

    public void setLocationRescheduleOutDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.locationRescheduleOutDays[i] = _value;
    }


    /**
     * Gets the locationSafetyStockLevel value for this ItemSearchRowBasic.
     * 
     * @return locationSafetyStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationSafetyStockLevel() {
        return locationSafetyStockLevel;
    }


    /**
     * Sets the locationSafetyStockLevel value for this ItemSearchRowBasic.
     * 
     * @param locationSafetyStockLevel
     */
    public void setLocationSafetyStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationSafetyStockLevel) {
        this.locationSafetyStockLevel = locationSafetyStockLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationSafetyStockLevel(int i) {
        return this.locationSafetyStockLevel[i];
    }

    public void setLocationSafetyStockLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationSafetyStockLevel[i] = _value;
    }


    /**
     * Gets the locationStorePickupBufferStock value for this ItemSearchRowBasic.
     * 
     * @return locationStorePickupBufferStock
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationStorePickupBufferStock() {
        return locationStorePickupBufferStock;
    }


    /**
     * Sets the locationStorePickupBufferStock value for this ItemSearchRowBasic.
     * 
     * @param locationStorePickupBufferStock
     */
    public void setLocationStorePickupBufferStock(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationStorePickupBufferStock) {
        this.locationStorePickupBufferStock = locationStorePickupBufferStock;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationStorePickupBufferStock(int i) {
        return this.locationStorePickupBufferStock[i];
    }

    public void setLocationStorePickupBufferStock(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationStorePickupBufferStock[i] = _value;
    }


    /**
     * Gets the locationSupplyLotSizingMethod value for this ItemSearchRowBasic.
     * 
     * @return locationSupplyLotSizingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLocationSupplyLotSizingMethod() {
        return locationSupplyLotSizingMethod;
    }


    /**
     * Sets the locationSupplyLotSizingMethod value for this ItemSearchRowBasic.
     * 
     * @param locationSupplyLotSizingMethod
     */
    public void setLocationSupplyLotSizingMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationSupplyLotSizingMethod) {
        this.locationSupplyLotSizingMethod = locationSupplyLotSizingMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLocationSupplyLotSizingMethod(int i) {
        return this.locationSupplyLotSizingMethod[i];
    }

    public void setLocationSupplyLotSizingMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.locationSupplyLotSizingMethod[i] = _value;
    }


    /**
     * Gets the locationSupplyTimeFence value for this ItemSearchRowBasic.
     * 
     * @return locationSupplyTimeFence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLocationSupplyTimeFence() {
        return locationSupplyTimeFence;
    }


    /**
     * Sets the locationSupplyTimeFence value for this ItemSearchRowBasic.
     * 
     * @param locationSupplyTimeFence
     */
    public void setLocationSupplyTimeFence(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locationSupplyTimeFence) {
        this.locationSupplyTimeFence = locationSupplyTimeFence;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLocationSupplyTimeFence(int i) {
        return this.locationSupplyTimeFence[i];
    }

    public void setLocationSupplyTimeFence(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.locationSupplyTimeFence[i] = _value;
    }


    /**
     * Gets the locationSupplyType value for this ItemSearchRowBasic.
     * 
     * @return locationSupplyType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLocationSupplyType() {
        return locationSupplyType;
    }


    /**
     * Sets the locationSupplyType value for this ItemSearchRowBasic.
     * 
     * @param locationSupplyType
     */
    public void setLocationSupplyType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationSupplyType) {
        this.locationSupplyType = locationSupplyType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLocationSupplyType(int i) {
        return this.locationSupplyType[i];
    }

    public void setLocationSupplyType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.locationSupplyType[i] = _value;
    }


    /**
     * Gets the locationTotalValue value for this ItemSearchRowBasic.
     * 
     * @return locationTotalValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLocationTotalValue() {
        return locationTotalValue;
    }


    /**
     * Sets the locationTotalValue value for this ItemSearchRowBasic.
     * 
     * @param locationTotalValue
     */
    public void setLocationTotalValue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] locationTotalValue) {
        this.locationTotalValue = locationTotalValue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLocationTotalValue(int i) {
        return this.locationTotalValue[i];
    }

    public void setLocationTotalValue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.locationTotalValue[i] = _value;
    }


    /**
     * Gets the locBackwardConsumptionDays value for this ItemSearchRowBasic.
     * 
     * @return locBackwardConsumptionDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLocBackwardConsumptionDays() {
        return locBackwardConsumptionDays;
    }


    /**
     * Sets the locBackwardConsumptionDays value for this ItemSearchRowBasic.
     * 
     * @param locBackwardConsumptionDays
     */
    public void setLocBackwardConsumptionDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locBackwardConsumptionDays) {
        this.locBackwardConsumptionDays = locBackwardConsumptionDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLocBackwardConsumptionDays(int i) {
        return this.locBackwardConsumptionDays[i];
    }

    public void setLocBackwardConsumptionDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.locBackwardConsumptionDays[i] = _value;
    }


    /**
     * Gets the locForwardConsumptionDays value for this ItemSearchRowBasic.
     * 
     * @return locForwardConsumptionDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLocForwardConsumptionDays() {
        return locForwardConsumptionDays;
    }


    /**
     * Sets the locForwardConsumptionDays value for this ItemSearchRowBasic.
     * 
     * @param locForwardConsumptionDays
     */
    public void setLocForwardConsumptionDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] locForwardConsumptionDays) {
        this.locForwardConsumptionDays = locForwardConsumptionDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLocForwardConsumptionDays(int i) {
        return this.locForwardConsumptionDays[i];
    }

    public void setLocForwardConsumptionDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.locForwardConsumptionDays[i] = _value;
    }


    /**
     * Gets the manufacturer value for this ItemSearchRowBasic.
     * 
     * @return manufacturer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this ItemSearchRowBasic.
     * 
     * @param manufacturer
     */
    public void setManufacturer(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturer) {
        this.manufacturer = manufacturer;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getManufacturer(int i) {
        return this.manufacturer[i];
    }

    public void setManufacturer(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.manufacturer[i] = _value;
    }


    /**
     * Gets the manufacturerAddr1 value for this ItemSearchRowBasic.
     * 
     * @return manufacturerAddr1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getManufacturerAddr1() {
        return manufacturerAddr1;
    }


    /**
     * Sets the manufacturerAddr1 value for this ItemSearchRowBasic.
     * 
     * @param manufacturerAddr1
     */
    public void setManufacturerAddr1(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerAddr1) {
        this.manufacturerAddr1 = manufacturerAddr1;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getManufacturerAddr1(int i) {
        return this.manufacturerAddr1[i];
    }

    public void setManufacturerAddr1(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.manufacturerAddr1[i] = _value;
    }


    /**
     * Gets the manufacturerCity value for this ItemSearchRowBasic.
     * 
     * @return manufacturerCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getManufacturerCity() {
        return manufacturerCity;
    }


    /**
     * Sets the manufacturerCity value for this ItemSearchRowBasic.
     * 
     * @param manufacturerCity
     */
    public void setManufacturerCity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getManufacturerCity(int i) {
        return this.manufacturerCity[i];
    }

    public void setManufacturerCity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.manufacturerCity[i] = _value;
    }


    /**
     * Gets the manufacturerState value for this ItemSearchRowBasic.
     * 
     * @return manufacturerState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getManufacturerState() {
        return manufacturerState;
    }


    /**
     * Sets the manufacturerState value for this ItemSearchRowBasic.
     * 
     * @param manufacturerState
     */
    public void setManufacturerState(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerState) {
        this.manufacturerState = manufacturerState;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getManufacturerState(int i) {
        return this.manufacturerState[i];
    }

    public void setManufacturerState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.manufacturerState[i] = _value;
    }


    /**
     * Gets the manufacturerTariff value for this ItemSearchRowBasic.
     * 
     * @return manufacturerTariff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getManufacturerTariff() {
        return manufacturerTariff;
    }


    /**
     * Sets the manufacturerTariff value for this ItemSearchRowBasic.
     * 
     * @param manufacturerTariff
     */
    public void setManufacturerTariff(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getManufacturerTariff(int i) {
        return this.manufacturerTariff[i];
    }

    public void setManufacturerTariff(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.manufacturerTariff[i] = _value;
    }


    /**
     * Gets the manufacturerTaxId value for this ItemSearchRowBasic.
     * 
     * @return manufacturerTaxId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getManufacturerTaxId() {
        return manufacturerTaxId;
    }


    /**
     * Sets the manufacturerTaxId value for this ItemSearchRowBasic.
     * 
     * @param manufacturerTaxId
     */
    public void setManufacturerTaxId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getManufacturerTaxId(int i) {
        return this.manufacturerTaxId[i];
    }

    public void setManufacturerTaxId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.manufacturerTaxId[i] = _value;
    }


    /**
     * Gets the manufacturerZip value for this ItemSearchRowBasic.
     * 
     * @return manufacturerZip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getManufacturerZip() {
        return manufacturerZip;
    }


    /**
     * Sets the manufacturerZip value for this ItemSearchRowBasic.
     * 
     * @param manufacturerZip
     */
    public void setManufacturerZip(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getManufacturerZip(int i) {
        return this.manufacturerZip[i];
    }

    public void setManufacturerZip(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.manufacturerZip[i] = _value;
    }


    /**
     * Gets the manufacturingChargeItem value for this ItemSearchRowBasic.
     * 
     * @return manufacturingChargeItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getManufacturingChargeItem() {
        return manufacturingChargeItem;
    }


    /**
     * Sets the manufacturingChargeItem value for this ItemSearchRowBasic.
     * 
     * @param manufacturingChargeItem
     */
    public void setManufacturingChargeItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] manufacturingChargeItem) {
        this.manufacturingChargeItem = manufacturingChargeItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getManufacturingChargeItem(int i) {
        return this.manufacturingChargeItem[i];
    }

    public void setManufacturingChargeItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.manufacturingChargeItem[i] = _value;
    }


    /**
     * Gets the matchBillToReceipt value for this ItemSearchRowBasic.
     * 
     * @return matchBillToReceipt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMatchBillToReceipt() {
        return matchBillToReceipt;
    }


    /**
     * Sets the matchBillToReceipt value for this ItemSearchRowBasic.
     * 
     * @param matchBillToReceipt
     */
    public void setMatchBillToReceipt(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMatchBillToReceipt(int i) {
        return this.matchBillToReceipt[i];
    }

    public void setMatchBillToReceipt(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.matchBillToReceipt[i] = _value;
    }


    /**
     * Gets the maximumQuantity value for this ItemSearchRowBasic.
     * 
     * @return maximumQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMaximumQuantity() {
        return maximumQuantity;
    }


    /**
     * Sets the maximumQuantity value for this ItemSearchRowBasic.
     * 
     * @param maximumQuantity
     */
    public void setMaximumQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMaximumQuantity(int i) {
        return this.maximumQuantity[i];
    }

    public void setMaximumQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.maximumQuantity[i] = _value;
    }


    /**
     * Gets the memberItem value for this ItemSearchRowBasic.
     * 
     * @return memberItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getMemberItem() {
        return memberItem;
    }


    /**
     * Sets the memberItem value for this ItemSearchRowBasic.
     * 
     * @param memberItem
     */
    public void setMemberItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] memberItem) {
        this.memberItem = memberItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getMemberItem(int i) {
        return this.memberItem[i];
    }

    public void setMemberItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.memberItem[i] = _value;
    }


    /**
     * Gets the memberQuantity value for this ItemSearchRowBasic.
     * 
     * @return memberQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getMemberQuantity() {
        return memberQuantity;
    }


    /**
     * Sets the memberQuantity value for this ItemSearchRowBasic.
     * 
     * @param memberQuantity
     */
    public void setMemberQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] memberQuantity) {
        this.memberQuantity = memberQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getMemberQuantity(int i) {
        return this.memberQuantity[i];
    }

    public void setMemberQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.memberQuantity[i] = _value;
    }


    /**
     * Gets the metaTagHtml value for this ItemSearchRowBasic.
     * 
     * @return metaTagHtml
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this ItemSearchRowBasic.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMetaTagHtml(int i) {
        return this.metaTagHtml[i];
    }

    public void setMetaTagHtml(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.metaTagHtml[i] = _value;
    }


    /**
     * Gets the minimumQuantity value for this ItemSearchRowBasic.
     * 
     * @return minimumQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this ItemSearchRowBasic.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMinimumQuantity(int i) {
        return this.minimumQuantity[i];
    }

    public void setMinimumQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.minimumQuantity[i] = _value;
    }


    /**
     * Gets the modified value for this ItemSearchRowBasic.
     * 
     * @return modified
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this ItemSearchRowBasic.
     * 
     * @param modified
     */
    public void setModified(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] modified) {
        this.modified = modified;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getModified(int i) {
        return this.modified[i];
    }

    public void setModified(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.modified[i] = _value;
    }


    /**
     * Gets the mossApplies value for this ItemSearchRowBasic.
     * 
     * @return mossApplies
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMossApplies() {
        return mossApplies;
    }


    /**
     * Sets the mossApplies value for this ItemSearchRowBasic.
     * 
     * @param mossApplies
     */
    public void setMossApplies(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] mossApplies) {
        this.mossApplies = mossApplies;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMossApplies(int i) {
        return this.mossApplies[i];
    }

    public void setMossApplies(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.mossApplies[i] = _value;
    }


    /**
     * Gets the mpn value for this ItemSearchRowBasic.
     * 
     * @return mpn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMpn() {
        return mpn;
    }


    /**
     * Sets the mpn value for this ItemSearchRowBasic.
     * 
     * @param mpn
     */
    public void setMpn(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mpn) {
        this.mpn = mpn;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMpn(int i) {
        return this.mpn[i];
    }

    public void setMpn(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.mpn[i] = _value;
    }


    /**
     * Gets the multManufactureAddr value for this ItemSearchRowBasic.
     * 
     * @return multManufactureAddr
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMultManufactureAddr() {
        return multManufactureAddr;
    }


    /**
     * Sets the multManufactureAddr value for this ItemSearchRowBasic.
     * 
     * @param multManufactureAddr
     */
    public void setMultManufactureAddr(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMultManufactureAddr(int i) {
        return this.multManufactureAddr[i];
    }

    public void setMultManufactureAddr(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.multManufactureAddr[i] = _value;
    }


    /**
     * Gets the nextagCategory value for this ItemSearchRowBasic.
     * 
     * @return nextagCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNextagCategory() {
        return nextagCategory;
    }


    /**
     * Sets the nextagCategory value for this ItemSearchRowBasic.
     * 
     * @param nextagCategory
     */
    public void setNextagCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nextagCategory) {
        this.nextagCategory = nextagCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNextagCategory(int i) {
        return this.nextagCategory[i];
    }

    public void setNextagCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.nextagCategory[i] = _value;
    }


    /**
     * Gets the nextagProductFeed value for this ItemSearchRowBasic.
     * 
     * @return nextagProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getNextagProductFeed() {
        return nextagProductFeed;
    }


    /**
     * Sets the nextagProductFeed value for this ItemSearchRowBasic.
     * 
     * @param nextagProductFeed
     */
    public void setNextagProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] nextagProductFeed) {
        this.nextagProductFeed = nextagProductFeed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getNextagProductFeed(int i) {
        return this.nextagProductFeed[i];
    }

    public void setNextagProductFeed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.nextagProductFeed[i] = _value;
    }


    /**
     * Gets the nextInvtCountDate value for this ItemSearchRowBasic.
     * 
     * @return nextInvtCountDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getNextInvtCountDate() {
        return nextInvtCountDate;
    }


    /**
     * Sets the nextInvtCountDate value for this ItemSearchRowBasic.
     * 
     * @param nextInvtCountDate
     */
    public void setNextInvtCountDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextInvtCountDate) {
        this.nextInvtCountDate = nextInvtCountDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getNextInvtCountDate(int i) {
        return this.nextInvtCountDate[i];
    }

    public void setNextInvtCountDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.nextInvtCountDate[i] = _value;
    }


    /**
     * Gets the noPriceMessage value for this ItemSearchRowBasic.
     * 
     * @return noPriceMessage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNoPriceMessage() {
        return noPriceMessage;
    }


    /**
     * Sets the noPriceMessage value for this ItemSearchRowBasic.
     * 
     * @param noPriceMessage
     */
    public void setNoPriceMessage(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] noPriceMessage) {
        this.noPriceMessage = noPriceMessage;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNoPriceMessage(int i) {
        return this.noPriceMessage[i];
    }

    public void setNoPriceMessage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.noPriceMessage[i] = _value;
    }


    /**
     * Gets the numActiveListings value for this ItemSearchRowBasic.
     * 
     * @return numActiveListings
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getNumActiveListings() {
        return numActiveListings;
    }


    /**
     * Sets the numActiveListings value for this ItemSearchRowBasic.
     * 
     * @param numActiveListings
     */
    public void setNumActiveListings(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] numActiveListings) {
        this.numActiveListings = numActiveListings;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getNumActiveListings(int i) {
        return this.numActiveListings[i];
    }

    public void setNumActiveListings(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.numActiveListings[i] = _value;
    }


    /**
     * Gets the numberAllowedDownloads value for this ItemSearchRowBasic.
     * 
     * @return numberAllowedDownloads
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNumberAllowedDownloads() {
        return numberAllowedDownloads;
    }


    /**
     * Sets the numberAllowedDownloads value for this ItemSearchRowBasic.
     * 
     * @param numberAllowedDownloads
     */
    public void setNumberAllowedDownloads(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] numberAllowedDownloads) {
        this.numberAllowedDownloads = numberAllowedDownloads;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNumberAllowedDownloads(int i) {
        return this.numberAllowedDownloads[i];
    }

    public void setNumberAllowedDownloads(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.numberAllowedDownloads[i] = _value;
    }


    /**
     * Gets the numCurrentlyListed value for this ItemSearchRowBasic.
     * 
     * @return numCurrentlyListed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getNumCurrentlyListed() {
        return numCurrentlyListed;
    }


    /**
     * Sets the numCurrentlyListed value for this ItemSearchRowBasic.
     * 
     * @param numCurrentlyListed
     */
    public void setNumCurrentlyListed(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] numCurrentlyListed) {
        this.numCurrentlyListed = numCurrentlyListed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getNumCurrentlyListed(int i) {
        return this.numCurrentlyListed[i];
    }

    public void setNumCurrentlyListed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.numCurrentlyListed[i] = _value;
    }


    /**
     * Gets the obsoleteDate value for this ItemSearchRowBasic.
     * 
     * @return obsoleteDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getObsoleteDate() {
        return obsoleteDate;
    }


    /**
     * Sets the obsoleteDate value for this ItemSearchRowBasic.
     * 
     * @param obsoleteDate
     */
    public void setObsoleteDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] obsoleteDate) {
        this.obsoleteDate = obsoleteDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getObsoleteDate(int i) {
        return this.obsoleteDate[i];
    }

    public void setObsoleteDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.obsoleteDate[i] = _value;
    }


    /**
     * Gets the obsoleteRevision value for this ItemSearchRowBasic.
     * 
     * @return obsoleteRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getObsoleteRevision() {
        return obsoleteRevision;
    }


    /**
     * Sets the obsoleteRevision value for this ItemSearchRowBasic.
     * 
     * @param obsoleteRevision
     */
    public void setObsoleteRevision(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] obsoleteRevision) {
        this.obsoleteRevision = obsoleteRevision;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getObsoleteRevision(int i) {
        return this.obsoleteRevision[i];
    }

    public void setObsoleteRevision(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.obsoleteRevision[i] = _value;
    }


    /**
     * Gets the offerSupport value for this ItemSearchRowBasic.
     * 
     * @return offerSupport
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getOfferSupport() {
        return offerSupport;
    }


    /**
     * Sets the offerSupport value for this ItemSearchRowBasic.
     * 
     * @param offerSupport
     */
    public void setOfferSupport(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] offerSupport) {
        this.offerSupport = offerSupport;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getOfferSupport(int i) {
        return this.offerSupport[i];
    }

    public void setOfferSupport(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.offerSupport[i] = _value;
    }


    /**
     * Gets the onlineCustomerPrice value for this ItemSearchRowBasic.
     * 
     * @return onlineCustomerPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getOnlineCustomerPrice() {
        return onlineCustomerPrice;
    }


    /**
     * Sets the onlineCustomerPrice value for this ItemSearchRowBasic.
     * 
     * @param onlineCustomerPrice
     */
    public void setOnlineCustomerPrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] onlineCustomerPrice) {
        this.onlineCustomerPrice = onlineCustomerPrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getOnlineCustomerPrice(int i) {
        return this.onlineCustomerPrice[i];
    }

    public void setOnlineCustomerPrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.onlineCustomerPrice[i] = _value;
    }


    /**
     * Gets the onlinePrice value for this ItemSearchRowBasic.
     * 
     * @return onlinePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getOnlinePrice() {
        return onlinePrice;
    }


    /**
     * Sets the onlinePrice value for this ItemSearchRowBasic.
     * 
     * @param onlinePrice
     */
    public void setOnlinePrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] onlinePrice) {
        this.onlinePrice = onlinePrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getOnlinePrice(int i) {
        return this.onlinePrice[i];
    }

    public void setOnlinePrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.onlinePrice[i] = _value;
    }


    /**
     * Gets the onSpecial value for this ItemSearchRowBasic.
     * 
     * @return onSpecial
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getOnSpecial() {
        return onSpecial;
    }


    /**
     * Sets the onSpecial value for this ItemSearchRowBasic.
     * 
     * @param onSpecial
     */
    public void setOnSpecial(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] onSpecial) {
        this.onSpecial = onSpecial;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getOnSpecial(int i) {
        return this.onSpecial[i];
    }

    public void setOnSpecial(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.onSpecial[i] = _value;
    }


    /**
     * Gets the otherPrices value for this ItemSearchRowBasic.
     * 
     * @return otherPrices
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getOtherPrices() {
        return otherPrices;
    }


    /**
     * Sets the otherPrices value for this ItemSearchRowBasic.
     * 
     * @param otherPrices
     */
    public void setOtherPrices(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] otherPrices) {
        this.otherPrices = otherPrices;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getOtherPrices(int i) {
        return this.otherPrices[i];
    }

    public void setOtherPrices(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.otherPrices[i] = _value;
    }


    /**
     * Gets the otherVendor value for this ItemSearchRowBasic.
     * 
     * @return otherVendor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOtherVendor() {
        return otherVendor;
    }


    /**
     * Sets the otherVendor value for this ItemSearchRowBasic.
     * 
     * @param otherVendor
     */
    public void setOtherVendor(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] otherVendor) {
        this.otherVendor = otherVendor;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOtherVendor(int i) {
        return this.otherVendor[i];
    }

    public void setOtherVendor(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.otherVendor[i] = _value;
    }


    /**
     * Gets the outOfStockBehavior value for this ItemSearchRowBasic.
     * 
     * @return outOfStockBehavior
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getOutOfStockBehavior() {
        return outOfStockBehavior;
    }


    /**
     * Sets the outOfStockBehavior value for this ItemSearchRowBasic.
     * 
     * @param outOfStockBehavior
     */
    public void setOutOfStockBehavior(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getOutOfStockBehavior(int i) {
        return this.outOfStockBehavior[i];
    }

    public void setOutOfStockBehavior(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.outOfStockBehavior[i] = _value;
    }


    /**
     * Gets the outOfStockMessage value for this ItemSearchRowBasic.
     * 
     * @return outOfStockMessage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getOutOfStockMessage() {
        return outOfStockMessage;
    }


    /**
     * Sets the outOfStockMessage value for this ItemSearchRowBasic.
     * 
     * @param outOfStockMessage
     */
    public void setOutOfStockMessage(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getOutOfStockMessage(int i) {
        return this.outOfStockMessage[i];
    }

    public void setOutOfStockMessage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.outOfStockMessage[i] = _value;
    }


    /**
     * Gets the overallQuantityPricingType value for this ItemSearchRowBasic.
     * 
     * @return overallQuantityPricingType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }


    /**
     * Sets the overallQuantityPricingType value for this ItemSearchRowBasic.
     * 
     * @param overallQuantityPricingType
     */
    public void setOverallQuantityPricingType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getOverallQuantityPricingType(int i) {
        return this.overallQuantityPricingType[i];
    }

    public void setOverallQuantityPricingType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.overallQuantityPricingType[i] = _value;
    }


    /**
     * Gets the overheadType value for this ItemSearchRowBasic.
     * 
     * @return overheadType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getOverheadType() {
        return overheadType;
    }


    /**
     * Sets the overheadType value for this ItemSearchRowBasic.
     * 
     * @param overheadType
     */
    public void setOverheadType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] overheadType) {
        this.overheadType = overheadType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getOverheadType(int i) {
        return this.overheadType[i];
    }

    public void setOverheadType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.overheadType[i] = _value;
    }


    /**
     * Gets the pageTitle value for this ItemSearchRowBasic.
     * 
     * @return pageTitle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this ItemSearchRowBasic.
     * 
     * @param pageTitle
     */
    public void setPageTitle(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pageTitle) {
        this.pageTitle = pageTitle;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPageTitle(int i) {
        return this.pageTitle[i];
    }

    public void setPageTitle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.pageTitle[i] = _value;
    }


    /**
     * Gets the parent value for this ItemSearchRowBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ItemSearchRowBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }


    /**
     * Gets the periodicLotSizeDays value for this ItemSearchRowBasic.
     * 
     * @return periodicLotSizeDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getPeriodicLotSizeDays() {
        return periodicLotSizeDays;
    }


    /**
     * Sets the periodicLotSizeDays value for this ItemSearchRowBasic.
     * 
     * @param periodicLotSizeDays
     */
    public void setPeriodicLotSizeDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] periodicLotSizeDays) {
        this.periodicLotSizeDays = periodicLotSizeDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getPeriodicLotSizeDays(int i) {
        return this.periodicLotSizeDays[i];
    }

    public void setPeriodicLotSizeDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.periodicLotSizeDays[i] = _value;
    }


    /**
     * Gets the periodicLotSizeType value for this ItemSearchRowBasic.
     * 
     * @return periodicLotSizeType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getPeriodicLotSizeType() {
        return periodicLotSizeType;
    }


    /**
     * Sets the periodicLotSizeType value for this ItemSearchRowBasic.
     * 
     * @param periodicLotSizeType
     */
    public void setPeriodicLotSizeType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] periodicLotSizeType) {
        this.periodicLotSizeType = periodicLotSizeType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getPeriodicLotSizeType(int i) {
        return this.periodicLotSizeType[i];
    }

    public void setPeriodicLotSizeType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.periodicLotSizeType[i] = _value;
    }


    /**
     * Gets the preferenceCriterion value for this ItemSearchRowBasic.
     * 
     * @return preferenceCriterion
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPreferenceCriterion() {
        return preferenceCriterion;
    }


    /**
     * Sets the preferenceCriterion value for this ItemSearchRowBasic.
     * 
     * @param preferenceCriterion
     */
    public void setPreferenceCriterion(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPreferenceCriterion(int i) {
        return this.preferenceCriterion[i];
    }

    public void setPreferenceCriterion(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.preferenceCriterion[i] = _value;
    }


    /**
     * Gets the preferredBin value for this ItemSearchRowBasic.
     * 
     * @return preferredBin
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPreferredBin() {
        return preferredBin;
    }


    /**
     * Sets the preferredBin value for this ItemSearchRowBasic.
     * 
     * @param preferredBin
     */
    public void setPreferredBin(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] preferredBin) {
        this.preferredBin = preferredBin;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPreferredBin(int i) {
        return this.preferredBin[i];
    }

    public void setPreferredBin(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.preferredBin[i] = _value;
    }


    /**
     * Gets the preferredLocation value for this ItemSearchRowBasic.
     * 
     * @return preferredLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPreferredLocation() {
        return preferredLocation;
    }


    /**
     * Sets the preferredLocation value for this ItemSearchRowBasic.
     * 
     * @param preferredLocation
     */
    public void setPreferredLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPreferredLocation(int i) {
        return this.preferredLocation[i];
    }

    public void setPreferredLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.preferredLocation[i] = _value;
    }


    /**
     * Gets the preferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @return preferredStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPreferredStockLevel() {
        return preferredStockLevel;
    }


    /**
     * Sets the preferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @param preferredStockLevel
     */
    public void setPreferredStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPreferredStockLevel(int i) {
        return this.preferredStockLevel[i];
    }

    public void setPreferredStockLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.preferredStockLevel[i] = _value;
    }


    /**
     * Gets the preferredStockLevelDays value for this ItemSearchRowBasic.
     * 
     * @return preferredStockLevelDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getPreferredStockLevelDays() {
        return preferredStockLevelDays;
    }


    /**
     * Sets the preferredStockLevelDays value for this ItemSearchRowBasic.
     * 
     * @param preferredStockLevelDays
     */
    public void setPreferredStockLevelDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] preferredStockLevelDays) {
        this.preferredStockLevelDays = preferredStockLevelDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getPreferredStockLevelDays(int i) {
        return this.preferredStockLevelDays[i];
    }

    public void setPreferredStockLevelDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.preferredStockLevelDays[i] = _value;
    }


    /**
     * Gets the pricesIncludeTax value for this ItemSearchRowBasic.
     * 
     * @return pricesIncludeTax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPricesIncludeTax() {
        return pricesIncludeTax;
    }


    /**
     * Sets the pricesIncludeTax value for this ItemSearchRowBasic.
     * 
     * @param pricesIncludeTax
     */
    public void setPricesIncludeTax(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPricesIncludeTax(int i) {
        return this.pricesIncludeTax[i];
    }

    public void setPricesIncludeTax(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.pricesIncludeTax[i] = _value;
    }


    /**
     * Gets the pricingGroup value for this ItemSearchRowBasic.
     * 
     * @return pricingGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this ItemSearchRowBasic.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] pricingGroup) {
        this.pricingGroup = pricingGroup;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPricingGroup(int i) {
        return this.pricingGroup[i];
    }

    public void setPricingGroup(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.pricingGroup[i] = _value;
    }


    /**
     * Gets the primaryCategory value for this ItemSearchRowBasic.
     * 
     * @return primaryCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPrimaryCategory() {
        return primaryCategory;
    }


    /**
     * Sets the primaryCategory value for this ItemSearchRowBasic.
     * 
     * @param primaryCategory
     */
    public void setPrimaryCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPrimaryCategory(int i) {
        return this.primaryCategory[i];
    }

    public void setPrimaryCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.primaryCategory[i] = _value;
    }


    /**
     * Gets the prodPriceVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return prodPriceVarianceAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getProdPriceVarianceAcct() {
        return prodPriceVarianceAcct;
    }


    /**
     * Sets the prodPriceVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param prodPriceVarianceAcct
     */
    public void setProdPriceVarianceAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] prodPriceVarianceAcct) {
        this.prodPriceVarianceAcct = prodPriceVarianceAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getProdPriceVarianceAcct(int i) {
        return this.prodPriceVarianceAcct[i];
    }

    public void setProdPriceVarianceAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.prodPriceVarianceAcct[i] = _value;
    }


    /**
     * Gets the prodQtyVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return prodQtyVarianceAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getProdQtyVarianceAcct() {
        return prodQtyVarianceAcct;
    }


    /**
     * Sets the prodQtyVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param prodQtyVarianceAcct
     */
    public void setProdQtyVarianceAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] prodQtyVarianceAcct) {
        this.prodQtyVarianceAcct = prodQtyVarianceAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getProdQtyVarianceAcct(int i) {
        return this.prodQtyVarianceAcct[i];
    }

    public void setProdQtyVarianceAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.prodQtyVarianceAcct[i] = _value;
    }


    /**
     * Gets the purchaseDescription value for this ItemSearchRowBasic.
     * 
     * @return purchaseDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPurchaseDescription() {
        return purchaseDescription;
    }


    /**
     * Sets the purchaseDescription value for this ItemSearchRowBasic.
     * 
     * @param purchaseDescription
     */
    public void setPurchaseDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPurchaseDescription(int i) {
        return this.purchaseDescription[i];
    }

    public void setPurchaseDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.purchaseDescription[i] = _value;
    }


    /**
     * Gets the purchaseOrderAmount value for this ItemSearchRowBasic.
     * 
     * @return purchaseOrderAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this ItemSearchRowBasic.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPurchaseOrderAmount(int i) {
        return this.purchaseOrderAmount[i];
    }

    public void setPurchaseOrderAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.purchaseOrderAmount[i] = _value;
    }


    /**
     * Gets the purchaseOrderQuantity value for this ItemSearchRowBasic.
     * 
     * @return purchaseOrderQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this ItemSearchRowBasic.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPurchaseOrderQuantity(int i) {
        return this.purchaseOrderQuantity[i];
    }

    public void setPurchaseOrderQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.purchaseOrderQuantity[i] = _value;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this ItemSearchRowBasic.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this ItemSearchRowBasic.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPurchaseOrderQuantityDiff(int i) {
        return this.purchaseOrderQuantityDiff[i];
    }

    public void setPurchaseOrderQuantityDiff(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.purchaseOrderQuantityDiff[i] = _value;
    }


    /**
     * Gets the purchasePriceVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return purchasePriceVarianceAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPurchasePriceVarianceAcct() {
        return purchasePriceVarianceAcct;
    }


    /**
     * Sets the purchasePriceVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param purchasePriceVarianceAcct
     */
    public void setPurchasePriceVarianceAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] purchasePriceVarianceAcct) {
        this.purchasePriceVarianceAcct = purchasePriceVarianceAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPurchasePriceVarianceAcct(int i) {
        return this.purchasePriceVarianceAcct[i];
    }

    public void setPurchasePriceVarianceAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.purchasePriceVarianceAcct[i] = _value;
    }


    /**
     * Gets the purchaseUnit value for this ItemSearchRowBasic.
     * 
     * @return purchaseUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPurchaseUnit() {
        return purchaseUnit;
    }


    /**
     * Sets the purchaseUnit value for this ItemSearchRowBasic.
     * 
     * @param purchaseUnit
     */
    public void setPurchaseUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPurchaseUnit(int i) {
        return this.purchaseUnit[i];
    }

    public void setPurchaseUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.purchaseUnit[i] = _value;
    }


    /**
     * Gets the quantityAvailable value for this ItemSearchRowBasic.
     * 
     * @return quantityAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this ItemSearchRowBasic.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityAvailable(int i) {
        return this.quantityAvailable[i];
    }

    public void setQuantityAvailable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityAvailable[i] = _value;
    }


    /**
     * Gets the quantityBackOrdered value for this ItemSearchRowBasic.
     * 
     * @return quantityBackOrdered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this ItemSearchRowBasic.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityBackOrdered(int i) {
        return this.quantityBackOrdered[i];
    }

    public void setQuantityBackOrdered(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityBackOrdered[i] = _value;
    }


    /**
     * Gets the quantityCommitted value for this ItemSearchRowBasic.
     * 
     * @return quantityCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this ItemSearchRowBasic.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityCommitted(int i) {
        return this.quantityCommitted[i];
    }

    public void setQuantityCommitted(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityCommitted[i] = _value;
    }


    /**
     * Gets the quantityOnHand value for this ItemSearchRowBasic.
     * 
     * @return quantityOnHand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this ItemSearchRowBasic.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityOnHand(int i) {
        return this.quantityOnHand[i];
    }

    public void setQuantityOnHand(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityOnHand[i] = _value;
    }


    /**
     * Gets the quantityOnOrder value for this ItemSearchRowBasic.
     * 
     * @return quantityOnOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityOnOrder() {
        return quantityOnOrder;
    }


    /**
     * Sets the quantityOnOrder value for this ItemSearchRowBasic.
     * 
     * @param quantityOnOrder
     */
    public void setQuantityOnOrder(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityOnOrder(int i) {
        return this.quantityOnOrder[i];
    }

    public void setQuantityOnOrder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityOnOrder[i] = _value;
    }


    /**
     * Gets the quantityPricingSchedule value for this ItemSearchRowBasic.
     * 
     * @return quantityPricingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }


    /**
     * Sets the quantityPricingSchedule value for this ItemSearchRowBasic.
     * 
     * @param quantityPricingSchedule
     */
    public void setQuantityPricingSchedule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getQuantityPricingSchedule(int i) {
        return this.quantityPricingSchedule[i];
    }

    public void setQuantityPricingSchedule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.quantityPricingSchedule[i] = _value;
    }


    /**
     * Gets the receiptAmount value for this ItemSearchRowBasic.
     * 
     * @return receiptAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this ItemSearchRowBasic.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReceiptAmount(int i) {
        return this.receiptAmount[i];
    }

    public void setReceiptAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.receiptAmount[i] = _value;
    }


    /**
     * Gets the receiptQuantity value for this ItemSearchRowBasic.
     * 
     * @return receiptQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this ItemSearchRowBasic.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReceiptQuantity(int i) {
        return this.receiptQuantity[i];
    }

    public void setReceiptQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.receiptQuantity[i] = _value;
    }


    /**
     * Gets the receiptQuantityDiff value for this ItemSearchRowBasic.
     * 
     * @return receiptQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this ItemSearchRowBasic.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReceiptQuantityDiff(int i) {
        return this.receiptQuantityDiff[i];
    }

    public void setReceiptQuantityDiff(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.receiptQuantityDiff[i] = _value;
    }


    /**
     * Gets the reorderMultiple value for this ItemSearchRowBasic.
     * 
     * @return reorderMultiple
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getReorderMultiple() {
        return reorderMultiple;
    }


    /**
     * Sets the reorderMultiple value for this ItemSearchRowBasic.
     * 
     * @param reorderMultiple
     */
    public void setReorderMultiple(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] reorderMultiple) {
        this.reorderMultiple = reorderMultiple;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getReorderMultiple(int i) {
        return this.reorderMultiple[i];
    }

    public void setReorderMultiple(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.reorderMultiple[i] = _value;
    }


    /**
     * Gets the reOrderPoint value for this ItemSearchRowBasic.
     * 
     * @return reOrderPoint
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReOrderPoint() {
        return reOrderPoint;
    }


    /**
     * Sets the reOrderPoint value for this ItemSearchRowBasic.
     * 
     * @param reOrderPoint
     */
    public void setReOrderPoint(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] reOrderPoint) {
        this.reOrderPoint = reOrderPoint;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReOrderPoint(int i) {
        return this.reOrderPoint[i];
    }

    public void setReOrderPoint(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.reOrderPoint[i] = _value;
    }


    /**
     * Gets the rescheduleInDays value for this ItemSearchRowBasic.
     * 
     * @return rescheduleInDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getRescheduleInDays() {
        return rescheduleInDays;
    }


    /**
     * Sets the rescheduleInDays value for this ItemSearchRowBasic.
     * 
     * @param rescheduleInDays
     */
    public void setRescheduleInDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] rescheduleInDays) {
        this.rescheduleInDays = rescheduleInDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getRescheduleInDays(int i) {
        return this.rescheduleInDays[i];
    }

    public void setRescheduleInDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.rescheduleInDays[i] = _value;
    }


    /**
     * Gets the rescheduleOutDays value for this ItemSearchRowBasic.
     * 
     * @return rescheduleOutDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getRescheduleOutDays() {
        return rescheduleOutDays;
    }


    /**
     * Sets the rescheduleOutDays value for this ItemSearchRowBasic.
     * 
     * @param rescheduleOutDays
     */
    public void setRescheduleOutDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] rescheduleOutDays) {
        this.rescheduleOutDays = rescheduleOutDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getRescheduleOutDays(int i) {
        return this.rescheduleOutDays[i];
    }

    public void setRescheduleOutDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.rescheduleOutDays[i] = _value;
    }


    /**
     * Gets the reservePrice value for this ItemSearchRowBasic.
     * 
     * @return reservePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReservePrice() {
        return reservePrice;
    }


    /**
     * Sets the reservePrice value for this ItemSearchRowBasic.
     * 
     * @param reservePrice
     */
    public void setReservePrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] reservePrice) {
        this.reservePrice = reservePrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReservePrice(int i) {
        return this.reservePrice[i];
    }

    public void setReservePrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.reservePrice[i] = _value;
    }


    /**
     * Gets the revenueAllocationGroup value for this ItemSearchRowBasic.
     * 
     * @return revenueAllocationGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRevenueAllocationGroup() {
        return revenueAllocationGroup;
    }


    /**
     * Sets the revenueAllocationGroup value for this ItemSearchRowBasic.
     * 
     * @param revenueAllocationGroup
     */
    public void setRevenueAllocationGroup(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revenueAllocationGroup) {
        this.revenueAllocationGroup = revenueAllocationGroup;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRevenueAllocationGroup(int i) {
        return this.revenueAllocationGroup[i];
    }

    public void setRevenueAllocationGroup(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.revenueAllocationGroup[i] = _value;
    }


    /**
     * Gets the revenueRecognitionRule value for this ItemSearchRowBasic.
     * 
     * @return revenueRecognitionRule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }


    /**
     * Sets the revenueRecognitionRule value for this ItemSearchRowBasic.
     * 
     * @param revenueRecognitionRule
     */
    public void setRevenueRecognitionRule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRevenueRecognitionRule(int i) {
        return this.revenueRecognitionRule[i];
    }

    public void setRevenueRecognitionRule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.revenueRecognitionRule[i] = _value;
    }


    /**
     * Gets the revRecForecastRule value for this ItemSearchRowBasic.
     * 
     * @return revRecForecastRule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRevRecForecastRule() {
        return revRecForecastRule;
    }


    /**
     * Sets the revRecForecastRule value for this ItemSearchRowBasic.
     * 
     * @param revRecForecastRule
     */
    public void setRevRecForecastRule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRevRecForecastRule(int i) {
        return this.revRecForecastRule[i];
    }

    public void setRevRecForecastRule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.revRecForecastRule[i] = _value;
    }


    /**
     * Gets the revReclassFXAccount value for this ItemSearchRowBasic.
     * 
     * @return revReclassFXAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRevReclassFXAccount() {
        return revReclassFXAccount;
    }


    /**
     * Sets the revReclassFXAccount value for this ItemSearchRowBasic.
     * 
     * @param revReclassFXAccount
     */
    public void setRevReclassFXAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revReclassFXAccount) {
        this.revReclassFXAccount = revReclassFXAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRevReclassFXAccount(int i) {
        return this.revReclassFXAccount[i];
    }

    public void setRevReclassFXAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.revReclassFXAccount[i] = _value;
    }


    /**
     * Gets the revRecSchedule value for this ItemSearchRowBasic.
     * 
     * @return revRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this ItemSearchRowBasic.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRevRecSchedule(int i) {
        return this.revRecSchedule[i];
    }

    public void setRevRecSchedule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.revRecSchedule[i] = _value;
    }


    /**
     * Gets the roundUpAsComponent value for this ItemSearchRowBasic.
     * 
     * @return roundUpAsComponent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getRoundUpAsComponent() {
        return roundUpAsComponent;
    }


    /**
     * Sets the roundUpAsComponent value for this ItemSearchRowBasic.
     * 
     * @param roundUpAsComponent
     */
    public void setRoundUpAsComponent(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] roundUpAsComponent) {
        this.roundUpAsComponent = roundUpAsComponent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getRoundUpAsComponent(int i) {
        return this.roundUpAsComponent[i];
    }

    public void setRoundUpAsComponent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.roundUpAsComponent[i] = _value;
    }


    /**
     * Gets the safetyStockLevel value for this ItemSearchRowBasic.
     * 
     * @return safetyStockLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getSafetyStockLevel() {
        return safetyStockLevel;
    }


    /**
     * Sets the safetyStockLevel value for this ItemSearchRowBasic.
     * 
     * @param safetyStockLevel
     */
    public void setSafetyStockLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getSafetyStockLevel(int i) {
        return this.safetyStockLevel[i];
    }

    public void setSafetyStockLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.safetyStockLevel[i] = _value;
    }


    /**
     * Gets the safetyStockLevelDays value for this ItemSearchRowBasic.
     * 
     * @return safetyStockLevelDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getSafetyStockLevelDays() {
        return safetyStockLevelDays;
    }


    /**
     * Sets the safetyStockLevelDays value for this ItemSearchRowBasic.
     * 
     * @param safetyStockLevelDays
     */
    public void setSafetyStockLevelDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] safetyStockLevelDays) {
        this.safetyStockLevelDays = safetyStockLevelDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getSafetyStockLevelDays(int i) {
        return this.safetyStockLevelDays[i];
    }

    public void setSafetyStockLevelDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.safetyStockLevelDays[i] = _value;
    }


    /**
     * Gets the salesDescription value for this ItemSearchRowBasic.
     * 
     * @return salesDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSalesDescription() {
        return salesDescription;
    }


    /**
     * Sets the salesDescription value for this ItemSearchRowBasic.
     * 
     * @param salesDescription
     */
    public void setSalesDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesDescription) {
        this.salesDescription = salesDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSalesDescription(int i) {
        return this.salesDescription[i];
    }

    public void setSalesDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.salesDescription[i] = _value;
    }


    /**
     * Gets the salesTaxCode value for this ItemSearchRowBasic.
     * 
     * @return salesTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesTaxCode() {
        return salesTaxCode;
    }


    /**
     * Sets the salesTaxCode value for this ItemSearchRowBasic.
     * 
     * @param salesTaxCode
     */
    public void setSalesTaxCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSalesTaxCode(int i) {
        return this.salesTaxCode[i];
    }

    public void setSalesTaxCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.salesTaxCode[i] = _value;
    }


    /**
     * Gets the saleUnit value for this ItemSearchRowBasic.
     * 
     * @return saleUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSaleUnit() {
        return saleUnit;
    }


    /**
     * Sets the saleUnit value for this ItemSearchRowBasic.
     * 
     * @param saleUnit
     */
    public void setSaleUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] saleUnit) {
        this.saleUnit = saleUnit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSaleUnit(int i) {
        return this.saleUnit[i];
    }

    public void setSaleUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.saleUnit[i] = _value;
    }


    /**
     * Gets the sameAsPrimaryBookAmortization value for this ItemSearchRowBasic.
     * 
     * @return sameAsPrimaryBookAmortization
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getSameAsPrimaryBookAmortization() {
        return sameAsPrimaryBookAmortization;
    }


    /**
     * Sets the sameAsPrimaryBookAmortization value for this ItemSearchRowBasic.
     * 
     * @param sameAsPrimaryBookAmortization
     */
    public void setSameAsPrimaryBookAmortization(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] sameAsPrimaryBookAmortization) {
        this.sameAsPrimaryBookAmortization = sameAsPrimaryBookAmortization;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getSameAsPrimaryBookAmortization(int i) {
        return this.sameAsPrimaryBookAmortization[i];
    }

    public void setSameAsPrimaryBookAmortization(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.sameAsPrimaryBookAmortization[i] = _value;
    }


    /**
     * Gets the sameAsPrimaryBookRevRec value for this ItemSearchRowBasic.
     * 
     * @return sameAsPrimaryBookRevRec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getSameAsPrimaryBookRevRec() {
        return sameAsPrimaryBookRevRec;
    }


    /**
     * Sets the sameAsPrimaryBookRevRec value for this ItemSearchRowBasic.
     * 
     * @param sameAsPrimaryBookRevRec
     */
    public void setSameAsPrimaryBookRevRec(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] sameAsPrimaryBookRevRec) {
        this.sameAsPrimaryBookRevRec = sameAsPrimaryBookRevRec;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getSameAsPrimaryBookRevRec(int i) {
        return this.sameAsPrimaryBookRevRec[i];
    }

    public void setSameAsPrimaryBookRevRec(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.sameAsPrimaryBookRevRec[i] = _value;
    }


    /**
     * Gets the scheduleBCode value for this ItemSearchRowBasic.
     * 
     * @return scheduleBCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getScheduleBCode() {
        return scheduleBCode;
    }


    /**
     * Sets the scheduleBCode value for this ItemSearchRowBasic.
     * 
     * @param scheduleBCode
     */
    public void setScheduleBCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getScheduleBCode(int i) {
        return this.scheduleBCode[i];
    }

    public void setScheduleBCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.scheduleBCode[i] = _value;
    }


    /**
     * Gets the scheduleBNumber value for this ItemSearchRowBasic.
     * 
     * @return scheduleBNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getScheduleBNumber() {
        return scheduleBNumber;
    }


    /**
     * Sets the scheduleBNumber value for this ItemSearchRowBasic.
     * 
     * @param scheduleBNumber
     */
    public void setScheduleBNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getScheduleBNumber(int i) {
        return this.scheduleBNumber[i];
    }

    public void setScheduleBNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.scheduleBNumber[i] = _value;
    }


    /**
     * Gets the scheduleBQuantity value for this ItemSearchRowBasic.
     * 
     * @return scheduleBQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getScheduleBQuantity() {
        return scheduleBQuantity;
    }


    /**
     * Sets the scheduleBQuantity value for this ItemSearchRowBasic.
     * 
     * @param scheduleBQuantity
     */
    public void setScheduleBQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getScheduleBQuantity(int i) {
        return this.scheduleBQuantity[i];
    }

    public void setScheduleBQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.scheduleBQuantity[i] = _value;
    }


    /**
     * Gets the scrapAcct value for this ItemSearchRowBasic.
     * 
     * @return scrapAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getScrapAcct() {
        return scrapAcct;
    }


    /**
     * Sets the scrapAcct value for this ItemSearchRowBasic.
     * 
     * @param scrapAcct
     */
    public void setScrapAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] scrapAcct) {
        this.scrapAcct = scrapAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getScrapAcct(int i) {
        return this.scrapAcct[i];
    }

    public void setScrapAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.scrapAcct[i] = _value;
    }


    /**
     * Gets the searchKeywords value for this ItemSearchRowBasic.
     * 
     * @return searchKeywords
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this ItemSearchRowBasic.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSearchKeywords(int i) {
        return this.searchKeywords[i];
    }

    public void setSearchKeywords(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.searchKeywords[i] = _value;
    }


    /**
     * Gets the seasonalDemand value for this ItemSearchRowBasic.
     * 
     * @return seasonalDemand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getSeasonalDemand() {
        return seasonalDemand;
    }


    /**
     * Sets the seasonalDemand value for this ItemSearchRowBasic.
     * 
     * @param seasonalDemand
     */
    public void setSeasonalDemand(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] seasonalDemand) {
        this.seasonalDemand = seasonalDemand;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getSeasonalDemand(int i) {
        return this.seasonalDemand[i];
    }

    public void setSeasonalDemand(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.seasonalDemand[i] = _value;
    }


    /**
     * Gets the sellOnEBay value for this ItemSearchRowBasic.
     * 
     * @return sellOnEBay
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getSellOnEBay() {
        return sellOnEBay;
    }


    /**
     * Sets the sellOnEBay value for this ItemSearchRowBasic.
     * 
     * @param sellOnEBay
     */
    public void setSellOnEBay(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] sellOnEBay) {
        this.sellOnEBay = sellOnEBay;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getSellOnEBay(int i) {
        return this.sellOnEBay[i];
    }

    public void setSellOnEBay(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.sellOnEBay[i] = _value;
    }


    /**
     * Gets the serialNumber value for this ItemSearchRowBasic.
     * 
     * @return serialNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ItemSearchRowBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumber) {
        this.serialNumber = serialNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSerialNumber(int i) {
        return this.serialNumber[i];
    }

    public void setSerialNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.serialNumber[i] = _value;
    }


    /**
     * Gets the serialNumberLocation value for this ItemSearchRowBasic.
     * 
     * @return serialNumberLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSerialNumberLocation() {
        return serialNumberLocation;
    }


    /**
     * Sets the serialNumberLocation value for this ItemSearchRowBasic.
     * 
     * @param serialNumberLocation
     */
    public void setSerialNumberLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumberLocation) {
        this.serialNumberLocation = serialNumberLocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSerialNumberLocation(int i) {
        return this.serialNumberLocation[i];
    }

    public void setSerialNumberLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.serialNumberLocation[i] = _value;
    }


    /**
     * Gets the shipIndividually value for this ItemSearchRowBasic.
     * 
     * @return shipIndividually
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getShipIndividually() {
        return shipIndividually;
    }


    /**
     * Sets the shipIndividually value for this ItemSearchRowBasic.
     * 
     * @param shipIndividually
     */
    public void setShipIndividually(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shipIndividually) {
        this.shipIndividually = shipIndividually;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getShipIndividually(int i) {
        return this.shipIndividually[i];
    }

    public void setShipIndividually(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.shipIndividually[i] = _value;
    }


    /**
     * Gets the shipPackage value for this ItemSearchRowBasic.
     * 
     * @return shipPackage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getShipPackage() {
        return shipPackage;
    }


    /**
     * Sets the shipPackage value for this ItemSearchRowBasic.
     * 
     * @param shipPackage
     */
    public void setShipPackage(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shipPackage) {
        this.shipPackage = shipPackage;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getShipPackage(int i) {
        return this.shipPackage[i];
    }

    public void setShipPackage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.shipPackage[i] = _value;
    }


    /**
     * Gets the shippingCarrier value for this ItemSearchRowBasic.
     * 
     * @return shippingCarrier
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getShippingCarrier() {
        return shippingCarrier;
    }


    /**
     * Sets the shippingCarrier value for this ItemSearchRowBasic.
     * 
     * @param shippingCarrier
     */
    public void setShippingCarrier(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getShippingCarrier(int i) {
        return this.shippingCarrier[i];
    }

    public void setShippingCarrier(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.shippingCarrier[i] = _value;
    }


    /**
     * Gets the shippingRate value for this ItemSearchRowBasic.
     * 
     * @return shippingRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getShippingRate() {
        return shippingRate;
    }


    /**
     * Sets the shippingRate value for this ItemSearchRowBasic.
     * 
     * @param shippingRate
     */
    public void setShippingRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] shippingRate) {
        this.shippingRate = shippingRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getShippingRate(int i) {
        return this.shippingRate[i];
    }

    public void setShippingRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.shippingRate[i] = _value;
    }


    /**
     * Gets the shoppingDotComCategory value for this ItemSearchRowBasic.
     * 
     * @return shoppingDotComCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }


    /**
     * Sets the shoppingDotComCategory value for this ItemSearchRowBasic.
     * 
     * @param shoppingDotComCategory
     */
    public void setShoppingDotComCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShoppingDotComCategory(int i) {
        return this.shoppingDotComCategory[i];
    }

    public void setShoppingDotComCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shoppingDotComCategory[i] = _value;
    }


    /**
     * Gets the shoppingProductFeed value for this ItemSearchRowBasic.
     * 
     * @return shoppingProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getShoppingProductFeed() {
        return shoppingProductFeed;
    }


    /**
     * Sets the shoppingProductFeed value for this ItemSearchRowBasic.
     * 
     * @param shoppingProductFeed
     */
    public void setShoppingProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shoppingProductFeed) {
        this.shoppingProductFeed = shoppingProductFeed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getShoppingProductFeed(int i) {
        return this.shoppingProductFeed[i];
    }

    public void setShoppingProductFeed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.shoppingProductFeed[i] = _value;
    }


    /**
     * Gets the shopzillaCategoryId value for this ItemSearchRowBasic.
     * 
     * @return shopzillaCategoryId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }


    /**
     * Sets the shopzillaCategoryId value for this ItemSearchRowBasic.
     * 
     * @param shopzillaCategoryId
     */
    public void setShopzillaCategoryId(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getShopzillaCategoryId(int i) {
        return this.shopzillaCategoryId[i];
    }

    public void setShopzillaCategoryId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.shopzillaCategoryId[i] = _value;
    }


    /**
     * Gets the shopzillaProductFeed value for this ItemSearchRowBasic.
     * 
     * @return shopzillaProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getShopzillaProductFeed() {
        return shopzillaProductFeed;
    }


    /**
     * Sets the shopzillaProductFeed value for this ItemSearchRowBasic.
     * 
     * @param shopzillaProductFeed
     */
    public void setShopzillaProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shopzillaProductFeed) {
        this.shopzillaProductFeed = shopzillaProductFeed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getShopzillaProductFeed(int i) {
        return this.shopzillaProductFeed[i];
    }

    public void setShopzillaProductFeed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.shopzillaProductFeed[i] = _value;
    }


    /**
     * Gets the sitemapPriority value for this ItemSearchRowBasic.
     * 
     * @return sitemapPriority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this ItemSearchRowBasic.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getSitemapPriority(int i) {
        return this.sitemapPriority[i];
    }

    public void setSitemapPriority(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.sitemapPriority[i] = _value;
    }


    /**
     * Gets the softDescriptor value for this ItemSearchRowBasic.
     * 
     * @return softDescriptor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this ItemSearchRowBasic.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSoftDescriptor(int i) {
        return this.softDescriptor[i];
    }

    public void setSoftDescriptor(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.softDescriptor[i] = _value;
    }


    /**
     * Gets the startingPrice value for this ItemSearchRowBasic.
     * 
     * @return startingPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getStartingPrice() {
        return startingPrice;
    }


    /**
     * Sets the startingPrice value for this ItemSearchRowBasic.
     * 
     * @param startingPrice
     */
    public void setStartingPrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] startingPrice) {
        this.startingPrice = startingPrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getStartingPrice(int i) {
        return this.startingPrice[i];
    }

    public void setStartingPrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.startingPrice[i] = _value;
    }


    /**
     * Gets the stockDescription value for this ItemSearchRowBasic.
     * 
     * @return stockDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getStockDescription() {
        return stockDescription;
    }


    /**
     * Sets the stockDescription value for this ItemSearchRowBasic.
     * 
     * @param stockDescription
     */
    public void setStockDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] stockDescription) {
        this.stockDescription = stockDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getStockDescription(int i) {
        return this.stockDescription[i];
    }

    public void setStockDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.stockDescription[i] = _value;
    }


    /**
     * Gets the stockUnit value for this ItemSearchRowBasic.
     * 
     * @return stockUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getStockUnit() {
        return stockUnit;
    }


    /**
     * Sets the stockUnit value for this ItemSearchRowBasic.
     * 
     * @param stockUnit
     */
    public void setStockUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] stockUnit) {
        this.stockUnit = stockUnit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getStockUnit(int i) {
        return this.stockUnit[i];
    }

    public void setStockUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.stockUnit[i] = _value;
    }


    /**
     * Gets the storeDescription value for this ItemSearchRowBasic.
     * 
     * @return storeDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getStoreDescription() {
        return storeDescription;
    }


    /**
     * Sets the storeDescription value for this ItemSearchRowBasic.
     * 
     * @param storeDescription
     */
    public void setStoreDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] storeDescription) {
        this.storeDescription = storeDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getStoreDescription(int i) {
        return this.storeDescription[i];
    }

    public void setStoreDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.storeDescription[i] = _value;
    }


    /**
     * Gets the storeDetailedDescription value for this ItemSearchRowBasic.
     * 
     * @return storeDetailedDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getStoreDetailedDescription() {
        return storeDetailedDescription;
    }


    /**
     * Sets the storeDetailedDescription value for this ItemSearchRowBasic.
     * 
     * @param storeDetailedDescription
     */
    public void setStoreDetailedDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getStoreDetailedDescription(int i) {
        return this.storeDetailedDescription[i];
    }

    public void setStoreDetailedDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.storeDetailedDescription[i] = _value;
    }


    /**
     * Gets the storeDisplayImage value for this ItemSearchRowBasic.
     * 
     * @return storeDisplayImage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getStoreDisplayImage() {
        return storeDisplayImage;
    }


    /**
     * Sets the storeDisplayImage value for this ItemSearchRowBasic.
     * 
     * @param storeDisplayImage
     */
    public void setStoreDisplayImage(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getStoreDisplayImage(int i) {
        return this.storeDisplayImage[i];
    }

    public void setStoreDisplayImage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.storeDisplayImage[i] = _value;
    }


    /**
     * Gets the storeDisplayName value for this ItemSearchRowBasic.
     * 
     * @return storeDisplayName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getStoreDisplayName() {
        return storeDisplayName;
    }


    /**
     * Sets the storeDisplayName value for this ItemSearchRowBasic.
     * 
     * @param storeDisplayName
     */
    public void setStoreDisplayName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getStoreDisplayName(int i) {
        return this.storeDisplayName[i];
    }

    public void setStoreDisplayName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.storeDisplayName[i] = _value;
    }


    /**
     * Gets the storeDisplayThumbnail value for this ItemSearchRowBasic.
     * 
     * @return storeDisplayThumbnail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }


    /**
     * Sets the storeDisplayThumbnail value for this ItemSearchRowBasic.
     * 
     * @param storeDisplayThumbnail
     */
    public void setStoreDisplayThumbnail(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getStoreDisplayThumbnail(int i) {
        return this.storeDisplayThumbnail[i];
    }

    public void setStoreDisplayThumbnail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.storeDisplayThumbnail[i] = _value;
    }


    /**
     * Gets the subsidiary value for this ItemSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ItemSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the subType value for this ItemSearchRowBasic.
     * 
     * @return subType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this ItemSearchRowBasic.
     * 
     * @param subType
     */
    public void setSubType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] subType) {
        this.subType = subType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getSubType(int i) {
        return this.subType[i];
    }

    public void setSubType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.subType[i] = _value;
    }


    /**
     * Gets the supplyLotSizingMethod value for this ItemSearchRowBasic.
     * 
     * @return supplyLotSizingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getSupplyLotSizingMethod() {
        return supplyLotSizingMethod;
    }


    /**
     * Sets the supplyLotSizingMethod value for this ItemSearchRowBasic.
     * 
     * @param supplyLotSizingMethod
     */
    public void setSupplyLotSizingMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] supplyLotSizingMethod) {
        this.supplyLotSizingMethod = supplyLotSizingMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getSupplyLotSizingMethod(int i) {
        return this.supplyLotSizingMethod[i];
    }

    public void setSupplyLotSizingMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.supplyLotSizingMethod[i] = _value;
    }


    /**
     * Gets the supplyReplenishmentMethod value for this ItemSearchRowBasic.
     * 
     * @return supplyReplenishmentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getSupplyReplenishmentMethod() {
        return supplyReplenishmentMethod;
    }


    /**
     * Sets the supplyReplenishmentMethod value for this ItemSearchRowBasic.
     * 
     * @param supplyReplenishmentMethod
     */
    public void setSupplyReplenishmentMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] supplyReplenishmentMethod) {
        this.supplyReplenishmentMethod = supplyReplenishmentMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getSupplyReplenishmentMethod(int i) {
        return this.supplyReplenishmentMethod[i];
    }

    public void setSupplyReplenishmentMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.supplyReplenishmentMethod[i] = _value;
    }


    /**
     * Gets the supplyTimeFence value for this ItemSearchRowBasic.
     * 
     * @return supplyTimeFence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getSupplyTimeFence() {
        return supplyTimeFence;
    }


    /**
     * Sets the supplyTimeFence value for this ItemSearchRowBasic.
     * 
     * @param supplyTimeFence
     */
    public void setSupplyTimeFence(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] supplyTimeFence) {
        this.supplyTimeFence = supplyTimeFence;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getSupplyTimeFence(int i) {
        return this.supplyTimeFence[i];
    }

    public void setSupplyTimeFence(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.supplyTimeFence[i] = _value;
    }


    /**
     * Gets the supplyType value for this ItemSearchRowBasic.
     * 
     * @return supplyType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getSupplyType() {
        return supplyType;
    }


    /**
     * Sets the supplyType value for this ItemSearchRowBasic.
     * 
     * @param supplyType
     */
    public void setSupplyType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] supplyType) {
        this.supplyType = supplyType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getSupplyType(int i) {
        return this.supplyType[i];
    }

    public void setSupplyType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.supplyType[i] = _value;
    }


    /**
     * Gets the taxSchedule value for this ItemSearchRowBasic.
     * 
     * @return taxSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this ItemSearchRowBasic.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxSchedule) {
        this.taxSchedule = taxSchedule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxSchedule(int i) {
        return this.taxSchedule[i];
    }

    public void setTaxSchedule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxSchedule[i] = _value;
    }


    /**
     * Gets the thumbNailUrl value for this ItemSearchRowBasic.
     * 
     * @return thumbNailUrl
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getThumbNailUrl() {
        return thumbNailUrl;
    }


    /**
     * Sets the thumbNailUrl value for this ItemSearchRowBasic.
     * 
     * @param thumbNailUrl
     */
    public void setThumbNailUrl(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] thumbNailUrl) {
        this.thumbNailUrl = thumbNailUrl;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getThumbNailUrl(int i) {
        return this.thumbNailUrl[i];
    }

    public void setThumbNailUrl(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.thumbNailUrl[i] = _value;
    }


    /**
     * Gets the totalValue value for this ItemSearchRowBasic.
     * 
     * @return totalValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTotalValue() {
        return totalValue;
    }


    /**
     * Sets the totalValue value for this ItemSearchRowBasic.
     * 
     * @param totalValue
     */
    public void setTotalValue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] totalValue) {
        this.totalValue = totalValue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTotalValue(int i) {
        return this.totalValue[i];
    }

    public void setTotalValue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.totalValue[i] = _value;
    }


    /**
     * Gets the trackLandedCost value for this ItemSearchRowBasic.
     * 
     * @return trackLandedCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getTrackLandedCost() {
        return trackLandedCost;
    }


    /**
     * Sets the trackLandedCost value for this ItemSearchRowBasic.
     * 
     * @param trackLandedCost
     */
    public void setTrackLandedCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] trackLandedCost) {
        this.trackLandedCost = trackLandedCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getTrackLandedCost(int i) {
        return this.trackLandedCost[i];
    }

    public void setTrackLandedCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.trackLandedCost[i] = _value;
    }


    /**
     * Gets the transferPrice value for this ItemSearchRowBasic.
     * 
     * @return transferPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTransferPrice() {
        return transferPrice;
    }


    /**
     * Sets the transferPrice value for this ItemSearchRowBasic.
     * 
     * @param transferPrice
     */
    public void setTransferPrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferPrice) {
        this.transferPrice = transferPrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTransferPrice(int i) {
        return this.transferPrice[i];
    }

    public void setTransferPrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.transferPrice[i] = _value;
    }


    /**
     * Gets the type value for this ItemSearchRowBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this ItemSearchRowBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the unbuildVarianceAccount value for this ItemSearchRowBasic.
     * 
     * @return unbuildVarianceAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getUnbuildVarianceAccount() {
        return unbuildVarianceAccount;
    }


    /**
     * Sets the unbuildVarianceAccount value for this ItemSearchRowBasic.
     * 
     * @param unbuildVarianceAccount
     */
    public void setUnbuildVarianceAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] unbuildVarianceAccount) {
        this.unbuildVarianceAccount = unbuildVarianceAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getUnbuildVarianceAccount(int i) {
        return this.unbuildVarianceAccount[i];
    }

    public void setUnbuildVarianceAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.unbuildVarianceAccount[i] = _value;
    }


    /**
     * Gets the unitsType value for this ItemSearchRowBasic.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this ItemSearchRowBasic.
     * 
     * @param unitsType
     */
    public void setUnitsType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] unitsType) {
        this.unitsType = unitsType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getUnitsType(int i) {
        return this.unitsType[i];
    }

    public void setUnitsType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.unitsType[i] = _value;
    }


    /**
     * Gets the upcCode value for this ItemSearchRowBasic.
     * 
     * @return upcCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this ItemSearchRowBasic.
     * 
     * @param upcCode
     */
    public void setUpcCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] upcCode) {
        this.upcCode = upcCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getUpcCode(int i) {
        return this.upcCode[i];
    }

    public void setUpcCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.upcCode[i] = _value;
    }


    /**
     * Gets the urlComponent value for this ItemSearchRowBasic.
     * 
     * @return urlComponent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this ItemSearchRowBasic.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] urlComponent) {
        this.urlComponent = urlComponent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getUrlComponent(int i) {
        return this.urlComponent[i];
    }

    public void setUrlComponent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.urlComponent[i] = _value;
    }


    /**
     * Gets the useBins value for this ItemSearchRowBasic.
     * 
     * @return useBins
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getUseBins() {
        return useBins;
    }


    /**
     * Sets the useBins value for this ItemSearchRowBasic.
     * 
     * @param useBins
     */
    public void setUseBins(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useBins) {
        this.useBins = useBins;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getUseBins(int i) {
        return this.useBins[i];
    }

    public void setUseBins(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.useBins[i] = _value;
    }


    /**
     * Gets the useComponentYield value for this ItemSearchRowBasic.
     * 
     * @return useComponentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getUseComponentYield() {
        return useComponentYield;
    }


    /**
     * Sets the useComponentYield value for this ItemSearchRowBasic.
     * 
     * @param useComponentYield
     */
    public void setUseComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useComponentYield) {
        this.useComponentYield = useComponentYield;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getUseComponentYield(int i) {
        return this.useComponentYield[i];
    }

    public void setUseComponentYield(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.useComponentYield[i] = _value;
    }


    /**
     * Gets the useMarginalRates value for this ItemSearchRowBasic.
     * 
     * @return useMarginalRates
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getUseMarginalRates() {
        return useMarginalRates;
    }


    /**
     * Sets the useMarginalRates value for this ItemSearchRowBasic.
     * 
     * @param useMarginalRates
     */
    public void setUseMarginalRates(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getUseMarginalRates(int i) {
        return this.useMarginalRates[i];
    }

    public void setUseMarginalRates(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.useMarginalRates[i] = _value;
    }


    /**
     * Gets the vendor value for this ItemSearchRowBasic.
     * 
     * @return vendor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this ItemSearchRowBasic.
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
     * Gets the vendorCode value for this ItemSearchRowBasic.
     * 
     * @return vendorCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getVendorCode() {
        return vendorCode;
    }


    /**
     * Sets the vendorCode value for this ItemSearchRowBasic.
     * 
     * @param vendorCode
     */
    public void setVendorCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vendorCode) {
        this.vendorCode = vendorCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getVendorCode(int i) {
        return this.vendorCode[i];
    }

    public void setVendorCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.vendorCode[i] = _value;
    }


    /**
     * Gets the vendorCost value for this ItemSearchRowBasic.
     * 
     * @return vendorCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getVendorCost() {
        return vendorCost;
    }


    /**
     * Sets the vendorCost value for this ItemSearchRowBasic.
     * 
     * @param vendorCost
     */
    public void setVendorCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vendorCost) {
        this.vendorCost = vendorCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getVendorCost(int i) {
        return this.vendorCost[i];
    }

    public void setVendorCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.vendorCost[i] = _value;
    }


    /**
     * Gets the vendorCostEntered value for this ItemSearchRowBasic.
     * 
     * @return vendorCostEntered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getVendorCostEntered() {
        return vendorCostEntered;
    }


    /**
     * Sets the vendorCostEntered value for this ItemSearchRowBasic.
     * 
     * @param vendorCostEntered
     */
    public void setVendorCostEntered(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vendorCostEntered) {
        this.vendorCostEntered = vendorCostEntered;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getVendorCostEntered(int i) {
        return this.vendorCostEntered[i];
    }

    public void setVendorCostEntered(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.vendorCostEntered[i] = _value;
    }


    /**
     * Gets the vendorName value for this ItemSearchRowBasic.
     * 
     * @return vendorName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this ItemSearchRowBasic.
     * 
     * @param vendorName
     */
    public void setVendorName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vendorName) {
        this.vendorName = vendorName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getVendorName(int i) {
        return this.vendorName[i];
    }

    public void setVendorName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.vendorName[i] = _value;
    }


    /**
     * Gets the vendorPriceCurrency value for this ItemSearchRowBasic.
     * 
     * @return vendorPriceCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getVendorPriceCurrency() {
        return vendorPriceCurrency;
    }


    /**
     * Sets the vendorPriceCurrency value for this ItemSearchRowBasic.
     * 
     * @param vendorPriceCurrency
     */
    public void setVendorPriceCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vendorPriceCurrency) {
        this.vendorPriceCurrency = vendorPriceCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getVendorPriceCurrency(int i) {
        return this.vendorPriceCurrency[i];
    }

    public void setVendorPriceCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.vendorPriceCurrency[i] = _value;
    }


    /**
     * Gets the vendorSchedule value for this ItemSearchRowBasic.
     * 
     * @return vendorSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getVendorSchedule() {
        return vendorSchedule;
    }


    /**
     * Sets the vendorSchedule value for this ItemSearchRowBasic.
     * 
     * @param vendorSchedule
     */
    public void setVendorSchedule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendorSchedule) {
        this.vendorSchedule = vendorSchedule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getVendorSchedule(int i) {
        return this.vendorSchedule[i];
    }

    public void setVendorSchedule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.vendorSchedule[i] = _value;
    }


    /**
     * Gets the vendReturnVarianceAccount value for this ItemSearchRowBasic.
     * 
     * @return vendReturnVarianceAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getVendReturnVarianceAccount() {
        return vendReturnVarianceAccount;
    }


    /**
     * Sets the vendReturnVarianceAccount value for this ItemSearchRowBasic.
     * 
     * @param vendReturnVarianceAccount
     */
    public void setVendReturnVarianceAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendReturnVarianceAccount) {
        this.vendReturnVarianceAccount = vendReturnVarianceAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getVendReturnVarianceAccount(int i) {
        return this.vendReturnVarianceAccount[i];
    }

    public void setVendReturnVarianceAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.vendReturnVarianceAccount[i] = _value;
    }


    /**
     * Gets the vsoeDeferral value for this ItemSearchRowBasic.
     * 
     * @return vsoeDeferral
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this ItemSearchRowBasic.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getVsoeDeferral(int i) {
        return this.vsoeDeferral[i];
    }

    public void setVsoeDeferral(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.vsoeDeferral[i] = _value;
    }


    /**
     * Gets the vsoeDelivered value for this ItemSearchRowBasic.
     * 
     * @return vsoeDelivered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this ItemSearchRowBasic.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getVsoeDelivered(int i) {
        return this.vsoeDelivered[i];
    }

    public void setVsoeDelivered(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.vsoeDelivered[i] = _value;
    }


    /**
     * Gets the vsoePermitDiscount value for this ItemSearchRowBasic.
     * 
     * @return vsoePermitDiscount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this ItemSearchRowBasic.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getVsoePermitDiscount(int i) {
        return this.vsoePermitDiscount[i];
    }

    public void setVsoePermitDiscount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.vsoePermitDiscount[i] = _value;
    }


    /**
     * Gets the vsoePrice value for this ItemSearchRowBasic.
     * 
     * @return vsoePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this ItemSearchRowBasic.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getVsoePrice(int i) {
        return this.vsoePrice[i];
    }

    public void setVsoePrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.vsoePrice[i] = _value;
    }


    /**
     * Gets the vsoeSopGroup value for this ItemSearchRowBasic.
     * 
     * @return vsoeSopGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getVsoeSopGroup() {
        return vsoeSopGroup;
    }


    /**
     * Sets the vsoeSopGroup value for this ItemSearchRowBasic.
     * 
     * @param vsoeSopGroup
     */
    public void setVsoeSopGroup(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoeSopGroup) {
        this.vsoeSopGroup = vsoeSopGroup;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getVsoeSopGroup(int i) {
        return this.vsoeSopGroup[i];
    }

    public void setVsoeSopGroup(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.vsoeSopGroup[i] = _value;
    }


    /**
     * Gets the webSite value for this ItemSearchRowBasic.
     * 
     * @return webSite
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getWebSite() {
        return webSite;
    }


    /**
     * Sets the webSite value for this ItemSearchRowBasic.
     * 
     * @param webSite
     */
    public void setWebSite(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] webSite) {
        this.webSite = webSite;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getWebSite(int i) {
        return this.webSite[i];
    }

    public void setWebSite(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.webSite[i] = _value;
    }


    /**
     * Gets the weight value for this ItemSearchRowBasic.
     * 
     * @return weight
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ItemSearchRowBasic.
     * 
     * @param weight
     */
    public void setWeight(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] weight) {
        this.weight = weight;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getWeight(int i) {
        return this.weight[i];
    }

    public void setWeight(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.weight[i] = _value;
    }


    /**
     * Gets the weightUnit value for this ItemSearchRowBasic.
     * 
     * @return weightUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getWeightUnit() {
        return weightUnit;
    }


    /**
     * Sets the weightUnit value for this ItemSearchRowBasic.
     * 
     * @param weightUnit
     */
    public void setWeightUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] weightUnit) {
        this.weightUnit = weightUnit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getWeightUnit(int i) {
        return this.weightUnit[i];
    }

    public void setWeightUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.weightUnit[i] = _value;
    }


    /**
     * Gets the wipAcct value for this ItemSearchRowBasic.
     * 
     * @return wipAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getWipAcct() {
        return wipAcct;
    }


    /**
     * Sets the wipAcct value for this ItemSearchRowBasic.
     * 
     * @param wipAcct
     */
    public void setWipAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] wipAcct) {
        this.wipAcct = wipAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getWipAcct(int i) {
        return this.wipAcct[i];
    }

    public void setWipAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.wipAcct[i] = _value;
    }


    /**
     * Gets the wipVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return wipVarianceAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getWipVarianceAcct() {
        return wipVarianceAcct;
    }


    /**
     * Sets the wipVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param wipVarianceAcct
     */
    public void setWipVarianceAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] wipVarianceAcct) {
        this.wipVarianceAcct = wipVarianceAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getWipVarianceAcct(int i) {
        return this.wipVarianceAcct[i];
    }

    public void setWipVarianceAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.wipVarianceAcct[i] = _value;
    }


    /**
     * Gets the yahooProductFeed value for this ItemSearchRowBasic.
     * 
     * @return yahooProductFeed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getYahooProductFeed() {
        return yahooProductFeed;
    }


    /**
     * Sets the yahooProductFeed value for this ItemSearchRowBasic.
     * 
     * @param yahooProductFeed
     */
    public void setYahooProductFeed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] yahooProductFeed) {
        this.yahooProductFeed = yahooProductFeed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getYahooProductFeed(int i) {
        return this.yahooProductFeed[i];
    }

    public void setYahooProductFeed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.yahooProductFeed[i] = _value;
    }


    /**
     * Gets the customFieldList value for this ItemSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSearchRowBasic)) return false;
        ItemSearchRowBasic other = (ItemSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.accBookRevRecForecastRule, other.getAccBookRevRecForecastRule()))) &&
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              java.util.Arrays.equals(this.accountingBook, other.getAccountingBook()))) &&
            ((this.accountingBookAmortization==null && other.getAccountingBookAmortization()==null) || 
             (this.accountingBookAmortization!=null &&
              java.util.Arrays.equals(this.accountingBookAmortization, other.getAccountingBookAmortization()))) &&
            ((this.accountingBookCreatePlansOn==null && other.getAccountingBookCreatePlansOn()==null) || 
             (this.accountingBookCreatePlansOn!=null &&
              java.util.Arrays.equals(this.accountingBookCreatePlansOn, other.getAccountingBookCreatePlansOn()))) &&
            ((this.accountingBookRevRecRule==null && other.getAccountingBookRevRecRule()==null) || 
             (this.accountingBookRevRecRule!=null &&
              java.util.Arrays.equals(this.accountingBookRevRecRule, other.getAccountingBookRevRecRule()))) &&
            ((this.accountingBookRevRecSchedule==null && other.getAccountingBookRevRecSchedule()==null) || 
             (this.accountingBookRevRecSchedule!=null &&
              java.util.Arrays.equals(this.accountingBookRevRecSchedule, other.getAccountingBookRevRecSchedule()))) &&
            ((this.allowedShippingMethod==null && other.getAllowedShippingMethod()==null) || 
             (this.allowedShippingMethod!=null &&
              java.util.Arrays.equals(this.allowedShippingMethod, other.getAllowedShippingMethod()))) &&
            ((this.alternateDemandSourceItem==null && other.getAlternateDemandSourceItem()==null) || 
             (this.alternateDemandSourceItem!=null &&
              java.util.Arrays.equals(this.alternateDemandSourceItem, other.getAlternateDemandSourceItem()))) &&
            ((this.assetAccount==null && other.getAssetAccount()==null) || 
             (this.assetAccount!=null &&
              java.util.Arrays.equals(this.assetAccount, other.getAssetAccount()))) &&
            ((this.atpLeadTime==null && other.getAtpLeadTime()==null) || 
             (this.atpLeadTime!=null &&
              java.util.Arrays.equals(this.atpLeadTime, other.getAtpLeadTime()))) &&
            ((this.atpMethod==null && other.getAtpMethod()==null) || 
             (this.atpMethod!=null &&
              java.util.Arrays.equals(this.atpMethod, other.getAtpMethod()))) &&
            ((this.autoLeadTime==null && other.getAutoLeadTime()==null) || 
             (this.autoLeadTime!=null &&
              java.util.Arrays.equals(this.autoLeadTime, other.getAutoLeadTime()))) &&
            ((this.autoPreferredStockLevel==null && other.getAutoPreferredStockLevel()==null) || 
             (this.autoPreferredStockLevel!=null &&
              java.util.Arrays.equals(this.autoPreferredStockLevel, other.getAutoPreferredStockLevel()))) &&
            ((this.autoReorderPoint==null && other.getAutoReorderPoint()==null) || 
             (this.autoReorderPoint!=null &&
              java.util.Arrays.equals(this.autoReorderPoint, other.getAutoReorderPoint()))) &&
            ((this.availableToPartners==null && other.getAvailableToPartners()==null) || 
             (this.availableToPartners!=null &&
              java.util.Arrays.equals(this.availableToPartners, other.getAvailableToPartners()))) &&
            ((this.averageCost==null && other.getAverageCost()==null) || 
             (this.averageCost!=null &&
              java.util.Arrays.equals(this.averageCost, other.getAverageCost()))) &&
            ((this.backwardConsumptionDays==null && other.getBackwardConsumptionDays()==null) || 
             (this.backwardConsumptionDays!=null &&
              java.util.Arrays.equals(this.backwardConsumptionDays, other.getBackwardConsumptionDays()))) &&
            ((this.basePrice==null && other.getBasePrice()==null) || 
             (this.basePrice!=null &&
              java.util.Arrays.equals(this.basePrice, other.getBasePrice()))) &&
            ((this.billExchRateVarianceAcct==null && other.getBillExchRateVarianceAcct()==null) || 
             (this.billExchRateVarianceAcct!=null &&
              java.util.Arrays.equals(this.billExchRateVarianceAcct, other.getBillExchRateVarianceAcct()))) &&
            ((this.billPriceVarianceAcct==null && other.getBillPriceVarianceAcct()==null) || 
             (this.billPriceVarianceAcct!=null &&
              java.util.Arrays.equals(this.billPriceVarianceAcct, other.getBillPriceVarianceAcct()))) &&
            ((this.billQtyVarianceAcct==null && other.getBillQtyVarianceAcct()==null) || 
             (this.billQtyVarianceAcct!=null &&
              java.util.Arrays.equals(this.billQtyVarianceAcct, other.getBillQtyVarianceAcct()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              java.util.Arrays.equals(this.binNumber, other.getBinNumber()))) &&
            ((this.binOnHandAvail==null && other.getBinOnHandAvail()==null) || 
             (this.binOnHandAvail!=null &&
              java.util.Arrays.equals(this.binOnHandAvail, other.getBinOnHandAvail()))) &&
            ((this.binOnHandCount==null && other.getBinOnHandCount()==null) || 
             (this.binOnHandCount!=null &&
              java.util.Arrays.equals(this.binOnHandCount, other.getBinOnHandCount()))) &&
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              java.util.Arrays.equals(this.bomQuantity, other.getBomQuantity()))) &&
            ((this.buildEntireAssembly==null && other.getBuildEntireAssembly()==null) || 
             (this.buildEntireAssembly!=null &&
              java.util.Arrays.equals(this.buildEntireAssembly, other.getBuildEntireAssembly()))) &&
            ((this.buildTime==null && other.getBuildTime()==null) || 
             (this.buildTime!=null &&
              java.util.Arrays.equals(this.buildTime, other.getBuildTime()))) &&
            ((this.buyItNowPrice==null && other.getBuyItNowPrice()==null) || 
             (this.buyItNowPrice!=null &&
              java.util.Arrays.equals(this.buyItNowPrice, other.getBuyItNowPrice()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.categoryPreferred==null && other.getCategoryPreferred()==null) || 
             (this.categoryPreferred!=null &&
              java.util.Arrays.equals(this.categoryPreferred, other.getCategoryPreferred()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.componentYield==null && other.getComponentYield()==null) || 
             (this.componentYield!=null &&
              java.util.Arrays.equals(this.componentYield, other.getComponentYield()))) &&
            ((this.contingentRevenueHandling==null && other.getContingentRevenueHandling()==null) || 
             (this.contingentRevenueHandling!=null &&
              java.util.Arrays.equals(this.contingentRevenueHandling, other.getContingentRevenueHandling()))) &&
            ((this.copyDescription==null && other.getCopyDescription()==null) || 
             (this.copyDescription!=null &&
              java.util.Arrays.equals(this.copyDescription, other.getCopyDescription()))) &&
            ((this.correlatedItem==null && other.getCorrelatedItem()==null) || 
             (this.correlatedItem!=null &&
              java.util.Arrays.equals(this.correlatedItem, other.getCorrelatedItem()))) &&
            ((this.correlatedItemCorrelation==null && other.getCorrelatedItemCorrelation()==null) || 
             (this.correlatedItemCorrelation!=null &&
              java.util.Arrays.equals(this.correlatedItemCorrelation, other.getCorrelatedItemCorrelation()))) &&
            ((this.correlatedItemCount==null && other.getCorrelatedItemCount()==null) || 
             (this.correlatedItemCount!=null &&
              java.util.Arrays.equals(this.correlatedItemCount, other.getCorrelatedItemCount()))) &&
            ((this.correlatedItemLift==null && other.getCorrelatedItemLift()==null) || 
             (this.correlatedItemLift!=null &&
              java.util.Arrays.equals(this.correlatedItemLift, other.getCorrelatedItemLift()))) &&
            ((this.correlatedItemPurchaseRate==null && other.getCorrelatedItemPurchaseRate()==null) || 
             (this.correlatedItemPurchaseRate!=null &&
              java.util.Arrays.equals(this.correlatedItemPurchaseRate, other.getCorrelatedItemPurchaseRate()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              java.util.Arrays.equals(this.cost, other.getCost()))) &&
            ((this.costAccountingStatus==null && other.getCostAccountingStatus()==null) || 
             (this.costAccountingStatus!=null &&
              java.util.Arrays.equals(this.costAccountingStatus, other.getCostAccountingStatus()))) &&
            ((this.costCategory==null && other.getCostCategory()==null) || 
             (this.costCategory!=null &&
              java.util.Arrays.equals(this.costCategory, other.getCostCategory()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              java.util.Arrays.equals(this.costEstimate, other.getCostEstimate()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              java.util.Arrays.equals(this.costEstimateType, other.getCostEstimateType()))) &&
            ((this.costingMethod==null && other.getCostingMethod()==null) || 
             (this.costingMethod!=null &&
              java.util.Arrays.equals(this.costingMethod, other.getCostingMethod()))) &&
            ((this.countryOfManufacture==null && other.getCountryOfManufacture()==null) || 
             (this.countryOfManufacture!=null &&
              java.util.Arrays.equals(this.countryOfManufacture, other.getCountryOfManufacture()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              java.util.Arrays.equals(this.created, other.getCreated()))) &&
            ((this.createJob==null && other.getCreateJob()==null) || 
             (this.createJob!=null &&
              java.util.Arrays.equals(this.createJob, other.getCreateJob()))) &&
            ((this.createRevenuePlansOn==null && other.getCreateRevenuePlansOn()==null) || 
             (this.createRevenuePlansOn!=null &&
              java.util.Arrays.equals(this.createRevenuePlansOn, other.getCreateRevenuePlansOn()))) &&
            ((this.custReturnVarianceAccount==null && other.getCustReturnVarianceAccount()==null) || 
             (this.custReturnVarianceAccount!=null &&
              java.util.Arrays.equals(this.custReturnVarianceAccount, other.getCustReturnVarianceAccount()))) &&
            ((this.dateViewed==null && other.getDateViewed()==null) || 
             (this.dateViewed!=null &&
              java.util.Arrays.equals(this.dateViewed, other.getDateViewed()))) &&
            ((this.daysBeforeExpiration==null && other.getDaysBeforeExpiration()==null) || 
             (this.daysBeforeExpiration!=null &&
              java.util.Arrays.equals(this.daysBeforeExpiration, other.getDaysBeforeExpiration()))) &&
            ((this.defaultReturnCost==null && other.getDefaultReturnCost()==null) || 
             (this.defaultReturnCost!=null &&
              java.util.Arrays.equals(this.defaultReturnCost, other.getDefaultReturnCost()))) &&
            ((this.defaultShippingMethod==null && other.getDefaultShippingMethod()==null) || 
             (this.defaultShippingMethod!=null &&
              java.util.Arrays.equals(this.defaultShippingMethod, other.getDefaultShippingMethod()))) &&
            ((this.deferredExpenseAccount==null && other.getDeferredExpenseAccount()==null) || 
             (this.deferredExpenseAccount!=null &&
              java.util.Arrays.equals(this.deferredExpenseAccount, other.getDeferredExpenseAccount()))) &&
            ((this.deferredRevenueAccount==null && other.getDeferredRevenueAccount()==null) || 
             (this.deferredRevenueAccount!=null &&
              java.util.Arrays.equals(this.deferredRevenueAccount, other.getDeferredRevenueAccount()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              java.util.Arrays.equals(this.deferRevRec, other.getDeferRevRec()))) &&
            ((this.demandModifier==null && other.getDemandModifier()==null) || 
             (this.demandModifier!=null &&
              java.util.Arrays.equals(this.demandModifier, other.getDemandModifier()))) &&
            ((this.demandSource==null && other.getDemandSource()==null) || 
             (this.demandSource!=null &&
              java.util.Arrays.equals(this.demandSource, other.getDemandSource()))) &&
            ((this.demandTimeFence==null && other.getDemandTimeFence()==null) || 
             (this.demandTimeFence!=null &&
              java.util.Arrays.equals(this.demandTimeFence, other.getDemandTimeFence()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.departmentnohierarchy==null && other.getDepartmentnohierarchy()==null) || 
             (this.departmentnohierarchy!=null &&
              java.util.Arrays.equals(this.departmentnohierarchy, other.getDepartmentnohierarchy()))) &&
            ((this.directRevenuePosting==null && other.getDirectRevenuePosting()==null) || 
             (this.directRevenuePosting!=null &&
              java.util.Arrays.equals(this.directRevenuePosting, other.getDirectRevenuePosting()))) &&
            ((this.displayIneBayStore==null && other.getDisplayIneBayStore()==null) || 
             (this.displayIneBayStore!=null &&
              java.util.Arrays.equals(this.displayIneBayStore, other.getDisplayIneBayStore()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              java.util.Arrays.equals(this.displayName, other.getDisplayName()))) &&
            ((this.distributionCategory==null && other.getDistributionCategory()==null) || 
             (this.distributionCategory!=null &&
              java.util.Arrays.equals(this.distributionCategory, other.getDistributionCategory()))) &&
            ((this.distributionNetwork==null && other.getDistributionNetwork()==null) || 
             (this.distributionNetwork!=null &&
              java.util.Arrays.equals(this.distributionNetwork, other.getDistributionNetwork()))) &&
            ((this.dontShowPrice==null && other.getDontShowPrice()==null) || 
             (this.dontShowPrice!=null &&
              java.util.Arrays.equals(this.dontShowPrice, other.getDontShowPrice()))) &&
            ((this.eBayItemDescription==null && other.getEBayItemDescription()==null) || 
             (this.eBayItemDescription!=null &&
              java.util.Arrays.equals(this.eBayItemDescription, other.getEBayItemDescription()))) &&
            ((this.eBayItemSubtitle==null && other.getEBayItemSubtitle()==null) || 
             (this.eBayItemSubtitle!=null &&
              java.util.Arrays.equals(this.eBayItemSubtitle, other.getEBayItemSubtitle()))) &&
            ((this.eBayItemTitle==null && other.getEBayItemTitle()==null) || 
             (this.eBayItemTitle!=null &&
              java.util.Arrays.equals(this.eBayItemTitle, other.getEBayItemTitle()))) &&
            ((this.ebayRelistingOption==null && other.getEbayRelistingOption()==null) || 
             (this.ebayRelistingOption!=null &&
              java.util.Arrays.equals(this.ebayRelistingOption, other.getEbayRelistingOption()))) &&
            ((this.effectiveBomControl==null && other.getEffectiveBomControl()==null) || 
             (this.effectiveBomControl!=null &&
              java.util.Arrays.equals(this.effectiveBomControl, other.getEffectiveBomControl()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              java.util.Arrays.equals(this.effectiveDate, other.getEffectiveDate()))) &&
            ((this.effectiveRevision==null && other.getEffectiveRevision()==null) || 
             (this.effectiveRevision!=null &&
              java.util.Arrays.equals(this.effectiveRevision, other.getEffectiveRevision()))) &&
            ((this.endAuctionsWhenOutOfStock==null && other.getEndAuctionsWhenOutOfStock()==null) || 
             (this.endAuctionsWhenOutOfStock!=null &&
              java.util.Arrays.equals(this.endAuctionsWhenOutOfStock, other.getEndAuctionsWhenOutOfStock()))) &&
            ((this.excludeFromSitemap==null && other.getExcludeFromSitemap()==null) || 
             (this.excludeFromSitemap!=null &&
              java.util.Arrays.equals(this.excludeFromSitemap, other.getExcludeFromSitemap()))) &&
            ((this.expenseAccount==null && other.getExpenseAccount()==null) || 
             (this.expenseAccount!=null &&
              java.util.Arrays.equals(this.expenseAccount, other.getExpenseAccount()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              java.util.Arrays.equals(this.featuredDescription, other.getFeaturedDescription()))) &&
            ((this.feedDescription==null && other.getFeedDescription()==null) || 
             (this.feedDescription!=null &&
              java.util.Arrays.equals(this.feedDescription, other.getFeedDescription()))) &&
            ((this.feedName==null && other.getFeedName()==null) || 
             (this.feedName!=null &&
              java.util.Arrays.equals(this.feedName, other.getFeedName()))) &&
            ((this.fixedLotSize==null && other.getFixedLotSize()==null) || 
             (this.fixedLotSize!=null &&
              java.util.Arrays.equals(this.fixedLotSize, other.getFixedLotSize()))) &&
            ((this.forwardConsumptionDays==null && other.getForwardConsumptionDays()==null) || 
             (this.forwardConsumptionDays!=null &&
              java.util.Arrays.equals(this.forwardConsumptionDays, other.getForwardConsumptionDays()))) &&
            ((this.fraudRisk==null && other.getFraudRisk()==null) || 
             (this.fraudRisk!=null &&
              java.util.Arrays.equals(this.fraudRisk, other.getFraudRisk()))) &&
            ((this.froogleProductFeed==null && other.getFroogleProductFeed()==null) || 
             (this.froogleProductFeed!=null &&
              java.util.Arrays.equals(this.froogleProductFeed, other.getFroogleProductFeed()))) &&
            ((this.fxCost==null && other.getFxCost()==null) || 
             (this.fxCost!=null &&
              java.util.Arrays.equals(this.fxCost, other.getFxCost()))) &&
            ((this.gainLossAccount==null && other.getGainLossAccount()==null) || 
             (this.gainLossAccount!=null &&
              java.util.Arrays.equals(this.gainLossAccount, other.getGainLossAccount()))) &&
            ((this.generateAccruals==null && other.getGenerateAccruals()==null) || 
             (this.generateAccruals!=null &&
              java.util.Arrays.equals(this.generateAccruals, other.getGenerateAccruals()))) &&
            ((this.giftCertAuthCode==null && other.getGiftCertAuthCode()==null) || 
             (this.giftCertAuthCode!=null &&
              java.util.Arrays.equals(this.giftCertAuthCode, other.getGiftCertAuthCode()))) &&
            ((this.giftCertEmail==null && other.getGiftCertEmail()==null) || 
             (this.giftCertEmail!=null &&
              java.util.Arrays.equals(this.giftCertEmail, other.getGiftCertEmail()))) &&
            ((this.giftCertExpirationDate==null && other.getGiftCertExpirationDate()==null) || 
             (this.giftCertExpirationDate!=null &&
              java.util.Arrays.equals(this.giftCertExpirationDate, other.getGiftCertExpirationDate()))) &&
            ((this.giftCertFrom==null && other.getGiftCertFrom()==null) || 
             (this.giftCertFrom!=null &&
              java.util.Arrays.equals(this.giftCertFrom, other.getGiftCertFrom()))) &&
            ((this.giftCertMessage==null && other.getGiftCertMessage()==null) || 
             (this.giftCertMessage!=null &&
              java.util.Arrays.equals(this.giftCertMessage, other.getGiftCertMessage()))) &&
            ((this.giftCertOriginalAmount==null && other.getGiftCertOriginalAmount()==null) || 
             (this.giftCertOriginalAmount!=null &&
              java.util.Arrays.equals(this.giftCertOriginalAmount, other.getGiftCertOriginalAmount()))) &&
            ((this.giftCertRecipient==null && other.getGiftCertRecipient()==null) || 
             (this.giftCertRecipient!=null &&
              java.util.Arrays.equals(this.giftCertRecipient, other.getGiftCertRecipient()))) &&
            ((this.hierarchyNode==null && other.getHierarchyNode()==null) || 
             (this.hierarchyNode!=null &&
              java.util.Arrays.equals(this.hierarchyNode, other.getHierarchyNode()))) &&
            ((this.hierarchyVersion==null && other.getHierarchyVersion()==null) || 
             (this.hierarchyVersion!=null &&
              java.util.Arrays.equals(this.hierarchyVersion, other.getHierarchyVersion()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              java.util.Arrays.equals(this.hits, other.getHits()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              java.util.Arrays.equals(this.imageUrl, other.getImageUrl()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              java.util.Arrays.equals(this.includeChildren, other.getIncludeChildren()))) &&
            ((this.incomeAccount==null && other.getIncomeAccount()==null) || 
             (this.incomeAccount!=null &&
              java.util.Arrays.equals(this.incomeAccount, other.getIncomeAccount()))) &&
            ((this.intercoDefRevAccount==null && other.getIntercoDefRevAccount()==null) || 
             (this.intercoDefRevAccount!=null &&
              java.util.Arrays.equals(this.intercoDefRevAccount, other.getIntercoDefRevAccount()))) &&
            ((this.intercoExpenseAccount==null && other.getIntercoExpenseAccount()==null) || 
             (this.intercoExpenseAccount!=null &&
              java.util.Arrays.equals(this.intercoExpenseAccount, other.getIntercoExpenseAccount()))) &&
            ((this.intercoIncomeAccount==null && other.getIntercoIncomeAccount()==null) || 
             (this.intercoIncomeAccount!=null &&
              java.util.Arrays.equals(this.intercoIncomeAccount, other.getIntercoIncomeAccount()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.inventoryLocation==null && other.getInventoryLocation()==null) || 
             (this.inventoryLocation!=null &&
              java.util.Arrays.equals(this.inventoryLocation, other.getInventoryLocation()))) &&
            ((this.invtClassification==null && other.getInvtClassification()==null) || 
             (this.invtClassification!=null &&
              java.util.Arrays.equals(this.invtClassification, other.getInvtClassification()))) &&
            ((this.invtCountInterval==null && other.getInvtCountInterval()==null) || 
             (this.invtCountInterval!=null &&
              java.util.Arrays.equals(this.invtCountInterval, other.getInvtCountInterval()))) &&
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              java.util.Arrays.equals(this.isAvailable, other.getIsAvailable()))) &&
            ((this.isDropShipItem==null && other.getIsDropShipItem()==null) || 
             (this.isDropShipItem!=null &&
              java.util.Arrays.equals(this.isDropShipItem, other.getIsDropShipItem()))) &&
            ((this.isFulfillable==null && other.getIsFulfillable()==null) || 
             (this.isFulfillable!=null &&
              java.util.Arrays.equals(this.isFulfillable, other.getIsFulfillable()))) &&
            ((this.isGcoCompliant==null && other.getIsGcoCompliant()==null) || 
             (this.isGcoCompliant!=null &&
              java.util.Arrays.equals(this.isGcoCompliant, other.getIsGcoCompliant()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isLotItem==null && other.getIsLotItem()==null) || 
             (this.isLotItem!=null &&
              java.util.Arrays.equals(this.isLotItem, other.getIsLotItem()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              java.util.Arrays.equals(this.isOnline, other.getIsOnline()))) &&
            ((this.isSerialItem==null && other.getIsSerialItem()==null) || 
             (this.isSerialItem!=null &&
              java.util.Arrays.equals(this.isSerialItem, other.getIsSerialItem()))) &&
            ((this.isSpecialOrderItem==null && other.getIsSpecialOrderItem()==null) || 
             (this.isSpecialOrderItem!=null &&
              java.util.Arrays.equals(this.isSpecialOrderItem, other.getIsSpecialOrderItem()))) &&
            ((this.isSpecialWorkOrderItem==null && other.getIsSpecialWorkOrderItem()==null) || 
             (this.isSpecialWorkOrderItem!=null &&
              java.util.Arrays.equals(this.isSpecialWorkOrderItem, other.getIsSpecialWorkOrderItem()))) &&
            ((this.isStorePickupAllowed==null && other.getIsStorePickupAllowed()==null) || 
             (this.isStorePickupAllowed!=null &&
              java.util.Arrays.equals(this.isStorePickupAllowed, other.getIsStorePickupAllowed()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              java.util.Arrays.equals(this.issueProduct, other.getIssueProduct()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              java.util.Arrays.equals(this.isTaxable, other.getIsTaxable()))) &&
            ((this.isVsoeBundle==null && other.getIsVsoeBundle()==null) || 
             (this.isVsoeBundle!=null &&
              java.util.Arrays.equals(this.isVsoeBundle, other.getIsVsoeBundle()))) &&
            ((this.isWip==null && other.getIsWip()==null) || 
             (this.isWip!=null &&
              java.util.Arrays.equals(this.isWip, other.getIsWip()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              java.util.Arrays.equals(this.itemId, other.getItemId()))) &&
            ((this.itemRevenueCategory==null && other.getItemRevenueCategory()==null) || 
             (this.itemRevenueCategory!=null &&
              java.util.Arrays.equals(this.itemRevenueCategory, other.getItemRevenueCategory()))) &&
            ((this.itemUrl==null && other.getItemUrl()==null) || 
             (this.itemUrl!=null &&
              java.util.Arrays.equals(this.itemUrl, other.getItemUrl()))) &&
            ((this.lastInvtCountDate==null && other.getLastInvtCountDate()==null) || 
             (this.lastInvtCountDate!=null &&
              java.util.Arrays.equals(this.lastInvtCountDate, other.getLastInvtCountDate()))) &&
            ((this.lastPurchasePrice==null && other.getLastPurchasePrice()==null) || 
             (this.lastPurchasePrice!=null &&
              java.util.Arrays.equals(this.lastPurchasePrice, other.getLastPurchasePrice()))) &&
            ((this.lastQuantityAvailableChange==null && other.getLastQuantityAvailableChange()==null) || 
             (this.lastQuantityAvailableChange!=null &&
              java.util.Arrays.equals(this.lastQuantityAvailableChange, other.getLastQuantityAvailableChange()))) &&
            ((this.leadTime==null && other.getLeadTime()==null) || 
             (this.leadTime!=null &&
              java.util.Arrays.equals(this.leadTime, other.getLeadTime()))) &&
            ((this.liabilityAccount==null && other.getLiabilityAccount()==null) || 
             (this.liabilityAccount!=null &&
              java.util.Arrays.equals(this.liabilityAccount, other.getLiabilityAccount()))) &&
            ((this.listingDuration==null && other.getListingDuration()==null) || 
             (this.listingDuration!=null &&
              java.util.Arrays.equals(this.listingDuration, other.getListingDuration()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.locationAllowStorePickup==null && other.getLocationAllowStorePickup()==null) || 
             (this.locationAllowStorePickup!=null &&
              java.util.Arrays.equals(this.locationAllowStorePickup, other.getLocationAllowStorePickup()))) &&
            ((this.locationAtpLeadTime==null && other.getLocationAtpLeadTime()==null) || 
             (this.locationAtpLeadTime!=null &&
              java.util.Arrays.equals(this.locationAtpLeadTime, other.getLocationAtpLeadTime()))) &&
            ((this.locationAverageCost==null && other.getLocationAverageCost()==null) || 
             (this.locationAverageCost!=null &&
              java.util.Arrays.equals(this.locationAverageCost, other.getLocationAverageCost()))) &&
            ((this.locationBinQuantityAvailable==null && other.getLocationBinQuantityAvailable()==null) || 
             (this.locationBinQuantityAvailable!=null &&
              java.util.Arrays.equals(this.locationBinQuantityAvailable, other.getLocationBinQuantityAvailable()))) &&
            ((this.locationBuildTime==null && other.getLocationBuildTime()==null) || 
             (this.locationBuildTime!=null &&
              java.util.Arrays.equals(this.locationBuildTime, other.getLocationBuildTime()))) &&
            ((this.locationCost==null && other.getLocationCost()==null) || 
             (this.locationCost!=null &&
              java.util.Arrays.equals(this.locationCost, other.getLocationCost()))) &&
            ((this.locationCostAccountingStatus==null && other.getLocationCostAccountingStatus()==null) || 
             (this.locationCostAccountingStatus!=null &&
              java.util.Arrays.equals(this.locationCostAccountingStatus, other.getLocationCostAccountingStatus()))) &&
            ((this.locationDefaultReturnCost==null && other.getLocationDefaultReturnCost()==null) || 
             (this.locationDefaultReturnCost!=null &&
              java.util.Arrays.equals(this.locationDefaultReturnCost, other.getLocationDefaultReturnCost()))) &&
            ((this.locationDemandSource==null && other.getLocationDemandSource()==null) || 
             (this.locationDemandSource!=null &&
              java.util.Arrays.equals(this.locationDemandSource, other.getLocationDemandSource()))) &&
            ((this.locationDemandTimeFence==null && other.getLocationDemandTimeFence()==null) || 
             (this.locationDemandTimeFence!=null &&
              java.util.Arrays.equals(this.locationDemandTimeFence, other.getLocationDemandTimeFence()))) &&
            ((this.locationFixedLotSize==null && other.getLocationFixedLotSize()==null) || 
             (this.locationFixedLotSize!=null &&
              java.util.Arrays.equals(this.locationFixedLotSize, other.getLocationFixedLotSize()))) &&
            ((this.locationInventoryCostTemplate==null && other.getLocationInventoryCostTemplate()==null) || 
             (this.locationInventoryCostTemplate!=null &&
              java.util.Arrays.equals(this.locationInventoryCostTemplate, other.getLocationInventoryCostTemplate()))) &&
            ((this.locationInvtClassification==null && other.getLocationInvtClassification()==null) || 
             (this.locationInvtClassification!=null &&
              java.util.Arrays.equals(this.locationInvtClassification, other.getLocationInvtClassification()))) &&
            ((this.locationInvtCountInterval==null && other.getLocationInvtCountInterval()==null) || 
             (this.locationInvtCountInterval!=null &&
              java.util.Arrays.equals(this.locationInvtCountInterval, other.getLocationInvtCountInterval()))) &&
            ((this.locationLastInvtCountDate==null && other.getLocationLastInvtCountDate()==null) || 
             (this.locationLastInvtCountDate!=null &&
              java.util.Arrays.equals(this.locationLastInvtCountDate, other.getLocationLastInvtCountDate()))) &&
            ((this.locationLeadTime==null && other.getLocationLeadTime()==null) || 
             (this.locationLeadTime!=null &&
              java.util.Arrays.equals(this.locationLeadTime, other.getLocationLeadTime()))) &&
            ((this.locationNextInvtCountDate==null && other.getLocationNextInvtCountDate()==null) || 
             (this.locationNextInvtCountDate!=null &&
              java.util.Arrays.equals(this.locationNextInvtCountDate, other.getLocationNextInvtCountDate()))) &&
            ((this.locationPeriodicLotSizeDays==null && other.getLocationPeriodicLotSizeDays()==null) || 
             (this.locationPeriodicLotSizeDays!=null &&
              java.util.Arrays.equals(this.locationPeriodicLotSizeDays, other.getLocationPeriodicLotSizeDays()))) &&
            ((this.locationPeriodicLotSizeType==null && other.getLocationPeriodicLotSizeType()==null) || 
             (this.locationPeriodicLotSizeType!=null &&
              java.util.Arrays.equals(this.locationPeriodicLotSizeType, other.getLocationPeriodicLotSizeType()))) &&
            ((this.locationPreferredStockLevel==null && other.getLocationPreferredStockLevel()==null) || 
             (this.locationPreferredStockLevel!=null &&
              java.util.Arrays.equals(this.locationPreferredStockLevel, other.getLocationPreferredStockLevel()))) &&
            ((this.locationQtyAvailForStorePickup==null && other.getLocationQtyAvailForStorePickup()==null) || 
             (this.locationQtyAvailForStorePickup!=null &&
              java.util.Arrays.equals(this.locationQtyAvailForStorePickup, other.getLocationQtyAvailForStorePickup()))) &&
            ((this.locationQuantityAvailable==null && other.getLocationQuantityAvailable()==null) || 
             (this.locationQuantityAvailable!=null &&
              java.util.Arrays.equals(this.locationQuantityAvailable, other.getLocationQuantityAvailable()))) &&
            ((this.locationQuantityBackOrdered==null && other.getLocationQuantityBackOrdered()==null) || 
             (this.locationQuantityBackOrdered!=null &&
              java.util.Arrays.equals(this.locationQuantityBackOrdered, other.getLocationQuantityBackOrdered()))) &&
            ((this.locationQuantityCommitted==null && other.getLocationQuantityCommitted()==null) || 
             (this.locationQuantityCommitted!=null &&
              java.util.Arrays.equals(this.locationQuantityCommitted, other.getLocationQuantityCommitted()))) &&
            ((this.locationQuantityInTransit==null && other.getLocationQuantityInTransit()==null) || 
             (this.locationQuantityInTransit!=null &&
              java.util.Arrays.equals(this.locationQuantityInTransit, other.getLocationQuantityInTransit()))) &&
            ((this.locationQuantityOnHand==null && other.getLocationQuantityOnHand()==null) || 
             (this.locationQuantityOnHand!=null &&
              java.util.Arrays.equals(this.locationQuantityOnHand, other.getLocationQuantityOnHand()))) &&
            ((this.locationQuantityOnOrder==null && other.getLocationQuantityOnOrder()==null) || 
             (this.locationQuantityOnOrder!=null &&
              java.util.Arrays.equals(this.locationQuantityOnOrder, other.getLocationQuantityOnOrder()))) &&
            ((this.locationReOrderPoint==null && other.getLocationReOrderPoint()==null) || 
             (this.locationReOrderPoint!=null &&
              java.util.Arrays.equals(this.locationReOrderPoint, other.getLocationReOrderPoint()))) &&
            ((this.locationRescheduleInDays==null && other.getLocationRescheduleInDays()==null) || 
             (this.locationRescheduleInDays!=null &&
              java.util.Arrays.equals(this.locationRescheduleInDays, other.getLocationRescheduleInDays()))) &&
            ((this.locationRescheduleOutDays==null && other.getLocationRescheduleOutDays()==null) || 
             (this.locationRescheduleOutDays!=null &&
              java.util.Arrays.equals(this.locationRescheduleOutDays, other.getLocationRescheduleOutDays()))) &&
            ((this.locationSafetyStockLevel==null && other.getLocationSafetyStockLevel()==null) || 
             (this.locationSafetyStockLevel!=null &&
              java.util.Arrays.equals(this.locationSafetyStockLevel, other.getLocationSafetyStockLevel()))) &&
            ((this.locationStorePickupBufferStock==null && other.getLocationStorePickupBufferStock()==null) || 
             (this.locationStorePickupBufferStock!=null &&
              java.util.Arrays.equals(this.locationStorePickupBufferStock, other.getLocationStorePickupBufferStock()))) &&
            ((this.locationSupplyLotSizingMethod==null && other.getLocationSupplyLotSizingMethod()==null) || 
             (this.locationSupplyLotSizingMethod!=null &&
              java.util.Arrays.equals(this.locationSupplyLotSizingMethod, other.getLocationSupplyLotSizingMethod()))) &&
            ((this.locationSupplyTimeFence==null && other.getLocationSupplyTimeFence()==null) || 
             (this.locationSupplyTimeFence!=null &&
              java.util.Arrays.equals(this.locationSupplyTimeFence, other.getLocationSupplyTimeFence()))) &&
            ((this.locationSupplyType==null && other.getLocationSupplyType()==null) || 
             (this.locationSupplyType!=null &&
              java.util.Arrays.equals(this.locationSupplyType, other.getLocationSupplyType()))) &&
            ((this.locationTotalValue==null && other.getLocationTotalValue()==null) || 
             (this.locationTotalValue!=null &&
              java.util.Arrays.equals(this.locationTotalValue, other.getLocationTotalValue()))) &&
            ((this.locBackwardConsumptionDays==null && other.getLocBackwardConsumptionDays()==null) || 
             (this.locBackwardConsumptionDays!=null &&
              java.util.Arrays.equals(this.locBackwardConsumptionDays, other.getLocBackwardConsumptionDays()))) &&
            ((this.locForwardConsumptionDays==null && other.getLocForwardConsumptionDays()==null) || 
             (this.locForwardConsumptionDays!=null &&
              java.util.Arrays.equals(this.locForwardConsumptionDays, other.getLocForwardConsumptionDays()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              java.util.Arrays.equals(this.manufacturer, other.getManufacturer()))) &&
            ((this.manufacturerAddr1==null && other.getManufacturerAddr1()==null) || 
             (this.manufacturerAddr1!=null &&
              java.util.Arrays.equals(this.manufacturerAddr1, other.getManufacturerAddr1()))) &&
            ((this.manufacturerCity==null && other.getManufacturerCity()==null) || 
             (this.manufacturerCity!=null &&
              java.util.Arrays.equals(this.manufacturerCity, other.getManufacturerCity()))) &&
            ((this.manufacturerState==null && other.getManufacturerState()==null) || 
             (this.manufacturerState!=null &&
              java.util.Arrays.equals(this.manufacturerState, other.getManufacturerState()))) &&
            ((this.manufacturerTariff==null && other.getManufacturerTariff()==null) || 
             (this.manufacturerTariff!=null &&
              java.util.Arrays.equals(this.manufacturerTariff, other.getManufacturerTariff()))) &&
            ((this.manufacturerTaxId==null && other.getManufacturerTaxId()==null) || 
             (this.manufacturerTaxId!=null &&
              java.util.Arrays.equals(this.manufacturerTaxId, other.getManufacturerTaxId()))) &&
            ((this.manufacturerZip==null && other.getManufacturerZip()==null) || 
             (this.manufacturerZip!=null &&
              java.util.Arrays.equals(this.manufacturerZip, other.getManufacturerZip()))) &&
            ((this.manufacturingChargeItem==null && other.getManufacturingChargeItem()==null) || 
             (this.manufacturingChargeItem!=null &&
              java.util.Arrays.equals(this.manufacturingChargeItem, other.getManufacturingChargeItem()))) &&
            ((this.matchBillToReceipt==null && other.getMatchBillToReceipt()==null) || 
             (this.matchBillToReceipt!=null &&
              java.util.Arrays.equals(this.matchBillToReceipt, other.getMatchBillToReceipt()))) &&
            ((this.maximumQuantity==null && other.getMaximumQuantity()==null) || 
             (this.maximumQuantity!=null &&
              java.util.Arrays.equals(this.maximumQuantity, other.getMaximumQuantity()))) &&
            ((this.memberItem==null && other.getMemberItem()==null) || 
             (this.memberItem!=null &&
              java.util.Arrays.equals(this.memberItem, other.getMemberItem()))) &&
            ((this.memberQuantity==null && other.getMemberQuantity()==null) || 
             (this.memberQuantity!=null &&
              java.util.Arrays.equals(this.memberQuantity, other.getMemberQuantity()))) &&
            ((this.metaTagHtml==null && other.getMetaTagHtml()==null) || 
             (this.metaTagHtml!=null &&
              java.util.Arrays.equals(this.metaTagHtml, other.getMetaTagHtml()))) &&
            ((this.minimumQuantity==null && other.getMinimumQuantity()==null) || 
             (this.minimumQuantity!=null &&
              java.util.Arrays.equals(this.minimumQuantity, other.getMinimumQuantity()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              java.util.Arrays.equals(this.modified, other.getModified()))) &&
            ((this.mossApplies==null && other.getMossApplies()==null) || 
             (this.mossApplies!=null &&
              java.util.Arrays.equals(this.mossApplies, other.getMossApplies()))) &&
            ((this.mpn==null && other.getMpn()==null) || 
             (this.mpn!=null &&
              java.util.Arrays.equals(this.mpn, other.getMpn()))) &&
            ((this.multManufactureAddr==null && other.getMultManufactureAddr()==null) || 
             (this.multManufactureAddr!=null &&
              java.util.Arrays.equals(this.multManufactureAddr, other.getMultManufactureAddr()))) &&
            ((this.nextagCategory==null && other.getNextagCategory()==null) || 
             (this.nextagCategory!=null &&
              java.util.Arrays.equals(this.nextagCategory, other.getNextagCategory()))) &&
            ((this.nextagProductFeed==null && other.getNextagProductFeed()==null) || 
             (this.nextagProductFeed!=null &&
              java.util.Arrays.equals(this.nextagProductFeed, other.getNextagProductFeed()))) &&
            ((this.nextInvtCountDate==null && other.getNextInvtCountDate()==null) || 
             (this.nextInvtCountDate!=null &&
              java.util.Arrays.equals(this.nextInvtCountDate, other.getNextInvtCountDate()))) &&
            ((this.noPriceMessage==null && other.getNoPriceMessage()==null) || 
             (this.noPriceMessage!=null &&
              java.util.Arrays.equals(this.noPriceMessage, other.getNoPriceMessage()))) &&
            ((this.numActiveListings==null && other.getNumActiveListings()==null) || 
             (this.numActiveListings!=null &&
              java.util.Arrays.equals(this.numActiveListings, other.getNumActiveListings()))) &&
            ((this.numberAllowedDownloads==null && other.getNumberAllowedDownloads()==null) || 
             (this.numberAllowedDownloads!=null &&
              java.util.Arrays.equals(this.numberAllowedDownloads, other.getNumberAllowedDownloads()))) &&
            ((this.numCurrentlyListed==null && other.getNumCurrentlyListed()==null) || 
             (this.numCurrentlyListed!=null &&
              java.util.Arrays.equals(this.numCurrentlyListed, other.getNumCurrentlyListed()))) &&
            ((this.obsoleteDate==null && other.getObsoleteDate()==null) || 
             (this.obsoleteDate!=null &&
              java.util.Arrays.equals(this.obsoleteDate, other.getObsoleteDate()))) &&
            ((this.obsoleteRevision==null && other.getObsoleteRevision()==null) || 
             (this.obsoleteRevision!=null &&
              java.util.Arrays.equals(this.obsoleteRevision, other.getObsoleteRevision()))) &&
            ((this.offerSupport==null && other.getOfferSupport()==null) || 
             (this.offerSupport!=null &&
              java.util.Arrays.equals(this.offerSupport, other.getOfferSupport()))) &&
            ((this.onlineCustomerPrice==null && other.getOnlineCustomerPrice()==null) || 
             (this.onlineCustomerPrice!=null &&
              java.util.Arrays.equals(this.onlineCustomerPrice, other.getOnlineCustomerPrice()))) &&
            ((this.onlinePrice==null && other.getOnlinePrice()==null) || 
             (this.onlinePrice!=null &&
              java.util.Arrays.equals(this.onlinePrice, other.getOnlinePrice()))) &&
            ((this.onSpecial==null && other.getOnSpecial()==null) || 
             (this.onSpecial!=null &&
              java.util.Arrays.equals(this.onSpecial, other.getOnSpecial()))) &&
            ((this.otherPrices==null && other.getOtherPrices()==null) || 
             (this.otherPrices!=null &&
              java.util.Arrays.equals(this.otherPrices, other.getOtherPrices()))) &&
            ((this.otherVendor==null && other.getOtherVendor()==null) || 
             (this.otherVendor!=null &&
              java.util.Arrays.equals(this.otherVendor, other.getOtherVendor()))) &&
            ((this.outOfStockBehavior==null && other.getOutOfStockBehavior()==null) || 
             (this.outOfStockBehavior!=null &&
              java.util.Arrays.equals(this.outOfStockBehavior, other.getOutOfStockBehavior()))) &&
            ((this.outOfStockMessage==null && other.getOutOfStockMessage()==null) || 
             (this.outOfStockMessage!=null &&
              java.util.Arrays.equals(this.outOfStockMessage, other.getOutOfStockMessage()))) &&
            ((this.overallQuantityPricingType==null && other.getOverallQuantityPricingType()==null) || 
             (this.overallQuantityPricingType!=null &&
              java.util.Arrays.equals(this.overallQuantityPricingType, other.getOverallQuantityPricingType()))) &&
            ((this.overheadType==null && other.getOverheadType()==null) || 
             (this.overheadType!=null &&
              java.util.Arrays.equals(this.overheadType, other.getOverheadType()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              java.util.Arrays.equals(this.pageTitle, other.getPageTitle()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
            ((this.periodicLotSizeDays==null && other.getPeriodicLotSizeDays()==null) || 
             (this.periodicLotSizeDays!=null &&
              java.util.Arrays.equals(this.periodicLotSizeDays, other.getPeriodicLotSizeDays()))) &&
            ((this.periodicLotSizeType==null && other.getPeriodicLotSizeType()==null) || 
             (this.periodicLotSizeType!=null &&
              java.util.Arrays.equals(this.periodicLotSizeType, other.getPeriodicLotSizeType()))) &&
            ((this.preferenceCriterion==null && other.getPreferenceCriterion()==null) || 
             (this.preferenceCriterion!=null &&
              java.util.Arrays.equals(this.preferenceCriterion, other.getPreferenceCriterion()))) &&
            ((this.preferredBin==null && other.getPreferredBin()==null) || 
             (this.preferredBin!=null &&
              java.util.Arrays.equals(this.preferredBin, other.getPreferredBin()))) &&
            ((this.preferredLocation==null && other.getPreferredLocation()==null) || 
             (this.preferredLocation!=null &&
              java.util.Arrays.equals(this.preferredLocation, other.getPreferredLocation()))) &&
            ((this.preferredStockLevel==null && other.getPreferredStockLevel()==null) || 
             (this.preferredStockLevel!=null &&
              java.util.Arrays.equals(this.preferredStockLevel, other.getPreferredStockLevel()))) &&
            ((this.preferredStockLevelDays==null && other.getPreferredStockLevelDays()==null) || 
             (this.preferredStockLevelDays!=null &&
              java.util.Arrays.equals(this.preferredStockLevelDays, other.getPreferredStockLevelDays()))) &&
            ((this.pricesIncludeTax==null && other.getPricesIncludeTax()==null) || 
             (this.pricesIncludeTax!=null &&
              java.util.Arrays.equals(this.pricesIncludeTax, other.getPricesIncludeTax()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              java.util.Arrays.equals(this.pricingGroup, other.getPricingGroup()))) &&
            ((this.primaryCategory==null && other.getPrimaryCategory()==null) || 
             (this.primaryCategory!=null &&
              java.util.Arrays.equals(this.primaryCategory, other.getPrimaryCategory()))) &&
            ((this.prodPriceVarianceAcct==null && other.getProdPriceVarianceAcct()==null) || 
             (this.prodPriceVarianceAcct!=null &&
              java.util.Arrays.equals(this.prodPriceVarianceAcct, other.getProdPriceVarianceAcct()))) &&
            ((this.prodQtyVarianceAcct==null && other.getProdQtyVarianceAcct()==null) || 
             (this.prodQtyVarianceAcct!=null &&
              java.util.Arrays.equals(this.prodQtyVarianceAcct, other.getProdQtyVarianceAcct()))) &&
            ((this.purchaseDescription==null && other.getPurchaseDescription()==null) || 
             (this.purchaseDescription!=null &&
              java.util.Arrays.equals(this.purchaseDescription, other.getPurchaseDescription()))) &&
            ((this.purchaseOrderAmount==null && other.getPurchaseOrderAmount()==null) || 
             (this.purchaseOrderAmount!=null &&
              java.util.Arrays.equals(this.purchaseOrderAmount, other.getPurchaseOrderAmount()))) &&
            ((this.purchaseOrderQuantity==null && other.getPurchaseOrderQuantity()==null) || 
             (this.purchaseOrderQuantity!=null &&
              java.util.Arrays.equals(this.purchaseOrderQuantity, other.getPurchaseOrderQuantity()))) &&
            ((this.purchaseOrderQuantityDiff==null && other.getPurchaseOrderQuantityDiff()==null) || 
             (this.purchaseOrderQuantityDiff!=null &&
              java.util.Arrays.equals(this.purchaseOrderQuantityDiff, other.getPurchaseOrderQuantityDiff()))) &&
            ((this.purchasePriceVarianceAcct==null && other.getPurchasePriceVarianceAcct()==null) || 
             (this.purchasePriceVarianceAcct!=null &&
              java.util.Arrays.equals(this.purchasePriceVarianceAcct, other.getPurchasePriceVarianceAcct()))) &&
            ((this.purchaseUnit==null && other.getPurchaseUnit()==null) || 
             (this.purchaseUnit!=null &&
              java.util.Arrays.equals(this.purchaseUnit, other.getPurchaseUnit()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              java.util.Arrays.equals(this.quantityAvailable, other.getQuantityAvailable()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              java.util.Arrays.equals(this.quantityBackOrdered, other.getQuantityBackOrdered()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              java.util.Arrays.equals(this.quantityCommitted, other.getQuantityCommitted()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              java.util.Arrays.equals(this.quantityOnHand, other.getQuantityOnHand()))) &&
            ((this.quantityOnOrder==null && other.getQuantityOnOrder()==null) || 
             (this.quantityOnOrder!=null &&
              java.util.Arrays.equals(this.quantityOnOrder, other.getQuantityOnOrder()))) &&
            ((this.quantityPricingSchedule==null && other.getQuantityPricingSchedule()==null) || 
             (this.quantityPricingSchedule!=null &&
              java.util.Arrays.equals(this.quantityPricingSchedule, other.getQuantityPricingSchedule()))) &&
            ((this.receiptAmount==null && other.getReceiptAmount()==null) || 
             (this.receiptAmount!=null &&
              java.util.Arrays.equals(this.receiptAmount, other.getReceiptAmount()))) &&
            ((this.receiptQuantity==null && other.getReceiptQuantity()==null) || 
             (this.receiptQuantity!=null &&
              java.util.Arrays.equals(this.receiptQuantity, other.getReceiptQuantity()))) &&
            ((this.receiptQuantityDiff==null && other.getReceiptQuantityDiff()==null) || 
             (this.receiptQuantityDiff!=null &&
              java.util.Arrays.equals(this.receiptQuantityDiff, other.getReceiptQuantityDiff()))) &&
            ((this.reorderMultiple==null && other.getReorderMultiple()==null) || 
             (this.reorderMultiple!=null &&
              java.util.Arrays.equals(this.reorderMultiple, other.getReorderMultiple()))) &&
            ((this.reOrderPoint==null && other.getReOrderPoint()==null) || 
             (this.reOrderPoint!=null &&
              java.util.Arrays.equals(this.reOrderPoint, other.getReOrderPoint()))) &&
            ((this.rescheduleInDays==null && other.getRescheduleInDays()==null) || 
             (this.rescheduleInDays!=null &&
              java.util.Arrays.equals(this.rescheduleInDays, other.getRescheduleInDays()))) &&
            ((this.rescheduleOutDays==null && other.getRescheduleOutDays()==null) || 
             (this.rescheduleOutDays!=null &&
              java.util.Arrays.equals(this.rescheduleOutDays, other.getRescheduleOutDays()))) &&
            ((this.reservePrice==null && other.getReservePrice()==null) || 
             (this.reservePrice!=null &&
              java.util.Arrays.equals(this.reservePrice, other.getReservePrice()))) &&
            ((this.revenueAllocationGroup==null && other.getRevenueAllocationGroup()==null) || 
             (this.revenueAllocationGroup!=null &&
              java.util.Arrays.equals(this.revenueAllocationGroup, other.getRevenueAllocationGroup()))) &&
            ((this.revenueRecognitionRule==null && other.getRevenueRecognitionRule()==null) || 
             (this.revenueRecognitionRule!=null &&
              java.util.Arrays.equals(this.revenueRecognitionRule, other.getRevenueRecognitionRule()))) &&
            ((this.revRecForecastRule==null && other.getRevRecForecastRule()==null) || 
             (this.revRecForecastRule!=null &&
              java.util.Arrays.equals(this.revRecForecastRule, other.getRevRecForecastRule()))) &&
            ((this.revReclassFXAccount==null && other.getRevReclassFXAccount()==null) || 
             (this.revReclassFXAccount!=null &&
              java.util.Arrays.equals(this.revReclassFXAccount, other.getRevReclassFXAccount()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              java.util.Arrays.equals(this.revRecSchedule, other.getRevRecSchedule()))) &&
            ((this.roundUpAsComponent==null && other.getRoundUpAsComponent()==null) || 
             (this.roundUpAsComponent!=null &&
              java.util.Arrays.equals(this.roundUpAsComponent, other.getRoundUpAsComponent()))) &&
            ((this.safetyStockLevel==null && other.getSafetyStockLevel()==null) || 
             (this.safetyStockLevel!=null &&
              java.util.Arrays.equals(this.safetyStockLevel, other.getSafetyStockLevel()))) &&
            ((this.safetyStockLevelDays==null && other.getSafetyStockLevelDays()==null) || 
             (this.safetyStockLevelDays!=null &&
              java.util.Arrays.equals(this.safetyStockLevelDays, other.getSafetyStockLevelDays()))) &&
            ((this.salesDescription==null && other.getSalesDescription()==null) || 
             (this.salesDescription!=null &&
              java.util.Arrays.equals(this.salesDescription, other.getSalesDescription()))) &&
            ((this.salesTaxCode==null && other.getSalesTaxCode()==null) || 
             (this.salesTaxCode!=null &&
              java.util.Arrays.equals(this.salesTaxCode, other.getSalesTaxCode()))) &&
            ((this.saleUnit==null && other.getSaleUnit()==null) || 
             (this.saleUnit!=null &&
              java.util.Arrays.equals(this.saleUnit, other.getSaleUnit()))) &&
            ((this.sameAsPrimaryBookAmortization==null && other.getSameAsPrimaryBookAmortization()==null) || 
             (this.sameAsPrimaryBookAmortization!=null &&
              java.util.Arrays.equals(this.sameAsPrimaryBookAmortization, other.getSameAsPrimaryBookAmortization()))) &&
            ((this.sameAsPrimaryBookRevRec==null && other.getSameAsPrimaryBookRevRec()==null) || 
             (this.sameAsPrimaryBookRevRec!=null &&
              java.util.Arrays.equals(this.sameAsPrimaryBookRevRec, other.getSameAsPrimaryBookRevRec()))) &&
            ((this.scheduleBCode==null && other.getScheduleBCode()==null) || 
             (this.scheduleBCode!=null &&
              java.util.Arrays.equals(this.scheduleBCode, other.getScheduleBCode()))) &&
            ((this.scheduleBNumber==null && other.getScheduleBNumber()==null) || 
             (this.scheduleBNumber!=null &&
              java.util.Arrays.equals(this.scheduleBNumber, other.getScheduleBNumber()))) &&
            ((this.scheduleBQuantity==null && other.getScheduleBQuantity()==null) || 
             (this.scheduleBQuantity!=null &&
              java.util.Arrays.equals(this.scheduleBQuantity, other.getScheduleBQuantity()))) &&
            ((this.scrapAcct==null && other.getScrapAcct()==null) || 
             (this.scrapAcct!=null &&
              java.util.Arrays.equals(this.scrapAcct, other.getScrapAcct()))) &&
            ((this.searchKeywords==null && other.getSearchKeywords()==null) || 
             (this.searchKeywords!=null &&
              java.util.Arrays.equals(this.searchKeywords, other.getSearchKeywords()))) &&
            ((this.seasonalDemand==null && other.getSeasonalDemand()==null) || 
             (this.seasonalDemand!=null &&
              java.util.Arrays.equals(this.seasonalDemand, other.getSeasonalDemand()))) &&
            ((this.sellOnEBay==null && other.getSellOnEBay()==null) || 
             (this.sellOnEBay!=null &&
              java.util.Arrays.equals(this.sellOnEBay, other.getSellOnEBay()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              java.util.Arrays.equals(this.serialNumber, other.getSerialNumber()))) &&
            ((this.serialNumberLocation==null && other.getSerialNumberLocation()==null) || 
             (this.serialNumberLocation!=null &&
              java.util.Arrays.equals(this.serialNumberLocation, other.getSerialNumberLocation()))) &&
            ((this.shipIndividually==null && other.getShipIndividually()==null) || 
             (this.shipIndividually!=null &&
              java.util.Arrays.equals(this.shipIndividually, other.getShipIndividually()))) &&
            ((this.shipPackage==null && other.getShipPackage()==null) || 
             (this.shipPackage!=null &&
              java.util.Arrays.equals(this.shipPackage, other.getShipPackage()))) &&
            ((this.shippingCarrier==null && other.getShippingCarrier()==null) || 
             (this.shippingCarrier!=null &&
              java.util.Arrays.equals(this.shippingCarrier, other.getShippingCarrier()))) &&
            ((this.shippingRate==null && other.getShippingRate()==null) || 
             (this.shippingRate!=null &&
              java.util.Arrays.equals(this.shippingRate, other.getShippingRate()))) &&
            ((this.shoppingDotComCategory==null && other.getShoppingDotComCategory()==null) || 
             (this.shoppingDotComCategory!=null &&
              java.util.Arrays.equals(this.shoppingDotComCategory, other.getShoppingDotComCategory()))) &&
            ((this.shoppingProductFeed==null && other.getShoppingProductFeed()==null) || 
             (this.shoppingProductFeed!=null &&
              java.util.Arrays.equals(this.shoppingProductFeed, other.getShoppingProductFeed()))) &&
            ((this.shopzillaCategoryId==null && other.getShopzillaCategoryId()==null) || 
             (this.shopzillaCategoryId!=null &&
              java.util.Arrays.equals(this.shopzillaCategoryId, other.getShopzillaCategoryId()))) &&
            ((this.shopzillaProductFeed==null && other.getShopzillaProductFeed()==null) || 
             (this.shopzillaProductFeed!=null &&
              java.util.Arrays.equals(this.shopzillaProductFeed, other.getShopzillaProductFeed()))) &&
            ((this.sitemapPriority==null && other.getSitemapPriority()==null) || 
             (this.sitemapPriority!=null &&
              java.util.Arrays.equals(this.sitemapPriority, other.getSitemapPriority()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              java.util.Arrays.equals(this.softDescriptor, other.getSoftDescriptor()))) &&
            ((this.startingPrice==null && other.getStartingPrice()==null) || 
             (this.startingPrice!=null &&
              java.util.Arrays.equals(this.startingPrice, other.getStartingPrice()))) &&
            ((this.stockDescription==null && other.getStockDescription()==null) || 
             (this.stockDescription!=null &&
              java.util.Arrays.equals(this.stockDescription, other.getStockDescription()))) &&
            ((this.stockUnit==null && other.getStockUnit()==null) || 
             (this.stockUnit!=null &&
              java.util.Arrays.equals(this.stockUnit, other.getStockUnit()))) &&
            ((this.storeDescription==null && other.getStoreDescription()==null) || 
             (this.storeDescription!=null &&
              java.util.Arrays.equals(this.storeDescription, other.getStoreDescription()))) &&
            ((this.storeDetailedDescription==null && other.getStoreDetailedDescription()==null) || 
             (this.storeDetailedDescription!=null &&
              java.util.Arrays.equals(this.storeDetailedDescription, other.getStoreDetailedDescription()))) &&
            ((this.storeDisplayImage==null && other.getStoreDisplayImage()==null) || 
             (this.storeDisplayImage!=null &&
              java.util.Arrays.equals(this.storeDisplayImage, other.getStoreDisplayImage()))) &&
            ((this.storeDisplayName==null && other.getStoreDisplayName()==null) || 
             (this.storeDisplayName!=null &&
              java.util.Arrays.equals(this.storeDisplayName, other.getStoreDisplayName()))) &&
            ((this.storeDisplayThumbnail==null && other.getStoreDisplayThumbnail()==null) || 
             (this.storeDisplayThumbnail!=null &&
              java.util.Arrays.equals(this.storeDisplayThumbnail, other.getStoreDisplayThumbnail()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              java.util.Arrays.equals(this.subType, other.getSubType()))) &&
            ((this.supplyLotSizingMethod==null && other.getSupplyLotSizingMethod()==null) || 
             (this.supplyLotSizingMethod!=null &&
              java.util.Arrays.equals(this.supplyLotSizingMethod, other.getSupplyLotSizingMethod()))) &&
            ((this.supplyReplenishmentMethod==null && other.getSupplyReplenishmentMethod()==null) || 
             (this.supplyReplenishmentMethod!=null &&
              java.util.Arrays.equals(this.supplyReplenishmentMethod, other.getSupplyReplenishmentMethod()))) &&
            ((this.supplyTimeFence==null && other.getSupplyTimeFence()==null) || 
             (this.supplyTimeFence!=null &&
              java.util.Arrays.equals(this.supplyTimeFence, other.getSupplyTimeFence()))) &&
            ((this.supplyType==null && other.getSupplyType()==null) || 
             (this.supplyType!=null &&
              java.util.Arrays.equals(this.supplyType, other.getSupplyType()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              java.util.Arrays.equals(this.taxSchedule, other.getTaxSchedule()))) &&
            ((this.thumbNailUrl==null && other.getThumbNailUrl()==null) || 
             (this.thumbNailUrl!=null &&
              java.util.Arrays.equals(this.thumbNailUrl, other.getThumbNailUrl()))) &&
            ((this.totalValue==null && other.getTotalValue()==null) || 
             (this.totalValue!=null &&
              java.util.Arrays.equals(this.totalValue, other.getTotalValue()))) &&
            ((this.trackLandedCost==null && other.getTrackLandedCost()==null) || 
             (this.trackLandedCost!=null &&
              java.util.Arrays.equals(this.trackLandedCost, other.getTrackLandedCost()))) &&
            ((this.transferPrice==null && other.getTransferPrice()==null) || 
             (this.transferPrice!=null &&
              java.util.Arrays.equals(this.transferPrice, other.getTransferPrice()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.unbuildVarianceAccount==null && other.getUnbuildVarianceAccount()==null) || 
             (this.unbuildVarianceAccount!=null &&
              java.util.Arrays.equals(this.unbuildVarianceAccount, other.getUnbuildVarianceAccount()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              java.util.Arrays.equals(this.unitsType, other.getUnitsType()))) &&
            ((this.upcCode==null && other.getUpcCode()==null) || 
             (this.upcCode!=null &&
              java.util.Arrays.equals(this.upcCode, other.getUpcCode()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              java.util.Arrays.equals(this.urlComponent, other.getUrlComponent()))) &&
            ((this.useBins==null && other.getUseBins()==null) || 
             (this.useBins!=null &&
              java.util.Arrays.equals(this.useBins, other.getUseBins()))) &&
            ((this.useComponentYield==null && other.getUseComponentYield()==null) || 
             (this.useComponentYield!=null &&
              java.util.Arrays.equals(this.useComponentYield, other.getUseComponentYield()))) &&
            ((this.useMarginalRates==null && other.getUseMarginalRates()==null) || 
             (this.useMarginalRates!=null &&
              java.util.Arrays.equals(this.useMarginalRates, other.getUseMarginalRates()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              java.util.Arrays.equals(this.vendor, other.getVendor()))) &&
            ((this.vendorCode==null && other.getVendorCode()==null) || 
             (this.vendorCode!=null &&
              java.util.Arrays.equals(this.vendorCode, other.getVendorCode()))) &&
            ((this.vendorCost==null && other.getVendorCost()==null) || 
             (this.vendorCost!=null &&
              java.util.Arrays.equals(this.vendorCost, other.getVendorCost()))) &&
            ((this.vendorCostEntered==null && other.getVendorCostEntered()==null) || 
             (this.vendorCostEntered!=null &&
              java.util.Arrays.equals(this.vendorCostEntered, other.getVendorCostEntered()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              java.util.Arrays.equals(this.vendorName, other.getVendorName()))) &&
            ((this.vendorPriceCurrency==null && other.getVendorPriceCurrency()==null) || 
             (this.vendorPriceCurrency!=null &&
              java.util.Arrays.equals(this.vendorPriceCurrency, other.getVendorPriceCurrency()))) &&
            ((this.vendorSchedule==null && other.getVendorSchedule()==null) || 
             (this.vendorSchedule!=null &&
              java.util.Arrays.equals(this.vendorSchedule, other.getVendorSchedule()))) &&
            ((this.vendReturnVarianceAccount==null && other.getVendReturnVarianceAccount()==null) || 
             (this.vendReturnVarianceAccount!=null &&
              java.util.Arrays.equals(this.vendReturnVarianceAccount, other.getVendReturnVarianceAccount()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              java.util.Arrays.equals(this.vsoeDeferral, other.getVsoeDeferral()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              java.util.Arrays.equals(this.vsoeDelivered, other.getVsoeDelivered()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              java.util.Arrays.equals(this.vsoePermitDiscount, other.getVsoePermitDiscount()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              java.util.Arrays.equals(this.vsoePrice, other.getVsoePrice()))) &&
            ((this.vsoeSopGroup==null && other.getVsoeSopGroup()==null) || 
             (this.vsoeSopGroup!=null &&
              java.util.Arrays.equals(this.vsoeSopGroup, other.getVsoeSopGroup()))) &&
            ((this.webSite==null && other.getWebSite()==null) || 
             (this.webSite!=null &&
              java.util.Arrays.equals(this.webSite, other.getWebSite()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              java.util.Arrays.equals(this.weight, other.getWeight()))) &&
            ((this.weightUnit==null && other.getWeightUnit()==null) || 
             (this.weightUnit!=null &&
              java.util.Arrays.equals(this.weightUnit, other.getWeightUnit()))) &&
            ((this.wipAcct==null && other.getWipAcct()==null) || 
             (this.wipAcct!=null &&
              java.util.Arrays.equals(this.wipAcct, other.getWipAcct()))) &&
            ((this.wipVarianceAcct==null && other.getWipVarianceAcct()==null) || 
             (this.wipVarianceAcct!=null &&
              java.util.Arrays.equals(this.wipVarianceAcct, other.getWipVarianceAcct()))) &&
            ((this.yahooProductFeed==null && other.getYahooProductFeed()==null) || 
             (this.yahooProductFeed!=null &&
              java.util.Arrays.equals(this.yahooProductFeed, other.getYahooProductFeed()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccBookRevRecForecastRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccBookRevRecForecastRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountingBook() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBook());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBook(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountingBookAmortization() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBookAmortization());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBookAmortization(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountingBookCreatePlansOn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBookCreatePlansOn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBookCreatePlansOn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountingBookRevRecRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBookRevRecRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBookRevRecRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountingBookRevRecSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBookRevRecSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBookRevRecSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowedShippingMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedShippingMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedShippingMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlternateDemandSourceItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateDemandSourceItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateDemandSourceItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssetAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssetAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssetAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAtpLeadTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtpLeadTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtpLeadTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAtpMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtpMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtpMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoLeadTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoLeadTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoLeadTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoPreferredStockLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoPreferredStockLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoPreferredStockLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoReorderPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoReorderPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoReorderPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableToPartners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableToPartners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableToPartners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAverageCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAverageCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAverageCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBackwardConsumptionDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBackwardConsumptionDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBackwardConsumptionDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBasePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBasePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBasePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillExchRateVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillExchRateVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillExchRateVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillPriceVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillPriceVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillPriceVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillQtyVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillQtyVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillQtyVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinOnHandAvail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinOnHandAvail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinOnHandAvail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinOnHandCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinOnHandCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinOnHandCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBomQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBomQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBomQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildEntireAssembly() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildEntireAssembly());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildEntireAssembly(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyItNowPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyItNowPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyItNowPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategoryPreferred() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryPreferred());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryPreferred(), i);
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
        if (getComponentYield() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentYield());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentYield(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContingentRevenueHandling() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContingentRevenueHandling());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContingentRevenueHandling(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCopyDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCopyDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCopyDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorrelatedItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrelatedItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrelatedItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorrelatedItemCorrelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrelatedItemCorrelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrelatedItemCorrelation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorrelatedItemCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrelatedItemCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrelatedItemCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorrelatedItemLift() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrelatedItemLift());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrelatedItemLift(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorrelatedItemPurchaseRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrelatedItemPurchaseRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrelatedItemPurchaseRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostAccountingStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostAccountingStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostAccountingStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostEstimateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostingMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostingMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostingMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryOfManufacture() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryOfManufacture());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryOfManufacture(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreateJob() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreateJob());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreateJob(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreateRevenuePlansOn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreateRevenuePlansOn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreateRevenuePlansOn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustReturnVarianceAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustReturnVarianceAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustReturnVarianceAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateViewed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateViewed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateViewed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysBeforeExpiration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysBeforeExpiration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysBeforeExpiration(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultReturnCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultReturnCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultReturnCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultShippingMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultShippingMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultShippingMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferredExpenseAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferredExpenseAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferredExpenseAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferredRevenueAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferredRevenueAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferredRevenueAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferRevRec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferRevRec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferRevRec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDemandModifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDemandModifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDemandModifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDemandSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDemandSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDemandSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDemandTimeFence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDemandTimeFence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDemandTimeFence(), i);
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
        if (getDepartmentnohierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartmentnohierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartmentnohierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDirectRevenuePosting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirectRevenuePosting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDirectRevenuePosting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisplayIneBayStore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayIneBayStore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayIneBayStore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisplayName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistributionCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributionCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributionCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistributionNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributionNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributionNetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDontShowPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDontShowPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDontShowPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEBayItemDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEBayItemDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEBayItemDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEBayItemSubtitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEBayItemSubtitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEBayItemSubtitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEBayItemTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEBayItemTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEBayItemTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEbayRelistingOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEbayRelistingOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEbayRelistingOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveBomControl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveBomControl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveBomControl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveRevision() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveRevision());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveRevision(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndAuctionsWhenOutOfStock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndAuctionsWhenOutOfStock());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndAuctionsWhenOutOfStock(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeFromSitemap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeFromSitemap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeFromSitemap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpenseAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpenseAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpenseAccount(), i);
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
        if (getFeaturedDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeaturedDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeaturedDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeedDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeedName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFixedLotSize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFixedLotSize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFixedLotSize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForwardConsumptionDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardConsumptionDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardConsumptionDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFraudRisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFraudRisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFraudRisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFroogleProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFroogleProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFroogleProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGainLossAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGainLossAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGainLossAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGenerateAccruals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGenerateAccruals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGenerateAccruals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertAuthCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertAuthCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertAuthCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertExpirationDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertExpirationDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertExpirationDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertFrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertFrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertFrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertOriginalAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertOriginalAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertOriginalAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertRecipient() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertRecipient());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertRecipient(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHierarchyNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHierarchyNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHierarchyNode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHierarchyVersion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHierarchyVersion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHierarchyVersion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImageUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncomeAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncomeAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncomeAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntercoDefRevAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntercoDefRevAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntercoDefRevAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntercoExpenseAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntercoExpenseAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntercoExpenseAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntercoIncomeAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntercoIncomeAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntercoIncomeAccount(), i);
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
        if (getInventoryLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventoryLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventoryLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvtClassification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvtClassification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvtClassification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvtCountInterval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvtCountInterval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvtCountInterval(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsDropShipItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsDropShipItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsDropShipItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsFulfillable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsFulfillable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsFulfillable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoCompliant() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoCompliant());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoCompliant(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsLotItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsLotItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsLotItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsOnline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsOnline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsOnline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSerialItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSerialItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSerialItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSpecialOrderItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSpecialOrderItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSpecialOrderItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSpecialWorkOrderItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSpecialWorkOrderItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSpecialWorkOrderItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsStorePickupAllowed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsStorePickupAllowed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsStorePickupAllowed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssueProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsTaxable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsTaxable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsTaxable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsVsoeBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsVsoeBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsVsoeBundle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsWip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsWip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsWip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemRevenueCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemRevenueCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemRevenueCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastInvtCountDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastInvtCountDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastInvtCountDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastPurchasePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastPurchasePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastPurchasePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastQuantityAvailableChange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastQuantityAvailableChange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastQuantityAvailableChange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLeadTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeadTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeadTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLiabilityAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiabilityAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiabilityAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListingDuration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListingDuration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListingDuration(), i);
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
        if (getLocationAllowStorePickup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationAllowStorePickup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationAllowStorePickup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationAtpLeadTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationAtpLeadTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationAtpLeadTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationAverageCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationAverageCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationAverageCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationBinQuantityAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationBinQuantityAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationBinQuantityAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationBuildTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationBuildTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationBuildTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationCostAccountingStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationCostAccountingStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationCostAccountingStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationDefaultReturnCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationDefaultReturnCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationDefaultReturnCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationDemandSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationDemandSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationDemandSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationDemandTimeFence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationDemandTimeFence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationDemandTimeFence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationFixedLotSize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationFixedLotSize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationFixedLotSize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationInventoryCostTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationInventoryCostTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationInventoryCostTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationInvtClassification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationInvtClassification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationInvtClassification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationInvtCountInterval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationInvtCountInterval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationInvtCountInterval(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationLastInvtCountDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationLastInvtCountDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationLastInvtCountDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationLeadTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationLeadTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationLeadTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationNextInvtCountDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationNextInvtCountDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationNextInvtCountDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationPeriodicLotSizeDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationPeriodicLotSizeDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationPeriodicLotSizeDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationPeriodicLotSizeType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationPeriodicLotSizeType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationPeriodicLotSizeType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationPreferredStockLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationPreferredStockLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationPreferredStockLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQtyAvailForStorePickup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQtyAvailForStorePickup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQtyAvailForStorePickup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityBackOrdered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityBackOrdered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityBackOrdered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityInTransit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityInTransit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityInTransit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityOnHand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityOnHand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityOnHand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityOnOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityOnOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityOnOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationReOrderPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationReOrderPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationReOrderPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationRescheduleInDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationRescheduleInDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationRescheduleInDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationRescheduleOutDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationRescheduleOutDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationRescheduleOutDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationSafetyStockLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationSafetyStockLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationSafetyStockLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationStorePickupBufferStock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationStorePickupBufferStock());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationStorePickupBufferStock(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationSupplyLotSizingMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationSupplyLotSizingMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationSupplyLotSizingMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationSupplyTimeFence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationSupplyTimeFence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationSupplyTimeFence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationSupplyType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationSupplyType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationSupplyType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationTotalValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationTotalValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationTotalValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocBackwardConsumptionDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocBackwardConsumptionDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocBackwardConsumptionDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocForwardConsumptionDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocForwardConsumptionDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocForwardConsumptionDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerAddr1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerAddr1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerAddr1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerTariff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerTariff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerTariff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerTaxId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerTaxId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerTaxId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerZip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturingChargeItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingChargeItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingChargeItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMatchBillToReceipt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchBillToReceipt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchBillToReceipt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaximumQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaximumQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaximumQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemberItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemberQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetaTagHtml() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetaTagHtml());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetaTagHtml(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMinimumQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMinimumQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMinimumQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModified() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModified());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModified(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMossApplies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMossApplies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMossApplies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMpn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMpn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMpn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMultManufactureAddr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultManufactureAddr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultManufactureAddr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextagCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextagCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextagCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextagProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextagProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextagProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextInvtCountDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextInvtCountDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextInvtCountDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoPriceMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoPriceMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoPriceMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumActiveListings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumActiveListings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumActiveListings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumberAllowedDownloads() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumberAllowedDownloads());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumberAllowedDownloads(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumCurrentlyListed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumCurrentlyListed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumCurrentlyListed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObsoleteDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObsoleteDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObsoleteDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObsoleteRevision() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObsoleteRevision());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObsoleteRevision(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfferSupport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferSupport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferSupport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOnlineCustomerPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnlineCustomerPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnlineCustomerPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOnlinePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnlinePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnlinePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOnSpecial() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnSpecial());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnSpecial(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherVendor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherVendor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherVendor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutOfStockBehavior() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutOfStockBehavior());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutOfStockBehavior(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutOfStockMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutOfStockMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutOfStockMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverallQuantityPricingType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverallQuantityPricingType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverallQuantityPricingType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverheadType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverheadType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverheadType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPageTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPageTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriodicLotSizeDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodicLotSizeDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodicLotSizeDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriodicLotSizeType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodicLotSizeType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodicLotSizeType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferenceCriterion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferenceCriterion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferenceCriterion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredBin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredBin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredBin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredStockLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredStockLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredStockLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredStockLevelDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredStockLevelDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredStockLevelDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricesIncludeTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricesIncludeTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricesIncludeTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricingGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProdPriceVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdPriceVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdPriceVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProdQtyVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdQtyVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdQtyVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderQuantityDiff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderQuantityDiff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderQuantityDiff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchasePriceVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchasePriceVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchasePriceVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityBackOrdered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityBackOrdered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityBackOrdered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityOnHand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityOnHand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityOnHand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityOnOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityOnOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityOnOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityPricingSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityPricingSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityPricingSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptQuantityDiff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptQuantityDiff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptQuantityDiff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReorderMultiple() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReorderMultiple());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReorderMultiple(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReOrderPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReOrderPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReOrderPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRescheduleInDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRescheduleInDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRescheduleInDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRescheduleOutDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRescheduleOutDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRescheduleOutDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReservePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReservePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReservePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevenueAllocationGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevenueAllocationGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevenueAllocationGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevenueRecognitionRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevenueRecognitionRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevenueRecognitionRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecForecastRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecForecastRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecForecastRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevReclassFXAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevReclassFXAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevReclassFXAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoundUpAsComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoundUpAsComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoundUpAsComponent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSafetyStockLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSafetyStockLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSafetyStockLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSafetyStockLevelDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSafetyStockLevelDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSafetyStockLevelDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTaxCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTaxCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTaxCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSaleUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSaleUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSaleUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSameAsPrimaryBookAmortization() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSameAsPrimaryBookAmortization());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSameAsPrimaryBookAmortization(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSameAsPrimaryBookRevRec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSameAsPrimaryBookRevRec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSameAsPrimaryBookRevRec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduleBCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduleBCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduleBCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduleBNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduleBNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduleBNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduleBQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduleBQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduleBQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScrapAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScrapAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScrapAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchKeywords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchKeywords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeasonalDemand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeasonalDemand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeasonalDemand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSellOnEBay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellOnEBay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellOnEBay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumberLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumberLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumberLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipIndividually() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipIndividually());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipIndividually(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipPackage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipPackage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipPackage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingCarrier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingCarrier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingCarrier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShoppingDotComCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShoppingDotComCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShoppingDotComCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShoppingProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShoppingProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShoppingProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShopzillaCategoryId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopzillaCategoryId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopzillaCategoryId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShopzillaProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopzillaProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopzillaProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSitemapPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSitemapPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSitemapPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoftDescriptor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoftDescriptor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoftDescriptor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartingPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartingPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartingPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStockDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStockDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStockDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStockUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStockUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStockUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDetailedDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDetailedDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDetailedDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDisplayImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDisplayImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDisplayImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDisplayName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDisplayName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDisplayName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDisplayThumbnail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDisplayThumbnail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDisplayThumbnail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupplyLotSizingMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplyLotSizingMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplyLotSizingMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupplyReplenishmentMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplyReplenishmentMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplyReplenishmentMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupplyTimeFence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplyTimeFence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplyTimeFence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupplyType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplyType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplyType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThumbNailUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThumbNailUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThumbNailUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackLandedCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackLandedCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackLandedCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnbuildVarianceAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnbuildVarianceAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnbuildVarianceAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitsType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitsType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitsType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpcCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpcCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpcCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrlComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrlComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrlComponent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseBins() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseBins());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseBins(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseComponentYield() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseComponentYield());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseComponentYield(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseMarginalRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseMarginalRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseMarginalRates(), i);
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
        if (getVendorCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorCostEntered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorCostEntered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorCostEntered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorPriceCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorPriceCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorPriceCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendReturnVarianceAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendReturnVarianceAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendReturnVarianceAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeDeferral() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeDeferral());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeDeferral(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeDelivered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeDelivered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeDelivered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoePermitDiscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoePermitDiscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoePermitDiscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeSopGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeSopGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeSopGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWebSite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebSite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebSite(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeightUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeightUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeightUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWipAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWipAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWipAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWipVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWipVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWipVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getYahooProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getYahooProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getYahooProductFeed(), i);
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
        new org.apache.axis.description.TypeDesc(ItemSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accBookRevRecForecastRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accBookRevRecForecastRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookAmortization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookAmortization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookCreatePlansOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookCreatePlansOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookRevRecRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookRevRecRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookRevRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBookRevRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedShippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allowedShippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateDemandSourceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "alternateDemandSourceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assetAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "atpLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "atpMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPreferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoPreferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoReorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoReorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "backwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "basePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billExchRateVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billExchRateVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPriceVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billPriceVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billQtyVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billQtyVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binOnHandAvail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binOnHandAvail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binOnHandCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binOnHandCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyItNowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyItNowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryPreferred");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "categoryPreferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contingentRevenueHandling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contingentRevenueHandling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "copyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemCorrelation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItemCorrelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItemCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemLift");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItemLift"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemPurchaseRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "correlatedItemPurchaseRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costAccountingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costAccountingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createRevenuePlansOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createRevenuePlansOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custReturnVarianceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "custReturnVarianceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysBeforeExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysBeforeExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultShippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultShippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredExpenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferredExpenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenueAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferredRevenueAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "demandModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "demandSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "demandTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("departmentnohierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "departmentnohierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directRevenuePosting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "directRevenuePosting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayIneBayStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "displayIneBayStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributionCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "distributionCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributionNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "distributionNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eBayItemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemSubtitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eBayItemSubtitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eBayItemTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ebayRelistingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ebayRelistingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveBomControl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveBomControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAuctionsWhenOutOfStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endAuctionsWhenOutOfStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "feedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "feedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedLotSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fixedLotSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "forwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudRisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fraudRisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("froogleProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "froogleProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gainLossAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gainLossAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateAccruals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "generateAccruals"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertAuthCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertAuthCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertOriginalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertOriginalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertRecipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyNode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hierarchyNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hierarchyVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "imageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoDefRevAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "intercoDefRevAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoExpenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "intercoExpenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoIncomeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "intercoIncomeAccount"));
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
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invtClassification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "invtClassification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invtCountInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "invtCountInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDropShipItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDropShipItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLotItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isLotItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSerialItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSerialItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSpecialOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialWorkOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSpecialWorkOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isStorePickupAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isStorePickupAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isWip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastQuantityAvailableChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastQuantityAvailableChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilityAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "liabilityAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "listingDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("locationAllowStorePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationAllowStorePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAtpLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationAtpLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAverageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationAverageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationBinQuantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationBinQuantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationBuildTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationBuildTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCostAccountingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationCostAccountingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationDefaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationDefaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationDemandSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationDemandSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationDemandTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationDemandTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationFixedLotSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationFixedLotSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationInventoryCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationInventoryCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationInvtClassification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationInvtClassification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationInvtCountInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationInvtCountInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationLastInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationLastInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNextInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationNextInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationPeriodicLotSizeDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationPeriodicLotSizeDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationPeriodicLotSizeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationPeriodicLotSizeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationPreferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationPreferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQtyAvailForStorePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQtyAvailForStorePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityInTransit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityInTransit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationQuantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationReOrderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationReOrderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationRescheduleInDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationRescheduleInDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationRescheduleOutDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationRescheduleOutDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationSafetyStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationSafetyStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationStorePickupBufferStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationStorePickupBufferStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationSupplyLotSizingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationSupplyLotSizingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationSupplyTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationSupplyTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationSupplyType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationSupplyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationTotalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationTotalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locBackwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locBackwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locForwardConsumptionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locForwardConsumptionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerAddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerAddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingChargeItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingChargeItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "maximumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memberItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mossApplies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mossApplies"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextagCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextagCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextagProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextagProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextInvtCountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextInvtCountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noPriceMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "noPriceMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveListings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "numActiveListings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberAllowedDownloads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "numberAllowedDownloads"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCurrentlyListed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "numCurrentlyListed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsoleteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "obsoleteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsoleteRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "obsoleteRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineCustomerPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "onlineCustomerPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlinePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "onlinePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "otherPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "otherVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "outOfStockMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overheadType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "overheadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicLotSizeDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodicLotSizeDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicLotSizeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodicLotSizeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferredBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferredLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferredStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricesIncludeTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pricesIncludeTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "primaryCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodPriceVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "prodPriceVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodQtyVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "prodQtyVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasePriceVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchasePriceVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderMultiple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reorderMultiple"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reOrderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reOrderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rescheduleInDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rescheduleInDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rescheduleOutDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rescheduleOutDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reservePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueAllocationGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revenueAllocationGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueRecognitionRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revenueRecognitionRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revReclassFXAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revReclassFXAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundUpAsComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "roundUpAsComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "safetyStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameAsPrimaryBookAmortization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sameAsPrimaryBookAmortization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameAsPrimaryBookRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sameAsPrimaryBookRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scrapAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scrapAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seasonalDemand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "seasonalDemand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellOnEBay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sellOnEBay"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumberLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shippingCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shoppingProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shopzillaProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stockUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDetailedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "storeDetailedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "storeDisplayImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "storeDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyLotSizingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "supplyLotSizingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyReplenishmentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "supplyReplenishmentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyTimeFence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "supplyTimeFence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "supplyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbNailUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "thumbNailUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "totalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackLandedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "trackLandedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbuildVarianceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unbuildVarianceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCostEntered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorCostEntered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPriceCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorPriceCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendorSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendReturnVarianceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendReturnVarianceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeSopGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeSopGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "webSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "weightUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wipAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "wipAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wipVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "wipVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yahooProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "yahooProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
