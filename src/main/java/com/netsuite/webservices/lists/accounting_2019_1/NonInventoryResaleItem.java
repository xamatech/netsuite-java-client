/**
 * NonInventoryResaleItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class NonInventoryResaleItem  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String purchaseDescription;

    private java.lang.Boolean copyDescription;

    private java.lang.Double cost;

    private java.lang.String costUnits;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef intercoExpenseAccount;

    private java.lang.String salesDescription;

    private java.lang.Boolean includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef incomeAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef intercoIncomeAccount;

    private java.lang.Boolean isTaxable;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType matrixType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef dropshipExpenseAccount;

    private java.lang.Boolean deferRevRec;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revenueRecognitionRule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revRecForecastRule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revenueAllocationGroup;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createRevenuePlansOn;

    private java.lang.Boolean directRevenuePosting;

    private java.lang.Boolean isDropShipItem;

    private java.lang.Boolean isSpecialOrderItem;

    private java.lang.Double shippingCost;

    private java.lang.String shippingCostUnits;

    private java.lang.Double handlingCost;

    private java.lang.String handlingCostUnits;

    private com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType costEstimateType;

    private java.lang.Double costEstimate;

    private java.lang.Double weight;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemWeightUnit weightUnit;

    private java.lang.String weightUnits;

    private java.lang.String costEstimateUnits;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseUnit;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef saleUnit;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef issueProduct;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef deferredRevenueAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationTemplate;

    private java.lang.String residual;

    private java.lang.Long amortizationPeriod;

    private java.lang.String stockDescription;

    private java.lang.Boolean producer;

    private java.lang.String manufacturer;

    private java.lang.String mpn;

    private java.lang.Boolean multManufactureAddr;

    private java.lang.String manufacturerAddr1;

    private java.lang.String manufacturerCity;

    private java.lang.String manufacturerState;

    private java.lang.String manufacturerZip;

    private com.netsuite.webservices.platform.common_2019_1.types.Country countryOfManufacture;

    private java.lang.Double purchaseOrderQuantity;

    private java.lang.Double purchaseOrderAmount;

    private java.lang.Double purchaseOrderQuantityDiff;

    private java.lang.Double receiptQuantity;

    private java.lang.Double receiptAmount;

    private java.lang.Double receiptQuantityDiff;

    private java.lang.String manufacturerTaxId;

    private java.lang.String scheduleBNumber;

    private java.lang.Long scheduleBQuantity;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ScheduleBCode scheduleBCode;

    private java.lang.String manufacturerTariff;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemPreferenceCriterion preferenceCriterion;

    private java.lang.Long minimumQuantity;

    private java.lang.Boolean enforceMinQtyInternally;

    private java.lang.Long maximumQuantity;

    private java.lang.String softDescriptor;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipPackage;

    private java.lang.Boolean shipIndividually;

    private java.lang.Boolean isFulfillable;

    private java.lang.Boolean generateAccruals;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory;

    private java.lang.Boolean pricesIncludeTax;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef quantityPricingSchedule;

    private java.lang.Boolean useMarginalRates;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemOverallQuantityPricingType overallQuantityPricingType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef pricingGroup;

    private java.lang.String minimumQuantityUnits;

    private java.lang.Double vsoePrice;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup vsoeSopGroup;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount;

    private java.lang.Boolean vsoeDelivered;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef itemRevenueCategory;

    private java.lang.String storeDisplayName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayThumbnail;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayImage;

    private java.lang.String storeDescription;

    private java.lang.String storeDetailedDescription;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef storeItemTemplate;

    private java.lang.String pageTitle;

    private java.lang.String metaTagHtml;

    private java.lang.Boolean excludeFromSitemap;

    private com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority sitemapPriority;

    private java.lang.String searchKeywords;

    private java.lang.Boolean isDonationItem;

    private java.lang.Boolean showDefaultDonationAmount;

    private java.lang.Double maxDonationAmount;

    private java.lang.Boolean dontShowPrice;

    private java.lang.String noPriceMessage;

    private java.lang.String outOfStockMessage;

    private java.lang.Boolean onSpecial;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemOutOfStockBehavior outOfStockBehavior;

    private java.lang.String relatedItemsDescription;

    private java.lang.String specialsDescription;

    private java.lang.String featuredDescription;

    private java.lang.String shoppingDotComCategory;

    private java.lang.Long shopzillaCategoryId;

    private java.lang.String nexTagCategory;

    private com.netsuite.webservices.lists.accounting_2019_1.ProductFeedList productFeedList;

    private java.lang.String urlComponent;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String itemId;

    private java.lang.String upcCode;

    private java.lang.String displayName;

    private java.lang.String vendorName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private java.lang.Boolean isOnline;

    private java.lang.Boolean isHazmatItem;

    private java.lang.String hazmatId;

    private java.lang.String hazmatShippingName;

    private java.lang.String hazmatHazardClass;

    private com.netsuite.webservices.lists.accounting_2019_1.types.HazmatPackingGroup hazmatPackingGroup;

    private java.lang.String hazmatItemUnits;

    private java.lang.Double hazmatItemUnitsQty;

    private java.lang.Boolean isGcoCompliant;

    private java.lang.Boolean offerSupport;

    private java.lang.Boolean isInactive;

    private java.lang.String matrixItemNameTemplate;

    private java.lang.Boolean availableToPartners;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultItemShipMethod;

    private com.netsuite.webservices.platform.common_2019_1.types.ShippingCarrier itemCarrier;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList itemShipMethodList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList;

    private java.lang.String currency;

    private com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList itemOptionsList;

    private com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList matrixOptionList;

    private com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList itemVendorList;

    private com.netsuite.webservices.lists.accounting_2019_1.PricingMatrix pricingMatrix;

    private com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseTaxCode;

    private java.lang.Double rate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesTaxCode;

    private com.netsuite.webservices.lists.accounting_2019_1.SiteCategoryList siteCategoryList;

    private com.netsuite.webservices.lists.accounting_2019_1.TranslationList translationsList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef vendor;

    private com.netsuite.webservices.lists.accounting_2019_1.PresentationItemList presentationItemList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public NonInventoryResaleItem() {
    }

    public NonInventoryResaleItem(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           java.lang.String purchaseDescription,
           java.lang.Boolean copyDescription,
           java.lang.Double cost,
           java.lang.String costUnits,
           com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef intercoExpenseAccount,
           java.lang.String salesDescription,
           java.lang.Boolean includeChildren,
           com.netsuite.webservices.platform.core_2019_1.RecordRef incomeAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef intercoIncomeAccount,
           java.lang.Boolean isTaxable,
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType matrixType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef dropshipExpenseAccount,
           java.lang.Boolean deferRevRec,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revenueRecognitionRule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revRecForecastRule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revenueAllocationGroup,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createRevenuePlansOn,
           java.lang.Boolean directRevenuePosting,
           java.lang.Boolean isDropShipItem,
           java.lang.Boolean isSpecialOrderItem,
           java.lang.Double shippingCost,
           java.lang.String shippingCostUnits,
           java.lang.Double handlingCost,
           java.lang.String handlingCostUnits,
           com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType costEstimateType,
           java.lang.Double costEstimate,
           java.lang.Double weight,
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemWeightUnit weightUnit,
           java.lang.String weightUnits,
           java.lang.String costEstimateUnits,
           com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseUnit,
           com.netsuite.webservices.platform.core_2019_1.RecordRef saleUnit,
           com.netsuite.webservices.platform.core_2019_1.RecordRef issueProduct,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef deferredRevenueAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationTemplate,
           java.lang.String residual,
           java.lang.Long amortizationPeriod,
           java.lang.String stockDescription,
           java.lang.Boolean producer,
           java.lang.String manufacturer,
           java.lang.String mpn,
           java.lang.Boolean multManufactureAddr,
           java.lang.String manufacturerAddr1,
           java.lang.String manufacturerCity,
           java.lang.String manufacturerState,
           java.lang.String manufacturerZip,
           com.netsuite.webservices.platform.common_2019_1.types.Country countryOfManufacture,
           java.lang.Double purchaseOrderQuantity,
           java.lang.Double purchaseOrderAmount,
           java.lang.Double purchaseOrderQuantityDiff,
           java.lang.Double receiptQuantity,
           java.lang.Double receiptAmount,
           java.lang.Double receiptQuantityDiff,
           java.lang.String manufacturerTaxId,
           java.lang.String scheduleBNumber,
           java.lang.Long scheduleBQuantity,
           com.netsuite.webservices.lists.accounting_2019_1.types.ScheduleBCode scheduleBCode,
           java.lang.String manufacturerTariff,
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemPreferenceCriterion preferenceCriterion,
           java.lang.Long minimumQuantity,
           java.lang.Boolean enforceMinQtyInternally,
           java.lang.Long maximumQuantity,
           java.lang.String softDescriptor,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipPackage,
           java.lang.Boolean shipIndividually,
           java.lang.Boolean isFulfillable,
           java.lang.Boolean generateAccruals,
           com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory,
           java.lang.Boolean pricesIncludeTax,
           com.netsuite.webservices.platform.core_2019_1.RecordRef quantityPricingSchedule,
           java.lang.Boolean useMarginalRates,
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemOverallQuantityPricingType overallQuantityPricingType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef pricingGroup,
           java.lang.String minimumQuantityUnits,
           java.lang.Double vsoePrice,
           com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup vsoeSopGroup,
           com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral,
           com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount,
           java.lang.Boolean vsoeDelivered,
           com.netsuite.webservices.platform.core_2019_1.RecordRef itemRevenueCategory,
           java.lang.String storeDisplayName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayThumbnail,
           com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayImage,
           java.lang.String storeDescription,
           java.lang.String storeDetailedDescription,
           com.netsuite.webservices.platform.core_2019_1.RecordRef storeItemTemplate,
           java.lang.String pageTitle,
           java.lang.String metaTagHtml,
           java.lang.Boolean excludeFromSitemap,
           com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority sitemapPriority,
           java.lang.String searchKeywords,
           java.lang.Boolean isDonationItem,
           java.lang.Boolean showDefaultDonationAmount,
           java.lang.Double maxDonationAmount,
           java.lang.Boolean dontShowPrice,
           java.lang.String noPriceMessage,
           java.lang.String outOfStockMessage,
           java.lang.Boolean onSpecial,
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemOutOfStockBehavior outOfStockBehavior,
           java.lang.String relatedItemsDescription,
           java.lang.String specialsDescription,
           java.lang.String featuredDescription,
           java.lang.String shoppingDotComCategory,
           java.lang.Long shopzillaCategoryId,
           java.lang.String nexTagCategory,
           com.netsuite.webservices.lists.accounting_2019_1.ProductFeedList productFeedList,
           java.lang.String urlComponent,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String itemId,
           java.lang.String upcCode,
           java.lang.String displayName,
           java.lang.String vendorName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           java.lang.Boolean isOnline,
           java.lang.Boolean isHazmatItem,
           java.lang.String hazmatId,
           java.lang.String hazmatShippingName,
           java.lang.String hazmatHazardClass,
           com.netsuite.webservices.lists.accounting_2019_1.types.HazmatPackingGroup hazmatPackingGroup,
           java.lang.String hazmatItemUnits,
           java.lang.Double hazmatItemUnitsQty,
           java.lang.Boolean isGcoCompliant,
           java.lang.Boolean offerSupport,
           java.lang.Boolean isInactive,
           java.lang.String matrixItemNameTemplate,
           java.lang.Boolean availableToPartners,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultItemShipMethod,
           com.netsuite.webservices.platform.common_2019_1.types.ShippingCarrier itemCarrier,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList itemShipMethodList,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList,
           java.lang.String currency,
           com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList itemOptionsList,
           com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList matrixOptionList,
           com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList itemVendorList,
           com.netsuite.webservices.lists.accounting_2019_1.PricingMatrix pricingMatrix,
           com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseTaxCode,
           java.lang.Double rate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesTaxCode,
           com.netsuite.webservices.lists.accounting_2019_1.SiteCategoryList siteCategoryList,
           com.netsuite.webservices.lists.accounting_2019_1.TranslationList translationsList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef vendor,
           com.netsuite.webservices.lists.accounting_2019_1.PresentationItemList presentationItemList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.purchaseDescription = purchaseDescription;
        this.copyDescription = copyDescription;
        this.cost = cost;
        this.costUnits = costUnits;
        this.expenseAccount = expenseAccount;
        this.intercoExpenseAccount = intercoExpenseAccount;
        this.salesDescription = salesDescription;
        this.includeChildren = includeChildren;
        this.incomeAccount = incomeAccount;
        this.intercoIncomeAccount = intercoIncomeAccount;
        this.isTaxable = isTaxable;
        this.matrixType = matrixType;
        this.taxSchedule = taxSchedule;
        this.dropshipExpenseAccount = dropshipExpenseAccount;
        this.deferRevRec = deferRevRec;
        this.revenueRecognitionRule = revenueRecognitionRule;
        this.revRecForecastRule = revRecForecastRule;
        this.revenueAllocationGroup = revenueAllocationGroup;
        this.createRevenuePlansOn = createRevenuePlansOn;
        this.directRevenuePosting = directRevenuePosting;
        this.isDropShipItem = isDropShipItem;
        this.isSpecialOrderItem = isSpecialOrderItem;
        this.shippingCost = shippingCost;
        this.shippingCostUnits = shippingCostUnits;
        this.handlingCost = handlingCost;
        this.handlingCostUnits = handlingCostUnits;
        this.costEstimateType = costEstimateType;
        this.costEstimate = costEstimate;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.weightUnits = weightUnits;
        this.costEstimateUnits = costEstimateUnits;
        this.unitsType = unitsType;
        this.purchaseUnit = purchaseUnit;
        this.saleUnit = saleUnit;
        this.issueProduct = issueProduct;
        this.billingSchedule = billingSchedule;
        this.deferredRevenueAccount = deferredRevenueAccount;
        this.revRecSchedule = revRecSchedule;
        this.deferralAccount = deferralAccount;
        this.amortizationTemplate = amortizationTemplate;
        this.residual = residual;
        this.amortizationPeriod = amortizationPeriod;
        this.stockDescription = stockDescription;
        this.producer = producer;
        this.manufacturer = manufacturer;
        this.mpn = mpn;
        this.multManufactureAddr = multManufactureAddr;
        this.manufacturerAddr1 = manufacturerAddr1;
        this.manufacturerCity = manufacturerCity;
        this.manufacturerState = manufacturerState;
        this.manufacturerZip = manufacturerZip;
        this.countryOfManufacture = countryOfManufacture;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptQuantity = receiptQuantity;
        this.receiptAmount = receiptAmount;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.manufacturerTaxId = manufacturerTaxId;
        this.scheduleBNumber = scheduleBNumber;
        this.scheduleBQuantity = scheduleBQuantity;
        this.scheduleBCode = scheduleBCode;
        this.manufacturerTariff = manufacturerTariff;
        this.preferenceCriterion = preferenceCriterion;
        this.minimumQuantity = minimumQuantity;
        this.enforceMinQtyInternally = enforceMinQtyInternally;
        this.maximumQuantity = maximumQuantity;
        this.softDescriptor = softDescriptor;
        this.shipPackage = shipPackage;
        this.shipIndividually = shipIndividually;
        this.isFulfillable = isFulfillable;
        this.generateAccruals = generateAccruals;
        this.costCategory = costCategory;
        this.pricesIncludeTax = pricesIncludeTax;
        this.quantityPricingSchedule = quantityPricingSchedule;
        this.useMarginalRates = useMarginalRates;
        this.overallQuantityPricingType = overallQuantityPricingType;
        this.pricingGroup = pricingGroup;
        this.minimumQuantityUnits = minimumQuantityUnits;
        this.vsoePrice = vsoePrice;
        this.vsoeSopGroup = vsoeSopGroup;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
        this.itemRevenueCategory = itemRevenueCategory;
        this.storeDisplayName = storeDisplayName;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.storeDisplayImage = storeDisplayImage;
        this.storeDescription = storeDescription;
        this.storeDetailedDescription = storeDetailedDescription;
        this.storeItemTemplate = storeItemTemplate;
        this.pageTitle = pageTitle;
        this.metaTagHtml = metaTagHtml;
        this.excludeFromSitemap = excludeFromSitemap;
        this.sitemapPriority = sitemapPriority;
        this.searchKeywords = searchKeywords;
        this.isDonationItem = isDonationItem;
        this.showDefaultDonationAmount = showDefaultDonationAmount;
        this.maxDonationAmount = maxDonationAmount;
        this.dontShowPrice = dontShowPrice;
        this.noPriceMessage = noPriceMessage;
        this.outOfStockMessage = outOfStockMessage;
        this.onSpecial = onSpecial;
        this.outOfStockBehavior = outOfStockBehavior;
        this.relatedItemsDescription = relatedItemsDescription;
        this.specialsDescription = specialsDescription;
        this.featuredDescription = featuredDescription;
        this.shoppingDotComCategory = shoppingDotComCategory;
        this.shopzillaCategoryId = shopzillaCategoryId;
        this.nexTagCategory = nexTagCategory;
        this.productFeedList = productFeedList;
        this.urlComponent = urlComponent;
        this.customForm = customForm;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.vendorName = vendorName;
        this.parent = parent;
        this.isOnline = isOnline;
        this.isHazmatItem = isHazmatItem;
        this.hazmatId = hazmatId;
        this.hazmatShippingName = hazmatShippingName;
        this.hazmatHazardClass = hazmatHazardClass;
        this.hazmatPackingGroup = hazmatPackingGroup;
        this.hazmatItemUnits = hazmatItemUnits;
        this.hazmatItemUnitsQty = hazmatItemUnitsQty;
        this.isGcoCompliant = isGcoCompliant;
        this.offerSupport = offerSupport;
        this.isInactive = isInactive;
        this.matrixItemNameTemplate = matrixItemNameTemplate;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.defaultItemShipMethod = defaultItemShipMethod;
        this.itemCarrier = itemCarrier;
        this.itemShipMethodList = itemShipMethodList;
        this.subsidiaryList = subsidiaryList;
        this.currency = currency;
        this.itemOptionsList = itemOptionsList;
        this.matrixOptionList = matrixOptionList;
        this.itemVendorList = itemVendorList;
        this.pricingMatrix = pricingMatrix;
        this.accountingBookDetailList = accountingBookDetailList;
        this.purchaseTaxCode = purchaseTaxCode;
        this.rate = rate;
        this.salesTaxCode = salesTaxCode;
        this.siteCategoryList = siteCategoryList;
        this.translationsList = translationsList;
        this.vendor = vendor;
        this.presentationItemList = presentationItemList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this NonInventoryResaleItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this NonInventoryResaleItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this NonInventoryResaleItem.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this NonInventoryResaleItem.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the purchaseDescription value for this NonInventoryResaleItem.
     * 
     * @return purchaseDescription
     */
    public java.lang.String getPurchaseDescription() {
        return purchaseDescription;
    }


    /**
     * Sets the purchaseDescription value for this NonInventoryResaleItem.
     * 
     * @param purchaseDescription
     */
    public void setPurchaseDescription(java.lang.String purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }


    /**
     * Gets the copyDescription value for this NonInventoryResaleItem.
     * 
     * @return copyDescription
     */
    public java.lang.Boolean getCopyDescription() {
        return copyDescription;
    }


    /**
     * Sets the copyDescription value for this NonInventoryResaleItem.
     * 
     * @param copyDescription
     */
    public void setCopyDescription(java.lang.Boolean copyDescription) {
        this.copyDescription = copyDescription;
    }


    /**
     * Gets the cost value for this NonInventoryResaleItem.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this NonInventoryResaleItem.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the costUnits value for this NonInventoryResaleItem.
     * 
     * @return costUnits
     */
    public java.lang.String getCostUnits() {
        return costUnits;
    }


    /**
     * Sets the costUnits value for this NonInventoryResaleItem.
     * 
     * @param costUnits
     */
    public void setCostUnits(java.lang.String costUnits) {
        this.costUnits = costUnits;
    }


    /**
     * Gets the expenseAccount value for this NonInventoryResaleItem.
     * 
     * @return expenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this NonInventoryResaleItem.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }


    /**
     * Gets the intercoExpenseAccount value for this NonInventoryResaleItem.
     * 
     * @return intercoExpenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIntercoExpenseAccount() {
        return intercoExpenseAccount;
    }


    /**
     * Sets the intercoExpenseAccount value for this NonInventoryResaleItem.
     * 
     * @param intercoExpenseAccount
     */
    public void setIntercoExpenseAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef intercoExpenseAccount) {
        this.intercoExpenseAccount = intercoExpenseAccount;
    }


    /**
     * Gets the salesDescription value for this NonInventoryResaleItem.
     * 
     * @return salesDescription
     */
    public java.lang.String getSalesDescription() {
        return salesDescription;
    }


    /**
     * Sets the salesDescription value for this NonInventoryResaleItem.
     * 
     * @param salesDescription
     */
    public void setSalesDescription(java.lang.String salesDescription) {
        this.salesDescription = salesDescription;
    }


    /**
     * Gets the includeChildren value for this NonInventoryResaleItem.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this NonInventoryResaleItem.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the incomeAccount value for this NonInventoryResaleItem.
     * 
     * @return incomeAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIncomeAccount() {
        return incomeAccount;
    }


    /**
     * Sets the incomeAccount value for this NonInventoryResaleItem.
     * 
     * @param incomeAccount
     */
    public void setIncomeAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef incomeAccount) {
        this.incomeAccount = incomeAccount;
    }


    /**
     * Gets the intercoIncomeAccount value for this NonInventoryResaleItem.
     * 
     * @return intercoIncomeAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIntercoIncomeAccount() {
        return intercoIncomeAccount;
    }


    /**
     * Sets the intercoIncomeAccount value for this NonInventoryResaleItem.
     * 
     * @param intercoIncomeAccount
     */
    public void setIntercoIncomeAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef intercoIncomeAccount) {
        this.intercoIncomeAccount = intercoIncomeAccount;
    }


    /**
     * Gets the isTaxable value for this NonInventoryResaleItem.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this NonInventoryResaleItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the matrixType value for this NonInventoryResaleItem.
     * 
     * @return matrixType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType getMatrixType() {
        return matrixType;
    }


    /**
     * Sets the matrixType value for this NonInventoryResaleItem.
     * 
     * @param matrixType
     */
    public void setMatrixType(com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType matrixType) {
        this.matrixType = matrixType;
    }


    /**
     * Gets the taxSchedule value for this NonInventoryResaleItem.
     * 
     * @return taxSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this NonInventoryResaleItem.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the dropshipExpenseAccount value for this NonInventoryResaleItem.
     * 
     * @return dropshipExpenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDropshipExpenseAccount() {
        return dropshipExpenseAccount;
    }


    /**
     * Sets the dropshipExpenseAccount value for this NonInventoryResaleItem.
     * 
     * @param dropshipExpenseAccount
     */
    public void setDropshipExpenseAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef dropshipExpenseAccount) {
        this.dropshipExpenseAccount = dropshipExpenseAccount;
    }


    /**
     * Gets the deferRevRec value for this NonInventoryResaleItem.
     * 
     * @return deferRevRec
     */
    public java.lang.Boolean getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this NonInventoryResaleItem.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(java.lang.Boolean deferRevRec) {
        this.deferRevRec = deferRevRec;
    }


    /**
     * Gets the revenueRecognitionRule value for this NonInventoryResaleItem.
     * 
     * @return revenueRecognitionRule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }


    /**
     * Sets the revenueRecognitionRule value for this NonInventoryResaleItem.
     * 
     * @param revenueRecognitionRule
     */
    public void setRevenueRecognitionRule(com.netsuite.webservices.platform.core_2019_1.RecordRef revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }


    /**
     * Gets the revRecForecastRule value for this NonInventoryResaleItem.
     * 
     * @return revRecForecastRule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevRecForecastRule() {
        return revRecForecastRule;
    }


    /**
     * Sets the revRecForecastRule value for this NonInventoryResaleItem.
     * 
     * @param revRecForecastRule
     */
    public void setRevRecForecastRule(com.netsuite.webservices.platform.core_2019_1.RecordRef revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }


    /**
     * Gets the revenueAllocationGroup value for this NonInventoryResaleItem.
     * 
     * @return revenueAllocationGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevenueAllocationGroup() {
        return revenueAllocationGroup;
    }


    /**
     * Sets the revenueAllocationGroup value for this NonInventoryResaleItem.
     * 
     * @param revenueAllocationGroup
     */
    public void setRevenueAllocationGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef revenueAllocationGroup) {
        this.revenueAllocationGroup = revenueAllocationGroup;
    }


    /**
     * Gets the createRevenuePlansOn value for this NonInventoryResaleItem.
     * 
     * @return createRevenuePlansOn
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreateRevenuePlansOn() {
        return createRevenuePlansOn;
    }


    /**
     * Sets the createRevenuePlansOn value for this NonInventoryResaleItem.
     * 
     * @param createRevenuePlansOn
     */
    public void setCreateRevenuePlansOn(com.netsuite.webservices.platform.core_2019_1.RecordRef createRevenuePlansOn) {
        this.createRevenuePlansOn = createRevenuePlansOn;
    }


    /**
     * Gets the directRevenuePosting value for this NonInventoryResaleItem.
     * 
     * @return directRevenuePosting
     */
    public java.lang.Boolean getDirectRevenuePosting() {
        return directRevenuePosting;
    }


    /**
     * Sets the directRevenuePosting value for this NonInventoryResaleItem.
     * 
     * @param directRevenuePosting
     */
    public void setDirectRevenuePosting(java.lang.Boolean directRevenuePosting) {
        this.directRevenuePosting = directRevenuePosting;
    }


    /**
     * Gets the isDropShipItem value for this NonInventoryResaleItem.
     * 
     * @return isDropShipItem
     */
    public java.lang.Boolean getIsDropShipItem() {
        return isDropShipItem;
    }


    /**
     * Sets the isDropShipItem value for this NonInventoryResaleItem.
     * 
     * @param isDropShipItem
     */
    public void setIsDropShipItem(java.lang.Boolean isDropShipItem) {
        this.isDropShipItem = isDropShipItem;
    }


    /**
     * Gets the isSpecialOrderItem value for this NonInventoryResaleItem.
     * 
     * @return isSpecialOrderItem
     */
    public java.lang.Boolean getIsSpecialOrderItem() {
        return isSpecialOrderItem;
    }


    /**
     * Sets the isSpecialOrderItem value for this NonInventoryResaleItem.
     * 
     * @param isSpecialOrderItem
     */
    public void setIsSpecialOrderItem(java.lang.Boolean isSpecialOrderItem) {
        this.isSpecialOrderItem = isSpecialOrderItem;
    }


    /**
     * Gets the shippingCost value for this NonInventoryResaleItem.
     * 
     * @return shippingCost
     */
    public java.lang.Double getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this NonInventoryResaleItem.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.lang.Double shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the shippingCostUnits value for this NonInventoryResaleItem.
     * 
     * @return shippingCostUnits
     */
    public java.lang.String getShippingCostUnits() {
        return shippingCostUnits;
    }


    /**
     * Sets the shippingCostUnits value for this NonInventoryResaleItem.
     * 
     * @param shippingCostUnits
     */
    public void setShippingCostUnits(java.lang.String shippingCostUnits) {
        this.shippingCostUnits = shippingCostUnits;
    }


    /**
     * Gets the handlingCost value for this NonInventoryResaleItem.
     * 
     * @return handlingCost
     */
    public java.lang.Double getHandlingCost() {
        return handlingCost;
    }


    /**
     * Sets the handlingCost value for this NonInventoryResaleItem.
     * 
     * @param handlingCost
     */
    public void setHandlingCost(java.lang.Double handlingCost) {
        this.handlingCost = handlingCost;
    }


    /**
     * Gets the handlingCostUnits value for this NonInventoryResaleItem.
     * 
     * @return handlingCostUnits
     */
    public java.lang.String getHandlingCostUnits() {
        return handlingCostUnits;
    }


    /**
     * Sets the handlingCostUnits value for this NonInventoryResaleItem.
     * 
     * @param handlingCostUnits
     */
    public void setHandlingCostUnits(java.lang.String handlingCostUnits) {
        this.handlingCostUnits = handlingCostUnits;
    }


    /**
     * Gets the costEstimateType value for this NonInventoryResaleItem.
     * 
     * @return costEstimateType
     */
    public com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this NonInventoryResaleItem.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the costEstimate value for this NonInventoryResaleItem.
     * 
     * @return costEstimate
     */
    public java.lang.Double getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this NonInventoryResaleItem.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(java.lang.Double costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the weight value for this NonInventoryResaleItem.
     * 
     * @return weight
     */
    public java.lang.Double getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this NonInventoryResaleItem.
     * 
     * @param weight
     */
    public void setWeight(java.lang.Double weight) {
        this.weight = weight;
    }


    /**
     * Gets the weightUnit value for this NonInventoryResaleItem.
     * 
     * @return weightUnit
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemWeightUnit getWeightUnit() {
        return weightUnit;
    }


    /**
     * Sets the weightUnit value for this NonInventoryResaleItem.
     * 
     * @param weightUnit
     */
    public void setWeightUnit(com.netsuite.webservices.lists.accounting_2019_1.types.ItemWeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }


    /**
     * Gets the weightUnits value for this NonInventoryResaleItem.
     * 
     * @return weightUnits
     */
    public java.lang.String getWeightUnits() {
        return weightUnits;
    }


    /**
     * Sets the weightUnits value for this NonInventoryResaleItem.
     * 
     * @param weightUnits
     */
    public void setWeightUnits(java.lang.String weightUnits) {
        this.weightUnits = weightUnits;
    }


    /**
     * Gets the costEstimateUnits value for this NonInventoryResaleItem.
     * 
     * @return costEstimateUnits
     */
    public java.lang.String getCostEstimateUnits() {
        return costEstimateUnits;
    }


    /**
     * Sets the costEstimateUnits value for this NonInventoryResaleItem.
     * 
     * @param costEstimateUnits
     */
    public void setCostEstimateUnits(java.lang.String costEstimateUnits) {
        this.costEstimateUnits = costEstimateUnits;
    }


    /**
     * Gets the unitsType value for this NonInventoryResaleItem.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this NonInventoryResaleItem.
     * 
     * @param unitsType
     */
    public void setUnitsType(com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType) {
        this.unitsType = unitsType;
    }


    /**
     * Gets the purchaseUnit value for this NonInventoryResaleItem.
     * 
     * @return purchaseUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchaseUnit() {
        return purchaseUnit;
    }


    /**
     * Sets the purchaseUnit value for this NonInventoryResaleItem.
     * 
     * @param purchaseUnit
     */
    public void setPurchaseUnit(com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }


    /**
     * Gets the saleUnit value for this NonInventoryResaleItem.
     * 
     * @return saleUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSaleUnit() {
        return saleUnit;
    }


    /**
     * Sets the saleUnit value for this NonInventoryResaleItem.
     * 
     * @param saleUnit
     */
    public void setSaleUnit(com.netsuite.webservices.platform.core_2019_1.RecordRef saleUnit) {
        this.saleUnit = saleUnit;
    }


    /**
     * Gets the issueProduct value for this NonInventoryResaleItem.
     * 
     * @return issueProduct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this NonInventoryResaleItem.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(com.netsuite.webservices.platform.core_2019_1.RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }


    /**
     * Gets the billingSchedule value for this NonInventoryResaleItem.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this NonInventoryResaleItem.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the deferredRevenueAccount value for this NonInventoryResaleItem.
     * 
     * @return deferredRevenueAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDeferredRevenueAccount() {
        return deferredRevenueAccount;
    }


    /**
     * Sets the deferredRevenueAccount value for this NonInventoryResaleItem.
     * 
     * @param deferredRevenueAccount
     */
    public void setDeferredRevenueAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }


    /**
     * Gets the revRecSchedule value for this NonInventoryResaleItem.
     * 
     * @return revRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this NonInventoryResaleItem.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the deferralAccount value for this NonInventoryResaleItem.
     * 
     * @return deferralAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDeferralAccount() {
        return deferralAccount;
    }


    /**
     * Sets the deferralAccount value for this NonInventoryResaleItem.
     * 
     * @param deferralAccount
     */
    public void setDeferralAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAccount) {
        this.deferralAccount = deferralAccount;
    }


    /**
     * Gets the amortizationTemplate value for this NonInventoryResaleItem.
     * 
     * @return amortizationTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAmortizationTemplate() {
        return amortizationTemplate;
    }


    /**
     * Sets the amortizationTemplate value for this NonInventoryResaleItem.
     * 
     * @param amortizationTemplate
     */
    public void setAmortizationTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationTemplate) {
        this.amortizationTemplate = amortizationTemplate;
    }


    /**
     * Gets the residual value for this NonInventoryResaleItem.
     * 
     * @return residual
     */
    public java.lang.String getResidual() {
        return residual;
    }


    /**
     * Sets the residual value for this NonInventoryResaleItem.
     * 
     * @param residual
     */
    public void setResidual(java.lang.String residual) {
        this.residual = residual;
    }


    /**
     * Gets the amortizationPeriod value for this NonInventoryResaleItem.
     * 
     * @return amortizationPeriod
     */
    public java.lang.Long getAmortizationPeriod() {
        return amortizationPeriod;
    }


    /**
     * Sets the amortizationPeriod value for this NonInventoryResaleItem.
     * 
     * @param amortizationPeriod
     */
    public void setAmortizationPeriod(java.lang.Long amortizationPeriod) {
        this.amortizationPeriod = amortizationPeriod;
    }


    /**
     * Gets the stockDescription value for this NonInventoryResaleItem.
     * 
     * @return stockDescription
     */
    public java.lang.String getStockDescription() {
        return stockDescription;
    }


    /**
     * Sets the stockDescription value for this NonInventoryResaleItem.
     * 
     * @param stockDescription
     */
    public void setStockDescription(java.lang.String stockDescription) {
        this.stockDescription = stockDescription;
    }


    /**
     * Gets the producer value for this NonInventoryResaleItem.
     * 
     * @return producer
     */
    public java.lang.Boolean getProducer() {
        return producer;
    }


    /**
     * Sets the producer value for this NonInventoryResaleItem.
     * 
     * @param producer
     */
    public void setProducer(java.lang.Boolean producer) {
        this.producer = producer;
    }


    /**
     * Gets the manufacturer value for this NonInventoryResaleItem.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this NonInventoryResaleItem.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the mpn value for this NonInventoryResaleItem.
     * 
     * @return mpn
     */
    public java.lang.String getMpn() {
        return mpn;
    }


    /**
     * Sets the mpn value for this NonInventoryResaleItem.
     * 
     * @param mpn
     */
    public void setMpn(java.lang.String mpn) {
        this.mpn = mpn;
    }


    /**
     * Gets the multManufactureAddr value for this NonInventoryResaleItem.
     * 
     * @return multManufactureAddr
     */
    public java.lang.Boolean getMultManufactureAddr() {
        return multManufactureAddr;
    }


    /**
     * Sets the multManufactureAddr value for this NonInventoryResaleItem.
     * 
     * @param multManufactureAddr
     */
    public void setMultManufactureAddr(java.lang.Boolean multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }


    /**
     * Gets the manufacturerAddr1 value for this NonInventoryResaleItem.
     * 
     * @return manufacturerAddr1
     */
    public java.lang.String getManufacturerAddr1() {
        return manufacturerAddr1;
    }


    /**
     * Sets the manufacturerAddr1 value for this NonInventoryResaleItem.
     * 
     * @param manufacturerAddr1
     */
    public void setManufacturerAddr1(java.lang.String manufacturerAddr1) {
        this.manufacturerAddr1 = manufacturerAddr1;
    }


    /**
     * Gets the manufacturerCity value for this NonInventoryResaleItem.
     * 
     * @return manufacturerCity
     */
    public java.lang.String getManufacturerCity() {
        return manufacturerCity;
    }


    /**
     * Sets the manufacturerCity value for this NonInventoryResaleItem.
     * 
     * @param manufacturerCity
     */
    public void setManufacturerCity(java.lang.String manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }


    /**
     * Gets the manufacturerState value for this NonInventoryResaleItem.
     * 
     * @return manufacturerState
     */
    public java.lang.String getManufacturerState() {
        return manufacturerState;
    }


    /**
     * Sets the manufacturerState value for this NonInventoryResaleItem.
     * 
     * @param manufacturerState
     */
    public void setManufacturerState(java.lang.String manufacturerState) {
        this.manufacturerState = manufacturerState;
    }


    /**
     * Gets the manufacturerZip value for this NonInventoryResaleItem.
     * 
     * @return manufacturerZip
     */
    public java.lang.String getManufacturerZip() {
        return manufacturerZip;
    }


    /**
     * Sets the manufacturerZip value for this NonInventoryResaleItem.
     * 
     * @param manufacturerZip
     */
    public void setManufacturerZip(java.lang.String manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }


    /**
     * Gets the countryOfManufacture value for this NonInventoryResaleItem.
     * 
     * @return countryOfManufacture
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Country getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this NonInventoryResaleItem.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(com.netsuite.webservices.platform.common_2019_1.types.Country countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }


    /**
     * Gets the purchaseOrderQuantity value for this NonInventoryResaleItem.
     * 
     * @return purchaseOrderQuantity
     */
    public java.lang.Double getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this NonInventoryResaleItem.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(java.lang.Double purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }


    /**
     * Gets the purchaseOrderAmount value for this NonInventoryResaleItem.
     * 
     * @return purchaseOrderAmount
     */
    public java.lang.Double getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this NonInventoryResaleItem.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(java.lang.Double purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this NonInventoryResaleItem.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public java.lang.Double getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this NonInventoryResaleItem.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(java.lang.Double purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }


    /**
     * Gets the receiptQuantity value for this NonInventoryResaleItem.
     * 
     * @return receiptQuantity
     */
    public java.lang.Double getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this NonInventoryResaleItem.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(java.lang.Double receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }


    /**
     * Gets the receiptAmount value for this NonInventoryResaleItem.
     * 
     * @return receiptAmount
     */
    public java.lang.Double getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this NonInventoryResaleItem.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(java.lang.Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the receiptQuantityDiff value for this NonInventoryResaleItem.
     * 
     * @return receiptQuantityDiff
     */
    public java.lang.Double getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this NonInventoryResaleItem.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(java.lang.Double receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }


    /**
     * Gets the manufacturerTaxId value for this NonInventoryResaleItem.
     * 
     * @return manufacturerTaxId
     */
    public java.lang.String getManufacturerTaxId() {
        return manufacturerTaxId;
    }


    /**
     * Sets the manufacturerTaxId value for this NonInventoryResaleItem.
     * 
     * @param manufacturerTaxId
     */
    public void setManufacturerTaxId(java.lang.String manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }


    /**
     * Gets the scheduleBNumber value for this NonInventoryResaleItem.
     * 
     * @return scheduleBNumber
     */
    public java.lang.String getScheduleBNumber() {
        return scheduleBNumber;
    }


    /**
     * Sets the scheduleBNumber value for this NonInventoryResaleItem.
     * 
     * @param scheduleBNumber
     */
    public void setScheduleBNumber(java.lang.String scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }


    /**
     * Gets the scheduleBQuantity value for this NonInventoryResaleItem.
     * 
     * @return scheduleBQuantity
     */
    public java.lang.Long getScheduleBQuantity() {
        return scheduleBQuantity;
    }


    /**
     * Sets the scheduleBQuantity value for this NonInventoryResaleItem.
     * 
     * @param scheduleBQuantity
     */
    public void setScheduleBQuantity(java.lang.Long scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }


    /**
     * Gets the scheduleBCode value for this NonInventoryResaleItem.
     * 
     * @return scheduleBCode
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ScheduleBCode getScheduleBCode() {
        return scheduleBCode;
    }


    /**
     * Sets the scheduleBCode value for this NonInventoryResaleItem.
     * 
     * @param scheduleBCode
     */
    public void setScheduleBCode(com.netsuite.webservices.lists.accounting_2019_1.types.ScheduleBCode scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }


    /**
     * Gets the manufacturerTariff value for this NonInventoryResaleItem.
     * 
     * @return manufacturerTariff
     */
    public java.lang.String getManufacturerTariff() {
        return manufacturerTariff;
    }


    /**
     * Sets the manufacturerTariff value for this NonInventoryResaleItem.
     * 
     * @param manufacturerTariff
     */
    public void setManufacturerTariff(java.lang.String manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }


    /**
     * Gets the preferenceCriterion value for this NonInventoryResaleItem.
     * 
     * @return preferenceCriterion
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemPreferenceCriterion getPreferenceCriterion() {
        return preferenceCriterion;
    }


    /**
     * Sets the preferenceCriterion value for this NonInventoryResaleItem.
     * 
     * @param preferenceCriterion
     */
    public void setPreferenceCriterion(com.netsuite.webservices.lists.accounting_2019_1.types.ItemPreferenceCriterion preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }


    /**
     * Gets the minimumQuantity value for this NonInventoryResaleItem.
     * 
     * @return minimumQuantity
     */
    public java.lang.Long getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this NonInventoryResaleItem.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(java.lang.Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }


    /**
     * Gets the enforceMinQtyInternally value for this NonInventoryResaleItem.
     * 
     * @return enforceMinQtyInternally
     */
    public java.lang.Boolean getEnforceMinQtyInternally() {
        return enforceMinQtyInternally;
    }


    /**
     * Sets the enforceMinQtyInternally value for this NonInventoryResaleItem.
     * 
     * @param enforceMinQtyInternally
     */
    public void setEnforceMinQtyInternally(java.lang.Boolean enforceMinQtyInternally) {
        this.enforceMinQtyInternally = enforceMinQtyInternally;
    }


    /**
     * Gets the maximumQuantity value for this NonInventoryResaleItem.
     * 
     * @return maximumQuantity
     */
    public java.lang.Long getMaximumQuantity() {
        return maximumQuantity;
    }


    /**
     * Sets the maximumQuantity value for this NonInventoryResaleItem.
     * 
     * @param maximumQuantity
     */
    public void setMaximumQuantity(java.lang.Long maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }


    /**
     * Gets the softDescriptor value for this NonInventoryResaleItem.
     * 
     * @return softDescriptor
     */
    public java.lang.String getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this NonInventoryResaleItem.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(java.lang.String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the shipPackage value for this NonInventoryResaleItem.
     * 
     * @return shipPackage
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipPackage() {
        return shipPackage;
    }


    /**
     * Sets the shipPackage value for this NonInventoryResaleItem.
     * 
     * @param shipPackage
     */
    public void setShipPackage(com.netsuite.webservices.platform.core_2019_1.RecordRef shipPackage) {
        this.shipPackage = shipPackage;
    }


    /**
     * Gets the shipIndividually value for this NonInventoryResaleItem.
     * 
     * @return shipIndividually
     */
    public java.lang.Boolean getShipIndividually() {
        return shipIndividually;
    }


    /**
     * Sets the shipIndividually value for this NonInventoryResaleItem.
     * 
     * @param shipIndividually
     */
    public void setShipIndividually(java.lang.Boolean shipIndividually) {
        this.shipIndividually = shipIndividually;
    }


    /**
     * Gets the isFulfillable value for this NonInventoryResaleItem.
     * 
     * @return isFulfillable
     */
    public java.lang.Boolean getIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this NonInventoryResaleItem.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(java.lang.Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }


    /**
     * Gets the generateAccruals value for this NonInventoryResaleItem.
     * 
     * @return generateAccruals
     */
    public java.lang.Boolean getGenerateAccruals() {
        return generateAccruals;
    }


    /**
     * Sets the generateAccruals value for this NonInventoryResaleItem.
     * 
     * @param generateAccruals
     */
    public void setGenerateAccruals(java.lang.Boolean generateAccruals) {
        this.generateAccruals = generateAccruals;
    }


    /**
     * Gets the costCategory value for this NonInventoryResaleItem.
     * 
     * @return costCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCostCategory() {
        return costCategory;
    }


    /**
     * Sets the costCategory value for this NonInventoryResaleItem.
     * 
     * @param costCategory
     */
    public void setCostCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory) {
        this.costCategory = costCategory;
    }


    /**
     * Gets the pricesIncludeTax value for this NonInventoryResaleItem.
     * 
     * @return pricesIncludeTax
     */
    public java.lang.Boolean getPricesIncludeTax() {
        return pricesIncludeTax;
    }


    /**
     * Sets the pricesIncludeTax value for this NonInventoryResaleItem.
     * 
     * @param pricesIncludeTax
     */
    public void setPricesIncludeTax(java.lang.Boolean pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }


    /**
     * Gets the quantityPricingSchedule value for this NonInventoryResaleItem.
     * 
     * @return quantityPricingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }


    /**
     * Sets the quantityPricingSchedule value for this NonInventoryResaleItem.
     * 
     * @param quantityPricingSchedule
     */
    public void setQuantityPricingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }


    /**
     * Gets the useMarginalRates value for this NonInventoryResaleItem.
     * 
     * @return useMarginalRates
     */
    public java.lang.Boolean getUseMarginalRates() {
        return useMarginalRates;
    }


    /**
     * Sets the useMarginalRates value for this NonInventoryResaleItem.
     * 
     * @param useMarginalRates
     */
    public void setUseMarginalRates(java.lang.Boolean useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }


    /**
     * Gets the overallQuantityPricingType value for this NonInventoryResaleItem.
     * 
     * @return overallQuantityPricingType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemOverallQuantityPricingType getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }


    /**
     * Sets the overallQuantityPricingType value for this NonInventoryResaleItem.
     * 
     * @param overallQuantityPricingType
     */
    public void setOverallQuantityPricingType(com.netsuite.webservices.lists.accounting_2019_1.types.ItemOverallQuantityPricingType overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }


    /**
     * Gets the pricingGroup value for this NonInventoryResaleItem.
     * 
     * @return pricingGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this NonInventoryResaleItem.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef pricingGroup) {
        this.pricingGroup = pricingGroup;
    }


    /**
     * Gets the minimumQuantityUnits value for this NonInventoryResaleItem.
     * 
     * @return minimumQuantityUnits
     */
    public java.lang.String getMinimumQuantityUnits() {
        return minimumQuantityUnits;
    }


    /**
     * Sets the minimumQuantityUnits value for this NonInventoryResaleItem.
     * 
     * @param minimumQuantityUnits
     */
    public void setMinimumQuantityUnits(java.lang.String minimumQuantityUnits) {
        this.minimumQuantityUnits = minimumQuantityUnits;
    }


    /**
     * Gets the vsoePrice value for this NonInventoryResaleItem.
     * 
     * @return vsoePrice
     */
    public java.lang.Double getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this NonInventoryResaleItem.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(java.lang.Double vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the vsoeSopGroup value for this NonInventoryResaleItem.
     * 
     * @return vsoeSopGroup
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup getVsoeSopGroup() {
        return vsoeSopGroup;
    }


    /**
     * Sets the vsoeSopGroup value for this NonInventoryResaleItem.
     * 
     * @param vsoeSopGroup
     */
    public void setVsoeSopGroup(com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup vsoeSopGroup) {
        this.vsoeSopGroup = vsoeSopGroup;
    }


    /**
     * Gets the vsoeDeferral value for this NonInventoryResaleItem.
     * 
     * @return vsoeDeferral
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this NonInventoryResaleItem.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoePermitDiscount value for this NonInventoryResaleItem.
     * 
     * @return vsoePermitDiscount
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this NonInventoryResaleItem.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoeDelivered value for this NonInventoryResaleItem.
     * 
     * @return vsoeDelivered
     */
    public java.lang.Boolean getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this NonInventoryResaleItem.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(java.lang.Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the itemRevenueCategory value for this NonInventoryResaleItem.
     * 
     * @return itemRevenueCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItemRevenueCategory() {
        return itemRevenueCategory;
    }


    /**
     * Sets the itemRevenueCategory value for this NonInventoryResaleItem.
     * 
     * @param itemRevenueCategory
     */
    public void setItemRevenueCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }


    /**
     * Gets the storeDisplayName value for this NonInventoryResaleItem.
     * 
     * @return storeDisplayName
     */
    public java.lang.String getStoreDisplayName() {
        return storeDisplayName;
    }


    /**
     * Sets the storeDisplayName value for this NonInventoryResaleItem.
     * 
     * @param storeDisplayName
     */
    public void setStoreDisplayName(java.lang.String storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }


    /**
     * Gets the storeDisplayThumbnail value for this NonInventoryResaleItem.
     * 
     * @return storeDisplayThumbnail
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }


    /**
     * Sets the storeDisplayThumbnail value for this NonInventoryResaleItem.
     * 
     * @param storeDisplayThumbnail
     */
    public void setStoreDisplayThumbnail(com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }


    /**
     * Gets the storeDisplayImage value for this NonInventoryResaleItem.
     * 
     * @return storeDisplayImage
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getStoreDisplayImage() {
        return storeDisplayImage;
    }


    /**
     * Sets the storeDisplayImage value for this NonInventoryResaleItem.
     * 
     * @param storeDisplayImage
     */
    public void setStoreDisplayImage(com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }


    /**
     * Gets the storeDescription value for this NonInventoryResaleItem.
     * 
     * @return storeDescription
     */
    public java.lang.String getStoreDescription() {
        return storeDescription;
    }


    /**
     * Sets the storeDescription value for this NonInventoryResaleItem.
     * 
     * @param storeDescription
     */
    public void setStoreDescription(java.lang.String storeDescription) {
        this.storeDescription = storeDescription;
    }


    /**
     * Gets the storeDetailedDescription value for this NonInventoryResaleItem.
     * 
     * @return storeDetailedDescription
     */
    public java.lang.String getStoreDetailedDescription() {
        return storeDetailedDescription;
    }


    /**
     * Sets the storeDetailedDescription value for this NonInventoryResaleItem.
     * 
     * @param storeDetailedDescription
     */
    public void setStoreDetailedDescription(java.lang.String storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }


    /**
     * Gets the storeItemTemplate value for this NonInventoryResaleItem.
     * 
     * @return storeItemTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getStoreItemTemplate() {
        return storeItemTemplate;
    }


    /**
     * Sets the storeItemTemplate value for this NonInventoryResaleItem.
     * 
     * @param storeItemTemplate
     */
    public void setStoreItemTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef storeItemTemplate) {
        this.storeItemTemplate = storeItemTemplate;
    }


    /**
     * Gets the pageTitle value for this NonInventoryResaleItem.
     * 
     * @return pageTitle
     */
    public java.lang.String getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this NonInventoryResaleItem.
     * 
     * @param pageTitle
     */
    public void setPageTitle(java.lang.String pageTitle) {
        this.pageTitle = pageTitle;
    }


    /**
     * Gets the metaTagHtml value for this NonInventoryResaleItem.
     * 
     * @return metaTagHtml
     */
    public java.lang.String getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this NonInventoryResaleItem.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(java.lang.String metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }


    /**
     * Gets the excludeFromSitemap value for this NonInventoryResaleItem.
     * 
     * @return excludeFromSitemap
     */
    public java.lang.Boolean getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this NonInventoryResaleItem.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(java.lang.Boolean excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }


    /**
     * Gets the sitemapPriority value for this NonInventoryResaleItem.
     * 
     * @return sitemapPriority
     */
    public com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this NonInventoryResaleItem.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }


    /**
     * Gets the searchKeywords value for this NonInventoryResaleItem.
     * 
     * @return searchKeywords
     */
    public java.lang.String getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this NonInventoryResaleItem.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(java.lang.String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }


    /**
     * Gets the isDonationItem value for this NonInventoryResaleItem.
     * 
     * @return isDonationItem
     */
    public java.lang.Boolean getIsDonationItem() {
        return isDonationItem;
    }


    /**
     * Sets the isDonationItem value for this NonInventoryResaleItem.
     * 
     * @param isDonationItem
     */
    public void setIsDonationItem(java.lang.Boolean isDonationItem) {
        this.isDonationItem = isDonationItem;
    }


    /**
     * Gets the showDefaultDonationAmount value for this NonInventoryResaleItem.
     * 
     * @return showDefaultDonationAmount
     */
    public java.lang.Boolean getShowDefaultDonationAmount() {
        return showDefaultDonationAmount;
    }


    /**
     * Sets the showDefaultDonationAmount value for this NonInventoryResaleItem.
     * 
     * @param showDefaultDonationAmount
     */
    public void setShowDefaultDonationAmount(java.lang.Boolean showDefaultDonationAmount) {
        this.showDefaultDonationAmount = showDefaultDonationAmount;
    }


    /**
     * Gets the maxDonationAmount value for this NonInventoryResaleItem.
     * 
     * @return maxDonationAmount
     */
    public java.lang.Double getMaxDonationAmount() {
        return maxDonationAmount;
    }


    /**
     * Sets the maxDonationAmount value for this NonInventoryResaleItem.
     * 
     * @param maxDonationAmount
     */
    public void setMaxDonationAmount(java.lang.Double maxDonationAmount) {
        this.maxDonationAmount = maxDonationAmount;
    }


    /**
     * Gets the dontShowPrice value for this NonInventoryResaleItem.
     * 
     * @return dontShowPrice
     */
    public java.lang.Boolean getDontShowPrice() {
        return dontShowPrice;
    }


    /**
     * Sets the dontShowPrice value for this NonInventoryResaleItem.
     * 
     * @param dontShowPrice
     */
    public void setDontShowPrice(java.lang.Boolean dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }


    /**
     * Gets the noPriceMessage value for this NonInventoryResaleItem.
     * 
     * @return noPriceMessage
     */
    public java.lang.String getNoPriceMessage() {
        return noPriceMessage;
    }


    /**
     * Sets the noPriceMessage value for this NonInventoryResaleItem.
     * 
     * @param noPriceMessage
     */
    public void setNoPriceMessage(java.lang.String noPriceMessage) {
        this.noPriceMessage = noPriceMessage;
    }


    /**
     * Gets the outOfStockMessage value for this NonInventoryResaleItem.
     * 
     * @return outOfStockMessage
     */
    public java.lang.String getOutOfStockMessage() {
        return outOfStockMessage;
    }


    /**
     * Sets the outOfStockMessage value for this NonInventoryResaleItem.
     * 
     * @param outOfStockMessage
     */
    public void setOutOfStockMessage(java.lang.String outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
    }


    /**
     * Gets the onSpecial value for this NonInventoryResaleItem.
     * 
     * @return onSpecial
     */
    public java.lang.Boolean getOnSpecial() {
        return onSpecial;
    }


    /**
     * Sets the onSpecial value for this NonInventoryResaleItem.
     * 
     * @param onSpecial
     */
    public void setOnSpecial(java.lang.Boolean onSpecial) {
        this.onSpecial = onSpecial;
    }


    /**
     * Gets the outOfStockBehavior value for this NonInventoryResaleItem.
     * 
     * @return outOfStockBehavior
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemOutOfStockBehavior getOutOfStockBehavior() {
        return outOfStockBehavior;
    }


    /**
     * Sets the outOfStockBehavior value for this NonInventoryResaleItem.
     * 
     * @param outOfStockBehavior
     */
    public void setOutOfStockBehavior(com.netsuite.webservices.lists.accounting_2019_1.types.ItemOutOfStockBehavior outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }


    /**
     * Gets the relatedItemsDescription value for this NonInventoryResaleItem.
     * 
     * @return relatedItemsDescription
     */
    public java.lang.String getRelatedItemsDescription() {
        return relatedItemsDescription;
    }


    /**
     * Sets the relatedItemsDescription value for this NonInventoryResaleItem.
     * 
     * @param relatedItemsDescription
     */
    public void setRelatedItemsDescription(java.lang.String relatedItemsDescription) {
        this.relatedItemsDescription = relatedItemsDescription;
    }


    /**
     * Gets the specialsDescription value for this NonInventoryResaleItem.
     * 
     * @return specialsDescription
     */
    public java.lang.String getSpecialsDescription() {
        return specialsDescription;
    }


    /**
     * Sets the specialsDescription value for this NonInventoryResaleItem.
     * 
     * @param specialsDescription
     */
    public void setSpecialsDescription(java.lang.String specialsDescription) {
        this.specialsDescription = specialsDescription;
    }


    /**
     * Gets the featuredDescription value for this NonInventoryResaleItem.
     * 
     * @return featuredDescription
     */
    public java.lang.String getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this NonInventoryResaleItem.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(java.lang.String featuredDescription) {
        this.featuredDescription = featuredDescription;
    }


    /**
     * Gets the shoppingDotComCategory value for this NonInventoryResaleItem.
     * 
     * @return shoppingDotComCategory
     */
    public java.lang.String getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }


    /**
     * Sets the shoppingDotComCategory value for this NonInventoryResaleItem.
     * 
     * @param shoppingDotComCategory
     */
    public void setShoppingDotComCategory(java.lang.String shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }


    /**
     * Gets the shopzillaCategoryId value for this NonInventoryResaleItem.
     * 
     * @return shopzillaCategoryId
     */
    public java.lang.Long getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }


    /**
     * Sets the shopzillaCategoryId value for this NonInventoryResaleItem.
     * 
     * @param shopzillaCategoryId
     */
    public void setShopzillaCategoryId(java.lang.Long shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }


    /**
     * Gets the nexTagCategory value for this NonInventoryResaleItem.
     * 
     * @return nexTagCategory
     */
    public java.lang.String getNexTagCategory() {
        return nexTagCategory;
    }


    /**
     * Sets the nexTagCategory value for this NonInventoryResaleItem.
     * 
     * @param nexTagCategory
     */
    public void setNexTagCategory(java.lang.String nexTagCategory) {
        this.nexTagCategory = nexTagCategory;
    }


    /**
     * Gets the productFeedList value for this NonInventoryResaleItem.
     * 
     * @return productFeedList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ProductFeedList getProductFeedList() {
        return productFeedList;
    }


    /**
     * Sets the productFeedList value for this NonInventoryResaleItem.
     * 
     * @param productFeedList
     */
    public void setProductFeedList(com.netsuite.webservices.lists.accounting_2019_1.ProductFeedList productFeedList) {
        this.productFeedList = productFeedList;
    }


    /**
     * Gets the urlComponent value for this NonInventoryResaleItem.
     * 
     * @return urlComponent
     */
    public java.lang.String getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this NonInventoryResaleItem.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(java.lang.String urlComponent) {
        this.urlComponent = urlComponent;
    }


    /**
     * Gets the customForm value for this NonInventoryResaleItem.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this NonInventoryResaleItem.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the itemId value for this NonInventoryResaleItem.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this NonInventoryResaleItem.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the upcCode value for this NonInventoryResaleItem.
     * 
     * @return upcCode
     */
    public java.lang.String getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this NonInventoryResaleItem.
     * 
     * @param upcCode
     */
    public void setUpcCode(java.lang.String upcCode) {
        this.upcCode = upcCode;
    }


    /**
     * Gets the displayName value for this NonInventoryResaleItem.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this NonInventoryResaleItem.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the vendorName value for this NonInventoryResaleItem.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this NonInventoryResaleItem.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the parent value for this NonInventoryResaleItem.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this NonInventoryResaleItem.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the isOnline value for this NonInventoryResaleItem.
     * 
     * @return isOnline
     */
    public java.lang.Boolean getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this NonInventoryResaleItem.
     * 
     * @param isOnline
     */
    public void setIsOnline(java.lang.Boolean isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isHazmatItem value for this NonInventoryResaleItem.
     * 
     * @return isHazmatItem
     */
    public java.lang.Boolean getIsHazmatItem() {
        return isHazmatItem;
    }


    /**
     * Sets the isHazmatItem value for this NonInventoryResaleItem.
     * 
     * @param isHazmatItem
     */
    public void setIsHazmatItem(java.lang.Boolean isHazmatItem) {
        this.isHazmatItem = isHazmatItem;
    }


    /**
     * Gets the hazmatId value for this NonInventoryResaleItem.
     * 
     * @return hazmatId
     */
    public java.lang.String getHazmatId() {
        return hazmatId;
    }


    /**
     * Sets the hazmatId value for this NonInventoryResaleItem.
     * 
     * @param hazmatId
     */
    public void setHazmatId(java.lang.String hazmatId) {
        this.hazmatId = hazmatId;
    }


    /**
     * Gets the hazmatShippingName value for this NonInventoryResaleItem.
     * 
     * @return hazmatShippingName
     */
    public java.lang.String getHazmatShippingName() {
        return hazmatShippingName;
    }


    /**
     * Sets the hazmatShippingName value for this NonInventoryResaleItem.
     * 
     * @param hazmatShippingName
     */
    public void setHazmatShippingName(java.lang.String hazmatShippingName) {
        this.hazmatShippingName = hazmatShippingName;
    }


    /**
     * Gets the hazmatHazardClass value for this NonInventoryResaleItem.
     * 
     * @return hazmatHazardClass
     */
    public java.lang.String getHazmatHazardClass() {
        return hazmatHazardClass;
    }


    /**
     * Sets the hazmatHazardClass value for this NonInventoryResaleItem.
     * 
     * @param hazmatHazardClass
     */
    public void setHazmatHazardClass(java.lang.String hazmatHazardClass) {
        this.hazmatHazardClass = hazmatHazardClass;
    }


    /**
     * Gets the hazmatPackingGroup value for this NonInventoryResaleItem.
     * 
     * @return hazmatPackingGroup
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.HazmatPackingGroup getHazmatPackingGroup() {
        return hazmatPackingGroup;
    }


    /**
     * Sets the hazmatPackingGroup value for this NonInventoryResaleItem.
     * 
     * @param hazmatPackingGroup
     */
    public void setHazmatPackingGroup(com.netsuite.webservices.lists.accounting_2019_1.types.HazmatPackingGroup hazmatPackingGroup) {
        this.hazmatPackingGroup = hazmatPackingGroup;
    }


    /**
     * Gets the hazmatItemUnits value for this NonInventoryResaleItem.
     * 
     * @return hazmatItemUnits
     */
    public java.lang.String getHazmatItemUnits() {
        return hazmatItemUnits;
    }


    /**
     * Sets the hazmatItemUnits value for this NonInventoryResaleItem.
     * 
     * @param hazmatItemUnits
     */
    public void setHazmatItemUnits(java.lang.String hazmatItemUnits) {
        this.hazmatItemUnits = hazmatItemUnits;
    }


    /**
     * Gets the hazmatItemUnitsQty value for this NonInventoryResaleItem.
     * 
     * @return hazmatItemUnitsQty
     */
    public java.lang.Double getHazmatItemUnitsQty() {
        return hazmatItemUnitsQty;
    }


    /**
     * Sets the hazmatItemUnitsQty value for this NonInventoryResaleItem.
     * 
     * @param hazmatItemUnitsQty
     */
    public void setHazmatItemUnitsQty(java.lang.Double hazmatItemUnitsQty) {
        this.hazmatItemUnitsQty = hazmatItemUnitsQty;
    }


    /**
     * Gets the isGcoCompliant value for this NonInventoryResaleItem.
     * 
     * @return isGcoCompliant
     */
    public java.lang.Boolean getIsGcoCompliant() {
        return isGcoCompliant;
    }


    /**
     * Sets the isGcoCompliant value for this NonInventoryResaleItem.
     * 
     * @param isGcoCompliant
     */
    public void setIsGcoCompliant(java.lang.Boolean isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }


    /**
     * Gets the offerSupport value for this NonInventoryResaleItem.
     * 
     * @return offerSupport
     */
    public java.lang.Boolean getOfferSupport() {
        return offerSupport;
    }


    /**
     * Sets the offerSupport value for this NonInventoryResaleItem.
     * 
     * @param offerSupport
     */
    public void setOfferSupport(java.lang.Boolean offerSupport) {
        this.offerSupport = offerSupport;
    }


    /**
     * Gets the isInactive value for this NonInventoryResaleItem.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this NonInventoryResaleItem.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the matrixItemNameTemplate value for this NonInventoryResaleItem.
     * 
     * @return matrixItemNameTemplate
     */
    public java.lang.String getMatrixItemNameTemplate() {
        return matrixItemNameTemplate;
    }


    /**
     * Sets the matrixItemNameTemplate value for this NonInventoryResaleItem.
     * 
     * @param matrixItemNameTemplate
     */
    public void setMatrixItemNameTemplate(java.lang.String matrixItemNameTemplate) {
        this.matrixItemNameTemplate = matrixItemNameTemplate;
    }


    /**
     * Gets the availableToPartners value for this NonInventoryResaleItem.
     * 
     * @return availableToPartners
     */
    public java.lang.Boolean getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this NonInventoryResaleItem.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(java.lang.Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }


    /**
     * Gets the department value for this NonInventoryResaleItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this NonInventoryResaleItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this NonInventoryResaleItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this NonInventoryResaleItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this NonInventoryResaleItem.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this NonInventoryResaleItem.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the defaultItemShipMethod value for this NonInventoryResaleItem.
     * 
     * @return defaultItemShipMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultItemShipMethod() {
        return defaultItemShipMethod;
    }


    /**
     * Sets the defaultItemShipMethod value for this NonInventoryResaleItem.
     * 
     * @param defaultItemShipMethod
     */
    public void setDefaultItemShipMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultItemShipMethod) {
        this.defaultItemShipMethod = defaultItemShipMethod;
    }


    /**
     * Gets the itemCarrier value for this NonInventoryResaleItem.
     * 
     * @return itemCarrier
     */
    public com.netsuite.webservices.platform.common_2019_1.types.ShippingCarrier getItemCarrier() {
        return itemCarrier;
    }


    /**
     * Sets the itemCarrier value for this NonInventoryResaleItem.
     * 
     * @param itemCarrier
     */
    public void setItemCarrier(com.netsuite.webservices.platform.common_2019_1.types.ShippingCarrier itemCarrier) {
        this.itemCarrier = itemCarrier;
    }


    /**
     * Gets the itemShipMethodList value for this NonInventoryResaleItem.
     * 
     * @return itemShipMethodList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getItemShipMethodList() {
        return itemShipMethodList;
    }


    /**
     * Sets the itemShipMethodList value for this NonInventoryResaleItem.
     * 
     * @param itemShipMethodList
     */
    public void setItemShipMethodList(com.netsuite.webservices.platform.core_2019_1.RecordRefList itemShipMethodList) {
        this.itemShipMethodList = itemShipMethodList;
    }


    /**
     * Gets the subsidiaryList value for this NonInventoryResaleItem.
     * 
     * @return subsidiaryList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this NonInventoryResaleItem.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the currency value for this NonInventoryResaleItem.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this NonInventoryResaleItem.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the itemOptionsList value for this NonInventoryResaleItem.
     * 
     * @return itemOptionsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList getItemOptionsList() {
        return itemOptionsList;
    }


    /**
     * Sets the itemOptionsList value for this NonInventoryResaleItem.
     * 
     * @param itemOptionsList
     */
    public void setItemOptionsList(com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList itemOptionsList) {
        this.itemOptionsList = itemOptionsList;
    }


    /**
     * Gets the matrixOptionList value for this NonInventoryResaleItem.
     * 
     * @return matrixOptionList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList getMatrixOptionList() {
        return matrixOptionList;
    }


    /**
     * Sets the matrixOptionList value for this NonInventoryResaleItem.
     * 
     * @param matrixOptionList
     */
    public void setMatrixOptionList(com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList matrixOptionList) {
        this.matrixOptionList = matrixOptionList;
    }


    /**
     * Gets the itemVendorList value for this NonInventoryResaleItem.
     * 
     * @return itemVendorList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList getItemVendorList() {
        return itemVendorList;
    }


    /**
     * Sets the itemVendorList value for this NonInventoryResaleItem.
     * 
     * @param itemVendorList
     */
    public void setItemVendorList(com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList itemVendorList) {
        this.itemVendorList = itemVendorList;
    }


    /**
     * Gets the pricingMatrix value for this NonInventoryResaleItem.
     * 
     * @return pricingMatrix
     */
    public com.netsuite.webservices.lists.accounting_2019_1.PricingMatrix getPricingMatrix() {
        return pricingMatrix;
    }


    /**
     * Sets the pricingMatrix value for this NonInventoryResaleItem.
     * 
     * @param pricingMatrix
     */
    public void setPricingMatrix(com.netsuite.webservices.lists.accounting_2019_1.PricingMatrix pricingMatrix) {
        this.pricingMatrix = pricingMatrix;
    }


    /**
     * Gets the accountingBookDetailList value for this NonInventoryResaleItem.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this NonInventoryResaleItem.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the purchaseTaxCode value for this NonInventoryResaleItem.
     * 
     * @return purchaseTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchaseTaxCode() {
        return purchaseTaxCode;
    }


    /**
     * Sets the purchaseTaxCode value for this NonInventoryResaleItem.
     * 
     * @param purchaseTaxCode
     */
    public void setPurchaseTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseTaxCode) {
        this.purchaseTaxCode = purchaseTaxCode;
    }


    /**
     * Gets the rate value for this NonInventoryResaleItem.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this NonInventoryResaleItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the salesTaxCode value for this NonInventoryResaleItem.
     * 
     * @return salesTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesTaxCode() {
        return salesTaxCode;
    }


    /**
     * Sets the salesTaxCode value for this NonInventoryResaleItem.
     * 
     * @param salesTaxCode
     */
    public void setSalesTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }


    /**
     * Gets the siteCategoryList value for this NonInventoryResaleItem.
     * 
     * @return siteCategoryList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.SiteCategoryList getSiteCategoryList() {
        return siteCategoryList;
    }


    /**
     * Sets the siteCategoryList value for this NonInventoryResaleItem.
     * 
     * @param siteCategoryList
     */
    public void setSiteCategoryList(com.netsuite.webservices.lists.accounting_2019_1.SiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
    }


    /**
     * Gets the translationsList value for this NonInventoryResaleItem.
     * 
     * @return translationsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.TranslationList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this NonInventoryResaleItem.
     * 
     * @param translationsList
     */
    public void setTranslationsList(com.netsuite.webservices.lists.accounting_2019_1.TranslationList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the vendor value for this NonInventoryResaleItem.
     * 
     * @return vendor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this NonInventoryResaleItem.
     * 
     * @param vendor
     */
    public void setVendor(com.netsuite.webservices.platform.core_2019_1.RecordRef vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the presentationItemList value for this NonInventoryResaleItem.
     * 
     * @return presentationItemList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.PresentationItemList getPresentationItemList() {
        return presentationItemList;
    }


    /**
     * Sets the presentationItemList value for this NonInventoryResaleItem.
     * 
     * @param presentationItemList
     */
    public void setPresentationItemList(com.netsuite.webservices.lists.accounting_2019_1.PresentationItemList presentationItemList) {
        this.presentationItemList = presentationItemList;
    }


    /**
     * Gets the customFieldList value for this NonInventoryResaleItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this NonInventoryResaleItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this NonInventoryResaleItem.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this NonInventoryResaleItem.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this NonInventoryResaleItem.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this NonInventoryResaleItem.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NonInventoryResaleItem)) return false;
        NonInventoryResaleItem other = (NonInventoryResaleItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.purchaseDescription==null && other.getPurchaseDescription()==null) || 
             (this.purchaseDescription!=null &&
              this.purchaseDescription.equals(other.getPurchaseDescription()))) &&
            ((this.copyDescription==null && other.getCopyDescription()==null) || 
             (this.copyDescription!=null &&
              this.copyDescription.equals(other.getCopyDescription()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.costUnits==null && other.getCostUnits()==null) || 
             (this.costUnits!=null &&
              this.costUnits.equals(other.getCostUnits()))) &&
            ((this.expenseAccount==null && other.getExpenseAccount()==null) || 
             (this.expenseAccount!=null &&
              this.expenseAccount.equals(other.getExpenseAccount()))) &&
            ((this.intercoExpenseAccount==null && other.getIntercoExpenseAccount()==null) || 
             (this.intercoExpenseAccount!=null &&
              this.intercoExpenseAccount.equals(other.getIntercoExpenseAccount()))) &&
            ((this.salesDescription==null && other.getSalesDescription()==null) || 
             (this.salesDescription!=null &&
              this.salesDescription.equals(other.getSalesDescription()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.incomeAccount==null && other.getIncomeAccount()==null) || 
             (this.incomeAccount!=null &&
              this.incomeAccount.equals(other.getIncomeAccount()))) &&
            ((this.intercoIncomeAccount==null && other.getIntercoIncomeAccount()==null) || 
             (this.intercoIncomeAccount!=null &&
              this.intercoIncomeAccount.equals(other.getIntercoIncomeAccount()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.matrixType==null && other.getMatrixType()==null) || 
             (this.matrixType!=null &&
              this.matrixType.equals(other.getMatrixType()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
            ((this.dropshipExpenseAccount==null && other.getDropshipExpenseAccount()==null) || 
             (this.dropshipExpenseAccount!=null &&
              this.dropshipExpenseAccount.equals(other.getDropshipExpenseAccount()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              this.deferRevRec.equals(other.getDeferRevRec()))) &&
            ((this.revenueRecognitionRule==null && other.getRevenueRecognitionRule()==null) || 
             (this.revenueRecognitionRule!=null &&
              this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule()))) &&
            ((this.revRecForecastRule==null && other.getRevRecForecastRule()==null) || 
             (this.revRecForecastRule!=null &&
              this.revRecForecastRule.equals(other.getRevRecForecastRule()))) &&
            ((this.revenueAllocationGroup==null && other.getRevenueAllocationGroup()==null) || 
             (this.revenueAllocationGroup!=null &&
              this.revenueAllocationGroup.equals(other.getRevenueAllocationGroup()))) &&
            ((this.createRevenuePlansOn==null && other.getCreateRevenuePlansOn()==null) || 
             (this.createRevenuePlansOn!=null &&
              this.createRevenuePlansOn.equals(other.getCreateRevenuePlansOn()))) &&
            ((this.directRevenuePosting==null && other.getDirectRevenuePosting()==null) || 
             (this.directRevenuePosting!=null &&
              this.directRevenuePosting.equals(other.getDirectRevenuePosting()))) &&
            ((this.isDropShipItem==null && other.getIsDropShipItem()==null) || 
             (this.isDropShipItem!=null &&
              this.isDropShipItem.equals(other.getIsDropShipItem()))) &&
            ((this.isSpecialOrderItem==null && other.getIsSpecialOrderItem()==null) || 
             (this.isSpecialOrderItem!=null &&
              this.isSpecialOrderItem.equals(other.getIsSpecialOrderItem()))) &&
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.shippingCostUnits==null && other.getShippingCostUnits()==null) || 
             (this.shippingCostUnits!=null &&
              this.shippingCostUnits.equals(other.getShippingCostUnits()))) &&
            ((this.handlingCost==null && other.getHandlingCost()==null) || 
             (this.handlingCost!=null &&
              this.handlingCost.equals(other.getHandlingCost()))) &&
            ((this.handlingCostUnits==null && other.getHandlingCostUnits()==null) || 
             (this.handlingCostUnits!=null &&
              this.handlingCostUnits.equals(other.getHandlingCostUnits()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.weightUnit==null && other.getWeightUnit()==null) || 
             (this.weightUnit!=null &&
              this.weightUnit.equals(other.getWeightUnit()))) &&
            ((this.weightUnits==null && other.getWeightUnits()==null) || 
             (this.weightUnits!=null &&
              this.weightUnits.equals(other.getWeightUnits()))) &&
            ((this.costEstimateUnits==null && other.getCostEstimateUnits()==null) || 
             (this.costEstimateUnits!=null &&
              this.costEstimateUnits.equals(other.getCostEstimateUnits()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType()))) &&
            ((this.purchaseUnit==null && other.getPurchaseUnit()==null) || 
             (this.purchaseUnit!=null &&
              this.purchaseUnit.equals(other.getPurchaseUnit()))) &&
            ((this.saleUnit==null && other.getSaleUnit()==null) || 
             (this.saleUnit!=null &&
              this.saleUnit.equals(other.getSaleUnit()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              this.issueProduct.equals(other.getIssueProduct()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.deferredRevenueAccount==null && other.getDeferredRevenueAccount()==null) || 
             (this.deferredRevenueAccount!=null &&
              this.deferredRevenueAccount.equals(other.getDeferredRevenueAccount()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.deferralAccount==null && other.getDeferralAccount()==null) || 
             (this.deferralAccount!=null &&
              this.deferralAccount.equals(other.getDeferralAccount()))) &&
            ((this.amortizationTemplate==null && other.getAmortizationTemplate()==null) || 
             (this.amortizationTemplate!=null &&
              this.amortizationTemplate.equals(other.getAmortizationTemplate()))) &&
            ((this.residual==null && other.getResidual()==null) || 
             (this.residual!=null &&
              this.residual.equals(other.getResidual()))) &&
            ((this.amortizationPeriod==null && other.getAmortizationPeriod()==null) || 
             (this.amortizationPeriod!=null &&
              this.amortizationPeriod.equals(other.getAmortizationPeriod()))) &&
            ((this.stockDescription==null && other.getStockDescription()==null) || 
             (this.stockDescription!=null &&
              this.stockDescription.equals(other.getStockDescription()))) &&
            ((this.producer==null && other.getProducer()==null) || 
             (this.producer!=null &&
              this.producer.equals(other.getProducer()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.mpn==null && other.getMpn()==null) || 
             (this.mpn!=null &&
              this.mpn.equals(other.getMpn()))) &&
            ((this.multManufactureAddr==null && other.getMultManufactureAddr()==null) || 
             (this.multManufactureAddr!=null &&
              this.multManufactureAddr.equals(other.getMultManufactureAddr()))) &&
            ((this.manufacturerAddr1==null && other.getManufacturerAddr1()==null) || 
             (this.manufacturerAddr1!=null &&
              this.manufacturerAddr1.equals(other.getManufacturerAddr1()))) &&
            ((this.manufacturerCity==null && other.getManufacturerCity()==null) || 
             (this.manufacturerCity!=null &&
              this.manufacturerCity.equals(other.getManufacturerCity()))) &&
            ((this.manufacturerState==null && other.getManufacturerState()==null) || 
             (this.manufacturerState!=null &&
              this.manufacturerState.equals(other.getManufacturerState()))) &&
            ((this.manufacturerZip==null && other.getManufacturerZip()==null) || 
             (this.manufacturerZip!=null &&
              this.manufacturerZip.equals(other.getManufacturerZip()))) &&
            ((this.countryOfManufacture==null && other.getCountryOfManufacture()==null) || 
             (this.countryOfManufacture!=null &&
              this.countryOfManufacture.equals(other.getCountryOfManufacture()))) &&
            ((this.purchaseOrderQuantity==null && other.getPurchaseOrderQuantity()==null) || 
             (this.purchaseOrderQuantity!=null &&
              this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity()))) &&
            ((this.purchaseOrderAmount==null && other.getPurchaseOrderAmount()==null) || 
             (this.purchaseOrderAmount!=null &&
              this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount()))) &&
            ((this.purchaseOrderQuantityDiff==null && other.getPurchaseOrderQuantityDiff()==null) || 
             (this.purchaseOrderQuantityDiff!=null &&
              this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff()))) &&
            ((this.receiptQuantity==null && other.getReceiptQuantity()==null) || 
             (this.receiptQuantity!=null &&
              this.receiptQuantity.equals(other.getReceiptQuantity()))) &&
            ((this.receiptAmount==null && other.getReceiptAmount()==null) || 
             (this.receiptAmount!=null &&
              this.receiptAmount.equals(other.getReceiptAmount()))) &&
            ((this.receiptQuantityDiff==null && other.getReceiptQuantityDiff()==null) || 
             (this.receiptQuantityDiff!=null &&
              this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff()))) &&
            ((this.manufacturerTaxId==null && other.getManufacturerTaxId()==null) || 
             (this.manufacturerTaxId!=null &&
              this.manufacturerTaxId.equals(other.getManufacturerTaxId()))) &&
            ((this.scheduleBNumber==null && other.getScheduleBNumber()==null) || 
             (this.scheduleBNumber!=null &&
              this.scheduleBNumber.equals(other.getScheduleBNumber()))) &&
            ((this.scheduleBQuantity==null && other.getScheduleBQuantity()==null) || 
             (this.scheduleBQuantity!=null &&
              this.scheduleBQuantity.equals(other.getScheduleBQuantity()))) &&
            ((this.scheduleBCode==null && other.getScheduleBCode()==null) || 
             (this.scheduleBCode!=null &&
              this.scheduleBCode.equals(other.getScheduleBCode()))) &&
            ((this.manufacturerTariff==null && other.getManufacturerTariff()==null) || 
             (this.manufacturerTariff!=null &&
              this.manufacturerTariff.equals(other.getManufacturerTariff()))) &&
            ((this.preferenceCriterion==null && other.getPreferenceCriterion()==null) || 
             (this.preferenceCriterion!=null &&
              this.preferenceCriterion.equals(other.getPreferenceCriterion()))) &&
            ((this.minimumQuantity==null && other.getMinimumQuantity()==null) || 
             (this.minimumQuantity!=null &&
              this.minimumQuantity.equals(other.getMinimumQuantity()))) &&
            ((this.enforceMinQtyInternally==null && other.getEnforceMinQtyInternally()==null) || 
             (this.enforceMinQtyInternally!=null &&
              this.enforceMinQtyInternally.equals(other.getEnforceMinQtyInternally()))) &&
            ((this.maximumQuantity==null && other.getMaximumQuantity()==null) || 
             (this.maximumQuantity!=null &&
              this.maximumQuantity.equals(other.getMaximumQuantity()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor()))) &&
            ((this.shipPackage==null && other.getShipPackage()==null) || 
             (this.shipPackage!=null &&
              this.shipPackage.equals(other.getShipPackage()))) &&
            ((this.shipIndividually==null && other.getShipIndividually()==null) || 
             (this.shipIndividually!=null &&
              this.shipIndividually.equals(other.getShipIndividually()))) &&
            ((this.isFulfillable==null && other.getIsFulfillable()==null) || 
             (this.isFulfillable!=null &&
              this.isFulfillable.equals(other.getIsFulfillable()))) &&
            ((this.generateAccruals==null && other.getGenerateAccruals()==null) || 
             (this.generateAccruals!=null &&
              this.generateAccruals.equals(other.getGenerateAccruals()))) &&
            ((this.costCategory==null && other.getCostCategory()==null) || 
             (this.costCategory!=null &&
              this.costCategory.equals(other.getCostCategory()))) &&
            ((this.pricesIncludeTax==null && other.getPricesIncludeTax()==null) || 
             (this.pricesIncludeTax!=null &&
              this.pricesIncludeTax.equals(other.getPricesIncludeTax()))) &&
            ((this.quantityPricingSchedule==null && other.getQuantityPricingSchedule()==null) || 
             (this.quantityPricingSchedule!=null &&
              this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule()))) &&
            ((this.useMarginalRates==null && other.getUseMarginalRates()==null) || 
             (this.useMarginalRates!=null &&
              this.useMarginalRates.equals(other.getUseMarginalRates()))) &&
            ((this.overallQuantityPricingType==null && other.getOverallQuantityPricingType()==null) || 
             (this.overallQuantityPricingType!=null &&
              this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              this.pricingGroup.equals(other.getPricingGroup()))) &&
            ((this.minimumQuantityUnits==null && other.getMinimumQuantityUnits()==null) || 
             (this.minimumQuantityUnits!=null &&
              this.minimumQuantityUnits.equals(other.getMinimumQuantityUnits()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.vsoeSopGroup==null && other.getVsoeSopGroup()==null) || 
             (this.vsoeSopGroup!=null &&
              this.vsoeSopGroup.equals(other.getVsoeSopGroup()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
            ((this.itemRevenueCategory==null && other.getItemRevenueCategory()==null) || 
             (this.itemRevenueCategory!=null &&
              this.itemRevenueCategory.equals(other.getItemRevenueCategory()))) &&
            ((this.storeDisplayName==null && other.getStoreDisplayName()==null) || 
             (this.storeDisplayName!=null &&
              this.storeDisplayName.equals(other.getStoreDisplayName()))) &&
            ((this.storeDisplayThumbnail==null && other.getStoreDisplayThumbnail()==null) || 
             (this.storeDisplayThumbnail!=null &&
              this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail()))) &&
            ((this.storeDisplayImage==null && other.getStoreDisplayImage()==null) || 
             (this.storeDisplayImage!=null &&
              this.storeDisplayImage.equals(other.getStoreDisplayImage()))) &&
            ((this.storeDescription==null && other.getStoreDescription()==null) || 
             (this.storeDescription!=null &&
              this.storeDescription.equals(other.getStoreDescription()))) &&
            ((this.storeDetailedDescription==null && other.getStoreDetailedDescription()==null) || 
             (this.storeDetailedDescription!=null &&
              this.storeDetailedDescription.equals(other.getStoreDetailedDescription()))) &&
            ((this.storeItemTemplate==null && other.getStoreItemTemplate()==null) || 
             (this.storeItemTemplate!=null &&
              this.storeItemTemplate.equals(other.getStoreItemTemplate()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              this.pageTitle.equals(other.getPageTitle()))) &&
            ((this.metaTagHtml==null && other.getMetaTagHtml()==null) || 
             (this.metaTagHtml!=null &&
              this.metaTagHtml.equals(other.getMetaTagHtml()))) &&
            ((this.excludeFromSitemap==null && other.getExcludeFromSitemap()==null) || 
             (this.excludeFromSitemap!=null &&
              this.excludeFromSitemap.equals(other.getExcludeFromSitemap()))) &&
            ((this.sitemapPriority==null && other.getSitemapPriority()==null) || 
             (this.sitemapPriority!=null &&
              this.sitemapPriority.equals(other.getSitemapPriority()))) &&
            ((this.searchKeywords==null && other.getSearchKeywords()==null) || 
             (this.searchKeywords!=null &&
              this.searchKeywords.equals(other.getSearchKeywords()))) &&
            ((this.isDonationItem==null && other.getIsDonationItem()==null) || 
             (this.isDonationItem!=null &&
              this.isDonationItem.equals(other.getIsDonationItem()))) &&
            ((this.showDefaultDonationAmount==null && other.getShowDefaultDonationAmount()==null) || 
             (this.showDefaultDonationAmount!=null &&
              this.showDefaultDonationAmount.equals(other.getShowDefaultDonationAmount()))) &&
            ((this.maxDonationAmount==null && other.getMaxDonationAmount()==null) || 
             (this.maxDonationAmount!=null &&
              this.maxDonationAmount.equals(other.getMaxDonationAmount()))) &&
            ((this.dontShowPrice==null && other.getDontShowPrice()==null) || 
             (this.dontShowPrice!=null &&
              this.dontShowPrice.equals(other.getDontShowPrice()))) &&
            ((this.noPriceMessage==null && other.getNoPriceMessage()==null) || 
             (this.noPriceMessage!=null &&
              this.noPriceMessage.equals(other.getNoPriceMessage()))) &&
            ((this.outOfStockMessage==null && other.getOutOfStockMessage()==null) || 
             (this.outOfStockMessage!=null &&
              this.outOfStockMessage.equals(other.getOutOfStockMessage()))) &&
            ((this.onSpecial==null && other.getOnSpecial()==null) || 
             (this.onSpecial!=null &&
              this.onSpecial.equals(other.getOnSpecial()))) &&
            ((this.outOfStockBehavior==null && other.getOutOfStockBehavior()==null) || 
             (this.outOfStockBehavior!=null &&
              this.outOfStockBehavior.equals(other.getOutOfStockBehavior()))) &&
            ((this.relatedItemsDescription==null && other.getRelatedItemsDescription()==null) || 
             (this.relatedItemsDescription!=null &&
              this.relatedItemsDescription.equals(other.getRelatedItemsDescription()))) &&
            ((this.specialsDescription==null && other.getSpecialsDescription()==null) || 
             (this.specialsDescription!=null &&
              this.specialsDescription.equals(other.getSpecialsDescription()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              this.featuredDescription.equals(other.getFeaturedDescription()))) &&
            ((this.shoppingDotComCategory==null && other.getShoppingDotComCategory()==null) || 
             (this.shoppingDotComCategory!=null &&
              this.shoppingDotComCategory.equals(other.getShoppingDotComCategory()))) &&
            ((this.shopzillaCategoryId==null && other.getShopzillaCategoryId()==null) || 
             (this.shopzillaCategoryId!=null &&
              this.shopzillaCategoryId.equals(other.getShopzillaCategoryId()))) &&
            ((this.nexTagCategory==null && other.getNexTagCategory()==null) || 
             (this.nexTagCategory!=null &&
              this.nexTagCategory.equals(other.getNexTagCategory()))) &&
            ((this.productFeedList==null && other.getProductFeedList()==null) || 
             (this.productFeedList!=null &&
              this.productFeedList.equals(other.getProductFeedList()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              this.urlComponent.equals(other.getUrlComponent()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.upcCode==null && other.getUpcCode()==null) || 
             (this.upcCode!=null &&
              this.upcCode.equals(other.getUpcCode()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.isHazmatItem==null && other.getIsHazmatItem()==null) || 
             (this.isHazmatItem!=null &&
              this.isHazmatItem.equals(other.getIsHazmatItem()))) &&
            ((this.hazmatId==null && other.getHazmatId()==null) || 
             (this.hazmatId!=null &&
              this.hazmatId.equals(other.getHazmatId()))) &&
            ((this.hazmatShippingName==null && other.getHazmatShippingName()==null) || 
             (this.hazmatShippingName!=null &&
              this.hazmatShippingName.equals(other.getHazmatShippingName()))) &&
            ((this.hazmatHazardClass==null && other.getHazmatHazardClass()==null) || 
             (this.hazmatHazardClass!=null &&
              this.hazmatHazardClass.equals(other.getHazmatHazardClass()))) &&
            ((this.hazmatPackingGroup==null && other.getHazmatPackingGroup()==null) || 
             (this.hazmatPackingGroup!=null &&
              this.hazmatPackingGroup.equals(other.getHazmatPackingGroup()))) &&
            ((this.hazmatItemUnits==null && other.getHazmatItemUnits()==null) || 
             (this.hazmatItemUnits!=null &&
              this.hazmatItemUnits.equals(other.getHazmatItemUnits()))) &&
            ((this.hazmatItemUnitsQty==null && other.getHazmatItemUnitsQty()==null) || 
             (this.hazmatItemUnitsQty!=null &&
              this.hazmatItemUnitsQty.equals(other.getHazmatItemUnitsQty()))) &&
            ((this.isGcoCompliant==null && other.getIsGcoCompliant()==null) || 
             (this.isGcoCompliant!=null &&
              this.isGcoCompliant.equals(other.getIsGcoCompliant()))) &&
            ((this.offerSupport==null && other.getOfferSupport()==null) || 
             (this.offerSupport!=null &&
              this.offerSupport.equals(other.getOfferSupport()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.matrixItemNameTemplate==null && other.getMatrixItemNameTemplate()==null) || 
             (this.matrixItemNameTemplate!=null &&
              this.matrixItemNameTemplate.equals(other.getMatrixItemNameTemplate()))) &&
            ((this.availableToPartners==null && other.getAvailableToPartners()==null) || 
             (this.availableToPartners!=null &&
              this.availableToPartners.equals(other.getAvailableToPartners()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.defaultItemShipMethod==null && other.getDefaultItemShipMethod()==null) || 
             (this.defaultItemShipMethod!=null &&
              this.defaultItemShipMethod.equals(other.getDefaultItemShipMethod()))) &&
            ((this.itemCarrier==null && other.getItemCarrier()==null) || 
             (this.itemCarrier!=null &&
              this.itemCarrier.equals(other.getItemCarrier()))) &&
            ((this.itemShipMethodList==null && other.getItemShipMethodList()==null) || 
             (this.itemShipMethodList!=null &&
              this.itemShipMethodList.equals(other.getItemShipMethodList()))) &&
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.itemOptionsList==null && other.getItemOptionsList()==null) || 
             (this.itemOptionsList!=null &&
              this.itemOptionsList.equals(other.getItemOptionsList()))) &&
            ((this.matrixOptionList==null && other.getMatrixOptionList()==null) || 
             (this.matrixOptionList!=null &&
              this.matrixOptionList.equals(other.getMatrixOptionList()))) &&
            ((this.itemVendorList==null && other.getItemVendorList()==null) || 
             (this.itemVendorList!=null &&
              this.itemVendorList.equals(other.getItemVendorList()))) &&
            ((this.pricingMatrix==null && other.getPricingMatrix()==null) || 
             (this.pricingMatrix!=null &&
              this.pricingMatrix.equals(other.getPricingMatrix()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
            ((this.purchaseTaxCode==null && other.getPurchaseTaxCode()==null) || 
             (this.purchaseTaxCode!=null &&
              this.purchaseTaxCode.equals(other.getPurchaseTaxCode()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.salesTaxCode==null && other.getSalesTaxCode()==null) || 
             (this.salesTaxCode!=null &&
              this.salesTaxCode.equals(other.getSalesTaxCode()))) &&
            ((this.siteCategoryList==null && other.getSiteCategoryList()==null) || 
             (this.siteCategoryList!=null &&
              this.siteCategoryList.equals(other.getSiteCategoryList()))) &&
            ((this.translationsList==null && other.getTranslationsList()==null) || 
             (this.translationsList!=null &&
              this.translationsList.equals(other.getTranslationsList()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.presentationItemList==null && other.getPresentationItemList()==null) || 
             (this.presentationItemList!=null &&
              this.presentationItemList.equals(other.getPresentationItemList()))) &&
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getPurchaseDescription() != null) {
            _hashCode += getPurchaseDescription().hashCode();
        }
        if (getCopyDescription() != null) {
            _hashCode += getCopyDescription().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCostUnits() != null) {
            _hashCode += getCostUnits().hashCode();
        }
        if (getExpenseAccount() != null) {
            _hashCode += getExpenseAccount().hashCode();
        }
        if (getIntercoExpenseAccount() != null) {
            _hashCode += getIntercoExpenseAccount().hashCode();
        }
        if (getSalesDescription() != null) {
            _hashCode += getSalesDescription().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getIncomeAccount() != null) {
            _hashCode += getIncomeAccount().hashCode();
        }
        if (getIntercoIncomeAccount() != null) {
            _hashCode += getIntercoIncomeAccount().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getMatrixType() != null) {
            _hashCode += getMatrixType().hashCode();
        }
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
        }
        if (getDropshipExpenseAccount() != null) {
            _hashCode += getDropshipExpenseAccount().hashCode();
        }
        if (getDeferRevRec() != null) {
            _hashCode += getDeferRevRec().hashCode();
        }
        if (getRevenueRecognitionRule() != null) {
            _hashCode += getRevenueRecognitionRule().hashCode();
        }
        if (getRevRecForecastRule() != null) {
            _hashCode += getRevRecForecastRule().hashCode();
        }
        if (getRevenueAllocationGroup() != null) {
            _hashCode += getRevenueAllocationGroup().hashCode();
        }
        if (getCreateRevenuePlansOn() != null) {
            _hashCode += getCreateRevenuePlansOn().hashCode();
        }
        if (getDirectRevenuePosting() != null) {
            _hashCode += getDirectRevenuePosting().hashCode();
        }
        if (getIsDropShipItem() != null) {
            _hashCode += getIsDropShipItem().hashCode();
        }
        if (getIsSpecialOrderItem() != null) {
            _hashCode += getIsSpecialOrderItem().hashCode();
        }
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getShippingCostUnits() != null) {
            _hashCode += getShippingCostUnits().hashCode();
        }
        if (getHandlingCost() != null) {
            _hashCode += getHandlingCost().hashCode();
        }
        if (getHandlingCostUnits() != null) {
            _hashCode += getHandlingCostUnits().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWeightUnit() != null) {
            _hashCode += getWeightUnit().hashCode();
        }
        if (getWeightUnits() != null) {
            _hashCode += getWeightUnits().hashCode();
        }
        if (getCostEstimateUnits() != null) {
            _hashCode += getCostEstimateUnits().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        if (getPurchaseUnit() != null) {
            _hashCode += getPurchaseUnit().hashCode();
        }
        if (getSaleUnit() != null) {
            _hashCode += getSaleUnit().hashCode();
        }
        if (getIssueProduct() != null) {
            _hashCode += getIssueProduct().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getDeferredRevenueAccount() != null) {
            _hashCode += getDeferredRevenueAccount().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getDeferralAccount() != null) {
            _hashCode += getDeferralAccount().hashCode();
        }
        if (getAmortizationTemplate() != null) {
            _hashCode += getAmortizationTemplate().hashCode();
        }
        if (getResidual() != null) {
            _hashCode += getResidual().hashCode();
        }
        if (getAmortizationPeriod() != null) {
            _hashCode += getAmortizationPeriod().hashCode();
        }
        if (getStockDescription() != null) {
            _hashCode += getStockDescription().hashCode();
        }
        if (getProducer() != null) {
            _hashCode += getProducer().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getMpn() != null) {
            _hashCode += getMpn().hashCode();
        }
        if (getMultManufactureAddr() != null) {
            _hashCode += getMultManufactureAddr().hashCode();
        }
        if (getManufacturerAddr1() != null) {
            _hashCode += getManufacturerAddr1().hashCode();
        }
        if (getManufacturerCity() != null) {
            _hashCode += getManufacturerCity().hashCode();
        }
        if (getManufacturerState() != null) {
            _hashCode += getManufacturerState().hashCode();
        }
        if (getManufacturerZip() != null) {
            _hashCode += getManufacturerZip().hashCode();
        }
        if (getCountryOfManufacture() != null) {
            _hashCode += getCountryOfManufacture().hashCode();
        }
        if (getPurchaseOrderQuantity() != null) {
            _hashCode += getPurchaseOrderQuantity().hashCode();
        }
        if (getPurchaseOrderAmount() != null) {
            _hashCode += getPurchaseOrderAmount().hashCode();
        }
        if (getPurchaseOrderQuantityDiff() != null) {
            _hashCode += getPurchaseOrderQuantityDiff().hashCode();
        }
        if (getReceiptQuantity() != null) {
            _hashCode += getReceiptQuantity().hashCode();
        }
        if (getReceiptAmount() != null) {
            _hashCode += getReceiptAmount().hashCode();
        }
        if (getReceiptQuantityDiff() != null) {
            _hashCode += getReceiptQuantityDiff().hashCode();
        }
        if (getManufacturerTaxId() != null) {
            _hashCode += getManufacturerTaxId().hashCode();
        }
        if (getScheduleBNumber() != null) {
            _hashCode += getScheduleBNumber().hashCode();
        }
        if (getScheduleBQuantity() != null) {
            _hashCode += getScheduleBQuantity().hashCode();
        }
        if (getScheduleBCode() != null) {
            _hashCode += getScheduleBCode().hashCode();
        }
        if (getManufacturerTariff() != null) {
            _hashCode += getManufacturerTariff().hashCode();
        }
        if (getPreferenceCriterion() != null) {
            _hashCode += getPreferenceCriterion().hashCode();
        }
        if (getMinimumQuantity() != null) {
            _hashCode += getMinimumQuantity().hashCode();
        }
        if (getEnforceMinQtyInternally() != null) {
            _hashCode += getEnforceMinQtyInternally().hashCode();
        }
        if (getMaximumQuantity() != null) {
            _hashCode += getMaximumQuantity().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        if (getShipPackage() != null) {
            _hashCode += getShipPackage().hashCode();
        }
        if (getShipIndividually() != null) {
            _hashCode += getShipIndividually().hashCode();
        }
        if (getIsFulfillable() != null) {
            _hashCode += getIsFulfillable().hashCode();
        }
        if (getGenerateAccruals() != null) {
            _hashCode += getGenerateAccruals().hashCode();
        }
        if (getCostCategory() != null) {
            _hashCode += getCostCategory().hashCode();
        }
        if (getPricesIncludeTax() != null) {
            _hashCode += getPricesIncludeTax().hashCode();
        }
        if (getQuantityPricingSchedule() != null) {
            _hashCode += getQuantityPricingSchedule().hashCode();
        }
        if (getUseMarginalRates() != null) {
            _hashCode += getUseMarginalRates().hashCode();
        }
        if (getOverallQuantityPricingType() != null) {
            _hashCode += getOverallQuantityPricingType().hashCode();
        }
        if (getPricingGroup() != null) {
            _hashCode += getPricingGroup().hashCode();
        }
        if (getMinimumQuantityUnits() != null) {
            _hashCode += getMinimumQuantityUnits().hashCode();
        }
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getVsoeSopGroup() != null) {
            _hashCode += getVsoeSopGroup().hashCode();
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
        if (getItemRevenueCategory() != null) {
            _hashCode += getItemRevenueCategory().hashCode();
        }
        if (getStoreDisplayName() != null) {
            _hashCode += getStoreDisplayName().hashCode();
        }
        if (getStoreDisplayThumbnail() != null) {
            _hashCode += getStoreDisplayThumbnail().hashCode();
        }
        if (getStoreDisplayImage() != null) {
            _hashCode += getStoreDisplayImage().hashCode();
        }
        if (getStoreDescription() != null) {
            _hashCode += getStoreDescription().hashCode();
        }
        if (getStoreDetailedDescription() != null) {
            _hashCode += getStoreDetailedDescription().hashCode();
        }
        if (getStoreItemTemplate() != null) {
            _hashCode += getStoreItemTemplate().hashCode();
        }
        if (getPageTitle() != null) {
            _hashCode += getPageTitle().hashCode();
        }
        if (getMetaTagHtml() != null) {
            _hashCode += getMetaTagHtml().hashCode();
        }
        if (getExcludeFromSitemap() != null) {
            _hashCode += getExcludeFromSitemap().hashCode();
        }
        if (getSitemapPriority() != null) {
            _hashCode += getSitemapPriority().hashCode();
        }
        if (getSearchKeywords() != null) {
            _hashCode += getSearchKeywords().hashCode();
        }
        if (getIsDonationItem() != null) {
            _hashCode += getIsDonationItem().hashCode();
        }
        if (getShowDefaultDonationAmount() != null) {
            _hashCode += getShowDefaultDonationAmount().hashCode();
        }
        if (getMaxDonationAmount() != null) {
            _hashCode += getMaxDonationAmount().hashCode();
        }
        if (getDontShowPrice() != null) {
            _hashCode += getDontShowPrice().hashCode();
        }
        if (getNoPriceMessage() != null) {
            _hashCode += getNoPriceMessage().hashCode();
        }
        if (getOutOfStockMessage() != null) {
            _hashCode += getOutOfStockMessage().hashCode();
        }
        if (getOnSpecial() != null) {
            _hashCode += getOnSpecial().hashCode();
        }
        if (getOutOfStockBehavior() != null) {
            _hashCode += getOutOfStockBehavior().hashCode();
        }
        if (getRelatedItemsDescription() != null) {
            _hashCode += getRelatedItemsDescription().hashCode();
        }
        if (getSpecialsDescription() != null) {
            _hashCode += getSpecialsDescription().hashCode();
        }
        if (getFeaturedDescription() != null) {
            _hashCode += getFeaturedDescription().hashCode();
        }
        if (getShoppingDotComCategory() != null) {
            _hashCode += getShoppingDotComCategory().hashCode();
        }
        if (getShopzillaCategoryId() != null) {
            _hashCode += getShopzillaCategoryId().hashCode();
        }
        if (getNexTagCategory() != null) {
            _hashCode += getNexTagCategory().hashCode();
        }
        if (getProductFeedList() != null) {
            _hashCode += getProductFeedList().hashCode();
        }
        if (getUrlComponent() != null) {
            _hashCode += getUrlComponent().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getUpcCode() != null) {
            _hashCode += getUpcCode().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getIsHazmatItem() != null) {
            _hashCode += getIsHazmatItem().hashCode();
        }
        if (getHazmatId() != null) {
            _hashCode += getHazmatId().hashCode();
        }
        if (getHazmatShippingName() != null) {
            _hashCode += getHazmatShippingName().hashCode();
        }
        if (getHazmatHazardClass() != null) {
            _hashCode += getHazmatHazardClass().hashCode();
        }
        if (getHazmatPackingGroup() != null) {
            _hashCode += getHazmatPackingGroup().hashCode();
        }
        if (getHazmatItemUnits() != null) {
            _hashCode += getHazmatItemUnits().hashCode();
        }
        if (getHazmatItemUnitsQty() != null) {
            _hashCode += getHazmatItemUnitsQty().hashCode();
        }
        if (getIsGcoCompliant() != null) {
            _hashCode += getIsGcoCompliant().hashCode();
        }
        if (getOfferSupport() != null) {
            _hashCode += getOfferSupport().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getMatrixItemNameTemplate() != null) {
            _hashCode += getMatrixItemNameTemplate().hashCode();
        }
        if (getAvailableToPartners() != null) {
            _hashCode += getAvailableToPartners().hashCode();
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
        if (getDefaultItemShipMethod() != null) {
            _hashCode += getDefaultItemShipMethod().hashCode();
        }
        if (getItemCarrier() != null) {
            _hashCode += getItemCarrier().hashCode();
        }
        if (getItemShipMethodList() != null) {
            _hashCode += getItemShipMethodList().hashCode();
        }
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getItemOptionsList() != null) {
            _hashCode += getItemOptionsList().hashCode();
        }
        if (getMatrixOptionList() != null) {
            _hashCode += getMatrixOptionList().hashCode();
        }
        if (getItemVendorList() != null) {
            _hashCode += getItemVendorList().hashCode();
        }
        if (getPricingMatrix() != null) {
            _hashCode += getPricingMatrix().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
        }
        if (getPurchaseTaxCode() != null) {
            _hashCode += getPurchaseTaxCode().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getSalesTaxCode() != null) {
            _hashCode += getSalesTaxCode().hashCode();
        }
        if (getSiteCategoryList() != null) {
            _hashCode += getSiteCategoryList().hashCode();
        }
        if (getTranslationsList() != null) {
            _hashCode += getTranslationsList().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getPresentationItemList() != null) {
            _hashCode += getPresentationItemList().hashCode();
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
        new org.apache.axis.description.TypeDesc(NonInventoryResaleItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "NonInventoryResaleItem"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "copyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("costUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "costUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoExpenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "intercoExpenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "salesDescription"));
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
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoIncomeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "intercoIncomeAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrixType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "matrixType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemMatrixType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropshipExpenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "dropshipExpenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueRecognitionRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "revenueRecognitionRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueAllocationGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "revenueAllocationGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createRevenuePlansOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "createRevenuePlansOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directRevenuePosting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "directRevenuePosting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDropShipItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isDropShipItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isSpecialOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCostUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "shippingCostUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCostUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "handlingCostUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "ItemCostEstimateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "weightUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemWeightUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "weightUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "costEstimateUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenueAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "deferredRevenueAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferralAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "deferralAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "amortizationTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residual");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "residual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "amortizationPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "producer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerAddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "manufacturerAddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ScheduleBCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemPreferenceCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceMinQtyInternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "enforceMinQtyInternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "maximumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateAccruals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "generateAccruals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricesIncludeTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "pricesIncludeTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemOverallQuantityPricingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantityUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "minimumQuantityUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeSopGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vsoeSopGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "VsoeSopGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "storeDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "storeDisplayImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDetailedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "storeDetailedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeItemTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "storeItemTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "SitemapPriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDonationItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isDonationItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showDefaultDonationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "showDefaultDonationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDonationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "maxDonationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noPriceMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "noPriceMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "outOfStockMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemOutOfStockBehavior"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "relatedItemsDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "specialsDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexTagCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nexTagCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productFeedList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "productFeedList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ProductFeedList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHazmatItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isHazmatItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazmatId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "hazmatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazmatShippingName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "hazmatShippingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazmatHazardClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "hazmatHazardClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazmatPackingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "hazmatPackingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "HazmatPackingGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazmatItemUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "hazmatItemUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazmatItemUnitsQty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "hazmatItemUnitsQty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("matrixItemNameTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "matrixItemNameTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "availableToPartners"));
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
        elemField.setFieldName("defaultItemShipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "defaultItemShipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "itemCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "ShippingCarrier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemShipMethodList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "itemShipMethodList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemOptionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "itemOptionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ItemOptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrixOptionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "matrixOptionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "MatrixOptionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemVendorList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "itemVendorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ItemVendorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingMatrix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "pricingMatrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "PricingMatrix"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ItemAccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteCategoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "siteCategoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SiteCategoryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "TranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "presentationItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "PresentationItemList"));
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
